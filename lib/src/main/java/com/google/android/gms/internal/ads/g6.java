package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class g6 implements o0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ i6 f8627a;

    /* synthetic */ g6(i6 i6Var, f6 f6Var) {
        this.f8627a = i6Var;
    }

    @Override // com.google.android.gms.internal.ads.o0
    public final long c() {
        i6 i6Var = this.f8627a;
        return i6Var.f9556d.e(i6Var.f9558f);
    }

    @Override // com.google.android.gms.internal.ads.o0
    public final boolean g() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.o0
    public final m0 h(long j10) {
        p0 p0Var = new p0(j10, Math.max(this.f8627a.f9554b, Math.min((r0.f9554b + ((r0.f9556d.f(j10) * (r0.f9555c - r0.f9554b)) / r0.f9558f)) - 30000, r0.f9555c - 1)));
        return new m0(p0Var, p0Var);
    }
}
