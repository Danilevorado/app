package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* loaded from: classes.dex */
final class n04 implements Iterator {

    /* renamed from: m, reason: collision with root package name */
    final Iterator f12350m;

    /* renamed from: n, reason: collision with root package name */
    final /* synthetic */ o04 f12351n;

    n04(o04 o04Var) {
        this.f12351n = o04Var;
        this.f12350m = o04Var.f12951m.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f12350m.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return (String) this.f12350m.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
