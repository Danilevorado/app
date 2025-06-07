package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.List;
import java.util.ListIterator;

/* loaded from: classes.dex */
class t43 extends q43 implements List {

    /* renamed from: r, reason: collision with root package name */
    final /* synthetic */ u43 f15691r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    t43(u43 u43Var, Object obj, List list, q43 q43Var) {
        super(u43Var, obj, list, q43Var);
        this.f15691r = u43Var;
    }

    @Override // java.util.List
    public final void add(int i10, Object obj) {
        b();
        boolean zIsEmpty = this.f14138n.isEmpty();
        ((List) this.f14138n).add(i10, obj);
        this.f15691r.f16167q++;
        if (zIsEmpty) {
            e();
        }
    }

    @Override // java.util.List
    public final boolean addAll(int i10, Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zAddAll = ((List) this.f14138n).addAll(i10, collection);
        if (!zAddAll) {
            return zAddAll;
        }
        int size2 = this.f14138n.size();
        this.f15691r.f16167q += size2 - size;
        if (size != 0) {
            return zAddAll;
        }
        e();
        return true;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        b();
        return ((List) this.f14138n).get(i10);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        b();
        return ((List) this.f14138n).indexOf(obj);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        b();
        return ((List) this.f14138n).lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        b();
        return new r43(this);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i10) {
        b();
        return new r43(this, i10);
    }

    @Override // java.util.List
    public final Object remove(int i10) {
        b();
        Object objRemove = ((List) this.f14138n).remove(i10);
        u43 u43Var = this.f15691r;
        u43Var.f16167q--;
        f();
        return objRemove;
    }

    @Override // java.util.List
    public final Object set(int i10, Object obj) {
        b();
        return ((List) this.f14138n).set(i10, obj);
    }

    @Override // java.util.List
    public final List subList(int i10, int i11) {
        b();
        u43 u43Var = this.f15691r;
        Object obj = this.f14137m;
        List listSubList = ((List) this.f14138n).subList(i10, i11);
        q43 q43Var = this.f14139o;
        if (q43Var == null) {
            q43Var = this;
        }
        return u43Var.m(obj, listSubList, q43Var);
    }
}
