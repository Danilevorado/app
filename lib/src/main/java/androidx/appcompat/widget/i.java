package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CheckedTextView;

/* loaded from: classes.dex */
class i {

    /* renamed from: a, reason: collision with root package name */
    private final CheckedTextView f1228a;

    /* renamed from: b, reason: collision with root package name */
    private ColorStateList f1229b = null;

    /* renamed from: c, reason: collision with root package name */
    private PorterDuff.Mode f1230c = null;

    /* renamed from: d, reason: collision with root package name */
    private boolean f1231d = false;

    /* renamed from: e, reason: collision with root package name */
    private boolean f1232e = false;

    /* renamed from: f, reason: collision with root package name */
    private boolean f1233f;

    i(CheckedTextView checkedTextView) {
        this.f1228a = checkedTextView;
    }

    void a() {
        Drawable drawableA = androidx.core.widget.b.a(this.f1228a);
        if (drawableA != null) {
            if (this.f1231d || this.f1232e) {
                Drawable drawableMutate = androidx.core.graphics.drawable.a.r(drawableA).mutate();
                if (this.f1231d) {
                    androidx.core.graphics.drawable.a.o(drawableMutate, this.f1229b);
                }
                if (this.f1232e) {
                    androidx.core.graphics.drawable.a.p(drawableMutate, this.f1230c);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(this.f1228a.getDrawableState());
                }
                this.f1228a.setCheckMarkDrawable(drawableMutate);
            }
        }
    }

    ColorStateList b() {
        return this.f1229b;
    }

    PorterDuff.Mode c() {
        return this.f1230c;
    }

    void d(AttributeSet attributeSet, int i10) {
        boolean z10;
        int iN;
        int iN2;
        Context context = this.f1228a.getContext();
        int[] iArr = f.j.P0;
        z0 z0VarV = z0.v(context, attributeSet, iArr, i10, 0);
        CheckedTextView checkedTextView = this.f1228a;
        androidx.core.view.w.m0(checkedTextView, checkedTextView.getContext(), iArr, attributeSet, z0VarV.r(), i10, 0);
        try {
            int i11 = f.j.R0;
            if (!z0VarV.s(i11) || (iN2 = z0VarV.n(i11, 0)) == 0) {
                z10 = false;
            } else {
                try {
                    CheckedTextView checkedTextView2 = this.f1228a;
                    checkedTextView2.setCheckMarkDrawable(g.a.b(checkedTextView2.getContext(), iN2));
                    z10 = true;
                } catch (Resources.NotFoundException unused) {
                }
            }
            if (!z10) {
                int i12 = f.j.Q0;
                if (z0VarV.s(i12) && (iN = z0VarV.n(i12, 0)) != 0) {
                    CheckedTextView checkedTextView3 = this.f1228a;
                    checkedTextView3.setCheckMarkDrawable(g.a.b(checkedTextView3.getContext(), iN));
                }
            }
            int i13 = f.j.S0;
            if (z0VarV.s(i13)) {
                androidx.core.widget.b.b(this.f1228a, z0VarV.c(i13));
            }
            int i14 = f.j.T0;
            if (z0VarV.s(i14)) {
                androidx.core.widget.b.c(this.f1228a, i0.d(z0VarV.k(i14, -1), null));
            }
        } finally {
            z0VarV.w();
        }
    }

    void e() {
        if (this.f1233f) {
            this.f1233f = false;
        } else {
            this.f1233f = true;
            a();
        }
    }

    void f(ColorStateList colorStateList) {
        this.f1229b = colorStateList;
        this.f1231d = true;
        a();
    }

    void g(PorterDuff.Mode mode) {
        this.f1230c = mode;
        this.f1232e = true;
        a();
    }
}
