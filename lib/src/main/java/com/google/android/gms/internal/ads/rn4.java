package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class rn4 implements o0 {

    /* renamed from: a, reason: collision with root package name */
    private final un4 f14855a;

    /* renamed from: b, reason: collision with root package name */
    private final long f14856b;

    /* renamed from: c, reason: collision with root package name */
    private final long f14857c;

    /* renamed from: d, reason: collision with root package name */
    private final long f14858d;

    /* renamed from: e, reason: collision with root package name */
    private final long f14859e;

    /* renamed from: f, reason: collision with root package name */
    private final long f14860f;

    public rn4(un4 un4Var, long j10, long j11, long j12, long j13, long j14, long j15) {
        this.f14855a = un4Var;
        this.f14856b = j10;
        this.f14857c = j12;
        this.f14858d = j13;
        this.f14859e = j14;
        this.f14860f = j15;
    }

    @Override // com.google.android.gms.internal.ads.o0
    public final long c() {
        return this.f14856b;
    }

    @Override // com.google.android.gms.internal.ads.o0
    public final boolean g() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.o0
    public final m0 h(long j10) {
        p0 p0Var = new p0(j10, tn4.f(this.f14855a.a(j10), 0L, this.f14857c, this.f14858d, this.f14859e, this.f14860f));
        return new m0(p0Var, p0Var);
    }

    public final long j(long j10) {
        return this.f14855a.a(j10);
    }
}
