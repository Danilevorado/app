package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class kz0 implements c44 {

    /* renamed from: a, reason: collision with root package name */
    private final q44 f11272a;

    /* renamed from: b, reason: collision with root package name */
    private final q44 f11273b;

    public kz0(q44 q44Var, q44 q44Var2) {
        this.f11272a = q44Var;
        this.f11273b = q44Var2;
    }

    @Override // com.google.android.gms.internal.ads.q44
    public final /* bridge */ /* synthetic */ Object b() {
        return new x81((u51) this.f11272a.b(), (Executor) this.f11273b.b());
    }
}
