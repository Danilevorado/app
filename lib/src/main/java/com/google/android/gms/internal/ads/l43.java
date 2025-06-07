package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.SortedMap;
import java.util.SortedSet;

/* loaded from: classes.dex */
final class l43 extends o43 implements NavigableSet {

    /* renamed from: p, reason: collision with root package name */
    final /* synthetic */ u43 f11330p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    l43(u43 u43Var, NavigableMap navigableMap) {
        super(u43Var, navigableMap);
        this.f11330p = u43Var;
    }

    @Override // java.util.NavigableSet
    public final Object ceiling(Object obj) {
        return ((NavigableMap) ((SortedMap) this.f16192m)).ceilingKey(obj);
    }

    @Override // java.util.NavigableSet
    public final Iterator descendingIterator() {
        return descendingSet().iterator();
    }

    @Override // java.util.NavigableSet
    public final NavigableSet descendingSet() {
        return new l43(this.f11330p, ((NavigableMap) ((SortedMap) this.f16192m)).descendingMap());
    }

    @Override // com.google.android.gms.internal.ads.o43
    final /* synthetic */ SortedMap e() {
        return (NavigableMap) ((SortedMap) this.f16192m);
    }

    @Override // java.util.NavigableSet
    public final Object floor(Object obj) {
        return ((NavigableMap) ((SortedMap) this.f16192m)).floorKey(obj);
    }

    @Override // java.util.NavigableSet
    public final NavigableSet headSet(Object obj, boolean z10) {
        return new l43(this.f11330p, ((NavigableMap) ((SortedMap) this.f16192m)).headMap(obj, z10));
    }

    @Override // com.google.android.gms.internal.ads.o43, java.util.SortedSet, java.util.NavigableSet
    public final /* synthetic */ SortedSet headSet(Object obj) {
        return headSet(obj, false);
    }

    @Override // java.util.NavigableSet
    public final Object higher(Object obj) {
        return ((NavigableMap) ((SortedMap) this.f16192m)).higherKey(obj);
    }

    @Override // java.util.NavigableSet
    public final Object lower(Object obj) {
        return ((NavigableMap) ((SortedMap) this.f16192m)).lowerKey(obj);
    }

    @Override // java.util.NavigableSet
    public final Object pollFirst() {
        return m63.a(iterator());
    }

    @Override // java.util.NavigableSet
    public final Object pollLast() {
        return m63.a(descendingIterator());
    }

    @Override // java.util.NavigableSet
    public final NavigableSet subSet(Object obj, boolean z10, Object obj2, boolean z11) {
        return new l43(this.f11330p, ((NavigableMap) ((SortedMap) this.f16192m)).subMap(obj, z10, obj2, z11));
    }

    @Override // com.google.android.gms.internal.ads.o43, java.util.SortedSet, java.util.NavigableSet
    public final /* bridge */ /* synthetic */ SortedSet subSet(Object obj, Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    @Override // java.util.NavigableSet
    public final NavigableSet tailSet(Object obj, boolean z10) {
        return new l43(this.f11330p, ((NavigableMap) ((SortedMap) this.f16192m)).tailMap(obj, z10));
    }

    @Override // com.google.android.gms.internal.ads.o43, java.util.SortedSet, java.util.NavigableSet
    public final /* synthetic */ SortedSet tailSet(Object obj) {
        return tailSet(obj, true);
    }
}
