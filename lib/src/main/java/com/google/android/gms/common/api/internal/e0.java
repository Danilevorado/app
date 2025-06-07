package com.google.android.gms.common.api.internal;

/* loaded from: classes.dex */
abstract class e0 {

    /* renamed from: a, reason: collision with root package name */
    private final d4.o f5702a;

    protected e0(d4.o oVar) {
        this.f5702a = oVar;
    }

    protected abstract void a();

    public final void b(g0 g0Var) {
        g0Var.f5729m.lock();
        try {
            if (g0Var.f5739w == this.f5702a) {
                a();
            }
        } finally {
            g0Var.f5729m.unlock();
        }
    }
}
