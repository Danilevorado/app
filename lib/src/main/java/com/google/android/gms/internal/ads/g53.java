package com.google.android.gms.internal.ads;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
abstract class g53 implements Iterator {

    /* renamed from: m, reason: collision with root package name */
    int f8611m;

    /* renamed from: n, reason: collision with root package name */
    int f8612n;

    /* renamed from: o, reason: collision with root package name */
    int f8613o = -1;

    /* renamed from: p, reason: collision with root package name */
    final /* synthetic */ k53 f8614p;

    /* synthetic */ g53(k53 k53Var, f53 f53Var) {
        this.f8614p = k53Var;
        this.f8611m = k53Var.f10828q;
        this.f8612n = k53Var.e();
    }

    private final void c() {
        if (this.f8614p.f10828q != this.f8611m) {
            throw new ConcurrentModificationException();
        }
    }

    abstract Object b(int i10);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f8612n >= 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        c();
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f8612n;
        this.f8613o = i10;
        Object objB = b(i10);
        this.f8612n = this.f8614p.f(this.f8612n);
        return objB;
    }

    @Override // java.util.Iterator
    public final void remove() {
        c();
        i33.i(this.f8613o >= 0, "no calls to next() since the last call to remove()");
        this.f8611m += 32;
        k53 k53Var = this.f8614p;
        int i10 = this.f8613o;
        Object[] objArr = k53Var.f10826o;
        objArr.getClass();
        k53Var.remove(objArr[i10]);
        this.f8612n--;
        this.f8613o = -1;
    }
}
