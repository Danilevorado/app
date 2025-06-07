package z0;

import android.view.View;

/* loaded from: classes.dex */
abstract class z extends e0 {

    /* renamed from: c, reason: collision with root package name */
    private static boolean f28751c = true;

    z() {
    }

    @Override // z0.e0
    public void a(View view) {
    }

    @Override // z0.e0
    public float b(View view) {
        if (f28751c) {
            try {
                return view.getTransitionAlpha();
            } catch (NoSuchMethodError unused) {
                f28751c = false;
            }
        }
        return view.getAlpha();
    }

    @Override // z0.e0
    public void c(View view) {
    }

    @Override // z0.e0
    public void e(View view, float f5) {
        if (f28751c) {
            try {
                view.setTransitionAlpha(f5);
                return;
            } catch (NoSuchMethodError unused) {
                f28751c = false;
            }
        }
        view.setAlpha(f5);
    }
}
