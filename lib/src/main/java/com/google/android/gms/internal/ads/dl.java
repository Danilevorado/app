package com.google.android.gms.internal.ads;

import f3.a;

/* loaded from: classes.dex */
public final class dl extends kl {

    /* renamed from: m, reason: collision with root package name */
    private final a.AbstractC0129a f7393m;

    /* renamed from: n, reason: collision with root package name */
    private final String f7394n;

    public dl(a.AbstractC0129a abstractC0129a, String str) {
        this.f7393m = abstractC0129a;
        this.f7394n = str;
    }

    @Override // com.google.android.gms.internal.ads.ll
    public final void E1(k3.w2 w2Var) {
        if (this.f7393m != null) {
            this.f7393m.a(w2Var.h());
        }
    }

    @Override // com.google.android.gms.internal.ads.ll
    public final void J3(il ilVar) {
        if (this.f7393m != null) {
            this.f7393m.b(new el(ilVar, this.f7394n));
        }
    }

    @Override // com.google.android.gms.internal.ads.ll
    public final void K(int i10) {
    }
}
