package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class sz0 implements c44 {

    /* renamed from: a, reason: collision with root package name */
    private final q44 f15606a;

    /* renamed from: b, reason: collision with root package name */
    private final q44 f15607b;

    /* renamed from: c, reason: collision with root package name */
    private final q44 f15608c;

    public sz0(q44 q44Var, q44 q44Var2, q44 q44Var3) {
        this.f15606a = q44Var;
        this.f15607b = q44Var2;
        this.f15608c = q44Var3;
    }

    @Override // com.google.android.gms.internal.ads.q44
    public final /* bridge */ /* synthetic */ Object b() {
        gm1 gm1Var = (gm1) this.f15606a.b();
        bb3 bb3Var = of0.f13186a;
        k44.b(bb3Var);
        return ((Boolean) k3.w.c().b(ir.Y7)).booleanValue() ? new x81((hw1) this.f15608c.b(), bb3Var) : new x81(gm1Var, bb3Var);
    }
}
