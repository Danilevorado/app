package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class bk2 implements wk2 {

    /* renamed from: a, reason: collision with root package name */
    private final wk2 f6519a;

    /* renamed from: b, reason: collision with root package name */
    private final wk2 f6520b;

    /* renamed from: c, reason: collision with root package name */
    private final pq2 f6521c;

    /* renamed from: d, reason: collision with root package name */
    private final String f6522d;

    /* renamed from: e, reason: collision with root package name */
    private r01 f6523e;

    /* renamed from: f, reason: collision with root package name */
    private final Executor f6524f;

    public bk2(wk2 wk2Var, wk2 wk2Var2, pq2 pq2Var, String str, Executor executor) {
        this.f6519a = wk2Var;
        this.f6520b = wk2Var2;
        this.f6521c = pq2Var;
        this.f6522d = str;
        this.f6524f = executor;
    }

    private final ab3 g(bq2 bq2Var, xk2 xk2Var) {
        r01 r01Var = bq2Var.f6642a;
        this.f6523e = r01Var;
        if (bq2Var.f6644c != null) {
            if (r01Var.e() != null) {
                bq2Var.f6644c.f().e(bq2Var.f6642a.e());
            }
            return qa3.h(bq2Var.f6644c);
        }
        r01Var.b().l(bq2Var.f6643b);
        return ((mk2) this.f6519a).c(xk2Var, null, bq2Var.f6642a);
    }

    @Override // com.google.android.gms.internal.ads.wk2
    public final /* bridge */ /* synthetic */ ab3 a(xk2 xk2Var, vk2 vk2Var, Object obj) {
        return e(xk2Var, vk2Var, null);
    }

    @Override // com.google.android.gms.internal.ads.wk2
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final synchronized r01 f() {
        return this.f6523e;
    }

    final /* synthetic */ ab3 c(xk2 xk2Var, ak2 ak2Var, vk2 vk2Var, r01 r01Var, gk2 gk2Var) {
        if (gk2Var != null) {
            ak2 ak2Var2 = new ak2(ak2Var.f6128a, ak2Var.f6129b, ak2Var.f6130c, ak2Var.f6131d, ak2Var.f6132e, ak2Var.f6133f, gk2Var.f8784a);
            if (gk2Var.f8786c != null) {
                this.f6523e = null;
                this.f6521c.e(ak2Var2);
                return g(gk2Var.f8786c, xk2Var);
            }
            ab3 ab3VarA = this.f6521c.a(ak2Var2);
            if (ab3VarA != null) {
                this.f6523e = null;
                return qa3.m(ab3VarA, new w93() { // from class: com.google.android.gms.internal.ads.xj2
                    @Override // com.google.android.gms.internal.ads.w93
                    public final ab3 a(Object obj) {
                        return this.f17594a.d((lq2) obj);
                    }
                }, this.f6524f);
            }
            this.f6521c.e(ak2Var2);
            xk2Var = new xk2(xk2Var.f17615b, gk2Var.f8785b);
        }
        ab3 ab3VarC = ((mk2) this.f6519a).c(xk2Var, vk2Var, r01Var);
        this.f6523e = r01Var;
        return ab3VarC;
    }

    final /* synthetic */ ab3 d(lq2 lq2Var) throws yq1 {
        nq2 nq2Var;
        if (lq2Var == null || lq2Var.f11829a == null || (nq2Var = lq2Var.f11830b) == null) {
            throw new yq1(1, "Empty prefetch");
        }
        fn fnVarK = ln.K();
        dn dnVarK = en.K();
        dnVarK.y(2);
        dnVarK.v(in.M());
        fnVarK.u(dnVarK);
        lq2Var.f11829a.f6642a.b().c().e0((ln) fnVarK.m());
        return g(lq2Var.f11829a, ((ak2) nq2Var).f6129b);
    }

    public final synchronized ab3 e(final xk2 xk2Var, final vk2 vk2Var, r01 r01Var) {
        q01 q01VarA = vk2Var.a(xk2Var.f17615b);
        q01VarA.n(new ck2(this.f6522d));
        final r01 r01Var2 = (r01) q01VarA.g();
        r01Var2.h();
        r01Var2.h();
        k3.c4 c4Var = r01Var2.h().f7445d;
        if (c4Var.E == null && c4Var.J == null) {
            do2 do2VarH = r01Var2.h();
            final ak2 ak2Var = new ak2(vk2Var, xk2Var, do2VarH.f7445d, do2VarH.f7447f, this.f6524f, do2VarH.f7451j, null);
            return qa3.m(ga3.D(((ik2) this.f6520b).c(xk2Var, vk2Var, r01Var2)), new w93() { // from class: com.google.android.gms.internal.ads.yj2
                @Override // com.google.android.gms.internal.ads.w93
                public final ab3 a(Object obj) {
                    return this.f18073a.c(xk2Var, ak2Var, vk2Var, r01Var2, (gk2) obj);
                }
            }, this.f6524f);
        }
        this.f6523e = r01Var2;
        return ((mk2) this.f6519a).c(xk2Var, vk2Var, r01Var2);
    }
}
