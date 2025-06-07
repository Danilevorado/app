package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class n8 implements wn4 {

    /* renamed from: a, reason: collision with root package name */
    private final rt2 f12479a;

    /* renamed from: b, reason: collision with root package name */
    private final jm2 f12480b = new jm2();

    /* renamed from: c, reason: collision with root package name */
    private final int f12481c;

    public n8(int i10, rt2 rt2Var, int i11) {
        this.f12481c = i10;
        this.f12479a = rt2Var;
    }

    @Override // com.google.android.gms.internal.ads.wn4
    public final vn4 a(l lVar, long j10) {
        int iA;
        int iA2;
        long j11;
        long jE = lVar.e();
        int iMin = (int) Math.min(112800L, lVar.f() - jE);
        this.f12480b.c(iMin);
        ((bo4) lVar).E(this.f12480b.h(), 0, iMin, false);
        jm2 jm2Var = this.f12480b;
        int iL = jm2Var.l();
        long j12 = -1;
        long j13 = -9223372036854775807L;
        long j14 = -1;
        while (jm2Var.i() >= 188 && (iA2 = (iA = z8.a(jm2Var.h(), jm2Var.k(), iL)) + 188) <= iL) {
            long jB = z8.b(jm2Var, iA, this.f12481c);
            if (jB != -9223372036854775807L) {
                long jB2 = this.f12479a.b(jB);
                if (jB2 > j10) {
                    if (j13 == -9223372036854775807L) {
                        return vn4.d(jB2, jE);
                    }
                    j11 = jE + j14;
                } else if (100000 + jB2 > j10) {
                    j11 = jE + iA;
                } else {
                    j14 = iA;
                    j13 = jB2;
                }
                return vn4.e(j11);
            }
            jm2Var.f(iA2);
            j12 = iA2;
        }
        return j13 != -9223372036854775807L ? vn4.f(j13, jE + j12) : vn4.f16820d;
    }

    @Override // com.google.android.gms.internal.ads.wn4
    public final void b() {
        jm2 jm2Var = this.f12480b;
        byte[] bArr = sv2.f15565f;
        int length = bArr.length;
        jm2Var.d(bArr, 0);
    }
}
