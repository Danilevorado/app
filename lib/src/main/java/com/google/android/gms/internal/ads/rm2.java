package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
final class rm2 implements ma3 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ g72 f14840a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ au2 f14841b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ot2 f14842c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ tm2 f14843d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ um2 f14844e;

    rm2(um2 um2Var, g72 g72Var, au2 au2Var, ot2 ot2Var, tm2 tm2Var) {
        this.f14844e = um2Var;
        this.f14840a = g72Var;
        this.f14841b = au2Var;
        this.f14842c = ot2Var;
        this.f14843d = tm2Var;
    }

    @Override // com.google.android.gms.internal.ads.ma3
    public final void a(Throwable th) {
        au2 au2Var;
        lj1 lj1Var = (lj1) this.f14844e.f16396e.f();
        final k3.w2 w2VarB = lj1Var == null ? fp2.b(th, null) : lj1Var.b().a(th);
        synchronized (this.f14844e) {
            if (lj1Var != null) {
                lj1Var.a().u(w2VarB);
                this.f14844e.f16393b.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.qm2
                    @Override // java.lang.Runnable
                    public final void run() {
                        rm2 rm2Var = this.f14404m;
                        rm2Var.f14844e.f16395d.u(w2VarB);
                    }
                });
            } else {
                this.f14844e.f16395d.u(w2VarB);
                this.f14844e.k(this.f14843d).g().b().c().f();
            }
            zo2.b(w2VarB.f24788m, th, "RewardedAdLoader.onFailure");
            this.f14840a.a();
            if (!((Boolean) vs.f16842c.e()).booleanValue() || (au2Var = this.f14841b) == null) {
                cu2 cu2Var = this.f14844e.f16398g;
                ot2 ot2Var = this.f14842c;
                ot2Var.u(w2VarB);
                ot2Var.D0(th);
                ot2Var.B0(false);
                cu2Var.b(ot2Var.l());
            } else {
                au2Var.c(w2VarB);
                ot2 ot2Var2 = this.f14842c;
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
        gj1 gj1Var = (gj1) obj;
        synchronized (this.f14844e) {
            gj1Var.e().d(this.f14844e.f16395d);
            this.f14840a.b(gj1Var);
            um2 um2Var = this.f14844e;
            Executor executor = um2Var.f16393b;
            final km2 km2Var = um2Var.f16395d;
            km2Var.getClass();
            executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.pm2
                @Override // java.lang.Runnable
                public final void run() {
                    km2Var.m();
                }
            });
            this.f14844e.f16395d.a();
            if (!((Boolean) vs.f16842c.e()).booleanValue() || (au2Var = this.f14841b) == null) {
                cu2 cu2Var = this.f14844e.f16398g;
                ot2 ot2Var = this.f14842c;
                ot2Var.C0(gj1Var.g().f16413b);
                ot2Var.W(gj1Var.c().h());
                ot2Var.B0(true);
                cu2Var.b(ot2Var.l());
            } else {
                au2Var.f(gj1Var.g().f16413b);
                au2Var.e(gj1Var.c().h());
                ot2 ot2Var2 = this.f14842c;
                ot2Var2.B0(true);
                au2Var.a(ot2Var2);
                au2Var.g();
            }
        }
    }
}
