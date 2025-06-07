package com.google.android.gms.internal.play_billing;

import java.util.NoSuchElementException;

/* loaded from: classes.dex */
abstract class d extends x {

    /* renamed from: m, reason: collision with root package name */
    private final int f19470m;

    /* renamed from: n, reason: collision with root package name */
    private int f19471n;

    protected d(int i10, int i11) {
        b.b(i11, i10, "index");
        this.f19470m = i10;
        this.f19471n = i11;
    }

    protected abstract Object b(int i10);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f19471n < this.f19470m;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f19471n > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f19471n;
        this.f19471n = i10 + 1;
        return b(i10);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f19471n;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f19471n - 1;
        this.f19471n = i10;
        return b(i10);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f19471n - 1;
    }
}
