package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class p10 implements vf0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ y10 f13515a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ot2 f13516b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ z10 f13517c;

    p10(z10 z10Var, y10 y10Var, ot2 ot2Var) {
        this.f13517c = z10Var;
        this.f13515a = y10Var;
        this.f13516b = ot2Var;
    }

    @Override // com.google.android.gms.internal.ads.vf0
    public final void a() {
        synchronized (this.f13517c.f18355a) {
            this.f13517c.f18363i = 1;
            m3.n1.k("Failed loading new engine. Marking new engine destroyable.");
            this.f13515a.g();
            if (((Boolean) vs.f16843d.e()).booleanValue()) {
                z10 z10Var = this.f13517c;
                if (z10Var.f18359e != null) {
                    cu2 cu2Var = z10Var.f18359e;
                    ot2 ot2Var = this.f13516b;
                    ot2Var.B0(false);
                    cu2Var.b(ot2Var.l());
                }
            }
        }
    }
}
