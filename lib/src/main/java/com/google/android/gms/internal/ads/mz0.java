package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class mz0 implements c44 {

    /* renamed from: a, reason: collision with root package name */
    private final q44 f12314a;

    /* renamed from: b, reason: collision with root package name */
    private final q44 f12315b;

    public mz0(q44 q44Var, q44 q44Var2) {
        this.f12314a = q44Var;
        this.f12315b = q44Var2;
    }

    @Override // com.google.android.gms.internal.ads.q44
    public final /* bridge */ /* synthetic */ Object b() {
        return new x81((u51) this.f12314a.b(), (Executor) this.f12315b.b());
    }
}
