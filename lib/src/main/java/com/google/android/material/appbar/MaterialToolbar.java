package com.google.android.material.appbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.w;
import c5.j;
import c5.k;
import com.google.android.material.internal.l;
import com.google.android.material.internal.m;
import s5.g;
import s5.h;

/* loaded from: classes.dex */
public class MaterialToolbar extends Toolbar {

    /* renamed from: o0, reason: collision with root package name */
    private static final int f20671o0 = j.f4816q;

    /* renamed from: p0, reason: collision with root package name */
    private static final ImageView.ScaleType[] f20672p0 = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};

    /* renamed from: j0, reason: collision with root package name */
    private Integer f20673j0;

    /* renamed from: k0, reason: collision with root package name */
    private boolean f20674k0;

    /* renamed from: l0, reason: collision with root package name */
    private boolean f20675l0;

    /* renamed from: m0, reason: collision with root package name */
    private ImageView.ScaleType f20676m0;

    /* renamed from: n0, reason: collision with root package name */
    private Boolean f20677n0;

    public MaterialToolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, c5.b.F);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialToolbar(Context context, AttributeSet attributeSet, int i10) {
        int i11 = f20671o0;
        super(t5.a.c(context, attributeSet, i10, i11), attributeSet, i10);
        Context context2 = getContext();
        TypedArray typedArrayH = l.h(context2, attributeSet, k.f4994w3, i10, i11, new int[0]);
        int i12 = k.f5018z3;
        if (typedArrayH.hasValue(i12)) {
            setNavigationIconTint(typedArrayH.getColor(i12, -1));
        }
        this.f20674k0 = typedArrayH.getBoolean(k.B3, false);
        this.f20675l0 = typedArrayH.getBoolean(k.A3, false);
        int i13 = typedArrayH.getInt(k.f5010y3, -1);
        if (i13 >= 0) {
            ImageView.ScaleType[] scaleTypeArr = f20672p0;
            if (i13 < scaleTypeArr.length) {
                this.f20676m0 = scaleTypeArr[i13];
            }
        }
        int i14 = k.f5002x3;
        if (typedArrayH.hasValue(i14)) {
            this.f20677n0 = Boolean.valueOf(typedArrayH.getBoolean(i14, false));
        }
        typedArrayH.recycle();
        T(context2);
    }

    private Pair S(TextView textView, TextView textView2) {
        int measuredWidth = getMeasuredWidth();
        int i10 = measuredWidth / 2;
        int paddingLeft = getPaddingLeft();
        int paddingRight = measuredWidth - getPaddingRight();
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8 && childAt != textView && childAt != textView2) {
                if (childAt.getRight() < i10 && childAt.getRight() > paddingLeft) {
                    paddingLeft = childAt.getRight();
                }
                if (childAt.getLeft() > i10 && childAt.getLeft() < paddingRight) {
                    paddingRight = childAt.getLeft();
                }
            }
        }
        return new Pair(Integer.valueOf(paddingLeft), Integer.valueOf(paddingRight));
    }

    private void T(Context context) {
        Drawable background = getBackground();
        if (background == null || (background instanceof ColorDrawable)) {
            g gVar = new g();
            gVar.V(ColorStateList.valueOf(background != null ? ((ColorDrawable) background).getColor() : 0));
            gVar.L(context);
            gVar.U(w.w(this));
            w.s0(this, gVar);
        }
    }

    private void U(View view, Pair pair) {
        int measuredWidth = getMeasuredWidth();
        int measuredWidth2 = view.getMeasuredWidth();
        int i10 = (measuredWidth / 2) - (measuredWidth2 / 2);
        int i11 = measuredWidth2 + i10;
        int iMax = Math.max(Math.max(((Integer) pair.first).intValue() - i10, 0), Math.max(i11 - ((Integer) pair.second).intValue(), 0));
        if (iMax > 0) {
            i10 += iMax;
            i11 -= iMax;
            view.measure(View.MeasureSpec.makeMeasureSpec(i11 - i10, 1073741824), view.getMeasuredHeightAndState());
        }
        view.layout(i10, view.getTop(), i11, view.getBottom());
    }

    private void V() {
        if (this.f20674k0 || this.f20675l0) {
            TextView textViewE = m.e(this);
            TextView textViewC = m.c(this);
            if (textViewE == null && textViewC == null) {
                return;
            }
            Pair pairS = S(textViewE, textViewC);
            if (this.f20674k0 && textViewE != null) {
                U(textViewE, pairS);
            }
            if (!this.f20675l0 || textViewC == null) {
                return;
            }
            U(textViewC, pairS);
        }
    }

    private Drawable W(Drawable drawable) {
        if (drawable == null || this.f20673j0 == null) {
            return drawable;
        }
        Drawable drawableR = androidx.core.graphics.drawable.a.r(drawable.mutate());
        androidx.core.graphics.drawable.a.n(drawableR, this.f20673j0.intValue());
        return drawableR;
    }

    private void X() {
        ImageView imageViewB = m.b(this);
        if (imageViewB != null) {
            Boolean bool = this.f20677n0;
            if (bool != null) {
                imageViewB.setAdjustViewBounds(bool.booleanValue());
            }
            ImageView.ScaleType scaleType = this.f20676m0;
            if (scaleType != null) {
                imageViewB.setScaleType(scaleType);
            }
        }
    }

    public ImageView.ScaleType getLogoScaleType() {
        return this.f20676m0;
    }

    public Integer getNavigationIconTint() {
        return this.f20673j0;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        h.e(this);
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        V();
        X();
    }

    @Override // android.view.View
    public void setElevation(float f5) {
        super.setElevation(f5);
        h.d(this, f5);
    }

    public void setLogoAdjustViewBounds(boolean z10) {
        Boolean bool = this.f20677n0;
        if (bool == null || bool.booleanValue() != z10) {
            this.f20677n0 = Boolean.valueOf(z10);
            requestLayout();
        }
    }

    public void setLogoScaleType(ImageView.ScaleType scaleType) {
        if (this.f20676m0 != scaleType) {
            this.f20676m0 = scaleType;
            requestLayout();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(Drawable drawable) {
        super.setNavigationIcon(W(drawable));
    }

    public void setNavigationIconTint(int i10) {
        this.f20673j0 = Integer.valueOf(i10);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    public void setSubtitleCentered(boolean z10) {
        if (this.f20675l0 != z10) {
            this.f20675l0 = z10;
            requestLayout();
        }
    }

    public void setTitleCentered(boolean z10) {
        if (this.f20674k0 != z10) {
            this.f20674k0 = z10;
            requestLayout();
        }
    }
}
