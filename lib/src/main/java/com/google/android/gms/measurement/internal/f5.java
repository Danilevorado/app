package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
final class f5 implements Runnable {

    /* renamed from: m, reason: collision with root package name */
    final /* synthetic */ z9 f19899m;

    /* renamed from: n, reason: collision with root package name */
    final /* synthetic */ o5 f19900n;

    f5(o5 o5Var, z9 z9Var) {
        this.f19900n = o5Var;
        this.f19899m = z9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f19900n.f20244m.c();
        n9 n9Var = this.f19900n.f20244m;
        z9 z9Var = this.f19899m;
        n9Var.B().f();
        n9Var.e();
        e4.p.f(z9Var.f20612m);
        n9Var.S(z9Var);
    }
}
