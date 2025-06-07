package z0;

import android.graphics.Matrix;
import android.view.View;

/* loaded from: classes.dex */
abstract class a0 extends z {

    /* renamed from: d, reason: collision with root package name */
    private static boolean f28627d = true;

    /* renamed from: e, reason: collision with root package name */
    private static boolean f28628e = true;

    a0() {
    }

    @Override // z0.e0
    public void g(View view, Matrix matrix) {
        if (f28627d) {
            try {
                view.transformMatrixToGlobal(matrix);
            } catch (NoSuchMethodError unused) {
                f28627d = false;
            }
        }
    }

    @Override // z0.e0
    public void h(View view, Matrix matrix) {
        if (f28628e) {
            try {
                view.transformMatrixToLocal(matrix);
            } catch (NoSuchMethodError unused) {
                f28628e = false;
            }
        }
    }
}
