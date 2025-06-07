package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class lz0 implements c44 {

    /* renamed from: a, reason: collision with root package name */
    private final q44 f11874a;

    /* renamed from: b, reason: collision with root package name */
    private final q44 f11875b;

    /* renamed from: c, reason: collision with root package name */
    private final q44 f11876c;

    public lz0(q44 q44Var, q44 q44Var2, q44 q44Var3) {
        this.f11874a = q44Var;
        this.f11875b = q44Var2;
        this.f11876c = q44Var3;
    }

    @Override // com.google.android.gms.internal.ads.q44
    public final /* bridge */ /* synthetic */ Object b() {
        gm1 gm1Var = (gm1) this.f11874a.b();
        bb3 bb3Var = of0.f13186a;
        k44.b(bb3Var);
        return ((Boolean) k3.w.c().b(ir.Y7)).booleanValue() ? new x81((hw1) this.f11876c.b(), bb3Var) : new x81(gm1Var, bb3Var);
    }
}
