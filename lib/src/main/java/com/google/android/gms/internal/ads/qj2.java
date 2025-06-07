package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class qj2 implements h72 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f14366a;

    /* renamed from: b, reason: collision with root package name */
    private final Executor f14367b;

    /* renamed from: c, reason: collision with root package name */
    private final km0 f14368c;

    /* renamed from: d, reason: collision with root package name */
    private final q62 f14369d;

    /* renamed from: e, reason: collision with root package name */
    private final v62 f14370e;

    /* renamed from: f, reason: collision with root package name */
    private final ViewGroup f14371f;

    /* renamed from: g, reason: collision with root package name */
    private hs f14372g;

    /* renamed from: h, reason: collision with root package name */
    private final c41 f14373h;

    /* renamed from: i, reason: collision with root package name */
    private final cu2 f14374i;

    /* renamed from: j, reason: collision with root package name */
    private final j61 f14375j;

    /* renamed from: k, reason: collision with root package name */
    private final bo2 f14376k;

    /* renamed from: l, reason: collision with root package name */
    private ab3 f14377l;

    public qj2(Context context, Executor executor, k3.h4 h4Var, km0 km0Var, q62 q62Var, v62 v62Var, bo2 bo2Var, j61 j61Var) {
        this.f14366a = context;
        this.f14367b = executor;
        this.f14368c = km0Var;
        this.f14369d = q62Var;
        this.f14370e = v62Var;
        this.f14376k = bo2Var;
        this.f14373h = km0Var.i();
        this.f14374i = km0Var.B();
        this.f14371f = new FrameLayout(context);
        this.f14375j = j61Var;
        bo2Var.I(h4Var);
    }

    @Override // com.google.android.gms.internal.ads.h72
    public final boolean a() {
        ab3 ab3Var = this.f14377l;
        return (ab3Var == null || ab3Var.isDone()) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.h72
    public final boolean b(k3.c4 c4Var, String str, f72 f72Var, g72 g72Var) {
        wv0 wv0VarH;
        wu0 wu0Var;
        au2 au2Var;
        if (str == null) {
            ze0.d("Ad unit ID should not be null for banner ad.");
            this.f14367b.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.mj2
                @Override // java.lang.Runnable
                public final void run() {
                    this.f12174m.m();
                }
            });
            return false;
        }
        if (a()) {
            return false;
        }
        if (((Boolean) k3.w.c().b(ir.f10009l8)).booleanValue() && c4Var.f24619r) {
            this.f14368c.n().m(true);
        }
        bo2 bo2Var = this.f14376k;
        bo2Var.J(str);
        bo2Var.e(c4Var);
        do2 do2VarG = bo2Var.g();
        ot2 ot2VarB = nt2.b(this.f14366a, zt2.f(do2VarG), 3, c4Var);
        if (((Boolean) jt.f10696d.e()).booleanValue() && this.f14376k.x().f24661w) {
            q62 q62Var = this.f14369d;
            if (q62Var != null) {
                q62Var.u(fp2.d(7, null, null));
            }
            return false;
        }
        if (((Boolean) k3.w.c().b(ir.D7)).booleanValue()) {
            wv0VarH = this.f14368c.h();
            s01 s01Var = new s01();
            s01Var.e(this.f14366a);
            s01Var.i(do2VarG);
            wv0VarH.o(s01Var.j());
            a71 a71Var = new a71();
            a71Var.m(this.f14369d, this.f14367b);
            a71Var.n(this.f14369d, this.f14367b);
            wv0VarH.p(a71Var.q());
            wv0VarH.k(new y42(this.f14372g));
            wv0VarH.a(new tb1(ae1.f6050h, null));
            wv0VarH.l(new vw0(this.f14373h, this.f14375j));
            wu0Var = new wu0(this.f14371f);
        } else {
            wv0VarH = this.f14368c.h();
            s01 s01Var2 = new s01();
            s01Var2.e(this.f14366a);
            s01Var2.i(do2VarG);
            wv0VarH.o(s01Var2.j());
            a71 a71Var2 = new a71();
            a71Var2.m(this.f14369d, this.f14367b);
            a71Var2.d(this.f14369d, this.f14367b);
            a71Var2.d(this.f14370e, this.f14367b);
            a71Var2.o(this.f14369d, this.f14367b);
            a71Var2.g(this.f14369d, this.f14367b);
            a71Var2.h(this.f14369d, this.f14367b);
            a71Var2.i(this.f14369d, this.f14367b);
            a71Var2.e(this.f14369d, this.f14367b);
            a71Var2.n(this.f14369d, this.f14367b);
            a71Var2.l(this.f14369d, this.f14367b);
            wv0VarH.p(a71Var2.q());
            wv0VarH.k(new y42(this.f14372g));
            wv0VarH.a(new tb1(ae1.f6050h, null));
            wv0VarH.l(new vw0(this.f14373h, this.f14375j));
            wu0Var = new wu0(this.f14371f);
        }
        wv0VarH.d(wu0Var);
        xv0 xv0VarJ = wv0VarH.g();
        if (((Boolean) vs.f16842c.e()).booleanValue()) {
            au2 au2VarF = xv0VarJ.f();
            au2VarF.h(3);
            au2VarF.b(c4Var.B);
            au2Var = au2VarF;
        } else {
            au2Var = null;
        }
        my0 my0VarD = xv0VarJ.d();
        ab3 ab3VarI = my0VarD.i(my0VarD.j());
        this.f14377l = ab3VarI;
        qa3.q(ab3VarI, new pj2(this, g72Var, au2Var, ot2VarB, xv0VarJ), this.f14367b);
        return true;
    }

    public final ViewGroup d() {
        return this.f14371f;
    }

    public final bo2 i() {
        return this.f14376k;
    }

    final /* synthetic */ void m() {
        this.f14369d.u(fp2.d(6, null, null));
    }

    public final void n() {
        this.f14373h.r0(this.f14375j.a());
    }

    public final void o(k3.a0 a0Var) {
        this.f14370e.a(a0Var);
    }

    public final void p(d41 d41Var) {
        this.f14373h.o0(d41Var, this.f14367b);
    }

    public final void q(hs hsVar) {
        this.f14372g = hsVar;
    }

    public final boolean r() {
        Object parent = this.f14371f.getParent();
        if (!(parent instanceof View)) {
            return false;
        }
        View view = (View) parent;
        j3.t.r();
        return m3.b2.r(view, view.getContext());
    }
}
