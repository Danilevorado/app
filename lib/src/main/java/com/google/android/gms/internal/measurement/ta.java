package com.google.android.gms.internal.measurement;

import java.util.Iterator;

/* loaded from: classes.dex */
final class ta implements Iterator {

    /* renamed from: m, reason: collision with root package name */
    final Iterator f19319m;

    /* renamed from: n, reason: collision with root package name */
    final /* synthetic */ ua f19320n;

    ta(ua uaVar) {
        this.f19320n = uaVar;
        this.f19319m = uaVar.f19358m.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f19319m.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return (String) this.f19319m.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
