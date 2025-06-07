package androidx.core.content.res;

/* loaded from: classes.dex */
final class l {

    /* renamed from: k, reason: collision with root package name */
    static final l f2193k = k(b.f2159c, (float) ((b.h(50.0f) * 63.66197723675813d) / 100.0d), 50.0f, 2.0f, false);

    /* renamed from: a, reason: collision with root package name */
    private final float f2194a;

    /* renamed from: b, reason: collision with root package name */
    private final float f2195b;

    /* renamed from: c, reason: collision with root package name */
    private final float f2196c;

    /* renamed from: d, reason: collision with root package name */
    private final float f2197d;

    /* renamed from: e, reason: collision with root package name */
    private final float f2198e;

    /* renamed from: f, reason: collision with root package name */
    private final float f2199f;

    /* renamed from: g, reason: collision with root package name */
    private final float[] f2200g;

    /* renamed from: h, reason: collision with root package name */
    private final float f2201h;

    /* renamed from: i, reason: collision with root package name */
    private final float f2202i;

    /* renamed from: j, reason: collision with root package name */
    private final float f2203j;

    private l(float f5, float f10, float f11, float f12, float f13, float f14, float[] fArr, float f15, float f16, float f17) {
        this.f2199f = f5;
        this.f2194a = f10;
        this.f2195b = f11;
        this.f2196c = f12;
        this.f2197d = f13;
        this.f2198e = f14;
        this.f2200g = fArr;
        this.f2201h = f15;
        this.f2202i = f16;
        this.f2203j = f17;
    }

    static l k(float[] fArr, float f5, float f10, float f11, boolean z10) {
        float[][] fArr2 = b.f2157a;
        float f12 = (fArr[0] * fArr2[0][0]) + (fArr[1] * fArr2[0][1]) + (fArr[2] * fArr2[0][2]);
        float f13 = (fArr[0] * fArr2[1][0]) + (fArr[1] * fArr2[1][1]) + (fArr[2] * fArr2[1][2]);
        float f14 = (fArr[0] * fArr2[2][0]) + (fArr[1] * fArr2[2][1]) + (fArr[2] * fArr2[2][2]);
        float f15 = (f11 / 10.0f) + 0.8f;
        float fD = ((double) f15) >= 0.9d ? b.d(0.59f, 0.69f, (f15 - 0.9f) * 10.0f) : b.d(0.525f, 0.59f, (f15 - 0.8f) * 10.0f);
        float fExp = z10 ? 1.0f : (1.0f - (((float) Math.exp(((-f5) - 42.0f) / 92.0f)) * 0.2777778f)) * f15;
        double d10 = fExp;
        if (d10 > 1.0d) {
            fExp = 1.0f;
        } else if (d10 < 0.0d) {
            fExp = 0.0f;
        }
        float[] fArr3 = {(((100.0f / f12) * fExp) + 1.0f) - fExp, (((100.0f / f13) * fExp) + 1.0f) - fExp, (((100.0f / f14) * fExp) + 1.0f) - fExp};
        float f16 = 1.0f / ((5.0f * f5) + 1.0f);
        float f17 = f16 * f16 * f16 * f16;
        float f18 = 1.0f - f17;
        float fCbrt = (f17 * f5) + (0.1f * f18 * f18 * ((float) Math.cbrt(f5 * 5.0d)));
        float fH = b.h(f10) / fArr[1];
        double d11 = fH;
        float fSqrt = ((float) Math.sqrt(d11)) + 1.48f;
        float fPow = 0.725f / ((float) Math.pow(d11, 0.2d));
        float[] fArr4 = {(float) Math.pow(((fArr3[0] * fCbrt) * f12) / 100.0d, 0.42d), (float) Math.pow(((fArr3[1] * fCbrt) * f13) / 100.0d, 0.42d), (float) Math.pow(((fArr3[2] * fCbrt) * f14) / 100.0d, 0.42d)};
        float[] fArr5 = {(fArr4[0] * 400.0f) / (fArr4[0] + 27.13f), (fArr4[1] * 400.0f) / (fArr4[1] + 27.13f), (fArr4[2] * 400.0f) / (fArr4[2] + 27.13f)};
        return new l(fH, ((fArr5[0] * 2.0f) + fArr5[1] + (fArr5[2] * 0.05f)) * fPow, fPow, fPow, fD, f15, fArr3, fCbrt, (float) Math.pow(fCbrt, 0.25d), fSqrt);
    }

    float a() {
        return this.f2194a;
    }

    float b() {
        return this.f2197d;
    }

    float c() {
        return this.f2201h;
    }

    float d() {
        return this.f2202i;
    }

    float e() {
        return this.f2199f;
    }

    float f() {
        return this.f2195b;
    }

    float g() {
        return this.f2198e;
    }

    float h() {
        return this.f2196c;
    }

    float[] i() {
        return this.f2200g;
    }

    float j() {
        return this.f2203j;
    }
}
