package com.google.firebase.messaging;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.PowerManager;
import android.util.Log;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
class w0 implements Runnable {

    /* renamed from: m, reason: collision with root package name */
    private final long f21590m;

    /* renamed from: n, reason: collision with root package name */
    private final PowerManager.WakeLock f21591n;

    /* renamed from: o, reason: collision with root package name */
    private final FirebaseMessaging f21592o;

    /* renamed from: p, reason: collision with root package name */
    ExecutorService f21593p = new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), new j4.b("firebase-iid-executor"));

    static class a extends BroadcastReceiver {

        /* renamed from: a, reason: collision with root package name */
        private w0 f21594a;

        public a(w0 w0Var) {
            this.f21594a = w0Var;
        }

        public void a() {
            if (w0.c()) {
                Log.d("FirebaseMessaging", "Connectivity change received registered");
            }
            this.f21594a.b().registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            w0 w0Var = this.f21594a;
            if (w0Var != null && w0Var.d()) {
                if (w0.c()) {
                    Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
                }
                this.f21594a.f21592o.m(this.f21594a, 0L);
                this.f21594a.b().unregisterReceiver(this);
                this.f21594a = null;
            }
        }
    }

    public w0(FirebaseMessaging firebaseMessaging, long j10) {
        this.f21592o = firebaseMessaging;
        this.f21590m = j10;
        PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) b().getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.f21591n = wakeLockNewWakeLock;
        wakeLockNewWakeLock.setReferenceCounted(false);
    }

    static boolean c() {
        return Log.isLoggable("FirebaseMessaging", 3) || (Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseMessaging", 3));
    }

    Context b() {
        return this.f21592o.n();
    }

    boolean d() {
        ConnectivityManager connectivityManager = (ConnectivityManager) b().getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    boolean e() throws IOException {
        String str;
        try {
            if (this.f21592o.k() == null) {
                Log.e("FirebaseMessaging", "Token retrieval failed: null");
                return false;
            }
            if (!Log.isLoggable("FirebaseMessaging", 3)) {
                return true;
            }
            Log.d("FirebaseMessaging", "Token successfully retrieved");
            return true;
        } catch (IOException e5) {
            if (c0.h(e5.getMessage())) {
                str = "Token retrieval failed: " + e5.getMessage() + ". Will retry token retrieval";
            } else {
                if (e5.getMessage() != null) {
                    throw e5;
                }
                str = "Token retrieval failed without exception message. Will retry token retrieval";
            }
            Log.w("FirebaseMessaging", str);
            return false;
        } catch (SecurityException unused) {
            str = "Token retrieval failed with SecurityException. Will retry token retrieval";
            Log.w("FirebaseMessaging", str);
            return false;
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        if (s0.b().e(b())) {
            this.f21591n.acquire();
        }
        try {
            try {
                this.f21592o.F(true);
            } catch (IOException e5) {
                Log.e("FirebaseMessaging", "Topic sync or token retrieval failed on hard failure exceptions: " + e5.getMessage() + ". Won't retry the operation.");
                this.f21592o.F(false);
                if (!s0.b().e(b())) {
                    return;
                }
            }
            if (!this.f21592o.w()) {
                this.f21592o.F(false);
                if (s0.b().e(b())) {
                    this.f21591n.release();
                    return;
                }
                return;
            }
            if (s0.b().d(b()) && !d()) {
                new a(this).a();
                if (s0.b().e(b())) {
                    this.f21591n.release();
                    return;
                }
                return;
            }
            if (e()) {
                this.f21592o.F(false);
            } else {
                this.f21592o.I(this.f21590m);
            }
            if (!s0.b().e(b())) {
                return;
            }
            this.f21591n.release();
        } catch (Throwable th) {
            if (s0.b().e(b())) {
                this.f21591n.release();
            }
            throw th;
        }
    }
}
