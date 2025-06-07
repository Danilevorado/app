package com.google.android.gms.internal.play_billing;

import java.util.Objects;

/* loaded from: classes.dex */
final class p extends j {

    /* renamed from: r, reason: collision with root package name */
    static final j f19619r = new p(new Object[0], 0);

    /* renamed from: p, reason: collision with root package name */
    final transient Object[] f19620p;

    /* renamed from: q, reason: collision with root package name */
    private final transient int f19621q;

    p(Object[] objArr, int i10) {
        this.f19620p = objArr;
        this.f19621q = i10;
    }

    @Override // com.google.android.gms.internal.play_billing.j, com.google.android.gms.internal.play_billing.g
    final int e(Object[] objArr, int i10) {
        System.arraycopy(this.f19620p, 0, objArr, 0, this.f19621q);
        return this.f19621q;
    }

    @Override // com.google.android.gms.internal.play_billing.g
    final int f() {
        return this.f19621q;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        b.a(i10, this.f19621q, "index");
        Object obj = this.f19620p[i10];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // com.google.android.gms.internal.play_billing.g
    final int h() {
        return 0;
    }

    @Override // com.google.android.gms.internal.play_billing.g
    final boolean l() {
        return false;
    }

    @Override // com.google.android.gms.internal.play_billing.g
    final Object[] n() {
        return this.f19620p;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f19621q;
    }
}
