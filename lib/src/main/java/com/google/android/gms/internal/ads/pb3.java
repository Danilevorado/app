package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes.dex */
final class pb3 extends za3 {

    /* renamed from: o, reason: collision with root package name */
    private final v93 f13681o;

    /* renamed from: p, reason: collision with root package name */
    final /* synthetic */ rb3 f13682p;

    pb3(rb3 rb3Var, v93 v93Var) {
        this.f13682p = rb3Var;
        Objects.requireNonNull(v93Var);
        this.f13681o = v93Var;
    }

    @Override // com.google.android.gms.internal.ads.za3
    final /* bridge */ /* synthetic */ Object a() {
        ab3 ab3VarA = this.f13681o.a();
        i33.d(ab3VarA, "AsyncCallable.call returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", this.f13681o);
        return ab3VarA;
    }

    @Override // com.google.android.gms.internal.ads.za3
    final String b() {
        return this.f13681o.toString();
    }

    @Override // com.google.android.gms.internal.ads.za3
    final void d(Throwable th) {
        this.f13682p.i(th);
    }

    @Override // com.google.android.gms.internal.ads.za3
    final /* synthetic */ void e(Object obj) {
        this.f13682p.w((ab3) obj);
    }

    @Override // com.google.android.gms.internal.ads.za3
    final boolean f() {
        return this.f13682p.isDone();
    }
}
