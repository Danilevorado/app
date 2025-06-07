package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class f8 {

    /* renamed from: c, reason: collision with root package name */
    private boolean f8168c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f8169d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f8170e;

    /* renamed from: a, reason: collision with root package name */
    private final rt2 f8166a = new rt2(0);

    /* renamed from: f, reason: collision with root package name */
    private long f8171f = -9223372036854775807L;

    /* renamed from: g, reason: collision with root package name */
    private long f8172g = -9223372036854775807L;

    /* renamed from: h, reason: collision with root package name */
    private long f8173h = -9223372036854775807L;

    /* renamed from: b, reason: collision with root package name */
    private final jm2 f8167b = new jm2();

    f8() {
    }

    public static long c(jm2 jm2Var) {
        int iK = jm2Var.k();
        if (jm2Var.i() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        jm2Var.b(bArr, 0, 9);
        jm2Var.f(iK);
        if ((bArr[0] & 196) != 68 || (bArr[2] & 4) != 4 || (bArr[4] & 4) != 4 || (bArr[5] & 1) != 1 || (bArr[8] & 3) != 3) {
            return -9223372036854775807L;
        }
        long j10 = bArr[0];
        long j11 = bArr[1];
        long j12 = bArr[2];
        long j13 = (j12 & 248) >> 3;
        return ((255 & bArr[3]) << 5) | ((j10 & 3) << 28) | (((j10 & 56) >> 3) << 30) | ((j11 & 255) << 20) | (j13 << 15) | ((j12 & 3) << 13) | ((bArr[4] & 248) >> 3);
    }

    private final int f(l lVar) {
        jm2 jm2Var = this.f8167b;
        byte[] bArr = sv2.f15565f;
        int length = bArr.length;
        jm2Var.d(bArr, 0);
        this.f8168c = true;
        lVar.j();
        return 0;
    }

    private static final int g(byte[] bArr, int i10) {
        return (bArr[i10 + 3] & 255) | ((bArr[i10] & 255) << 24) | ((bArr[i10 + 1] & 255) << 16) | ((bArr[i10 + 2] & 255) << 8);
    }

    public final int a(l lVar, l0 l0Var) {
        long j10 = -9223372036854775807L;
        if (!this.f8170e) {
            long jF = lVar.f();
            int iMin = (int) Math.min(20000L, jF);
            long j11 = jF - iMin;
            if (lVar.e() != j11) {
                l0Var.f11275a = j11;
                return 1;
            }
            this.f8167b.c(iMin);
            lVar.j();
            ((bo4) lVar).E(this.f8167b.h(), 0, iMin, false);
            jm2 jm2Var = this.f8167b;
            int iK = jm2Var.k();
            int iL = jm2Var.l() - 4;
            while (true) {
                if (iL < iK) {
                    break;
                }
                if (g(jm2Var.h(), iL) == 442) {
                    jm2Var.f(iL + 4);
                    long jC = c(jm2Var);
                    if (jC != -9223372036854775807L) {
                        j10 = jC;
                        break;
                    }
                }
                iL--;
            }
            this.f8172g = j10;
            this.f8170e = true;
            return 0;
        }
        if (this.f8172g == -9223372036854775807L) {
            f(lVar);
            return 0;
        }
        if (this.f8169d) {
            long j12 = this.f8171f;
            if (j12 == -9223372036854775807L) {
                f(lVar);
                return 0;
            }
            long jB = this.f8166a.b(this.f8172g) - this.f8166a.b(j12);
            this.f8173h = jB;
            if (jB < 0) {
                ad2.e("PsDurationReader", "Invalid duration: " + jB + ". Using TIME_UNSET instead.");
                this.f8173h = -9223372036854775807L;
            }
            f(lVar);
            return 0;
        }
        int iMin2 = (int) Math.min(20000L, lVar.f());
        if (lVar.e() != 0) {
            l0Var.f11275a = 0L;
            return 1;
        }
        this.f8167b.c(iMin2);
        lVar.j();
        ((bo4) lVar).E(this.f8167b.h(), 0, iMin2, false);
        jm2 jm2Var2 = this.f8167b;
        int iK2 = jm2Var2.k();
        int iL2 = jm2Var2.l();
        while (true) {
            if (iK2 >= iL2 - 3) {
                break;
            }
            if (g(jm2Var2.h(), iK2) == 442) {
                jm2Var2.f(iK2 + 4);
                long jC2 = c(jm2Var2);
                if (jC2 != -9223372036854775807L) {
                    j10 = jC2;
                    break;
                }
            }
            iK2++;
        }
        this.f8171f = j10;
        this.f8169d = true;
        return 0;
    }

    public final long b() {
        return this.f8173h;
    }

    public final rt2 d() {
        return this.f8166a;
    }

    public final boolean e() {
        return this.f8168c;
    }
}
