package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
public final class uu2 implements c44 {

    /* renamed from: a, reason: collision with root package name */
    private final q44 f16473a;

    /* renamed from: b, reason: collision with root package name */
    private final q44 f16474b;

    /* renamed from: c, reason: collision with root package name */
    private final q44 f16475c;

    /* renamed from: d, reason: collision with root package name */
    private final q44 f16476d;

    public uu2(q44 q44Var, q44 q44Var2, q44 q44Var3, q44 q44Var4) {
        this.f16473a = q44Var;
        this.f16474b = q44Var2;
        this.f16475c = q44Var3;
        this.f16476d = q44Var4;
    }

    @Override // com.google.android.gms.internal.ads.q44
    public final /* bridge */ /* synthetic */ Object b() {
        Context contextA = ((qm0) this.f16473a).a();
        bb3 bb3Var = of0.f13186a;
        k44.b(bb3Var);
        return new tu2(contextA, bb3Var, (ef0) this.f16475c.b(), (cu2) this.f16476d.b());
    }
}
