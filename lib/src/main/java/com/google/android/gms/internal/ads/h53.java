package com.google.android.gms.internal.ads;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
final class h53 extends AbstractSet {

    /* renamed from: m, reason: collision with root package name */
    final /* synthetic */ k53 f9009m;

    h53(k53 k53Var) {
        this.f9009m = k53Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f9009m.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f9009m.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        k53 k53Var = this.f9009m;
        Map mapK = k53Var.k();
        return mapK != null ? mapK.keySet().iterator() : new b53(k53Var);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        Map mapK = this.f9009m.k();
        return mapK != null ? mapK.keySet().remove(obj) : this.f9009m.t(obj) != k53.f10823v;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f9009m.size();
    }
}
