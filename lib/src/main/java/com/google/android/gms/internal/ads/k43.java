package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;

/* loaded from: classes.dex */
final class k43 extends n43 implements NavigableMap {

    /* renamed from: s, reason: collision with root package name */
    final /* synthetic */ u43 f10815s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    k43(u43 u43Var, NavigableMap navigableMap) {
        super(u43Var, navigableMap);
        this.f10815s = u43Var;
    }

    @Override // com.google.android.gms.internal.ads.n43
    final /* synthetic */ SortedMap c() {
        return (NavigableMap) ((SortedMap) this.f8604o);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry ceilingEntry(Object obj) {
        Map.Entry entryCeilingEntry = ((NavigableMap) ((SortedMap) this.f8604o)).ceilingEntry(obj);
        if (entryCeilingEntry == null) {
            return null;
        }
        return b(entryCeilingEntry);
    }

    @Override // java.util.NavigableMap
    public final Object ceilingKey(Object obj) {
        return ((NavigableMap) ((SortedMap) this.f8604o)).ceilingKey(obj);
    }

    @Override // java.util.NavigableMap
    public final NavigableSet descendingKeySet() {
        return (NavigableSet) super.keySet();
    }

    @Override // java.util.NavigableMap
    public final NavigableMap descendingMap() {
        return new k43(this.f10815s, ((NavigableMap) ((SortedMap) this.f8604o)).descendingMap());
    }

    @Override // com.google.android.gms.internal.ads.n43
    /* renamed from: e */
    public final /* synthetic */ SortedSet keySet() {
        return (NavigableSet) super.keySet();
    }

    final Map.Entry f(Iterator it) {
        if (!it.hasNext()) {
            return null;
        }
        Map.Entry entry = (Map.Entry) it.next();
        Collection collectionH = this.f10815s.h();
        collectionH.addAll((Collection) entry.getValue());
        it.remove();
        return new y53(entry.getKey(), this.f10815s.j(collectionH));
    }

    @Override // java.util.NavigableMap
    public final Map.Entry firstEntry() {
        Map.Entry entryFirstEntry = ((NavigableMap) ((SortedMap) this.f8604o)).firstEntry();
        if (entryFirstEntry == null) {
            return null;
        }
        return b(entryFirstEntry);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry floorEntry(Object obj) {
        Map.Entry entryFloorEntry = ((NavigableMap) ((SortedMap) this.f8604o)).floorEntry(obj);
        if (entryFloorEntry == null) {
            return null;
        }
        return b(entryFloorEntry);
    }

    @Override // java.util.NavigableMap
    public final Object floorKey(Object obj) {
        return ((NavigableMap) ((SortedMap) this.f8604o)).floorKey(obj);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.n43
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final NavigableSet d() {
        return new l43(this.f10815s, (NavigableMap) ((SortedMap) this.f8604o));
    }

    @Override // java.util.NavigableMap
    public final NavigableMap headMap(Object obj, boolean z10) {
        return new k43(this.f10815s, ((NavigableMap) ((SortedMap) this.f8604o)).headMap(obj, z10));
    }

    @Override // com.google.android.gms.internal.ads.n43, java.util.SortedMap, java.util.NavigableMap
    public final /* synthetic */ SortedMap headMap(Object obj) {
        return headMap(obj, false);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry higherEntry(Object obj) {
        Map.Entry entryHigherEntry = ((NavigableMap) ((SortedMap) this.f8604o)).higherEntry(obj);
        if (entryHigherEntry == null) {
            return null;
        }
        return b(entryHigherEntry);
    }

    @Override // java.util.NavigableMap
    public final Object higherKey(Object obj) {
        return ((NavigableMap) ((SortedMap) this.f8604o)).higherKey(obj);
    }

    @Override // com.google.android.gms.internal.ads.n43, com.google.android.gms.internal.ads.g43, java.util.AbstractMap, java.util.Map
    public final /* synthetic */ Set keySet() {
        return (NavigableSet) super.keySet();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry lastEntry() {
        Map.Entry entryLastEntry = ((NavigableMap) ((SortedMap) this.f8604o)).lastEntry();
        if (entryLastEntry == null) {
            return null;
        }
        return b(entryLastEntry);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry lowerEntry(Object obj) {
        Map.Entry entryLowerEntry = ((NavigableMap) ((SortedMap) this.f8604o)).lowerEntry(obj);
        if (entryLowerEntry == null) {
            return null;
        }
        return b(entryLowerEntry);
    }

    @Override // java.util.NavigableMap
    public final Object lowerKey(Object obj) {
        return ((NavigableMap) ((SortedMap) this.f8604o)).lowerKey(obj);
    }

    @Override // java.util.NavigableMap
    public final NavigableSet navigableKeySet() {
        return (NavigableSet) super.keySet();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry pollFirstEntry() {
        return f(entrySet().iterator());
    }

    @Override // java.util.NavigableMap
    public final Map.Entry pollLastEntry() {
        return f(descendingMap().entrySet().iterator());
    }

    @Override // java.util.NavigableMap
    public final NavigableMap subMap(Object obj, boolean z10, Object obj2, boolean z11) {
        return new k43(this.f10815s, ((NavigableMap) ((SortedMap) this.f8604o)).subMap(obj, z10, obj2, z11));
    }

    @Override // com.google.android.gms.internal.ads.n43, java.util.SortedMap, java.util.NavigableMap
    public final /* bridge */ /* synthetic */ SortedMap subMap(Object obj, Object obj2) {
        return subMap(obj, true, obj2, false);
    }

    @Override // java.util.NavigableMap
    public final NavigableMap tailMap(Object obj, boolean z10) {
        return new k43(this.f10815s, ((NavigableMap) ((SortedMap) this.f8604o)).tailMap(obj, z10));
    }

    @Override // com.google.android.gms.internal.ads.n43, java.util.SortedMap, java.util.NavigableMap
    public final /* synthetic */ SortedMap tailMap(Object obj) {
        return tailMap(obj, true);
    }
}
