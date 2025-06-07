package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class hl2 implements ma3 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ g72 f9194a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ au2 f9195b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ot2 f9196c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ bb1 f9197d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ jl2 f9198e;

    hl2(jl2 jl2Var, g72 g72Var, au2 au2Var, ot2 ot2Var, bb1 bb1Var) {
        this.f9198e = jl2Var;
        this.f9194a = g72Var;
        this.f9195b = au2Var;
        this.f9196c = ot2Var;
        this.f9197d = bb1Var;
    }

    @Override // com.google.android.gms.internal.ads.ma3
    public final void a(Throwable th) {
        au2 au2Var;
        final k3.w2 w2VarA = this.f9197d.a().a(th);
        synchronized (this.f9198e) {
            this.f9198e.f10570i = null;
            this.f9197d.b().u(w2VarA);
            if (((Boolean) k3.w.c().b(ir.F7)).booleanValue()) {
                this.f9198e.f10563b.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.fl2
                    @Override // java.lang.Runnable
                    public final void run() {
                        hl2 hl2Var = this.f8321m;
                        hl2Var.f9198e.f10565d.u(w2VarA);
                    }
                });
                this.f9198e.f10563b.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.gl2
                    @Override // java.lang.Runnable
                    public final void run() {
                        hl2 hl2Var = this.f8792m;
                        hl2Var.f9198e.f10566e.u(w2VarA);
                    }
                });
            }
            zo2.b(w2VarA.f24788m, th, "InterstitialAdLoader.onFailure");
            this.f9194a.a();
            if (!((Boolean) vs.f16842c.e()).booleanValue() || (au2Var = this.f9195b) == null) {
                cu2 cu2Var = this.f9198e.f10568g;
                ot2 ot2Var = this.f9196c;
                ot2Var.u(w2VarA);
                ot2Var.D0(th);
                ot2Var.B0(false);
                cu2Var.b(ot2Var.l());
            } else {
                au2Var.c(w2VarA);
                ot2 ot2Var2 = this.f9196c;
                ot2Var2.D0(th);
                ot2Var2.B0(false);
                au2Var.a(ot2Var2);
                au2Var.g();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.ma3
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        au2 au2Var;
        z91 z91Var = (z91) obj;
        synchronized (this.f9198e) {
            this.f9198e.f10570i = null;
            zq zqVar = ir.F7;
            if (((Boolean) k3.w.c().b(zqVar)).booleanValue()) {
                s51 s51VarE = z91Var.e();
                s51VarE.a(this.f9198e.f10565d);
                s51VarE.d(this.f9198e.f10566e);
            }
            this.f9194a.b(z91Var);
            if (((Boolean) k3.w.c().b(zqVar)).booleanValue()) {
                this.f9198e.f10563b.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.dl2
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f7400m.f9198e.f10565d.m();
                    }
                });
                this.f9198e.f10563b.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.el2
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f7897m.f9198e.f10566e.m();
                    }
                });
            }
            if (!((Boolean) vs.f16842c.e()).booleanValue() || (au2Var = this.f9195b) == null) {
                cu2 cu2Var = this.f9198e.f10568g;
                ot2 ot2Var = this.f9196c;
                ot2Var.C0(z91Var.g().f16413b);
                ot2Var.W(z91Var.c().h());
                ot2Var.B0(true);
                cu2Var.b(ot2Var.l());
            } else {
                au2Var.f(z91Var.g().f16413b);
                au2Var.e(z91Var.c().h());
                ot2 ot2Var2 = this.f9196c;
                ot2Var2.B0(true);
                au2Var.a(ot2Var2);
                au2Var.g();
            }
        }
    }
}
