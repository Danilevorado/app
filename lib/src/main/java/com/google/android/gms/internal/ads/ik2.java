package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class ik2 implements wk2 {

    /* renamed from: a, reason: collision with root package name */
    private final sp2 f9777a;

    /* renamed from: b, reason: collision with root package name */
    private final Executor f9778b;

    /* renamed from: c, reason: collision with root package name */
    private final ma3 f9779c = new fk2(this);

    public ik2(sp2 sp2Var, Executor executor) {
        this.f9777a = sp2Var;
        this.f9778b = executor;
    }

    @Override // com.google.android.gms.internal.ads.wk2
    public final /* bridge */ /* synthetic */ ab3 a(xk2 xk2Var, vk2 vk2Var, Object obj) {
        return c(xk2Var, vk2Var, null);
    }

    final /* synthetic */ ab3 b(r01 r01Var, rk2 rk2Var) {
        cq2 cq2Var = rk2Var.f14834b;
        k90 k90Var = rk2Var.f14833a;
        bq2 bq2VarE = cq2Var != null ? this.f9777a.e(cq2Var) : null;
        if (cq2Var == null) {
            return qa3.h(null);
        }
        if (bq2VarE != null && k90Var != null) {
            qa3.q(r01Var.b().h(k90Var), this.f9779c, this.f9778b);
        }
        return qa3.h(new gk2(cq2Var, k90Var, bq2VarE));
    }

    public final ab3 c(xk2 xk2Var, vk2 vk2Var, final r01 r01Var) {
        return qa3.e(qa3.m(ga3.D(new sk2(this.f9777a, r01Var, this.f9778b).c()), new w93() { // from class: com.google.android.gms.internal.ads.dk2
            @Override // com.google.android.gms.internal.ads.w93
            public final ab3 a(Object obj) {
                return this.f7388a.b(r01Var, (rk2) obj);
            }
        }, this.f9778b), Exception.class, new ek2(this), this.f9778b);
    }

    @Override // com.google.android.gms.internal.ads.wk2
    public final /* bridge */ /* synthetic */ Object f() {
        return null;
    }
}
