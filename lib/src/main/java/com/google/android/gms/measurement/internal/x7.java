package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
final class x7 implements Runnable {

    /* renamed from: m, reason: collision with root package name */
    final /* synthetic */ z9 f20566m;

    /* renamed from: n, reason: collision with root package name */
    final /* synthetic */ boolean f20567n;

    /* renamed from: o, reason: collision with root package name */
    final /* synthetic */ d f20568o;

    /* renamed from: p, reason: collision with root package name */
    final /* synthetic */ d f20569p;

    /* renamed from: q, reason: collision with root package name */
    final /* synthetic */ h8 f20570q;

    x7(h8 h8Var, boolean z10, z9 z9Var, boolean z11, d dVar, d dVar2) {
        this.f20570q = h8Var;
        this.f20566m = z9Var;
        this.f20567n = z11;
        this.f20568o = dVar;
        this.f20569p = dVar2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        h8 h8Var = this.f20570q;
        x4.f fVar = h8Var.f19989d;
        if (fVar == null) {
            h8Var.f20269a.b().p().a("Discarding data. Failed to send conditional user property to service");
            return;
        }
        e4.p.l(this.f20566m);
        this.f20570q.p(fVar, this.f20567n ? null : this.f20568o, this.f20566m);
        this.f20570q.E();
    }
}
