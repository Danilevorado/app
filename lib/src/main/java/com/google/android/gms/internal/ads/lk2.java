package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class lk2 implements wk2 {

    /* renamed from: a, reason: collision with root package name */
    private r01 f11647a;

    @Override // com.google.android.gms.internal.ads.wk2
    public final /* bridge */ /* synthetic */ ab3 a(xk2 xk2Var, vk2 vk2Var, Object obj) {
        return c(xk2Var, vk2Var, null);
    }

    @Override // com.google.android.gms.internal.ads.wk2
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final synchronized r01 f() {
        return this.f11647a;
    }

    public final synchronized ab3 c(xk2 xk2Var, vk2 vk2Var, r01 r01Var) {
        my0 my0VarB;
        if (r01Var != null) {
            this.f11647a = r01Var;
        } else {
            this.f11647a = (r01) vk2Var.a(xk2Var.f17615b).g();
        }
        my0VarB = this.f11647a.b();
        return my0VarB.i(my0VarB.j());
    }
}
