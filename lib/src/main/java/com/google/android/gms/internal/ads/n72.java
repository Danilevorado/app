package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class n72 implements ma3 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ g72 f12471a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ au2 f12472b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ot2 f12473c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ yb1 f12474d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ o72 f12475e;

    n72(o72 o72Var, g72 g72Var, au2 au2Var, ot2 ot2Var, yb1 yb1Var) {
        this.f12475e = o72Var;
        this.f12471a = g72Var;
        this.f12472b = au2Var;
        this.f12473c = ot2Var;
        this.f12474d = yb1Var;
    }

    @Override // com.google.android.gms.internal.ads.ma3
    public final void a(Throwable th) {
        au2 au2Var;
        final k3.w2 w2VarA = this.f12474d.a().a(th);
        this.f12474d.b().u(w2VarA);
        this.f12475e.f13040b.b().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.m72
            @Override // java.lang.Runnable
            public final void run() {
                n72 n72Var = this.f11993m;
                n72Var.f12475e.f13042d.a().u(w2VarA);
            }
        });
        zo2.b(w2VarA.f24788m, th, "NativeAdLoader.onFailure");
        this.f12471a.a();
        if (!((Boolean) vs.f16842c.e()).booleanValue() || (au2Var = this.f12472b) == null) {
            cu2 cu2Var = this.f12475e.f13043e;
            ot2 ot2Var = this.f12473c;
            ot2Var.u(w2VarA);
            ot2Var.D0(th);
            ot2Var.B0(false);
            cu2Var.b(ot2Var.l());
            return;
        }
        au2Var.c(w2VarA);
        ot2 ot2Var2 = this.f12473c;
        ot2Var2.D0(th);
        ot2Var2.B0(false);
        au2Var.a(ot2Var2);
        au2Var.g();
    }

    @Override // com.google.android.gms.internal.ads.ma3
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        au2 au2Var;
        ex0 ex0Var = (ex0) obj;
        synchronized (this.f12475e) {
            ex0Var.e().a(this.f12475e.f13042d.d());
            this.f12471a.b(ex0Var);
            this.f12475e.f13040b.b().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.l72
                @Override // java.lang.Runnable
                public final void run() {
                    this.f11357m.f12475e.f13042d.b().m();
                }
            });
            if (!((Boolean) vs.f16842c.e()).booleanValue() || (au2Var = this.f12472b) == null) {
                cu2 cu2Var = this.f12475e.f13043e;
                ot2 ot2Var = this.f12473c;
                ot2Var.C0(ex0Var.g().f16413b);
                ot2Var.W(ex0Var.c().h());
                ot2Var.B0(true);
                cu2Var.b(ot2Var.l());
            } else {
                au2Var.f(ex0Var.g().f16413b);
                au2Var.e(ex0Var.c().h());
                ot2 ot2Var2 = this.f12473c;
                ot2Var2.B0(true);
                au2Var.a(ot2Var2);
                au2Var.g();
            }
        }
    }
}
