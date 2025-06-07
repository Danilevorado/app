package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public abstract class b43 extends c83 {

    /* renamed from: m, reason: collision with root package name */
    private Object f6333m;

    /* renamed from: n, reason: collision with root package name */
    private int f6334n = 2;

    protected b43() {
    }

    protected abstract Object b();

    protected final Object c() {
        this.f6334n = 3;
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        i33.h(this.f6334n != 4);
        int i10 = this.f6334n;
        int i11 = i10 - 1;
        if (i10 == 0) {
            throw null;
        }
        if (i11 == 0) {
            return true;
        }
        if (i11 != 2) {
            this.f6334n = 4;
            this.f6333m = b();
            if (this.f6334n != 3) {
                this.f6334n = 1;
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
        this.f6334n = 2;
        Object obj = this.f6333m;
        this.f6333m = null;
        return obj;
    }
}
