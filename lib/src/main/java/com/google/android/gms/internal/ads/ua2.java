package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
public final class ua2 implements c44 {

    /* renamed from: a, reason: collision with root package name */
    private final q44 f16251a;

    /* renamed from: b, reason: collision with root package name */
    private final q44 f16252b;

    public ua2(q44 q44Var, q44 q44Var2) {
        this.f16251a = q44Var;
        this.f16252b = q44Var2;
    }

    @Override // com.google.android.gms.internal.ads.q44
    public final /* bridge */ /* synthetic */ Object b() {
        Context contextA = ((qm0) this.f16251a).a();
        bb3 bb3Var = of0.f13186a;
        k44.b(bb3Var);
        return new ta2(contextA, bb3Var);
    }
}
