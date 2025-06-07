package androidx.swiperefreshlayout.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Transformation;
import android.widget.ListView;
import androidx.core.view.m;
import androidx.core.view.n;
import androidx.core.view.q;
import androidx.core.view.w;

/* loaded from: classes.dex */
public class SwipeRefreshLayout extends ViewGroup implements m {

    /* renamed from: d0, reason: collision with root package name */
    private static final String f3820d0 = SwipeRefreshLayout.class.getSimpleName();

    /* renamed from: e0, reason: collision with root package name */
    private static final int[] f3821e0 = {R.attr.enabled};
    private float A;
    private boolean B;
    private int C;
    boolean D;
    private boolean E;
    private final DecelerateInterpolator F;
    androidx.swiperefreshlayout.widget.a G;
    private int H;
    protected int I;
    float J;
    protected int K;
    int L;
    int M;
    androidx.swiperefreshlayout.widget.b N;
    private Animation O;
    private Animation P;
    private Animation Q;
    private Animation R;
    private Animation S;
    boolean T;
    private int U;
    boolean V;
    private i W;

    /* renamed from: a0, reason: collision with root package name */
    private Animation.AnimationListener f3822a0;

    /* renamed from: b0, reason: collision with root package name */
    private final Animation f3823b0;

    /* renamed from: c0, reason: collision with root package name */
    private final Animation f3824c0;

    /* renamed from: m, reason: collision with root package name */
    private View f3825m;

    /* renamed from: n, reason: collision with root package name */
    j f3826n;

    /* renamed from: o, reason: collision with root package name */
    boolean f3827o;

    /* renamed from: p, reason: collision with root package name */
    private int f3828p;

    /* renamed from: q, reason: collision with root package name */
    private float f3829q;

    /* renamed from: r, reason: collision with root package name */
    private float f3830r;

    /* renamed from: s, reason: collision with root package name */
    private final q f3831s;

    /* renamed from: t, reason: collision with root package name */
    private final n f3832t;

    /* renamed from: u, reason: collision with root package name */
    private final int[] f3833u;

    /* renamed from: v, reason: collision with root package name */
    private final int[] f3834v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f3835w;

    /* renamed from: x, reason: collision with root package name */
    private int f3836x;

    /* renamed from: y, reason: collision with root package name */
    int f3837y;

    /* renamed from: z, reason: collision with root package name */
    private float f3838z;

    class a implements Animation.AnimationListener {
        a() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            j jVar;
            SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
            if (!swipeRefreshLayout.f3827o) {
                swipeRefreshLayout.k();
                return;
            }
            swipeRefreshLayout.N.setAlpha(255);
            SwipeRefreshLayout.this.N.start();
            SwipeRefreshLayout swipeRefreshLayout2 = SwipeRefreshLayout.this;
            if (swipeRefreshLayout2.T && (jVar = swipeRefreshLayout2.f3826n) != null) {
                jVar.a();
            }
            SwipeRefreshLayout swipeRefreshLayout3 = SwipeRefreshLayout.this;
            swipeRefreshLayout3.f3837y = swipeRefreshLayout3.G.getTop();
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    class b extends Animation {
        b() {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f5, Transformation transformation) {
            SwipeRefreshLayout.this.setAnimationProgress(f5);
        }
    }

    class c extends Animation {
        c() {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f5, Transformation transformation) {
            SwipeRefreshLayout.this.setAnimationProgress(1.0f - f5);
        }
    }

    class d extends Animation {

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ int f3842m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ int f3843n;

        d(int i10, int i11) {
            this.f3842m = i10;
            this.f3843n = i11;
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f5, Transformation transformation) {
            SwipeRefreshLayout.this.N.setAlpha((int) (this.f3842m + ((this.f3843n - r0) * f5)));
        }
    }

