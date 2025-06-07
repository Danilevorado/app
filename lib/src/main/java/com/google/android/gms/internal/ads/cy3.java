package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.RandomAccess;

/* loaded from: classes.dex */
final class cy3 extends hw3 implements RandomAccess, gy3, qz3 {

    /* renamed from: p, reason: collision with root package name */
    private static final cy3 f7122p = new cy3(new int[0], 0, false);

    /* renamed from: n, reason: collision with root package name */
    private int[] f7123n;

    /* renamed from: o, reason: collision with root package name */
    private int f7124o;

    private cy3(int[] iArr, int i10, boolean z10) {
        super(z10);
        this.f7123n = iArr;
        this.f7124o = i10;
    }

    public static cy3 h() {
        return f7122p;
    }

    private final String i(int i10) {
        return "Index:" + i10 + ", Size:" + this.f7124o;
    }

    private final void k(int i10) {
        if (i10 < 0 || i10 >= this.f7124o) {
            throw new IndexOutOfBoundsException(i(i10));
        }
    }

    @Override // com.google.android.gms.internal.ads.gy3
    public final void X(int i10) {
        e();
        int i11 = this.f7124o;
        int[] iArr = this.f7123n;
        if (i11 == iArr.length) {
            int[] iArr2 = new int[((i11 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i11);
            this.f7123n = iArr2;
        }
        int[] iArr3 = this.f7123n;
        int i12 = this.f7124o;
        this.f7124o = i12 + 1;
        iArr3[i12] = i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i10, Object obj) {
        int i11;
        int iIntValue = ((Integer) obj).intValue();
        e();
        if (i10 < 0 || i10 > (i11 = this.f7124o)) {
            throw new IndexOutOfBoundsException(i(i10));
        }
        int[] iArr = this.f7123n;
        if (i11 < iArr.length) {
            System.arraycopy(iArr, i10, iArr, i10 + 1, i11 - i10);
        } else {
            int[] iArr2 = new int[((i11 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i10);
            System.arraycopy(this.f7123n, i10, iArr2, i10 + 1, this.f7124o - i10);
            this.f7123n = iArr2;
        }
        this.f7123n[i10] = iIntValue;
        this.f7124o++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.ads.hw3, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        X(((Integer) obj).intValue());
        return true;
    }

    @Override // com.google.android.gms.internal.ads.hw3, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        e();
        byte[] bArr = ly3.f11871d;
        Objects.requireNonNull(collection);
        if (!(collection instanceof cy3)) {
            return super.addAll(collection);
        }
        cy3 cy3Var = (cy3) collection;
        int i10 = cy3Var.f7124o;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f7124o;
        if (Integer.MAX_VALUE - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        int[] iArr = this.f7123n;
        if (i12 > iArr.length) {
            this.f7123n = Arrays.copyOf(iArr, i12);
        }
        System.arraycopy(cy3Var.f7123n, 0, this.f7123n, this.f7124o, cy3Var.f7124o);
        this.f7124o = i12;
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
        if (!(obj instanceof cy3)) {
            return super.equals(obj);
        }
        cy3 cy3Var = (cy3) obj;
        if (this.f7124o != cy3Var.f7124o) {
            return false;
        }
        int[] iArr = cy3Var.f7123n;
        for (int i10 = 0; i10 < this.f7124o; i10++) {
            if (this.f7123n[i10] != iArr[i10]) {
                return false;
            }
        }
        return true;
    }

    public final int f(int i10) {
        k(i10);
        return this.f7123n[i10];
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i10) {
        k(i10);
        return Integer.valueOf(this.f7123n[i10]);
    }

    @Override // com.google.android.gms.internal.ads.hw3, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f7124o; i11++) {
            i10 = (i10 * 31) + this.f7123n[i11];
        }
        return i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj).intValue();
        int i10 = this.f7124o;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f7123n[i11] == iIntValue) {
                return i11;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.hw3, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        e();
        k(i10);
        int[] iArr = this.f7123n;
        int i11 = iArr[i10];
        if (i10 < this.f7124o - 1) {
            System.arraycopy(iArr, i10 + 1, iArr, i10, (r2 - i10) - 1);
        }
        this.f7124o--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i11);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i10, int i11) {
        e();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.f7123n;
        System.arraycopy(iArr, i11, iArr, i10, this.f7124o - i11);
        this.f7124o -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        int iIntValue = ((Integer) obj).intValue();
        e();
        k(i10);
        int[] iArr = this.f7123n;
        int i11 = iArr[i10];
        iArr[i10] = iIntValue;
        return Integer.valueOf(i11);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f7124o;
    }

    @Override // com.google.android.gms.internal.ads.ky3
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public final gy3 j(int i10) {
        if (i10 >= this.f7124o) {
            return new cy3(Arrays.copyOf(this.f7123n, i10), this.f7124o, true);
        }
        throw new IllegalArgumentException();
    }
}
