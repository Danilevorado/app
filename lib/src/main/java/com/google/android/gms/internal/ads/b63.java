package com.google.android.gms.internal.ads;

import java.util.List;

/* loaded from: classes.dex */
final class b63 extends c63 {

    /* renamed from: p, reason: collision with root package name */
    final transient int f6360p;

    /* renamed from: q, reason: collision with root package name */
    final transient int f6361q;

    /* renamed from: r, reason: collision with root package name */
    final /* synthetic */ c63 f6362r;

    b63(c63 c63Var, int i10, int i11) {
        this.f6362r = c63Var;
        this.f6360p = i10;
        this.f6361q = i11;
    }

    @Override // com.google.android.gms.internal.ads.x53
    final int f() {
        return this.f6362r.h() + this.f6360p + this.f6361q;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        i33.a(i10, this.f6361q, "index");
        return this.f6362r.get(i10 + this.f6360p);
    }

    @Override // com.google.android.gms.internal.ads.x53
    final int h() {
        return this.f6362r.h() + this.f6360p;
    }

    @Override // com.google.android.gms.internal.ads.x53
    final boolean n() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.x53
    final Object[] o() {
        return this.f6362r.o();
    }

    @Override // com.google.android.gms.internal.ads.c63
    /* renamed from: p */
    public final c63 subList(int i10, int i11) {
        i33.g(i10, i11, this.f6361q);
        c63 c63Var = this.f6362r;
        int i12 = this.f6360p;
        return c63Var.subList(i10 + i12, i11 + i12);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f6361q;
    }

    @Override // com.google.android.gms.internal.ads.c63, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i10, int i11) {
        return subList(i10, i11);
    }
}
