package com.google.android.gms.internal.ads;

import java.util.Set;

/* loaded from: classes.dex */
public final class un1 implements c44 {

    /* renamed from: a, reason: collision with root package name */
    private final ln1 f16409a;

    /* renamed from: b, reason: collision with root package name */
    private final q44 f16410b;

    /* renamed from: c, reason: collision with root package name */
    private final q44 f16411c;

    public un1(ln1 ln1Var, q44 q44Var, q44 q44Var2) {
        this.f16409a = ln1Var;
        this.f16410b = q44Var;
        this.f16411c = q44Var2;
    }

    @Override // com.google.android.gms.internal.ads.q44
    public final /* bridge */ /* synthetic */ Object b() {
        vn1 vn1Var = (vn1) this.f16410b.b();
        bb3 bb3Var = of0.f13186a;
        k44.b(bb3Var);
        Set setI = ln1.i(vn1Var, bb3Var);
        k44.b(setI);
        return setI;
    }
}
