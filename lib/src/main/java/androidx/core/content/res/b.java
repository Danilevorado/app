package androidx.core.content.res;

import android.graphics.Color;

/* loaded from: classes.dex */
abstract class b {

    /* renamed from: a, reason: collision with root package name */
    static final float[][] f2157a = {new float[]{0.401288f, 0.650173f, -0.051461f}, new float[]{-0.250268f, 1.204414f, 0.045854f}, new float[]{-0.002079f, 0.048952f, 0.953127f}};

    /* renamed from: b, reason: collision with root package name */
    static final float[][] f2158b = {new float[]{1.8620678f, -1.0112547f, 0.14918678f}, new float[]{0.38752654f, 0.62144744f, -0.00897398f}, new float[]{-0.0158415f, -0.03412294f, 1.0499644f}};

    /* renamed from: c, reason: collision with root package name */
    static final float[] f2159c = {95.047f, 100.0f, 108.883f};

    /* renamed from: d, reason: collision with root package name */
    static final float[][] f2160d = {new float[]{0.41233894f, 0.35762063f, 0.18051042f}, new float[]{0.2126f, 0.7152f, 0.0722f}, new float[]{0.01932141f, 0.11916382f, 0.9503448f}};

    static int a(float f5) {
        if (f5 < 1.0f) {
            return -16777216;
        }
        if (f5 > 99.0f) {
            return -1;
        }
        float f10 = (f5 + 16.0f) / 116.0f;
        float f11 = (f5 > 8.0f ? 1 : (f5 == 8.0f ? 0 : -1)) > 0 ? f10 * f10 * f10 : f5 / 903.2963f;
        float f12 = f10 * f10 * f10;
        boolean z10 = f12 > 0.008856452f;
        float f13 = z10 ? f12 : ((f10 * 116.0f) - 16.0f) / 903.2963f;
        if (!z10) {
            f12 = ((f10 * 116.0f) - 16.0f) / 903.2963f;
        }
        float[] fArr = f2159c;
        return androidx.core.graphics.a.b(f13 * fArr[0], f11 * fArr[1], f12 * fArr[2]);
    }

    static float b(int i10) {
        return c(g(i10));
    }

    static float c(float f5) {
        float f10 = f5 / 100.0f;
        return f10 <= 0.008856452f ? f10 * 903.2963f : (((float) Math.cbrt(f10)) * 116.0f) - 16.0f;
    }

    static float d(float f5, float f10, float f11) {
        return f5 + ((f10 - f5) * f11);
    }

    static float e(int i10) {
        float f5 = i10 / 255.0f;
        return (f5 <= 0.04045f ? f5 / 12.92f : (float) Math.pow((f5 + 0.055f) / 1.055f, 2.4000000953674316d)) * 100.0f;
    }

    static float[] f(int i10) {
        float fE = e(Color.red(i10));
        float fE2 = e(Color.green(i10));
        float fE3 = e(Color.blue(i10));
        float[][] fArr = f2160d;
        return new float[]{(fArr[0][0] * fE) + (fArr[0][1] * fE2) + (fArr[0][2] * fE3), (fArr[1][0] * fE) + (fArr[1][1] * fE2) + (fArr[1][2] * fE3), (fE * fArr[2][0]) + (fE2 * fArr[2][1]) + (fE3 * fArr[2][2])};
    }

    static float g(int i10) {
        float fE = e(Color.red(i10));
        float fE2 = e(Color.green(i10));
        float fE3 = e(Color.blue(i10));
        float[][] fArr = f2160d;
        return (fE * fArr[1][0]) + (fE2 * fArr[1][1]) + (fE3 * fArr[1][2]);
    }

    static float h(float f5) {
        return (f5 > 8.0f ? (float) Math.pow((f5 + 16.0d) / 116.0d, 3.0d) : f5 / 903.2963f) * 100.0f;
    }
}
