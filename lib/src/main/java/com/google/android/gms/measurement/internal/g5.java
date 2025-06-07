package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
final class g5 implements Runnable {

    /* renamed from: m, reason: collision with root package name */
    final /* synthetic */ z9 f19941m;

    /* renamed from: n, reason: collision with root package name */
    final /* synthetic */ o5 f19942n;

    g5(o5 o5Var, z9 z9Var) {
        this.f19942n = o5Var;
        this.f19941m = z9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f19942n.f20244m.c();
        n9 n9Var = this.f19942n.f20244m;
        z9 z9Var = this.f19941m;
        n9Var.B().f();
        n9Var.e();
        e4.p.f(z9Var.f20612m);
        x4.b bVarB = x4.b.b(z9Var.H);
        x4.b bVarV = n9Var.V(z9Var.f20612m);
        n9Var.b().t().c("Setting consent, package, consent", z9Var.f20612m, bVarB);
        n9Var.z(z9Var.f20612m, bVarB);
        if (bVarB.k(bVarV)) {
            n9Var.t(z9Var);
        }
    }
}
