package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class f9 extends i7 implements RandomAccess, g9 {

    /* renamed from: o, reason: collision with root package name */
    private static final f9 f18946o;

    /* renamed from: p, reason: collision with root package name */
    public static final g9 f18947p;

    /* renamed from: n, reason: collision with root package name */
    private final List f18948n;

    static {
        f9 f9Var = new f9(10);
        f18946o = f9Var;
        f9Var.b();
        f18947p = f9Var;
    }

    public f9(int i10) {
        this.f18948n = new ArrayList(i10);
    }

    private f9(ArrayList arrayList) {
        this.f18948n = arrayList;
    }

    private static String h(Object obj) {
        return obj instanceof String ? (String) obj : obj instanceof x7 ? ((x7) obj).v(b9.f18840b) : b9.h((byte[]) obj);
    }

    @Override // com.google.android.gms.internal.measurement.g9
    public final Object C(int i10) {
        return this.f18948n.get(i10);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i10, Object obj) {
        e();
        this.f18948n.add(i10, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.i7, java.util.AbstractList, java.util.List
    public final boolean addAll(int i10, Collection collection) {
        e();
        if (collection instanceof g9) {
            collection = ((g9) collection).g();
        }
        boolean zAddAll = this.f18948n.addAll(i10, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }

    @Override // com.google.android.gms.internal.measurement.i7, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }

    @Override // com.google.android.gms.internal.measurement.g9
    public final g9 c() {
        return d() ? new ua(this) : this;
    }

    @Override // com.google.android.gms.internal.measurement.i7, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        e();
        this.f18948n.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final String get(int i10) {
        Object obj = this.f18948n.get(i10);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof x7) {
            x7 x7Var = (x7) obj;
            String strV = x7Var.v(b9.f18840b);
            if (x7Var.p()) {
                this.f18948n.set(i10, strV);
            }
            return strV;
        }
        byte[] bArr = (byte[]) obj;
        String strH = b9.h(bArr);
        if (b9.i(bArr)) {
            this.f18948n.set(i10, strH);
        }
        return strH;
    }

    @Override // com.google.android.gms.internal.measurement.g9
    public final List g() {
        return Collections.unmodifiableList(this.f18948n);
    }

    @Override // com.google.android.gms.internal.measurement.a9
    public final /* bridge */ /* synthetic */ a9 j(int i10) {
        if (i10 < size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(i10);
        arrayList.addAll(this.f18948n);
        return new f9(arrayList);
    }

    @Override // com.google.android.gms.internal.measurement.g9
    public final void r(x7 x7Var) {
        e();
        this.f18948n.add(x7Var);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.i7, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        e();
        Object objRemove = this.f18948n.remove(i10);
        ((AbstractList) this).modCount++;
        return h(objRemove);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        e();
        return h(this.f18948n.set(i10, (String) obj));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f18948n.size();
    }
}
