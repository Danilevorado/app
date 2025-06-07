package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Objects;

/* loaded from: classes.dex */
abstract class a83 implements Iterator {

    /* renamed from: m, reason: collision with root package name */
    final Iterator f5990m;

    a83(Iterator it) {
        Objects.requireNonNull(it);
        this.f5990m = it;
    }

    abstract Object b(Object obj);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f5990m.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return b(this.f5990m.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f5990m.remove();
    }
}
