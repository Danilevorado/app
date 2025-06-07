package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.RandomAccess;

/* loaded from: classes.dex */
final class zy3 extends hw3 implements RandomAccess, jy3, qz3 {

    /* renamed from: p, reason: collision with root package name */
    private static final zy3 f18809p = new zy3(new long[0], 0, false);

    /* renamed from: n, reason: collision with root package name */
    private long[] f18810n;

    /* renamed from: o, reason: collision with root package name */
    private int f18811o;

    private zy3(long[] jArr, int i10, boolean z10) {
        super(z10);
        this.f18810n = jArr;
        this.f18811o = i10;
    }

    public static zy3 h() {
        return f18809p;
    }

    private final String k(int i10) {
        return "Index:" + i10 + ", Size:" + this.f18811o;
    }

    private final void l(int i10) {
        if (i10 < 0 || i10 >= this.f18811o) {
            throw new IndexOutOfBoundsException(k(i10));
        }
    }

    @Override // com.google.android.gms.internal.ads.ky3
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final jy3 j(int i10) {
        if (i10 >= this.f18811o) {
            return new zy3(Arrays.copyOf(this.f18810n, i10), this.f18811o, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i10, Object obj) {
        int i11;
        long jLongValue = ((Long) obj).longValue();
        e();
        if (i10 < 0 || i10 > (i11 = this.f18811o)) {
            throw new IndexOutOfBoundsException(k(i10));
        }
        long[] jArr = this.f18810n;
        if (i11 < jArr.length) {
            System.arraycopy(jArr, i10, jArr, i10 + 1, i11 - i10);
        } else {
            long[] jArr2 = new long[((i11 * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i10);
            System.arraycopy(this.f18810n, i10, jArr2, i10 + 1, this.f18811o - i10);
            this.f18810n = jArr2;
        }
        this.f18810n[i10] = jLongValue;
        this.f18811o++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.ads.hw3, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        i(((Long) obj).longValue());
        return true;
    }

    @Override // com.google.android.gms.internal.ads.hw3, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        e();
        byte[] bArr = ly3.f11871d;
        Objects.requireNonNull(collection);
        if (!(collection instanceof zy3)) {
            return super.addAll(collection);
        }
        zy3 zy3Var = (zy3) collection;
        int i10 = zy3Var.f18811o;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f18811o;
        if (Integer.MAX_VALUE - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        long[] jArr = this.f18810n;
        if (i12 > jArr.length) {
            this.f18810n = Arrays.copyOf(jArr, i12);
        }
        System.arraycopy(zy3Var.f18810n, 0, this.f18810n, this.f18811o, zy3Var.f18811o);
        this.f18811o = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.android.gms.internal.ads.hw3, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zy3)) {
            return super.equals(obj);
        }
        zy3 zy3Var = (zy3) obj;
        if (this.f18811o != zy3Var.f18811o) {
            return false;
        }
        long[] jArr = zy3Var.f18810n;
        for (int i10 = 0; i10 < this.f18811o; i10++) {
            if (this.f18810n[i10] != jArr[i10]) {
                return false;
            }
        }
        return true;
    }

    public final long f(int i10) {
        l(i10);
        return this.f18810n[i10];
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i10) {
        l(i10);
        return Long.valueOf(this.f18810n[i10]);
    }

    @Override // com.google.android.gms.internal.ads.hw3, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f18811o; i11++) {
            long j10 = this.f18810n[i11];
            byte[] bArr = ly3.f11871d;
            i10 = (i10 * 31) + ((int) (j10 ^ (j10 >>> 32)));
        }
        return i10;
    }

    public final void i(long j10) {
        e();
        int i10 = this.f18811o;
        long[] jArr = this.f18810n;
        if (i10 == jArr.length) {
            long[] jArr2 = new long[((i10 * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i10);
            this.f18810n = jArr2;
        }
        long[] jArr3 = this.f18810n;
        int i11 = this.f18811o;
        this.f18811o = i11 + 1;
        jArr3[i11] = j10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long jLongValue = ((Long) obj).longValue();
        int i10 = this.f18811o;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f18810n[i11] == jLongValue) {
                return i11;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.hw3, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        e();
        l(i10);
        long[] jArr = this.f18810n;
        long j10 = jArr[i10];
        if (i10 < this.f18811o - 1) {
            System.arraycopy(jArr, i10 + 1, jArr, i10, (r3 - i10) - 1);
        }
        this.f18811o--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j10);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i10, int i11) {
        e();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.f18810n;
        System.arraycopy(jArr, i11, jArr, i10, this.f18811o - i11);
        this.f18811o -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        long jLongValue = ((Long) obj).longValue();
        e();
        l(i10);
        long[] jArr = this.f18810n;
        long j10 = jArr[i10];
        jArr[i10] = jLongValue;
        return Long.valueOf(j10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f18811o;
    }
}
