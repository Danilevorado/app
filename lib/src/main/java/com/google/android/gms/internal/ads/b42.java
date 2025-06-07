package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class b42 implements c44 {

    /* renamed from: a, reason: collision with root package name */
    private final q44 f6330a;

    /* renamed from: b, reason: collision with root package name */
    private final q44 f6331b;

    /* renamed from: c, reason: collision with root package name */
    private final q44 f6332c;

    public b42(q44 q44Var, q44 q44Var2, q44 q44Var3) {
        this.f6330a = q44Var;
        this.f6331b = q44Var2;
        this.f6332c = q44Var3;
    }

    @Override // com.google.android.gms.internal.ads.q44
    public final /* bridge */ /* synthetic */ Object b() {
        return new a42((Context) this.f6330a.b(), (Executor) this.f6331b.b(), (lj1) this.f6332c.b());
    }
}
