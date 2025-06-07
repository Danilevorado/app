package com.google.android.gms.internal.play_billing;

import java.util.List;

/* loaded from: classes.dex */
final class i extends j {

    /* renamed from: p, reason: collision with root package name */
    final transient int f19520p;

    /* renamed from: q, reason: collision with root package name */
    final transient int f19521q;

    /* renamed from: r, reason: collision with root package name */
    final /* synthetic */ j f19522r;

    i(j jVar, int i10, int i11) {
        this.f19522r = jVar;
        this.f19520p = i10;
        this.f19521q = i11;
    }

    @Override // com.google.android.gms.internal.play_billing.g
    final int f() {
        return this.f19522r.h() + this.f19520p + this.f19521q;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        b.a(i10, this.f19521q, "index");
        return this.f19522r.get(i10 + this.f19520p);
    }

    @Override // com.google.android.gms.internal.play_billing.g
    final int h() {
        return this.f19522r.h() + this.f19520p;
    }

    @Override // com.google.android.gms.internal.play_billing.g
    final boolean l() {
        return true;
    }

    @Override // com.google.android.gms.internal.play_billing.g
    final Object[] n() {
        return this.f19522r.n();
    }

    @Override // com.google.android.gms.internal.play_billing.j
    /* renamed from: o */
    public final j subList(int i10, int i11) {
        b.c(i10, i11, this.f19521q);
        int i12 = this.f19520p;
        return this.f19522r.subList(i10 + i12, i11 + i12);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f19521q;
    }

    @Override // com.google.android.gms.internal.play_billing.j, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i10, int i11) {
        return subList(i10, i11);
    }
}