    class e implements Animation.AnimationListener {
        e() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
            if (swipeRefreshLayout.D) {
                return;
            }
            swipeRefreshLayout.q(null);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    class f extends Animation {
        f() {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f5, Transformation transformation) {
            SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
            int iAbs = !swipeRefreshLayout.V ? swipeRefreshLayout.L - Math.abs(swipeRefreshLayout.K) : swipeRefreshLayout.L;
            SwipeRefreshLayout swipeRefreshLayout2 = SwipeRefreshLayout.this;
            SwipeRefreshLayout.this.setTargetOffsetTopAndBottom((swipeRefreshLayout2.I + ((int) ((iAbs - r1) * f5))) - swipeRefreshLayout2.G.getTop());
            SwipeRefreshLayout.this.N.e(1.0f - f5);
        }
    }

    class g extends Animation {
        g() {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f5, Transformation transformation) {
            SwipeRefreshLayout.this.i(f5);
        }
    }

    class h extends Animation {
        h() {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f5, Transformation transformation) {
            SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
            float f10 = swipeRefreshLayout.J;
            swipeRefreshLayout.setAnimationProgress(f10 + ((-f10) * f5));
            SwipeRefreshLayout.this.i(f5);
        }
    }

    public interface i {
        boolean a(SwipeRefreshLayout swipeRefreshLayout, View view);
    }

    public interface j {
        void a();
    }

    public SwipeRefreshLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3827o = false;
        this.f3829q = -1.0f;
        this.f3833u = new int[2];
        this.f3834v = new int[2];
        this.C = -1;
        this.H = -1;
        this.f3822a0 = new a();
        this.f3823b0 = new f();
        this.f3824c0 = new g();
        this.f3828p = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f3836x = getResources().getInteger(R.integer.config_mediumAnimTime);
        setWillNotDraw(false);
        this.F = new DecelerateInterpolator(2.0f);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.U = (int) (displayMetrics.density * 40.0f);
        d();
        setChildrenDrawingOrderEnabled(true);
        int i10 = (int) (displayMetrics.density * 64.0f);
        this.L = i10;
        this.f3829q = i10;
        this.f3831s = new q(this);
        this.f3832t = new n(this);
        setNestedScrollingEnabled(true);
        int i11 = -this.U;
        this.f3837y = i11;
        this.K = i11;
        i(1.0f);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f3821e0);
        setEnabled(typedArrayObtainStyledAttributes.getBoolean(0, true));
        typedArrayObtainStyledAttributes.recycle();
    }

    private void a(int i10, Animation.AnimationListener animationListener) {
        this.I = i10;
        this.f3823b0.reset();
        this.f3823b0.setDuration(200L);
        this.f3823b0.setInterpolator(this.F);
        if (animationListener != null) {
            this.G.b(animationListener);
        }
        this.G.clearAnimation();
        this.G.startAnimation(this.f3823b0);
    }

    private void b(int i10, Animation.AnimationListener animationListener) {
        if (this.D) {
            r(i10, animationListener);
            return;
        }
        this.I = i10;
        this.f3824c0.reset();
        this.f3824c0.setDuration(200L);
        this.f3824c0.setInterpolator(this.F);
        if (animationListener != null) {
            this.G.b(animationListener);
        }
        this.G.clearAnimation();
        this.G.startAnimation(this.f3824c0);
    }

    private void d() {
        this.G = new androidx.swiperefreshlayout.widget.a(getContext(), -328966);
        androidx.swiperefreshlayout.widget.b bVar = new androidx.swiperefreshlayout.widget.b(getContext());
        this.N = bVar;
        bVar.l(1);
        this.G.setImageDrawable(this.N);
        this.G.setVisibility(8);
        addView(this.G);
    }

    private void e() {
        if (this.f3825m == null) {
            for (int i10 = 0; i10 < getChildCount(); i10++) {
                View childAt = getChildAt(i10);
                if (!childAt.equals(this.G)) {
                    this.f3825m = childAt;
                    return;
                }
            }
        }
    }

    private void f(float f5) {
        if (f5 > this.f3829q) {
            l(true, true);
            return;
        }
        this.f3827o = false;
        this.N.j(0.0f, 0.0f);
        b(this.f3837y, this.D ? null : new e());
        this.N.d(false);
    }

