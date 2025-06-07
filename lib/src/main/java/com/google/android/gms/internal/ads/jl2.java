package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class jl2 implements h72 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f10562a;

    /* renamed from: b, reason: collision with root package name */
    private final Executor f10563b;

    /* renamed from: c, reason: collision with root package name */
    private final km0 f10564c;

    /* renamed from: d, reason: collision with root package name */
    private final q62 f10565d;

    /* renamed from: e, reason: collision with root package name */
    private final km2 f10566e;

    /* renamed from: f, reason: collision with root package name */
    private hs f10567f;

    /* renamed from: g, reason: collision with root package name */
    private final cu2 f10568g;

    /* renamed from: h, reason: collision with root package name */
    private final bo2 f10569h;

    /* renamed from: i, reason: collision with root package name */
    private ab3 f10570i;

    public jl2(Context context, Executor executor, km0 km0Var, q62 q62Var, km2 km2Var, bo2 bo2Var) {
        this.f10562a = context;
        this.f10563b = executor;
        this.f10564c = km0Var;
        this.f10565d = q62Var;
        this.f10569h = bo2Var;
        this.f10566e = km2Var;
        this.f10568g = km0Var.B();
    }

    @Override // com.google.android.gms.internal.ads.h72
    public final boolean a() {
        ab3 ab3Var = this.f10570i;
        return (ab3Var == null || ab3Var.isDone()) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.h72
    public final boolean b(k3.c4 c4Var, String str, f72 f72Var, g72 g72Var) {
        bb1 bb1VarE;
        au2 au2Var;
        if (str == null) {
            ze0.d("Ad unit ID should not be null for interstitial ad.");
            this.f10563b.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.cl2
                @Override // java.lang.Runnable
                public final void run() {
                    this.f6978m.h();
                }
            });
            return false;
        }
        if (a()) {
            return false;
        }
        if (((Boolean) k3.w.c().b(ir.f10009l8)).booleanValue() && c4Var.f24619r) {
            this.f10564c.n().m(true);
        }
        k3.h4 h4Var = ((bl2) f72Var).f6534a;
        bo2 bo2Var = this.f10569h;
        bo2Var.J(str);
        bo2Var.I(h4Var);
        bo2Var.e(c4Var);
        do2 do2VarG = bo2Var.g();
        ot2 ot2VarB = nt2.b(this.f10562a, zt2.f(do2VarG), 4, c4Var);
        if (((Boolean) k3.w.c().b(ir.F7)).booleanValue()) {
            ab1 ab1VarJ = this.f10564c.j();
            s01 s01Var = new s01();
            s01Var.e(this.f10562a);
            s01Var.i(do2VarG);
            ab1VarJ.r(s01Var.j());
            a71 a71Var = new a71();
            a71Var.m(this.f10565d, this.f10563b);
            a71Var.n(this.f10565d, this.f10563b);
            ab1VarJ.i(a71Var.q());
            ab1VarJ.s(new y42(this.f10567f));
            bb1VarE = ab1VarJ.g();
        } else {
            a71 a71Var2 = new a71();
            km2 km2Var = this.f10566e;
            if (km2Var != null) {
                a71Var2.h(km2Var, this.f10563b);
                a71Var2.i(this.f10566e, this.f10563b);
                a71Var2.e(this.f10566e, this.f10563b);
            }
            ab1 ab1VarJ2 = this.f10564c.j();
            s01 s01Var2 = new s01();
            s01Var2.e(this.f10562a);
            s01Var2.i(do2VarG);
            ab1VarJ2.r(s01Var2.j());
            a71Var2.m(this.f10565d, this.f10563b);
            a71Var2.h(this.f10565d, this.f10563b);
            a71Var2.i(this.f10565d, this.f10563b);
            a71Var2.e(this.f10565d, this.f10563b);
            a71Var2.d(this.f10565d, this.f10563b);
            a71Var2.o(this.f10565d, this.f10563b);
            a71Var2.n(this.f10565d, this.f10563b);
            a71Var2.l(this.f10565d, this.f10563b);
            a71Var2.f(this.f10565d, this.f10563b);
            ab1VarJ2.i(a71Var2.q());
            ab1VarJ2.s(new y42(this.f10567f));
            bb1VarE = ab1VarJ2.g();
        }
        bb1 bb1Var = bb1VarE;
        if (((Boolean) vs.f16842c.e()).booleanValue()) {
            au2 au2VarD = bb1Var.d();
            au2VarD.h(4);
            au2VarD.b(c4Var.B);
            au2Var = au2VarD;
        } else {
            au2Var = null;
        }
        my0 my0VarA = bb1Var.a();
        ab3 ab3VarI = my0VarA.i(my0VarA.j());
        this.f10570i = ab3VarI;
        qa3.q(ab3VarI, new hl2(this, g72Var, au2Var, ot2VarB, bb1Var), this.f10563b);
        return true;
    }

    final /* synthetic */ void h() {
        this.f10565d.u(fp2.d(6, null, null));
    }

    public final void i(hs hsVar) {
        this.f10567f = hsVar;
    }
}
