package com.google.android.material.snackbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.w;
import c5.d;
import c5.k;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.internal.n;
import com.google.android.material.snackbar.a;
import p5.c;

/* loaded from: classes.dex */
public abstract class BaseTransientBottomBar {

    public static class Behavior extends SwipeDismissBehavior<View> {

        /* renamed from: k, reason: collision with root package name */
        private final a f21100k = new a(this);

        @Override // com.google.android.material.behavior.SwipeDismissBehavior
        public boolean E(View view) {
            return this.f21100k.a(view);
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            this.f21100k.b(coordinatorLayout, view, motionEvent);
            return super.k(coordinatorLayout, view, motionEvent);
        }
    }

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private a.b f21101a;

        public a(SwipeDismissBehavior swipeDismissBehavior) {
            swipeDismissBehavior.K(0.1f);
            swipeDismissBehavior.J(0.6f);
            swipeDismissBehavior.L(0);
        }

        public boolean a(View view) {
            return view instanceof b;
        }

        public void b(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                if (coordinatorLayout.B(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
                    com.google.android.material.snackbar.a.b().e(this.f21101a);
                }
            } else if (actionMasked == 1 || actionMasked == 3) {
                com.google.android.material.snackbar.a.b().f(this.f21101a);
            }
        }
    }

    protected static class b extends FrameLayout {

        /* renamed from: v, reason: collision with root package name */
        private static final View.OnTouchListener f21102v = new a();

        /* renamed from: m, reason: collision with root package name */
        private int f21103m;

        /* renamed from: n, reason: collision with root package name */
        private final float f21104n;

        /* renamed from: o, reason: collision with root package name */
        private final float f21105o;

        /* renamed from: p, reason: collision with root package name */
        private final int f21106p;

        /* renamed from: q, reason: collision with root package name */
        private final int f21107q;

        /* renamed from: r, reason: collision with root package name */
        private ColorStateList f21108r;

        /* renamed from: s, reason: collision with root package name */
        private PorterDuff.Mode f21109s;

        /* renamed from: t, reason: collision with root package name */
        private Rect f21110t;

        /* renamed from: u, reason: collision with root package name */
        private boolean f21111u;

        class a implements View.OnTouchListener {
            a() {
            }

            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                return true;
            }
        }

        protected b(Context context, AttributeSet attributeSet) {
            super(t5.a.c(context, attributeSet, 0, 0), attributeSet);
            Context context2 = getContext();
            TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, k.f4955r4);
            if (typedArrayObtainStyledAttributes.hasValue(k.f5011y4)) {
                w.w0(this, typedArrayObtainStyledAttributes.getDimensionPixelSize(r1, 0));
            }
            this.f21103m = typedArrayObtainStyledAttributes.getInt(k.f4979u4, 0);
            this.f21104n = typedArrayObtainStyledAttributes.getFloat(k.f4987v4, 1.0f);
            setBackgroundTintList(c.a(context2, typedArrayObtainStyledAttributes, k.f4995w4));
            setBackgroundTintMode(n.f(typedArrayObtainStyledAttributes.getInt(k.f5003x4, -1), PorterDuff.Mode.SRC_IN));
            this.f21105o = typedArrayObtainStyledAttributes.getFloat(k.f4971t4, 1.0f);
            this.f21106p = typedArrayObtainStyledAttributes.getDimensionPixelSize(k.f4963s4, -1);
            this.f21107q = typedArrayObtainStyledAttributes.getDimensionPixelSize(k.f5019z4, -1);
            typedArrayObtainStyledAttributes.recycle();
            setOnTouchListener(f21102v);
            setFocusable(true);
            if (getBackground() == null) {
                w.s0(this, a());
            }
        }

        private Drawable a() throws Resources.NotFoundException {
            float dimension = getResources().getDimension(d.L);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            gradientDrawable.setCornerRadius(dimension);
            gradientDrawable.setColor(i5.a.i(this, c5.b.f4684l, c5.b.f4681i, getBackgroundOverlayColorAlpha()));
            if (this.f21108r == null) {
                return androidx.core.graphics.drawable.a.r(gradientDrawable);
            }
            Drawable drawableR = androidx.core.graphics.drawable.a.r(gradientDrawable);
            androidx.core.graphics.drawable.a.o(drawableR, this.f21108r);
            return drawableR;
        }

        private void b(ViewGroup.MarginLayoutParams marginLayoutParams) {
            this.f21110t = new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        }

        private void setBaseTransientBottomBar(BaseTransientBottomBar baseTransientBottomBar) {
        }

        float getActionTextColorAlpha() {
            return this.f21105o;
        }

        int getAnimationMode() {
            return this.f21103m;
        }

        float getBackgroundOverlayColorAlpha() {
            return this.f21104n;
        }

        int getMaxInlineActionWidth() {
            return this.f21107q;
        }

        int getMaxWidth() {
            return this.f21106p;
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void onAttachedToWindow() {
            super.onAttachedToWindow();
            w.l0(this);
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void onDetachedFromWindow() {
            super.onDetachedFromWindow();
        }

        @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
        protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
            super.onLayout(z10, i10, i11, i12, i13);
        }

        @Override // android.widget.FrameLayout, android.view.View
        protected void onMeasure(int i10, int i11) {
            super.onMeasure(i10, i11);
            if (this.f21106p > 0) {
                int measuredWidth = getMeasuredWidth();
                int i12 = this.f21106p;
                if (measuredWidth > i12) {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(i12, 1073741824), i11);
                }
            }
        }

        void setAnimationMode(int i10) {
            this.f21103m = i10;
        }

        @Override // android.view.View
        public void setBackground(Drawable drawable) {
            setBackgroundDrawable(drawable);
        }

        @Override // android.view.View
        public void setBackgroundDrawable(Drawable drawable) {
            if (drawable != null && this.f21108r != null) {
                drawable = androidx.core.graphics.drawable.a.r(drawable.mutate());
                androidx.core.graphics.drawable.a.o(drawable, this.f21108r);
                androidx.core.graphics.drawable.a.p(drawable, this.f21109s);
            }
            super.setBackgroundDrawable(drawable);
        }

        @Override // android.view.View
        public void setBackgroundTintList(ColorStateList colorStateList) {
            this.f21108r = colorStateList;
            if (getBackground() != null) {
                Drawable drawableR = androidx.core.graphics.drawable.a.r(getBackground().mutate());
                androidx.core.graphics.drawable.a.o(drawableR, colorStateList);
                androidx.core.graphics.drawable.a.p(drawableR, this.f21109s);
                if (drawableR != getBackground()) {
                    super.setBackgroundDrawable(drawableR);
                }
            }
        }

        @Override // android.view.View
        public void setBackgroundTintMode(PorterDuff.Mode mode) {
            this.f21109s = mode;
            if (getBackground() != null) {
                Drawable drawableR = androidx.core.graphics.drawable.a.r(getBackground().mutate());
                androidx.core.graphics.drawable.a.p(drawableR, mode);
                if (drawableR != getBackground()) {
                    super.setBackgroundDrawable(drawableR);
                }
            }
        }

        @Override // android.view.View
        public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
            super.setLayoutParams(layoutParams);
            if (this.f21111u || !(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                return;
            }
            b((ViewGroup.MarginLayoutParams) layoutParams);
        }

        @Override // android.view.View
        public void setOnClickListener(View.OnClickListener onClickListener) {
            setOnTouchListener(onClickListener != null ? null : f21102v);
            super.setOnClickListener(onClickListener);
        }
    }
}
