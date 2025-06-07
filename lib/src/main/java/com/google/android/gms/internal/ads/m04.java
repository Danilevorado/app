package com.google.android.gms.internal.ads;

import java.util.ListIterator;

/* loaded from: classes.dex */
final class m04 implements ListIterator {

    /* renamed from: m, reason: collision with root package name */
    final ListIterator f11895m;

    /* renamed from: n, reason: collision with root package name */
    final /* synthetic */ int f11896n;

    /* renamed from: o, reason: collision with root package name */
    final /* synthetic */ o04 f11897o;

    m04(o04 o04Var, int i10) {
        this.f11897o = o04Var;
        this.f11896n = i10;
        this.f11895m = o04Var.f12951m.listIterator(i10);
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f11895m.hasNext();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f11895m.hasPrevious();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return (String) this.f11895m.next();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f11895m.nextIndex();
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ Object previous() {
        return (String) this.f11895m.previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f11895m.previousIndex();
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
