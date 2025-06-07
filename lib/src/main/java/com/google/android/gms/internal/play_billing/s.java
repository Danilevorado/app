package com.google.android.gms.internal.play_billing;

import java.util.Iterator;

/* loaded from: classes.dex */
final class s extends n {

    /* renamed from: o, reason: collision with root package name */
    private final transient m f19635o;

    /* renamed from: p, reason: collision with root package name */
    private final transient j f19636p;

    s(m mVar, j jVar) {
        this.f19635o = mVar;
        this.f19636p = jVar;
    }

    @Override // com.google.android.gms.internal.play_billing.g, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f19635o.get(obj) != null;
    }

    @Override // com.google.android.gms.internal.play_billing.g
    final int e(Object[] objArr, int i10) {
        return this.f19636p.e(objArr, 0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return this.f19636p.listIterator(0);
    }

    @Override // com.google.android.gms.internal.play_billing.n, com.google.android.gms.internal.play_billing.g
    public final j k() {
        return this.f19636p;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f19635o.size();
    }
}
