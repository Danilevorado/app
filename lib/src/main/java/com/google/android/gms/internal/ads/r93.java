package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
final class r93 extends q93 {

    /* renamed from: a, reason: collision with root package name */
    final AtomicReferenceFieldUpdater f14700a;

    /* renamed from: b, reason: collision with root package name */
    final AtomicIntegerFieldUpdater f14701b;

    r93(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicIntegerFieldUpdater atomicIntegerFieldUpdater) {
        super(null);
        this.f14700a = atomicReferenceFieldUpdater;
        this.f14701b = atomicIntegerFieldUpdater;
    }

    @Override // com.google.android.gms.internal.ads.q93
    final int a(u93 u93Var) {
        return this.f14701b.decrementAndGet(u93Var);
    }

    @Override // com.google.android.gms.internal.ads.q93
    final void b(u93 u93Var, Set set, Set set2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = this.f14700a;
        while (!androidx.work.impl.utils.futures.b.a(atomicReferenceFieldUpdater, u93Var, null, set2) && atomicReferenceFieldUpdater.get(u93Var) == null) {
        }
    }
}
