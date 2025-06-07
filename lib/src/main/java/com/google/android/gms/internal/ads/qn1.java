package com.google.android.gms.internal.ads;

import java.util.Set;

/* loaded from: classes.dex */
public final class qn1 implements c44 {

    /* renamed from: a, reason: collision with root package name */
    private final ln1 f14415a;

    /* renamed from: b, reason: collision with root package name */
    private final q44 f14416b;

    /* renamed from: c, reason: collision with root package name */
    private final q44 f14417c;

    public qn1(ln1 ln1Var, q44 q44Var, q44 q44Var2) {
        this.f14415a = ln1Var;
        this.f14416b = q44Var;
        this.f14417c = q44Var2;
    }

    @Override // com.google.android.gms.internal.ads.q44
    public final /* bridge */ /* synthetic */ Object b() {
        vn1 vn1Var = (vn1) this.f14416b.b();
        bb3 bb3Var = of0.f13186a;
        k44.b(bb3Var);
        Set setE = ln1.e(vn1Var, bb3Var);
        k44.b(setE);
        return setE;
    }
}
