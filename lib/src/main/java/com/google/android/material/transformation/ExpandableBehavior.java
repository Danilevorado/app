package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.w;
import java.util.List;

@Deprecated
/* loaded from: classes.dex */
public abstract class ExpandableBehavior extends CoordinatorLayout.c {

    /* renamed from: a, reason: collision with root package name */
    private int f21316a;

    class a implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ View f21317m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ int f21318n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ m5.a f21319o;

        a(View view, int i10, m5.a aVar) {
            this.f21317m = view;
            this.f21318n = i10;
            this.f21319o = aVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            this.f21317m.getViewTreeObserver().removeOnPreDrawListener(this);
            if (ExpandableBehavior.this.f21316a == this.f21318n) {
                ExpandableBehavior expandableBehavior = ExpandableBehavior.this;
                m5.a aVar = this.f21319o;
                expandableBehavior.H((View) aVar, this.f21317m, aVar.a(), false);
            }
            return false;
        }
    }

    public ExpandableBehavior() {
        this.f21316a = 0;
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f21316a = 0;
    }

    private boolean F(boolean z10) {
        if (!z10) {
            return this.f21316a == 1;
        }
        int i10 = this.f21316a;
        return i10 == 0 || i10 == 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected m5.a G(CoordinatorLayout coordinatorLayout, View view) {
        List listR = coordinatorLayout.r(view);
        int size = listR.size();
        for (int i10 = 0; i10 < size; i10++) {
            View view2 = (View) listR.get(i10);
            if (e(coordinatorLayout, view, view2)) {
                return (m5.a) view2;
            }
        }
        return null;
    }

    protected abstract boolean H(View view, View view2, boolean z10, boolean z11);

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public abstract boolean e(CoordinatorLayout coordinatorLayout, View view, View view2);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
        m5.a aVar = (m5.a) view2;
        if (!F(aVar.a())) {
            return false;
        }
        this.f21316a = aVar.a() ? 1 : 2;
        return H((View) aVar, view, aVar.a(), true);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean l(CoordinatorLayout coordinatorLayout, View view, int i10) {
        m5.a aVarG;
        if (w.S(view) || (aVarG = G(coordinatorLayout, view)) == null || !F(aVarG.a())) {
            return false;
        }
        int i11 = aVarG.a() ? 1 : 2;
        this.f21316a = i11;
        view.getViewTreeObserver().addOnPreDrawListener(new a(view, i11, aVarG));
        return false;
    }
}
