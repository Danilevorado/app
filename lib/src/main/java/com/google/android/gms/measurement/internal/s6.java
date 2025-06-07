package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
final class s6 implements Runnable {

    /* renamed from: m, reason: collision with root package name */
    final /* synthetic */ boolean f20392m;

    /* renamed from: n, reason: collision with root package name */
    final /* synthetic */ v6 f20393n;

    s6(v6 v6Var, boolean z10) {
        this.f20393n = v6Var;
        this.f20392m = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zM = this.f20393n.f20269a.m();
        boolean zL = this.f20393n.f20269a.l();
        this.f20393n.f20269a.i(this.f20392m);
        if (zL == this.f20392m) {
            this.f20393n.f20269a.b().t().b("Default data collection state already set to", Boolean.valueOf(this.f20392m));
        }
        if (this.f20393n.f20269a.m() == zM || this.f20393n.f20269a.m() != this.f20393n.f20269a.l()) {
            this.f20393n.f20269a.b().v().c("Default data collection is different than actual status", Boolean.valueOf(this.f20392m), Boolean.valueOf(zM));
        }
        this.f20393n.P();
    }
}
