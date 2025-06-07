package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class km1 implements c44 {

    /* renamed from: a, reason: collision with root package name */
    private final q44 f11155a;

    /* renamed from: b, reason: collision with root package name */
    private final q44 f11156b;

    /* renamed from: c, reason: collision with root package name */
    private final q44 f11157c;

    public km1(q44 q44Var, q44 q44Var2, q44 q44Var3) {
        this.f11155a = q44Var;
        this.f11156b = q44Var2;
        this.f11157c = q44Var3;
    }

    @Override // com.google.android.gms.internal.ads.q44
    public final /* bridge */ /* synthetic */ Object b() {
        im1 im1Var = (im1) this.f11155a.b();
        bb3 bb3Var = of0.f13186a;
        k44.b(bb3Var);
        return ((Boolean) k3.w.c().b(ir.Y7)).booleanValue() ? new x81((kw1) this.f11157c.b(), bb3Var) : new x81(im1Var, bb3Var);
    }
}
