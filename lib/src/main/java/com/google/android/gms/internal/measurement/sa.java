package com.google.android.gms.internal.measurement;

import java.util.ListIterator;

/* loaded from: classes.dex */
final class sa implements ListIterator {

    /* renamed from: m, reason: collision with root package name */
    final ListIterator f19281m;

    /* renamed from: n, reason: collision with root package name */
    final /* synthetic */ int f19282n;

    /* renamed from: o, reason: collision with root package name */
    final /* synthetic */ ua f19283o;

    sa(ua uaVar, int i10) {
        this.f19283o = uaVar;
        this.f19282n = i10;
        this.f19281m = uaVar.f19358m.listIterator(i10);
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f19281m.hasNext();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f19281m.hasPrevious();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return (String) this.f19281m.next();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f19281m.nextIndex();
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ Object previous() {
        return (String) this.f19281m.previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f19281m.previousIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
