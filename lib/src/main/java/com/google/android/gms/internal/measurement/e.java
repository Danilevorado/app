package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
final class e implements Iterator {

    /* renamed from: m, reason: collision with root package name */
    private int f18907m = 0;

    /* renamed from: n, reason: collision with root package name */
    final /* synthetic */ f f18908n;

    e(f fVar) {
        this.f18908n = fVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f18907m < this.f18908n.n();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        if (this.f18907m < this.f18908n.n()) {
            f fVar = this.f18908n;
            int i10 = this.f18907m;
            this.f18907m = i10 + 1;
            return fVar.o(i10);
        }
        throw new NoSuchElementException("Out of bounds index: " + this.f18907m);
    }
}
