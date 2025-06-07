package t6;

/* loaded from: classes.dex */
public abstract class a {
    public static float a(float f5, float f10, float f11, float f12) {
        float f13 = f5 - f11;
        float f14 = f10 - f12;
        return (float) Math.sqrt((f13 * f13) + (f14 * f14));
    }

    public static float b(int i10, int i11, int i12, int i13) {
        int i14 = i10 - i12;
        int i15 = i11 - i13;
        return (float) Math.sqrt((i14 * i14) + (i15 * i15));
    }

    public static int c(float f5) {
        return (int) (f5 + (f5 < 0.0f ? -0.5f : 0.5f));
    }
}
