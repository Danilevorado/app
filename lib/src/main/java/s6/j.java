package s6;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    private final float f27066a;

    /* renamed from: b, reason: collision with root package name */
    private final float f27067b;

    /* renamed from: c, reason: collision with root package name */
    private final float f27068c;

    /* renamed from: d, reason: collision with root package name */
    private final float f27069d;

    /* renamed from: e, reason: collision with root package name */
    private final float f27070e;

    /* renamed from: f, reason: collision with root package name */
    private final float f27071f;

    /* renamed from: g, reason: collision with root package name */
    private final float f27072g;

    /* renamed from: h, reason: collision with root package name */
    private final float f27073h;

    /* renamed from: i, reason: collision with root package name */
    private final float f27074i;

    private j(float f5, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17) {
        this.f27066a = f5;
        this.f27067b = f12;
        this.f27068c = f15;
        this.f27069d = f10;
        this.f27070e = f13;
        this.f27071f = f16;
        this.f27072g = f11;
        this.f27073h = f14;
        this.f27074i = f17;
    }

    public static j b(float f5, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, float f20, float f21, float f22, float f23, float f24) {
        return d(f17, f18, f19, f20, f21, f22, f23, f24).e(c(f5, f10, f11, f12, f13, f14, f15, f16));
    }

    public static j c(float f5, float f10, float f11, float f12, float f13, float f14, float f15, float f16) {
        return d(f5, f10, f11, f12, f13, f14, f15, f16).a();
    }

    public static j d(float f5, float f10, float f11, float f12, float f13, float f14, float f15, float f16) {
        float f17 = ((f5 - f11) + f13) - f15;
        float f18 = ((f10 - f12) + f14) - f16;
        if (f17 == 0.0f && f18 == 0.0f) {
            return new j(f11 - f5, f13 - f11, f5, f12 - f10, f14 - f12, f10, 0.0f, 0.0f, 1.0f);
        }
        float f19 = f11 - f13;
        float f20 = f15 - f13;
        float f21 = f12 - f14;
        float f22 = f16 - f14;
        float f23 = (f19 * f22) - (f20 * f21);
        float f24 = ((f22 * f17) - (f20 * f18)) / f23;
        float f25 = ((f19 * f18) - (f17 * f21)) / f23;
        return new j((f24 * f11) + (f11 - f5), (f25 * f15) + (f15 - f5), f5, (f12 - f10) + (f24 * f12), (f16 - f10) + (f25 * f16), f10, f24, f25, 1.0f);
    }

    j a() {
        float f5 = this.f27070e;
        float f10 = this.f27074i;
        float f11 = this.f27071f;
        float f12 = this.f27073h;
        float f13 = (f5 * f10) - (f11 * f12);
        float f14 = this.f27072g;
        float f15 = this.f27069d;
        float f16 = (f11 * f14) - (f15 * f10);
        float f17 = (f15 * f12) - (f5 * f14);
        float f18 = this.f27068c;
        float f19 = this.f27067b;
        float f20 = (f18 * f12) - (f19 * f10);
        float f21 = this.f27066a;
        return new j(f13, f16, f17, f20, (f10 * f21) - (f18 * f14), (f14 * f19) - (f12 * f21), (f19 * f11) - (f18 * f5), (f18 * f15) - (f11 * f21), (f21 * f5) - (f19 * f15));
    }

    j e(j jVar) {
        float f5 = this.f27066a;
        float f10 = jVar.f27066a;
        float f11 = this.f27069d;
        float f12 = jVar.f27067b;
        float f13 = this.f27072g;
        float f14 = jVar.f27068c;
        float f15 = (f5 * f10) + (f11 * f12) + (f13 * f14);
        float f16 = jVar.f27069d;
        float f17 = jVar.f27070e;
        float f18 = jVar.f27071f;
        float f19 = (f5 * f16) + (f11 * f17) + (f13 * f18);
        float f20 = jVar.f27072g;
        float f21 = jVar.f27073h;
        float f22 = jVar.f27074i;
        float f23 = (f5 * f20) + (f11 * f21) + (f13 * f22);
        float f24 = this.f27067b;
        float f25 = this.f27070e;
        float f26 = this.f27073h;
        float f27 = (f24 * f10) + (f25 * f12) + (f26 * f14);
        float f28 = (f24 * f16) + (f25 * f17) + (f26 * f18);
        float f29 = (f26 * f22) + (f24 * f20) + (f25 * f21);
        float f30 = this.f27068c;
        float f31 = this.f27071f;
        float f32 = (f10 * f30) + (f12 * f31);
        float f33 = this.f27074i;
        return new j(f15, f19, f23, f27, f28, f29, (f14 * f33) + f32, (f16 * f30) + (f17 * f31) + (f18 * f33), (f30 * f20) + (f31 * f21) + (f33 * f22));
    }

    public void f(float[] fArr) {
        int length = fArr.length;
        float f5 = this.f27066a;
        float f10 = this.f27067b;
        float f11 = this.f27068c;
        float f12 = this.f27069d;
        float f13 = this.f27070e;
        float f14 = this.f27071f;
        float f15 = this.f27072g;
        float f16 = this.f27073h;
        float f17 = this.f27074i;
        for (int i10 = 0; i10 < length; i10 += 2) {
            float f18 = fArr[i10];
            int i11 = i10 + 1;
            float f19 = fArr[i11];
            float f20 = (f11 * f18) + (f14 * f19) + f17;
            fArr[i10] = (((f5 * f18) + (f12 * f19)) + f15) / f20;
            fArr[i11] = (((f18 * f10) + (f19 * f13)) + f16) / f20;
        }
    }
}
