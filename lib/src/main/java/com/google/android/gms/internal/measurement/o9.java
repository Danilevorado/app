package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes.dex */
final class o9 extends i7 implements RandomAccess, z8, fa {

    /* renamed from: p, reason: collision with root package name */
    private static final o9 f19174p;

    /* renamed from: n, reason: collision with root package name */
    private long[] f19175n;

    /* renamed from: o, reason: collision with root package name */
    private int f19176o;

    static {
        o9 o9Var = new o9(new long[0], 0);
        f19174p = o9Var;
        o9Var.b();
    }

    private o9(long[] jArr, int i10) {
        this.f19175n = jArr;
        this.f19176o = i10;
    }

    public static o9 f() {
        return f19174p;
    }

    private final String i(int i10) {
        return "Index:" + i10 + ", Size:" + this.f19176o;
    }

    private final void k(int i10) {
        if (i10 < 0 || i10 >= this.f19176o) {
            throw new IndexOutOfBoundsException(i(i10));
        }
    }

    @Override // com.google.android.gms.internal.measurement.a9
    /* renamed from: H, reason: merged with bridge method [inline-methods] */
    public final z8 j(int i10) {
        if (i10 >= this.f19176o) {
            return new o9(Arrays.copyOf(this.f19175n, i10), this.f19176o);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.measurement.z8
    public final long a(int i10) {
        k(i10);
        return this.f19175n[i10];
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i10, Object obj) {
        int i11;
        long jLongValue = ((Long) obj).longValue();
        e();
        if (i10 < 0 || i10 > (i11 = this.f19176o)) {
            throw new IndexOutOfBoundsException(i(i10));
        }
        long[] jArr = this.f19175n;
        if (i11 < jArr.length) {
            System.arraycopy(jArr, i10, jArr, i10 + 1, i11 - i10);
        } else {
            long[] jArr2 = new long[((i11 * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i10);
            System.arraycopy(this.f19175n, i10, jArr2, i10 + 1, this.f19176o - i10);
            this.f19175n = jArr2;
        }
        this.f19175n[i10] = jLongValue;
        this.f19176o++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.i7, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        h(((Long) obj).longValue());
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.i7, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        e();
        b9.e(collection);
        if (!(collection instanceof o9)) {
            return super.addAll(collection);
        }
        o9 o9Var = (o9) collection;
        int i10 = o9Var.f19176o;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f19176o;
        if (Integer.MAX_VALUE - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        long[] jArr = this.f19175n;
        if (i12 > jArr.length) {
            this.f19175n = Arrays.copyOf(jArr, i12);
        }
        System.arraycopy(o9Var.f19175n, 0, this.f19175n, this.f19176o, o9Var.f19176o);
        this.f19176o = i12;
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
        if (!(obj instanceof o9)) {
            return super.equals(obj);
        }
        o9 o9Var = (o9) obj;
        if (this.f19176o != o9Var.f19176o) {
            return false;
        }
        long[] jArr = o9Var.f19175n;
        for (int i10 = 0; i10 < this.f19176o; i10++) {
            if (this.f19175n[i10] != jArr[i10]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i10) {
        k(i10);
        return Long.valueOf(this.f19175n[i10]);
    }

    public final void h(long j10) {
        e();
        int i10 = this.f19176o;
        long[] jArr = this.f19175n;
        if (i10 == jArr.length) {
            long[] jArr2 = new long[((i10 * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i10);
            this.f19175n = jArr2;
        }
        long[] jArr3 = this.f19175n;
        int i11 = this.f19176o;
        this.f19176o = i11 + 1;
        jArr3[i11] = j10;
    }

    @Override // com.google.android.gms.internal.measurement.i7, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iC = 1;
        for (int i10 = 0; i10 < this.f19176o; i10++) {
            iC = (iC * 31) + b9.c(this.f19175n[i10]);
        }
        return iC;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long jLongValue = ((Long) obj).longValue();
        int i10 = this.f19176o;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f19175n[i11] == jLongValue) {
                return i11;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.measurement.i7, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        e();
        k(i10);
        long[] jArr = this.f19175n;
        long j10 = jArr[i10];
        if (i10 < this.f19176o - 1) {
            System.arraycopy(jArr, i10 + 1, jArr, i10, (r3 - i10) - 1);
        }
        this.f19176o--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j10);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i10, int i11) {
        e();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.f19175n;
        System.arraycopy(jArr, i11, jArr, i10, this.f19176o - i11);
        this.f19176o -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        long jLongValue = ((Long) obj).longValue();
        e();
        k(i10);
        long[] jArr = this.f19175n;
        long j10 = jArr[i10];
        jArr[i10] = jLongValue;
        return Long.valueOf(j10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f19176o;
    }
}
