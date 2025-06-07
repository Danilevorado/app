package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
public final class yf2 implements c44 {

    /* renamed from: a, reason: collision with root package name */
    private final q44 f18023a;

    /* renamed from: b, reason: collision with root package name */
    private final q44 f18024b;

    /* renamed from: c, reason: collision with root package name */
    private final q44 f18025c;

    /* renamed from: d, reason: collision with root package name */
    private final q44 f18026d;

    public yf2(q44 q44Var, q44 q44Var2, q44 q44Var3, q44 q44Var4) {
        this.f18023a = q44Var;
        this.f18024b = q44Var2;
        this.f18025c = q44Var3;
        this.f18026d = q44Var4;
    }

    @Override // com.google.android.gms.internal.ads.q44
    public final /* bridge */ /* synthetic */ Object b() {
        Context contextA = ((qm0) this.f18024b).a();
        String strA = ((ih2) this.f18025c).a();
        bb3 bb3Var = of0.f13186a;
        k44.b(bb3Var);
        return new wf2(null, contextA, strA, bb3Var);
    }
}
