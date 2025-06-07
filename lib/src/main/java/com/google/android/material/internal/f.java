package com.google.android.material.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import androidx.appcompat.widget.m0;

/* loaded from: classes.dex */
public abstract class f extends m0 {
    private Drawable B;
    private final Rect C;
    private final Rect D;
    private int E;
    protected boolean F;
    boolean G;

    public f(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.C = new Rect();
        this.D = new Rect();
        this.E = 119;
        this.F = true;
        this.G = false;
        TypedArray typedArrayH = l.h(context, attributeSet, c5.k.J1, i10, 0, new int[0]);
        this.E = typedArrayH.getInt(c5.k.L1, this.E);
        Drawable drawable = typedArrayH.getDrawable(c5.k.K1);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.F = typedArrayH.getBoolean(c5.k.M1, true);
        typedArrayH.recycle();
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.B;
        if (drawable != null) {
            if (this.G) {
                this.G = false;
                Rect rect = this.C;
                Rect rect2 = this.D;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                if (this.F) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                Gravity.apply(this.E, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    @Override // android.view.View
    public void drawableHotspotChanged(float f5, float f10) {
        super.drawableHotspotChanged(f5, f10);
        Drawable drawable = this.B;
        if (drawable != null) {
            drawable.setHotspot(f5, f10);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.B;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        this.B.setState(getDrawableState());
    }

    @Override // android.view.View
    public Drawable getForeground() {
        return this.B;
    }

    @Override // android.view.View
    public int getForegroundGravity() {
        return this.E;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.B;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // androidx.appcompat.widget.m0, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.G = z10 | this.G;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.G = true;
    }

    @Override // android.view.View
    public void setForeground(Drawable drawable) {
        Drawable drawable2 = this.B;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
                unscheduleDrawable(this.B);
            }
            this.B = drawable;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.E == 119) {
                    drawable.getPadding(new Rect());
                }
            } else {
                setWillNotDraw(true);
            }
            requestLayout();
            invalidate();
        }
    }

    @Override // android.view.View
    public void setForegroundGravity(int i10) {
        if (this.E != i10) {
            if ((8388615 & i10) == 0) {
                i10 |= 8388611;
            }
            if ((i10 & 112) == 0) {
                i10 |= 48;
            }
            this.E = i10;
            if (i10 == 119 && this.B != null) {
                this.B.getPadding(new Rect());
            }
            requestLayout();
        }
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.B;
    }
}
