package com.google.android.gms.internal.ads;

import java.util.Set;

/* loaded from: classes.dex */
public final class mn1 implements c44 {

    /* renamed from: a, reason: collision with root package name */
    private final ln1 f12203a;

    /* renamed from: b, reason: collision with root package name */
    private final q44 f12204b;

    /* renamed from: c, reason: collision with root package name */
    private final q44 f12205c;

    public mn1(ln1 ln1Var, q44 q44Var, q44 q44Var2) {
        this.f12203a = ln1Var;
        this.f12204b = q44Var;
        this.f12205c = q44Var2;
    }

    @Override // com.google.android.gms.internal.ads.q44
    public final /* bridge */ /* synthetic */ Object b() {
        vn1 vn1Var = (vn1) this.f12204b.b();
        bb3 bb3Var = of0.f13186a;
        k44.b(bb3Var);
        Set setA = ln1.a(vn1Var, bb3Var);
        k44.b(setA);
        return setA;
    }
}
