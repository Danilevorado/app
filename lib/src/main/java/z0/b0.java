package z0;

import android.view.View;

/* loaded from: classes.dex */
abstract class b0 extends a0 {

    /* renamed from: f, reason: collision with root package name */
    private static boolean f28629f = true;

    b0() {
    }

    @Override // z0.e0
    public void d(View view, int i10, int i11, int i12, int i13) {
        if (f28629f) {
            try {
                view.setLeftTopRightBottom(i10, i11, i12, i13);
            } catch (NoSuchMethodError unused) {
                f28629f = false;
            }
        }
    }
}
