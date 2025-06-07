package com.google.android.material.appbar;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ScrollView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.accessibility.d;
import androidx.core.view.accessibility.g;
import androidx.core.view.h0;
import androidx.core.view.m;
import androidx.core.view.r;
import androidx.core.view.w;
import c5.j;
import c5.k;
import com.google.android.material.internal.l;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import s5.h;

/* loaded from: classes.dex */
public class AppBarLayout extends LinearLayout implements CoordinatorLayout.b {
    private static final int F = j.f4802c;
    private ValueAnimator A;
    private final List B;
    private int[] C;
    private Drawable D;
    private Behavior E;

    /* renamed from: m, reason: collision with root package name */
    private int f20626m;

    /* renamed from: n, reason: collision with root package name */
    private int f20627n;

    /* renamed from: o, reason: collision with root package name */
    private int f20628o;

    /* renamed from: p, reason: collision with root package name */
    private int f20629p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f20630q;

    /* renamed from: r, reason: collision with root package name */
    private int f20631r;

    /* renamed from: s, reason: collision with root package name */
    private h0 f20632s;

    /* renamed from: t, reason: collision with root package name */
    private List f20633t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f20634u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f20635v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f20636w;

    /* renamed from: x, reason: collision with root package name */
    private boolean f20637x;

    /* renamed from: y, reason: collision with root package name */
    private int f20638y;

    /* renamed from: z, reason: collision with root package name */
    private WeakReference f20639z;

    protected static class BaseBehavior<T extends AppBarLayout> extends com.google.android.material.appbar.a {

        /* renamed from: k, reason: collision with root package name */
        private int f20640k;

        /* renamed from: l, reason: collision with root package name */
        private int f20641l;

        /* renamed from: m, reason: collision with root package name */
        private ValueAnimator f20642m;

        /* renamed from: n, reason: collision with root package name */
        private e f20643n;

        /* renamed from: o, reason: collision with root package name */
        private WeakReference f20644o;

        /* renamed from: p, reason: collision with root package name */
        private boolean f20645p;

        class a implements ValueAnimator.AnimatorUpdateListener {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ CoordinatorLayout f20646a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ AppBarLayout f20647b;

            a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
                this.f20646a = coordinatorLayout;
                this.f20647b = appBarLayout;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                BaseBehavior.this.P(this.f20646a, this.f20647b, ((Integer) valueAnimator.getAnimatedValue()).intValue());
            }
        }

        class b extends androidx.core.view.a {
            b() {
            }

            @Override // androidx.core.view.a
            public void g(View view, androidx.core.view.accessibility.d dVar) {
                super.g(view, dVar);
                dVar.p0(BaseBehavior.this.f20645p);
                dVar.X(ScrollView.class.getName());
            }
        }

        class c implements androidx.core.view.accessibility.g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ CoordinatorLayout f20650a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ AppBarLayout f20651b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ View f20652c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ int f20653d;

            c(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i10) {
                this.f20650a = coordinatorLayout;
                this.f20651b = appBarLayout;
                this.f20652c = view;
                this.f20653d = i10;
            }

