package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
final class u83 extends q83 {

    /* renamed from: a, reason: collision with root package name */
    final AtomicReferenceFieldUpdater f16228a;

    /* renamed from: b, reason: collision with root package name */
    final AtomicReferenceFieldUpdater f16229b;

    /* renamed from: c, reason: collision with root package name */
    final AtomicReferenceFieldUpdater f16230c;

    /* renamed from: d, reason: collision with root package name */
    final AtomicReferenceFieldUpdater f16231d;

    /* renamed from: e, reason: collision with root package name */
    final AtomicReferenceFieldUpdater f16232e;

    u83(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        super(null);
        this.f16228a = atomicReferenceFieldUpdater;
        this.f16229b = atomicReferenceFieldUpdater2;
        this.f16230c = atomicReferenceFieldUpdater3;
        this.f16231d = atomicReferenceFieldUpdater4;
        this.f16232e = atomicReferenceFieldUpdater5;
    }

    @Override // com.google.android.gms.internal.ads.q83
    final t83 a(b93 b93Var, t83 t83Var) {
        return (t83) this.f16231d.getAndSet(b93Var, t83Var);
    }

    @Override // com.google.android.gms.internal.ads.q83
    final a93 b(b93 b93Var, a93 a93Var) {
        return (a93) this.f16230c.getAndSet(b93Var, a93Var);
    }

    @Override // com.google.android.gms.internal.ads.q83
    final void c(a93 a93Var, a93 a93Var2) {
        this.f16229b.lazySet(a93Var, a93Var2);
    }

    @Override // com.google.android.gms.internal.ads.q83
    final void d(a93 a93Var, Thread thread) {
        this.f16228a.lazySet(a93Var, thread);
    }

    @Override // com.google.android.gms.internal.ads.q83
    final boolean e(b93 b93Var, t83 t83Var, t83 t83Var2) {
        return c93.a(this.f16231d, b93Var, t83Var, t83Var2);
    }

    @Override // com.google.android.gms.internal.ads.q83
    final boolean f(b93 b93Var, Object obj, Object obj2) {
        return c93.a(this.f16232e, b93Var, obj, obj2);
    }

    @Override // com.google.android.gms.internal.ads.q83
    final boolean g(b93 b93Var, a93 a93Var, a93 a93Var2) {
        return c93.a(this.f16230c, b93Var, a93Var, a93Var2);
    }
}
