package com.onesignal;

import android.os.Handler;
import android.os.HandlerThread;
import com.onesignal.e3;

/* loaded from: classes.dex */
class y2 extends HandlerThread {

    /* renamed from: n, reason: collision with root package name */
    private static final String f22527n = y2.class.getCanonicalName();

    /* renamed from: o, reason: collision with root package name */
    private static final Object f22528o = new Object();

    /* renamed from: p, reason: collision with root package name */
    private static y2 f22529p;

    /* renamed from: m, reason: collision with root package name */
    private final Handler f22530m;

    private y2() {
        super(f22527n);
        start();
        this.f22530m = new Handler(getLooper());
    }

    static y2 b() {
        if (f22529p == null) {
            synchronized (f22528o) {
                if (f22529p == null) {
                    f22529p = new y2();
                }
            }
        }
        return f22529p;
    }

    void a(Runnable runnable) {
        synchronized (f22528o) {
            e3.a(e3.z.DEBUG, "Running destroyTimeout with runnable: " + runnable.toString());
            this.f22530m.removeCallbacks(runnable);
        }
    }

    void c(long j10, Runnable runnable) {
        synchronized (f22528o) {
            a(runnable);
            e3.a(e3.z.DEBUG, "Running startTimeout with timeout: " + j10 + " and runnable: " + runnable.toString());
            this.f22530m.postDelayed(runnable, j10);
        }
    }
}
