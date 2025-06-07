package androidx.core.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import android.widget.ScrollView;
import androidx.core.view.accessibility.d;
import androidx.core.view.m;
import androidx.core.view.n;
import androidx.core.view.p;
import androidx.core.view.q;
import androidx.core.view.w;

/* loaded from: classes.dex */
public class NestedScrollView extends FrameLayout implements p, m {
    private static final float N = (float) (Math.log(0.78d) / Math.log(0.9d));
    private static final a O = new a();
    private static final int[] P = {R.attr.fillViewport};
    private int A;
    private int B;
    private int C;
    private int D;
    private final int[] E;
    private final int[] F;
    private int G;
    private int H;
    private d I;
    private final q J;
    private final n K;
    private float L;
    private c M;

    /* renamed from: m, reason: collision with root package name */
    private final float f2517m;

    /* renamed from: n, reason: collision with root package name */
    private long f2518n;

    /* renamed from: o, reason: collision with root package name */
    private final Rect f2519o;

    /* renamed from: p, reason: collision with root package name */
    private OverScroller f2520p;

    /* renamed from: q, reason: collision with root package name */
    public EdgeEffect f2521q;

    /* renamed from: r, reason: collision with root package name */
    public EdgeEffect f2522r;

    /* renamed from: s, reason: collision with root package name */
    private int f2523s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f2524t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f2525u;

    /* renamed from: v, reason: collision with root package name */
    private View f2526v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f2527w;

    /* renamed from: x, reason: collision with root package name */
    private VelocityTracker f2528x;

    /* renamed from: y, reason: collision with root package name */
    private boolean f2529y;

    /* renamed from: z, reason: collision with root package name */
    private boolean f2530z;

    static class a extends androidx.core.view.a {
        a() {
        }

        @Override // androidx.core.view.a
        public void f(View view, AccessibilityEvent accessibilityEvent) {
            super.f(view, accessibilityEvent);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            accessibilityEvent.setClassName(ScrollView.class.getName());
            accessibilityEvent.setScrollable(nestedScrollView.getScrollRange() > 0);
            accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
            accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
            androidx.core.view.accessibility.f.a(accessibilityEvent, nestedScrollView.getScrollX());
            androidx.core.view.accessibility.f.b(accessibilityEvent, nestedScrollView.getScrollRange());
        }

        @Override // androidx.core.view.a
        public void g(View view, androidx.core.view.accessibility.d dVar) {
            int scrollRange;
            super.g(view, dVar);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            dVar.X(ScrollView.class.getName());
            if (!nestedScrollView.isEnabled() || (scrollRange = nestedScrollView.getScrollRange()) <= 0) {
                return;
            }
            dVar.p0(true);
            if (nestedScrollView.getScrollY() > 0) {
                dVar.b(d.a.f2393r);
                dVar.b(d.a.C);
            }
            if (nestedScrollView.getScrollY() < scrollRange) {
                dVar.b(d.a.f2392q);
                dVar.b(d.a.E);
            }
        }

        @Override // androidx.core.view.a
        public boolean j(View view, int i10, Bundle bundle) {
            if (super.j(view, i10, bundle)) {
                return true;
            }
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            if (!nestedScrollView.isEnabled()) {
                return false;
            }
            int height = nestedScrollView.getHeight();
            Rect rect = new Rect();
            if (nestedScrollView.getMatrix().isIdentity() && nestedScrollView.getGlobalVisibleRect(rect)) {
                height = rect.height();
            }
            if (i10 != 4096) {
                if (i10 == 8192 || i10 == 16908344) {
                    int iMax = Math.max(nestedScrollView.getScrollY() - ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
                    if (iMax == nestedScrollView.getScrollY()) {
                        return false;
                    }
                    nestedScrollView.T(0, iMax, true);
                    return true;
                }
                if (i10 != 16908346) {
                    return false;
                }
            }
            int iMin = Math.min(nestedScrollView.getScrollY() + ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.getScrollRange());
            if (iMin == nestedScrollView.getScrollY()) {
                return false;
            }
            nestedScrollView.T(0, iMin, true);
            return true;
        }
    }

    static class b {
        static boolean a(ViewGroup viewGroup) {
            return viewGroup.getClipToPadding();
        }
    }

    public interface c {
        void a(NestedScrollView nestedScrollView, int i10, int i11, int i12, int i13);
    }

