package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class qe1 implements c44 {

    /* renamed from: a, reason: collision with root package name */
    private final q44 f14281a;

    /* renamed from: b, reason: collision with root package name */
    private final q44 f14282b;

    /* renamed from: c, reason: collision with root package name */
    private final q44 f14283c;

    /* renamed from: d, reason: collision with root package name */
    private final q44 f14284d;

    /* renamed from: e, reason: collision with root package name */
    private final q44 f14285e;

    /* renamed from: f, reason: collision with root package name */
    private final q44 f14286f;

    /* renamed from: g, reason: collision with root package name */
    private final q44 f14287g;

    /* renamed from: h, reason: collision with root package name */
    private final q44 f14288h;

    /* renamed from: i, reason: collision with root package name */
    private final q44 f14289i;

    public qe1(q44 q44Var, q44 q44Var2, q44 q44Var3, q44 q44Var4, q44 q44Var5, q44 q44Var6, q44 q44Var7, q44 q44Var8, q44 q44Var9) {
        this.f14281a = q44Var;
        this.f14282b = q44Var2;
        this.f14283c = q44Var3;
        this.f14284d = q44Var4;
        this.f14285e = q44Var5;
        this.f14286f = q44Var6;
        this.f14287g = q44Var7;
        this.f14288h = q44Var8;
        this.f14289i = q44Var9;
    }

    @Override // com.google.android.gms.internal.ads.q44
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final pe1 b() {
        m3.p1 p1VarB = ((om0) this.f14281a).b();
        do2 do2VarA = ((b11) this.f14282b).a();
        ud1 ud1Var = (ud1) this.f14283c.b();
        pd1 pd1VarA = ((ie1) this.f14284d).a();
        cf1 cf1Var = (cf1) this.f14285e.b();
        kf1 kf1Var = (kf1) this.f14286f.b();
        Executor executor = (Executor) this.f14287g.b();
        bb3 bb3Var = of0.f13186a;
        k44.b(bb3Var);
        return new pe1(p1VarB, do2VarA, ud1Var, pd1VarA, cf1Var, kf1Var, executor, bb3Var, (md1) this.f14289i.b());
    }
}
