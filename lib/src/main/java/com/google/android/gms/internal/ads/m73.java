package com.google.android.gms.internal.ads;

import java.util.AbstractMap;

/* loaded from: classes.dex */
final class m73 extends c63 {

    /* renamed from: p, reason: collision with root package name */
    final /* synthetic */ n73 f11995p;

    m73(n73 n73Var) {
        this.f11995p = n73Var;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i10) {
        i33.a(i10, this.f11995p.f12478q, "index");
        n73 n73Var = this.f11995p;
        int i11 = i10 + i10;
        Object obj = n73Var.f12477p[i11];
        obj.getClass();
        Object obj2 = n73Var.f12477p[i11 + 1];
        obj2.getClass();
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // com.google.android.gms.internal.ads.x53
    public final boolean n() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f11995p.f12478q;
    }
}
