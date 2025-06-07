package com.google.android.material.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.w;

/* loaded from: classes.dex */
public abstract class e extends ViewGroup {

    /* renamed from: m, reason: collision with root package name */
    private int f21065m;

    /* renamed from: n, reason: collision with root package name */
    private int f21066n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f21067o;

    /* renamed from: p, reason: collision with root package name */
    private int f21068p;

    public e(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f21067o = false;
        d(context, attributeSet);
    }

    private static int a(int i10, int i11, int i12) {
        return i11 != Integer.MIN_VALUE ? i11 != 1073741824 ? i12 : i10 : Math.min(i12, i10);
    }

    private void d(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, c5.k.E1, 0, 0);
        this.f21065m = typedArrayObtainStyledAttributes.getDimensionPixelSize(c5.k.G1, 0);
        this.f21066n = typedArrayObtainStyledAttributes.getDimensionPixelSize(c5.k.F1, 0);
        typedArrayObtainStyledAttributes.recycle();
    }

    public int b(View view) {
        Object tag = view.getTag(c5.f.F);
        if (tag instanceof Integer) {
            return ((Integer) tag).intValue();
        }
        return -1;
    }

    public boolean c() {
        return this.f21067o;
    }

    protected int getItemSpacing() {
        return this.f21066n;
    }

    protected int getLineSpacing() {
        return this.f21065m;
    }

    protected int getRowCount() {
        return this.f21068p;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int iA;
        int iB;
        if (getChildCount() == 0) {
            this.f21068p = 0;
            return;
        }
        this.f21068p = 1;
        boolean z11 = w.B(this) == 1;
        int paddingRight = z11 ? getPaddingRight() : getPaddingLeft();
        int paddingLeft = z11 ? getPaddingLeft() : getPaddingRight();
        int paddingTop = getPaddingTop();
        int i14 = (i12 - i10) - paddingLeft;
        int measuredWidth = paddingRight;
        int i15 = paddingTop;
        for (int i16 = 0; i16 < getChildCount(); i16++) {
            View childAt = getChildAt(i16);
            if (childAt.getVisibility() == 8) {
                childAt.setTag(c5.f.F, -1);
            } else {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    iB = androidx.core.view.h.b(marginLayoutParams);
                    iA = androidx.core.view.h.a(marginLayoutParams);
                } else {
                    iA = 0;
                    iB = 0;
                }
                int measuredWidth2 = measuredWidth + iB + childAt.getMeasuredWidth();
                if (!this.f21067o && measuredWidth2 > i14) {
                    i15 = this.f21065m + paddingTop;
                    this.f21068p++;
                    measuredWidth = paddingRight;
                }
                childAt.setTag(c5.f.F, Integer.valueOf(this.f21068p - 1));
                int i17 = measuredWidth + iB;
                int measuredWidth3 = childAt.getMeasuredWidth() + i17;
                int measuredHeight = childAt.getMeasuredHeight() + i15;
                if (z11) {
                    i17 = i14 - measuredWidth3;
                    measuredWidth3 = (i14 - measuredWidth) - iB;
                }
                childAt.layout(i17, i15, measuredWidth3, measuredHeight);
                measuredWidth += iB + iA + childAt.getMeasuredWidth() + this.f21066n;
                paddingTop = measuredHeight;
            }
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        int paddingLeft;
        int size = View.MeasureSpec.getSize(i10);
        int mode = View.MeasureSpec.getMode(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        int mode2 = View.MeasureSpec.getMode(i11);
        int i14 = (mode == Integer.MIN_VALUE || mode == 1073741824) ? size : Integer.MAX_VALUE;
        int paddingLeft2 = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = i14 - getPaddingRight();
        int i15 = paddingTop;
        int i16 = 0;
        for (int i17 = 0; i17 < getChildCount(); i17++) {
            View childAt = getChildAt(i17);
            if (childAt.getVisibility() != 8) {
                measureChild(childAt, i10, i11);
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    i12 = marginLayoutParams.leftMargin + 0;
                    i13 = marginLayoutParams.rightMargin + 0;
                } else {
                    i12 = 0;
                    i13 = 0;
                }
                int i18 = paddingLeft2;
                if (paddingLeft2 + i12 + childAt.getMeasuredWidth() <= paddingRight || c()) {
                    paddingLeft = i18;
                } else {
                    paddingLeft = getPaddingLeft();
                    i15 = this.f21065m + paddingTop;
                }
                int measuredWidth = paddingLeft + i12 + childAt.getMeasuredWidth();
                int measuredHeight = i15 + childAt.getMeasuredHeight();
                if (measuredWidth > i16) {
                    i16 = measuredWidth;
                }
                paddingLeft2 = paddingLeft + i12 + i13 + childAt.getMeasuredWidth() + this.f21066n;
                if (i17 == getChildCount() - 1) {
                    i16 += i13;
                }
                paddingTop = measuredHeight;
            }
        }
        setMeasuredDimension(a(size, mode, i16 + getPaddingRight()), a(size2, mode2, paddingTop + getPaddingBottom()));
    }

    protected void setItemSpacing(int i10) {
        this.f21066n = i10;
    }

    protected void setLineSpacing(int i10) {
        this.f21065m = i10;
    }

    public void setSingleLine(boolean z10) {
        this.f21067o = z10;
    }
}
