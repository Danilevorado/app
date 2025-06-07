package z0;

import android.os.Build;
import android.view.View;

/* loaded from: classes.dex */
class c0 extends b0 {

    /* renamed from: g, reason: collision with root package name */
    private static boolean f28662g = true;

    c0() {
    }

    @Override // z0.e0
    public void f(View view, int i10) throws IllegalAccessException, NoSuchFieldException, IllegalArgumentException {
        if (Build.VERSION.SDK_INT == 28) {
            super.f(view, i10);
        } else if (f28662g) {
            try {
                view.setTransitionVisibility(i10);
            } catch (NoSuchMethodError unused) {
                f28662g = false;
            }
        }
    }
}