            @Override // androidx.core.view.accessibility.g
            public boolean a(View view, g.a aVar) {
                BaseBehavior.this.q(this.f20650a, this.f20651b, this.f20652c, 0, this.f20653d, new int[]{0, 0}, 1);
                return true;
            }
        }

        class d implements androidx.core.view.accessibility.g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ AppBarLayout f20655a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ boolean f20656b;

            d(AppBarLayout appBarLayout, boolean z10) {
                this.f20655a = appBarLayout;
                this.f20656b = z10;
            }

            @Override // androidx.core.view.accessibility.g
            public boolean a(View view, g.a aVar) {
                this.f20655a.setExpanded(this.f20656b);
                return true;
            }
        }

        protected static class e extends e0.a {
            public static final Parcelable.Creator<e> CREATOR = new a();

            /* renamed from: o, reason: collision with root package name */
            boolean f20658o;

            /* renamed from: p, reason: collision with root package name */
            boolean f20659p;

            /* renamed from: q, reason: collision with root package name */
            int f20660q;

            /* renamed from: r, reason: collision with root package name */
            float f20661r;

            /* renamed from: s, reason: collision with root package name */
            boolean f20662s;

            class a implements Parcelable.ClassLoaderCreator {
                a() {
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public e createFromParcel(Parcel parcel) {
                    return new e(parcel, null);
                }

                @Override // android.os.Parcelable.ClassLoaderCreator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public e createFromParcel(Parcel parcel, ClassLoader classLoader) {
                    return new e(parcel, classLoader);
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: c, reason: merged with bridge method [inline-methods] */
                public e[] newArray(int i10) {
                    return new e[i10];
                }
            }

            public e(Parcel parcel, ClassLoader classLoader) {
                super(parcel, classLoader);
                this.f20658o = parcel.readByte() != 0;
                this.f20659p = parcel.readByte() != 0;
                this.f20660q = parcel.readInt();
                this.f20661r = parcel.readFloat();
                this.f20662s = parcel.readByte() != 0;
            }

            public e(Parcelable parcelable) {
                super(parcelable);
            }

            @Override // e0.a, android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i10) {
                super.writeToParcel(parcel, i10);
                parcel.writeByte(this.f20658o ? (byte) 1 : (byte) 0);
                parcel.writeByte(this.f20659p ? (byte) 1 : (byte) 0);
                parcel.writeInt(this.f20660q);
                parcel.writeFloat(this.f20661r);
                parcel.writeByte(this.f20662s ? (byte) 1 : (byte) 0);
            }
        }

        public BaseBehavior() {
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        private boolean T(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view) {
            boolean z10 = false;
            if (M() != (-appBarLayout.getTotalScrollRange())) {
                U(coordinatorLayout, appBarLayout, d.a.f2392q, false);
                z10 = true;
            }
            if (M() != 0) {
                if (!view.canScrollVertically(-1)) {
                    U(coordinatorLayout, appBarLayout, d.a.f2393r, true);
                    return true;
                }
                int i10 = -appBarLayout.getDownNestedPreScrollRange();
                if (i10 != 0) {
                    w.k0(coordinatorLayout, d.a.f2393r, null, new c(coordinatorLayout, appBarLayout, view, i10));
                    return true;
                }
            }
            return z10;
        }

        private void U(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, d.a aVar, boolean z10) {
            w.k0(coordinatorLayout, aVar, null, new d(appBarLayout, z10));
        }

        private void V(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i10, float f5) {
            int iAbs = Math.abs(M() - i10);
            float fAbs = Math.abs(f5);
            W(coordinatorLayout, appBarLayout, i10, fAbs > 0.0f ? Math.round((iAbs / fAbs) * 1000.0f) * 3 : (int) (((iAbs / appBarLayout.getHeight()) + 1.0f) * 150.0f));
        }

        private void W(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i10, int i11) {
            int iM = M();
            if (iM == i10) {
                ValueAnimator valueAnimator = this.f20642m;
                if (valueAnimator == null || !valueAnimator.isRunning()) {
                    return;
                }
                this.f20642m.cancel();
                return;
            }
            ValueAnimator valueAnimator2 = this.f20642m;
            if (valueAnimator2 == null) {
                ValueAnimator valueAnimator3 = new ValueAnimator();
                this.f20642m = valueAnimator3;
                valueAnimator3.setInterpolator(d5.a.f22935e);
                this.f20642m.addUpdateListener(new a(coordinatorLayout, appBarLayout));
            } else {
                valueAnimator2.cancel();
            }
            this.f20642m.setDuration(Math.min(i11, 600));
            this.f20642m.setIntValues(iM, i10);
            this.f20642m.start();
        }

        private int X(int i10, int i11, int i12) {
            return i10 < (i11 + i12) / 2 ? i11 : i12;
        }

        private boolean Z(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view) {
            return appBarLayout.j() && coordinatorLayout.getHeight() - view.getHeight() <= appBarLayout.getHeight();
        }

        private static boolean a0(int i10, int i11) {
            return (i10 & i11) == i11;
        }

        private boolean b0(AppBarLayout appBarLayout) {
            int childCount = appBarLayout.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                if (((f) appBarLayout.getChildAt(i10).getLayoutParams()).f20668a != 0) {
                    return true;
                }
            }
            return false;
        }

        private View c0(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = coordinatorLayout.getChildAt(i10);
                if ((childAt instanceof m) || (childAt instanceof ListView) || (childAt instanceof ScrollView)) {
                    return childAt;
                }
            }
            return null;
        }

        private static View d0(AppBarLayout appBarLayout, int i10) {
            int iAbs = Math.abs(i10);
            int childCount = appBarLayout.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = appBarLayout.getChildAt(i11);
                if (iAbs >= childAt.getTop() && iAbs <= childAt.getBottom()) {
                    return childAt;
                }
            }
            return null;
        }

        private int e0(AppBarLayout appBarLayout, int i10) {
            int childCount = appBarLayout.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = appBarLayout.getChildAt(i11);
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                f fVar = (f) childAt.getLayoutParams();
                if (a0(fVar.c(), 32)) {
                    top -= ((LinearLayout.LayoutParams) fVar).topMargin;
                    bottom += ((LinearLayout.LayoutParams) fVar).bottomMargin;
                }
                int i12 = -i10;
                if (top <= i12 && bottom >= i12) {
                    return i11;
                }
            }
            return -1;
        }

        private View f0(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = coordinatorLayout.getChildAt(i10);
                if (((CoordinatorLayout.f) childAt.getLayoutParams()).e() instanceof ScrollingViewBehavior) {
                    return childAt;
                }
            }
            return null;
        }

        private int i0(AppBarLayout appBarLayout, int i10) {
            int iAbs = Math.abs(i10);
            int childCount = appBarLayout.getChildCount();
            int topInset = 0;
            int i11 = 0;
            while (true) {
                if (i11 >= childCount) {
                    break;
                }
                View childAt = appBarLayout.getChildAt(i11);
                f fVar = (f) childAt.getLayoutParams();
                Interpolator interpolatorD = fVar.d();
                if (iAbs < childAt.getTop() || iAbs > childAt.getBottom()) {
                    i11++;
                } else if (interpolatorD != null) {
                    int iC = fVar.c();
                    if ((iC & 1) != 0) {
                        topInset = 0 + childAt.getHeight() + ((LinearLayout.LayoutParams) fVar).topMargin + ((LinearLayout.LayoutParams) fVar).bottomMargin;
                        if ((iC & 2) != 0) {
                            topInset -= w.C(childAt);
                        }
                    }
                    if (w.y(childAt)) {
                        topInset -= appBarLayout.getTopInset();
                    }
                    if (topInset > 0) {
                        float f5 = topInset;
                        return Integer.signum(i10) * (childAt.getTop() + Math.round(f5 * interpolatorD.getInterpolation((iAbs - childAt.getTop()) / f5)));
                    }
                }
            }
            return i10;
        }

        private boolean v0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            List listS = coordinatorLayout.s(appBarLayout);
            int size = listS.size();
            for (int i10 = 0; i10 < size; i10++) {
                CoordinatorLayout.c cVarE = ((CoordinatorLayout.f) ((View) listS.get(i10)).getLayoutParams()).e();
                if (cVarE instanceof ScrollingViewBehavior) {
                    return ((ScrollingViewBehavior) cVarE).K() != 0;
                }
            }
            return false;
        }

        private void w0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            int topInset = appBarLayout.getTopInset() + appBarLayout.getPaddingTop();
            int iM = M() - topInset;
            int iE0 = e0(appBarLayout, iM);
            if (iE0 >= 0) {
                View childAt = appBarLayout.getChildAt(iE0);
                f fVar = (f) childAt.getLayoutParams();
                int iC = fVar.c();
                if ((iC & 17) == 17) {
                    int topInset2 = -childAt.getTop();
                    int iC2 = -childAt.getBottom();
                    if (iE0 == 0 && w.y(appBarLayout) && w.y(childAt)) {
                        topInset2 -= appBarLayout.getTopInset();
                    }
                    if (a0(iC, 2)) {
                        iC2 += w.C(childAt);
                    } else if (a0(iC, 5)) {
                        int iC3 = w.C(childAt) + iC2;
                        if (iM < iC3) {
                            topInset2 = iC3;
                        } else {
                            iC2 = iC3;
                        }
                    }
                    if (a0(iC, 32)) {
                        topInset2 += ((LinearLayout.LayoutParams) fVar).topMargin;
                        iC2 -= ((LinearLayout.LayoutParams) fVar).bottomMargin;
                    }
                    V(coordinatorLayout, appBarLayout, a0.a.b(X(iM, iC2, topInset2) + topInset, -appBarLayout.getTotalScrollRange(), 0), 0.0f);
                }
            }
        }

        private void x0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            View viewF0;
            w.i0(coordinatorLayout, d.a.f2392q.b());
            w.i0(coordinatorLayout, d.a.f2393r.b());
            if (appBarLayout.getTotalScrollRange() == 0 || (viewF0 = f0(coordinatorLayout)) == null || !b0(appBarLayout)) {
                return;
            }
            if (!w.M(coordinatorLayout)) {
                w.o0(coordinatorLayout, new b());
            }
            this.f20645p = T(coordinatorLayout, appBarLayout, viewF0);
        }

        private void y0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i10, int i11, boolean z10) {
            View viewD0 = d0(appBarLayout, i10);
            boolean zV = false;
            if (viewD0 != null) {
                int iC = ((f) viewD0.getLayoutParams()).c();
                if ((iC & 1) != 0) {
                    int iC2 = w.C(viewD0);
                    if (i11 <= 0 || (iC & 12) == 0 ? !((iC & 2) == 0 || (-i10) < (viewD0.getBottom() - iC2) - appBarLayout.getTopInset()) : (-i10) >= (viewD0.getBottom() - iC2) - appBarLayout.getTopInset()) {
                        zV = true;
                    }
                }
            }
            if (appBarLayout.l()) {
                zV = appBarLayout.v(c0(coordinatorLayout));
            }
            boolean zS = appBarLayout.s(zV);
            if (z10 || (zS && v0(coordinatorLayout, appBarLayout))) {
                appBarLayout.jumpDrawablesToCurrentState();
            }
        }

        @Override // com.google.android.material.appbar.a
        int M() {
            return E() + this.f20640k;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.a
        /* renamed from: Y, reason: merged with bridge method [inline-methods] */
        public boolean H(AppBarLayout appBarLayout) {
            WeakReference weakReference = this.f20644o;
            if (weakReference == null) {
                return true;
            }
            View view = (View) weakReference.get();
            return (view == null || !view.isShown() || view.canScrollVertically(-1)) ? false : true;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.a
        /* renamed from: g0, reason: merged with bridge method [inline-methods] */
        public int K(AppBarLayout appBarLayout) {
            return -appBarLayout.getDownNestedScrollRange();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.a
        /* renamed from: h0, reason: merged with bridge method [inline-methods] */
        public int L(AppBarLayout appBarLayout) {
            return appBarLayout.getTotalScrollRange();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.a
        /* renamed from: j0, reason: merged with bridge method [inline-methods] */
        public void N(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            w0(coordinatorLayout, appBarLayout);
            if (appBarLayout.l()) {
                appBarLayout.s(appBarLayout.v(c0(coordinatorLayout)));
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0022  */
        @Override // com.google.android.material.appbar.c, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: k0, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean l(androidx.coordinatorlayout.widget.CoordinatorLayout r8, com.google.android.material.appbar.AppBarLayout r9, int r10) {
            /*
                r7 = this;
                boolean r10 = super.l(r8, r9, r10)
                int r0 = r9.getPendingAction()
                com.google.android.material.appbar.AppBarLayout$BaseBehavior$e r1 = r7.f20643n
                r2 = 0
                if (r1 == 0) goto L54
                r3 = r0 & 8
                if (r3 != 0) goto L54
                boolean r0 = r1.f20658o
                if (r0 == 0) goto L1e
                int r0 = r9.getTotalScrollRange()
                int r0 = -r0
            L1a:
                r7.P(r8, r9, r0)
                goto L76
            L1e:
                boolean r0 = r1.f20659p
                if (r0 == 0) goto L26
            L22:
                r7.P(r8, r9, r2)
                goto L76
            L26:
                int r0 = r1.f20660q
                android.view.View r0 = r9.getChildAt(r0)
                int r1 = r0.getBottom()
                int r1 = -r1
                com.google.android.material.appbar.AppBarLayout$BaseBehavior$e r3 = r7.f20643n
                boolean r3 = r3.f20662s
                if (r3 == 0) goto L41
                int r0 = androidx.core.view.w.C(r0)
                int r3 = r9.getTopInset()
                int r0 = r0 + r3
                goto L4f
            L41:
                int r0 = r0.getHeight()
                float r0 = (float) r0
                com.google.android.material.appbar.AppBarLayout$BaseBehavior$e r3 = r7.f20643n
                float r3 = r3.f20661r
                float r0 = r0 * r3
                int r0 = java.lang.Math.round(r0)
            L4f:
                int r1 = r1 + r0
                r7.P(r8, r9, r1)
                goto L76
            L54:
                if (r0 == 0) goto L76
                r1 = r0 & 4
                r3 = 1
                if (r1 == 0) goto L5d
                r1 = r3
                goto L5e
            L5d:
                r1 = r2
            L5e:
                r4 = r0 & 2
                r5 = 0
                if (r4 == 0) goto L6e
                int r0 = r9.getUpNestedPreScrollRange()
                int r0 = -r0
                if (r1 == 0) goto L1a
                r7.V(r8, r9, r0, r5)
                goto L76
            L6e:
                r0 = r0 & r3
                if (r0 == 0) goto L76
                if (r1 == 0) goto L22
                r7.V(r8, r9, r2, r5)
            L76:
                r9.o()
                r0 = 0
                r7.f20643n = r0
                int r0 = r7.E()
                int r1 = r9.getTotalScrollRange()
                int r1 = -r1
                int r0 = a0.a.b(r0, r1, r2)
                r7.G(r0)
                int r4 = r7.E()
                r5 = 0
                r6 = 1
                r1 = r7
                r2 = r8
                r3 = r9
                r1.y0(r2, r3, r4, r5, r6)
                int r0 = r7.E()
                r9.m(r0)
                r7.x0(r8, r9)
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.BaseBehavior.l(androidx.coordinatorlayout.widget.CoordinatorLayout, com.google.android.material.appbar.AppBarLayout, int):boolean");
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: l0, reason: merged with bridge method [inline-methods] */
        public boolean m(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i10, int i11, int i12, int i13) {
            if (((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.f) appBarLayout.getLayoutParams())).height != -2) {
                return super.m(coordinatorLayout, appBarLayout, i10, i11, i12, i13);
            }
            coordinatorLayout.J(appBarLayout, i10, i11, View.MeasureSpec.makeMeasureSpec(0, 0), i13);
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: m0, reason: merged with bridge method [inline-methods] */
        public void q(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i10, int i11, int[] iArr, int i12) {
            int i13;
            int downNestedPreScrollRange;
            if (i11 != 0) {
                if (i11 < 0) {
                    i13 = -appBarLayout.getTotalScrollRange();
                    downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange() + i13;
                } else {
                    i13 = -appBarLayout.getUpNestedPreScrollRange();
                    downNestedPreScrollRange = 0;
                }
                int i14 = i13;
                int i15 = downNestedPreScrollRange;
                if (i14 != i15) {
                    iArr[1] = O(coordinatorLayout, appBarLayout, i11, i14, i15);
                }
            }
            if (appBarLayout.l()) {
                appBarLayout.s(appBarLayout.v(view));
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: n0, reason: merged with bridge method [inline-methods] */
        public void t(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
            if (i13 < 0) {
                iArr[1] = O(coordinatorLayout, appBarLayout, i13, -appBarLayout.getDownNestedScrollRange(), 0);
            }
            if (i13 == 0) {
                x0(coordinatorLayout, appBarLayout);
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: o0, reason: merged with bridge method [inline-methods] */
        public void x(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, Parcelable parcelable) {
            if (parcelable instanceof e) {
                s0((e) parcelable, true);
                super.x(coordinatorLayout, appBarLayout, this.f20643n.a());
            } else {
                super.x(coordinatorLayout, appBarLayout, parcelable);
                this.f20643n = null;
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: p0, reason: merged with bridge method [inline-methods] */
        public Parcelable y(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            Parcelable parcelableY = super.y(coordinatorLayout, appBarLayout);
            e eVarT0 = t0(parcelableY, appBarLayout);
            return eVarT0 == null ? parcelableY : eVarT0;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: q0, reason: merged with bridge method [inline-methods] */
        public boolean A(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, View view2, int i10, int i11) {
            ValueAnimator valueAnimator;
            boolean z10 = (i10 & 2) != 0 && (appBarLayout.l() || Z(coordinatorLayout, appBarLayout, view));
            if (z10 && (valueAnimator = this.f20642m) != null) {
                valueAnimator.cancel();
            }
            this.f20644o = null;
            this.f20641l = i11;
            return z10;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: r0, reason: merged with bridge method [inline-methods] */
        public void C(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i10) {
            if (this.f20641l == 0 || i10 == 1) {
                w0(coordinatorLayout, appBarLayout);
                if (appBarLayout.l()) {
                    appBarLayout.s(appBarLayout.v(view));
                }
            }
            this.f20644o = new WeakReference(view);
        }

        void s0(e eVar, boolean z10) {
            if (this.f20643n == null || z10) {
                this.f20643n = eVar;
            }
        }

        e t0(Parcelable parcelable, AppBarLayout appBarLayout) {
            int iE = E();
            int childCount = appBarLayout.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = appBarLayout.getChildAt(i10);
                int bottom = childAt.getBottom() + iE;
                if (childAt.getTop() + iE <= 0 && bottom >= 0) {
                    if (parcelable == null) {
                        parcelable = e0.a.f23005n;
                    }
                    e eVar = new e(parcelable);
                    boolean z10 = iE == 0;
                    eVar.f20659p = z10;
                    eVar.f20658o = !z10 && (-iE) >= appBarLayout.getTotalScrollRange();
                    eVar.f20660q = i10;
                    eVar.f20662s = bottom == w.C(childAt) + appBarLayout.getTopInset();
                    eVar.f20661r = bottom / childAt.getHeight();
                    return eVar;
                }
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.a
        /* renamed from: u0, reason: merged with bridge method [inline-methods] */
        public int Q(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i10, int i11, int i12) {
            int iM = M();
            int i13 = 0;
            if (i11 == 0 || iM < i11 || iM > i12) {
                this.f20640k = 0;
            } else {
                int iB = a0.a.b(i10, i11, i12);
                if (iM != iB) {
                    int iI0 = appBarLayout.h() ? i0(appBarLayout, iB) : iB;
                    boolean zG = G(iI0);
                    int i14 = iM - iB;
                    this.f20640k = iB - iI0;
                    if (zG) {
                        while (i13 < appBarLayout.getChildCount()) {
                            f fVar = (f) appBarLayout.getChildAt(i13).getLayoutParams();
                            d dVarB = fVar.b();
                            if (dVarB != null && (fVar.c() & 1) != 0) {
                                dVarB.a(appBarLayout, appBarLayout.getChildAt(i13), E());
                            }
                            i13++;
                        }
                    }
                    if (!zG && appBarLayout.h()) {
                        coordinatorLayout.f(appBarLayout);
                    }
                    appBarLayout.m(E());
                    y0(coordinatorLayout, appBarLayout, iB, iB < iM ? -1 : 1, false);
                    i13 = i14;
                }
            }
            x0(coordinatorLayout, appBarLayout);
            return i13;
        }
    }

    public static class Behavior extends BaseBehavior<AppBarLayout> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        @Override // com.google.android.material.appbar.a, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ boolean D(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            return super.D(coordinatorLayout, view, motionEvent);
        }

        @Override // com.google.android.material.appbar.c
        public /* bridge */ /* synthetic */ int E() {
            return super.E();
        }

        @Override // com.google.android.material.appbar.c
        public /* bridge */ /* synthetic */ boolean G(int i10) {
            return super.G(i10);
        }

        @Override // com.google.android.material.appbar.a, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ boolean k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            return super.k(coordinatorLayout, view, motionEvent);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* renamed from: k0 */
        public /* bridge */ /* synthetic */ boolean l(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i10) {
            return super.l(coordinatorLayout, appBarLayout, i10);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* renamed from: l0 */
        public /* bridge */ /* synthetic */ boolean m(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i10, int i11, int i12, int i13) {
            return super.m(coordinatorLayout, appBarLayout, i10, i11, i12, i13);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* renamed from: m0 */
        public /* bridge */ /* synthetic */ void q(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i10, int i11, int[] iArr, int i12) {
            super.q(coordinatorLayout, appBarLayout, view, i10, i11, iArr, i12);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* renamed from: n0 */
        public /* bridge */ /* synthetic */ void t(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
            super.t(coordinatorLayout, appBarLayout, view, i10, i11, i12, i13, i14, iArr);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* renamed from: o0 */
        public /* bridge */ /* synthetic */ void x(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, Parcelable parcelable) {
            super.x(coordinatorLayout, appBarLayout, parcelable);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* renamed from: p0 */
        public /* bridge */ /* synthetic */ Parcelable y(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            return super.y(coordinatorLayout, appBarLayout);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* renamed from: q0 */
        public /* bridge */ /* synthetic */ boolean A(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, View view2, int i10, int i11) {
            return super.A(coordinatorLayout, appBarLayout, view, view2, i10, i11);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* renamed from: r0 */
        public /* bridge */ /* synthetic */ void C(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i10) {
            super.C(coordinatorLayout, appBarLayout, view, i10);
        }
    }

    public static class ScrollingViewBehavior extends com.google.android.material.appbar.b {
        public ScrollingViewBehavior() {
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k.f4822a4);
            O(typedArrayObtainStyledAttributes.getDimensionPixelSize(k.f4830b4, 0));
            typedArrayObtainStyledAttributes.recycle();
        }

        private static int R(AppBarLayout appBarLayout) {
            CoordinatorLayout.c cVarE = ((CoordinatorLayout.f) appBarLayout.getLayoutParams()).e();
            if (cVarE instanceof BaseBehavior) {
                return ((BaseBehavior) cVarE).M();
            }
            return 0;
        }

        private void S(View view, View view2) {
            CoordinatorLayout.c cVarE = ((CoordinatorLayout.f) view2.getLayoutParams()).e();
            if (cVarE instanceof BaseBehavior) {
                w.Z(view, (((view2.getBottom() - view.getTop()) + ((BaseBehavior) cVarE).f20640k) + M()) - I(view2));
            }
        }

        private void T(View view, View view2) {
            if (view2 instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view2;
                if (appBarLayout.l()) {
                    appBarLayout.s(appBarLayout.v(view));
                }
            }
        }

        @Override // com.google.android.material.appbar.b
        float J(View view) {
            int i10;
            if (view instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view;
                int totalScrollRange = appBarLayout.getTotalScrollRange();
                int downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange();
                int iR = R(appBarLayout);
                if ((downNestedPreScrollRange == 0 || totalScrollRange + iR > downNestedPreScrollRange) && (i10 = totalScrollRange - downNestedPreScrollRange) != 0) {
                    return (iR / i10) + 1.0f;
                }
            }
            return 0.0f;
        }

        @Override // com.google.android.material.appbar.b
        int L(View view) {
            return view instanceof AppBarLayout ? ((AppBarLayout) view).getTotalScrollRange() : super.L(view);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.b
        /* renamed from: Q, reason: merged with bridge method [inline-methods] */
        public AppBarLayout H(List list) {
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                View view = (View) list.get(i10);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean e(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return view2 instanceof AppBarLayout;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
            S(view, view2);
            T(view, view2);
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public void i(CoordinatorLayout coordinatorLayout, View view, View view2) {
            if (view2 instanceof AppBarLayout) {
                w.i0(coordinatorLayout, d.a.f2392q.b());
                w.i0(coordinatorLayout, d.a.f2393r.b());
                w.o0(coordinatorLayout, null);
            }
        }

        @Override // com.google.android.material.appbar.c, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ boolean l(CoordinatorLayout coordinatorLayout, View view, int i10) {
            return super.l(coordinatorLayout, view, i10);
        }

        @Override // com.google.android.material.appbar.b, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ boolean m(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12, int i13) {
            return super.m(coordinatorLayout, view, i10, i11, i12, i13);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean w(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z10) {
            AppBarLayout appBarLayoutH = H(coordinatorLayout.r(view));
            if (appBarLayoutH != null) {
                rect.offset(view.getLeft(), view.getTop());
                Rect rect2 = this.f20688d;
                rect2.set(0, 0, coordinatorLayout.getWidth(), coordinatorLayout.getHeight());
                if (!rect2.contains(rect)) {
                    appBarLayoutH.p(false, !z10);
                    return true;
                }
            }
            return false;
        }
    }

    class a implements r {
        a() {
        }

        @Override // androidx.core.view.r
        public h0 a(View view, h0 h0Var) {
            return AppBarLayout.this.n(h0Var);
        }
    }

    class b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ s5.g f20664a;

        b(s5.g gVar) {
            this.f20664a = gVar;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            this.f20664a.U(fFloatValue);
            if (AppBarLayout.this.D instanceof s5.g) {
                ((s5.g) AppBarLayout.this.D).U(fFloatValue);
            }
            Iterator it = AppBarLayout.this.B.iterator();
            while (it.hasNext()) {
                ((g) it.next()).a(fFloatValue, this.f20664a.z());
            }
        }
    }

    public interface c {
        void a(AppBarLayout appBarLayout, int i10);
    }

    public static abstract class d {
        public abstract void a(AppBarLayout appBarLayout, View view, float f5);
    }

    public static class e extends d {

        /* renamed from: a, reason: collision with root package name */
        private final Rect f20666a = new Rect();

        /* renamed from: b, reason: collision with root package name */
        private final Rect f20667b = new Rect();

        private static void b(Rect rect, AppBarLayout appBarLayout, View view) {
            view.getDrawingRect(rect);
            appBarLayout.offsetDescendantRectToMyCoords(view, rect);
            rect.offset(0, -appBarLayout.getTopInset());
        }

        @Override // com.google.android.material.appbar.AppBarLayout.d
        public void a(AppBarLayout appBarLayout, View view, float f5) {
            b(this.f20666a, appBarLayout, view);
            float fAbs = this.f20666a.top - Math.abs(f5);
            if (fAbs > 0.0f) {
                w.v0(view, null);
                view.setTranslationY(0.0f);
                return;
            }
            float fA = 1.0f - a0.a.a(Math.abs(fAbs / this.f20666a.height()), 0.0f, 1.0f);
            float fHeight = (-fAbs) - ((this.f20666a.height() * 0.3f) * (1.0f - (fA * fA)));
            view.setTranslationY(fHeight);
            view.getDrawingRect(this.f20667b);
            this.f20667b.offset(0, (int) (-fHeight));
            w.v0(view, this.f20667b);
        }
    }

    public static class f extends LinearLayout.LayoutParams {

        /* renamed from: a, reason: collision with root package name */
        int f20668a;

        /* renamed from: b, reason: collision with root package name */
        private d f20669b;

        /* renamed from: c, reason: collision with root package name */
        Interpolator f20670c;

        public f(int i10, int i11) {
            super(i10, i11);
            this.f20668a = 1;
        }

        public f(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f20668a = 1;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k.f4974u);
            this.f20668a = typedArrayObtainStyledAttributes.getInt(k.f4990w, 0);
            f(a(typedArrayObtainStyledAttributes.getInt(k.f4982v, 0)));
            int i10 = k.f4998x;
            if (typedArrayObtainStyledAttributes.hasValue(i10)) {
                this.f20670c = AnimationUtils.loadInterpolator(context, typedArrayObtainStyledAttributes.getResourceId(i10, 0));
            }
            typedArrayObtainStyledAttributes.recycle();
        }

        public f(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f20668a = 1;
        }

        public f(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f20668a = 1;
        }

        public f(LinearLayout.LayoutParams layoutParams) {
            super(layoutParams);
            this.f20668a = 1;
        }

        private d a(int i10) {
            if (i10 != 1) {
                return null;
            }
            return new e();
        }

        public d b() {
            return this.f20669b;
        }

        public int c() {
            return this.f20668a;
        }

        public Interpolator d() {
            return this.f20670c;
        }

        boolean e() {
            int i10 = this.f20668a;
            return (i10 & 1) == 1 && (i10 & 10) != 0;
        }

        public void f(d dVar) {
            this.f20669b = dVar;
        }
    }

    public interface g {
        void a(float f5, int i10);
    }

    public AppBarLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, c5.b.f4673a);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AppBarLayout(Context context, AttributeSet attributeSet, int i10) throws Resources.NotFoundException {
        int i11 = F;
        super(t5.a.c(context, attributeSet, i10, i11), attributeSet, i10);
        this.f20627n = -1;
        this.f20628o = -1;
        this.f20629p = -1;
        this.f20631r = 0;
        this.B = new ArrayList();
        Context context2 = getContext();
        setOrientation(1);
        int i12 = Build.VERSION.SDK_INT;
        if (getOutlineProvider() == ViewOutlineProvider.BACKGROUND) {
            com.google.android.material.appbar.e.a(this);
        }
        com.google.android.material.appbar.e.c(this, attributeSet, i10, i11);
        TypedArray typedArrayH = l.h(context2, attributeSet, k.f4895k, i10, i11, new int[0]);
        w.s0(this, typedArrayH.getDrawable(k.f4903l));
        if (getBackground() instanceof ColorDrawable) {
            ColorDrawable colorDrawable = (ColorDrawable) getBackground();
            s5.g gVar = new s5.g();
            gVar.V(ColorStateList.valueOf(colorDrawable.getColor()));
            gVar.L(context2);
            w.s0(this, gVar);
        }
        int i13 = k.f4934p;
        if (typedArrayH.hasValue(i13)) {
            q(typedArrayH.getBoolean(i13, false), false, false);
        }
        if (typedArrayH.hasValue(k.f4926o)) {
            com.google.android.material.appbar.e.b(this, typedArrayH.getDimensionPixelSize(r12, 0));
        }
        if (i12 >= 26) {
            int i14 = k.f4919n;
            if (typedArrayH.hasValue(i14)) {
                setKeyboardNavigationCluster(typedArrayH.getBoolean(i14, false));
            }
            int i15 = k.f4911m;
            if (typedArrayH.hasValue(i15)) {
                setTouchscreenBlocksFocus(typedArrayH.getBoolean(i15, false));
            }
        }
        this.f20637x = typedArrayH.getBoolean(k.f4942q, false);
        this.f20638y = typedArrayH.getResourceId(k.f4950r, -1);
        setStatusBarForeground(typedArrayH.getDrawable(k.f4958s));
        typedArrayH.recycle();
        w.A0(this, new a());
    }

    private void c() {
        WeakReference weakReference = this.f20639z;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f20639z = null;
    }

    private View d(View view) {
        int i10;
        if (this.f20639z == null && (i10 = this.f20638y) != -1) {
            View viewFindViewById = view != null ? view.findViewById(i10) : null;
            if (viewFindViewById == null && (getParent() instanceof ViewGroup)) {
                viewFindViewById = ((ViewGroup) getParent()).findViewById(this.f20638y);
            }
            if (viewFindViewById != null) {
                this.f20639z = new WeakReference(viewFindViewById);
            }
        }
        WeakReference weakReference = this.f20639z;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    private boolean i() {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            if (((f) getChildAt(i10).getLayoutParams()).e()) {
                return true;
            }
        }
        return false;
    }

    private void k() {
        Behavior behavior = this.E;
        BaseBehavior.e eVarT0 = (behavior == null || this.f20627n == -1 || this.f20631r != 0) ? null : behavior.t0(e0.a.f23005n, this);
        this.f20627n = -1;
        this.f20628o = -1;
        this.f20629p = -1;
        if (eVarT0 != null) {
            this.E.s0(eVarT0, false);
        }
    }

    private void q(boolean z10, boolean z11, boolean z12) {
        this.f20631r = (z10 ? 1 : 2) | (z11 ? 4 : 0) | (z12 ? 8 : 0);
        requestLayout();
    }

    private boolean r(boolean z10) {
        if (this.f20635v == z10) {
            return false;
        }
        this.f20635v = z10;
        refreshDrawableState();
        return true;
    }

    private boolean u() {
        return this.D != null && getTopInset() > 0;
    }

    private boolean w() {
        if (getChildCount() <= 0) {
            return false;
        }
        View childAt = getChildAt(0);
        return (childAt.getVisibility() == 8 || w.y(childAt)) ? false : true;
    }

    private void x(s5.g gVar, boolean z10) throws Resources.NotFoundException {
        float dimension = getResources().getDimension(c5.d.f4705a);
        float f5 = z10 ? 0.0f : dimension;
        if (!z10) {
            dimension = 0.0f;
        }
        ValueAnimator valueAnimator = this.A;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f5, dimension);
        this.A = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(getResources().getInteger(c5.g.f4764a));
        this.A.setInterpolator(d5.a.f22931a);
        this.A.addUpdateListener(new b(gVar));
        this.A.start();
    }

    private void y() {
        setWillNotDraw(!u());
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof f;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (u()) {
            int iSave = canvas.save();
            canvas.translate(0.0f, -this.f20626m);
            this.D.draw(canvas);
            canvas.restoreToCount(iSave);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.D;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidateDrawable(drawable);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public f generateDefaultLayoutParams() {
        return new f(-1, -2);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public f generateLayoutParams(AttributeSet attributeSet) {
        return new f(getContext(), attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public f generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LinearLayout.LayoutParams ? new f((LinearLayout.LayoutParams) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new f((ViewGroup.MarginLayoutParams) layoutParams) : new f(layoutParams);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public CoordinatorLayout.c getBehavior() {
        Behavior behavior = new Behavior();
        this.E = behavior;
        return behavior;
    }

    int getDownNestedPreScrollRange() {
        int iMin;
        int iC;
        int i10 = this.f20628o;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            f fVar = (f) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i12 = fVar.f20668a;
            if ((i12 & 5) != 5) {
                if (i11 > 0) {
                    break;
                }
            } else {
                int i13 = ((LinearLayout.LayoutParams) fVar).topMargin + ((LinearLayout.LayoutParams) fVar).bottomMargin;
                if ((i12 & 8) != 0) {
                    iC = w.C(childAt);
                } else if ((i12 & 2) != 0) {
                    iC = measuredHeight - w.C(childAt);
                } else {
                    iMin = i13 + measuredHeight;
                    if (childCount == 0 && w.y(childAt)) {
                        iMin = Math.min(iMin, measuredHeight - getTopInset());
                    }
                    i11 += iMin;
                }
                iMin = i13 + iC;
                if (childCount == 0) {
                    iMin = Math.min(iMin, measuredHeight - getTopInset());
                }
                i11 += iMin;
            }
        }
        int iMax = Math.max(0, i11);
        this.f20628o = iMax;
        return iMax;
    }

    int getDownNestedScrollRange() {
        int i10 = this.f20629p;
        if (i10 != -1) {
            return i10;
        }
        int childCount = getChildCount();
        int i11 = 0;
        int iC = 0;
        while (true) {
            if (i11 >= childCount) {
                break;
            }
            View childAt = getChildAt(i11);
            f fVar = (f) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight() + ((LinearLayout.LayoutParams) fVar).topMargin + ((LinearLayout.LayoutParams) fVar).bottomMargin;
            int i12 = fVar.f20668a;
            if ((i12 & 1) == 0) {
                break;
            }
            iC += measuredHeight;
            if ((i12 & 2) != 0) {
                iC -= w.C(childAt);
                break;
            }
            i11++;
        }
        int iMax = Math.max(0, iC);
        this.f20629p = iMax;
        return iMax;
    }

    public int getLiftOnScrollTargetViewId() {
        return this.f20638y;
    }

    public final int getMinimumHeightForVisibleOverlappingContent() {
        int topInset = getTopInset();
        int iC = w.C(this);
        if (iC == 0) {
            int childCount = getChildCount();
            iC = childCount >= 1 ? w.C(getChildAt(childCount - 1)) : 0;
            if (iC == 0) {
                return getHeight() / 3;
            }
        }
        return (iC * 2) + topInset;
    }

    int getPendingAction() {
        return this.f20631r;
    }

    public Drawable getStatusBarForeground() {
        return this.D;
    }

    @Deprecated
    public float getTargetElevation() {
        return 0.0f;
    }

    final int getTopInset() {
        h0 h0Var = this.f20632s;
        if (h0Var != null) {
            return h0Var.k();
        }
        return 0;
    }

    public final int getTotalScrollRange() {
        int i10 = this.f20627n;
        if (i10 != -1) {
            return i10;
        }
        int childCount = getChildCount();
        int i11 = 0;
        int iC = 0;
        while (true) {
            if (i11 >= childCount) {
                break;
            }
            View childAt = getChildAt(i11);
            f fVar = (f) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i12 = fVar.f20668a;
            if ((i12 & 1) == 0) {
                break;
            }
            iC += measuredHeight + ((LinearLayout.LayoutParams) fVar).topMargin + ((LinearLayout.LayoutParams) fVar).bottomMargin;
            if (i11 == 0 && w.y(childAt)) {
                iC -= getTopInset();
            }
            if ((i12 & 2) != 0) {
                iC -= w.C(childAt);
                break;
            }
            i11++;
        }
        int iMax = Math.max(0, iC);
        this.f20627n = iMax;
        return iMax;
    }

    int getUpNestedPreScrollRange() {
        return getTotalScrollRange();
    }

    boolean h() {
        return this.f20630q;
    }

    boolean j() {
        return getTotalScrollRange() != 0;
    }

    public boolean l() {
        return this.f20637x;
    }

    void m(int i10) {
        this.f20626m = i10;
        if (!willNotDraw()) {
            w.f0(this);
        }
        List list = this.f20633t;
        if (list != null) {
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                c cVar = (c) this.f20633t.get(i11);
                if (cVar != null) {
                    cVar.a(this, i10);
                }
            }
        }
    }

    h0 n(h0 h0Var) {
        h0 h0Var2 = w.y(this) ? h0Var : null;
        if (!androidx.core.util.c.a(this.f20632s, h0Var2)) {
            this.f20632s = h0Var2;
            y();
            requestLayout();
        }
        return h0Var;
    }

    void o() {
        this.f20631r = 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        h.e(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected int[] onCreateDrawableState(int i10) {
        if (this.C == null) {
            this.C = new int[4];
        }
        int[] iArr = this.C;
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i10 + iArr.length);
        boolean z10 = this.f20635v;
        int i11 = c5.b.A;
        if (!z10) {
            i11 = -i11;
        }
        iArr[0] = i11;
        iArr[1] = (z10 && this.f20636w) ? c5.b.B : -c5.b.B;
        int i12 = c5.b.f4698z;
        if (!z10) {
            i12 = -i12;
        }
        iArr[2] = i12;
        iArr[3] = (z10 && this.f20636w) ? c5.b.f4697y : -c5.b.f4697y;
        return LinearLayout.mergeDrawableStates(iArrOnCreateDrawableState, iArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        boolean z11 = true;
        if (w.y(this) && w()) {
            int topInset = getTopInset();
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                w.Z(getChildAt(childCount), topInset);
            }
        }
        k();
        this.f20630q = false;
        int childCount2 = getChildCount();
        int i14 = 0;
        while (true) {
            if (i14 >= childCount2) {
                break;
            }
            if (((f) getChildAt(i14).getLayoutParams()).d() != null) {
                this.f20630q = true;
                break;
            }
            i14++;
        }
        Drawable drawable = this.D;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getTopInset());
        }
        if (this.f20634u) {
            return;
        }
        if (!this.f20637x && !i()) {
            z11 = false;
        }
        r(z11);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int mode = View.MeasureSpec.getMode(i11);
        if (mode != 1073741824 && w.y(this) && w()) {
            int measuredHeight = getMeasuredHeight();
            if (mode == Integer.MIN_VALUE) {
                measuredHeight = a0.a.b(getMeasuredHeight() + getTopInset(), 0, View.MeasureSpec.getSize(i11));
            } else if (mode == 0) {
                measuredHeight += getTopInset();
            }
            setMeasuredDimension(getMeasuredWidth(), measuredHeight);
        }
        k();
    }

    public void p(boolean z10, boolean z11) {
        q(z10, z11, true);
    }

    boolean s(boolean z10) {
        return t(z10, !this.f20634u);
    }

    @Override // android.view.View
    public void setElevation(float f5) {
        super.setElevation(f5);
        h.d(this, f5);
    }

    public void setExpanded(boolean z10) {
        p(z10, w.S(this));
    }

    public void setLiftOnScroll(boolean z10) {
        this.f20637x = z10;
    }

    public void setLiftOnScrollTargetViewId(int i10) {
        this.f20638y = i10;
        c();
    }

    public void setLiftableOverrideEnabled(boolean z10) {
        this.f20634u = z10;
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i10) {
        if (i10 != 1) {
            throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
        }
        super.setOrientation(i10);
    }

    public void setStatusBarForeground(Drawable drawable) {
        Drawable drawable2 = this.D;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.D = drawableMutate;
            if (drawableMutate != null) {
                if (drawableMutate.isStateful()) {
                    this.D.setState(getDrawableState());
                }
                androidx.core.graphics.drawable.a.m(this.D, w.B(this));
                this.D.setVisible(getVisibility() == 0, false);
                this.D.setCallback(this);
            }
            y();
            w.f0(this);
        }
    }

    public void setStatusBarForegroundColor(int i10) {
        setStatusBarForeground(new ColorDrawable(i10));
    }

    public void setStatusBarForegroundResource(int i10) {
        setStatusBarForeground(g.a.b(getContext(), i10));
    }

    @Deprecated
    public void setTargetElevation(float f5) throws Resources.NotFoundException {
        com.google.android.material.appbar.e.b(this, f5);
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        boolean z10 = i10 == 0;
        Drawable drawable = this.D;
        if (drawable != null) {
            drawable.setVisible(z10, false);
        }
    }

    boolean t(boolean z10, boolean z11) throws Resources.NotFoundException {
        if (!z11 || this.f20636w == z10) {
            return false;
        }
        this.f20636w = z10;
        refreshDrawableState();
        if (!this.f20637x || !(getBackground() instanceof s5.g)) {
            return true;
        }
        x((s5.g) getBackground(), z10);
        return true;
    }

    boolean v(View view) {
        View viewD = d(view);
        if (viewD != null) {
            view = viewD;
        }
        return view != null && (view.canScrollVertically(-1) || view.getScrollY() > 0);
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.D;
    }
}
