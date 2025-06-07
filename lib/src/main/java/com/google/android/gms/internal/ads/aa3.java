package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
final class aa3 extends ba3 {

    /* renamed from: q, reason: collision with root package name */
    private final Callable f6022q;

    /* renamed from: r, reason: collision with root package name */
    final /* synthetic */ ca3 f6023r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    aa3(ca3 ca3Var, Callable callable, Executor executor) {
        super(ca3Var, executor);
        this.f6023r = ca3Var;
        Objects.requireNonNull(callable);
        this.f6022q = callable;
    }

    @Override // com.google.android.gms.internal.ads.za3
    final Object a() {
        return this.f6022q.call();
    }

    @Override // com.google.android.gms.internal.ads.za3
    final String b() {
        return this.f6022q.toString();
    }

    @Override // com.google.android.gms.internal.ads.ba3
    final void h(Object obj) {
        this.f6023r.h(obj);
    }
}
