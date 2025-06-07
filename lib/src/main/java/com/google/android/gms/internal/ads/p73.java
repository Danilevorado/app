package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class p73 extends c63 {

    /* renamed from: p, reason: collision with root package name */
    private final transient Object[] f13618p;

    /* renamed from: q, reason: collision with root package name */
    private final transient int f13619q;

    /* renamed from: r, reason: collision with root package name */
    private final transient int f13620r;

    p73(Object[] objArr, int i10, int i11) {
        this.f13618p = objArr;
        this.f13619q = i10;
        this.f13620r = i11;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        i33.a(i10, this.f13620r, "index");
        Object obj = this.f13618p[i10 + i10 + this.f13619q];
        obj.getClass();
        return obj;
    }

    @Override // com.google.android.gms.internal.ads.x53
    final boolean n() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f13620r;
    }
}