    private boolean g(Animation animation) {
        return (animation == null || !animation.hasStarted() || animation.hasEnded()) ? false : true;
    }

    private void h(float f5) {
        this.N.d(true);
        float fMin = Math.min(1.0f, Math.abs(f5 / this.f3829q));
        float fMax = (((float) Math.max(fMin - 0.4d, 0.0d)) * 5.0f) / 3.0f;
        float fAbs = Math.abs(f5) - this.f3829q;
        int i10 = this.M;
        if (i10 <= 0) {
            i10 = this.V ? this.L - this.K : this.L;
        }
        float f10 = i10;
        double dMax = Math.max(0.0f, Math.min(fAbs, f10 * 2.0f) / f10) / 4.0f;
        float fPow = ((float) (dMax - Math.pow(dMax, 2.0d))) * 2.0f;
        int i11 = this.K + ((int) ((f10 * fMin) + (f10 * fPow * 2.0f)));
        if (this.G.getVisibility() != 0) {
            this.G.setVisibility(0);
        }
        if (!this.D) {
            this.G.setScaleX(1.0f);
            this.G.setScaleY(1.0f);
        }
        if (this.D) {
            setAnimationProgress(Math.min(1.0f, f5 / this.f3829q));
        }
        if (f5 < this.f3829q) {
            if (this.N.getAlpha() > 76 && !g(this.Q)) {
                p();
            }
        } else if (this.N.getAlpha() < 255 && !g(this.R)) {
            o();
        }
        this.N.j(0.0f, Math.min(0.8f, fMax * 0.8f));
        this.N.e(Math.min(1.0f, fMax));
        this.N.g((((fMax * 0.4f) - 0.25f) + (fPow * 2.0f)) * 0.5f);
        setTargetOffsetTopAndBottom(i11 - this.f3837y);
    }

