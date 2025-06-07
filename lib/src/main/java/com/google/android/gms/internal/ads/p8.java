package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class p8 {

    /* renamed from: c, reason: collision with root package name */
    private boolean f13630c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f13631d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f13632e;

    /* renamed from: a, reason: collision with root package name */
    private final rt2 f13628a = new rt2(0);

    /* renamed from: f, reason: collision with root package name */
    private long f13633f = -9223372036854775807L;

    /* renamed from: g, reason: collision with root package name */
    private long f13634g = -9223372036854775807L;

    /* renamed from: h, reason: collision with root package name */
    private long f13635h = -9223372036854775807L;

    /* renamed from: b, reason: collision with root package name */
    private final jm2 f13629b = new jm2();

    p8(int i10) {
    }

    private final int e(l lVar) {
        jm2 jm2Var = this.f13629b;
        byte[] bArr = sv2.f15565f;
        int length = bArr.length;
        jm2Var.d(bArr, 0);
        this.f13630c = true;
        lVar.j();
        return 0;
    }

    public final int a(l lVar, l0 l0Var, int i10) {
        if (i10 <= 0) {
            e(lVar);
            return 0;
        }
        long j10 = -9223372036854775807L;
        if (!this.f13632e) {
            long jF = lVar.f();
            int iMin = (int) Math.min(112800L, jF);
            long j11 = jF - iMin;
            if (lVar.e() != j11) {
                l0Var.f11275a = j11;
                return 1;
            }
            this.f13629b.c(iMin);
            lVar.j();
            ((bo4) lVar).E(this.f13629b.h(), 0, iMin, false);
            jm2 jm2Var = this.f13629b;
            int iK = jm2Var.k();
            int iL = jm2Var.l();
            int i11 = iL - 188;
            while (true) {
                if (i11 < iK) {
                    break;
                }
                byte[] bArrH = jm2Var.h();
                int i12 = -4;
                int i13 = 0;
                while (true) {
                    if (i12 > 4) {
                        break;
                    }
                    int i14 = (i12 * 188) + i11;
                    if (i14 < iK || i14 >= iL || bArrH[i14] != 71) {
                        i13 = 0;
                    } else {
                        i13++;
                        if (i13 == 5) {
                            long jB = z8.b(jm2Var, i11, i10);
                            if (jB != -9223372036854775807L) {
                                j10 = jB;
                                break;
                            }
                        }
                    }
                    i12++;
                }
                i11--;
            }
            this.f13634g = j10;
            this.f13632e = true;
            return 0;
        }
        if (this.f13634g == -9223372036854775807L) {
            e(lVar);
            return 0;
        }
        if (this.f13631d) {
            long j12 = this.f13633f;
            if (j12 == -9223372036854775807L) {
                e(lVar);
                return 0;
            }
            long jB2 = this.f13628a.b(this.f13634g) - this.f13628a.b(j12);
            this.f13635h = jB2;
            if (jB2 < 0) {
                ad2.e("TsDurationReader", "Invalid duration: " + jB2 + ". Using TIME_UNSET instead.");
                this.f13635h = -9223372036854775807L;
            }
            e(lVar);
            return 0;
        }
        int iMin2 = (int) Math.min(112800L, lVar.f());
        if (lVar.e() != 0) {
            l0Var.f11275a = 0L;
            return 1;
        }
        this.f13629b.c(iMin2);
        lVar.j();
        ((bo4) lVar).E(this.f13629b.h(), 0, iMin2, false);
        jm2 jm2Var2 = this.f13629b;
        int iK2 = jm2Var2.k();
        int iL2 = jm2Var2.l();
        while (true) {
            if (iK2 >= iL2) {
                break;
            }
            if (jm2Var2.h()[iK2] == 71) {
                long jB3 = z8.b(jm2Var2, iK2, i10);
                if (jB3 != -9223372036854775807L) {
                    j10 = jB3;
                    break;
                }
            }
            iK2++;
        }
        this.f13633f = j10;
        this.f13631d = true;
        return 0;
    }

    public final long b() {
        return this.f13635h;
    }

    public final rt2 c() {
        return this.f13628a;
    }

    public final boolean d() {
        return this.f13630c;
    }
}
