package k0;

import android.view.animation.Interpolator;

/* loaded from: classes.dex */
abstract class d implements Interpolator {

    /* renamed from: a, reason: collision with root package name */
    private final float[] f24576a;

    /* renamed from: b, reason: collision with root package name */
    private final float f24577b;

    protected d(float[] fArr) {
        this.f24576a = fArr;
        this.f24577b = 1.0f / (fArr.length - 1);
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f5) {
        if (f5 >= 1.0f) {
            return 1.0f;
        }
        if (f5 <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.f24576a;
        int iMin = Math.min((int) ((fArr.length - 1) * f5), fArr.length - 2);
        float f10 = this.f24577b;
        float f11 = (f5 - (iMin * f10)) / f10;
        float[] fArr2 = this.f24576a;
        return fArr2[iMin] + (f11 * (fArr2[iMin + 1] - fArr2[iMin]));
    }
}
