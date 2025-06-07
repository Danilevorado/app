package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public abstract class ao4 implements o0 {

    /* renamed from: a, reason: collision with root package name */
    private final long f6191a;

    /* renamed from: b, reason: collision with root package name */
    private final long f6192b;

    /* renamed from: c, reason: collision with root package name */
    private final int f6193c;

    /* renamed from: d, reason: collision with root package name */
    private final long f6194d;

    /* renamed from: e, reason: collision with root package name */
    private final int f6195e;

    /* renamed from: f, reason: collision with root package name */
    private final long f6196f;

    public ao4(long j10, long j11, int i10, int i11, boolean z10) {
        long jD;
        this.f6191a = j10;
        this.f6192b = j11;
        this.f6193c = i11 == -1 ? 1 : i11;
        this.f6195e = i10;
        if (j10 == -1) {
            this.f6194d = -1L;
            jD = -9223372036854775807L;
        } else {
            this.f6194d = j10 - j11;
            jD = d(j10, j11, i10);
        }
        this.f6196f = jD;
    }

    private static long d(long j10, long j11, int i10) {
        return (Math.max(0L, j10 - j11) * 8000000) / i10;
    }

    public final long a(long j10) {
        return d(j10, this.f6192b, this.f6195e);
    }

    @Override // com.google.android.gms.internal.ads.o0
    public final long c() {
        return this.f6196f;
    }

    @Override // com.google.android.gms.internal.ads.o0
    public final boolean g() {
        return this.f6194d != -1;
    }

    @Override // com.google.android.gms.internal.ads.o0
    public final m0 h(long j10) {
        long j11 = this.f6194d;
        if (j11 == -1) {
            p0 p0Var = new p0(0L, this.f6192b);
            return new m0(p0Var, p0Var);
        }
        long j12 = this.f6193c;
        long jMin = (((this.f6195e * j10) / 8000000) / j12) * j12;
        if (j11 != -1) {
            jMin = Math.min(jMin, j11 - j12);
        }
        long jMax = this.f6192b + Math.max(jMin, 0L);
        long jA = a(jMax);
        p0 p0Var2 = new p0(jA, jMax);
        if (this.f6194d != -1 && jA < j10) {
            long j13 = jMax + this.f6193c;
            if (j13 < this.f6191a) {
                return new m0(p0Var2, new p0(a(j13), j13));
            }
        }
        return new m0(p0Var2, p0Var2);
    }
}