    static class d extends View.BaseSavedState {
        public static final Parcelable.Creator<d> CREATOR = new a();

        /* renamed from: m, reason: collision with root package name */
        public int f2531m;

        class a implements Parcelable.Creator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public d createFromParcel(Parcel parcel) {
                return new d(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public d[] newArray(int i10) {
                return new d[i10];
            }
        }

        d(Parcel parcel) {
            super(parcel);
            this.f2531m = parcel.readInt();
        }

        d(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "HorizontalScrollView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " scrollPosition=" + this.f2531m + "}";
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f2531m);
        }
    }

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, y.a.f28377c);
    }

    public NestedScrollView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f2519o = new Rect();
        this.f2524t = true;
        this.f2525u = false;
        this.f2526v = null;
        this.f2527w = false;
        this.f2530z = true;
        this.D = -1;
        this.E = new int[2];
        this.F = new int[2];
        this.f2521q = androidx.core.widget.d.a(context, attributeSet);
        this.f2522r = androidx.core.widget.d.a(context, attributeSet);
        this.f2517m = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        A();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, P, i10, 0);
        setFillViewport(typedArrayObtainStyledAttributes.getBoolean(0, false));
        typedArrayObtainStyledAttributes.recycle();
        this.J = new q(this);
        this.K = new n(this);
        setNestedScrollingEnabled(true);
        w.o0(this, O);
    }

    private void A() {
        this.f2520p = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.A = viewConfiguration.getScaledTouchSlop();
        this.B = viewConfiguration.getScaledMinimumFlingVelocity();
        this.C = viewConfiguration.getScaledMaximumFlingVelocity();
    }

    private void B() {
        if (this.f2528x == null) {
            this.f2528x = VelocityTracker.obtain();
        }
    }

    private boolean C(View view) {
        return !E(view, 0, getHeight());
    }

    private static boolean D(View view, View view2) {
        if (view == view2) {
            return true;
        }
        Object parent = view.getParent();
        return (parent instanceof ViewGroup) && D((View) parent, view2);
    }

    private boolean E(View view, int i10, int i11) {
        view.getDrawingRect(this.f2519o);
        offsetDescendantRectToMyCoords(view, this.f2519o);
        return this.f2519o.bottom + i10 >= getScrollY() && this.f2519o.top - i10 <= getScrollY() + i11;
    }

    private void F(int i10, int i11, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i10);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.K.e(0, scrollY2, 0, i10 - scrollY2, null, i11, iArr);
    }

    private void G(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.D) {
            int i10 = actionIndex == 0 ? 1 : 0;
            this.f2523s = (int) motionEvent.getY(i10);
            this.D = motionEvent.getPointerId(i10);
            VelocityTracker velocityTracker = this.f2528x;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    private void J() {
        VelocityTracker velocityTracker = this.f2528x;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f2528x = null;
        }
    }

    private int K(int i10, float f5) {
        float fD;
        EdgeEffect edgeEffect;
        float width = f5 / getWidth();
        float height = i10 / getHeight();
        float f10 = 0.0f;
        if (androidx.core.widget.d.b(this.f2521q) != 0.0f) {
            fD = -androidx.core.widget.d.d(this.f2521q, -height, width);
            if (androidx.core.widget.d.b(this.f2521q) == 0.0f) {
                edgeEffect = this.f2521q;
                edgeEffect.onRelease();
            }
            f10 = fD;
        } else if (androidx.core.widget.d.b(this.f2522r) != 0.0f) {
            fD = androidx.core.widget.d.d(this.f2522r, height, 1.0f - width);
            if (androidx.core.widget.d.b(this.f2522r) == 0.0f) {
                edgeEffect = this.f2522r;
                edgeEffect.onRelease();
            }
            f10 = fD;
        }
        int iRound = Math.round(f10 * getHeight());
        if (iRound != 0) {
            invalidate();
        }
        return iRound;
    }

    private void L(boolean z10) {
        if (z10) {
            U(2, 1);
        } else {
            W(1);
        }
        this.H = getScrollY();
        w.f0(this);
    }

    private boolean M(int i10, int i11, int i12) {
        int height = getHeight();
        int scrollY = getScrollY();
        int i13 = height + scrollY;
        boolean z10 = false;
        boolean z11 = i10 == 33;
        View viewT = t(z11, i11, i12);
        if (viewT == null) {
            viewT = this;
        }
        if (i11 < scrollY || i12 > i13) {
            p(z11 ? i11 - scrollY : i12 - i13);
            z10 = true;
        }
        if (viewT != findFocus()) {
            viewT.requestFocus(i10);
        }
        return z10;
    }

    private void N(View view) {
        view.getDrawingRect(this.f2519o);
        offsetDescendantRectToMyCoords(view, this.f2519o);
        int iF = f(this.f2519o);
        if (iF != 0) {
            scrollBy(0, iF);
        }
    }

    private boolean O(Rect rect, boolean z10) {
        int iF = f(rect);
        boolean z11 = iF != 0;
        if (z11) {
            if (z10) {
                scrollBy(0, iF);
            } else {
                Q(0, iF);
            }
        }
        return z11;
    }

    private boolean P(EdgeEffect edgeEffect, int i10) {
        if (i10 > 0) {
            return true;
        }
        return w(-i10) < androidx.core.widget.d.b(edgeEffect) * ((float) getHeight());
    }

    private void R(int i10, int i11, int i12, boolean z10) {
        if (getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.f2518n > 250) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int height = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            this.f2520p.startScroll(getScrollX(), scrollY, 0, Math.max(0, Math.min(i11 + scrollY, Math.max(0, height - height2))) - scrollY, i12);
            L(z10);
        } else {
            if (!this.f2520p.isFinished()) {
                a();
            }
            scrollBy(i10, i11);
        }
        this.f2518n = AnimationUtils.currentAnimationTimeMillis();
    }

    private boolean V(MotionEvent motionEvent) {
        boolean z10;
        if (androidx.core.widget.d.b(this.f2521q) != 0.0f) {
            androidx.core.widget.d.d(this.f2521q, 0.0f, motionEvent.getX() / getWidth());
            z10 = true;
        } else {
            z10 = false;
        }
        if (androidx.core.widget.d.b(this.f2522r) == 0.0f) {
            return z10;
        }
        androidx.core.widget.d.d(this.f2522r, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
        return true;
    }

    private void a() {
        this.f2520p.abortAnimation();
        W(1);
    }

    private boolean c() {
        int overScrollMode = getOverScrollMode();
        if (overScrollMode != 0) {
            return overScrollMode == 1 && getScrollRange() > 0;
        }
        return true;
    }

    private boolean d() {
        if (getChildCount() <= 0) {
            return false;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom();
    }

    private static int e(int i10, int i11, int i12) {
        if (i11 >= i12 || i10 < 0) {
            return 0;
        }
        return i11 + i10 > i12 ? i12 - i11 : i10;
    }

    private float getVerticalScrollFactorCompat() {
        if (this.L == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (!context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
            this.L = typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return this.L;
    }

    private void p(int i10) {
        if (i10 != 0) {
            if (this.f2530z) {
                Q(0, i10);
            } else {
                scrollBy(0, i10);
            }
        }
    }

    private boolean q(int i10) {
        EdgeEffect edgeEffect;
        if (androidx.core.widget.d.b(this.f2521q) != 0.0f) {
            if (P(this.f2521q, i10)) {
                edgeEffect = this.f2521q;
                edgeEffect.onAbsorb(i10);
            } else {
                i10 = -i10;
                u(i10);
            }
        } else {
            if (androidx.core.widget.d.b(this.f2522r) == 0.0f) {
                return false;
            }
            i10 = -i10;
            if (P(this.f2522r, i10)) {
                edgeEffect = this.f2522r;
                edgeEffect.onAbsorb(i10);
            }
            u(i10);
        }
        return true;
    }

    private void r() {
        this.f2527w = false;
        J();
        W(0);
        this.f2521q.onRelease();
        this.f2522r.onRelease();
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private android.view.View t(boolean r13, int r14, int r15) {
        /*
            r12 = this;
            r0 = 2
            java.util.ArrayList r0 = r12.getFocusables(r0)
            int r1 = r0.size()
            r2 = 0
            r3 = 0
            r4 = r2
            r5 = r4
        Ld:
            if (r4 >= r1) goto L53
            java.lang.Object r6 = r0.get(r4)
            android.view.View r6 = (android.view.View) r6
            int r7 = r6.getTop()
            int r8 = r6.getBottom()
            r9 = 1
            if (r14 >= r8) goto L50
            if (r7 >= r15) goto L50
            if (r14 >= r7) goto L28
            if (r8 >= r15) goto L28
            r10 = r9
            goto L29
        L28:
            r10 = r2
        L29:
            if (r3 != 0) goto L2e
            r3 = r6
            r5 = r10
            goto L50
        L2e:
            if (r13 == 0) goto L36
            int r11 = r3.getTop()
            if (r7 < r11) goto L3e
        L36:
            if (r13 != 0) goto L40
            int r7 = r3.getBottom()
            if (r8 <= r7) goto L40
        L3e:
            r7 = r9
            goto L41
        L40:
            r7 = r2
        L41:
            if (r5 == 0) goto L48
            if (r10 == 0) goto L50
            if (r7 == 0) goto L50
            goto L4f
        L48:
            if (r10 == 0) goto L4d
            r3 = r6
            r5 = r9
            goto L50
        L4d:
            if (r7 == 0) goto L50
        L4f:
            r3 = r6
        L50:
            int r4 = r4 + 1
            goto Ld
        L53:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.t(boolean, int, int):android.view.View");
    }

    private float w(int i10) {
        double dLog = Math.log((Math.abs(i10) * 0.35f) / (this.f2517m * 0.015f));
        float f5 = N;
        return (float) (this.f2517m * 0.015f * Math.exp((f5 / (f5 - 1.0d)) * dLog));
    }

    private boolean y(int i10, int i11) {
        if (getChildCount() <= 0) {
            return false;
        }
        int scrollY = getScrollY();
        View childAt = getChildAt(0);
        return i11 >= childAt.getTop() - scrollY && i11 < childAt.getBottom() - scrollY && i10 >= childAt.getLeft() && i10 < childAt.getRight();
    }

    private void z() {
        VelocityTracker velocityTracker = this.f2528x;
        if (velocityTracker == null) {
            this.f2528x = VelocityTracker.obtain();
        } else {
            velocityTracker.clear();
        }
    }

    boolean H(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, boolean z10) {
        boolean z11;
        boolean z12;
        int overScrollMode = getOverScrollMode();
        boolean z13 = computeHorizontalScrollRange() > computeHorizontalScrollExtent();
        boolean z14 = computeVerticalScrollRange() > computeVerticalScrollExtent();
        boolean z15 = overScrollMode == 0 || (overScrollMode == 1 && z13);
        boolean z16 = overScrollMode == 0 || (overScrollMode == 1 && z14);
        int i18 = i12 + i10;
        int i19 = !z15 ? 0 : i16;
        int i20 = i13 + i11;
        int i21 = !z16 ? 0 : i17;
        int i22 = -i19;
        int i23 = i19 + i14;
        int i24 = -i21;
        int i25 = i21 + i15;
        if (i18 > i23) {
            i18 = i23;
            z11 = true;
        } else if (i18 < i22) {
            z11 = true;
            i18 = i22;
        } else {
            z11 = false;
        }
        if (i20 > i25) {
            i20 = i25;
            z12 = true;
        } else if (i20 < i24) {
            z12 = true;
            i20 = i24;
        } else {
            z12 = false;
        }
        if (z12 && !x(1)) {
            this.f2520p.springBack(i18, i20, 0, 0, 0, getScrollRange());
        }
        onOverScrolled(i18, i20, z11, z12);
        return z11 || z12;
    }

    public boolean I(int i10) {
        boolean z10 = i10 == 130;
        int height = getHeight();
        if (z10) {
            this.f2519o.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
                Rect rect = this.f2519o;
                if (rect.top + height > bottom) {
                    rect.top = bottom - height;
                }
            }
        } else {
            this.f2519o.top = getScrollY() - height;
            Rect rect2 = this.f2519o;
            if (rect2.top < 0) {
                rect2.top = 0;
            }
        }
        Rect rect3 = this.f2519o;
        int i11 = rect3.top;
        int i12 = height + i11;
        rect3.bottom = i12;
        return M(i10, i11, i12);
    }

    public final void Q(int i10, int i11) {
        R(i10, i11, 250, false);
    }

    void S(int i10, int i11, int i12, boolean z10) {
        R(i10 - getScrollX(), i11 - getScrollY(), i12, z10);
    }

    void T(int i10, int i11, boolean z10) {
        S(i10, i11, 250, z10);
    }

    public boolean U(int i10, int i11) {
        return this.K.p(i10, i11);
    }

    public void W(int i10) {
        this.K.r(i10);
    }

    @Override // android.view.ViewGroup
    public void addView(View view) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view, i10);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view, i10, layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view, layoutParams);
    }

    public boolean b(int i10) {
        View viewFindFocus = findFocus();
        if (viewFindFocus == this) {
            viewFindFocus = null;
        }
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, i10);
        int maxScrollAmount = getMaxScrollAmount();
        if (viewFindNextFocus == null || !E(viewFindNextFocus, maxScrollAmount, getHeight())) {
            if (i10 == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i10 == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getScrollY() + getHeight()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i10 != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            p(maxScrollAmount);
        } else {
            viewFindNextFocus.getDrawingRect(this.f2519o);
            offsetDescendantRectToMyCoords(viewFindNextFocus, this.f2519o);
            p(f(this.f2519o));
            viewFindNextFocus.requestFocus(i10);
        }
        if (viewFindFocus == null || !viewFindFocus.isFocused() || !C(viewFindFocus)) {
            return true;
        }
        int descendantFocusability = getDescendantFocusability();
        setDescendantFocusability(131072);
        requestFocus();
        setDescendantFocusability(descendantFocusability);
        return true;
    }

    @Override // android.view.View
    public int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    @Override // android.view.View
    public int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    @Override // android.view.View
    public int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    @Override // android.view.View
    public void computeScroll() {
        EdgeEffect edgeEffect;
        if (this.f2520p.isFinished()) {
            return;
        }
        this.f2520p.computeScrollOffset();
        int currY = this.f2520p.getCurrY();
        int iG = g(currY - this.H);
        this.H = currY;
        int[] iArr = this.F;
        boolean z10 = false;
        iArr[1] = 0;
        k(0, iG, iArr, null, 1);
        int i10 = iG - this.F[1];
        int scrollRange = getScrollRange();
        if (i10 != 0) {
            int scrollY = getScrollY();
            H(0, i10, getScrollX(), scrollY, 0, scrollRange, 0, 0, false);
            int scrollY2 = getScrollY() - scrollY;
            int i11 = i10 - scrollY2;
            int[] iArr2 = this.F;
            iArr2[1] = 0;
            l(0, scrollY2, 0, i11, this.E, 1, iArr2);
            i10 = i11 - this.F[1];
        }
        if (i10 != 0) {
            int overScrollMode = getOverScrollMode();
            if (overScrollMode == 0 || (overScrollMode == 1 && scrollRange > 0)) {
                z10 = true;
            }
            if (z10) {
                if (i10 < 0) {
                    if (this.f2521q.isFinished()) {
                        edgeEffect = this.f2521q;
                        edgeEffect.onAbsorb((int) this.f2520p.getCurrVelocity());
                    }
                } else if (this.f2522r.isFinished()) {
                    edgeEffect = this.f2522r;
                    edgeEffect.onAbsorb((int) this.f2520p.getCurrVelocity());
                }
            }
            a();
        }
        if (this.f2520p.isFinished()) {
            W(1);
        } else {
            w.f0(this);
        }
    }

    @Override // android.view.View
    public int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    @Override // android.view.View
    public int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    @Override // android.view.View
    public int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int iMax = Math.max(0, bottom - height);
        return scrollY < 0 ? bottom - scrollY : scrollY > iMax ? bottom + (scrollY - iMax) : bottom;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || s(keyEvent);
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f5, float f10, boolean z10) {
        return this.K.a(f5, f10, z10);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f5, float f10) {
        return this.K.b(f5, f10);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i10, int i11, int[] iArr, int[] iArr2) {
        return k(i10, i11, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i10, int i11, int i12, int i13, int[] iArr) {
        return this.K.f(i10, i11, i12, i13, iArr);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int paddingLeft;
        super.draw(canvas);
        int scrollY = getScrollY();
        int paddingLeft2 = 0;
        if (!this.f2521q.isFinished()) {
            int iSave = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int iMin = Math.min(0, scrollY);
            if (b.a(this)) {
                width -= getPaddingLeft() + getPaddingRight();
                paddingLeft = getPaddingLeft() + 0;
            } else {
                paddingLeft = 0;
            }
            if (b.a(this)) {
                height -= getPaddingTop() + getPaddingBottom();
                iMin += getPaddingTop();
            }
            canvas.translate(paddingLeft, iMin);
            this.f2521q.setSize(width, height);
            if (this.f2521q.draw(canvas)) {
                w.f0(this);
            }
            canvas.restoreToCount(iSave);
        }
        if (this.f2522r.isFinished()) {
            return;
        }
        int iSave2 = canvas.save();
        int width2 = getWidth();
        int height2 = getHeight();
        int iMax = Math.max(getScrollRange(), scrollY) + height2;
        if (b.a(this)) {
            width2 -= getPaddingLeft() + getPaddingRight();
            paddingLeft2 = 0 + getPaddingLeft();
        }
        if (b.a(this)) {
            height2 -= getPaddingTop() + getPaddingBottom();
            iMax -= getPaddingBottom();
        }
        canvas.translate(paddingLeft2 - width2, iMax);
        canvas.rotate(180.0f, width2, 0.0f);
        this.f2522r.setSize(width2, height2);
        if (this.f2522r.draw(canvas)) {
            w.f0(this);
        }
        canvas.restoreToCount(iSave2);
    }

    protected int f(Rect rect) {
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i10 = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i11 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i10 - verticalFadingEdgeLength : i10;
        int i12 = rect.bottom;
        if (i12 > i11 && rect.top > scrollY) {
            return Math.min((rect.height() > height ? rect.top - scrollY : rect.bottom - i11) + 0, (childAt.getBottom() + layoutParams.bottomMargin) - i10);
        }
        if (rect.top >= scrollY || i12 >= i11) {
            return 0;
        }
        return Math.max(rect.height() > height ? 0 - (i11 - rect.bottom) : 0 - (scrollY - rect.top), -getScrollY());
    }

    int g(int i10) {
        int height = getHeight();
        if (i10 > 0 && androidx.core.widget.d.b(this.f2521q) != 0.0f) {
            int iRound = Math.round(((-height) / 4.0f) * androidx.core.widget.d.d(this.f2521q, ((-i10) * 4.0f) / height, 0.5f));
            if (iRound != i10) {
                this.f2521q.finish();
            }
            return i10 - iRound;
        }
        if (i10 >= 0 || androidx.core.widget.d.b(this.f2522r) == 0.0f) {
            return i10;
        }
        float f5 = height;
        int iRound2 = Math.round((f5 / 4.0f) * androidx.core.widget.d.d(this.f2522r, (i10 * 4.0f) / f5, 0.5f));
        if (iRound2 != i10) {
            this.f2522r.finish();
        }
        return i10 - iRound2;
    }

    @Override // android.view.View
    protected float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + layoutParams.bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return bottom / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (getHeight() * 0.5f);
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.J.a();
    }

    int getScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    @Override // android.view.View
    protected float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return scrollY / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    @Override // androidx.core.view.o
    public void h(View view, View view2, int i10, int i11) {
        this.J.c(view, view2, i10, i11);
        U(2, i11);
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return x(0);
    }

    @Override // androidx.core.view.o
    public void i(View view, int i10) {
        this.J.e(view, i10);
        W(i10);
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return this.K.l();
    }

    @Override // androidx.core.view.o
    public void j(View view, int i10, int i11, int[] iArr, int i12) {
        k(i10, i11, iArr, null, i12);
    }

    public boolean k(int i10, int i11, int[] iArr, int[] iArr2, int i12) {
        return this.K.d(i10, i11, iArr, iArr2, i12);
    }

    public void l(int i10, int i11, int i12, int i13, int[] iArr, int i14, int[] iArr2) {
        this.K.e(i10, i11, i12, i13, iArr, i14, iArr2);
    }

    @Override // androidx.core.view.p
    public void m(View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        F(i13, i14, iArr);
    }

    @Override // android.view.ViewGroup
    protected void measureChild(View view, int i10, int i11) {
        view.measure(FrameLayout.getChildMeasureSpec(i10, getPaddingLeft() + getPaddingRight(), view.getLayoutParams().width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.ViewGroup
    protected void measureChildWithMargins(View view, int i10, int i11, int i12, int i13) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(FrameLayout.getChildMeasureSpec(i10, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i11, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    @Override // androidx.core.view.o
    public void n(View view, int i10, int i11, int i12, int i13, int i14) {
        F(i13, i14, null);
    }

    @Override // androidx.core.view.o
    public boolean o(View view, View view2, int i10, int i11) {
        return (i10 & 2) != 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f2525u = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x002c  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onGenericMotionEvent(android.view.MotionEvent r9) {
        /*
            r8 = this;
            int r0 = r9.getAction()
            r1 = 0
            r2 = 8
            if (r0 != r2) goto La6
            boolean r0 = r8.f2527w
            if (r0 != 0) goto La6
            r0 = 2
            boolean r0 = androidx.core.view.l.a(r9, r0)
            r2 = 0
            if (r0 == 0) goto L1c
            r0 = 9
        L17:
            float r0 = r9.getAxisValue(r0)
            goto L28
        L1c:
            r0 = 4194304(0x400000, float:5.877472E-39)
            boolean r0 = androidx.core.view.l.a(r9, r0)
            if (r0 == 0) goto L27
            r0 = 26
            goto L17
        L27:
            r0 = r2
        L28:
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto La6
            float r2 = r8.getVerticalScrollFactorCompat()
            float r0 = r0 * r2
            int r0 = (int) r0
            int r2 = r8.getScrollRange()
            int r3 = r8.getScrollY()
            int r0 = r3 - r0
            r4 = 1056964608(0x3f000000, float:0.5)
            r5 = 8194(0x2002, float:1.1482E-41)
            r6 = 1
            if (r0 >= 0) goto L6d
            boolean r2 = r8.c()
            if (r2 == 0) goto L51
            boolean r9 = androidx.core.view.l.a(r9, r5)
            if (r9 != 0) goto L51
            r9 = r6
            goto L52
        L51:
            r9 = r1
        L52:
            if (r9 == 0) goto L6b
            android.widget.EdgeEffect r9 = r8.f2521q
            float r0 = (float) r0
            float r0 = -r0
            int r2 = r8.getHeight()
            float r2 = (float) r2
            float r0 = r0 / r2
            androidx.core.widget.d.d(r9, r0, r4)
            android.widget.EdgeEffect r9 = r8.f2521q
            r9.onRelease()
            r8.invalidate()
            r9 = r6
            goto L9b
        L6b:
            r9 = r1
            goto L9b
        L6d:
            if (r0 <= r2) goto L99
            boolean r7 = r8.c()
            if (r7 == 0) goto L7d
            boolean r9 = androidx.core.view.l.a(r9, r5)
            if (r9 != 0) goto L7d
            r9 = r6
            goto L7e
        L7d:
            r9 = r1
        L7e:
            if (r9 == 0) goto L96
            android.widget.EdgeEffect r9 = r8.f2522r
            int r0 = r0 - r2
            float r0 = (float) r0
            int r1 = r8.getHeight()
            float r1 = (float) r1
            float r0 = r0 / r1
            androidx.core.widget.d.d(r9, r0, r4)
            android.widget.EdgeEffect r9 = r8.f2522r
            r9.onRelease()
            r8.invalidate()
            r1 = r6
        L96:
            r9 = r1
            r1 = r2
            goto L9b
        L99:
            r9 = r1
            r1 = r0
        L9b:
            if (r1 == r3) goto La5
            int r9 = r8.getScrollX()
            super.scrollTo(r9, r1)
            return r6
        La5:
            return r9
        La6:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.onGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x007e  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r12) {
        /*
            Method dump skipped, instructions count: 246
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        int measuredHeight = 0;
        this.f2524t = false;
        View view = this.f2526v;
        if (view != null && D(view, this)) {
            N(this.f2526v);
        }
        this.f2526v = null;
        if (!this.f2525u) {
            if (this.I != null) {
                scrollTo(getScrollX(), this.I.f2531m);
                this.I = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                measuredHeight = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            }
            int paddingTop = ((i13 - i11) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            int iE = e(scrollY, paddingTop, measuredHeight);
            if (iE != scrollY) {
                scrollTo(getScrollX(), iE);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f2525u = true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.f2529y && View.MeasureSpec.getMode(i11) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(FrameLayout.getChildMeasureSpec(i10, getPaddingLeft() + getPaddingRight() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f5, float f10, boolean z10) {
        if (z10) {
            return false;
        }
        dispatchNestedFling(0.0f, f10, true);
        u((int) f10);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f5, float f10) {
        return dispatchNestedPreFling(f5, f10);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View view, int i10, int i11, int[] iArr) {
        j(view, i10, i11, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        F(i13, 0, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(View view, View view2, int i10) {
        h(view, view2, i10, 0);
    }

    @Override // android.view.View
    protected void onOverScrolled(int i10, int i11, boolean z10, boolean z11) {
        super.scrollTo(i10, i11);
    }

    @Override // android.view.ViewGroup
    protected boolean onRequestFocusInDescendants(int i10, Rect rect) {
        if (i10 == 2) {
            i10 = 130;
        } else if (i10 == 1) {
            i10 = 33;
        }
        FocusFinder focusFinder = FocusFinder.getInstance();
        View viewFindNextFocus = rect == null ? focusFinder.findNextFocus(this, null, i10) : focusFinder.findNextFocusFromRect(this, rect, i10);
        if (viewFindNextFocus == null || C(viewFindNextFocus)) {
            return false;
        }
        return viewFindNextFocus.requestFocus(i10, rect);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof d)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        d dVar = (d) parcelable;
        super.onRestoreInstanceState(dVar.getSuperState());
        this.I = dVar;
        requestLayout();
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        d dVar = new d(super.onSaveInstanceState());
        dVar.f2531m = getScrollY();
        return dVar;
    }

    @Override // android.view.View
    protected void onScrollChanged(int i10, int i11, int i12, int i13) {
        super.onScrollChanged(i10, i11, i12, i13);
        c cVar = this.M;
        if (cVar != null) {
            cVar.a(this, i10, i11, i12, i13);
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        View viewFindFocus = findFocus();
        if (viewFindFocus == null || this == viewFindFocus || !E(viewFindFocus, 0, i13)) {
            return;
        }
        viewFindFocus.getDrawingRect(this.f2519o);
        offsetDescendantRectToMyCoords(viewFindFocus, this.f2519o);
        p(f(this.f2519o));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i10) {
        return o(view, view2, i10, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        i(view, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01d4  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r24) {
        /*
            Method dump skipped, instructions count: 608
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (this.f2524t) {
            this.f2526v = view2;
        } else {
            N(view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z10) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        return O(rect, z10);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z10) {
        if (z10) {
            J();
        }
        super.requestDisallowInterceptTouchEvent(z10);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        this.f2524t = true;
        super.requestLayout();
    }

    public boolean s(KeyEvent keyEvent) {
        this.f2519o.setEmpty();
        if (!d()) {
            if (!isFocused() || keyEvent.getKeyCode() == 4) {
                return false;
            }
            View viewFindFocus = findFocus();
            if (viewFindFocus == this) {
                viewFindFocus = null;
            }
            View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, 130);
            return (viewFindNextFocus == null || viewFindNextFocus == this || !viewFindNextFocus.requestFocus(130)) ? false : true;
        }
        if (keyEvent.getAction() != 0) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 19) {
            return !keyEvent.isAltPressed() ? b(33) : v(33);
        }
        if (keyCode == 20) {
            return !keyEvent.isAltPressed() ? b(130) : v(130);
        }
        if (keyCode != 62) {
            return false;
        }
        I(keyEvent.isShiftPressed() ? 33 : 130);
        return false;
    }

    @Override // android.view.View
    public void scrollTo(int i10, int i11) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int width2 = childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int height2 = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int iE = e(i10, width, width2);
            int iE2 = e(i11, height, height2);
            if (iE == getScrollX() && iE2 == getScrollY()) {
                return;
            }
            super.scrollTo(iE, iE2);
        }
    }

    public void setFillViewport(boolean z10) {
        if (z10 != this.f2529y) {
            this.f2529y = z10;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z10) {
        this.K.m(z10);
    }

    public void setOnScrollChangeListener(c cVar) {
        this.M = cVar;
    }

    public void setSmoothScrollingEnabled(boolean z10) {
        this.f2530z = z10;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i10) {
        return U(i10, 0);
    }

    @Override // android.view.View
    public void stopNestedScroll() {
        W(0);
    }

    public void u(int i10) {
        if (getChildCount() > 0) {
            this.f2520p.fling(getScrollX(), getScrollY(), 0, i10, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            L(true);
        }
    }

    public boolean v(int i10) {
        int childCount;
        boolean z10 = i10 == 130;
        int height = getHeight();
        Rect rect = this.f2519o;
        rect.top = 0;
        rect.bottom = height;
        if (z10 && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            this.f2519o.bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
            Rect rect2 = this.f2519o;
            rect2.top = rect2.bottom - height;
        }
        Rect rect3 = this.f2519o;
        return M(i10, rect3.top, rect3.bottom);
    }

    public boolean x(int i10) {
        return this.K.k(i10);
    }
}
