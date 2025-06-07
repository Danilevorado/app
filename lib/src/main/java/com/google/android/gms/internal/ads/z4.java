package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class z4 implements y4 {

    /* renamed from: a, reason: collision with root package name */
    private final long[] f18400a;

    /* renamed from: b, reason: collision with root package name */
    private final long[] f18401b;

    /* renamed from: c, reason: collision with root package name */
    private final long f18402c;

    /* renamed from: d, reason: collision with root package name */
    private final long f18403d;

    private z4(long[] jArr, long[] jArr2, long j10, long j11) {
        this.f18400a = jArr;
        this.f18401b = jArr2;
        this.f18402c = j10;
        this.f18403d = j11;
    }

    public static z4 a(long j10, long j11, e0 e0Var, jm2 jm2Var) {
        int iS;
        jm2Var.g(10);
        int iM = jm2Var.m();
        if (iM <= 0) {
            return null;
        }
        int i10 = e0Var.f7574d;
        long jX = sv2.x(iM, (i10 >= 32000 ? 1152 : 576) * 1000000, i10);
        int iW = jm2Var.w();
        int iW2 = jm2Var.w();
        int iW3 = jm2Var.w();
        jm2Var.g(2);
        long j12 = j11 + e0Var.f7573c;
        long[] jArr = new long[iW];
        long[] jArr2 = new long[iW];
        int i11 = 0;
        long j13 = j11;
        while (i11 < iW) {
            int i12 = iW2;
            long j14 = j12;
            jArr[i11] = (i11 * jX) / iW;
            jArr2[i11] = Math.max(j13, j14);
            if (iW3 == 1) {
                iS = jm2Var.s();
            } else if (iW3 == 2) {
                iS = jm2Var.w();
            } else if (iW3 == 3) {
                iS = jm2Var.u();
            } else {
                if (iW3 != 4) {
                    return null;
                }
                iS = jm2Var.v();
            }
            j13 += iS * i12;
            i11++;
            j12 = j14;
            iW2 = i12;
            iW = iW;
        }
        if (j10 != -1 && j10 != j13) {
            ad2.e("VbriSeeker", "VBRI data size mismatch: " + j10 + ", " + j13);
        }
        return new z4(jArr, jArr2, jX, j13);
    }

    @Override // com.google.android.gms.internal.ads.y4
    public final long b() {
        return this.f18403d;
    }

    @Override // com.google.android.gms.internal.ads.o0
    public final long c() {
        return this.f18402c;
    }

    @Override // com.google.android.gms.internal.ads.o0
    public final boolean g() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.o0
    public final m0 h(long j10) {
        int iK = sv2.k(this.f18400a, j10, true, true);
        p0 p0Var = new p0(this.f18400a[iK], this.f18401b[iK]);
        if (p0Var.f13490a < j10) {
            long[] jArr = this.f18400a;
            if (iK != jArr.length - 1) {
                int i10 = iK + 1;
                return new m0(p0Var, new p0(jArr[i10], this.f18401b[i10]));
            }
        }
        return new m0(p0Var, p0Var);
    }

    @Override // com.google.android.gms.internal.ads.y4
    public final long i(long j10) {
        return this.f18400a[sv2.k(this.f18401b, j10, true, true)];
    }
}
