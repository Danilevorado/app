package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
public final class i32 implements c44 {

    /* renamed from: a, reason: collision with root package name */
    private final q44 f9516a;

    /* renamed from: b, reason: collision with root package name */
    private final q44 f9517b;

    public i32(q44 q44Var, q44 q44Var2) {
        this.f9516a = q44Var;
        this.f9517b = q44Var2;
    }

    @Override // com.google.android.gms.internal.ads.q44
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final h32 b() {
        return new h32((Context) this.f9516a.b(), (lj1) this.f9517b.b());
    }
}
