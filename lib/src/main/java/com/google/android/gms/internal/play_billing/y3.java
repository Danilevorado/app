package com.google.android.gms.internal.play_billing;

import java.util.ListIterator;

/* loaded from: classes.dex */
final class y3 implements ListIterator {

    /* renamed from: m, reason: collision with root package name */
    final ListIterator f19709m;

    /* renamed from: n, reason: collision with root package name */
    final /* synthetic */ int f19710n;

    /* renamed from: o, reason: collision with root package name */
    final /* synthetic */ a4 f19711o;

    y3(a4 a4Var, int i10) {
        this.f19710n = i10;
        this.f19711o = a4Var;
        this.f19709m = a4Var.f19458m.listIterator(i10);
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f19709m.hasNext();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f19709m.hasPrevious();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return (String) this.f19709m.next();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f19709m.nextIndex();
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ Object previous() {
        return (String) this.f19709m.previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f19709m.previousIndex();
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
