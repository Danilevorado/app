package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* loaded from: classes.dex */
final class ha extends i7 implements RandomAccess {

    /* renamed from: p, reason: collision with root package name */
    private static final ha f18974p;

    /* renamed from: n, reason: collision with root package name */
    private Object[] f18975n;

    /* renamed from: o, reason: collision with root package name */
    private int f18976o;

    static {
        ha haVar = new ha(new Object[0], 0);
        f18974p = haVar;
        haVar.b();
    }

    private ha(Object[] objArr, int i10) {
        this.f18975n = objArr;
        this.f18976o = i10;
    }

    public static ha f() {
        return f18974p;
    }

    private final String h(int i10) {
        return "Index:" + i10 + ", Size:" + this.f18976o;
    }

    private final void i(int i10) {
        if (i10 < 0 || i10 >= this.f18976o) {
            throw new IndexOutOfBoundsException(h(i10));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        int i11;
        e();
        if (i10 < 0 || i10 > (i11 = this.f18976o)) {
            throw new IndexOutOfBoundsException(h(i10));
        }
        Object[] objArr = this.f18975n;
        if (i11 < objArr.length) {
            System.arraycopy(objArr, i10, objArr, i10 + 1, i11 - i10);
        } else {
            Object[] objArr2 = new Object[((i11 * 3) / 2) + 1];
            System.arraycopy(objArr, 0, objArr2, 0, i10);
            System.arraycopy(this.f18975n, i10, objArr2, i10 + 1, this.f18976o - i10);
            this.f18975n = objArr2;
        }
        this.f18975n[i10] = obj;
        this.f18976o++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.i7, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        e();
        int i10 = this.f18976o;
        Object[] objArr = this.f18975n;
        if (i10 == objArr.length) {
            this.f18975n = Arrays.copyOf(objArr, ((i10 * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f18975n;
        int i11 = this.f18976o;
        this.f18976o = i11 + 1;
        objArr2[i11] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        i(i10);
        return this.f18975n[i10];
    }

    @Override // com.google.android.gms.internal.measurement.a9
    public final /* bridge */ /* synthetic */ a9 j(int i10) {
        if (i10 >= this.f18976o) {
            return new ha(Arrays.copyOf(this.f18975n, i10), this.f18976o);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.measurement.i7, java.util.AbstractList, java.util.List
    public final Object remove(int i10) {
        e();
        i(i10);
        Object[] objArr = this.f18975n;
        Object obj = objArr[i10];
        if (i10 < this.f18976o - 1) {
            System.arraycopy(objArr, i10 + 1, objArr, i10, (r2 - i10) - 1);
        }
        this.f18976o--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        e();
        i(i10);
        Object[] objArr = this.f18975n;
        Object obj2 = objArr[i10];
        objArr[i10] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f18976o;
    }
}
