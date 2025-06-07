package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class o10 implements xf0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ y10 f12952a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ot2 f12953b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ z10 f12954c;

    o10(z10 z10Var, y10 y10Var, ot2 ot2Var) {
        this.f12954c = z10Var;
        this.f12952a = y10Var;
        this.f12953b = ot2Var;
    }

    @Override // com.google.android.gms.internal.ads.xf0
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        synchronized (this.f12954c.f18355a) {
            this.f12954c.f18363i = 0;
            z10 z10Var = this.f12954c;
            if (z10Var.f18362h != null && this.f12952a != z10Var.f18362h) {
                m3.n1.k("New JS engine is loaded, marking previous one as destroyable.");
                this.f12954c.f18362h.g();
            }
            this.f12954c.f18362h = this.f12952a;
            if (((Boolean) vs.f16843d.e()).booleanValue()) {
                z10 z10Var2 = this.f12954c;
                if (z10Var2.f18359e != null) {
                    cu2 cu2Var = z10Var2.f18359e;
                    ot2 ot2Var = this.f12953b;
                    ot2Var.B0(true);
                    cu2Var.b(ot2Var.l());
                }
            }
        }
    }
}
