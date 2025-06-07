package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
final class s34 implements Iterator {

    /* renamed from: m, reason: collision with root package name */
    int f15078m = 0;

    /* renamed from: n, reason: collision with root package name */
    final /* synthetic */ t34 f15079n;

    s34(t34 t34Var) {
        this.f15079n = t34Var;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f15078m < this.f15079n.f15678m.size() || this.f15079n.f15679n.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f15078m >= this.f15079n.f15678m.size()) {
            t34 t34Var = this.f15079n;
            t34Var.f15678m.add(t34Var.f15679n.next());
            return next();
        }
        List list = this.f15079n.f15678m;
        int i10 = this.f15078m;
        this.f15078m = i10 + 1;
        return list.get(i10);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
