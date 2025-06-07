package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
abstract class m23 implements Iterator {

    /* renamed from: m, reason: collision with root package name */
    private Object f11914m;

    /* renamed from: n, reason: collision with root package name */
    private int f11915n = 2;

    protected m23() {
    }

    protected abstract Object b();

    protected final Object c() {
        this.f11915n = 3;
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        i33.h(this.f11915n != 4);
        int i10 = this.f11915n;
        int i11 = i10 - 1;
        if (i10 == 0) {
            throw null;
        }
        if (i11 == 0) {
            return true;
        }
        if (i11 != 2) {
            this.f11915n = 4;
            this.f11914m = b();
            if (this.f11915n != 3) {
                this.f11915n = 1;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f11915n = 2;
        Object obj = this.f11914m;
        this.f11914m = null;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
