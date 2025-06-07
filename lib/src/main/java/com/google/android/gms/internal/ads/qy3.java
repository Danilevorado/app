package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class qy3 extends hw3 implements RandomAccess, ry3 {

    /* renamed from: o, reason: collision with root package name */
    private static final qy3 f14549o;

    /* renamed from: p, reason: collision with root package name */
    public static final ry3 f14550p;

    /* renamed from: n, reason: collision with root package name */
    private final List f14551n;

    static {
        qy3 qy3Var = new qy3(false);
        f14549o = qy3Var;
        f14550p = qy3Var;
    }

    public qy3(int i10) {
        ArrayList arrayList = new ArrayList(i10);
        super(true);
        this.f14551n = arrayList;
    }

    private qy3(ArrayList arrayList) {
        super(true);
        this.f14551n = arrayList;
    }

    private qy3(boolean z10) {
        super(false);
        this.f14551n = Collections.emptyList();
    }

    private static String h(Object obj) {
        return obj instanceof String ? (String) obj : obj instanceof ww3 ? ((ww3) obj).K(ly3.f11869b) : ly3.d((byte[]) obj);
    }

    @Override // com.google.android.gms.internal.ads.ry3
    public final Object C(int i10) {
        return this.f14551n.get(i10);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i10, Object obj) {
        e();
        this.f14551n.add(i10, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.ads.hw3, java.util.AbstractList, java.util.List
    public final boolean addAll(int i10, Collection collection) {
        e();
        if (collection instanceof ry3) {
            collection = ((ry3) collection).g();
        }
        boolean zAddAll = this.f14551n.addAll(i10, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }

    @Override // com.google.android.gms.internal.ads.hw3, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }

    @Override // com.google.android.gms.internal.ads.ry3
    public final ry3 c() {
        return d() ? new o04(this) : this;
    }

    @Override // com.google.android.gms.internal.ads.hw3, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        e();
        this.f14551n.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final String get(int i10) {
        Object obj = this.f14551n.get(i10);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof ww3) {
            ww3 ww3Var = (ww3) obj;
            String strK = ww3Var.K(ly3.f11869b);
            if (ww3Var.A()) {
                this.f14551n.set(i10, strK);
            }
            return strK;
        }
        byte[] bArr = (byte[]) obj;
        String strD = ly3.d(bArr);
        if (y04.i(bArr)) {
            this.f14551n.set(i10, strD);
        }
        return strD;
    }

    @Override // com.google.android.gms.internal.ads.ry3
    public final List g() {
        return Collections.unmodifiableList(this.f14551n);
    }

    @Override // com.google.android.gms.internal.ads.ky3
    public final /* bridge */ /* synthetic */ ky3 j(int i10) {
        if (i10 < size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(i10);
        arrayList.addAll(this.f14551n);
        return new qy3(arrayList);
    }

    @Override // com.google.android.gms.internal.ads.ry3
    public final void m(ww3 ww3Var) {
        e();
        this.f14551n.add(ww3Var);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.ads.hw3, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        e();
        Object objRemove = this.f14551n.remove(i10);
        ((AbstractList) this).modCount++;
        return h(objRemove);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        e();
        return h(this.f14551n.set(i10, (String) obj));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f14551n.size();
    }
}
