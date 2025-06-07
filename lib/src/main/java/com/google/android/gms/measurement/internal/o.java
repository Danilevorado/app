package com.google.android.gms.measurement.internal;

import android.os.Handler;

/* loaded from: classes.dex */
abstract class o {

    /* renamed from: d, reason: collision with root package name */
    private static volatile Handler f20236d;

    /* renamed from: a, reason: collision with root package name */
    private final r5 f20237a;

    /* renamed from: b, reason: collision with root package name */
    private final Runnable f20238b;

    /* renamed from: c, reason: collision with root package name */
    private volatile long f20239c;

    o(r5 r5Var) {
        e4.p.l(r5Var);
        this.f20237a = r5Var;
        this.f20238b = new n(this, r5Var);
    }

    private final Handler f() {
        Handler handler;
        if (f20236d != null) {
            return f20236d;
        }
        synchronized (o.class) {
            if (f20236d == null) {
                f20236d = new com.google.android.gms.internal.measurement.a1(this.f20237a.a().getMainLooper());
            }
            handler = f20236d;
        }
        return handler;
    }

    final void b() {
        this.f20239c = 0L;
        f().removeCallbacks(this.f20238b);
    }

    public abstract void c();

    public final void d(long j10) {
        b();
        if (j10 >= 0) {
            this.f20239c = this.f20237a.d().a();
            if (f().postDelayed(this.f20238b, j10)) {
                return;
            }
            this.f20237a.b().p().b("Failed to schedule delayed post. time", Long.valueOf(j10));
        }
    }

    public final boolean e() {
        return this.f20239c != 0;
    }
}
