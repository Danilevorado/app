package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class ok2 implements w23 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ sk2 f13299a;

    ok2(sk2 sk2Var) {
        this.f13299a = sk2Var;
    }

    @Override // com.google.android.gms.internal.ads.w23
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        ze0.e("", (dt1) obj);
        m3.n1.k("Failed to get a cache key, reverting to legacy flow.");
        sk2 sk2Var = this.f13299a;
        sk2Var.f15307d = new rk2(null, sk2Var.e(), null);
        return this.f13299a.f15307d;
    }
}
