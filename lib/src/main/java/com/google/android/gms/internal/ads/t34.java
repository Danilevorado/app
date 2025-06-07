package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class t34 extends AbstractList {

    /* renamed from: o, reason: collision with root package name */
    private static final u34 f15677o = u34.b(t34.class);

    /* renamed from: m, reason: collision with root package name */
    final List f15678m;

    /* renamed from: n, reason: collision with root package name */
    final Iterator f15679n;

    public t34(List list, Iterator it) {
        this.f15678m = list;
        this.f15679n = it;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        if (this.f15678m.size() > i10) {
            return this.f15678m.get(i10);
        }
        if (!this.f15679n.hasNext()) {
            throw new NoSuchElementException();
        }
        this.f15678m.add(this.f15679n.next());
        return get(i10);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new s34(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        u34 u34Var = f15677o;
        u34Var.a("potentially expensive size() call");
        u34Var.a("blowup running");
        while (this.f15679n.hasNext()) {
            this.f15678m.add(this.f15679n.next());
        }
        return this.f15678m.size();
    }
}
