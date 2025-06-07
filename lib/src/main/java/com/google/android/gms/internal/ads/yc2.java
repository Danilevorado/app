package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
public final class yc2 implements c44 {

    /* renamed from: a, reason: collision with root package name */
    private final q44 f17965a;

    /* renamed from: b, reason: collision with root package name */
    private final q44 f17966b;

    /* renamed from: c, reason: collision with root package name */
    private final q44 f17967c;

    public yc2(q44 q44Var, q44 q44Var2, q44 q44Var3) {
        this.f17965a = q44Var;
        this.f17966b = q44Var2;
        this.f17967c = q44Var3;
    }

    @Override // com.google.android.gms.internal.ads.q44
    public final /* bridge */ /* synthetic */ Object b() {
        Context contextA = ((qm0) this.f17965a).a();
        bb3 bb3Var = of0.f13186a;
        k44.b(bb3Var);
        return new wc2(contextA, bb3Var, ((b11) this.f17967c).a());
    }
}
