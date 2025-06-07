package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* loaded from: classes.dex */
final class sz3 extends hw3 implements RandomAccess {

    /* renamed from: p, reason: collision with root package name */
    private static final sz3 f15613p = new sz3(new Object[0], 0, false);

    /* renamed from: n, reason: collision with root package name */
    private Object[] f15614n;

    /* renamed from: o, reason: collision with root package name */
    private int f15615o;

    private sz3(Object[] objArr, int i10, boolean z10) {
        super(z10);
        this.f15614n = objArr;
        this.f15615o = i10;
    }

    public static sz3 f() {
        return f15613p;
    }

    private final String h(int i10) {
        return "Index:" + i10 + ", Size:" + this.f15615o;
    }

    private final void i(int i10) {
        if (i10 < 0 || i10 >= this.f15615o) {
            throw new IndexOutOfBoundsException(h(i10));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        int i11;
        e();
        if (i10 < 0 || i10 > (i11 = this.f15615o)) {
            throw new IndexOutOfBoundsException(h(i10));
        }
        Object[] objArr = this.f15614n;
        if (i11 < objArr.length) {
            System.arraycopy(objArr, i10, objArr, i10 + 1, i11 - i10);
        } else {
            Object[] objArr2 = new Object[((i11 * 3) / 2) + 1];
            System.arraycopy(objArr, 0, objArr2, 0, i10);
            System.arraycopy(this.f15614n, i10, objArr2, i10 + 1, this.f15615o - i10);
            this.f15614n = objArr2;
        }
        this.f15614n[i10] = obj;
        this.f15615o++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.ads.hw3, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        e();
        int i10 = this.f15615o;
        Object[] objArr = this.f15614n;
        if (i10 == objArr.length) {
            this.f15614n = Arrays.copyOf(objArr, ((i10 * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f15614n;
        int i11 = this.f15615o;
        this.f15615o = i11 + 1;
        objArr2[i11] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        i(i10);
        return this.f15614n[i10];
    }

    @Override // com.google.android.gms.internal.ads.ky3
    public final /* bridge */ /* synthetic */ ky3 j(int i10) {
        if (i10 >= this.f15615o) {
            return new sz3(Arrays.copyOf(this.f15614n, i10), this.f15615o, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.ads.hw3, java.util.AbstractList, java.util.List
    public final Object remove(int i10) {
        e();
        i(i10);
        Object[] objArr = this.f15614n;
        Object obj = objArr[i10];
        if (i10 < this.f15615o - 1) {
            System.arraycopy(objArr, i10 + 1, objArr, i10, (r2 - i10) - 1);
        }
        this.f15615o--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        e();
        i(i10);
        Object[] objArr = this.f15614n;
        Object obj2 = objArr[i10];
        objArr[i10] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f15615o;
    }
}
