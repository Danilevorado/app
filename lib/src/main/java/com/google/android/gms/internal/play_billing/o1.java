package com.google.android.gms.internal.play_billing;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.RandomAccess;

/* loaded from: classes.dex */
final class o1 extends b0 implements RandomAccess, s1, b3 {

    /* renamed from: p, reason: collision with root package name */
    private static final o1 f19610p = new o1(new int[0], 0, false);

    /* renamed from: n, reason: collision with root package name */
    private int[] f19611n;

    /* renamed from: o, reason: collision with root package name */
    private int f19612o;

    private o1(int[] iArr, int i10, boolean z10) {
        super(z10);
        this.f19611n = iArr;
        this.f19612o = i10;
    }

    public static o1 h() {
        return f19610p;
    }

    private final String k(int i10) {
        return "Index:" + i10 + ", Size:" + this.f19612o;
    }

    private final void l(int i10) {
        if (i10 < 0 || i10 >= this.f19612o) {
            throw new IndexOutOfBoundsException(k(i10));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i10, Object obj) {
        int i11;
        int iIntValue = ((Integer) obj).intValue();
        e();
        if (i10 < 0 || i10 > (i11 = this.f19612o)) {
            throw new IndexOutOfBoundsException(k(i10));
        }
        int i12 = i10 + 1;
        int[] iArr = this.f19611n;
        if (i11 < iArr.length) {
            System.arraycopy(iArr, i10, iArr, i12, i11 - i10);
        } else {
            int[] iArr2 = new int[((i11 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i10);
            System.arraycopy(this.f19611n, i10, iArr2, i12, this.f19612o - i10);
            this.f19611n = iArr2;
        }
        this.f19611n[i10] = iIntValue;
        this.f19612o++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.play_billing.b0, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        i(((Integer) obj).intValue());
        return true;
    }

    @Override // com.google.android.gms.internal.play_billing.b0, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        e();
        byte[] bArr = v1.f19661d;
        Objects.requireNonNull(collection);
        if (!(collection instanceof o1)) {
            return super.addAll(collection);
        }
        o1 o1Var = (o1) collection;
        int i10 = o1Var.f19612o;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f19612o;
        if (Integer.MAX_VALUE - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        int[] iArr = this.f19611n;
        if (i12 > iArr.length) {
            this.f19611n = Arrays.copyOf(iArr, i12);
        }
        System.arraycopy(o1Var.f19611n, 0, this.f19611n, this.f19612o, o1Var.f19612o);
        this.f19612o = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.android.gms.internal.play_billing.b0, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o1)) {
            return super.equals(obj);
        }
        o1 o1Var = (o1) obj;
        if (this.f19612o != o1Var.f19612o) {
            return false;
        }
        int[] iArr = o1Var.f19611n;
        for (int i10 = 0; i10 < this.f19612o; i10++) {
            if (this.f19611n[i10] != iArr[i10]) {
                return false;
            }
        }
        return true;
    }

    public final int f(int i10) {
        l(i10);
        return this.f19611n[i10];
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i10) {
        l(i10);
        return Integer.valueOf(this.f19611n[i10]);
    }

    @Override // com.google.android.gms.internal.play_billing.b0, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f19612o; i11++) {
            i10 = (i10 * 31) + this.f19611n[i11];
        }
        return i10;
    }

    public final void i(int i10) {
        e();
        int i11 = this.f19612o;
        int[] iArr = this.f19611n;
        if (i11 == iArr.length) {
            int[] iArr2 = new int[((i11 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i11);
            this.f19611n = iArr2;
        }
        int[] iArr3 = this.f19611n;
        int i12 = this.f19612o;
        this.f19612o = i12 + 1;
        iArr3[i12] = i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj).intValue();
        int i10 = this.f19612o;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f19611n[i11] == iIntValue) {
                return i11;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.play_billing.u1
    public final /* bridge */ /* synthetic */ u1 j(int i10) {
        if (i10 >= this.f19612o) {
            return new o1(Arrays.copyOf(this.f19611n, i10), this.f19612o, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.play_billing.b0, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        e();
        l(i10);
        int[] iArr = this.f19611n;
        int i11 = iArr[i10];
        if (i10 < this.f19612o - 1) {
            System.arraycopy(iArr, i10 + 1, iArr, i10, (r2 - i10) - 1);
        }
        this.f19612o--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i11);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i10, int i11) {
        e();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.f19611n;
        System.arraycopy(iArr, i11, iArr, i10, this.f19612o - i11);
        this.f19612o -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        int iIntValue = ((Integer) obj).intValue();
        e();
        l(i10);
        int[] iArr = this.f19611n;
        int i11 = iArr[i10];
        iArr[i10] = iIntValue;
        return Integer.valueOf(i11);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f19612o;
    }
}
