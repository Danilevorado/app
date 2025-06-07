package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class a5 implements y4 {

    /* renamed from: a, reason: collision with root package name */
    private final long f5942a;

    /* renamed from: b, reason: collision with root package name */
    private final int f5943b;

    /* renamed from: c, reason: collision with root package name */
    private final long f5944c;

    /* renamed from: d, reason: collision with root package name */
    private final long f5945d;

    /* renamed from: e, reason: collision with root package name */
    private final long f5946e;

    /* renamed from: f, reason: collision with root package name */
    private final long[] f5947f;

    private a5(long j10, int i10, long j11, long j12, long[] jArr) {
        this.f5942a = j10;
        this.f5943b = i10;
        this.f5944c = j11;
        this.f5947f = jArr;
        this.f5945d = j12;
        this.f5946e = j12 != -1 ? j10 + j12 : -1L;
    }

    public static a5 a(long j10, long j11, e0 e0Var, jm2 jm2Var) {
        int iV;
        int i10 = e0Var.f7577g;
        int i11 = e0Var.f7574d;
        int iM = jm2Var.m();
        if ((iM & 1) != 1 || (iV = jm2Var.v()) == 0) {
            return null;
        }
        int i12 = iM & 6;
        long jX = sv2.x(iV, i10 * 1000000, i11);
        if (i12 != 6) {
            return new a5(j11, e0Var.f7573c, jX, -1L, null);
        }
        long jA = jm2Var.A();
        long[] jArr = new long[100];
        for (int i13 = 0; i13 < 100; i13++) {
            jArr[i13] = jm2Var.s();
        }
        if (j10 != -1) {
            long j12 = j11 + jA;
            if (j10 != j12) {
                ad2.e("XingSeeker", "XING data size mismatch: " + j10 + ", " + j12);
            }
        }
        return new a5(j11, e0Var.f7573c, jX, jA, jArr);
    }

    private final long d(int i10) {
        return (this.f5944c * i10) / 100;
    }

    @Override // com.google.android.gms.internal.ads.y4
    public final long b() {
        return this.f5946e;
    }

    @Override // com.google.android.gms.internal.ads.o0
    public final long c() {
        return this.f5944c;
    }

    @Override // com.google.android.gms.internal.ads.o0
    public final boolean g() {
        return this.f5947f != null;
    }

    @Override // com.google.android.gms.internal.ads.o0
    public final m0 h(long j10) {
        if (!g()) {
            p0 p0Var = new p0(0L, this.f5942a + this.f5943b);
            return new m0(p0Var, p0Var);
        }
        long jMax = Math.max(0L, Math.min(j10, this.f5944c));
        double d10 = (jMax * 100.0d) / this.f5944c;
        double d11 = 0.0d;
        if (d10 > 0.0d) {
            if (d10 >= 100.0d) {
                d11 = 256.0d;
            } else {
                int i10 = (int) d10;
                long[] jArr = this.f5947f;
                gt1.b(jArr);
                double d12 = jArr[i10];
                d11 = d12 + ((d10 - i10) * ((i10 == 99 ? 256.0d : jArr[i10 + 1]) - d12));
            }
        }
        p0 p0Var2 = new p0(jMax, this.f5942a + Math.max(this.f5943b, Math.min(Math.round((d11 / 256.0d) * this.f5945d), this.f5945d - 1)));
        return new m0(p0Var2, p0Var2);
    }

    @Override // com.google.android.gms.internal.ads.y4
    public final long i(long j10) {
        long j11 = j10 - this.f5942a;
        if (!g() || j11 <= this.f5943b) {
            return 0L;
        }
        long[] jArr = this.f5947f;
        gt1.b(jArr);
        double d10 = (j11 * 256.0d) / this.f5945d;
        int iK = sv2.k(jArr, (long) d10, true, true);
        long jD = d(iK);
        long j12 = jArr[iK];
        int i10 = iK + 1;
        long jD2 = d(i10);
        return jD + Math.round((j12 == (iK == 99 ? 256L : jArr[i10]) ? 0.0d : (d10 - j12) / (r0 - j12)) * (jD2 - jD));
    }
}
