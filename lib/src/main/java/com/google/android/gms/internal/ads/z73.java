package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Objects;

/* loaded from: classes.dex */
final class z73 extends h63 {

    /* renamed from: o, reason: collision with root package name */
    final transient Object f18468o;

    z73(Object obj) {
        Objects.requireNonNull(obj);
        this.f18468o = obj;
    }

    @Override // com.google.android.gms.internal.ads.x53, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.f18468o.equals(obj);
    }

    @Override // com.google.android.gms.internal.ads.x53
    final int e(Object[] objArr, int i10) {
        objArr[i10] = this.f18468o;
        return i10 + 1;
    }

    @Override // com.google.android.gms.internal.ads.h63, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f18468o.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return new k63(this.f18468o);
    }

    @Override // com.google.android.gms.internal.ads.h63, com.google.android.gms.internal.ads.x53
    public final c63 k() {
        return c63.v(this.f18468o);
    }

    @Override // com.google.android.gms.internal.ads.h63, com.google.android.gms.internal.ads.x53
    public final c83 l() {
        return new k63(this.f18468o);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return "[" + this.f18468o.toString() + "]";
    }
}
