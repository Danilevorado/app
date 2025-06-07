package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class ii2 implements ma3 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ g72 f9760a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ au2 f9761b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ot2 f9762c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ ki2 f9763d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ li2 f9764e;

    ii2(li2 li2Var, g72 g72Var, au2 au2Var, ot2 ot2Var, ki2 ki2Var) {
        this.f9764e = li2Var;
        this.f9760a = g72Var;
        this.f9761b = au2Var;
        this.f9762c = ot2Var;
        this.f9763d = ki2Var;
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [com.google.android.gms.internal.ads.r01, java.lang.Object] */
    @Override // com.google.android.gms.internal.ads.ma3
    public final void a(Throwable th) {
        au2 au2Var;
        ju0 ju0Var = (ju0) this.f9764e.f11616e.f();
        final k3.w2 w2VarB = ju0Var == null ? fp2.b(th, null) : ju0Var.b().a(th);
        synchronized (this.f9764e) {
            this.f9764e.f11621j = null;
            if (ju0Var != null) {
                ju0Var.d().u(w2VarB);
                if (((Boolean) k3.w.c().b(ir.E7)).booleanValue()) {
                    this.f9764e.f11613b.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.hi2
                        @Override // java.lang.Runnable
                        public final void run() {
                            ii2 ii2Var = this.f9145m;
                            ii2Var.f9764e.f11615d.u(w2VarB);
                        }
                    });
                }
            } else {
                this.f9764e.f11615d.u(w2VarB);
                this.f9764e.m(this.f9763d).g().b().c().f();
            }
            zo2.b(w2VarB.f24788m, th, "AppOpenAdLoader.onFailure");
            this.f9760a.a();
            if (!((Boolean) vs.f16842c.e()).booleanValue() || (au2Var = this.f9761b) == null) {
                cu2 cu2Var = this.f9764e.f11619h;
                ot2 ot2Var = this.f9762c;
                ot2Var.u(w2VarB);
                ot2Var.D0(th);
                ot2Var.B0(false);
                cu2Var.b(ot2Var.l());
            } else {
                au2Var.c(w2VarB);
                ot2 ot2Var2 = this.f9762c;
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
        ex0 ex0Var = (ex0) obj;
        synchronized (this.f9764e) {
            this.f9764e.f11621j = null;
            if (((Boolean) k3.w.c().b(ir.E7)).booleanValue()) {
                ex0Var.e().b(this.f9764e.f11615d);
            }
            this.f9760a.b(ex0Var);
            if (!((Boolean) vs.f16842c.e()).booleanValue() || (au2Var = this.f9761b) == null) {
                cu2 cu2Var = this.f9764e.f11619h;
                ot2 ot2Var = this.f9762c;
                ot2Var.C0(ex0Var.g().f16413b);
                ot2Var.W(ex0Var.c().h());
                ot2Var.B0(true);
                cu2Var.b(ot2Var.l());
            } else {
                au2Var.f(ex0Var.g().f16413b);
                au2Var.e(ex0Var.c().h());
                ot2 ot2Var2 = this.f9762c;
                ot2Var2.B0(true);
                au2Var.a(ot2Var2);
                au2Var.g();
            }
        }
    }
}
