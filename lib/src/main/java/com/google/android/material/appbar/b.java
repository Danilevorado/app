package com.google.android.material.appbar;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.h0;
import androidx.core.view.w;
import java.util.List;

/* loaded from: classes.dex */
abstract class b extends c {

    /* renamed from: d, reason: collision with root package name */
    final Rect f20688d;

    /* renamed from: e, reason: collision with root package name */
    final Rect f20689e;

    /* renamed from: f, reason: collision with root package name */
    private int f20690f;

    /* renamed from: g, reason: collision with root package name */
    private int f20691g;

    public b() {
        this.f20688d = new Rect();
        this.f20689e = new Rect();
        this.f20690f = 0;
    }

    public b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f20688d = new Rect();
        this.f20689e = new Rect();
        this.f20690f = 0;
    }

    private static int N(int i10) {
        if (i10 == 0) {
            return 8388659;
        }
        return i10;
    }

    @Override // com.google.android.material.appbar.c
    protected void F(CoordinatorLayout coordinatorLayout, View view, int i10) {
        int bottom;
        View viewH = H(coordinatorLayout.r(view));
        if (viewH != null) {
            CoordinatorLayout.f fVar = (CoordinatorLayout.f) view.getLayoutParams();
            Rect rect = this.f20688d;
            rect.set(coordinatorLayout.getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin, viewH.getBottom() + ((ViewGroup.MarginLayoutParams) fVar).topMargin, (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin, ((coordinatorLayout.getHeight() + viewH.getBottom()) - coordinatorLayout.getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin);
            h0 lastWindowInsets = coordinatorLayout.getLastWindowInsets();
            if (lastWindowInsets != null && w.y(coordinatorLayout) && !w.y(view)) {
                rect.left += lastWindowInsets.i();
                rect.right -= lastWindowInsets.j();
            }
            Rect rect2 = this.f20689e;
            androidx.core.view.e.a(N(fVar.f1997c), view.getMeasuredWidth(), view.getMeasuredHeight(), rect, rect2, i10);
            int I = I(viewH);
            view.layout(rect2.left, rect2.top - I, rect2.right, rect2.bottom - I);
            bottom = rect2.top - viewH.getBottom();
        } else {
            super.F(coordinatorLayout, view, i10);
            bottom = 0;
        }
        this.f20690f = bottom;
    }

    abstract View H(List list);

    final int I(View view) {
        if (this.f20691g == 0) {
            return 0;
        }
        float fJ = J(view);
        int i10 = this.f20691g;
        return a0.a.b((int) (fJ * i10), 0, i10);
    }

    abstract float J(View view);

    public final int K() {
        return this.f20691g;
    }

    int L(View view) {
        return view.getMeasuredHeight();
    }

    final int M() {
        return this.f20690f;
    }

    public final void O(int i10) {
        this.f20691g = i10;
    }

    protected boolean P() {
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean m(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12, int i13) {
        View viewH;
        h0 lastWindowInsets;
        int i14 = view.getLayoutParams().height;
        if ((i14 != -1 && i14 != -2) || (viewH = H(coordinatorLayout.r(view))) == null) {
            return false;
        }
        int size = View.MeasureSpec.getSize(i12);
        if (size <= 0) {
            size = coordinatorLayout.getHeight();
        } else if (w.y(viewH) && (lastWindowInsets = coordinatorLayout.getLastWindowInsets()) != null) {
            size += lastWindowInsets.k() + lastWindowInsets.h();
        }
        int iL = size + L(viewH);
        int measuredHeight = viewH.getMeasuredHeight();
        if (P()) {
            view.setTranslationY(-measuredHeight);
        } else {
            iL -= measuredHeight;
        }
        coordinatorLayout.J(view, i10, i11, View.MeasureSpec.makeMeasureSpec(iL, i14 == -1 ? 1073741824 : Integer.MIN_VALUE), i13);
        return true;
    }
}
