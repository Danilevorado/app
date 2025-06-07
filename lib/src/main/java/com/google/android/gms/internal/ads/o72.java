package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public final class o72 implements h72 {

    /* renamed from: a, reason: collision with root package name */
    private final bo2 f13039a;

    /* renamed from: b, reason: collision with root package name */
    private final km0 f13040b;

    /* renamed from: c, reason: collision with root package name */
    private final Context f13041c;

    /* renamed from: d, reason: collision with root package name */
    private final e72 f13042d;

    /* renamed from: e, reason: collision with root package name */
    private final cu2 f13043e;

    /* renamed from: f, reason: collision with root package name */
    private sx0 f13044f;

    public o72(km0 km0Var, Context context, e72 e72Var, bo2 bo2Var) {
        this.f13040b = km0Var;
        this.f13041c = context;
        this.f13042d = e72Var;
        this.f13039a = bo2Var;
        this.f13043e = km0Var.B();
        bo2Var.L(e72Var.d());
    }

    @Override // com.google.android.gms.internal.ads.h72
    public final boolean a() {
        sx0 sx0Var = this.f13044f;
        return sx0Var != null && sx0Var.f();
    }

    @Override // com.google.android.gms.internal.ads.h72
    public final boolean b(k3.c4 c4Var, String str, f72 f72Var, g72 g72Var) {
        au2 au2Var;
        Executor executorB;
        Runnable runnable;
        j3.t.r();
        if (m3.b2.c(this.f13041c) && c4Var.E == null) {
            ze0.d("Failed to load the ad because app ID is missing.");
            executorB = this.f13040b.b();
            runnable = new Runnable() { // from class: com.google.android.gms.internal.ads.j72
                @Override // java.lang.Runnable
                public final void run() {
                    this.f10338m.f();
                }
            };
        } else {
            if (str != null) {
                zo2.a(this.f13041c, c4Var.f24619r);
                if (((Boolean) k3.w.c().b(ir.f10009l8)).booleanValue() && c4Var.f24619r) {
                    this.f13040b.n().m(true);
                }
                int i10 = ((i72) f72Var).f9598a;
                bo2 bo2Var = this.f13039a;
                bo2Var.e(c4Var);
                bo2Var.Q(i10);
                do2 do2VarG = bo2Var.g();
                ot2 ot2VarB = nt2.b(this.f13041c, zt2.f(do2VarG), 8, c4Var);
                k3.y0 y0Var = do2VarG.f7455n;
                if (y0Var != null) {
                    this.f13042d.d().o(y0Var);
                }
                xb1 xb1VarK = this.f13040b.k();
                s01 s01Var = new s01();
                s01Var.e(this.f13041c);
                s01Var.i(do2VarG);
                xb1VarK.m(s01Var.j());
                a71 a71Var = new a71();
                a71Var.n(this.f13042d.d(), this.f13040b.b());
                xb1VarK.t(a71Var.q());
                xb1VarK.a(this.f13042d.c());
                xb1VarK.d(new wu0(null));
                yb1 yb1VarH = xb1VarK.h();
                if (((Boolean) vs.f16842c.e()).booleanValue()) {
                    au2 au2VarE = yb1VarH.e();
                    au2VarE.h(8);
                    au2VarE.b(c4Var.B);
                    au2Var = au2VarE;
                } else {
                    au2Var = null;
                }
                this.f13040b.z().c(1);
                bb3 bb3Var = of0.f13186a;
                k44.b(bb3Var);
                ScheduledExecutorService scheduledExecutorServiceC = this.f13040b.c();
                my0 my0VarA = yb1VarH.a();
                sx0 sx0Var = new sx0(bb3Var, scheduledExecutorServiceC, my0VarA.i(my0VarA.j()));
                this.f13044f = sx0Var;
                sx0Var.e(new n72(this, g72Var, au2Var, ot2VarB, yb1VarH));
                return true;
            }
            ze0.d("Ad unit ID should not be null for NativeAdLoader.");
            executorB = this.f13040b.b();
            runnable = new Runnable() { // from class: com.google.android.gms.internal.ads.k72
                @Override // java.lang.Runnable
                public final void run() {
                    this.f10861m.g();
                }
            };
        }
        executorB.execute(runnable);
        return false;
    }

    final /* synthetic */ void f() {
        this.f13042d.a().u(fp2.d(4, null, null));
    }

    final /* synthetic */ void g() {
        this.f13042d.a().u(fp2.d(6, null, null));
    }
}
