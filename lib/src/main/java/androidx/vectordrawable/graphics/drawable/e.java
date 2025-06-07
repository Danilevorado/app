package androidx.vectordrawable.graphics.drawable;

import android.animation.TypeEvaluator;

/* loaded from: classes.dex */
public class e implements TypeEvaluator {

    /* renamed from: a, reason: collision with root package name */
    private static final e f3914a = new e();

    public static e a() {
        return f3914a;
    }

    @Override // android.animation.TypeEvaluator
    public Object evaluate(float f5, Object obj, Object obj2) {
        int iIntValue = ((Integer) obj).intValue();
        float f10 = ((iIntValue >> 24) & 255) / 255.0f;
        int iIntValue2 = ((Integer) obj2).intValue();
        float fPow = (float) Math.pow(((iIntValue >> 16) & 255) / 255.0f, 2.2d);
        float fPow2 = (float) Math.pow(((iIntValue >> 8) & 255) / 255.0f, 2.2d);
        float fPow3 = (float) Math.pow((iIntValue & 255) / 255.0f, 2.2d);
        float fPow4 = (float) Math.pow(((iIntValue2 >> 16) & 255) / 255.0f, 2.2d);
        float f11 = f10 + (((((iIntValue2 >> 24) & 255) / 255.0f) - f10) * f5);
        float fPow5 = fPow2 + ((((float) Math.pow(((iIntValue2 >> 8) & 255) / 255.0f, 2.2d)) - fPow2) * f5);
        float fPow6 = fPow3 + (f5 * (((float) Math.pow((iIntValue2 & 255) / 255.0f, 2.2d)) - fPow3));
        return Integer.valueOf((Math.round(((float) Math.pow(fPow + ((fPow4 - fPow) * f5), 0.45454545454545453d)) * 255.0f) << 16) | (Math.round(f11 * 255.0f) << 24) | (Math.round(((float) Math.pow(fPow5, 0.45454545454545453d)) * 255.0f) << 8) | Math.round(((float) Math.pow(fPow6, 0.45454545454545453d)) * 255.0f));
    }
}
