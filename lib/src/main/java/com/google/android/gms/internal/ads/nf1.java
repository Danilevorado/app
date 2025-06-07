package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class nf1 implements f21 {

    /* renamed from: m, reason: collision with root package name */
    private final pd1 f12602m;

    /* renamed from: n, reason: collision with root package name */
    private final ud1 f12603n;

    public nf1(pd1 pd1Var, ud1 ud1Var) {
        this.f12602m = pd1Var;
        this.f12603n = ud1Var;
    }

    @Override // com.google.android.gms.internal.ads.f21
    public final void l() {
        pd1 pd1Var = this.f12602m;
        if (pd1Var.f0() == null) {
            return;
        }
        nk0 nk0VarB0 = pd1Var.b0();
        nk0 nk0VarC0 = pd1Var.c0();
        if (nk0VarB0 == null) {
            nk0VarB0 = nk0VarC0 == null ? null : nk0VarC0;
        }
        if (!this.f12603n.d() || nk0VarB0 == null) {
            return;
        }
        nk0VarB0.c("onSdkImpression", new q.a());
    }
}
