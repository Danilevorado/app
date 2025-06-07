package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class l73 extends c63 {

    /* renamed from: r, reason: collision with root package name */
    static final c63 f11358r = new l73(new Object[0], 0);

    /* renamed from: p, reason: collision with root package name */
    final transient Object[] f11359p;

    /* renamed from: q, reason: collision with root package name */
    private final transient int f11360q;

    l73(Object[] objArr, int i10) {
        this.f11359p = objArr;
        this.f11360q = i10;
    }

    @Override // com.google.android.gms.internal.ads.c63, com.google.android.gms.internal.ads.x53
    final int e(Object[] objArr, int i10) {
        System.arraycopy(this.f11359p, 0, objArr, i10, this.f11360q);
        return i10 + this.f11360q;
    }

    @Override // com.google.android.gms.internal.ads.x53
    final int f() {
        return this.f11360q;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        i33.a(i10, this.f11360q, "index");
        Object obj = this.f11359p[i10];
        obj.getClass();
        return obj;
    }

    @Override // com.google.android.gms.internal.ads.x53
    final int h() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.x53
    final boolean n() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.x53
    final Object[] o() {
        return this.f11359p;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f11360q;
    }
}
