package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import android.widget.ImageView;

/* loaded from: classes.dex */
public class q {

    /* renamed from: a, reason: collision with root package name */
    private final ImageView f1337a;

    /* renamed from: b, reason: collision with root package name */
    private x0 f1338b;

    /* renamed from: c, reason: collision with root package name */
    private x0 f1339c;

    /* renamed from: d, reason: collision with root package name */
    private x0 f1340d;

    /* renamed from: e, reason: collision with root package name */
    private int f1341e = 0;

    public q(ImageView imageView) {
        this.f1337a = imageView;
    }

    private boolean a(Drawable drawable) {
        if (this.f1340d == null) {
            this.f1340d = new x0();
        }
        x0 x0Var = this.f1340d;
        x0Var.a();
        ColorStateList colorStateListA = androidx.core.widget.e.a(this.f1337a);
        if (colorStateListA != null) {
            x0Var.f1403d = true;
            x0Var.f1400a = colorStateListA;
        }
        PorterDuff.Mode modeB = androidx.core.widget.e.b(this.f1337a);
        if (modeB != null) {
            x0Var.f1402c = true;
            x0Var.f1401b = modeB;
        }
        if (!x0Var.f1403d && !x0Var.f1402c) {
            return false;
        }
        k.i(drawable, x0Var, this.f1337a.getDrawableState());
        return true;
    }

    private boolean l() {
        return this.f1338b != null;
    }

    void b() {
        if (this.f1337a.getDrawable() != null) {
            this.f1337a.getDrawable().setLevel(this.f1341e);
        }
    }

    void c() {
        Drawable drawable = this.f1337a.getDrawable();
        if (drawable != null) {
            i0.b(drawable);
        }
        if (drawable != null) {
            if (l() && a(drawable)) {
                return;
            }
            x0 x0Var = this.f1339c;
            if (x0Var != null) {
                k.i(drawable, x0Var, this.f1337a.getDrawableState());
                return;
            }
            x0 x0Var2 = this.f1338b;
            if (x0Var2 != null) {
                k.i(drawable, x0Var2, this.f1337a.getDrawableState());
            }
        }
    }

    ColorStateList d() {
        x0 x0Var = this.f1339c;
        if (x0Var != null) {
            return x0Var.f1400a;
        }
        return null;
    }

    PorterDuff.Mode e() {
        x0 x0Var = this.f1339c;
        if (x0Var != null) {
            return x0Var.f1401b;
        }
        return null;
    }

    boolean f() {
        return !(this.f1337a.getBackground() instanceof RippleDrawable);
    }

    public void g(AttributeSet attributeSet, int i10) {
        int iN;
        Context context = this.f1337a.getContext();
        int[] iArr = f.j.P;
        z0 z0VarV = z0.v(context, attributeSet, iArr, i10, 0);
        ImageView imageView = this.f1337a;
        androidx.core.view.w.m0(imageView, imageView.getContext(), iArr, attributeSet, z0VarV.r(), i10, 0);
        try {
            Drawable drawable = this.f1337a.getDrawable();
            if (drawable == null && (iN = z0VarV.n(f.j.Q, -1)) != -1 && (drawable = g.a.b(this.f1337a.getContext(), iN)) != null) {
                this.f1337a.setImageDrawable(drawable);
            }
            if (drawable != null) {
                i0.b(drawable);
            }
            int i11 = f.j.R;
            if (z0VarV.s(i11)) {
                androidx.core.widget.e.c(this.f1337a, z0VarV.c(i11));
            }
            int i12 = f.j.S;
            if (z0VarV.s(i12)) {
                androidx.core.widget.e.d(this.f1337a, i0.d(z0VarV.k(i12, -1), null));
            }
        } finally {
            z0VarV.w();
        }
    }

    void h(Drawable drawable) {
        this.f1341e = drawable.getLevel();
    }

    public void i(int i10) {
        if (i10 != 0) {
            Drawable drawableB = g.a.b(this.f1337a.getContext(), i10);
            if (drawableB != null) {
                i0.b(drawableB);
            }
            this.f1337a.setImageDrawable(drawableB);
        } else {
            this.f1337a.setImageDrawable(null);
        }
        c();
    }

    void j(ColorStateList colorStateList) {
        if (this.f1339c == null) {
            this.f1339c = new x0();
        }
        x0 x0Var = this.f1339c;
        x0Var.f1400a = colorStateList;
        x0Var.f1403d = true;
        c();
    }

    void k(PorterDuff.Mode mode) {
        if (this.f1339c == null) {
            this.f1339c = new x0();
        }
        x0 x0Var = this.f1339c;
        x0Var.f1401b = mode;
        x0Var.f1402c = true;
        c();
    }
}
