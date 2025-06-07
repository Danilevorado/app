package p;

import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
abstract class f extends Drawable {

    /* renamed from: a, reason: collision with root package name */
    private static final double f25845a = Math.cos(Math.toRadians(45.0d));

    static float a(float f5, float f10, boolean z10) {
        return z10 ? (float) (f5 + ((1.0d - f25845a) * f10)) : f5;
    }

    static float b(float f5, float f10, boolean z10) {
        float f11 = f5 * 1.5f;
        return z10 ? (float) (f11 + ((1.0d - f25845a) * f10)) : f11;
    }
}
