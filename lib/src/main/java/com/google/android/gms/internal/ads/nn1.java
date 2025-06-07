package com.google.android.gms.internal.ads;

import java.util.Set;

/* loaded from: classes.dex */
public final class nn1 implements c44 {

    /* renamed from: a, reason: collision with root package name */
    private final ln1 f12715a;

    /* renamed from: b, reason: collision with root package name */
    private final q44 f12716b;

    /* renamed from: c, reason: collision with root package name */
    private final q44 f12717c;

    public nn1(ln1 ln1Var, q44 q44Var, q44 q44Var2) {
        this.f12715a = ln1Var;
        this.f12716b = q44Var;
        this.f12717c = q44Var2;
    }

    @Override // com.google.android.gms.internal.ads.q44
    public final /* bridge */ /* synthetic */ Object b() {
        vn1 vn1Var = (vn1) this.f12716b.b();
        bb3 bb3Var = of0.f13186a;
        k44.b(bb3Var);
        Set setB = ln1.b(vn1Var, bb3Var);
        k44.b(setB);
        return setB;
    }
}
