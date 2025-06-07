package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class mk2 implements wk2 {

    /* renamed from: a, reason: collision with root package name */
    private final wk2 f12185a;

    /* renamed from: b, reason: collision with root package name */
    private r01 f12186b;

    public mk2(wk2 wk2Var) {
        this.f12185a = wk2Var;
    }

    @Override // com.google.android.gms.internal.ads.wk2
    public final /* bridge */ /* synthetic */ ab3 a(xk2 xk2Var, vk2 vk2Var, Object obj) {
        return c(xk2Var, vk2Var, null);
    }

    @Override // com.google.android.gms.internal.ads.wk2
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final synchronized r01 f() {
        return this.f12186b;
    }

    public final synchronized ab3 c(xk2 xk2Var, vk2 vk2Var, r01 r01Var) {
        this.f12186b = r01Var;
        if (xk2Var.f17614a == null) {
            return ((lk2) this.f12185a).c(xk2Var, vk2Var, r01Var);
        }
        my0 my0VarB = r01Var.b();
        return my0VarB.i(my0VarB.k(qa3.h(xk2Var.f17614a)));
    }
}
