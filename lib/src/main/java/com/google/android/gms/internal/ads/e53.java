package com.google.android.gms.internal.ads;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
final class e53 extends AbstractSet {

    /* renamed from: m, reason: collision with root package name */
    final /* synthetic */ k53 f7637m;

    e53(k53 k53Var) {
        this.f7637m = k53Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f7637m.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        Map mapK = this.f7637m.k();
        if (mapK != null) {
            return mapK.entrySet().contains(obj);
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            int iR = this.f7637m.r(entry.getKey());
            if (iR != -1) {
                Object[] objArr = this.f7637m.f10827p;
                objArr.getClass();
                if (d33.a(objArr[iR], entry.getValue())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        k53 k53Var = this.f7637m;
        Map mapK = k53Var.k();
        return mapK != null ? mapK.entrySet().iterator() : new c53(k53Var);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        Map mapK = this.f7637m.k();
        if (mapK != null) {
            return mapK.entrySet().remove(obj);
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        k53 k53Var = this.f7637m;
        if (k53Var.p()) {
            return false;
        }
        int iQ = k53Var.q();
        Object key = entry.getKey();
        Object value = entry.getValue();
        Object objH = k53.h(this.f7637m);
        k53 k53Var2 = this.f7637m;
        int[] iArr = k53Var2.f10825n;
        iArr.getClass();
        Object[] objArr = k53Var2.f10826o;
        objArr.getClass();
        Object[] objArr2 = k53Var2.f10827p;
        objArr2.getClass();
        int iB = l53.b(key, value, iQ, objH, iArr, objArr, objArr2);
        if (iB == -1) {
            return false;
        }
        this.f7637m.o(iB, iQ);
        k53 k53Var3 = this.f7637m;
        k53Var3.f10829r--;
        this.f7637m.m();
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f7637m.size();
    }
}
