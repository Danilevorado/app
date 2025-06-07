package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;

/* loaded from: classes.dex */
class e {

    /* renamed from: a, reason: collision with root package name */
    private final View f1173a;

    /* renamed from: d, reason: collision with root package name */
    private x0 f1176d;

    /* renamed from: e, reason: collision with root package name */
    private x0 f1177e;

    /* renamed from: f, reason: collision with root package name */
    private x0 f1178f;

    /* renamed from: c, reason: collision with root package name */
    private int f1175c = -1;

    /* renamed from: b, reason: collision with root package name */
    private final k f1174b = k.b();

    e(View view) {
        this.f1173a = view;
    }

    private boolean a(Drawable drawable) {
        if (this.f1178f == null) {
            this.f1178f = new x0();
        }
        x0 x0Var = this.f1178f;
        x0Var.a();
        ColorStateList colorStateListS = androidx.core.view.w.s(this.f1173a);
        if (colorStateListS != null) {
            x0Var.f1403d = true;
            x0Var.f1400a = colorStateListS;
        }
        PorterDuff.Mode modeT = androidx.core.view.w.t(this.f1173a);
        if (modeT != null) {
            x0Var.f1402c = true;
            x0Var.f1401b = modeT;
        }
        if (!x0Var.f1403d && !x0Var.f1402c) {
            return false;
        }
        k.i(drawable, x0Var, this.f1173a.getDrawableState());
        return true;
    }

    private boolean k() {
        return this.f1176d != null;
    }

    void b() {
        Drawable background = this.f1173a.getBackground();
        if (background != null) {
            if (k() && a(background)) {
                return;
            }
            x0 x0Var = this.f1177e;
            if (x0Var != null) {
                k.i(background, x0Var, this.f1173a.getDrawableState());
                return;
            }
            x0 x0Var2 = this.f1176d;
            if (x0Var2 != null) {
                k.i(background, x0Var2, this.f1173a.getDrawableState());
            }
        }
    }

    ColorStateList c() {
        x0 x0Var = this.f1177e;
        if (x0Var != null) {
            return x0Var.f1400a;
        }
        return null;
    }

    PorterDuff.Mode d() {
        x0 x0Var = this.f1177e;
        if (x0Var != null) {
            return x0Var.f1401b;
        }
        return null;
    }

    void e(AttributeSet attributeSet, int i10) {
        Context context = this.f1173a.getContext();
        int[] iArr = f.j.f23533v3;
        z0 z0VarV = z0.v(context, attributeSet, iArr, i10, 0);
        View view = this.f1173a;
        androidx.core.view.w.m0(view, view.getContext(), iArr, attributeSet, z0VarV.r(), i10, 0);
        try {
            int i11 = f.j.f23538w3;
            if (z0VarV.s(i11)) {
                this.f1175c = z0VarV.n(i11, -1);
                ColorStateList colorStateListF = this.f1174b.f(this.f1173a.getContext(), this.f1175c);
                if (colorStateListF != null) {
                    h(colorStateListF);
                }
            }
            int i12 = f.j.f23543x3;
            if (z0VarV.s(i12)) {
                androidx.core.view.w.t0(this.f1173a, z0VarV.c(i12));
            }
            int i13 = f.j.f23548y3;
            if (z0VarV.s(i13)) {
                androidx.core.view.w.u0(this.f1173a, i0.d(z0VarV.k(i13, -1), null));
            }
        } finally {
            z0VarV.w();
        }
    }

    void f(Drawable drawable) {
        this.f1175c = -1;
        h(null);
        b();
    }

    void g(int i10) {
        this.f1175c = i10;
        k kVar = this.f1174b;
        h(kVar != null ? kVar.f(this.f1173a.getContext(), i10) : null);
        b();
    }

    void h(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f1176d == null) {
                this.f1176d = new x0();
            }
            x0 x0Var = this.f1176d;
            x0Var.f1400a = colorStateList;
            x0Var.f1403d = true;
        } else {
            this.f1176d = null;
        }
        b();
    }

    void i(ColorStateList colorStateList) {
        if (this.f1177e == null) {
            this.f1177e = new x0();
        }
        x0 x0Var = this.f1177e;
        x0Var.f1400a = colorStateList;
        x0Var.f1403d = true;
        b();
    }

    void j(PorterDuff.Mode mode) {
        if (this.f1177e == null) {
            this.f1177e = new x0();
        }
        x0 x0Var = this.f1177e;
        x0Var.f1401b = mode;
        x0Var.f1402c = true;
        b();
    }
}
