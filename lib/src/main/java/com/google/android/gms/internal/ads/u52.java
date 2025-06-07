package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
public final class u52 extends k3.i0 {

    /* renamed from: m, reason: collision with root package name */
    private final c72 f16177m;

    public u52(Context context, km0 km0Var, bo2 bo2Var, ae1 ae1Var, k3.d0 d0Var) {
        e72 e72Var = new e72(ae1Var, km0Var.A());
        e72Var.e(d0Var);
        this.f16177m = new c72(new o72(km0Var, context, e72Var, bo2Var), bo2Var.i());
    }

    @Override // k3.j0
    public final void E3(k3.c4 c4Var) {
        this.f16177m.d(c4Var, 1);
    }

    @Override // k3.j0
    public final synchronized String c() {
        return this.f16177m.a();
    }

    @Override // k3.j0
    public final synchronized String e() {
        return this.f16177m.b();
    }

    @Override // k3.j0
    public final synchronized boolean i() {
        return this.f16177m.e();
    }

    @Override // k3.j0
    public final synchronized void m5(k3.c4 c4Var, int i10) {
        this.f16177m.d(c4Var, i10);
    }
}
