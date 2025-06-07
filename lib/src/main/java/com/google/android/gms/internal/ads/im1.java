package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class im1 implements i41, a31, o11 {

    /* renamed from: m, reason: collision with root package name */
    private final sm1 f9793m;

    /* renamed from: n, reason: collision with root package name */
    private final dn1 f9794n;

    public im1(sm1 sm1Var, dn1 dn1Var) {
        this.f9793m = sm1Var;
        this.f9794n = dn1Var;
    }

    @Override // com.google.android.gms.internal.ads.i41
    public final void d0(un2 un2Var) {
        this.f9793m.b(un2Var);
    }

    @Override // com.google.android.gms.internal.ads.i41
    public final void g(k90 k90Var) {
        this.f9793m.c(k90Var.f10913m);
    }

    @Override // com.google.android.gms.internal.ads.a31
    public final void m() {
        this.f9793m.a().put("action", "loaded");
        this.f9794n.e(this.f9793m.a());
    }

    @Override // com.google.android.gms.internal.ads.o11
    public final void u(k3.w2 w2Var) {
        this.f9793m.a().put("action", "ftl");
        this.f9793m.a().put("ftl", String.valueOf(w2Var.f24788m));
        this.f9793m.a().put("ed", w2Var.f24790o);
        this.f9794n.e(this.f9793m.a());
    }
}
