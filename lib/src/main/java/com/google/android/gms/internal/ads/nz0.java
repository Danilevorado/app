package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class nz0 implements c44 {

    /* renamed from: a, reason: collision with root package name */
    private final q44 f12914a;

    /* renamed from: b, reason: collision with root package name */
    private final q44 f12915b;

    public nz0(q44 q44Var, q44 q44Var2) {
        this.f12914a = q44Var;
        this.f12915b = q44Var2;
    }

    @Override // com.google.android.gms.internal.ads.q44
    public final /* bridge */ /* synthetic */ Object b() {
        return new x81((u51) this.f12914a.b(), (Executor) this.f12915b.b());
    }
}
