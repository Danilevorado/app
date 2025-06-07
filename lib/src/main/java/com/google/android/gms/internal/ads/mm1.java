package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class mm1 implements c44 {

    /* renamed from: a, reason: collision with root package name */
    private final q44 f12198a;

    /* renamed from: b, reason: collision with root package name */
    private final q44 f12199b;

    /* renamed from: c, reason: collision with root package name */
    private final q44 f12200c;

    public mm1(q44 q44Var, q44 q44Var2, q44 q44Var3) {
        this.f12198a = q44Var;
        this.f12199b = q44Var2;
        this.f12200c = q44Var3;
    }

    @Override // com.google.android.gms.internal.ads.q44
    public final /* bridge */ /* synthetic */ Object b() {
        im1 im1Var = (im1) this.f12198a.b();
        bb3 bb3Var = of0.f13186a;
        k44.b(bb3Var);
        return ((Boolean) k3.w.c().b(ir.Y7)).booleanValue() ? new x81((kw1) this.f12200c.b(), bb3Var) : new x81(im1Var, bb3Var);
    }
}
