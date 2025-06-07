package com.google.android.gms.internal.ads;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

/* loaded from: classes.dex */
class o43 extends j43 implements SortedSet {

    /* renamed from: o, reason: collision with root package name */
    final /* synthetic */ u43 f13000o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    o43(u43 u43Var, SortedMap sortedMap) {
        super(u43Var, sortedMap);
        this.f13000o = u43Var;
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return e().comparator();
    }

    SortedMap e() {
        return (SortedMap) this.f16192m;
    }

    @Override // java.util.SortedSet
    public final Object first() {
        return e().firstKey();
    }

    public SortedSet headSet(Object obj) {
        return new o43(this.f13000o, e().headMap(obj));
    }

    @Override // java.util.SortedSet
    public final Object last() {
        return e().lastKey();
    }

    public SortedSet subSet(Object obj, Object obj2) {
        return new o43(this.f13000o, e().subMap(obj, obj2));
    }

    public SortedSet tailSet(Object obj) {
        return new o43(this.f13000o, e().tailMap(obj));
    }
}
