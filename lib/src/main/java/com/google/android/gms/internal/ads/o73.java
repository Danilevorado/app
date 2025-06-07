package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* loaded from: classes.dex */
final class o73 extends h63 {

    /* renamed from: o, reason: collision with root package name */
    private final transient f63 f13045o;

    /* renamed from: p, reason: collision with root package name */
    private final transient c63 f13046p;

    o73(f63 f63Var, c63 c63Var) {
        this.f13045o = f63Var;
        this.f13046p = c63Var;
    }

    @Override // com.google.android.gms.internal.ads.x53, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.f13045o.get(obj) != null;
    }

    @Override // com.google.android.gms.internal.ads.x53
    final int e(Object[] objArr, int i10) {
        return this.f13046p.e(objArr, i10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return this.f13046p.listIterator(0);
    }

    @Override // com.google.android.gms.internal.ads.h63, com.google.android.gms.internal.ads.x53
    public final c63 k() {
        return this.f13046p;
    }

    @Override // com.google.android.gms.internal.ads.h63, com.google.android.gms.internal.ads.x53
    public final c83 l() {
        return this.f13046p.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f13045o.size();
    }
}
