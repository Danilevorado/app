package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;

/* loaded from: classes.dex */
abstract class u43 extends x43 implements Serializable {

    /* renamed from: p, reason: collision with root package name */
    private final transient Map f16166p;

    /* renamed from: q, reason: collision with root package name */
    private transient int f16167q;

    protected u43(Map map) {
        i33.e(map.isEmpty());
        this.f16166p = map;
    }

    static /* bridge */ /* synthetic */ void u(u43 u43Var, Object obj) {
        Object objRemove;
        try {
            objRemove = u43Var.f16166p.remove(obj);
        } catch (ClassCastException | NullPointerException unused) {
            objRemove = null;
        }
        Collection collection = (Collection) objRemove;
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            u43Var.f16167q -= size;
        }
    }

    @Override // com.google.android.gms.internal.ads.y63
    public final boolean a(Object obj, Object obj2) {
        Collection collection = (Collection) this.f16166p.get(obj);
        if (collection != null) {
            if (!collection.add(obj2)) {
                return false;
            }
            this.f16167q++;
            return true;
        }
        Collection collectionH = h();
        if (!collectionH.add(obj2)) {
            throw new AssertionError("New Collection violated the Collection spec");
        }
        this.f16167q++;
        this.f16166p.put(obj, collectionH);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.x43
    final Collection b() {
        return new w43(this);
    }

    @Override // com.google.android.gms.internal.ads.y63
    public final int c() {
        return this.f16167q;
    }

    @Override // com.google.android.gms.internal.ads.x43
    final Iterator d() {
        return new d43(this);
    }

    abstract Collection h();

    abstract Collection j(Collection collection);

    abstract Collection k(Object obj, Collection collection);

    final List m(Object obj, List list, q43 q43Var) {
        return list instanceof RandomAccess ? new m43(this, obj, list, q43Var) : new t43(this, obj, list, q43Var);
    }

    @Override // com.google.android.gms.internal.ads.y63
    public final void o() {
        Iterator it = this.f16166p.values().iterator();
        while (it.hasNext()) {
            ((Collection) it.next()).clear();
        }
        this.f16166p.clear();
        this.f16167q = 0;
    }

    final Map p() {
        Map map = this.f16166p;
        return map instanceof NavigableMap ? new k43(this, (NavigableMap) map) : map instanceof SortedMap ? new n43(this, (SortedMap) map) : new g43(this, map);
    }

    final Set q() {
        Map map = this.f16166p;
        return map instanceof NavigableMap ? new l43(this, (NavigableMap) map) : map instanceof SortedMap ? new o43(this, (SortedMap) map) : new j43(this, map);
    }
}
