package com.google.android.gms.internal.ads;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

/* loaded from: classes.dex */
class n43 extends g43 implements SortedMap {

    /* renamed from: q, reason: collision with root package name */
    SortedSet f12411q;

    /* renamed from: r, reason: collision with root package name */
    final /* synthetic */ u43 f12412r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    n43(u43 u43Var, SortedMap sortedMap) {
        super(u43Var, sortedMap);
        this.f12412r = u43Var;
    }

    SortedMap c() {
        return (SortedMap) this.f8604o;
    }

    @Override // java.util.SortedMap
    public final Comparator comparator() {
        return c().comparator();
    }

    SortedSet d() {
        return new o43(this.f12412r, c());
    }

    @Override // com.google.android.gms.internal.ads.g43, java.util.AbstractMap, java.util.Map
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public SortedSet keySet() {
        SortedSet sortedSet = this.f12411q;
        if (sortedSet != null) {
            return sortedSet;
        }
        SortedSet sortedSetD = d();
        this.f12411q = sortedSetD;
        return sortedSetD;
    }

    @Override // java.util.SortedMap
    public final Object firstKey() {
        return c().firstKey();
    }

    public SortedMap headMap(Object obj) {
        return new n43(this.f12412r, c().headMap(obj));
    }

    @Override // java.util.SortedMap
    public final Object lastKey() {
        return c().lastKey();
    }

    public SortedMap subMap(Object obj, Object obj2) {
        return new n43(this.f12412r, c().subMap(obj, obj2));
    }

    public SortedMap tailMap(Object obj) {
        return new n43(this.f12412r, c().tailMap(obj));
    }
}
