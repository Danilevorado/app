package com.google.android.gms.internal.play_billing;

import java.util.Objects;

/* loaded from: classes.dex */
final class t extends j {

    /* renamed from: p, reason: collision with root package name */
    private final transient Object[] f19647p;

    /* renamed from: q, reason: collision with root package name */
    private final transient int f19648q;

    /* renamed from: r, reason: collision with root package name */
    private final transient int f19649r;

    t(Object[] objArr, int i10, int i11) {
        this.f19647p = objArr;
        this.f19648q = i10;
        this.f19649r = i11;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        b.a(i10, this.f19649r, "index");
        Object obj = this.f19647p[i10 + i10 + this.f19648q];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // com.google.android.gms.internal.play_billing.g
    final boolean l() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f19649r;
    }
}
