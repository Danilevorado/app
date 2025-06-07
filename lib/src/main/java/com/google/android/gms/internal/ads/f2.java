package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class f2 implements o0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ o0 f8095a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ g2 f8096b;

    f2(g2 g2Var, o0 o0Var) {
        this.f8096b = g2Var;
        this.f8095a = o0Var;
    }

    @Override // com.google.android.gms.internal.ads.o0
    public final long c() {
        return this.f8095a.c();
    }

    @Override // com.google.android.gms.internal.ads.o0
    public final boolean g() {
        return this.f8095a.g();
    }

    @Override // com.google.android.gms.internal.ads.o0
    public final m0 h(long j10) {
        m0 m0VarH = this.f8095a.h(j10);
        p0 p0Var = m0VarH.f11886a;
        p0 p0Var2 = new p0(p0Var.f13490a, p0Var.f13491b + this.f8096b.f8581m);
        p0 p0Var3 = m0VarH.f11887b;
        return new m0(p0Var2, new p0(p0Var3.f13490a, p0Var3.f13491b + this.f8096b.f8581m));
    }
}
