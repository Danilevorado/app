package com.google.android.gms.internal.ads;

import java.util.Set;

/* loaded from: classes.dex */
public final class rn1 implements c44 {

    /* renamed from: a, reason: collision with root package name */
    private final ln1 f14848a;

    /* renamed from: b, reason: collision with root package name */
    private final q44 f14849b;

    /* renamed from: c, reason: collision with root package name */
    private final q44 f14850c;

    public rn1(ln1 ln1Var, q44 q44Var, q44 q44Var2) {
        this.f14848a = ln1Var;
        this.f14849b = q44Var;
        this.f14850c = q44Var2;
    }

    @Override // com.google.android.gms.internal.ads.q44
    public final /* bridge */ /* synthetic */ Object b() {
        vn1 vn1Var = (vn1) this.f14849b.b();
        bb3 bb3Var = of0.f13186a;
        k44.b(bb3Var);
        Set setF = ln1.f(vn1Var, bb3Var);
        k44.b(setF);
        return setF;
    }
}
