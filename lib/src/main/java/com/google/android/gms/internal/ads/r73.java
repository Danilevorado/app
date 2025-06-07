package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* loaded from: classes.dex */
final class r73 extends h63 {

    /* renamed from: t, reason: collision with root package name */
    private static final Object[] f14655t;

    /* renamed from: u, reason: collision with root package name */
    static final r73 f14656u;

    /* renamed from: o, reason: collision with root package name */
    final transient Object[] f14657o;

    /* renamed from: p, reason: collision with root package name */
    private final transient int f14658p;

    /* renamed from: q, reason: collision with root package name */
    final transient Object[] f14659q;

    /* renamed from: r, reason: collision with root package name */
    private final transient int f14660r;

    /* renamed from: s, reason: collision with root package name */
    private final transient int f14661s;

    static {
        Object[] objArr = new Object[0];
        f14655t = objArr;
        f14656u = new r73(objArr, 0, objArr, 0, 0);
    }

    r73(Object[] objArr, int i10, Object[] objArr2, int i11, int i12) {
        this.f14657o = objArr;
        this.f14658p = i10;
        this.f14659q = objArr2;
        this.f14660r = i11;
        this.f14661s = i12;
    }

    @Override // com.google.android.gms.internal.ads.h63
    final boolean B() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.x53, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        Object[] objArr = this.f14659q;
        if (obj == null || objArr.length == 0) {
            return false;
        }
        int iB = u53.b(obj);
        while (true) {
            int i10 = iB & this.f14660r;
            Object obj2 = objArr[i10];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            iB = i10 + 1;
        }
    }

    @Override // com.google.android.gms.internal.ads.x53
    final int e(Object[] objArr, int i10) {
        System.arraycopy(this.f14657o, 0, objArr, i10, this.f14661s);
        return i10 + this.f14661s;
    }

    @Override // com.google.android.gms.internal.ads.x53
    final int f() {
        return this.f14661s;
    }

    @Override // com.google.android.gms.internal.ads.x53
    final int h() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.h63, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f14658p;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return k().listIterator(0);
    }

    @Override // com.google.android.gms.internal.ads.h63, com.google.android.gms.internal.ads.x53
    public final c83 l() {
        return k().listIterator(0);
    }

    @Override // com.google.android.gms.internal.ads.x53
    final Object[] o() {
        return this.f14657o;
    }

    @Override // com.google.android.gms.internal.ads.h63
    final c63 q() {
        return c63.q(this.f14657o, this.f14661s);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f14661s;
    }
}
