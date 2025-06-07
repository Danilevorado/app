package androidx.appcompat.widget;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import androidx.appcompat.view.menu.m;
import androidx.core.view.h0;

@SuppressLint({"UnknownNullness"})
/* loaded from: classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements g0, androidx.core.view.o, androidx.core.view.p {
    static final int[] R = {f.a.f23289b, R.attr.windowContentOverlay};
    private final Rect A;
    private final Rect B;
    private final Rect C;
    private final Rect D;
    private final Rect E;
    private final Rect F;
    private androidx.core.view.h0 G;
    private androidx.core.view.h0 H;
    private androidx.core.view.h0 I;
    private androidx.core.view.h0 J;
    private d K;
    private OverScroller L;
    ViewPropertyAnimator M;
    final AnimatorListenerAdapter N;
    private final Runnable O;
    private final Runnable P;
    private final androidx.core.view.q Q;

    /* renamed from: m, reason: collision with root package name */
    private int f937m;

    /* renamed from: n, reason: collision with root package name */
    private int f938n;

    /* renamed from: o, reason: collision with root package name */
    private ContentFrameLayout f939o;

    /* renamed from: p, reason: collision with root package name */
    ActionBarContainer f940p;

    /* renamed from: q, reason: collision with root package name */
    private h0 f941q;

    /* renamed from: r, reason: collision with root package name */
    private Drawable f942r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f943s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f944t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f945u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f946v;

    /* renamed from: w, reason: collision with root package name */
    boolean f947w;

    /* renamed from: x, reason: collision with root package name */
    private int f948x;

    /* renamed from: y, reason: collision with root package name */
    private int f949y;

    /* renamed from: z, reason: collision with root package name */
    private final Rect f950z;

    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.M = null;
            actionBarOverlayLayout.f947w = false;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.M = null;
            actionBarOverlayLayout.f947w = false;
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ActionBarOverlayLayout.this.u();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.M = actionBarOverlayLayout.f940p.animate().translationY(0.0f).setListener(ActionBarOverlayLayout.this.N);
        }
    }

    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ActionBarOverlayLayout.this.u();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.M = actionBarOverlayLayout.f940p.animate().translationY(-ActionBarOverlayLayout.this.f940p.getHeight()).setListener(ActionBarOverlayLayout.this.N);
        }
    }

    public interface d {
        void a();

        void b();

        void c();

        void d(boolean z10);

        void e();

        void onWindowVisibilityChanged(int i10);
    }

    public static class e extends ViewGroup.MarginLayoutParams {
        public e(int i10, int i11) {
            super(i10, i11);
        }

        public e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f938n = 0;
        this.f950z = new Rect();
        this.A = new Rect();
        this.B = new Rect();
        this.C = new Rect();
        this.D = new Rect();
        this.E = new Rect();
        this.F = new Rect();
        androidx.core.view.h0 h0Var = androidx.core.view.h0.f2441b;
        this.G = h0Var;
        this.H = h0Var;
        this.I = h0Var;
        this.J = h0Var;
        this.N = new a();
        this.O = new b();
        this.P = new c();
        v(context);
        this.Q = new androidx.core.view.q(this);
    }

    private void A() {
        u();
        this.O.run();
    }

    private boolean B(float f5) {
        this.L.fling(0, 0, 0, (int) f5, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        return this.L.getFinalY() > this.f940p.getHeight();
    }

    private void p() {
        u();
        this.P.run();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean q(android.view.View r3, android.graphics.Rect r4, boolean r5, boolean r6, boolean r7, boolean r8) {
        /*
            r2 = this;
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            androidx.appcompat.widget.ActionBarOverlayLayout$e r3 = (androidx.appcompat.widget.ActionBarOverlayLayout.e) r3
            r0 = 1
            if (r5 == 0) goto L13
            int r5 = r3.leftMargin
            int r1 = r4.left
            if (r5 == r1) goto L13
            r3.leftMargin = r1
            r5 = r0
            goto L14
        L13:
            r5 = 0
        L14:
            if (r6 == 0) goto L1f
            int r6 = r3.topMargin
            int r1 = r4.top
            if (r6 == r1) goto L1f
            r3.topMargin = r1
            r5 = r0
        L1f:
            if (r8 == 0) goto L2a
            int r6 = r3.rightMargin
            int r8 = r4.right
            if (r6 == r8) goto L2a
            r3.rightMargin = r8
            r5 = r0
        L2a:
            if (r7 == 0) goto L35
            int r6 = r3.bottomMargin
            int r4 = r4.bottom
            if (r6 == r4) goto L35
            r3.bottomMargin = r4
            goto L36
        L35:
            r0 = r5
        L36:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarOverlayLayout.q(android.view.View, android.graphics.Rect, boolean, boolean, boolean, boolean):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private h0 t(View view) {
        if (view instanceof h0) {
            return (h0) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        throw new IllegalStateException("Can't make a decor toolbar out of " + view.getClass().getSimpleName());
    }

    private void v(Context context) {
        TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(R);
        this.f937m = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(1);
        this.f942r = drawable;
        setWillNotDraw(drawable == null);
        typedArrayObtainStyledAttributes.recycle();
        this.f943s = context.getApplicationInfo().targetSdkVersion < 19;
        this.L = new OverScroller(context);
    }

    private void x() {
        u();
        postDelayed(this.P, 600L);
    }

    private void y() {
        u();
        postDelayed(this.O, 600L);
    }

    @Override // androidx.appcompat.widget.g0
    public void a(Menu menu, m.a aVar) {
        z();
        this.f941q.a(menu, aVar);
    }

    @Override // androidx.appcompat.widget.g0
    public boolean b() {
        z();
        return this.f941q.b();
    }

    @Override // androidx.appcompat.widget.g0
    public void c() {
        z();
        this.f941q.c();
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof e;
    }

    @Override // androidx.appcompat.widget.g0
    public boolean d() {
        z();
        return this.f941q.d();
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f942r == null || this.f943s) {
            return;
        }
        int bottom = this.f940p.getVisibility() == 0 ? (int) (this.f940p.getBottom() + this.f940p.getTranslationY() + 0.5f) : 0;
        this.f942r.setBounds(0, bottom, getWidth(), this.f942r.getIntrinsicHeight() + bottom);
        this.f942r.draw(canvas);
    }

    @Override // androidx.appcompat.widget.g0
    public boolean e() {
        z();
        return this.f941q.e();
    }

    @Override // androidx.appcompat.widget.g0
    public boolean f() {
        z();
        return this.f941q.f();
    }

    @Override // android.view.View
    protected boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    @Override // androidx.appcompat.widget.g0
    public boolean g() {
        z();
        return this.f941q.g();
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new e(layoutParams);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f940p;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.Q.a();
    }

    public CharSequence getTitle() {
        z();
        return this.f941q.getTitle();
    }

    @Override // androidx.core.view.o
    public void h(View view, View view2, int i10, int i11) {
        if (i11 == 0) {
            onNestedScrollAccepted(view, view2, i10);
        }
    }

    @Override // androidx.core.view.o
    public void i(View view, int i10) {
        if (i10 == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // androidx.core.view.o
    public void j(View view, int i10, int i11, int[] iArr, int i12) {
        if (i12 == 0) {
            onNestedPreScroll(view, i10, i11, iArr);
        }
    }

    @Override // androidx.appcompat.widget.g0
    public void k(int i10) {
        z();
        if (i10 == 2) {
            this.f941q.u();
        } else if (i10 == 5) {
            this.f941q.v();
        } else {
            if (i10 != 109) {
                return;
            }
            setOverlayMode(true);
        }
    }

    @Override // androidx.appcompat.widget.g0
    public void l() {
        z();
        this.f941q.h();
    }

    @Override // androidx.core.view.p
    public void m(View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        n(view, i10, i11, i12, i13, i14);
    }

    @Override // androidx.core.view.o
    public void n(View view, int i10, int i11, int i12, int i13, int i14) {
        if (i14 == 0) {
            onNestedScroll(view, i10, i11, i12, i13);
        }
    }

    @Override // androidx.core.view.o
    public boolean o(View view, View view2, int i10, int i11) {
        return i11 == 0 && onStartNestedScroll(view, view2, i10);
    }

    @Override // android.view.View
    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        z();
        androidx.core.view.h0 h0VarV = androidx.core.view.h0.v(windowInsets, this);
        boolean zQ = q(this.f940p, new Rect(h0VarV.i(), h0VarV.k(), h0VarV.j(), h0VarV.h()), true, true, false, true);
        androidx.core.view.w.f(this, h0VarV, this.f950z);
        Rect rect = this.f950z;
        androidx.core.view.h0 h0VarL = h0VarV.l(rect.left, rect.top, rect.right, rect.bottom);
        this.G = h0VarL;
        boolean z10 = true;
        if (!this.H.equals(h0VarL)) {
            this.H = this.G;
            zQ = true;
        }
        if (this.A.equals(this.f950z)) {
            z10 = zQ;
        } else {
            this.A.set(this.f950z);
        }
        if (z10) {
            requestLayout();
        }
        return h0VarV.a().c().b().t();
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        v(getContext());
        androidx.core.view.w.l0(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        u();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i15 = ((ViewGroup.MarginLayoutParams) eVar).leftMargin + paddingLeft;
                int i16 = ((ViewGroup.MarginLayoutParams) eVar).topMargin + paddingTop;
                childAt.layout(i15, i16, measuredWidth + i15, measuredHeight + i16);
            }
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        int measuredHeight;
        androidx.core.view.h0 h0VarA;
        z();
        measureChildWithMargins(this.f940p, i10, 0, i11, 0);
        e eVar = (e) this.f940p.getLayoutParams();
        int iMax = Math.max(0, this.f940p.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) eVar).leftMargin + ((ViewGroup.MarginLayoutParams) eVar).rightMargin);
        int iMax2 = Math.max(0, this.f940p.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) eVar).topMargin + ((ViewGroup.MarginLayoutParams) eVar).bottomMargin);
        int iCombineMeasuredStates = View.combineMeasuredStates(0, this.f940p.getMeasuredState());
        boolean z10 = (androidx.core.view.w.K(this) & 256) != 0;
        if (z10) {
            measuredHeight = this.f937m;
            if (this.f945u && this.f940p.getTabContainer() != null) {
                measuredHeight += this.f937m;
            }
        } else {
            measuredHeight = this.f940p.getVisibility() != 8 ? this.f940p.getMeasuredHeight() : 0;
        }
        this.B.set(this.f950z);
        androidx.core.view.h0 h0Var = this.G;
        this.I = h0Var;
        if (this.f944t || z10) {
            h0VarA = new h0.b(this.I).c(androidx.core.graphics.b.b(h0Var.i(), this.I.k() + measuredHeight, this.I.j(), this.I.h() + 0)).a();
        } else {
            Rect rect = this.B;
            rect.top += measuredHeight;
            rect.bottom += 0;
            h0VarA = h0Var.l(0, measuredHeight, 0, 0);
        }
        this.I = h0VarA;
        q(this.f939o, this.B, true, true, true, true);
        if (!this.J.equals(this.I)) {
            androidx.core.view.h0 h0Var2 = this.I;
            this.J = h0Var2;
            androidx.core.view.w.g(this.f939o, h0Var2);
        }
        measureChildWithMargins(this.f939o, i10, 0, i11, 0);
        e eVar2 = (e) this.f939o.getLayoutParams();
        int iMax3 = Math.max(iMax, this.f939o.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) eVar2).leftMargin + ((ViewGroup.MarginLayoutParams) eVar2).rightMargin);
        int iMax4 = Math.max(iMax2, this.f939o.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) eVar2).topMargin + ((ViewGroup.MarginLayoutParams) eVar2).bottomMargin);
        int iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.f939o.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(iMax3 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i10, iCombineMeasuredStates2), View.resolveSizeAndState(Math.max(iMax4 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i11, iCombineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f5, float f10, boolean z10) {
        if (!this.f946v || !z10) {
            return false;
        }
        if (B(f10)) {
            p();
        } else {
            A();
        }
        this.f947w = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f5, float f10) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View view, int i10, int i11, int[] iArr) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        int i14 = this.f948x + i11;
        this.f948x = i14;
        setActionBarHideOffset(i14);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(View view, View view2, int i10) {
        this.Q.b(view, view2, i10);
        this.f948x = getActionBarHideOffset();
        u();
        d dVar = this.K;
        if (dVar != null) {
            dVar.b();
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i10) {
        if ((i10 & 2) == 0 || this.f940p.getVisibility() != 0) {
            return false;
        }
        return this.f946v;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        if (this.f946v && !this.f947w) {
            if (this.f948x <= this.f940p.getHeight()) {
                y();
            } else {
                x();
            }
        }
        d dVar = this.K;
        if (dVar != null) {
            dVar.c();
        }
    }

    @Override // android.view.View
    public void onWindowSystemUiVisibilityChanged(int i10) {
        super.onWindowSystemUiVisibilityChanged(i10);
        z();
        int i11 = this.f949y ^ i10;
        this.f949y = i10;
        boolean z10 = (i10 & 4) == 0;
        boolean z11 = (i10 & 256) != 0;
        d dVar = this.K;
        if (dVar != null) {
            dVar.d(!z11);
            if (z10 || !z11) {
                this.K.a();
            } else {
                this.K.e();
            }
        }
        if ((i11 & 256) == 0 || this.K == null) {
            return;
        }
        androidx.core.view.w.l0(this);
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int i10) {
        super.onWindowVisibilityChanged(i10);
        this.f938n = i10;
        d dVar = this.K;
        if (dVar != null) {
            dVar.onWindowVisibilityChanged(i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public e generateDefaultLayoutParams() {
        return new e(-1, -1);
    }

    @Override // android.view.ViewGroup
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public e generateLayoutParams(AttributeSet attributeSet) {
        return new e(getContext(), attributeSet);
    }

    public void setActionBarHideOffset(int i10) {
        u();
        this.f940p.setTranslationY(-Math.max(0, Math.min(i10, this.f940p.getHeight())));
    }

    public void setActionBarVisibilityCallback(d dVar) {
        this.K = dVar;
        if (getWindowToken() != null) {
            this.K.onWindowVisibilityChanged(this.f938n);
            int i10 = this.f949y;
            if (i10 != 0) {
                onWindowSystemUiVisibilityChanged(i10);
                androidx.core.view.w.l0(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z10) {
        this.f945u = z10;
    }

    public void setHideOnContentScrollEnabled(boolean z10) {
        if (z10 != this.f946v) {
            this.f946v = z10;
            if (z10) {
                return;
            }
            u();
            setActionBarHideOffset(0);
        }
    }

    public void setIcon(int i10) {
        z();
        this.f941q.setIcon(i10);
    }

    public void setIcon(Drawable drawable) {
        z();
        this.f941q.setIcon(drawable);
    }

    public void setLogo(int i10) {
        z();
        this.f941q.r(i10);
    }

    public void setOverlayMode(boolean z10) {
        this.f944t = z10;
        this.f943s = z10 && getContext().getApplicationInfo().targetSdkVersion < 19;
    }

    public void setShowingForActionMode(boolean z10) {
    }

    public void setUiOptions(int i10) {
    }

    @Override // androidx.appcompat.widget.g0
    public void setWindowCallback(Window.Callback callback) {
        z();
        this.f941q.setWindowCallback(callback);
    }

    @Override // androidx.appcompat.widget.g0
    public void setWindowTitle(CharSequence charSequence) {
        z();
        this.f941q.setWindowTitle(charSequence);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    void u() {
        removeCallbacks(this.O);
        removeCallbacks(this.P);
        ViewPropertyAnimator viewPropertyAnimator = this.M;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public boolean w() {
        return this.f944t;
    }

    void z() {
        if (this.f939o == null) {
            this.f939o = (ContentFrameLayout) findViewById(f.f.f23363b);
            this.f940p = (ActionBarContainer) findViewById(f.f.f23364c);
            this.f941q = t(findViewById(f.f.f23362a));
        }
    }
}
