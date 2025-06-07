package s5;

/* loaded from: classes.dex */
public class e extends d {

    /* renamed from: a, reason: collision with root package name */
    float f26918a = -1.0f;

    @Override // s5.d
    public void a(m mVar, float f5, float f10, float f11) {
        mVar.o(0.0f, f11 * f10, 180.0f, 180.0f - f5);
        double d10 = f11;
        double d11 = f10;
        mVar.m((float) (Math.sin(Math.toRadians(f5)) * d10 * d11), (float) (Math.sin(Math.toRadians(90.0f - f5)) * d10 * d11));
    }
}
