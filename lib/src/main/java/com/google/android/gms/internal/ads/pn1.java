package com.google.android.gms.internal.ads;

import java.util.Set;

/* loaded from: classes.dex */
public final class pn1 implements c44 {

    /* renamed from: a, reason: collision with root package name */
    private final ln1 f13951a;

    /* renamed from: b, reason: collision with root package name */
    private final q44 f13952b;

    /* renamed from: c, reason: collision with root package name */
    private final q44 f13953c;

    public pn1(ln1 ln1Var, q44 q44Var, q44 q44Var2) {
        this.f13951a = ln1Var;
        this.f13952b = q44Var;
        this.f13953c = q44Var2;
    }

    @Override // com.google.android.gms.internal.ads.q44
    public final /* bridge */ /* synthetic */ Object b() {
        vn1 vn1Var = (vn1) this.f13952b.b();
        bb3 bb3Var = of0.f13186a;
        k44.b(bb3Var);
        Set setD = ln1.d(vn1Var, bb3Var);
        k44.b(setD);
        return setD;
    }
}
