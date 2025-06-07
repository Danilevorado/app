package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class v83 implements Runnable {

    /* renamed from: m, reason: collision with root package name */
    final b93 f16630m;

    /* renamed from: n, reason: collision with root package name */
    final ab3 f16631n;

    v83(b93 b93Var, ab3 ab3Var) {
        this.f16630m = b93Var;
        this.f16631n = ab3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f16630m.f6400m != this) {
            return;
        }
        if (b93.f6398r.f(this.f16630m, this, b93.j(this.f16631n))) {
            b93.B(this.f16630m, false);
        }
    }
}
