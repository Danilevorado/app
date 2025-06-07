package d5;

import android.animation.TimeInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final TimeInterpolator f22931a = new LinearInterpolator();

    /* renamed from: b, reason: collision with root package name */
    public static final TimeInterpolator f22932b = new k0.b();

    /* renamed from: c, reason: collision with root package name */
    public static final TimeInterpolator f22933c = new k0.a();

    /* renamed from: d, reason: collision with root package name */
    public static final TimeInterpolator f22934d = new k0.c();

    /* renamed from: e, reason: collision with root package name */
    public static final TimeInterpolator f22935e = new DecelerateInterpolator();

    public static float a(float f5, float f10, float f11) {
        return f5 + (f11 * (f10 - f5));
    }

    public static float b(float f5, float f10, float f11, float f12, float f13) {
        return f13 < f11 ? f5 : f13 > f12 ? f10 : a(f5, f10, (f13 - f11) / (f12 - f11));
    }

    public static int c(int i10, int i11, float f5) {
        return i10 + Math.round(f5 * (i11 - i10));
    }
}
