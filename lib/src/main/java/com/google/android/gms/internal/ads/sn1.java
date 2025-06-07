package com.google.android.gms.internal.ads;

import java.util.Set;

/* loaded from: classes.dex */
public final class sn1 implements c44 {

    /* renamed from: a, reason: collision with root package name */
    private final ln1 f15454a;

    /* renamed from: b, reason: collision with root package name */
    private final q44 f15455b;

    /* renamed from: c, reason: collision with root package name */
    private final q44 f15456c;

    public sn1(ln1 ln1Var, q44 q44Var, q44 q44Var2) {
        this.f15454a = ln1Var;
        this.f15455b = q44Var;
        this.f15456c = q44Var2;
    }

    @Override // com.google.android.gms.internal.ads.q44
    public final /* bridge */ /* synthetic */ Object b() {
        vn1 vn1Var = (vn1) this.f15455b.b();
        bb3 bb3Var = of0.f13186a;
        k44.b(bb3Var);
        Set setG = ln1.g(vn1Var, bb3Var);
        k44.b(setG);
        return setG;
    }
}
