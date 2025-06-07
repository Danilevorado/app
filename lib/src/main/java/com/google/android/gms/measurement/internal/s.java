package com.google.android.gms.measurement.internal;

import java.util.Iterator;

/* loaded from: classes.dex */
final class s implements Iterator {

    /* renamed from: m, reason: collision with root package name */
    final Iterator f20345m;

    /* renamed from: n, reason: collision with root package name */
    final /* synthetic */ t f20346n;

    s(t tVar) {
        this.f20346n = tVar;
        this.f20345m = tVar.f20406m.keySet().iterator();
    }

    @Override // java.util.Iterator
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final String next() {
        return (String) this.f20345m.next();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f20345m.hasNext();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Remove not supported");
    }
}
