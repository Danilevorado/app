package com.google.firebase.messaging;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.PowerManager;
import android.util.Log;
import java.io.IOException;

/* loaded from: classes.dex */
class b1 implements Runnable {

    /* renamed from: r, reason: collision with root package name */
    private static final Object f21447r = new Object();

    /* renamed from: s, reason: collision with root package name */
    private static Boolean f21448s;

    /* renamed from: t, reason: collision with root package name */
    private static Boolean f21449t;

    /* renamed from: m, reason: collision with root package name */
    private final Context f21450m;

    /* renamed from: n, reason: collision with root package name */
    private final h0 f21451n;

    /* renamed from: o, reason: collision with root package name */
    private final PowerManager.WakeLock f21452o;

    /* renamed from: p, reason: collision with root package name */
    private final a1 f21453p;

    /* renamed from: q, reason: collision with root package name */
    private final long f21454q;

    class a extends BroadcastReceiver {

        /* renamed from: a, reason: collision with root package name */
        private b1 f21455a;

        public a(b1 b1Var) {
            this.f21455a = b1Var;
        }

        public void a() {
            if (b1.j()) {
                Log.d("FirebaseMessaging", "Connectivity change received registered");
            }
            b1.this.f21450m.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }

        @Override // android.content.BroadcastReceiver
        public synchronized void onReceive(Context context, Intent intent) {
            b1 b1Var = this.f21455a;
            if (b1Var == null) {
                return;
            }
            if (b1Var.i()) {
                if (b1.j()) {
                    Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
                }
                this.f21455a.f21453p.l(this.f21455a, 0L);
                context.unregisterReceiver(this);
                this.f21455a = null;
            }
        }
    }

    b1(a1 a1Var, Context context, h0 h0Var, long j10) {
        this.f21453p = a1Var;
        this.f21450m = context;
        this.f21454q = j10;
        this.f21451n = h0Var;
        this.f21452o = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "wake:com.google.firebase.messaging");
    }

    private static String e(String str) {
        return "Missing Permission: " + str + ". This permission should normally be included by the manifest merger, but may needed to be manually added to your manifest";
    }

    private static boolean f(Context context) {
        boolean zBooleanValue;
        synchronized (f21447r) {
            Boolean bool = f21449t;
            Boolean boolValueOf = Boolean.valueOf(bool == null ? g(context, "android.permission.ACCESS_NETWORK_STATE", bool) : bool.booleanValue());
            f21449t = boolValueOf;
            zBooleanValue = boolValueOf.booleanValue();
        }
        return zBooleanValue;
    }

    private static boolean g(Context context, String str, Boolean bool) {
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean z10 = context.checkCallingOrSelfPermission(str) == 0;
        if (!z10 && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", e(str));
        }
        return z10;
    }

    private static boolean h(Context context) {
        boolean zBooleanValue;
        synchronized (f21447r) {
            Boolean bool = f21448s;
            Boolean boolValueOf = Boolean.valueOf(bool == null ? g(context, "android.permission.WAKE_LOCK", bool) : bool.booleanValue());
            f21448s = boolValueOf;
            zBooleanValue = boolValueOf.booleanValue();
        }
        return zBooleanValue;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:11:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized boolean i() {
        /*
            r2 = this;
            monitor-enter(r2)
            android.content.Context r0 = r2.f21450m     // Catch: java.lang.Throwable -> L20
            java.lang.String r1 = "connectivity"
            java.lang.Object r0 = r0.getSystemService(r1)     // Catch: java.lang.Throwable -> L20
            android.net.ConnectivityManager r0 = (android.net.ConnectivityManager) r0     // Catch: java.lang.Throwable -> L20
            if (r0 == 0) goto L12
            android.net.NetworkInfo r0 = r0.getActiveNetworkInfo()     // Catch: java.lang.Throwable -> L20
            goto L13
        L12:
            r0 = 0
        L13:
            if (r0 == 0) goto L1d
            boolean r0 = r0.isConnected()     // Catch: java.lang.Throwable -> L20
            if (r0 == 0) goto L1d
            r0 = 1
            goto L1e
        L1d:
            r0 = 0
        L1e:
            monitor-exit(r2)
            return r0
        L20:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.b1.i():boolean");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean j() {
        return Log.isLoggable("FirebaseMessaging", 3) || (Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseMessaging", 3));
    }

    @Override // java.lang.Runnable
    public void run() {
        PowerManager.WakeLock wakeLock;
        if (h(this.f21450m)) {
            this.f21452o.acquire(d.f21468a);
        }
        try {
            try {
                try {
                    this.f21453p.m(true);
                } catch (IOException e5) {
                    Log.e("FirebaseMessaging", "Failed to sync topics. Won't retry sync. " + e5.getMessage());
                    this.f21453p.m(false);
                    if (!h(this.f21450m)) {
                        return;
                    } else {
                        wakeLock = this.f21452o;
                    }
                }
                if (!this.f21451n.g()) {
                    this.f21453p.m(false);
                    if (h(this.f21450m)) {
                        try {
                            this.f21452o.release();
                            return;
                        } catch (RuntimeException unused) {
                            Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                            return;
                        }
                    }
                    return;
                }
                if (f(this.f21450m) && !i()) {
                    new a(this).a();
                    if (h(this.f21450m)) {
                        try {
                            this.f21452o.release();
                            return;
                        } catch (RuntimeException unused2) {
                            Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                            return;
                        }
                    }
                    return;
                }
                if (this.f21453p.p()) {
                    this.f21453p.m(false);
                } else {
                    this.f21453p.q(this.f21454q);
                }
                if (h(this.f21450m)) {
                    wakeLock = this.f21452o;
                    wakeLock.release();
                }
            } catch (Throwable th) {
                if (h(this.f21450m)) {
                    try {
                        this.f21452o.release();
                    } catch (RuntimeException unused3) {
                        Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                    }
                }
                throw th;
            }
        } catch (RuntimeException unused4) {
            Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
        }
    }
}
