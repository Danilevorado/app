package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;

/* loaded from: classes.dex */
class z extends u {

    /* renamed from: d, reason: collision with root package name */
    private final SeekBar f1406d;

    /* renamed from: e, reason: collision with root package name */
    private Drawable f1407e;

    /* renamed from: f, reason: collision with root package name */
    private ColorStateList f1408f;

    /* renamed from: g, reason: collision with root package name */
    private PorterDuff.Mode f1409g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f1410h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f1411i;

    z(SeekBar seekBar) {
        super(seekBar);
        this.f1408f = null;
        this.f1409g = null;
        this.f1410h = false;
        this.f1411i = false;
        this.f1406d = seekBar;
    }

    private void f() {
        Drawable drawable = this.f1407e;
        if (drawable != null) {
            if (this.f1410h || this.f1411i) {
                Drawable drawableR = androidx.core.graphics.drawable.a.r(drawable.mutate());
                this.f1407e = drawableR;
                if (this.f1410h) {
                    androidx.core.graphics.drawable.a.o(drawableR, this.f1408f);
                }
                if (this.f1411i) {
                    androidx.core.graphics.drawable.a.p(this.f1407e, this.f1409g);
                }
                if (this.f1407e.isStateful()) {
                    this.f1407e.setState(this.f1406d.getDrawableState());
                }
            }
        }
    }

    @Override // androidx.appcompat.widget.u
    void c(AttributeSet attributeSet, int i10) {
        super.c(attributeSet, i10);
        Context context = this.f1406d.getContext();
        int[] iArr = f.j.T;
        z0 z0VarV = z0.v(context, attributeSet, iArr, i10, 0);
        SeekBar seekBar = this.f1406d;
        androidx.core.view.w.m0(seekBar, seekBar.getContext(), iArr, attributeSet, z0VarV.r(), i10, 0);
        Drawable drawableH = z0VarV.h(f.j.U);
        if (drawableH != null) {
            this.f1406d.setThumb(drawableH);
        }
        j(z0VarV.g(f.j.V));
        int i11 = f.j.X;
        if (z0VarV.s(i11)) {
            this.f1409g = i0.d(z0VarV.k(i11, -1), this.f1409g);
            this.f1411i = true;
        }
        int i12 = f.j.W;
        if (z0VarV.s(i12)) {
            this.f1408f = z0VarV.c(i12);
            this.f1410h = true;
        }
        z0VarV.w();
        f();
    }

    void g(Canvas canvas) {
        if (this.f1407e != null) {
            int max = this.f1406d.getMax();
            if (max > 1) {
                int intrinsicWidth = this.f1407e.getIntrinsicWidth();
                int intrinsicHeight = this.f1407e.getIntrinsicHeight();
                int i10 = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i11 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.f1407e.setBounds(-i10, -i11, i10, i11);
                float width = ((this.f1406d.getWidth() - this.f1406d.getPaddingLeft()) - this.f1406d.getPaddingRight()) / max;
                int iSave = canvas.save();
                canvas.translate(this.f1406d.getPaddingLeft(), this.f1406d.getHeight() / 2);
                for (int i12 = 0; i12 <= max; i12++) {
                    this.f1407e.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(iSave);
            }
        }
    }

    void h() {
        Drawable drawable = this.f1407e;
        if (drawable != null && drawable.isStateful() && drawable.setState(this.f1406d.getDrawableState())) {
            this.f1406d.invalidateDrawable(drawable);
        }
    }

    void i() {
        Drawable drawable = this.f1407e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    void j(Drawable drawable) {
        Drawable drawable2 = this.f1407e;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f1407e = drawable;
        if (drawable != null) {
            drawable.setCallback(this.f1406d);
            androidx.core.graphics.drawable.a.m(drawable, androidx.core.view.w.B(this.f1406d));
            if (drawable.isStateful()) {
                drawable.setState(this.f1406d.getDrawableState());
            }
            f();
        }
        this.f1406d.invalidate();
    }
}
