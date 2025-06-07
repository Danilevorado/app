package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class zf1 implements c44 {

    /* renamed from: a, reason: collision with root package name */
    private final rf1 f18558a;

    /* renamed from: b, reason: collision with root package name */
    private final q44 f18559b;

    /* renamed from: c, reason: collision with root package name */
    private final q44 f18560c;

    public zf1(rf1 rf1Var, q44 q44Var, q44 q44Var2) {
        this.f18558a = rf1Var;
        this.f18559b = q44Var;
        this.f18560c = q44Var2;
    }

    @Override // com.google.android.gms.internal.ads.q44
    public final /* bridge */ /* synthetic */ Object b() {
        return new x81(((cj1) this.f18559b).b(), (Executor) this.f18560c.b());
    }
}
