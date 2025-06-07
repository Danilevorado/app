package androidx.core.content.res;

/* loaded from: classes.dex */
class a {

    /* renamed from: a, reason: collision with root package name */
    private final float f2148a;

    /* renamed from: b, reason: collision with root package name */
    private final float f2149b;

    /* renamed from: c, reason: collision with root package name */
    private final float f2150c;

    /* renamed from: d, reason: collision with root package name */
    private final float f2151d;

    /* renamed from: e, reason: collision with root package name */
    private final float f2152e;

    /* renamed from: f, reason: collision with root package name */
    private final float f2153f;

    /* renamed from: g, reason: collision with root package name */
    private final float f2154g;

    /* renamed from: h, reason: collision with root package name */
    private final float f2155h;

    /* renamed from: i, reason: collision with root package name */
    private final float f2156i;

    a(float f5, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17) {
        this.f2148a = f5;
        this.f2149b = f10;
        this.f2150c = f11;
        this.f2151d = f12;
        this.f2152e = f13;
        this.f2153f = f14;
        this.f2154g = f15;
        this.f2155h = f16;
        this.f2156i = f17;
    }

    private static a b(float f5, float f10, float f11) {
        float f12 = 1000.0f;
        float f13 = 0.0f;
        a aVar = null;
        float f14 = 100.0f;
        float f15 = 1000.0f;
        while (Math.abs(f13 - f14) > 0.01f) {
            float f16 = ((f14 - f13) / 2.0f) + f13;
            int iP = e(f16, f10, f5).p();
            float fB = b.b(iP);
            float fAbs = Math.abs(f11 - fB);
            if (fAbs < 0.2f) {
                a aVarC = c(iP);
                float fA = aVarC.a(e(aVarC.k(), aVarC.i(), f5));
                if (fA <= 1.0f) {
                    aVar = aVarC;
                    f12 = fAbs;
                    f15 = fA;
                }
            }
            if (f12 == 0.0f && f15 == 0.0f) {
                break;
            }
            if (fB < f11) {
                f13 = f16;
            } else {
                f14 = f16;
            }
        }
        return aVar;
    }

    static a c(int i10) {
        return d(i10, l.f2193k);
    }

