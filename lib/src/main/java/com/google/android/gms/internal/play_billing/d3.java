package com.google.android.gms.internal.play_billing;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* loaded from: classes.dex */
final class d3 extends b0 implements RandomAccess {

    /* renamed from: p, reason: collision with root package name */
    private static final d3 f19479p = new d3(new Object[0], 0, false);

    /* renamed from: n, reason: collision with root package name */
    private Object[] f19480n;

    /* renamed from: o, reason: collision with root package name */
    private int f19481o;

    private d3(Object[] objArr, int i10, boolean z10) {
        super(z10);
        this.f19480n = objArr;
        this.f19481o = i10;
    }

    public static d3 f() {
        return f19479p;
    }

    private final String h(int i10) {
        return "Index:" + i10 + ", Size:" + this.f19481o;
    }

    private final void i(int i10) {
        if (i10 < 0 || i10 >= this.f19481o) {
            throw new IndexOutOfBoundsException(h(i10));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        int i11;
        e();
        if (i10 < 0 || i10 > (i11 = this.f19481o)) {
            throw new IndexOutOfBoundsException(h(i10));
        }
        int i12 = i10 + 1;
        Object[] objArr = this.f19480n;
        if (i11 < objArr.length) {
            System.arraycopy(objArr, i10, objArr, i12, i11 - i10);
        } else {
            Object[] objArr2 = new Object[((i11 * 3) / 2) + 1];
            System.arraycopy(objArr, 0, objArr2, 0, i10);
            System.arraycopy(this.f19480n, i10, objArr2, i12, this.f19481o - i10);
            this.f19480n = objArr2;
        }
        this.f19480n[i10] = obj;
        this.f19481o++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.play_billing.b0, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        e();
        int i10 = this.f19481o;
        Object[] objArr = this.f19480n;
        if (i10 == objArr.length) {
            this.f19480n = Arrays.copyOf(objArr, ((i10 * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f19480n;
        int i11 = this.f19481o;
        this.f19481o = i11 + 1;
        objArr2[i11] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        i(i10);
        return this.f19480n[i10];
    }

    @Override // com.google.android.gms.internal.play_billing.u1
    public final /* bridge */ /* synthetic */ u1 j(int i10) {
        if (i10 >= this.f19481o) {
            return new d3(Arrays.copyOf(this.f19480n, i10), this.f19481o, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.play_billing.b0, java.util.AbstractList, java.util.List
    public final Object remove(int i10) {
        e();
        i(i10);
        Object[] objArr = this.f19480n;
        Object obj = objArr[i10];
        if (i10 < this.f19481o - 1) {
            System.arraycopy(objArr, i10 + 1, objArr, i10, (r2 - i10) - 1);
        }
        this.f19481o--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        e();
        i(i10);
        Object[] objArr = this.f19480n;
        Object obj2 = objArr[i10];
        objArr[i10] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f19481o;
    }
}
