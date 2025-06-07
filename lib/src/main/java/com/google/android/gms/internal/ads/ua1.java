package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class ua1 implements c44 {

    /* renamed from: a, reason: collision with root package name */
    private final da1 f16249a;

    /* renamed from: b, reason: collision with root package name */
    private final q44 f16250b;

    public ua1(da1 da1Var, q44 q44Var) {
        this.f16249a = da1Var;
        this.f16250b = q44Var;
    }

    @Override // com.google.android.gms.internal.ads.q44
    public final /* bridge */ /* synthetic */ Object b() {
        return this.f16249a.d((Executor) this.f16250b.b());
    }
}
