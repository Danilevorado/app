package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class kw1 implements i41, a31, o11 {

    /* renamed from: m, reason: collision with root package name */
    private final vs2 f11256m;

    /* renamed from: n, reason: collision with root package name */
    private final ws2 f11257n;

    /* renamed from: o, reason: collision with root package name */
    private final me0 f11258o;

    public kw1(vs2 vs2Var, ws2 ws2Var, me0 me0Var) {
        this.f11256m = vs2Var;
        this.f11257n = ws2Var;
        this.f11258o = me0Var;
    }

    @Override // com.google.android.gms.internal.ads.i41
    public final void d0(un2 un2Var) {
        this.f11256m.h(un2Var, this.f11258o);
    }

    @Override // com.google.android.gms.internal.ads.i41
    public final void g(k90 k90Var) {
        this.f11256m.i(k90Var.f10913m);
    }

    @Override // com.google.android.gms.internal.ads.a31
    public final void m() {
        ws2 ws2Var = this.f11257n;
        vs2 vs2Var = this.f11256m;
        vs2Var.a("action", "loaded");
        ws2Var.a(vs2Var);
    }

    @Override // com.google.android.gms.internal.ads.o11
    public final void u(k3.w2 w2Var) {
        vs2 vs2Var = this.f11256m;
        vs2Var.a("action", "ftl");
        vs2Var.a("ftl", String.valueOf(w2Var.f24788m));
        vs2Var.a("ed", w2Var.f24790o);
        this.f11257n.a(this.f11256m);
    }
}
