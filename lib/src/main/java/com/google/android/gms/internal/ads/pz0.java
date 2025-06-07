package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class pz0 implements c44 {

    /* renamed from: a, reason: collision with root package name */
    private final q44 f14108a;

    /* renamed from: b, reason: collision with root package name */
    private final q44 f14109b;

    public pz0(q44 q44Var, q44 q44Var2) {
        this.f14108a = q44Var;
        this.f14109b = q44Var2;
    }

    @Override // com.google.android.gms.internal.ads.q44
    public final /* bridge */ /* synthetic */ Object b() {
        return new x81((u51) this.f14108a.b(), (Executor) this.f14109b.b());
    }
}
