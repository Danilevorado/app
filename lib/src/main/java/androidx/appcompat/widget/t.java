package androidx.appcompat.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.PopupWindow;

/* loaded from: classes.dex */
class t extends PopupWindow {

    /* renamed from: b, reason: collision with root package name */
    private static final boolean f1368b = false;

    /* renamed from: a, reason: collision with root package name */
    private boolean f1369a;

    public t(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        a(context, attributeSet, i10, i11);
    }

    private void a(Context context, AttributeSet attributeSet, int i10, int i11) {
        z0 z0VarV = z0.v(context, attributeSet, f.j.Y1, i10, i11);
        int i12 = f.j.f23427a2;
        if (z0VarV.s(i12)) {
            b(z0VarV.a(i12, false));
        }
        setBackgroundDrawable(z0VarV.g(f.j.Z1));
        z0VarV.w();
    }

    private void b(boolean z10) {
        if (f1368b) {
            this.f1369a = z10;
        } else {
            androidx.core.widget.h.a(this, z10);
        }
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i10, int i11) {
        if (f1368b && this.f1369a) {
            i11 -= view.getHeight();
        }
        super.showAsDropDown(view, i10, i11);
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i10, int i11, int i12) {
        if (f1368b && this.f1369a) {
            i11 -= view.getHeight();
        }
        super.showAsDropDown(view, i10, i11, i12);
    }

    @Override // android.widget.PopupWindow
    public void update(View view, int i10, int i11, int i12, int i13) {
        if (f1368b && this.f1369a) {
            i11 -= view.getHeight();
        }
        super.update(view, i10, i11, i12, i13);
    }
}
