package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class a22 implements c44 {

    /* renamed from: a, reason: collision with root package name */
    private final q44 f5926a;

    /* renamed from: b, reason: collision with root package name */
    private final q44 f5927b;

    /* renamed from: c, reason: collision with root package name */
    private final q44 f5928c;

    public a22(q44 q44Var, q44 q44Var2, q44 q44Var3) {
        this.f5926a = q44Var;
        this.f5927b = q44Var2;
        this.f5928c = q44Var3;
    }

    @Override // com.google.android.gms.internal.ads.q44
    public final /* bridge */ /* synthetic */ Object b() {
        return new z12((Context) this.f5926a.b(), (yb1) this.f5927b.b(), (Executor) this.f5928c.b());
    }
}
