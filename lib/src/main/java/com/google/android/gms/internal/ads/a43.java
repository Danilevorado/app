package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

/* loaded from: classes.dex */
abstract class a43 extends d83 {

    /* renamed from: m, reason: collision with root package name */
    private final int f5939m;

    /* renamed from: n, reason: collision with root package name */
    private int f5940n;

    protected a43(int i10, int i11) {
        i33.b(i11, i10, "index");
        this.f5939m = i10;
        this.f5940n = i11;
    }

    protected abstract Object b(int i10);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f5940n < this.f5939m;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f5940n > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f5940n;
        this.f5940n = i10 + 1;
        return b(i10);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f5940n;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f5940n - 1;
        this.f5940n = i10;
        return b(i10);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f5940n - 1;
    }
}
