package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public class n0 implements o0 {

    /* renamed from: a, reason: collision with root package name */
    private final long f12342a;

    /* renamed from: b, reason: collision with root package name */
    private final m0 f12343b;

    public n0(long j10, long j11) {
        this.f12342a = j10;
        p0 p0Var = j11 == 0 ? p0.f13489c : new p0(0L, j11);
        this.f12343b = new m0(p0Var, p0Var);
    }

    @Override // com.google.android.gms.internal.ads.o0
    public final long c() {
        return this.f12342a;
    }

    @Override // com.google.android.gms.internal.ads.o0
    public final boolean g() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.o0
    public final m0 h(long j10) {
        return this.f12343b;
    }
}
