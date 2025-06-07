package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class c02 implements az1 {

    /* renamed from: a, reason: collision with root package name */
    private final xv0 f6740a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f6741b;

    /* renamed from: c, reason: collision with root package name */
    private final dk1 f6742c;

    /* renamed from: d, reason: collision with root package name */
    private final do2 f6743d;

    /* renamed from: e, reason: collision with root package name */
    private final Executor f6744e;

    /* renamed from: f, reason: collision with root package name */
    private final w23 f6745f;

    public c02(xv0 xv0Var, Context context, Executor executor, dk1 dk1Var, do2 do2Var, w23 w23Var) {
        this.f6741b = context;
        this.f6740a = xv0Var;
        this.f6744e = executor;
        this.f6742c = dk1Var;
        this.f6743d = do2Var;
        this.f6745f = w23Var;
    }

    @Override // com.google.android.gms.internal.ads.az1
    public final ab3 a(final un2 un2Var, final hn2 hn2Var) {
        return qa3.m(qa3.h(null), new w93() { // from class: com.google.android.gms.internal.ads.wz1
            @Override // com.google.android.gms.internal.ads.w93
            public final ab3 a(Object obj) {
                return this.f17302a.c(un2Var, hn2Var, obj);
            }
        }, this.f6744e);
    }

    @Override // com.google.android.gms.internal.ads.az1
    public final boolean b(un2 un2Var, hn2 hn2Var) {
        nn2 nn2Var = hn2Var.f9272t;
        return (nn2Var == null || nn2Var.f12718a == null) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    final /* synthetic */ ab3 c(un2 un2Var, hn2 hn2Var, Object obj) {
        View gk1Var;
        k3.h4 h4VarA = ho2.a(this.f6741b, hn2Var.f9274v);
        final nk0 nk0VarA = this.f6742c.a(h4VarA, hn2Var, un2Var.f16413b.f15924b);
        nk0VarA.h1(hn2Var.X);
        if (((Boolean) k3.w.c().b(ir.f10019m7)).booleanValue() && hn2Var.f9251h0) {
            gk1Var = pw0.a(this.f6741b, (View) nk0VarA, hn2Var);
        } else {
            gk1Var = new gk1(this.f6741b, (View) nk0VarA, (m3.t) this.f6745f.a(hn2Var));
        }
        final av0 av0VarA = this.f6740a.a(new tx0(un2Var, hn2Var, null), new hv0(gk1Var, nk0VarA, new bx0() { // from class: com.google.android.gms.internal.ads.xz1
            @Override // com.google.android.gms.internal.ads.bx0
            public final k3.m2 a() {
                return nk0VarA.q();
            }
        }, ho2.b(h4VarA)));
        av0VarA.j().i(nk0VarA, false, null);
        d21 d21VarB = av0VarA.b();
        f21 f21Var = new f21() { // from class: com.google.android.gms.internal.ads.yz1
            @Override // com.google.android.gms.internal.ads.f21
            public final void l() {
                nk0 nk0Var = nk0VarA;
                if (nk0Var.G() != null) {
                    nk0Var.G().q();
                }
            }
        };
        bb3 bb3Var = of0.f13191f;
        d21VarB.o0(f21Var, bb3Var);
        av0VarA.j();
        nn2 nn2Var = hn2Var.f9272t;
        ab3 ab3VarJ = ck1.j(nk0VarA, nn2Var.f12719b, nn2Var.f12718a);
        if (hn2Var.N) {
            ab3VarJ.b(new Runnable() { // from class: com.google.android.gms.internal.ads.zz1
                @Override // java.lang.Runnable
                public final void run() {
                    nk0VarA.e1();
                }
            }, this.f6744e);
        }
        ab3VarJ.b(new Runnable() { // from class: com.google.android.gms.internal.ads.a02
            @Override // java.lang.Runnable
            public final void run() {
                this.f5879m.d(nk0VarA);
            }
        }, this.f6744e);
        return qa3.l(ab3VarJ, new w23() { // from class: com.google.android.gms.internal.ads.b02
            @Override // com.google.android.gms.internal.ads.w23
            public final Object a(Object obj2) {
                return av0VarA.h();
            }
        }, bb3Var);
    }

    final /* synthetic */ void d(nk0 nk0Var) {
        nk0Var.D0();
        kl0 kl0VarQ = nk0Var.q();
        k3.v3 v3Var = this.f6743d.f7442a;
        if (v3Var == null || kl0VarQ == null) {
            return;
        }
        kl0VarQ.P5(v3Var);
    }
}
