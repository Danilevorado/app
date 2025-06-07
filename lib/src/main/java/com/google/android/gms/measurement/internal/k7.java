package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
final class k7 implements Runnable {

    /* renamed from: m, reason: collision with root package name */
    final /* synthetic */ z9 f20128m;

    /* renamed from: n, reason: collision with root package name */
    final /* synthetic */ boolean f20129n;

    /* renamed from: o, reason: collision with root package name */
    final /* synthetic */ q9 f20130o;

    /* renamed from: p, reason: collision with root package name */
    final /* synthetic */ h8 f20131p;

    k7(h8 h8Var, z9 z9Var, boolean z10, q9 q9Var) {
        this.f20131p = h8Var;
        this.f20128m = z9Var;
        this.f20129n = z10;
        this.f20130o = q9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        h8 h8Var = this.f20131p;
        x4.f fVar = h8Var.f19989d;
        if (fVar == null) {
            h8Var.f20269a.b().p().a("Discarding data. Failed to set user property");
            return;
        }
        e4.p.l(this.f20128m);
        this.f20131p.p(fVar, this.f20129n ? null : this.f20130o, this.f20128m);
        this.f20131p.E();
    }
}
