package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
final class qb3 extends za3 {

    /* renamed from: o, reason: collision with root package name */
    private final Callable f14222o;

    /* renamed from: p, reason: collision with root package name */
    final /* synthetic */ rb3 f14223p;

    qb3(rb3 rb3Var, Callable callable) {
        this.f14223p = rb3Var;
        Objects.requireNonNull(callable);
        this.f14222o = callable;
    }

    @Override // com.google.android.gms.internal.ads.za3
    final Object a() {
        return this.f14222o.call();
    }

    @Override // com.google.android.gms.internal.ads.za3
    final String b() {
        return this.f14222o.toString();
    }

    @Override // com.google.android.gms.internal.ads.za3
    final void d(Throwable th) {
        this.f14223p.i(th);
    }

    @Override // com.google.android.gms.internal.ads.za3
    final void e(Object obj) {
        this.f14223p.h(obj);
    }

    @Override // com.google.android.gms.internal.ads.za3
    final boolean f() {
        return this.f14223p.isDone();
    }
}
