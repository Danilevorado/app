package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.AbstractSequentialList;
import java.util.List;
import java.util.ListIterator;

/* loaded from: classes.dex */
final class p63 extends AbstractSequentialList implements Serializable {

    /* renamed from: m, reason: collision with root package name */
    final List f13601m;

    /* renamed from: n, reason: collision with root package name */
    final w23 f13602n;

    p63(List list, w23 w23Var) {
        this.f13601m = list;
        this.f13602n = w23Var;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.f13601m.clear();
    }

    @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i10) {
        return new o63(this, this.f13601m.listIterator(i10));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f13601m.size();
    }
}
