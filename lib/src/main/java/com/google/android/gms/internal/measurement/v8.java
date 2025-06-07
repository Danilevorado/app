package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes.dex */
final class v8 extends i7 implements RandomAccess, y8, fa {

    /* renamed from: p, reason: collision with root package name */
    private static final v8 f19371p;

    /* renamed from: n, reason: collision with root package name */
    private int[] f19372n;

    /* renamed from: o, reason: collision with root package name */
    private int f19373o;

    static {
        v8 v8Var = new v8(new int[0], 0);
        f19371p = v8Var;
        v8Var.b();
    }

    private v8(int[] iArr, int i10) {
        this.f19372n = iArr;
        this.f19373o = i10;
    }

    public static v8 h() {
        return f19371p;
    }

    private final String i(int i10) {
        return "Index:" + i10 + ", Size:" + this.f19373o;
    }

    private final void k(int i10) {
        if (i10 < 0 || i10 >= this.f19373o) {
            throw new IndexOutOfBoundsException(i(i10));
        }
    }

    public final void X(int i10) {
        e();
        int i11 = this.f19373o;
        int[] iArr = this.f19372n;
        if (i11 == iArr.length) {
            int[] iArr2 = new int[((i11 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i11);
            this.f19372n = iArr2;
        }
        int[] iArr3 = this.f19372n;
        int i12 = this.f19373o;
        this.f19373o = i12 + 1;
        iArr3[i12] = i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i10, Object obj) {
        int i11;
        int iIntValue = ((Integer) obj).intValue();
        e();
        if (i10 < 0 || i10 > (i11 = this.f19373o)) {
            throw new IndexOutOfBoundsException(i(i10));
        }
        int[] iArr = this.f19372n;
        if (i11 < iArr.length) {
            System.arraycopy(iArr, i10, iArr, i10 + 1, i11 - i10);
        } else {
            int[] iArr2 = new int[((i11 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i10);
            System.arraycopy(this.f19372n, i10, iArr2, i10 + 1, this.f19373o - i10);
            this.f19372n = iArr2;
        }
        this.f19372n[i10] = iIntValue;
        this.f19373o++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.i7, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        X(((Integer) obj).intValue());
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.i7, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        e();
        b9.e(collection);
        if (!(collection instanceof v8)) {
            return super.addAll(collection);
        }
        v8 v8Var = (v8) collection;
        int i10 = v8Var.f19373o;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f19373o;
        if (Integer.MAX_VALUE - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        int[] iArr = this.f19372n;
        if (i12 > iArr.length) {
            this.f19372n = Arrays.copyOf(iArr, i12);
        }
        System.arraycopy(v8Var.f19372n, 0, this.f19372n, this.f19373o, v8Var.f19373o);
        this.f19373o = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.android.gms.internal.measurement.i7, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v8)) {
            return super.equals(obj);
        }
        v8 v8Var = (v8) obj;
        if (this.f19373o != v8Var.f19373o) {
            return false;
        }
        int[] iArr = v8Var.f19372n;
        for (int i10 = 0; i10 < this.f19373o; i10++) {
            if (this.f19372n[i10] != iArr[i10]) {
                return false;
            }
        }
        return true;
    }

    public final int f(int i10) {
        k(i10);
        return this.f19372n[i10];
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i10) {
        k(i10);
        return Integer.valueOf(this.f19372n[i10]);
    }

    @Override // com.google.android.gms.internal.measurement.i7, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f19373o; i11++) {
            i10 = (i10 * 31) + this.f19372n[i11];
        }
        return i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj).intValue();
        int i10 = this.f19373o;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f19372n[i11] == iIntValue) {
                return i11;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.measurement.i7, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        e();
        k(i10);
        int[] iArr = this.f19372n;
        int i11 = iArr[i10];
        if (i10 < this.f19373o - 1) {
            System.arraycopy(iArr, i10 + 1, iArr, i10, (r2 - i10) - 1);
        }
        this.f19373o--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i11);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i10, int i11) {
        e();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.f19372n;
        System.arraycopy(iArr, i11, iArr, i10, this.f19373o - i11);
        this.f19373o -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        int iIntValue = ((Integer) obj).intValue();
        e();
        k(i10);
        int[] iArr = this.f19372n;
        int i11 = iArr[i10];
        iArr[i10] = iIntValue;
        return Integer.valueOf(i11);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f19373o;
    }

    @Override // com.google.android.gms.internal.measurement.a9
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public final y8 j(int i10) {
        if (i10 >= this.f19373o) {
            return new v8(Arrays.copyOf(this.f19372n, i10), this.f19373o);
        }
        throw new IllegalArgumentException();
    }
}
