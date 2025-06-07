package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class tz0 implements c44 {

    /* renamed from: a, reason: collision with root package name */
    private final q44 f16105a;

    /* renamed from: b, reason: collision with root package name */
    private final q44 f16106b;

    /* renamed from: c, reason: collision with root package name */
    private final q44 f16107c;

    public tz0(q44 q44Var, q44 q44Var2, q44 q44Var3) {
        this.f16105a = q44Var;
        this.f16106b = q44Var2;
        this.f16107c = q44Var3;
    }

    @Override // com.google.android.gms.internal.ads.q44
    public final /* bridge */ /* synthetic */ Object b() {
        gm1 gm1Var = (gm1) this.f16105a.b();
        bb3 bb3Var = of0.f13186a;
        k44.b(bb3Var);
        return ((Boolean) k3.w.c().b(ir.Y7)).booleanValue() ? new x81((hw1) this.f16107c.b(), bb3Var) : new x81(gm1Var, bb3Var);
    }
}
