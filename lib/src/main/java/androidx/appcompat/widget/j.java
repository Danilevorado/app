package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CompoundButton;

/* loaded from: classes.dex */
class j {

    /* renamed from: a, reason: collision with root package name */
    private final CompoundButton f1239a;

    /* renamed from: b, reason: collision with root package name */
    private ColorStateList f1240b = null;

    /* renamed from: c, reason: collision with root package name */
    private PorterDuff.Mode f1241c = null;

    /* renamed from: d, reason: collision with root package name */
    private boolean f1242d = false;

    /* renamed from: e, reason: collision with root package name */
    private boolean f1243e = false;

    /* renamed from: f, reason: collision with root package name */
    private boolean f1244f;

    j(CompoundButton compoundButton) {
        this.f1239a = compoundButton;
    }

    void a() {
        Drawable drawableA = androidx.core.widget.c.a(this.f1239a);
        if (drawableA != null) {
            if (this.f1242d || this.f1243e) {
                Drawable drawableMutate = androidx.core.graphics.drawable.a.r(drawableA).mutate();
                if (this.f1242d) {
                    androidx.core.graphics.drawable.a.o(drawableMutate, this.f1240b);
                }
                if (this.f1243e) {
                    androidx.core.graphics.drawable.a.p(drawableMutate, this.f1241c);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(this.f1239a.getDrawableState());
                }
                this.f1239a.setButtonDrawable(drawableMutate);
            }
        }
    }

    int b(int i10) {
        return i10;
    }

    ColorStateList c() {
        return this.f1240b;
    }

    PorterDuff.Mode d() {
        return this.f1241c;
    }

    void e(AttributeSet attributeSet, int i10) {
        boolean z10;
        int iN;
        int iN2;
        Context context = this.f1239a.getContext();
        int[] iArr = f.j.U0;
        z0 z0VarV = z0.v(context, attributeSet, iArr, i10, 0);
        CompoundButton compoundButton = this.f1239a;
        androidx.core.view.w.m0(compoundButton, compoundButton.getContext(), iArr, attributeSet, z0VarV.r(), i10, 0);
        try {
            int i11 = f.j.W0;
            if (!z0VarV.s(i11) || (iN2 = z0VarV.n(i11, 0)) == 0) {
                z10 = false;
            } else {
                try {
                    CompoundButton compoundButton2 = this.f1239a;
                    compoundButton2.setButtonDrawable(g.a.b(compoundButton2.getContext(), iN2));
                    z10 = true;
                } catch (Resources.NotFoundException unused) {
                }
            }
            if (!z10) {
                int i12 = f.j.V0;
                if (z0VarV.s(i12) && (iN = z0VarV.n(i12, 0)) != 0) {
                    CompoundButton compoundButton3 = this.f1239a;
                    compoundButton3.setButtonDrawable(g.a.b(compoundButton3.getContext(), iN));
                }
            }
            int i13 = f.j.X0;
            if (z0VarV.s(i13)) {
                androidx.core.widget.c.c(this.f1239a, z0VarV.c(i13));
            }
            int i14 = f.j.Y0;
            if (z0VarV.s(i14)) {
                androidx.core.widget.c.d(this.f1239a, i0.d(z0VarV.k(i14, -1), null));
            }
        } finally {
            z0VarV.w();
        }
    }

    void f() {
        if (this.f1244f) {
            this.f1244f = false;
        } else {
            this.f1244f = true;
            a();
        }
    }

    void g(ColorStateList colorStateList) {
        this.f1240b = colorStateList;
        this.f1242d = true;
        a();
    }

    void h(PorterDuff.Mode mode) {
        this.f1241c = mode;
        this.f1243e = true;
        a();
    }
}
