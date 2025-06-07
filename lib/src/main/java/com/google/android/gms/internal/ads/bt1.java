package com.google.android.gms.internal.ads;

import java.util.Map;

/* loaded from: classes.dex */
public final class bt1 implements c44 {

    /* renamed from: a, reason: collision with root package name */
    private final q44 f6670a;

    /* renamed from: b, reason: collision with root package name */
    private final q44 f6671b;

    /* renamed from: c, reason: collision with root package name */
    private final q44 f6672c;

    public bt1(q44 q44Var, q44 q44Var2, q44 q44Var3) {
        this.f6670a = q44Var;
        this.f6671b = q44Var2;
        this.f6672c = q44Var3;
    }

    @Override // com.google.android.gms.internal.ads.q44
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final at1 b() {
        Map mapD = ((j44) this.f6670a).d();
        bb3 bb3Var = of0.f13186a;
        k44.b(bb3Var);
        return new at1(mapD, bb3Var, ((h41) this.f6672c).b());
    }
}
