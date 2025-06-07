package com.google.android.gms.internal.ads;

import java.util.Set;

/* loaded from: classes.dex */
public final class tn1 implements c44 {

    /* renamed from: a, reason: collision with root package name */
    private final ln1 f15920a;

    /* renamed from: b, reason: collision with root package name */
    private final q44 f15921b;

    /* renamed from: c, reason: collision with root package name */
    private final q44 f15922c;

    public tn1(ln1 ln1Var, q44 q44Var, q44 q44Var2) {
        this.f15920a = ln1Var;
        this.f15921b = q44Var;
        this.f15922c = q44Var2;
    }

    @Override // com.google.android.gms.internal.ads.q44
    public final /* bridge */ /* synthetic */ Object b() {
        vn1 vn1Var = (vn1) this.f15921b.b();
        bb3 bb3Var = of0.f13186a;
        k44.b(bb3Var);
        Set setH = ln1.h(vn1Var, bb3Var);
        k44.b(setH);
        return setH;
    }
}
