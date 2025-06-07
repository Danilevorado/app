package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
public final class za2 implements c44 {

    /* renamed from: a, reason: collision with root package name */
    private final q44 f18506a;

    /* renamed from: b, reason: collision with root package name */
    private final q44 f18507b;

    public za2(q44 q44Var, q44 q44Var2) {
        this.f18506a = q44Var;
        this.f18507b = q44Var2;
    }

    @Override // com.google.android.gms.internal.ads.q44
    public final /* bridge */ /* synthetic */ Object b() {
        Context context = (Context) this.f18506a.b();
        bb3 bb3Var = of0.f13186a;
        k44.b(bb3Var);
        return new wa2(context, bb3Var);
    }
}
