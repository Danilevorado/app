package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes.dex */
class g43 extends w63 {

    /* renamed from: o, reason: collision with root package name */
    final transient Map f8604o;

    /* renamed from: p, reason: collision with root package name */
    final /* synthetic */ u43 f8605p;

    g43(u43 u43Var, Map map) {
        this.f8605p = u43Var;
        this.f8604o = map;
    }

    @Override // com.google.android.gms.internal.ads.w63
    protected final Set a() {
        return new e43(this);
    }

    final Map.Entry b(Map.Entry entry) {
        Object key = entry.getKey();
        return new y53(key, this.f8605p.k(key, (Collection) entry.getValue()));
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        Map map = this.f8604o;
        u43 u43Var = this.f8605p;
        if (map == u43Var.f16166p) {
            u43Var.o();
        } else {
            m63.b(new f43(this));
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map map = this.f8604o;
        Objects.requireNonNull(map);
        try {
            return map.containsKey(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        return this == obj || this.f8604o.equals(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        Collection collection = (Collection) x63.a(this.f8604o, obj);
        if (collection == null) {
            return null;
        }
        return this.f8605p.k(obj, collection);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        return this.f8604o.hashCode();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set keySet() {
        return this.f8605p.g();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object remove(Object obj) {
        Collection collection = (Collection) this.f8604o.remove(obj);
        if (collection == null) {
            return null;
        }
        Collection collectionH = this.f8605p.h();
        collectionH.addAll(collection);
        this.f8605p.f16167q -= collection.size();
        collection.clear();
        return collectionH;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f8604o.size();
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        return this.f8604o.toString();
    }
}
