package com.google.android.material.behavior;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* loaded from: classes.dex */
public class HideBottomViewOnScrollBehavior<V extends View> extends CoordinatorLayout.c {

    /* renamed from: a, reason: collision with root package name */
    private int f20703a;

    /* renamed from: b, reason: collision with root package name */
    private int f20704b;

    /* renamed from: c, reason: collision with root package name */
    private int f20705c;

    /* renamed from: d, reason: collision with root package name */
    private ViewPropertyAnimator f20706d;

    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            HideBottomViewOnScrollBehavior.this.f20706d = null;
        }
    }

    public HideBottomViewOnScrollBehavior() {
        this.f20703a = 0;
        this.f20704b = 2;
        this.f20705c = 0;
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f20703a = 0;
        this.f20704b = 2;
        this.f20705c = 0;
    }

    private void F(View view, int i10, long j10, TimeInterpolator timeInterpolator) {
        this.f20706d = view.animate().translationY(i10).setInterpolator(timeInterpolator).setDuration(j10).setListener(new a());
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean A(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i10, int i11) {
        return i10 == 2;
    }

    public boolean G() {
        return this.f20704b == 1;
    }

    public boolean H() {
        return this.f20704b == 2;
    }

    public void I(View view) {
        J(view, true);
    }

    public void J(View view, boolean z10) {
        if (G()) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.f20706d;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            view.clearAnimation();
        }
        this.f20704b = 1;
        int i10 = this.f20703a + this.f20705c;
        if (z10) {
            F(view, i10, 175L, d5.a.f22933c);
        } else {
            view.setTranslationY(i10);
        }
    }

    public void K(View view) {
        L(view, true);
    }

    public void L(View view, boolean z10) {
        if (H()) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.f20706d;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            view.clearAnimation();
        }
        this.f20704b = 2;
        if (z10) {
            F(view, 0, 225L, d5.a.f22934d);
        } else {
            view.setTranslationY(0);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean l(CoordinatorLayout coordinatorLayout, View view, int i10) {
        this.f20703a = view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).bottomMargin;
        return super.l(coordinatorLayout, view, i10);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void t(CoordinatorLayout coordinatorLayout, View view, View view2, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        if (i11 > 0) {
            I(view);
        } else if (i11 < 0) {
            K(view);
        }
    }
}
