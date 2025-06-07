package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class j9 implements o0 {

    /* renamed from: a, reason: collision with root package name */
    private final g9 f10377a;

    /* renamed from: b, reason: collision with root package name */
    private final int f10378b;

    /* renamed from: c, reason: collision with root package name */
    private final long f10379c;

    /* renamed from: d, reason: collision with root package name */
    private final long f10380d;

    /* renamed from: e, reason: collision with root package name */
    private final long f10381e;

    public j9(g9 g9Var, int i10, long j10, long j11) {
        this.f10377a = g9Var;
        this.f10378b = i10;
        this.f10379c = j10;
        long j12 = (j11 - j10) / g9Var.f8647d;
        this.f10380d = j12;
        this.f10381e = a(j12);
    }

    private final long a(long j10) {
        return sv2.x(j10 * this.f10378b, 1000000L, this.f10377a.f8646c);
    }

    @Override // com.google.android.gms.internal.ads.o0
    public final long c() {
        return this.f10381e;
    }

    @Override // com.google.android.gms.internal.ads.o0
    public final boolean g() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.o0
    public final m0 h(long j10) {
        long jMax = Math.max(0L, Math.min((this.f10377a.f8646c * j10) / (this.f10378b * 1000000), this.f10380d - 1));
        long j11 = this.f10379c + (this.f10377a.f8647d * jMax);
        long jA = a(jMax);
        p0 p0Var = new p0(jA, j11);
        if (jA >= j10 || jMax == this.f10380d - 1) {
            return new m0(p0Var, p0Var);
        }
        long j12 = jMax + 1;
        return new m0(p0Var, new p0(a(j12), this.f10379c + (this.f10377a.f8647d * j12)));
    }
}
