package com.google.android.gms.internal.play_billing;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class d2 extends b0 implements RandomAccess, e2 {

    /* renamed from: o, reason: collision with root package name */
    private static final d2 f19476o;

    /* renamed from: p, reason: collision with root package name */
    public static final e2 f19477p;

    /* renamed from: n, reason: collision with root package name */
    private final List f19478n;

    static {
        d2 d2Var = new d2(false);
        f19476o = d2Var;
        f19477p = d2Var;
    }

    public d2(int i10) {
        ArrayList arrayList = new ArrayList(i10);
        super(true);
        this.f19478n = arrayList;
    }

    private d2(ArrayList arrayList) {
        super(true);
        this.f19478n = arrayList;
    }

    private d2(boolean z10) {
        super(false);
        this.f19478n = Collections.emptyList();
    }

    private static String h(Object obj) {
        return obj instanceof String ? (String) obj : obj instanceof q0 ? ((q0) obj).u(v1.f19659b) : v1.d((byte[]) obj);
    }

    @Override // com.google.android.gms.internal.play_billing.e2
    public final Object C(int i10) {
        return this.f19478n.get(i10);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i10, Object obj) {
        e();
        this.f19478n.add(i10, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.play_billing.b0, java.util.AbstractList, java.util.List
    public final boolean addAll(int i10, Collection collection) {
        e();
        if (collection instanceof e2) {
            collection = ((e2) collection).g();
        }
        boolean zAddAll = this.f19478n.addAll(i10, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }

    @Override // com.google.android.gms.internal.play_billing.b0, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }

    @Override // com.google.android.gms.internal.play_billing.e2
    public final e2 c() {
        return d() ? new a4(this) : this;
    }

    @Override // com.google.android.gms.internal.play_billing.b0, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        e();
        this.f19478n.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final String get(int i10) {
        Object obj = this.f19478n.get(i10);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof q0) {
            q0 q0Var = (q0) obj;
            String strU = q0Var.u(v1.f19659b);
            if (q0Var.p()) {
                this.f19478n.set(i10, strU);
            }
            return strU;
        }
        byte[] bArr = (byte[]) obj;
        String strD = v1.d(bArr);
        if (k4.d(bArr)) {
            this.f19478n.set(i10, strD);
        }
        return strD;
    }

    @Override // com.google.android.gms.internal.play_billing.e2
    public final List g() {
        return Collections.unmodifiableList(this.f19478n);
    }

    @Override // com.google.android.gms.internal.play_billing.u1
    public final /* bridge */ /* synthetic */ u1 j(int i10) {
        if (i10 < size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(i10);
        arrayList.addAll(this.f19478n);
        return new d2(arrayList);
    }

    @Override // com.google.android.gms.internal.play_billing.b0, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        e();
        Object objRemove = this.f19478n.remove(i10);
        ((AbstractList) this).modCount++;
        return h(objRemove);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        e();
        return h(this.f19478n.set(i10, (String) obj));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f19478n.size();
    }
}
