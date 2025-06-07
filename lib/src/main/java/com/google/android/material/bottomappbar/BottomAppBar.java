package com.google.android.material.bottomappbar;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.w;
import c5.j;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public abstract class BottomAppBar extends Toolbar implements CoordinatorLayout.b {

    /* renamed from: j0, reason: collision with root package name */
    private static final int f20725j0 = j.f4806g;

    public static class Behavior extends HideBottomViewOnScrollBehavior<BottomAppBar> {

        /* renamed from: e, reason: collision with root package name */
        private final Rect f20726e;

        /* renamed from: f, reason: collision with root package name */
        private WeakReference f20727f;

        /* renamed from: g, reason: collision with root package name */
        private int f20728g;

        /* renamed from: h, reason: collision with root package name */
        private final View.OnLayoutChangeListener f20729h;

        class a implements View.OnLayoutChangeListener {
            a() {
            }

            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                a5.a.a(Behavior.this.f20727f.get());
                view.removeOnLayoutChangeListener(this);
            }
        }

        public Behavior() {
            this.f20729h = new a();
            this.f20726e = new Rect();
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f20729h = new a();
            this.f20726e = new Rect();
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ boolean A(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i10, int i11) {
            a5.a.a(view);
            return O(coordinatorLayout, null, view2, view3, i10, i11);
        }

        public boolean N(CoordinatorLayout coordinatorLayout, BottomAppBar bottomAppBar, int i10) {
            this.f20727f = new WeakReference(bottomAppBar);
            View viewT = BottomAppBar.T(bottomAppBar);
            if (viewT != null && !w.S(viewT)) {
                CoordinatorLayout.f fVar = (CoordinatorLayout.f) viewT.getLayoutParams();
                fVar.f1998d = 49;
                this.f20728g = ((ViewGroup.MarginLayoutParams) fVar).bottomMargin;
                BottomAppBar.S(bottomAppBar);
            }
            coordinatorLayout.I(bottomAppBar, i10);
            return super.l(coordinatorLayout, bottomAppBar, i10);
        }

        public boolean O(CoordinatorLayout coordinatorLayout, BottomAppBar bottomAppBar, View view, View view2, int i10, int i11) {
            throw null;
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ boolean l(CoordinatorLayout coordinatorLayout, View view, int i10) {
            a5.a.a(view);
            return N(coordinatorLayout, null, i10);
        }
    }

    static /* synthetic */ void S(BottomAppBar bottomAppBar) {
        throw null;
    }

    static /* synthetic */ View T(BottomAppBar bottomAppBar) {
        throw null;
    }
}
