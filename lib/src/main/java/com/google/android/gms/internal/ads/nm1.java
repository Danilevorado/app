package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class nm1 implements c44 {

    /* renamed from: a, reason: collision with root package name */
    private final q44 f12703a;

    /* renamed from: b, reason: collision with root package name */
    private final q44 f12704b;

    /* renamed from: c, reason: collision with root package name */
    private final q44 f12705c;

    public nm1(q44 q44Var, q44 q44Var2, q44 q44Var3) {
        this.f12703a = q44Var;
        this.f12704b = q44Var2;
        this.f12705c = q44Var3;
    }

    @Override // com.google.android.gms.internal.ads.q44
    public final /* bridge */ /* synthetic */ Object b() {
        bn1 bn1Var = (bn1) this.f12703a.b();
        bb3 bb3Var = of0.f13186a;
        k44.b(bb3Var);
        return ((Boolean) k3.w.c().b(ir.Y7)).booleanValue() ? new x81((rw1) this.f12705c.b(), bb3Var) : new x81(bn1Var, bb3Var);
    }
}