    private void j(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.C) {
            this.C = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
        }
    }

    private void l(boolean z10, boolean z11) {
        if (this.f3827o != z10) {
            this.T = z11;
            e();
            this.f3827o = z10;
            if (z10) {
                a(this.f3837y, this.f3822a0);
            } else {
                q(this.f3822a0);
            }
        }
    }

    private Animation m(int i10, int i11) {
        d dVar = new d(i10, i11);
        dVar.setDuration(300L);
        this.G.b(null);
        this.G.clearAnimation();
        this.G.startAnimation(dVar);
        return dVar;
    }

    private void n(float f5) {
        float f10 = this.A;
        float f11 = f5 - f10;
        int i10 = this.f3828p;
        if (f11 <= i10 || this.B) {
            return;
        }
        this.f3838z = f10 + i10;
        this.B = true;
        this.N.setAlpha(76);
    }

    private void o() {
        this.R = m(this.N.getAlpha(), 255);
    }

    private void p() {
        this.Q = m(this.N.getAlpha(), 76);
    }

    private void r(int i10, Animation.AnimationListener animationListener) {
        this.I = i10;
        this.J = this.G.getScaleX();
        h hVar = new h();
        this.S = hVar;
        hVar.setDuration(150L);
        if (animationListener != null) {
            this.G.b(animationListener);
        }
        this.G.clearAnimation();
        this.G.startAnimation(this.S);
    }

    private void s(Animation.AnimationListener animationListener) {
        this.G.setVisibility(0);
        this.N.setAlpha(255);
        b bVar = new b();
        this.O = bVar;
        bVar.setDuration(this.f3836x);
        if (animationListener != null) {
            this.G.b(animationListener);
        }
        this.G.clearAnimation();
        this.G.startAnimation(this.O);
    }

    private void setColorViewAlpha(int i10) {
        this.G.getBackground().setAlpha(i10);
        this.N.setAlpha(i10);
    }

    public boolean c() {
        i iVar = this.W;
        if (iVar != null) {
            return iVar.a(this, this.f3825m);
        }
        View view = this.f3825m;
        return view instanceof ListView ? androidx.core.widget.g.a((ListView) view, -1) : view.canScrollVertically(-1);
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f5, float f10, boolean z10) {
        return this.f3832t.a(f5, f10, z10);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f5, float f10) {
        return this.f3832t.b(f5, f10);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i10, int i11, int[] iArr, int[] iArr2) {
        return this.f3832t.c(i10, i11, iArr, iArr2);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i10, int i11, int i12, int i13, int[] iArr) {
        return this.f3832t.f(i10, i11, i12, i13, iArr);
    }

    @Override // android.view.ViewGroup
    protected int getChildDrawingOrder(int i10, int i11) {
        int i12 = this.H;
        return i12 < 0 ? i11 : i11 == i10 + (-1) ? i12 : i11 >= i12 ? i11 + 1 : i11;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.f3831s.a();
    }

    public int getProgressCircleDiameter() {
        return this.U;
    }

    public int getProgressViewEndOffset() {
        return this.L;
    }

    public int getProgressViewStartOffset() {
        return this.K;
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return this.f3832t.j();
    }

    void i(float f5) {
        setTargetOffsetTopAndBottom((this.I + ((int) ((this.K - r0) * f5))) - this.G.getTop());
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return this.f3832t.l();
    }

    void k() {
        this.G.clearAnimation();
        this.N.stop();
        this.G.setVisibility(8);
        setColorViewAlpha(255);
        if (this.D) {
            setAnimationProgress(0.0f);
        } else {
            setTargetOffsetTopAndBottom(this.K - this.f3837y);
        }
        this.f3837y = this.G.getTop();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        k();
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0058  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r5) {
        /*
            r4 = this;
            r4.e()
            int r0 = r5.getActionMasked()
            boolean r1 = r4.E
            r2 = 0
            if (r1 == 0) goto L10
            if (r0 != 0) goto L10
            r4.E = r2
        L10:
            boolean r1 = r4.isEnabled()
            if (r1 == 0) goto L81
            boolean r1 = r4.E
            if (r1 != 0) goto L81
            boolean r1 = r4.c()
            if (r1 != 0) goto L81
            boolean r1 = r4.f3827o
            if (r1 != 0) goto L81
            boolean r1 = r4.f3835w
            if (r1 == 0) goto L29
            goto L81
        L29:
            if (r0 == 0) goto L5d
            r1 = 1
            r3 = -1
            if (r0 == r1) goto L58
            r1 = 2
            if (r0 == r1) goto L3d
            r1 = 3
            if (r0 == r1) goto L58
            r1 = 6
            if (r0 == r1) goto L39
            goto L7e
        L39:
            r4.j(r5)
            goto L7e
        L3d:
            int r0 = r4.C
            if (r0 != r3) goto L49
            java.lang.String r5 = androidx.swiperefreshlayout.widget.SwipeRefreshLayout.f3820d0
            java.lang.String r0 = "Got ACTION_MOVE event but don't have an active pointer id."
            android.util.Log.e(r5, r0)
            return r2
        L49:
            int r0 = r5.findPointerIndex(r0)
            if (r0 >= 0) goto L50
            return r2
        L50:
            float r5 = r5.getY(r0)
            r4.n(r5)
            goto L7e
        L58:
            r4.B = r2
            r4.C = r3
            goto L7e
        L5d:
            int r0 = r4.K
            androidx.swiperefreshlayout.widget.a r1 = r4.G
            int r1 = r1.getTop()
            int r0 = r0 - r1
            r4.setTargetOffsetTopAndBottom(r0)
            int r0 = r5.getPointerId(r2)
            r4.C = r0
            r4.B = r2
            int r0 = r5.findPointerIndex(r0)
            if (r0 >= 0) goto L78
            return r2
        L78:
            float r5 = r5.getY(r0)
            r4.A = r5
        L7e:
            boolean r5 = r4.B
            return r5
        L81:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.swiperefreshlayout.widget.SwipeRefreshLayout.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (getChildCount() == 0) {
            return;
        }
        if (this.f3825m == null) {
            e();
        }
        View view = this.f3825m;
        if (view == null) {
            return;
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        view.layout(paddingLeft, paddingTop, ((measuredWidth - getPaddingLeft()) - getPaddingRight()) + paddingLeft, ((measuredHeight - getPaddingTop()) - getPaddingBottom()) + paddingTop);
        int measuredWidth2 = this.G.getMeasuredWidth();
        int measuredHeight2 = this.G.getMeasuredHeight();
        int i14 = measuredWidth / 2;
        int i15 = measuredWidth2 / 2;
        int i16 = this.f3837y;
        this.G.layout(i14 - i15, i16, i14 + i15, measuredHeight2 + i16);
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.f3825m == null) {
            e();
        }
        View view = this.f3825m;
        if (view == null) {
            return;
        }
        view.measure(View.MeasureSpec.makeMeasureSpec((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), 1073741824));
        this.G.measure(View.MeasureSpec.makeMeasureSpec(this.U, 1073741824), View.MeasureSpec.makeMeasureSpec(this.U, 1073741824));
        this.H = -1;
        for (int i12 = 0; i12 < getChildCount(); i12++) {
            if (getChildAt(i12) == this.G) {
                this.H = i12;
                return;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f5, float f10, boolean z10) {
        return dispatchNestedFling(f5, f10, z10);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f5, float f10) {
        return dispatchNestedPreFling(f5, f10);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View view, int i10, int i11, int[] iArr) {
        if (i11 > 0) {
            float f5 = this.f3830r;
            if (f5 > 0.0f) {
                float f10 = i11;
                if (f10 > f5) {
                    iArr[1] = i11 - ((int) f5);
                    this.f3830r = 0.0f;
                } else {
                    this.f3830r = f5 - f10;
                    iArr[1] = i11;
                }
                h(this.f3830r);
            }
        }
        if (this.V && i11 > 0 && this.f3830r == 0.0f && Math.abs(i11 - iArr[1]) > 0) {
            this.G.setVisibility(8);
        }
        int[] iArr2 = this.f3833u;
        if (dispatchNestedPreScroll(i10 - iArr[0], i11 - iArr[1], iArr2, null)) {
            iArr[0] = iArr[0] + iArr2[0];
            iArr[1] = iArr[1] + iArr2[1];
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        dispatchNestedScroll(i10, i11, i12, i13, this.f3834v);
        if (i13 + this.f3834v[1] >= 0 || c()) {
            return;
        }
        float fAbs = this.f3830r + Math.abs(r11);
        this.f3830r = fAbs;
        h(fAbs);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(View view, View view2, int i10) {
        this.f3831s.b(view, view2, i10);
        startNestedScroll(i10 & 2);
        this.f3830r = 0.0f;
        this.f3835w = true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i10) {
        return (!isEnabled() || this.E || this.f3827o || (i10 & 2) == 0) ? false : true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        this.f3831s.d(view);
        this.f3835w = false;
        float f5 = this.f3830r;
        if (f5 > 0.0f) {
            f(f5);
            this.f3830r = 0.0f;
        }
        stopNestedScroll();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (this.E && actionMasked == 0) {
            this.E = false;
        }
        if (!isEnabled() || this.E || c() || this.f3827o || this.f3835w) {
            return false;
        }
        if (actionMasked == 0) {
            this.C = motionEvent.getPointerId(0);
            this.B = false;
        } else {
            if (actionMasked == 1) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.C);
                if (iFindPointerIndex < 0) {
                    Log.e(f3820d0, "Got ACTION_UP event but don't have an active pointer id.");
                    return false;
                }
                if (this.B) {
                    float y10 = (motionEvent.getY(iFindPointerIndex) - this.f3838z) * 0.5f;
                    this.B = false;
                    f(y10);
                }
                this.C = -1;
                return false;
            }
            if (actionMasked == 2) {
                int iFindPointerIndex2 = motionEvent.findPointerIndex(this.C);
                if (iFindPointerIndex2 < 0) {
                    Log.e(f3820d0, "Got ACTION_MOVE event but have an invalid active pointer id.");
                    return false;
                }
                float y11 = motionEvent.getY(iFindPointerIndex2);
                n(y11);
                if (this.B) {
                    float f5 = (y11 - this.f3838z) * 0.5f;
                    if (f5 <= 0.0f) {
                        return false;
                    }
                    h(f5);
                }
            } else {
                if (actionMasked == 3) {
                    return false;
                }
                if (actionMasked == 5) {
                    int actionIndex = motionEvent.getActionIndex();
                    if (actionIndex < 0) {
                        Log.e(f3820d0, "Got ACTION_POINTER_DOWN event but have an invalid action index.");
                        return false;
                    }
                    this.C = motionEvent.getPointerId(actionIndex);
                } else if (actionMasked == 6) {
                    j(motionEvent);
                }
            }
        }
        return true;
    }

    void q(Animation.AnimationListener animationListener) {
        c cVar = new c();
        this.P = cVar;
        cVar.setDuration(150L);
        this.G.b(animationListener);
        this.G.clearAnimation();
        this.G.startAnimation(this.P);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z10) {
        View view = this.f3825m;
        if (view == null || w.T(view)) {
            super.requestDisallowInterceptTouchEvent(z10);
        }
    }

    void setAnimationProgress(float f5) {
        this.G.setScaleX(f5);
        this.G.setScaleY(f5);
    }

    @Deprecated
    public void setColorScheme(int... iArr) {
        setColorSchemeResources(iArr);
    }

    public void setColorSchemeColors(int... iArr) {
        e();
        this.N.f(iArr);
    }

    public void setColorSchemeResources(int... iArr) {
        Context context = getContext();
        int[] iArr2 = new int[iArr.length];
        for (int i10 = 0; i10 < iArr.length; i10++) {
            iArr2[i10] = androidx.core.content.a.c(context, iArr[i10]);
        }
        setColorSchemeColors(iArr2);
    }

    public void setDistanceToTriggerSync(int i10) {
        this.f3829q = i10;
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        if (z10) {
            return;
        }
        k();
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z10) {
        this.f3832t.m(z10);
    }

    public void setOnChildScrollUpCallback(i iVar) {
        this.W = iVar;
    }

    public void setOnRefreshListener(j jVar) {
        this.f3826n = jVar;
    }

    @Deprecated
    public void setProgressBackgroundColor(int i10) {
        setProgressBackgroundColorSchemeResource(i10);
    }

    public void setProgressBackgroundColorSchemeColor(int i10) {
        this.G.setBackgroundColor(i10);
    }

    public void setProgressBackgroundColorSchemeResource(int i10) {
        setProgressBackgroundColorSchemeColor(androidx.core.content.a.c(getContext(), i10));
    }

    public void setRefreshing(boolean z10) {
        if (!z10 || this.f3827o == z10) {
            l(z10, false);
            return;
        }
        this.f3827o = z10;
        setTargetOffsetTopAndBottom((!this.V ? this.L + this.K : this.L) - this.f3837y);
        this.T = false;
        s(this.f3822a0);
    }

    public void setSize(int i10) {
        if (i10 == 0 || i10 == 1) {
            this.U = (int) (getResources().getDisplayMetrics().density * (i10 == 0 ? 56.0f : 40.0f));
            this.G.setImageDrawable(null);
            this.N.l(i10);
            this.G.setImageDrawable(this.N);
        }
    }

    public void setSlingshotDistance(int i10) {
        this.M = i10;
    }

    void setTargetOffsetTopAndBottom(int i10) {
        this.G.bringToFront();
        w.Z(this.G, i10);
        this.f3837y = this.G.getTop();
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i10) {
        return this.f3832t.o(i10);
    }

    @Override // android.view.View
    public void stopNestedScroll() {
        this.f3832t.q();
    }
}
