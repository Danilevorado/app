package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class e32 implements c44 {

    /* renamed from: a, reason: collision with root package name */
    private final q44 f7618a;

    /* renamed from: b, reason: collision with root package name */
    private final q44 f7619b;

    /* renamed from: c, reason: collision with root package name */
    private final q44 f7620c;

    public e32(q44 q44Var, q44 q44Var2, q44 q44Var3) {
        this.f7618a = q44Var;
        this.f7619b = q44Var2;
        this.f7620c = q44Var3;
    }

    @Override // com.google.android.gms.internal.ads.q44
    public final /* bridge */ /* synthetic */ Object b() {
        return new d32((Context) this.f7618a.b(), (Executor) this.f7619b.b(), (lj1) this.f7620c.b());
    }
}
