package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class pa3 {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f13669a;

    /* renamed from: b, reason: collision with root package name */
    private final c63 f13670b;

    /* synthetic */ pa3(boolean z10, c63 c63Var, oa3 oa3Var) {
        this.f13669a = z10;
        this.f13670b = c63Var;
    }

    public final ab3 a(Callable callable, Executor executor) {
        return new ca3(this.f13670b, this.f13669a, executor, callable);
    }
}
