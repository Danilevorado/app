package com.google.firebase.messaging;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
class a1 {

    /* renamed from: i, reason: collision with root package name */
    private static final long f21435i = TimeUnit.HOURS.toSeconds(8);

    /* renamed from: a, reason: collision with root package name */
    private final Context f21436a;

    /* renamed from: b, reason: collision with root package name */
    private final h0 f21437b;

    /* renamed from: c, reason: collision with root package name */
    private final c0 f21438c;

    /* renamed from: d, reason: collision with root package name */
    private final FirebaseMessaging f21439d;

    /* renamed from: f, reason: collision with root package name */
    private final ScheduledExecutorService f21441f;

    /* renamed from: h, reason: collision with root package name */
    private final y0 f21443h;

    /* renamed from: e, reason: collision with root package name */
    private final Map f21440e = new q.a();

    /* renamed from: g, reason: collision with root package name */
    private boolean f21442g = false;

    private a1(FirebaseMessaging firebaseMessaging, h0 h0Var, y0 y0Var, c0 c0Var, Context context, ScheduledExecutorService scheduledExecutorService) {
        this.f21439d = firebaseMessaging;
        this.f21437b = h0Var;
        this.f21443h = y0Var;
        this.f21438c = c0Var;
        this.f21436a = context;
        this.f21441f = scheduledExecutorService;
    }

    private static void b(b5.i iVar) throws IOException {
        try {
            b5.l.b(iVar, 30L, TimeUnit.SECONDS);
        } catch (InterruptedException e5) {
            e = e5;
            throw new IOException("SERVICE_NOT_AVAILABLE", e);
        } catch (ExecutionException e10) {
            Throwable cause = e10.getCause();
            if (cause instanceof IOException) {
                throw ((IOException) cause);
            }
            if (!(cause instanceof RuntimeException)) {
                throw new IOException(e10);
            }
            throw ((RuntimeException) cause);
        } catch (TimeoutException e11) {
            e = e11;
            throw new IOException("SERVICE_NOT_AVAILABLE", e);
        }
    }

    private void c(String str) throws IOException {
        b(this.f21438c.l(this.f21439d.k(), str));
    }

    private void d(String str) throws IOException {
        b(this.f21438c.m(this.f21439d.k(), str));
    }

    static b5.i e(final FirebaseMessaging firebaseMessaging, final h0 h0Var, final c0 c0Var, final Context context, final ScheduledExecutorService scheduledExecutorService) {
        return b5.l.c(scheduledExecutorService, new Callable() { // from class: com.google.firebase.messaging.z0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return a1.i(context, scheduledExecutorService, firebaseMessaging, h0Var, c0Var);
            }
        });
    }

    static boolean g() {
        return Log.isLoggable("FirebaseMessaging", 3) || (Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseMessaging", 3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ a1 i(Context context, ScheduledExecutorService scheduledExecutorService, FirebaseMessaging firebaseMessaging, h0 h0Var, c0 c0Var) {
        return new a1(firebaseMessaging, h0Var, y0.a(context, scheduledExecutorService), c0Var, context, scheduledExecutorService);
    }

    private void j(x0 x0Var) {
        synchronized (this.f21440e) {
            String strE = x0Var.e();
            if (this.f21440e.containsKey(strE)) {
                ArrayDeque arrayDeque = (ArrayDeque) this.f21440e.get(strE);
                b5.j jVar = (b5.j) arrayDeque.poll();
                if (jVar != null) {
                    jVar.c(null);
                }
                if (arrayDeque.isEmpty()) {
                    this.f21440e.remove(strE);
                }
            }
        }
    }

    private void n() {
        if (h()) {
            return;
        }
        q(0L);
    }

    boolean f() {
        return this.f21443h.b() != null;
    }

    synchronized boolean h() {
        return this.f21442g;
    }

    boolean k(x0 x0Var) throws IOException {
        String str;
        String str2;
        try {
            String strB = x0Var.b();
            char c10 = 65535;
            int iHashCode = strB.hashCode();
            if (iHashCode != 83) {
                if (iHashCode == 85 && strB.equals("U")) {
                    c10 = 1;
                }
            } else if (strB.equals("S")) {
                c10 = 0;
            }
            if (c10 == 0) {
                c(x0Var.c());
                if (g()) {
                    str2 = "Subscribe to topic: " + x0Var.c() + " succeeded.";
                    Log.d("FirebaseMessaging", str2);
                }
            } else if (c10 == 1) {
                d(x0Var.c());
                if (g()) {
                    str2 = "Unsubscribe from topic: " + x0Var.c() + " succeeded.";
                    Log.d("FirebaseMessaging", str2);
                }
            } else if (g()) {
                str2 = "Unknown topic operation" + x0Var + ".";
                Log.d("FirebaseMessaging", str2);
            }
            return true;
        } catch (IOException e5) {
            if ("SERVICE_NOT_AVAILABLE".equals(e5.getMessage()) || "INTERNAL_SERVER_ERROR".equals(e5.getMessage())) {
                str = "Topic operation failed: " + e5.getMessage() + ". Will retry Topic operation.";
            } else {
                if (e5.getMessage() != null) {
                    throw e5;
                }
                str = "Topic operation failed without exception message. Will retry Topic operation.";
            }
            Log.e("FirebaseMessaging", str);
            return false;
        }
    }

    void l(Runnable runnable, long j10) {
        this.f21441f.schedule(runnable, j10, TimeUnit.SECONDS);
    }

    synchronized void m(boolean z10) {
        this.f21442g = z10;
    }

    void o() {
        if (f()) {
            n();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0018, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x000d, code lost:
    
        if (g() == false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x000f, code lost:
    
        android.util.Log.d("FirebaseMessaging", "topic sync succeeded");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    boolean p() {
        /*
            r2 = this;
        L0:
            monitor-enter(r2)
            com.google.firebase.messaging.y0 r0 = r2.f21443h     // Catch: java.lang.Throwable -> L2b
            com.google.firebase.messaging.x0 r0 = r0.b()     // Catch: java.lang.Throwable -> L2b
            if (r0 != 0) goto L19
            boolean r0 = g()     // Catch: java.lang.Throwable -> L2b
            if (r0 == 0) goto L16
            java.lang.String r0 = "FirebaseMessaging"
            java.lang.String r1 = "topic sync succeeded"
            android.util.Log.d(r0, r1)     // Catch: java.lang.Throwable -> L2b
        L16:
            r0 = 1
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2b
            return r0
        L19:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2b
            boolean r1 = r2.k(r0)
            if (r1 != 0) goto L22
            r0 = 0
            return r0
        L22:
            com.google.firebase.messaging.y0 r1 = r2.f21443h
            r1.d(r0)
            r2.j(r0)
            goto L0
        L2b:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2b
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.a1.p():boolean");
    }

    void q(long j10) {
        l(new b1(this, this.f21436a, this.f21437b, Math.min(Math.max(30L, 2 * j10), f21435i)), j10);
        m(true);
    }
}
