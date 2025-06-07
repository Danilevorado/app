package z0;

import android.graphics.Matrix;
import android.view.View;

/* loaded from: classes.dex */
class d0 extends c0 {
    d0() {
    }

    @Override // z0.z, z0.e0
    public float b(View view) {
        return view.getTransitionAlpha();
    }

    @Override // z0.b0, z0.e0
    public void d(View view, int i10, int i11, int i12, int i13) {
        view.setLeftTopRightBottom(i10, i11, i12, i13);
    }

    @Override // z0.z, z0.e0
    public void e(View view, float f5) {
        view.setTransitionAlpha(f5);
    }

    @Override // z0.c0, z0.e0
    public void f(View view, int i10) {
        view.setTransitionVisibility(i10);
    }

    @Override // z0.a0, z0.e0
    public void g(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // z0.a0, z0.e0
    public void h(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }
}