    static a d(int i10, l lVar) {
        float[] fArrF = b.f(i10);
        float[][] fArr = b.f2157a;
        float f5 = (fArrF[0] * fArr[0][0]) + (fArrF[1] * fArr[0][1]) + (fArrF[2] * fArr[0][2]);
        float f10 = (fArrF[0] * fArr[1][0]) + (fArrF[1] * fArr[1][1]) + (fArrF[2] * fArr[1][2]);
        float f11 = (fArrF[0] * fArr[2][0]) + (fArrF[1] * fArr[2][1]) + (fArrF[2] * fArr[2][2]);
        float f12 = lVar.i()[0] * f5;
        float f13 = lVar.i()[1] * f10;
        float f14 = lVar.i()[2] * f11;
        float fPow = (float) Math.pow((lVar.c() * Math.abs(f12)) / 100.0d, 0.42d);
        float fPow2 = (float) Math.pow((lVar.c() * Math.abs(f13)) / 100.0d, 0.42d);
        float fPow3 = (float) Math.pow((lVar.c() * Math.abs(f14)) / 100.0d, 0.42d);
        float fSignum = ((Math.signum(f12) * 400.0f) * fPow) / (fPow + 27.13f);
        float fSignum2 = ((Math.signum(f13) * 400.0f) * fPow2) / (fPow2 + 27.13f);
        float fSignum3 = ((Math.signum(f14) * 400.0f) * fPow3) / (fPow3 + 27.13f);
        double d10 = fSignum3;
        float f15 = ((float) (((fSignum * 11.0d) + (fSignum2 * (-12.0d))) + d10)) / 11.0f;
        float f16 = ((float) ((fSignum + fSignum2) - (d10 * 2.0d))) / 9.0f;
        float f17 = fSignum2 * 20.0f;
        float f18 = (((fSignum * 20.0f) + f17) + (21.0f * fSignum3)) / 20.0f;
        float f19 = (((fSignum * 40.0f) + f17) + fSignum3) / 20.0f;
        float fAtan2 = (((float) Math.atan2(f16, f15)) * 180.0f) / 3.1415927f;
        if (fAtan2 < 0.0f) {
            fAtan2 += 360.0f;
        } else if (fAtan2 >= 360.0f) {
            fAtan2 -= 360.0f;
        }
        float f20 = fAtan2;
        float f21 = (3.1415927f * f20) / 180.0f;
        float fPow4 = ((float) Math.pow((f19 * lVar.f()) / lVar.a(), lVar.b() * lVar.j())) * 100.0f;
        float fD = lVar.d() * (4.0f / lVar.b()) * ((float) Math.sqrt(fPow4 / 100.0f)) * (lVar.a() + 4.0f);
        float fPow5 = ((float) Math.pow(1.64d - Math.pow(0.29d, lVar.e()), 0.73d)) * ((float) Math.pow((((((((float) (Math.cos((((((double) f20) < 20.14d ? 360.0f + f20 : f20) * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * lVar.g()) * lVar.h()) * ((float) Math.sqrt((f15 * f15) + (f16 * f16)))) / (f18 + 0.305f), 0.9d)) * ((float) Math.sqrt(fPow4 / 100.0d));
        float fD2 = fPow5 * lVar.d();
        float fSqrt = ((float) Math.sqrt((r2 * lVar.b()) / (lVar.a() + 4.0f))) * 50.0f;
        float f22 = (1.7f * fPow4) / ((0.007f * fPow4) + 1.0f);
        float fLog = ((float) Math.log((0.0228f * fD2) + 1.0f)) * 43.85965f;
        double d11 = f21;
        return new a(f20, fPow5, fPow4, fD, fD2, fSqrt, f22, fLog * ((float) Math.cos(d11)), fLog * ((float) Math.sin(d11)));
    }

    private static a e(float f5, float f10, float f11) {
        return f(f5, f10, f11, l.f2193k);
    }

    private static a f(float f5, float f10, float f11, l lVar) {
        float fB = (4.0f / lVar.b()) * ((float) Math.sqrt(f5 / 100.0d)) * (lVar.a() + 4.0f) * lVar.d();
        float fD = f10 * lVar.d();
        float fSqrt = ((float) Math.sqrt(((f10 / ((float) Math.sqrt(r4))) * lVar.b()) / (lVar.a() + 4.0f))) * 50.0f;
        float f12 = (1.7f * f5) / ((0.007f * f5) + 1.0f);
        float fLog = ((float) Math.log((fD * 0.0228d) + 1.0d)) * 43.85965f;
        double d10 = (3.1415927f * f11) / 180.0f;
        return new a(f11, f10, f5, fB, fD, fSqrt, f12, fLog * ((float) Math.cos(d10)), fLog * ((float) Math.sin(d10)));
    }

    static int m(float f5, float f10, float f11) {
        return n(f5, f10, f11, l.f2193k);
    }

    static int n(float f5, float f10, float f11, l lVar) {
        if (f10 < 1.0d || Math.round(f11) <= 0.0d || Math.round(f11) >= 100.0d) {
            return b.a(f11);
        }
        float fMin = f5 < 0.0f ? 0.0f : Math.min(360.0f, f5);
        a aVar = null;
        boolean z10 = true;
        float f12 = 0.0f;
        float f13 = f10;
        while (Math.abs(f12 - f10) >= 0.4f) {
            a aVarB = b(fMin, f13, f11);
            if (z10) {
                if (aVarB != null) {
                    return aVarB.o(lVar);
                }
                z10 = false;
            } else if (aVarB == null) {
                f10 = f13;
            } else {
                f12 = f13;
                aVar = aVarB;
            }
            f13 = ((f10 - f12) / 2.0f) + f12;
        }
        return aVar == null ? b.a(f11) : aVar.o(lVar);
    }

    float a(a aVar) {
        float fL = l() - aVar.l();
        float fG = g() - aVar.g();
        float fH = h() - aVar.h();
        return (float) (Math.pow(Math.sqrt((fL * fL) + (fG * fG) + (fH * fH)), 0.63d) * 1.41d);
    }

    float g() {
        return this.f2155h;
    }

    float h() {
        return this.f2156i;
    }

    float i() {
        return this.f2149b;
    }

    float j() {
        return this.f2148a;
    }

    float k() {
        return this.f2150c;
    }

    float l() {
        return this.f2154g;
    }

    int o(l lVar) {
        float fPow = (float) Math.pow(((((double) i()) == 0.0d || ((double) k()) == 0.0d) ? 0.0f : i() / ((float) Math.sqrt(k() / 100.0d))) / Math.pow(1.64d - Math.pow(0.29d, lVar.e()), 0.73d), 1.1111111111111112d);
        double dJ = (j() * 3.1415927f) / 180.0f;
        float fCos = ((float) (Math.cos(2.0d + dJ) + 3.8d)) * 0.25f;
        float fA = lVar.a() * ((float) Math.pow(k() / 100.0d, (1.0d / lVar.b()) / lVar.j()));
        float fG = fCos * 3846.1538f * lVar.g() * lVar.h();
        float f5 = fA / lVar.f();
        float fSin = (float) Math.sin(dJ);
        float fCos2 = (float) Math.cos(dJ);
        float f10 = (((0.305f + f5) * 23.0f) * fPow) / (((fG * 23.0f) + ((11.0f * fPow) * fCos2)) + ((fPow * 108.0f) * fSin));
        float f11 = fCos2 * f10;
        float f12 = f10 * fSin;
        float f13 = f5 * 460.0f;
        float f14 = (((451.0f * f11) + f13) + (288.0f * f12)) / 1403.0f;
        float f15 = ((f13 - (891.0f * f11)) - (261.0f * f12)) / 1403.0f;
        float fSignum = Math.signum(f14) * (100.0f / lVar.c()) * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f14) * 27.13d) / (400.0d - Math.abs(f14))), 2.380952380952381d));
        float fSignum2 = Math.signum(f15) * (100.0f / lVar.c()) * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f15) * 27.13d) / (400.0d - Math.abs(f15))), 2.380952380952381d));
        float fSignum3 = Math.signum(((f13 - (f11 * 220.0f)) - (f12 * 6300.0f)) / 1403.0f) * (100.0f / lVar.c()) * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(r6) * 27.13d) / (400.0d - Math.abs(r6))), 2.380952380952381d));
        float f16 = fSignum / lVar.i()[0];
        float f17 = fSignum2 / lVar.i()[1];
        float f18 = fSignum3 / lVar.i()[2];
        float[][] fArr = b.f2158b;
        return androidx.core.graphics.a.b((fArr[0][0] * f16) + (fArr[0][1] * f17) + (fArr[0][2] * f18), (fArr[1][0] * f16) + (fArr[1][1] * f17) + (fArr[1][2] * f18), (f16 * fArr[2][0]) + (f17 * fArr[2][1]) + (f18 * fArr[2][2]));
    }

    int p() {
        return o(l.f2193k);
    }
}
