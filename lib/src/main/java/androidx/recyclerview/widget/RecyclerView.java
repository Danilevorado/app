package androidx.recyclerview.widget;

import android.R;
import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Observable;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.core.view.accessibility.d;
import androidx.recyclerview.widget.a;
import androidx.recyclerview.widget.b;
import androidx.recyclerview.widget.e;
import androidx.recyclerview.widget.k;
import androidx.recyclerview.widget.o;
import androidx.recyclerview.widget.p;
import com.facebook.ads.AdError;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public class RecyclerView extends ViewGroup implements androidx.core.view.m {
    private static final int[] K0 = {R.attr.nestedScrollingEnabled};
    static final boolean L0 = false;
    static final boolean M0 = true;
    static final boolean N0 = true;
    static final boolean O0 = true;
    private static final boolean P0 = false;
    private static final boolean Q0 = false;
    private static final Class[] R0;
    static final Interpolator S0;
    final ArrayList A;
    androidx.recyclerview.widget.k A0;
    private final ArrayList B;
    private j B0;
    private s C;
    private final int[] C0;
    boolean D;
    private androidx.core.view.n D0;
    boolean E;
    private final int[] E0;
    boolean F;
    private final int[] F0;
    boolean G;
    final int[] G0;
    private int H;
    final List H0;
    boolean I;
    private Runnable I0;
    boolean J;
    private final p.b J0;
    private boolean K;
    private int L;
    boolean M;
    private final AccessibilityManager N;
    private List O;
    boolean P;
    boolean Q;
    private int R;
    private int S;
    private k T;
    private EdgeEffect U;
    private EdgeEffect V;
    private EdgeEffect W;

    /* renamed from: a0, reason: collision with root package name */
    private EdgeEffect f3237a0;

    /* renamed from: b0, reason: collision with root package name */
    l f3238b0;

    /* renamed from: c0, reason: collision with root package name */
    private int f3239c0;

    /* renamed from: d0, reason: collision with root package name */
    private int f3240d0;

    /* renamed from: e0, reason: collision with root package name */
    private VelocityTracker f3241e0;

    /* renamed from: f0, reason: collision with root package name */
    private int f3242f0;

    /* renamed from: g0, reason: collision with root package name */
    private int f3243g0;

    /* renamed from: h0, reason: collision with root package name */
    private int f3244h0;

    /* renamed from: i0, reason: collision with root package name */
    private int f3245i0;

    /* renamed from: j0, reason: collision with root package name */
    private int f3246j0;

    /* renamed from: k0, reason: collision with root package name */
    private r f3247k0;

    /* renamed from: l0, reason: collision with root package name */
    private final int f3248l0;

    /* renamed from: m, reason: collision with root package name */
    private final x f3249m;

    /* renamed from: m0, reason: collision with root package name */
    private final int f3250m0;

    /* renamed from: n, reason: collision with root package name */
    final v f3251n;

    /* renamed from: n0, reason: collision with root package name */
    private float f3252n0;

    /* renamed from: o, reason: collision with root package name */
    private y f3253o;

    /* renamed from: o0, reason: collision with root package name */
    private float f3254o0;

    /* renamed from: p, reason: collision with root package name */
    androidx.recyclerview.widget.a f3255p;

    /* renamed from: p0, reason: collision with root package name */
    private boolean f3256p0;

    /* renamed from: q, reason: collision with root package name */
    androidx.recyclerview.widget.b f3257q;

    /* renamed from: q0, reason: collision with root package name */
    final c0 f3258q0;

    /* renamed from: r, reason: collision with root package name */
    final androidx.recyclerview.widget.p f3259r;

    /* renamed from: r0, reason: collision with root package name */
    androidx.recyclerview.widget.e f3260r0;

    /* renamed from: s, reason: collision with root package name */
    boolean f3261s;

    /* renamed from: s0, reason: collision with root package name */
    e.b f3262s0;

    /* renamed from: t, reason: collision with root package name */
    final Runnable f3263t;

    /* renamed from: t0, reason: collision with root package name */
    final a0 f3264t0;

    /* renamed from: u, reason: collision with root package name */
    final Rect f3265u;

    /* renamed from: u0, reason: collision with root package name */
    private t f3266u0;

    /* renamed from: v, reason: collision with root package name */
    private final Rect f3267v;

    /* renamed from: v0, reason: collision with root package name */
    private List f3268v0;

    /* renamed from: w, reason: collision with root package name */
    final RectF f3269w;

    /* renamed from: w0, reason: collision with root package name */
    boolean f3270w0;

    /* renamed from: x, reason: collision with root package name */
    g f3271x;

    /* renamed from: x0, reason: collision with root package name */
    boolean f3272x0;

    /* renamed from: y, reason: collision with root package name */
    o f3273y;

    /* renamed from: y0, reason: collision with root package name */
    private l.b f3274y0;

    /* renamed from: z, reason: collision with root package name */
    w f3275z;

    /* renamed from: z0, reason: collision with root package name */
    boolean f3276z0;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            RecyclerView recyclerView = RecyclerView.this;
            if (!recyclerView.G || recyclerView.isLayoutRequested()) {
                return;
            }
            RecyclerView recyclerView2 = RecyclerView.this;
            if (!recyclerView2.D) {
                recyclerView2.requestLayout();
            } else if (recyclerView2.J) {
                recyclerView2.I = true;
            } else {
                recyclerView2.u();
            }
        }
    }

    public static class a0 {

        /* renamed from: b, reason: collision with root package name */
        private SparseArray f3279b;

        /* renamed from: m, reason: collision with root package name */
        int f3290m;

        /* renamed from: n, reason: collision with root package name */
        long f3291n;

        /* renamed from: o, reason: collision with root package name */
        int f3292o;

        /* renamed from: p, reason: collision with root package name */
        int f3293p;

        /* renamed from: q, reason: collision with root package name */
        int f3294q;

        /* renamed from: a, reason: collision with root package name */
        int f3278a = -1;

        /* renamed from: c, reason: collision with root package name */
        int f3280c = 0;

        /* renamed from: d, reason: collision with root package name */
        int f3281d = 0;

        /* renamed from: e, reason: collision with root package name */
        int f3282e = 1;

        /* renamed from: f, reason: collision with root package name */
        int f3283f = 0;

        /* renamed from: g, reason: collision with root package name */
        boolean f3284g = false;

        /* renamed from: h, reason: collision with root package name */
        boolean f3285h = false;

        /* renamed from: i, reason: collision with root package name */
        boolean f3286i = false;

        /* renamed from: j, reason: collision with root package name */
        boolean f3287j = false;

        /* renamed from: k, reason: collision with root package name */
        boolean f3288k = false;

        /* renamed from: l, reason: collision with root package name */
        boolean f3289l = false;

        void a(int i10) {
            if ((this.f3282e & i10) != 0) {
                return;
            }
            throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i10) + " but it is " + Integer.toBinaryString(this.f3282e));
        }

        public int b() {
            return this.f3285h ? this.f3280c - this.f3281d : this.f3283f;
        }

        public int c() {
            return this.f3278a;
        }

        public boolean d() {
            return this.f3278a != -1;
        }

        public boolean e() {
            return this.f3285h;
        }

        void f(g gVar) {
            this.f3282e = 1;
            this.f3283f = gVar.c();
            this.f3285h = false;
            this.f3286i = false;
            this.f3287j = false;
        }

        public boolean g() {
            return this.f3289l;
        }

        public String toString() {
            return "State{mTargetPosition=" + this.f3278a + ", mData=" + this.f3279b + ", mItemCount=" + this.f3283f + ", mIsMeasuring=" + this.f3287j + ", mPreviousLayoutItemCount=" + this.f3280c + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f3281d + ", mStructureChanged=" + this.f3284g + ", mInPreLayout=" + this.f3285h + ", mRunSimpleAnimations=" + this.f3288k + ", mRunPredictiveAnimations=" + this.f3289l + '}';
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            l lVar = RecyclerView.this.f3238b0;
            if (lVar != null) {
                lVar.u();
            }
            RecyclerView.this.f3276z0 = false;
        }
    }

    public static abstract class b0 {
    }

    static class c implements Interpolator {
        c() {
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f5) {
            float f10 = f5 - 1.0f;
            return (f10 * f10 * f10 * f10 * f10) + 1.0f;
        }
    }

    class c0 implements Runnable {

        /* renamed from: m, reason: collision with root package name */
        private int f3296m;

        /* renamed from: n, reason: collision with root package name */
        private int f3297n;

        /* renamed from: o, reason: collision with root package name */
        OverScroller f3298o;

        /* renamed from: p, reason: collision with root package name */
        Interpolator f3299p;

        /* renamed from: q, reason: collision with root package name */
        private boolean f3300q;

        /* renamed from: r, reason: collision with root package name */
        private boolean f3301r;

        c0() {
            Interpolator interpolator = RecyclerView.S0;
            this.f3299p = interpolator;
            this.f3300q = false;
            this.f3301r = false;
            this.f3298o = new OverScroller(RecyclerView.this.getContext(), interpolator);
        }

        private int a(int i10, int i11, int i12, int i13) {
            int iRound;
            int iAbs = Math.abs(i10);
            int iAbs2 = Math.abs(i11);
            boolean z10 = iAbs > iAbs2;
            int iSqrt = (int) Math.sqrt((i12 * i12) + (i13 * i13));
            int iSqrt2 = (int) Math.sqrt((i10 * i10) + (i11 * i11));
            RecyclerView recyclerView = RecyclerView.this;
            int width = z10 ? recyclerView.getWidth() : recyclerView.getHeight();
            int i14 = width / 2;
            float f5 = width;
            float f10 = i14;
            float fB = f10 + (b(Math.min(1.0f, (iSqrt2 * 1.0f) / f5)) * f10);
            if (iSqrt > 0) {
                iRound = Math.round(Math.abs(fB / iSqrt) * 1000.0f) * 4;
            } else {
                if (!z10) {
                    iAbs = iAbs2;
                }
                iRound = (int) (((iAbs / f5) + 1.0f) * 300.0f);
            }
            return Math.min(iRound, AdError.SERVER_ERROR_CODE);
        }

        private float b(float f5) {
            return (float) Math.sin((f5 - 0.5f) * 0.47123894f);
        }

        private void d() {
            RecyclerView.this.removeCallbacks(this);
            androidx.core.view.w.g0(RecyclerView.this, this);
        }

        public void c(int i10, int i11) {
            RecyclerView.this.setScrollState(2);
            this.f3297n = 0;
            this.f3296m = 0;
            Interpolator interpolator = this.f3299p;
            Interpolator interpolator2 = RecyclerView.S0;
            if (interpolator != interpolator2) {
                this.f3299p = interpolator2;
                this.f3298o = new OverScroller(RecyclerView.this.getContext(), interpolator2);
            }
            this.f3298o.fling(0, 0, i10, i11, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
            e();
        }

        void e() {
            if (this.f3300q) {
                this.f3301r = true;
            } else {
                d();
            }
        }

        public void f(int i10, int i11, int i12, Interpolator interpolator) {
            if (i12 == Integer.MIN_VALUE) {
                i12 = a(i10, i11, 0, 0);
            }
            int i13 = i12;
            if (interpolator == null) {
                interpolator = RecyclerView.S0;
            }
            if (this.f3299p != interpolator) {
                this.f3299p = interpolator;
                this.f3298o = new OverScroller(RecyclerView.this.getContext(), interpolator);
            }
            this.f3297n = 0;
            this.f3296m = 0;
            RecyclerView.this.setScrollState(2);
            this.f3298o.startScroll(0, 0, i10, i11, i13);
            e();
        }

        public void g() {
            RecyclerView.this.removeCallbacks(this);
            this.f3298o.abortAnimation();
        }

        @Override // java.lang.Runnable
        public void run() {
            int i10;
            int i11;
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.f3273y == null) {
                g();
                return;
            }
            this.f3301r = false;
            this.f3300q = true;
            recyclerView.u();
            OverScroller overScroller = this.f3298o;
            if (overScroller.computeScrollOffset()) {
                int currX = overScroller.getCurrX();
                int currY = overScroller.getCurrY();
                int i12 = currX - this.f3296m;
                int i13 = currY - this.f3297n;
                this.f3296m = currX;
                this.f3297n = currY;
                RecyclerView recyclerView2 = RecyclerView.this;
                int[] iArr = recyclerView2.G0;
                iArr[0] = 0;
                iArr[1] = 0;
                if (recyclerView2.F(i12, i13, iArr, null, 1)) {
                    int[] iArr2 = RecyclerView.this.G0;
                    i12 -= iArr2[0];
                    i13 -= iArr2[1];
                }
                if (RecyclerView.this.getOverScrollMode() != 2) {
                    RecyclerView.this.t(i12, i13);
                }
                RecyclerView recyclerView3 = RecyclerView.this;
                if (recyclerView3.f3271x != null) {
                    int[] iArr3 = recyclerView3.G0;
                    iArr3[0] = 0;
                    iArr3[1] = 0;
                    recyclerView3.g1(i12, i13, iArr3);
                    RecyclerView recyclerView4 = RecyclerView.this;
                    int[] iArr4 = recyclerView4.G0;
                    i11 = iArr4[0];
                    i10 = iArr4[1];
                    i12 -= i11;
                    i13 -= i10;
                    z zVar = recyclerView4.f3273y.f3344g;
                    if (zVar != null && !zVar.g() && zVar.h()) {
                        int iB = RecyclerView.this.f3264t0.b();
                        if (iB == 0) {
                            zVar.r();
                        } else {
                            if (zVar.f() >= iB) {
                                zVar.p(iB - 1);
                            }
                            zVar.j(i11, i10);
                        }
                    }
                } else {
                    i10 = 0;
                    i11 = 0;
                }
                if (!RecyclerView.this.A.isEmpty()) {
                    RecyclerView.this.invalidate();
                }
                RecyclerView recyclerView5 = RecyclerView.this;
                int[] iArr5 = recyclerView5.G0;
                iArr5[0] = 0;
                iArr5[1] = 0;
                recyclerView5.G(i11, i10, i12, i13, null, 1, iArr5);
                RecyclerView recyclerView6 = RecyclerView.this;
                int[] iArr6 = recyclerView6.G0;
                int i14 = i12 - iArr6[0];
                int i15 = i13 - iArr6[1];
                if (i11 != 0 || i10 != 0) {
                    recyclerView6.I(i11, i10);
                }
                if (!RecyclerView.this.awakenScrollBars()) {
                    RecyclerView.this.invalidate();
                }
                boolean z10 = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i14 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i15 != 0));
                z zVar2 = RecyclerView.this.f3273y.f3344g;
                if ((zVar2 != null && zVar2.g()) || !z10) {
                    e();
                    RecyclerView recyclerView7 = RecyclerView.this;
                    androidx.recyclerview.widget.e eVar = recyclerView7.f3260r0;
                    if (eVar != null) {
                        eVar.f(recyclerView7, i11, i10);
                    }
                } else {
                    if (RecyclerView.this.getOverScrollMode() != 2) {
                        int currVelocity = (int) overScroller.getCurrVelocity();
                        int i16 = i14 < 0 ? -currVelocity : i14 > 0 ? currVelocity : 0;
                        if (i15 < 0) {
                            currVelocity = -currVelocity;
                        } else if (i15 <= 0) {
                            currVelocity = 0;
                        }
                        RecyclerView.this.a(i16, currVelocity);
                    }
                    if (RecyclerView.O0) {
                        RecyclerView.this.f3262s0.b();
                    }
                }
            }
            z zVar3 = RecyclerView.this.f3273y.f3344g;
            if (zVar3 != null && zVar3.g()) {
                zVar3.j(0, 0);
            }
            this.f3300q = false;
            if (this.f3301r) {
                d();
            } else {
                RecyclerView.this.setScrollState(0);
                RecyclerView.this.t1(1);
            }
        }
    }

    class d implements p.b {
        d() {
        }

        @Override // androidx.recyclerview.widget.p.b
        public void a(d0 d0Var) {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.f3273y.m1(d0Var.f3305a, recyclerView.f3251n);
        }

        @Override // androidx.recyclerview.widget.p.b
        public void b(d0 d0Var, l.c cVar, l.c cVar2) {
            RecyclerView.this.l(d0Var, cVar, cVar2);
        }

        @Override // androidx.recyclerview.widget.p.b
        public void c(d0 d0Var, l.c cVar, l.c cVar2) {
            RecyclerView.this.f3251n.J(d0Var);
            RecyclerView.this.n(d0Var, cVar, cVar2);
        }

        @Override // androidx.recyclerview.widget.p.b
        public void d(d0 d0Var, l.c cVar, l.c cVar2) {
            d0Var.G(false);
            RecyclerView recyclerView = RecyclerView.this;
            boolean z10 = recyclerView.P;
            l lVar = recyclerView.f3238b0;
            if (z10) {
                if (!lVar.b(d0Var, d0Var, cVar, cVar2)) {
                    return;
                }
            } else if (!lVar.d(d0Var, cVar, cVar2)) {
                return;
            }
            RecyclerView.this.M0();
        }
    }

    public static abstract class d0 {

        /* renamed from: s, reason: collision with root package name */
        private static final List f3304s = Collections.emptyList();

        /* renamed from: a, reason: collision with root package name */
        public final View f3305a;

        /* renamed from: b, reason: collision with root package name */
        WeakReference f3306b;

        /* renamed from: j, reason: collision with root package name */
        int f3314j;

        /* renamed from: r, reason: collision with root package name */
        RecyclerView f3322r;

        /* renamed from: c, reason: collision with root package name */
        int f3307c = -1;

        /* renamed from: d, reason: collision with root package name */
        int f3308d = -1;

        /* renamed from: e, reason: collision with root package name */
        long f3309e = -1;

        /* renamed from: f, reason: collision with root package name */
        int f3310f = -1;

        /* renamed from: g, reason: collision with root package name */
        int f3311g = -1;

        /* renamed from: h, reason: collision with root package name */
        d0 f3312h = null;

        /* renamed from: i, reason: collision with root package name */
        d0 f3313i = null;

        /* renamed from: k, reason: collision with root package name */
        List f3315k = null;

        /* renamed from: l, reason: collision with root package name */
        List f3316l = null;

        /* renamed from: m, reason: collision with root package name */
        private int f3317m = 0;

        /* renamed from: n, reason: collision with root package name */
        v f3318n = null;

        /* renamed from: o, reason: collision with root package name */
        boolean f3319o = false;

        /* renamed from: p, reason: collision with root package name */
        private int f3320p = 0;

        /* renamed from: q, reason: collision with root package name */
        int f3321q = -1;

        public d0(View view) {
            if (view == null) {
                throw new IllegalArgumentException("itemView may not be null");
            }
            this.f3305a = view;
        }

        private void g() {
            if (this.f3315k == null) {
                ArrayList arrayList = new ArrayList();
                this.f3315k = arrayList;
                this.f3316l = Collections.unmodifiableList(arrayList);
            }
        }

        void A(int i10, boolean z10) {
            if (this.f3308d == -1) {
                this.f3308d = this.f3307c;
            }
            if (this.f3311g == -1) {
                this.f3311g = this.f3307c;
            }
            if (z10) {
                this.f3311g += i10;
            }
            this.f3307c += i10;
            if (this.f3305a.getLayoutParams() != null) {
                ((p) this.f3305a.getLayoutParams()).f3364c = true;
            }
        }

        void B(RecyclerView recyclerView) {
            int iZ = this.f3321q;
            if (iZ == -1) {
                iZ = androidx.core.view.w.z(this.f3305a);
            }
            this.f3320p = iZ;
            recyclerView.j1(this, 4);
        }

        void C(RecyclerView recyclerView) {
            recyclerView.j1(this, this.f3320p);
            this.f3320p = 0;
        }

        void D() {
            this.f3314j = 0;
            this.f3307c = -1;
            this.f3308d = -1;
            this.f3309e = -1L;
            this.f3311g = -1;
            this.f3317m = 0;
            this.f3312h = null;
            this.f3313i = null;
            d();
            this.f3320p = 0;
            this.f3321q = -1;
            RecyclerView.r(this);
        }

        void E() {
            if (this.f3308d == -1) {
                this.f3308d = this.f3307c;
            }
        }

        void F(int i10, int i11) {
            this.f3314j = (i10 & i11) | (this.f3314j & (~i11));
        }

        public final void G(boolean z10) {
            int i10;
            int i11 = this.f3317m;
            int i12 = z10 ? i11 - 1 : i11 + 1;
            this.f3317m = i12;
            if (i12 < 0) {
                this.f3317m = 0;
                Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
                return;
            }
            if (!z10 && i12 == 1) {
                i10 = this.f3314j | 16;
            } else if (!z10 || i12 != 0) {
                return;
            } else {
                i10 = this.f3314j & (-17);
            }
            this.f3314j = i10;
        }

        void H(v vVar, boolean z10) {
            this.f3318n = vVar;
            this.f3319o = z10;
        }

        boolean I() {
            return (this.f3314j & 16) != 0;
        }

        boolean J() {
            return (this.f3314j & 128) != 0;
        }

        void K() {
            this.f3318n.J(this);
        }

        boolean L() {
            return (this.f3314j & 32) != 0;
        }

        void a(Object obj) {
            if (obj == null) {
                b(1024);
            } else if ((1024 & this.f3314j) == 0) {
                g();
                this.f3315k.add(obj);
            }
        }

        void b(int i10) {
            this.f3314j = i10 | this.f3314j;
        }

        void c() {
            this.f3308d = -1;
            this.f3311g = -1;
        }

        void d() {
            List list = this.f3315k;
            if (list != null) {
                list.clear();
            }
            this.f3314j &= -1025;
        }

        void e() {
            this.f3314j &= -33;
        }

        void f() {
            this.f3314j &= -257;
        }

        boolean h() {
            return (this.f3314j & 16) == 0 && androidx.core.view.w.P(this.f3305a);
        }

        void i(int i10, int i11, boolean z10) {
            b(8);
            A(i11, z10);
            this.f3307c = i10;
        }

        public final int j() {
            RecyclerView recyclerView = this.f3322r;
            if (recyclerView == null) {
                return -1;
            }
            return recyclerView.b0(this);
        }

        public final long k() {
            return this.f3309e;
        }

        public final int l() {
            return this.f3310f;
        }

        public final int m() {
            int i10 = this.f3311g;
            return i10 == -1 ? this.f3307c : i10;
        }

        public final int n() {
            return this.f3308d;
        }

        List o() {
            if ((this.f3314j & 1024) != 0) {
                return f3304s;
            }
            List list = this.f3315k;
            return (list == null || list.size() == 0) ? f3304s : this.f3316l;
        }

        boolean p(int i10) {
            return (i10 & this.f3314j) != 0;
        }

        boolean q() {
            return (this.f3314j & 512) != 0 || t();
        }

        boolean r() {
            return (this.f3305a.getParent() == null || this.f3305a.getParent() == this.f3322r) ? false : true;
        }

        boolean s() {
            return (this.f3314j & 1) != 0;
        }

        boolean t() {
            return (this.f3314j & 4) != 0;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder((getClass().isAnonymousClass() ? "ViewHolder" : getClass().getSimpleName()) + "{" + Integer.toHexString(hashCode()) + " position=" + this.f3307c + " id=" + this.f3309e + ", oldPos=" + this.f3308d + ", pLpos:" + this.f3311g);
            if (w()) {
                sb2.append(" scrap ");
                sb2.append(this.f3319o ? "[changeScrap]" : "[attachedScrap]");
            }
            if (t()) {
                sb2.append(" invalid");
            }
            if (!s()) {
                sb2.append(" unbound");
            }
            if (z()) {
                sb2.append(" update");
            }
            if (v()) {
                sb2.append(" removed");
            }
            if (J()) {
                sb2.append(" ignored");
            }
            if (x()) {
                sb2.append(" tmpDetached");
            }
            if (!u()) {
                sb2.append(" not recyclable(" + this.f3317m + ")");
            }
            if (q()) {
                sb2.append(" undefined adapter position");
            }
            if (this.f3305a.getParent() == null) {
                sb2.append(" no parent");
            }
            sb2.append("}");
            return sb2.toString();
        }

        public final boolean u() {
            return (this.f3314j & 16) == 0 && !androidx.core.view.w.P(this.f3305a);
        }

        boolean v() {
            return (this.f3314j & 8) != 0;
        }

        boolean w() {
            return this.f3318n != null;
        }

        boolean x() {
            return (this.f3314j & 256) != 0;
        }

        boolean y() {
            return (this.f3314j & 2) != 0;
        }

        boolean z() {
            return (this.f3314j & 2) != 0;
        }
    }

    class e implements b.InterfaceC0053b {
        e() {
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0053b
        public View a(int i10) {
            return RecyclerView.this.getChildAt(i10);
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0053b
        public void addView(View view, int i10) {
            RecyclerView.this.addView(view, i10);
            RecyclerView.this.y(view);
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0053b
        public void b(View view) {
            d0 d0VarG0 = RecyclerView.g0(view);
            if (d0VarG0 != null) {
                d0VarG0.B(RecyclerView.this);
            }
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0053b
        public d0 c(View view) {
            return RecyclerView.g0(view);
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0053b
        public void d(int i10) {
            d0 d0VarG0;
            View viewA = a(i10);
            if (viewA != null && (d0VarG0 = RecyclerView.g0(viewA)) != null) {
                if (d0VarG0.x() && !d0VarG0.J()) {
                    throw new IllegalArgumentException("called detach on an already detached child " + d0VarG0 + RecyclerView.this.P());
                }
                d0VarG0.b(256);
            }
            RecyclerView.this.detachViewFromParent(i10);
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0053b
        public void e(View view) {
            d0 d0VarG0 = RecyclerView.g0(view);
            if (d0VarG0 != null) {
                d0VarG0.C(RecyclerView.this);
            }
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0053b
        public int f() {
            return RecyclerView.this.getChildCount();
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0053b
        public void g(int i10) {
            View childAt = RecyclerView.this.getChildAt(i10);
            if (childAt != null) {
                RecyclerView.this.z(childAt);
                childAt.clearAnimation();
            }
            RecyclerView.this.removeViewAt(i10);
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0053b
        public void h() {
            int iF = f();
            for (int i10 = 0; i10 < iF; i10++) {
                View viewA = a(i10);
                RecyclerView.this.z(viewA);
                viewA.clearAnimation();
            }
            RecyclerView.this.removeAllViews();
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0053b
        public void i(View view, int i10, ViewGroup.LayoutParams layoutParams) {
            d0 d0VarG0 = RecyclerView.g0(view);
            if (d0VarG0 != null) {
                if (!d0VarG0.x() && !d0VarG0.J()) {
                    throw new IllegalArgumentException("Called attach on a child which is not detached: " + d0VarG0 + RecyclerView.this.P());
                }
                d0VarG0.f();
            }
            RecyclerView.this.attachViewToParent(view, i10, layoutParams);
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0053b
        public int j(View view) {
            return RecyclerView.this.indexOfChild(view);
        }
    }

    class f implements a.InterfaceC0052a {
        f() {
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0052a
        public void a(int i10, int i11) {
            RecyclerView.this.C0(i10, i11);
            RecyclerView.this.f3270w0 = true;
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0052a
        public void b(a.b bVar) {
            i(bVar);
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0052a
        public d0 c(int i10) {
            d0 d0VarZ = RecyclerView.this.Z(i10, true);
            if (d0VarZ == null || RecyclerView.this.f3257q.n(d0VarZ.f3305a)) {
                return null;
            }
            return d0VarZ;
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0052a
        public void d(int i10, int i11) {
            RecyclerView.this.D0(i10, i11, false);
            RecyclerView.this.f3270w0 = true;
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0052a
        public void e(int i10, int i11) {
            RecyclerView.this.B0(i10, i11);
            RecyclerView.this.f3270w0 = true;
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0052a
        public void f(int i10, int i11) {
            RecyclerView.this.D0(i10, i11, true);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.f3270w0 = true;
            recyclerView.f3264t0.f3281d += i11;
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0052a
        public void g(a.b bVar) {
            i(bVar);
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0052a
        public void h(int i10, int i11, Object obj) {
            RecyclerView.this.w1(i10, i11, obj);
            RecyclerView.this.f3272x0 = true;
        }

        void i(a.b bVar) {
            int i10 = bVar.f3445a;
            if (i10 == 1) {
                RecyclerView recyclerView = RecyclerView.this;
                recyclerView.f3273y.R0(recyclerView, bVar.f3446b, bVar.f3448d);
                return;
            }
            if (i10 == 2) {
                RecyclerView recyclerView2 = RecyclerView.this;
                recyclerView2.f3273y.U0(recyclerView2, bVar.f3446b, bVar.f3448d);
            } else if (i10 == 4) {
                RecyclerView recyclerView3 = RecyclerView.this;
                recyclerView3.f3273y.W0(recyclerView3, bVar.f3446b, bVar.f3448d, bVar.f3447c);
            } else {
                if (i10 != 8) {
                    return;
                }
                RecyclerView recyclerView4 = RecyclerView.this;
                recyclerView4.f3273y.T0(recyclerView4, bVar.f3446b, bVar.f3448d, 1);
            }
        }
    }

    public static abstract class g {

        /* renamed from: m, reason: collision with root package name */
        private final h f3325m = new h();

        /* renamed from: n, reason: collision with root package name */
        private boolean f3326n = false;

        public final void a(d0 d0Var, int i10) {
            d0Var.f3307c = i10;
            if (j()) {
                d0Var.f3309e = e(i10);
            }
            d0Var.F(1, 519);
            androidx.core.os.m.a("RV OnBindView");
            q(d0Var, i10, d0Var.o());
            d0Var.d();
            ViewGroup.LayoutParams layoutParams = d0Var.f3305a.getLayoutParams();
            if (layoutParams instanceof p) {
                ((p) layoutParams).f3364c = true;
            }
            androidx.core.os.m.b();
        }

        public final d0 b(ViewGroup viewGroup, int i10) {
            try {
                androidx.core.os.m.a("RV CreateView");
                d0 d0VarR = r(viewGroup, i10);
                if (d0VarR.f3305a.getParent() != null) {
                    throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
                }
                d0VarR.f3310f = i10;
                return d0VarR;
            } finally {
                androidx.core.os.m.b();
            }
        }

        public abstract int c();

        public long e(int i10) {
            return -1L;
        }

        public int f(int i10) {
            return 0;
        }

        public final boolean g() {
            return this.f3325m.a();
        }

        public final boolean j() {
            return this.f3326n;
        }

        public final void l() {
            this.f3325m.b();
        }

        public final void m(int i10) {
            this.f3325m.c(i10, 1);
        }

        public void n(RecyclerView recyclerView) {
        }

        public abstract void p(d0 d0Var, int i10);

        public void q(d0 d0Var, int i10, List list) {
            p(d0Var, i10);
        }

        public abstract d0 r(ViewGroup viewGroup, int i10);

        public void s(RecyclerView recyclerView) {
        }

        public boolean t(d0 d0Var) {
            return false;
        }

        public void u(d0 d0Var) {
        }

        public void v(d0 d0Var) {
        }

        public void w(d0 d0Var) {
        }

        public void x(i iVar) {
            this.f3325m.registerObserver(iVar);
        }

        public void y(boolean z10) {
            if (g()) {
                throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
            }
            this.f3326n = z10;
        }

        public void z(i iVar) {
            this.f3325m.unregisterObserver(iVar);
        }
    }

    static class h extends Observable {
        h() {
        }

        public boolean a() {
            return !((Observable) this).mObservers.isEmpty();
        }

        public void b() {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((i) ((Observable) this).mObservers.get(size)).a();
            }
        }

        public void c(int i10, int i11) {
            d(i10, i11, null);
        }

        public void d(int i10, int i11, Object obj) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((i) ((Observable) this).mObservers.get(size)).b(i10, i11, obj);
            }
        }
    }

    public static abstract class i {
        public abstract void a();

        public abstract void b(int i10, int i11, Object obj);
    }

    public interface j {
        int a(int i10, int i11);
    }

    public static class k {
        protected EdgeEffect a(RecyclerView recyclerView, int i10) {
            return new EdgeEffect(recyclerView.getContext());
        }
    }

    public static abstract class l {

        /* renamed from: a, reason: collision with root package name */
        private b f3327a = null;

        /* renamed from: b, reason: collision with root package name */
        private ArrayList f3328b = new ArrayList();

        /* renamed from: c, reason: collision with root package name */
        private long f3329c = 120;

        /* renamed from: d, reason: collision with root package name */
        private long f3330d = 120;

        /* renamed from: e, reason: collision with root package name */
        private long f3331e = 250;

        /* renamed from: f, reason: collision with root package name */
        private long f3332f = 250;

        public interface a {
            void a();
        }

        interface b {
            void a(d0 d0Var);
        }

        public static class c {

            /* renamed from: a, reason: collision with root package name */
            public int f3333a;

            /* renamed from: b, reason: collision with root package name */
            public int f3334b;

            /* renamed from: c, reason: collision with root package name */
            public int f3335c;

            /* renamed from: d, reason: collision with root package name */
            public int f3336d;

            public c a(d0 d0Var) {
                return b(d0Var, 0);
            }

            public c b(d0 d0Var, int i10) {
                View view = d0Var.f3305a;
                this.f3333a = view.getLeft();
                this.f3334b = view.getTop();
                this.f3335c = view.getRight();
                this.f3336d = view.getBottom();
                return this;
            }
        }

        static int e(d0 d0Var) {
            int i10 = d0Var.f3314j & 14;
            if (d0Var.t()) {
                return 4;
            }
            if ((i10 & 4) != 0) {
                return i10;
            }
            int iN = d0Var.n();
            int iJ = d0Var.j();
            return (iN == -1 || iJ == -1 || iN == iJ) ? i10 : i10 | 2048;
        }

        public abstract boolean a(d0 d0Var, c cVar, c cVar2);

        public abstract boolean b(d0 d0Var, d0 d0Var2, c cVar, c cVar2);

        public abstract boolean c(d0 d0Var, c cVar, c cVar2);

        public abstract boolean d(d0 d0Var, c cVar, c cVar2);

        public abstract boolean f(d0 d0Var);

        public boolean g(d0 d0Var, List list) {
            return f(d0Var);
        }

        public final void h(d0 d0Var) {
            r(d0Var);
            b bVar = this.f3327a;
            if (bVar != null) {
                bVar.a(d0Var);
            }
        }

        public final void i() {
            int size = this.f3328b.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((a) this.f3328b.get(i10)).a();
            }
            this.f3328b.clear();
        }

        public abstract void j(d0 d0Var);

        public abstract void k();

        public long l() {
            return this.f3329c;
        }

        public long m() {
            return this.f3332f;
        }

        public long n() {
            return this.f3331e;
        }

        public long o() {
            return this.f3330d;
        }

        public abstract boolean p();

        public c q() {
            return new c();
        }

        public void r(d0 d0Var) {
        }

        public c s(a0 a0Var, d0 d0Var) {
            return q().a(d0Var);
        }

        public c t(a0 a0Var, d0 d0Var, int i10, List list) {
            return q().a(d0Var);
        }

        public abstract void u();

        void v(b bVar) {
            this.f3327a = bVar;
        }
    }

    private class m implements l.b {
        m() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.l.b
        public void a(d0 d0Var) {
            d0Var.G(true);
            if (d0Var.f3312h != null && d0Var.f3313i == null) {
                d0Var.f3312h = null;
            }
            d0Var.f3313i = null;
            if (d0Var.I() || RecyclerView.this.V0(d0Var.f3305a) || !d0Var.x()) {
                return;
            }
            RecyclerView.this.removeDetachedView(d0Var.f3305a, false);
        }
    }

    public static abstract class n {
        public void d(Rect rect, int i10, RecyclerView recyclerView) {
            rect.set(0, 0, 0, 0);
        }

        public void e(Rect rect, View view, RecyclerView recyclerView, a0 a0Var) {
            d(rect, ((p) view.getLayoutParams()).a(), recyclerView);
        }

        public void f(Canvas canvas, RecyclerView recyclerView) {
        }

        public void g(Canvas canvas, RecyclerView recyclerView, a0 a0Var) {
            f(canvas, recyclerView);
        }

        public void h(Canvas canvas, RecyclerView recyclerView) {
        }

        public void i(Canvas canvas, RecyclerView recyclerView, a0 a0Var) {
            h(canvas, recyclerView);
        }
    }

    public static abstract class o {

        /* renamed from: a, reason: collision with root package name */
        androidx.recyclerview.widget.b f3338a;

        /* renamed from: b, reason: collision with root package name */
        RecyclerView f3339b;

        /* renamed from: c, reason: collision with root package name */
        private final o.b f3340c;

        /* renamed from: d, reason: collision with root package name */
        private final o.b f3341d;

        /* renamed from: e, reason: collision with root package name */
        androidx.recyclerview.widget.o f3342e;

        /* renamed from: f, reason: collision with root package name */
        androidx.recyclerview.widget.o f3343f;

        /* renamed from: g, reason: collision with root package name */
        z f3344g;

        /* renamed from: h, reason: collision with root package name */
        boolean f3345h;

        /* renamed from: i, reason: collision with root package name */
        boolean f3346i;

        /* renamed from: j, reason: collision with root package name */
        boolean f3347j;

        /* renamed from: k, reason: collision with root package name */
        private boolean f3348k;

        /* renamed from: l, reason: collision with root package name */
        private boolean f3349l;

        /* renamed from: m, reason: collision with root package name */
        int f3350m;

        /* renamed from: n, reason: collision with root package name */
        boolean f3351n;

        /* renamed from: o, reason: collision with root package name */
        private int f3352o;

        /* renamed from: p, reason: collision with root package name */
        private int f3353p;

        /* renamed from: q, reason: collision with root package name */
        private int f3354q;

        /* renamed from: r, reason: collision with root package name */
        private int f3355r;

        class a implements o.b {
            a() {
            }

            @Override // androidx.recyclerview.widget.o.b
            public View a(int i10) {
                return o.this.I(i10);
            }

            @Override // androidx.recyclerview.widget.o.b
            public int b() {
                return o.this.o0() - o.this.f0();
            }

            @Override // androidx.recyclerview.widget.o.b
            public int c(View view) {
                return o.this.Q(view) - ((ViewGroup.MarginLayoutParams) ((p) view.getLayoutParams())).leftMargin;
            }

            @Override // androidx.recyclerview.widget.o.b
            public int d() {
                return o.this.e0();
            }

            @Override // androidx.recyclerview.widget.o.b
            public int e(View view) {
                return o.this.T(view) + ((ViewGroup.MarginLayoutParams) ((p) view.getLayoutParams())).rightMargin;
            }
        }

        class b implements o.b {
            b() {
            }

            @Override // androidx.recyclerview.widget.o.b
            public View a(int i10) {
                return o.this.I(i10);
            }

            @Override // androidx.recyclerview.widget.o.b
            public int b() {
                return o.this.W() - o.this.d0();
            }

            @Override // androidx.recyclerview.widget.o.b
            public int c(View view) {
                return o.this.U(view) - ((ViewGroup.MarginLayoutParams) ((p) view.getLayoutParams())).topMargin;
            }

            @Override // androidx.recyclerview.widget.o.b
            public int d() {
                return o.this.g0();
            }

            @Override // androidx.recyclerview.widget.o.b
            public int e(View view) {
                return o.this.O(view) + ((ViewGroup.MarginLayoutParams) ((p) view.getLayoutParams())).bottomMargin;
            }
        }

        public interface c {
            void a(int i10, int i11);
        }

        public static class d {

            /* renamed from: a, reason: collision with root package name */
            public int f3358a;

            /* renamed from: b, reason: collision with root package name */
            public int f3359b;

            /* renamed from: c, reason: collision with root package name */
            public boolean f3360c;

            /* renamed from: d, reason: collision with root package name */
            public boolean f3361d;
        }

        public o() {
            a aVar = new a();
            this.f3340c = aVar;
            b bVar = new b();
            this.f3341d = bVar;
            this.f3342e = new androidx.recyclerview.widget.o(aVar);
            this.f3343f = new androidx.recyclerview.widget.o(bVar);
            this.f3345h = false;
            this.f3346i = false;
            this.f3347j = false;
            this.f3348k = true;
            this.f3349l = true;
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x0020  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x002f  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static int K(int r4, int r5, int r6, int r7, boolean r8) {
            /*
                int r4 = r4 - r6
                r6 = 0
                int r4 = java.lang.Math.max(r6, r4)
                r0 = -2
                r1 = -1
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = 1073741824(0x40000000, float:2.0)
                if (r8 == 0) goto L1a
                if (r7 < 0) goto L11
                goto L1c
            L11:
                if (r7 != r1) goto L2f
                if (r5 == r2) goto L20
                if (r5 == 0) goto L2f
                if (r5 == r3) goto L20
                goto L2f
            L1a:
                if (r7 < 0) goto L1e
            L1c:
                r5 = r3
                goto L31
            L1e:
                if (r7 != r1) goto L22
            L20:
                r7 = r4
                goto L31
            L22:
                if (r7 != r0) goto L2f
                if (r5 == r2) goto L2c
                if (r5 != r3) goto L29
                goto L2c
            L29:
                r7 = r4
                r5 = r6
                goto L31
            L2c:
                r7 = r4
                r5 = r2
                goto L31
            L2f:
                r5 = r6
                r7 = r5
            L31:
                int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r5)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.o.K(int, int, int, int, boolean):int");
        }

        private int[] L(View view, Rect rect) {
            int[] iArr = new int[2];
            int iE0 = e0();
            int iG0 = g0();
            int iO0 = o0() - f0();
            int iW = W() - d0();
            int left = (view.getLeft() + rect.left) - view.getScrollX();
            int top = (view.getTop() + rect.top) - view.getScrollY();
            int iWidth = rect.width() + left;
            int iHeight = rect.height() + top;
            int i10 = left - iE0;
            int iMin = Math.min(0, i10);
            int i11 = top - iG0;
            int iMin2 = Math.min(0, i11);
            int i12 = iWidth - iO0;
            int iMax = Math.max(0, i12);
            int iMax2 = Math.max(0, iHeight - iW);
            if (Z() != 1) {
                if (iMin == 0) {
                    iMin = Math.min(i10, iMax);
                }
                iMax = iMin;
            } else if (iMax == 0) {
                iMax = Math.max(iMin, i12);
            }
            if (iMin2 == 0) {
                iMin2 = Math.min(i11, iMax2);
            }
            iArr[0] = iMax;
            iArr[1] = iMin2;
            return iArr;
        }

        private void f(View view, int i10, boolean z10) {
            d0 d0VarG0 = RecyclerView.g0(view);
            if (z10 || d0VarG0.v()) {
                this.f3339b.f3259r.b(d0VarG0);
            } else {
                this.f3339b.f3259r.p(d0VarG0);
            }
            p pVar = (p) view.getLayoutParams();
            if (d0VarG0.L() || d0VarG0.w()) {
                if (d0VarG0.w()) {
                    d0VarG0.K();
                } else {
                    d0VarG0.e();
                }
                this.f3338a.c(view, i10, view.getLayoutParams(), false);
            } else if (view.getParent() == this.f3339b) {
                int iM = this.f3338a.m(view);
                if (i10 == -1) {
                    i10 = this.f3338a.g();
                }
                if (iM == -1) {
                    throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.f3339b.indexOfChild(view) + this.f3339b.P());
                }
                if (iM != i10) {
                    this.f3339b.f3273y.B0(iM, i10);
                }
            } else {
                this.f3338a.a(view, i10, false);
                pVar.f3364c = true;
                z zVar = this.f3344g;
                if (zVar != null && zVar.h()) {
                    this.f3344g.k(view);
                }
            }
            if (pVar.f3365d) {
                d0VarG0.f3305a.invalidate();
                pVar.f3365d = false;
            }
        }

        public static d i0(Context context, AttributeSet attributeSet, int i10, int i11) {
            d dVar = new d();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p0.c.f25855f, i10, i11);
            dVar.f3358a = typedArrayObtainStyledAttributes.getInt(p0.c.f25856g, 1);
            dVar.f3359b = typedArrayObtainStyledAttributes.getInt(p0.c.f25866q, 1);
            dVar.f3360c = typedArrayObtainStyledAttributes.getBoolean(p0.c.f25865p, false);
            dVar.f3361d = typedArrayObtainStyledAttributes.getBoolean(p0.c.f25867r, false);
            typedArrayObtainStyledAttributes.recycle();
            return dVar;
        }

        public static int n(int i10, int i11, int i12) {
            int mode = View.MeasureSpec.getMode(i10);
            int size = View.MeasureSpec.getSize(i10);
            return mode != Integer.MIN_VALUE ? mode != 1073741824 ? Math.max(i11, i12) : size : Math.min(size, Math.max(i11, i12));
        }

        private boolean t0(RecyclerView recyclerView, int i10, int i11) {
            View focusedChild = recyclerView.getFocusedChild();
            if (focusedChild == null) {
                return false;
            }
            int iE0 = e0();
            int iG0 = g0();
            int iO0 = o0() - f0();
            int iW = W() - d0();
            Rect rect = this.f3339b.f3265u;
            P(focusedChild, rect);
            return rect.left - i10 < iO0 && rect.right - i10 > iE0 && rect.top - i11 < iW && rect.bottom - i11 > iG0;
        }

        private void v1(v vVar, int i10, View view) {
            d0 d0VarG0 = RecyclerView.g0(view);
            if (d0VarG0.J()) {
                return;
            }
            if (d0VarG0.t() && !d0VarG0.v() && !this.f3339b.f3271x.j()) {
                q1(i10);
                vVar.C(d0VarG0);
            } else {
                x(i10);
                vVar.D(view);
                this.f3339b.f3259r.k(d0VarG0);
            }
        }

        private static boolean w0(int i10, int i11, int i12) {
            int mode = View.MeasureSpec.getMode(i11);
            int size = View.MeasureSpec.getSize(i11);
            if (i12 > 0 && i10 != i12) {
                return false;
            }
            if (mode == Integer.MIN_VALUE) {
                return size >= i10;
            }
            if (mode != 0) {
                return mode == 1073741824 && size == i10;
            }
            return true;
        }

        private void y(int i10, View view) {
            this.f3338a.d(i10);
        }

        void A(RecyclerView recyclerView, v vVar) {
            this.f3346i = false;
            I0(recyclerView, vVar);
        }

        public void A0(View view, int i10, int i11) {
            p pVar = (p) view.getLayoutParams();
            Rect rectK0 = this.f3339b.k0(view);
            int i12 = i10 + rectK0.left + rectK0.right;
            int i13 = i11 + rectK0.top + rectK0.bottom;
            int iK = K(o0(), p0(), e0() + f0() + ((ViewGroup.MarginLayoutParams) pVar).leftMargin + ((ViewGroup.MarginLayoutParams) pVar).rightMargin + i12, ((ViewGroup.MarginLayoutParams) pVar).width, k());
            int iK2 = K(W(), X(), g0() + d0() + ((ViewGroup.MarginLayoutParams) pVar).topMargin + ((ViewGroup.MarginLayoutParams) pVar).bottomMargin + i13, ((ViewGroup.MarginLayoutParams) pVar).height, l());
            if (F1(view, iK, iK2, pVar)) {
                view.measure(iK, iK2);
            }
        }

        void A1(int i10, int i11) {
            this.f3354q = View.MeasureSpec.getSize(i10);
            int mode = View.MeasureSpec.getMode(i10);
            this.f3352o = mode;
            if (mode == 0 && !RecyclerView.M0) {
                this.f3354q = 0;
            }
            this.f3355r = View.MeasureSpec.getSize(i11);
            int mode2 = View.MeasureSpec.getMode(i11);
            this.f3353p = mode2;
            if (mode2 != 0 || RecyclerView.M0) {
                return;
            }
            this.f3355r = 0;
        }

        public View B(View view) {
            View viewR;
            RecyclerView recyclerView = this.f3339b;
            if (recyclerView == null || (viewR = recyclerView.R(view)) == null || this.f3338a.n(viewR)) {
                return null;
            }
            return viewR;
        }

        public void B0(int i10, int i11) {
            View viewI = I(i10);
            if (viewI != null) {
                x(i10);
                h(viewI, i11);
            } else {
                throw new IllegalArgumentException("Cannot move a child from non-existing index:" + i10 + this.f3339b.toString());
            }
        }

        public void B1(int i10, int i11) {
            this.f3339b.setMeasuredDimension(i10, i11);
        }

        public View C(int i10) {
            int iJ = J();
            for (int i11 = 0; i11 < iJ; i11++) {
                View viewI = I(i11);
                d0 d0VarG0 = RecyclerView.g0(viewI);
                if (d0VarG0 != null && d0VarG0.m() == i10 && !d0VarG0.J() && (this.f3339b.f3264t0.e() || !d0VarG0.v())) {
                    return viewI;
                }
            }
            return null;
        }

        public void C0(int i10) {
            RecyclerView recyclerView = this.f3339b;
            if (recyclerView != null) {
                recyclerView.z0(i10);
            }
        }

        public void C1(Rect rect, int i10, int i11) {
            B1(n(i10, rect.width() + e0() + f0(), c0()), n(i11, rect.height() + g0() + d0(), b0()));
        }

        public abstract p D();

        public void D0(int i10) {
            RecyclerView recyclerView = this.f3339b;
            if (recyclerView != null) {
                recyclerView.A0(i10);
            }
        }

        void D1(int i10, int i11) {
            int iJ = J();
            if (iJ == 0) {
                this.f3339b.w(i10, i11);
                return;
            }
            int i12 = Integer.MIN_VALUE;
            int i13 = Integer.MAX_VALUE;
            int i14 = Integer.MAX_VALUE;
            int i15 = Integer.MIN_VALUE;
            for (int i16 = 0; i16 < iJ; i16++) {
                View viewI = I(i16);
                Rect rect = this.f3339b.f3265u;
                P(viewI, rect);
                int i17 = rect.left;
                if (i17 < i13) {
                    i13 = i17;
                }
                int i18 = rect.right;
                if (i18 > i12) {
                    i12 = i18;
                }
                int i19 = rect.top;
                if (i19 < i14) {
                    i14 = i19;
                }
                int i20 = rect.bottom;
                if (i20 > i15) {
                    i15 = i20;
                }
            }
            this.f3339b.f3265u.set(i13, i14, i12, i15);
            C1(this.f3339b.f3265u, i10, i11);
        }

        public p E(Context context, AttributeSet attributeSet) {
            return new p(context, attributeSet);
        }

        public void E0(g gVar, g gVar2) {
        }

        void E1(RecyclerView recyclerView) {
            int height;
            if (recyclerView == null) {
                this.f3339b = null;
                this.f3338a = null;
                height = 0;
                this.f3354q = 0;
            } else {
                this.f3339b = recyclerView;
                this.f3338a = recyclerView.f3257q;
                this.f3354q = recyclerView.getWidth();
                height = recyclerView.getHeight();
            }
            this.f3355r = height;
            this.f3352o = 1073741824;
            this.f3353p = 1073741824;
        }

        public p F(ViewGroup.LayoutParams layoutParams) {
            return layoutParams instanceof p ? new p((p) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new p((ViewGroup.MarginLayoutParams) layoutParams) : new p(layoutParams);
        }

        public boolean F0(RecyclerView recyclerView, ArrayList arrayList, int i10, int i11) {
            return false;
        }

        boolean F1(View view, int i10, int i11, p pVar) {
            return (!view.isLayoutRequested() && this.f3348k && w0(view.getWidth(), i10, ((ViewGroup.MarginLayoutParams) pVar).width) && w0(view.getHeight(), i11, ((ViewGroup.MarginLayoutParams) pVar).height)) ? false : true;
        }

        public int G() {
            return -1;
        }

        public void G0(RecyclerView recyclerView) {
        }

        boolean G1() {
            return false;
        }

        public int H(View view) {
            return ((p) view.getLayoutParams()).f3363b.bottom;
        }

        public void H0(RecyclerView recyclerView) {
        }

        boolean H1(View view, int i10, int i11, p pVar) {
            return (this.f3348k && w0(view.getMeasuredWidth(), i10, ((ViewGroup.MarginLayoutParams) pVar).width) && w0(view.getMeasuredHeight(), i11, ((ViewGroup.MarginLayoutParams) pVar).height)) ? false : true;
        }

        public View I(int i10) {
            androidx.recyclerview.widget.b bVar = this.f3338a;
            if (bVar != null) {
                return bVar.f(i10);
            }
            return null;
        }

        public void I0(RecyclerView recyclerView, v vVar) {
            H0(recyclerView);
        }

        public abstract void I1(RecyclerView recyclerView, a0 a0Var, int i10);

        public int J() {
            androidx.recyclerview.widget.b bVar = this.f3338a;
            if (bVar != null) {
                return bVar.g();
            }
            return 0;
        }

        public abstract View J0(View view, int i10, v vVar, a0 a0Var);

        public void J1(z zVar) {
            z zVar2 = this.f3344g;
            if (zVar2 != null && zVar != zVar2 && zVar2.h()) {
                this.f3344g.r();
            }
            this.f3344g = zVar;
            zVar.q(this.f3339b, this);
        }

        public void K0(AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.f3339b;
            L0(recyclerView.f3251n, recyclerView.f3264t0, accessibilityEvent);
        }

        void K1() {
            z zVar = this.f3344g;
            if (zVar != null) {
                zVar.r();
            }
        }

        public void L0(v vVar, a0 a0Var, AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.f3339b;
            if (recyclerView == null || accessibilityEvent == null) {
                return;
            }
            boolean z10 = true;
            if (!recyclerView.canScrollVertically(1) && !this.f3339b.canScrollVertically(-1) && !this.f3339b.canScrollHorizontally(-1) && !this.f3339b.canScrollHorizontally(1)) {
                z10 = false;
            }
            accessibilityEvent.setScrollable(z10);
            g gVar = this.f3339b.f3271x;
            if (gVar != null) {
                accessibilityEvent.setItemCount(gVar.c());
            }
        }

        public abstract boolean L1();

        public boolean M() {
            RecyclerView recyclerView = this.f3339b;
            return recyclerView != null && recyclerView.f3261s;
        }

        void M0(androidx.core.view.accessibility.d dVar) {
            RecyclerView recyclerView = this.f3339b;
            N0(recyclerView.f3251n, recyclerView.f3264t0, dVar);
        }

        public int N(v vVar, a0 a0Var) {
            RecyclerView recyclerView = this.f3339b;
            if (recyclerView == null || recyclerView.f3271x == null || !k()) {
                return 1;
            }
            return this.f3339b.f3271x.c();
        }

        public void N0(v vVar, a0 a0Var, androidx.core.view.accessibility.d dVar) {
            if (this.f3339b.canScrollVertically(-1) || this.f3339b.canScrollHorizontally(-1)) {
                dVar.a(8192);
                dVar.p0(true);
            }
            if (this.f3339b.canScrollVertically(1) || this.f3339b.canScrollHorizontally(1)) {
                dVar.a(4096);
                dVar.p0(true);
            }
            dVar.Z(d.b.a(k0(vVar, a0Var), N(vVar, a0Var), v0(vVar, a0Var), l0(vVar, a0Var)));
        }

        public int O(View view) {
            return view.getBottom() + H(view);
        }

        void O0(View view, androidx.core.view.accessibility.d dVar) {
            d0 d0VarG0 = RecyclerView.g0(view);
            if (d0VarG0 == null || d0VarG0.v() || this.f3338a.n(d0VarG0.f3305a)) {
                return;
            }
            RecyclerView recyclerView = this.f3339b;
            P0(recyclerView.f3251n, recyclerView.f3264t0, view, dVar);
        }

        public void P(View view, Rect rect) {
            RecyclerView.h0(view, rect);
        }

        public void P0(v vVar, a0 a0Var, View view, androidx.core.view.accessibility.d dVar) {
            dVar.a0(d.c.a(l() ? h0(view) : 0, 1, k() ? h0(view) : 0, 1, false, false));
        }

        public int Q(View view) {
            return view.getLeft() - a0(view);
        }

        public View Q0(View view, int i10) {
            return null;
        }

        public int R(View view) {
            Rect rect = ((p) view.getLayoutParams()).f3363b;
            return view.getMeasuredHeight() + rect.top + rect.bottom;
        }

        public void R0(RecyclerView recyclerView, int i10, int i11) {
        }

        public int S(View view) {
            Rect rect = ((p) view.getLayoutParams()).f3363b;
            return view.getMeasuredWidth() + rect.left + rect.right;
        }

        public void S0(RecyclerView recyclerView) {
        }

        public int T(View view) {
            return view.getRight() + j0(view);
        }

        public void T0(RecyclerView recyclerView, int i10, int i11, int i12) {
        }

        public int U(View view) {
            return view.getTop() - m0(view);
        }

        public void U0(RecyclerView recyclerView, int i10, int i11) {
        }

        public View V() {
            View focusedChild;
            RecyclerView recyclerView = this.f3339b;
            if (recyclerView == null || (focusedChild = recyclerView.getFocusedChild()) == null || this.f3338a.n(focusedChild)) {
                return null;
            }
            return focusedChild;
        }

        public void V0(RecyclerView recyclerView, int i10, int i11) {
        }

        public int W() {
            return this.f3355r;
        }

        public void W0(RecyclerView recyclerView, int i10, int i11, Object obj) {
            V0(recyclerView, i10, i11);
        }

        public int X() {
            return this.f3353p;
        }

        public abstract void X0(v vVar, a0 a0Var);

        public int Y() {
            RecyclerView recyclerView = this.f3339b;
            g adapter = recyclerView != null ? recyclerView.getAdapter() : null;
            if (adapter != null) {
                return adapter.c();
            }
            return 0;
        }

        public void Y0(a0 a0Var) {
        }

        public int Z() {
            return androidx.core.view.w.B(this.f3339b);
        }

        public void Z0(v vVar, a0 a0Var, int i10, int i11) {
            this.f3339b.w(i10, i11);
        }

        public int a0(View view) {
            return ((p) view.getLayoutParams()).f3363b.left;
        }

        public boolean a1(RecyclerView recyclerView, View view, View view2) {
            return x0() || recyclerView.u0();
        }

        public void b(View view) {
            c(view, -1);
        }

        public int b0() {
            return androidx.core.view.w.C(this.f3339b);
        }

        public boolean b1(RecyclerView recyclerView, a0 a0Var, View view, View view2) {
            return a1(recyclerView, view, view2);
        }

        public void c(View view, int i10) {
            f(view, i10, true);
        }

        public int c0() {
            return androidx.core.view.w.D(this.f3339b);
        }

        public abstract void c1(Parcelable parcelable);

        public void d(View view) {
            e(view, -1);
        }

        public int d0() {
            RecyclerView recyclerView = this.f3339b;
            if (recyclerView != null) {
                return recyclerView.getPaddingBottom();
            }
            return 0;
        }

        public abstract Parcelable d1();

        public void e(View view, int i10) {
            f(view, i10, false);
        }

        public int e0() {
            RecyclerView recyclerView = this.f3339b;
            if (recyclerView != null) {
                return recyclerView.getPaddingLeft();
            }
            return 0;
        }

        public void e1(int i10) {
        }

        public int f0() {
            RecyclerView recyclerView = this.f3339b;
            if (recyclerView != null) {
                return recyclerView.getPaddingRight();
            }
            return 0;
        }

        void f1(z zVar) {
            if (this.f3344g == zVar) {
                this.f3344g = null;
            }
        }

        public void g(String str) {
            RecyclerView recyclerView = this.f3339b;
            if (recyclerView != null) {
                recyclerView.o(str);
            }
        }

        public int g0() {
            RecyclerView recyclerView = this.f3339b;
            if (recyclerView != null) {
                return recyclerView.getPaddingTop();
            }
            return 0;
        }

        boolean g1(int i10, Bundle bundle) {
            RecyclerView recyclerView = this.f3339b;
            return h1(recyclerView.f3251n, recyclerView.f3264t0, i10, bundle);
        }

        public void h(View view, int i10) {
            i(view, i10, (p) view.getLayoutParams());
        }

        public int h0(View view) {
            return ((p) view.getLayoutParams()).a();
        }

        public boolean h1(v vVar, a0 a0Var, int i10, Bundle bundle) {
            int iW;
            int iO0;
            int i11;
            int i12;
            RecyclerView recyclerView = this.f3339b;
            if (recyclerView == null) {
                return false;
            }
            if (i10 == 4096) {
                iW = recyclerView.canScrollVertically(1) ? (W() - g0()) - d0() : 0;
                if (this.f3339b.canScrollHorizontally(1)) {
                    iO0 = (o0() - e0()) - f0();
                    i11 = iW;
                    i12 = iO0;
                }
                i11 = iW;
                i12 = 0;
            } else if (i10 != 8192) {
                i12 = 0;
                i11 = 0;
            } else {
                iW = recyclerView.canScrollVertically(-1) ? -((W() - g0()) - d0()) : 0;
                if (this.f3339b.canScrollHorizontally(-1)) {
                    iO0 = -((o0() - e0()) - f0());
                    i11 = iW;
                    i12 = iO0;
                }
                i11 = iW;
                i12 = 0;
            }
            if (i11 == 0 && i12 == 0) {
                return false;
            }
            this.f3339b.o1(i12, i11, null, Integer.MIN_VALUE, true);
            return true;
        }

        public void i(View view, int i10, p pVar) {
            d0 d0VarG0 = RecyclerView.g0(view);
            if (d0VarG0.v()) {
                this.f3339b.f3259r.b(d0VarG0);
            } else {
                this.f3339b.f3259r.p(d0VarG0);
            }
            this.f3338a.c(view, i10, pVar, d0VarG0.v());
        }

        boolean i1(View view, int i10, Bundle bundle) {
            RecyclerView recyclerView = this.f3339b;
            return j1(recyclerView.f3251n, recyclerView.f3264t0, view, i10, bundle);
        }

        public void j(View view, Rect rect) {
            RecyclerView recyclerView = this.f3339b;
            if (recyclerView == null) {
                rect.set(0, 0, 0, 0);
            } else {
                rect.set(recyclerView.k0(view));
            }
        }

        public int j0(View view) {
            return ((p) view.getLayoutParams()).f3363b.right;
        }

        public boolean j1(v vVar, a0 a0Var, View view, int i10, Bundle bundle) {
            return false;
        }

        public abstract boolean k();

        public int k0(v vVar, a0 a0Var) {
            RecyclerView recyclerView = this.f3339b;
            if (recyclerView == null || recyclerView.f3271x == null || !l()) {
                return 1;
            }
            return this.f3339b.f3271x.c();
        }

        public void k1(v vVar) {
            for (int iJ = J() - 1; iJ >= 0; iJ--) {
                if (!RecyclerView.g0(I(iJ)).J()) {
                    n1(iJ, vVar);
                }
            }
        }

        public abstract boolean l();

        public int l0(v vVar, a0 a0Var) {
            return 0;
        }

        void l1(v vVar) {
            int iJ = vVar.j();
            for (int i10 = iJ - 1; i10 >= 0; i10--) {
                View viewN = vVar.n(i10);
                d0 d0VarG0 = RecyclerView.g0(viewN);
                if (!d0VarG0.J()) {
                    d0VarG0.G(false);
                    if (d0VarG0.x()) {
                        this.f3339b.removeDetachedView(viewN, false);
                    }
                    l lVar = this.f3339b.f3238b0;
                    if (lVar != null) {
                        lVar.j(d0VarG0);
                    }
                    d0VarG0.G(true);
                    vVar.y(viewN);
                }
            }
            vVar.e();
            if (iJ > 0) {
                this.f3339b.invalidate();
            }
        }

        public boolean m(p pVar) {
            return pVar != null;
        }

        public int m0(View view) {
            return ((p) view.getLayoutParams()).f3363b.top;
        }

        public void m1(View view, v vVar) {
            p1(view);
            vVar.B(view);
        }

        public void n0(View view, boolean z10, Rect rect) {
            Matrix matrix;
            if (z10) {
                Rect rect2 = ((p) view.getLayoutParams()).f3363b;
                rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
            } else {
                rect.set(0, 0, view.getWidth(), view.getHeight());
            }
            if (this.f3339b != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
                RectF rectF = this.f3339b.f3269w;
                rectF.set(rect);
                matrix.mapRect(rectF);
                rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
            }
            rect.offset(view.getLeft(), view.getTop());
        }

        public void n1(int i10, v vVar) {
            View viewI = I(i10);
            q1(i10);
            vVar.B(viewI);
        }

        public abstract void o(int i10, int i11, a0 a0Var, c cVar);

        public int o0() {
            return this.f3354q;
        }

        public boolean o1(Runnable runnable) {
            RecyclerView recyclerView = this.f3339b;
            if (recyclerView != null) {
                return recyclerView.removeCallbacks(runnable);
            }
            return false;
        }

        public void p(int i10, c cVar) {
        }

        public int p0() {
            return this.f3352o;
        }

        public void p1(View view) {
            this.f3338a.p(view);
        }

        public abstract int q(a0 a0Var);

        boolean q0() {
            int iJ = J();
            for (int i10 = 0; i10 < iJ; i10++) {
                ViewGroup.LayoutParams layoutParams = I(i10).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    return true;
                }
            }
            return false;
        }

        public void q1(int i10) {
            if (I(i10) != null) {
                this.f3338a.q(i10);
            }
        }

        public abstract int r(a0 a0Var);

        public boolean r0() {
            return this.f3346i;
        }

        public boolean r1(RecyclerView recyclerView, View view, Rect rect, boolean z10) {
            return s1(recyclerView, view, rect, z10, false);
        }

        public abstract int s(a0 a0Var);

        public abstract boolean s0();

        public boolean s1(RecyclerView recyclerView, View view, Rect rect, boolean z10, boolean z11) {
            int[] iArrL = L(view, rect);
            int i10 = iArrL[0];
            int i11 = iArrL[1];
            if ((z11 && !t0(recyclerView, i10, i11)) || (i10 == 0 && i11 == 0)) {
                return false;
            }
            if (z10) {
                recyclerView.scrollBy(i10, i11);
            } else {
                recyclerView.l1(i10, i11);
            }
            return true;
        }

        public abstract int t(a0 a0Var);

        public void t1() {
            RecyclerView recyclerView = this.f3339b;
            if (recyclerView != null) {
                recyclerView.requestLayout();
            }
        }

        public abstract int u(a0 a0Var);

        public final boolean u0() {
            return this.f3349l;
        }

        public void u1() {
            this.f3345h = true;
        }

        public abstract int v(a0 a0Var);

        public boolean v0(v vVar, a0 a0Var) {
            return false;
        }

        public void w(v vVar) {
            for (int iJ = J() - 1; iJ >= 0; iJ--) {
                v1(vVar, iJ, I(iJ));
            }
        }

        public abstract int w1(int i10, v vVar, a0 a0Var);

        public void x(int i10) {
            y(i10, I(i10));
        }

        public boolean x0() {
            z zVar = this.f3344g;
            return zVar != null && zVar.h();
        }

        public abstract void x1(int i10);

        public boolean y0(View view, boolean z10, boolean z11) {
            boolean z12 = this.f3342e.b(view, 24579) && this.f3343f.b(view, 24579);
            return z10 ? z12 : !z12;
        }

        public abstract int y1(int i10, v vVar, a0 a0Var);

        void z(RecyclerView recyclerView) {
            this.f3346i = true;
            G0(recyclerView);
        }

        public void z0(View view, int i10, int i11, int i12, int i13) {
            p pVar = (p) view.getLayoutParams();
            Rect rect = pVar.f3363b;
            view.layout(i10 + rect.left + ((ViewGroup.MarginLayoutParams) pVar).leftMargin, i11 + rect.top + ((ViewGroup.MarginLayoutParams) pVar).topMargin, (i12 - rect.right) - ((ViewGroup.MarginLayoutParams) pVar).rightMargin, (i13 - rect.bottom) - ((ViewGroup.MarginLayoutParams) pVar).bottomMargin);
        }

        void z1(RecyclerView recyclerView) {
            A1(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
        }
    }

    public static class p extends ViewGroup.MarginLayoutParams {

        /* renamed from: a, reason: collision with root package name */
        d0 f3362a;

        /* renamed from: b, reason: collision with root package name */
        final Rect f3363b;

        /* renamed from: c, reason: collision with root package name */
        boolean f3364c;

        /* renamed from: d, reason: collision with root package name */
        boolean f3365d;

        public p(int i10, int i11) {
            super(i10, i11);
            this.f3363b = new Rect();
            this.f3364c = true;
            this.f3365d = false;
        }

        public p(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f3363b = new Rect();
            this.f3364c = true;
            this.f3365d = false;
        }

        public p(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f3363b = new Rect();
            this.f3364c = true;
            this.f3365d = false;
        }

        public p(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f3363b = new Rect();
            this.f3364c = true;
            this.f3365d = false;
        }

        public p(p pVar) {
            super((ViewGroup.LayoutParams) pVar);
            this.f3363b = new Rect();
            this.f3364c = true;
            this.f3365d = false;
        }

        public int a() {
            return this.f3362a.m();
        }

        public boolean b() {
            return this.f3362a.y();
        }

        public boolean c() {
            return this.f3362a.v();
        }

        public boolean d() {
            return this.f3362a.t();
        }
    }

    public interface q {
        void a(View view);

        void b(View view);
    }

    public static abstract class r {
        public abstract boolean a(int i10, int i11);
    }

    public interface s {
        boolean a(RecyclerView recyclerView, MotionEvent motionEvent);

        void b(RecyclerView recyclerView, MotionEvent motionEvent);

        void c(boolean z10);
    }

    public static abstract class t {
        public void a(RecyclerView recyclerView, int i10) {
        }

        public abstract void b(RecyclerView recyclerView, int i10, int i11);
    }

    public static class u {

        /* renamed from: a, reason: collision with root package name */
        SparseArray f3366a = new SparseArray();

        /* renamed from: b, reason: collision with root package name */
        private int f3367b = 0;

        static class a {

            /* renamed from: a, reason: collision with root package name */
            final ArrayList f3368a = new ArrayList();

            /* renamed from: b, reason: collision with root package name */
            int f3369b = 5;

            /* renamed from: c, reason: collision with root package name */
            long f3370c = 0;

            /* renamed from: d, reason: collision with root package name */
            long f3371d = 0;

            a() {
            }
        }

        private a g(int i10) {
            a aVar = (a) this.f3366a.get(i10);
            if (aVar != null) {
                return aVar;
            }
            a aVar2 = new a();
            this.f3366a.put(i10, aVar2);
            return aVar2;
        }

        void a() {
            this.f3367b++;
        }

        public void b() {
            for (int i10 = 0; i10 < this.f3366a.size(); i10++) {
                ((a) this.f3366a.valueAt(i10)).f3368a.clear();
            }
        }

        void c() {
            this.f3367b--;
        }

        void d(int i10, long j10) {
            a aVarG = g(i10);
            aVarG.f3371d = j(aVarG.f3371d, j10);
        }

        void e(int i10, long j10) {
            a aVarG = g(i10);
            aVarG.f3370c = j(aVarG.f3370c, j10);
        }

        public d0 f(int i10) {
            a aVar = (a) this.f3366a.get(i10);
            if (aVar == null || aVar.f3368a.isEmpty()) {
                return null;
            }
            ArrayList arrayList = aVar.f3368a;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (!((d0) arrayList.get(size)).r()) {
                    return (d0) arrayList.remove(size);
                }
            }
            return null;
        }

        void h(g gVar, g gVar2, boolean z10) {
            if (gVar != null) {
                c();
            }
            if (!z10 && this.f3367b == 0) {
                b();
            }
            if (gVar2 != null) {
                a();
            }
        }

        public void i(d0 d0Var) {
            int iL = d0Var.l();
            ArrayList arrayList = g(iL).f3368a;
            if (((a) this.f3366a.get(iL)).f3369b <= arrayList.size()) {
                return;
            }
            d0Var.D();
            arrayList.add(d0Var);
        }

        long j(long j10, long j11) {
            return j10 == 0 ? j11 : ((j10 / 4) * 3) + (j11 / 4);
        }

        boolean k(int i10, long j10, long j11) {
            long j12 = g(i10).f3371d;
            return j12 == 0 || j10 + j12 < j11;
        }

        boolean l(int i10, long j10, long j11) {
            long j12 = g(i10).f3370c;
            return j12 == 0 || j10 + j12 < j11;
        }
    }

    public final class v {

        /* renamed from: a, reason: collision with root package name */
        final ArrayList f3372a;

        /* renamed from: b, reason: collision with root package name */
        ArrayList f3373b;

        /* renamed from: c, reason: collision with root package name */
        final ArrayList f3374c;

        /* renamed from: d, reason: collision with root package name */
        private final List f3375d;

        /* renamed from: e, reason: collision with root package name */
        private int f3376e;

        /* renamed from: f, reason: collision with root package name */
        int f3377f;

        /* renamed from: g, reason: collision with root package name */
        u f3378g;

        public v() {
            ArrayList arrayList = new ArrayList();
            this.f3372a = arrayList;
            this.f3373b = null;
            this.f3374c = new ArrayList();
            this.f3375d = Collections.unmodifiableList(arrayList);
            this.f3376e = 2;
            this.f3377f = 2;
        }

        private boolean H(d0 d0Var, int i10, int i11, long j10) {
            d0Var.f3322r = RecyclerView.this;
            int iL = d0Var.l();
            long nanoTime = RecyclerView.this.getNanoTime();
            if (j10 != Long.MAX_VALUE && !this.f3378g.k(iL, nanoTime, j10)) {
                return false;
            }
            RecyclerView.this.f3271x.a(d0Var, i10);
            this.f3378g.d(d0Var.l(), RecyclerView.this.getNanoTime() - nanoTime);
            b(d0Var);
            if (!RecyclerView.this.f3264t0.e()) {
                return true;
            }
            d0Var.f3311g = i11;
            return true;
        }

        private void b(d0 d0Var) {
            if (RecyclerView.this.t0()) {
                View view = d0Var.f3305a;
                if (androidx.core.view.w.z(view) == 0) {
                    androidx.core.view.w.y0(view, 1);
                }
                androidx.recyclerview.widget.k kVar = RecyclerView.this.A0;
                if (kVar == null) {
                    return;
                }
                androidx.core.view.a aVarN = kVar.n();
                if (aVarN instanceof k.a) {
                    ((k.a) aVarN).o(view);
                }
                androidx.core.view.w.o0(view, aVarN);
            }
        }

        private void q(ViewGroup viewGroup, boolean z10) {
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                if (childAt instanceof ViewGroup) {
                    q((ViewGroup) childAt, true);
                }
            }
            if (z10) {
                if (viewGroup.getVisibility() == 4) {
                    viewGroup.setVisibility(0);
                    viewGroup.setVisibility(4);
                } else {
                    int visibility = viewGroup.getVisibility();
                    viewGroup.setVisibility(4);
                    viewGroup.setVisibility(visibility);
                }
            }
        }

        private void r(d0 d0Var) {
            View view = d0Var.f3305a;
            if (view instanceof ViewGroup) {
                q((ViewGroup) view, false);
            }
        }

        void A(int i10) {
            a((d0) this.f3374c.get(i10), true);
            this.f3374c.remove(i10);
        }

        public void B(View view) {
            d0 d0VarG0 = RecyclerView.g0(view);
            if (d0VarG0.x()) {
                RecyclerView.this.removeDetachedView(view, false);
            }
            if (d0VarG0.w()) {
                d0VarG0.K();
            } else if (d0VarG0.L()) {
                d0VarG0.e();
            }
            C(d0VarG0);
            if (RecyclerView.this.f3238b0 == null || d0VarG0.u()) {
                return;
            }
            RecyclerView.this.f3238b0.j(d0VarG0);
        }

        void C(d0 d0Var) {
            boolean z10;
            boolean z11 = true;
            if (d0Var.w() || d0Var.f3305a.getParent() != null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Scrapped or attached views may not be recycled. isScrap:");
                sb2.append(d0Var.w());
                sb2.append(" isAttached:");
                sb2.append(d0Var.f3305a.getParent() != null);
                sb2.append(RecyclerView.this.P());
                throw new IllegalArgumentException(sb2.toString());
            }
            if (d0Var.x()) {
                throw new IllegalArgumentException("Tmp detached view should be removed from RecyclerView before it can be recycled: " + d0Var + RecyclerView.this.P());
            }
            if (d0Var.J()) {
                throw new IllegalArgumentException("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle." + RecyclerView.this.P());
            }
            boolean zH = d0Var.h();
            g gVar = RecyclerView.this.f3271x;
            if ((gVar != null && zH && gVar.t(d0Var)) || d0Var.u()) {
                if (this.f3377f <= 0 || d0Var.p(526)) {
                    z10 = false;
                } else {
                    int size = this.f3374c.size();
                    if (size >= this.f3377f && size > 0) {
                        A(0);
                        size--;
                    }
                    if (RecyclerView.O0 && size > 0 && !RecyclerView.this.f3262s0.d(d0Var.f3307c)) {
                        int i10 = size - 1;
                        while (i10 >= 0) {
                            if (!RecyclerView.this.f3262s0.d(((d0) this.f3374c.get(i10)).f3307c)) {
                                break;
                            } else {
                                i10--;
                            }
                        }
                        size = i10 + 1;
                    }
                    this.f3374c.add(size, d0Var);
                    z10 = true;
                }
                if (z10) {
                    z11 = false;
                } else {
                    a(d0Var, true);
                }
                z = z10;
            } else {
                z11 = false;
            }
            RecyclerView.this.f3259r.q(d0Var);
            if (z || z11 || !zH) {
                return;
            }
            d0Var.f3322r = null;
        }

        void D(View view) {
            ArrayList arrayList;
            d0 d0VarG0 = RecyclerView.g0(view);
            if (!d0VarG0.p(12) && d0VarG0.y() && !RecyclerView.this.p(d0VarG0)) {
                if (this.f3373b == null) {
                    this.f3373b = new ArrayList();
                }
                d0VarG0.H(this, true);
                arrayList = this.f3373b;
            } else {
                if (d0VarG0.t() && !d0VarG0.v() && !RecyclerView.this.f3271x.j()) {
                    throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool." + RecyclerView.this.P());
                }
                d0VarG0.H(this, false);
                arrayList = this.f3372a;
            }
            arrayList.add(d0VarG0);
        }

        void E(u uVar) {
            u uVar2 = this.f3378g;
            if (uVar2 != null) {
                uVar2.c();
            }
            this.f3378g = uVar;
            if (uVar == null || RecyclerView.this.getAdapter() == null) {
                return;
            }
            this.f3378g.a();
        }

        void F(b0 b0Var) {
        }

        public void G(int i10) {
            this.f3376e = i10;
            K();
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x005c  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x005f  */
        /* JADX WARN: Removed duplicated region for block: B:59:0x012c A[PHI: r1 r4
  0x012c: PHI (r1v12 androidx.recyclerview.widget.RecyclerView$d0) = (r1v11 androidx.recyclerview.widget.RecyclerView$d0), (r1v30 androidx.recyclerview.widget.RecyclerView$d0) binds: [B:28:0x005d, B:45:0x00ad] A[DONT_GENERATE, DONT_INLINE]
  0x012c: PHI (r4v3 boolean) = (r4v2 boolean), (r4v7 boolean) binds: [B:28:0x005d, B:45:0x00ad] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:68:0x014d  */
        /* JADX WARN: Removed duplicated region for block: B:74:0x0179  */
        /* JADX WARN: Removed duplicated region for block: B:85:0x01a9  */
        /* JADX WARN: Removed duplicated region for block: B:87:0x01b7  */
        /* JADX WARN: Removed duplicated region for block: B:93:0x01cc A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:95:0x01cf  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        androidx.recyclerview.widget.RecyclerView.d0 I(int r17, boolean r18, long r19) {
            /*
                Method dump skipped, instructions count: 523
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.v.I(int, boolean, long):androidx.recyclerview.widget.RecyclerView$d0");
        }

        void J(d0 d0Var) {
            (d0Var.f3319o ? this.f3373b : this.f3372a).remove(d0Var);
            d0Var.f3318n = null;
            d0Var.f3319o = false;
            d0Var.e();
        }

        void K() {
            o oVar = RecyclerView.this.f3273y;
            this.f3377f = this.f3376e + (oVar != null ? oVar.f3350m : 0);
            for (int size = this.f3374c.size() - 1; size >= 0 && this.f3374c.size() > this.f3377f; size--) {
                A(size);
            }
        }

        boolean L(d0 d0Var) {
            if (d0Var.v()) {
                return RecyclerView.this.f3264t0.e();
            }
            int i10 = d0Var.f3307c;
            if (i10 >= 0 && i10 < RecyclerView.this.f3271x.c()) {
                if (RecyclerView.this.f3264t0.e() || RecyclerView.this.f3271x.f(d0Var.f3307c) == d0Var.l()) {
                    return !RecyclerView.this.f3271x.j() || d0Var.k() == RecyclerView.this.f3271x.e(d0Var.f3307c);
                }
                return false;
            }
            throw new IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + d0Var + RecyclerView.this.P());
        }

        void M(int i10, int i11) {
            int i12;
            int i13 = i11 + i10;
            for (int size = this.f3374c.size() - 1; size >= 0; size--) {
                d0 d0Var = (d0) this.f3374c.get(size);
                if (d0Var != null && (i12 = d0Var.f3307c) >= i10 && i12 < i13) {
                    d0Var.b(2);
                    A(size);
                }
            }
        }

        void a(d0 d0Var, boolean z10) {
            RecyclerView.r(d0Var);
            View view = d0Var.f3305a;
            androidx.recyclerview.widget.k kVar = RecyclerView.this.A0;
            if (kVar != null) {
                androidx.core.view.a aVarN = kVar.n();
                androidx.core.view.w.o0(view, aVarN instanceof k.a ? ((k.a) aVarN).n(view) : null);
            }
            if (z10) {
                g(d0Var);
            }
            d0Var.f3322r = null;
            i().i(d0Var);
        }

        public void c() {
            this.f3372a.clear();
            z();
        }

        void d() {
            int size = this.f3374c.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((d0) this.f3374c.get(i10)).c();
            }
            int size2 = this.f3372a.size();
            for (int i11 = 0; i11 < size2; i11++) {
                ((d0) this.f3372a.get(i11)).c();
            }
            ArrayList arrayList = this.f3373b;
            if (arrayList != null) {
                int size3 = arrayList.size();
                for (int i12 = 0; i12 < size3; i12++) {
                    ((d0) this.f3373b.get(i12)).c();
                }
            }
        }

        void e() {
            this.f3372a.clear();
            ArrayList arrayList = this.f3373b;
            if (arrayList != null) {
                arrayList.clear();
            }
        }

        public int f(int i10) {
            if (i10 >= 0 && i10 < RecyclerView.this.f3264t0.b()) {
                return !RecyclerView.this.f3264t0.e() ? i10 : RecyclerView.this.f3255p.m(i10);
            }
            throw new IndexOutOfBoundsException("invalid position " + i10 + ". State item count is " + RecyclerView.this.f3264t0.b() + RecyclerView.this.P());
        }

        void g(d0 d0Var) {
            w wVar = RecyclerView.this.f3275z;
            if (wVar != null) {
                wVar.a(d0Var);
            }
            g gVar = RecyclerView.this.f3271x;
            if (gVar != null) {
                gVar.w(d0Var);
            }
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.f3264t0 != null) {
                recyclerView.f3259r.q(d0Var);
            }
        }

        d0 h(int i10) {
            int size;
            int iM;
            ArrayList arrayList = this.f3373b;
            if (arrayList != null && (size = arrayList.size()) != 0) {
                for (int i11 = 0; i11 < size; i11++) {
                    d0 d0Var = (d0) this.f3373b.get(i11);
                    if (!d0Var.L() && d0Var.m() == i10) {
                        d0Var.b(32);
                        return d0Var;
                    }
                }
                if (RecyclerView.this.f3271x.j() && (iM = RecyclerView.this.f3255p.m(i10)) > 0 && iM < RecyclerView.this.f3271x.c()) {
                    long jE = RecyclerView.this.f3271x.e(iM);
                    for (int i12 = 0; i12 < size; i12++) {
                        d0 d0Var2 = (d0) this.f3373b.get(i12);
                        if (!d0Var2.L() && d0Var2.k() == jE) {
                            d0Var2.b(32);
                            return d0Var2;
                        }
                    }
                }
            }
            return null;
        }

        u i() {
            if (this.f3378g == null) {
                this.f3378g = new u();
            }
            return this.f3378g;
        }

        int j() {
            return this.f3372a.size();
        }

        public List k() {
            return this.f3375d;
        }

        d0 l(long j10, int i10, boolean z10) {
            for (int size = this.f3372a.size() - 1; size >= 0; size--) {
                d0 d0Var = (d0) this.f3372a.get(size);
                if (d0Var.k() == j10 && !d0Var.L()) {
                    if (i10 == d0Var.l()) {
                        d0Var.b(32);
                        if (d0Var.v() && !RecyclerView.this.f3264t0.e()) {
                            d0Var.F(2, 14);
                        }
                        return d0Var;
                    }
                    if (!z10) {
                        this.f3372a.remove(size);
                        RecyclerView.this.removeDetachedView(d0Var.f3305a, false);
                        y(d0Var.f3305a);
                    }
                }
            }
            int size2 = this.f3374c.size();
            while (true) {
                size2--;
                if (size2 < 0) {
                    return null;
                }
                d0 d0Var2 = (d0) this.f3374c.get(size2);
                if (d0Var2.k() == j10 && !d0Var2.r()) {
                    if (i10 == d0Var2.l()) {
                        if (!z10) {
                            this.f3374c.remove(size2);
                        }
                        return d0Var2;
                    }
                    if (!z10) {
                        A(size2);
                        return null;
                    }
                }
            }
        }

        d0 m(int i10, boolean z10) {
            View viewE;
            int size = this.f3372a.size();
            for (int i11 = 0; i11 < size; i11++) {
                d0 d0Var = (d0) this.f3372a.get(i11);
                if (!d0Var.L() && d0Var.m() == i10 && !d0Var.t() && (RecyclerView.this.f3264t0.f3285h || !d0Var.v())) {
                    d0Var.b(32);
                    return d0Var;
                }
            }
            if (z10 || (viewE = RecyclerView.this.f3257q.e(i10)) == null) {
                int size2 = this.f3374c.size();
                for (int i12 = 0; i12 < size2; i12++) {
                    d0 d0Var2 = (d0) this.f3374c.get(i12);
                    if (!d0Var2.t() && d0Var2.m() == i10 && !d0Var2.r()) {
                        if (!z10) {
                            this.f3374c.remove(i12);
                        }
                        return d0Var2;
                    }
                }
                return null;
            }
            d0 d0VarG0 = RecyclerView.g0(viewE);
            RecyclerView.this.f3257q.s(viewE);
            int iM = RecyclerView.this.f3257q.m(viewE);
            if (iM != -1) {
                RecyclerView.this.f3257q.d(iM);
                D(viewE);
                d0VarG0.b(8224);
                return d0VarG0;
            }
            throw new IllegalStateException("layout index should not be -1 after unhiding a view:" + d0VarG0 + RecyclerView.this.P());
        }

        View n(int i10) {
            return ((d0) this.f3372a.get(i10)).f3305a;
        }

        public View o(int i10) {
            return p(i10, false);
        }

        View p(int i10, boolean z10) {
            return I(i10, z10, Long.MAX_VALUE).f3305a;
        }

        void s() {
            int size = this.f3374c.size();
            for (int i10 = 0; i10 < size; i10++) {
                p pVar = (p) ((d0) this.f3374c.get(i10)).f3305a.getLayoutParams();
                if (pVar != null) {
                    pVar.f3364c = true;
                }
            }
        }

        void t() {
            int size = this.f3374c.size();
            for (int i10 = 0; i10 < size; i10++) {
                d0 d0Var = (d0) this.f3374c.get(i10);
                if (d0Var != null) {
                    d0Var.b(6);
                    d0Var.a(null);
                }
            }
            g gVar = RecyclerView.this.f3271x;
            if (gVar == null || !gVar.j()) {
                z();
            }
        }

        void u(int i10, int i11) {
            int size = this.f3374c.size();
            for (int i12 = 0; i12 < size; i12++) {
                d0 d0Var = (d0) this.f3374c.get(i12);
                if (d0Var != null && d0Var.f3307c >= i10) {
                    d0Var.A(i11, true);
                }
            }
        }

        void v(int i10, int i11) {
            int i12;
            int i13;
            int i14;
            int i15;
            if (i10 < i11) {
                i12 = -1;
                i14 = i10;
                i13 = i11;
            } else {
                i12 = 1;
                i13 = i10;
                i14 = i11;
            }
            int size = this.f3374c.size();
            for (int i16 = 0; i16 < size; i16++) {
                d0 d0Var = (d0) this.f3374c.get(i16);
                if (d0Var != null && (i15 = d0Var.f3307c) >= i14 && i15 <= i13) {
                    if (i15 == i10) {
                        d0Var.A(i11 - i10, false);
                    } else {
                        d0Var.A(i12, false);
                    }
                }
            }
        }

        void w(int i10, int i11, boolean z10) {
            int i12 = i10 + i11;
            for (int size = this.f3374c.size() - 1; size >= 0; size--) {
                d0 d0Var = (d0) this.f3374c.get(size);
                if (d0Var != null) {
                    int i13 = d0Var.f3307c;
                    if (i13 >= i12) {
                        d0Var.A(-i11, z10);
                    } else if (i13 >= i10) {
                        d0Var.b(8);
                        A(size);
                    }
                }
            }
        }

        void x(g gVar, g gVar2, boolean z10) {
            c();
            i().h(gVar, gVar2, z10);
        }

        void y(View view) {
            d0 d0VarG0 = RecyclerView.g0(view);
            d0VarG0.f3318n = null;
            d0VarG0.f3319o = false;
            d0VarG0.e();
            C(d0VarG0);
        }

        void z() {
            for (int size = this.f3374c.size() - 1; size >= 0; size--) {
                A(size);
            }
            this.f3374c.clear();
            if (RecyclerView.O0) {
                RecyclerView.this.f3262s0.b();
            }
        }
    }

    public interface w {
        void a(d0 d0Var);
    }

    private class x extends i {
        x() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public void a() {
            RecyclerView.this.o(null);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.f3264t0.f3284g = true;
            recyclerView.P0(true);
            if (RecyclerView.this.f3255p.p()) {
                return;
            }
            RecyclerView.this.requestLayout();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public void b(int i10, int i11, Object obj) {
            RecyclerView.this.o(null);
            if (RecyclerView.this.f3255p.r(i10, i11, obj)) {
                c();
            }
        }

        void c() {
            if (RecyclerView.N0) {
                RecyclerView recyclerView = RecyclerView.this;
                if (recyclerView.E && recyclerView.D) {
                    androidx.core.view.w.g0(recyclerView, recyclerView.f3263t);
                    return;
                }
            }
            RecyclerView recyclerView2 = RecyclerView.this;
            recyclerView2.M = true;
            recyclerView2.requestLayout();
        }
    }

    public static class y extends e0.a {
        public static final Parcelable.Creator<y> CREATOR = new a();

        /* renamed from: o, reason: collision with root package name */
        Parcelable f3381o;

        static class a implements Parcelable.ClassLoaderCreator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public y createFromParcel(Parcel parcel) {
                return new y(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public y createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new y(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public y[] newArray(int i10) {
                return new y[i10];
            }
        }

        y(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f3381o = parcel.readParcelable(classLoader == null ? o.class.getClassLoader() : classLoader);
        }

        y(Parcelable parcelable) {
            super(parcelable);
        }

        void b(y yVar) {
            this.f3381o = yVar.f3381o;
        }

        @Override // e0.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeParcelable(this.f3381o, 0);
        }
    }

    public static abstract class z {

        /* renamed from: b, reason: collision with root package name */
        private RecyclerView f3383b;

        /* renamed from: c, reason: collision with root package name */
        private o f3384c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f3385d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f3386e;

        /* renamed from: f, reason: collision with root package name */
        private View f3387f;

        /* renamed from: h, reason: collision with root package name */
        private boolean f3389h;

        /* renamed from: a, reason: collision with root package name */
        private int f3382a = -1;

        /* renamed from: g, reason: collision with root package name */
        private final a f3388g = new a(0, 0);

        public static class a {

            /* renamed from: a, reason: collision with root package name */
            private int f3390a;

            /* renamed from: b, reason: collision with root package name */
            private int f3391b;

            /* renamed from: c, reason: collision with root package name */
            private int f3392c;

            /* renamed from: d, reason: collision with root package name */
            private int f3393d;

            /* renamed from: e, reason: collision with root package name */
            private Interpolator f3394e;

            /* renamed from: f, reason: collision with root package name */
            private boolean f3395f;

            /* renamed from: g, reason: collision with root package name */
            private int f3396g;

            public a(int i10, int i11) {
                this(i10, i11, Integer.MIN_VALUE, null);
            }

            public a(int i10, int i11, int i12, Interpolator interpolator) {
                this.f3393d = -1;
                this.f3395f = false;
                this.f3396g = 0;
                this.f3390a = i10;
                this.f3391b = i11;
                this.f3392c = i12;
                this.f3394e = interpolator;
            }

            private void e() {
                if (this.f3394e != null && this.f3392c < 1) {
                    throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
                }
                if (this.f3392c < 1) {
                    throw new IllegalStateException("Scroll duration must be a positive number");
                }
            }

            boolean a() {
                return this.f3393d >= 0;
            }

            public void b(int i10) {
                this.f3393d = i10;
            }

            void c(RecyclerView recyclerView) {
                int i10 = this.f3393d;
                if (i10 >= 0) {
                    this.f3393d = -1;
                    recyclerView.w0(i10);
                    this.f3395f = false;
                } else {
                    if (!this.f3395f) {
                        this.f3396g = 0;
                        return;
                    }
                    e();
                    recyclerView.f3258q0.f(this.f3390a, this.f3391b, this.f3392c, this.f3394e);
                    int i11 = this.f3396g + 1;
                    this.f3396g = i11;
                    if (i11 > 10) {
                        Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                    }
                    this.f3395f = false;
                }
            }

            public void d(int i10, int i11, int i12, Interpolator interpolator) {
                this.f3390a = i10;
                this.f3391b = i11;
                this.f3392c = i12;
                this.f3394e = interpolator;
                this.f3395f = true;
            }
        }

        public interface b {
            PointF a(int i10);
        }

        public PointF a(int i10) {
            Object objE = e();
            if (objE instanceof b) {
                return ((b) objE).a(i10);
            }
            Log.w("RecyclerView", "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + b.class.getCanonicalName());
            return null;
        }

        public View b(int i10) {
            return this.f3383b.f3273y.C(i10);
        }

        public int c() {
            return this.f3383b.f3273y.J();
        }

        public int d(View view) {
            return this.f3383b.e0(view);
        }

        public o e() {
            return this.f3384c;
        }

        public int f() {
            return this.f3382a;
        }

        public boolean g() {
            return this.f3385d;
        }

        public boolean h() {
            return this.f3386e;
        }

        protected void i(PointF pointF) {
            float f5 = pointF.x;
            float f10 = pointF.y;
            float fSqrt = (float) Math.sqrt((f5 * f5) + (f10 * f10));
            pointF.x /= fSqrt;
            pointF.y /= fSqrt;
        }

        void j(int i10, int i11) {
            PointF pointFA;
            RecyclerView recyclerView = this.f3383b;
            if (this.f3382a == -1 || recyclerView == null) {
                r();
            }
            if (this.f3385d && this.f3387f == null && this.f3384c != null && (pointFA = a(this.f3382a)) != null) {
                float f5 = pointFA.x;
                if (f5 != 0.0f || pointFA.y != 0.0f) {
                    recyclerView.g1((int) Math.signum(f5), (int) Math.signum(pointFA.y), null);
                }
            }
            this.f3385d = false;
            View view = this.f3387f;
            if (view != null) {
                if (d(view) == this.f3382a) {
                    o(this.f3387f, recyclerView.f3264t0, this.f3388g);
                    this.f3388g.c(recyclerView);
                    r();
                } else {
                    Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                    this.f3387f = null;
                }
            }
            if (this.f3386e) {
                l(i10, i11, recyclerView.f3264t0, this.f3388g);
                boolean zA = this.f3388g.a();
                this.f3388g.c(recyclerView);
                if (zA && this.f3386e) {
                    this.f3385d = true;
                    recyclerView.f3258q0.e();
                }
            }
        }

        protected void k(View view) {
            if (d(view) == f()) {
                this.f3387f = view;
            }
        }

        protected abstract void l(int i10, int i11, a0 a0Var, a aVar);

        protected abstract void m();

        protected abstract void n();

        protected abstract void o(View view, a0 a0Var, a aVar);

        public void p(int i10) {
            this.f3382a = i10;
        }

        void q(RecyclerView recyclerView, o oVar) {
            recyclerView.f3258q0.g();
            if (this.f3389h) {
                Log.w("RecyclerView", "An instance of " + getClass().getSimpleName() + " was started more than once. Each instance of" + getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
            }
            this.f3383b = recyclerView;
            this.f3384c = oVar;
            int i10 = this.f3382a;
            if (i10 == -1) {
                throw new IllegalArgumentException("Invalid target position");
            }
            recyclerView.f3264t0.f3278a = i10;
            this.f3386e = true;
            this.f3385d = true;
            this.f3387f = b(f());
            m();
            this.f3383b.f3258q0.e();
            this.f3389h = true;
        }

        protected final void r() {
            if (this.f3386e) {
                this.f3386e = false;
                n();
                this.f3383b.f3264t0.f3278a = -1;
                this.f3387f = null;
                this.f3382a = -1;
                this.f3385d = false;
                this.f3384c.f1(this);
                this.f3384c = null;
                this.f3383b = null;
            }
        }
    }

    static {
        Class cls = Integer.TYPE;
        R0 = new Class[]{Context.class, AttributeSet.class, cls, cls};
        S0 = new c();
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, p0.a.f25846a);
    }

    public RecyclerView(Context context, AttributeSet attributeSet, int i10) throws NoSuchMethodException, SecurityException {
        super(context, attributeSet, i10);
        this.f3249m = new x();
        this.f3251n = new v();
        this.f3259r = new androidx.recyclerview.widget.p();
        this.f3263t = new a();
        this.f3265u = new Rect();
        this.f3267v = new Rect();
        this.f3269w = new RectF();
        this.A = new ArrayList();
        this.B = new ArrayList();
        this.H = 0;
        this.P = false;
        this.Q = false;
        this.R = 0;
        this.S = 0;
        this.T = new k();
        this.f3238b0 = new androidx.recyclerview.widget.c();
        this.f3239c0 = 0;
        this.f3240d0 = -1;
        this.f3252n0 = Float.MIN_VALUE;
        this.f3254o0 = Float.MIN_VALUE;
        this.f3256p0 = true;
        this.f3258q0 = new c0();
        this.f3262s0 = O0 ? new e.b() : null;
        this.f3264t0 = new a0();
        this.f3270w0 = false;
        this.f3272x0 = false;
        this.f3274y0 = new m();
        this.f3276z0 = false;
        this.C0 = new int[2];
        this.E0 = new int[2];
        this.F0 = new int[2];
        this.G0 = new int[2];
        this.H0 = new ArrayList();
        this.I0 = new b();
        this.J0 = new d();
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f3246j0 = viewConfiguration.getScaledTouchSlop();
        this.f3252n0 = androidx.core.view.y.b(viewConfiguration, context);
        this.f3254o0 = androidx.core.view.y.d(viewConfiguration, context);
        this.f3248l0 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f3250m0 = viewConfiguration.getScaledMaximumFlingVelocity();
        setWillNotDraw(getOverScrollMode() == 2);
        this.f3238b0.v(this.f3274y0);
        o0();
        q0();
        p0();
        if (androidx.core.view.w.z(this) == 0) {
            androidx.core.view.w.y0(this, 1);
        }
        this.N = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new androidx.recyclerview.widget.k(this));
        int[] iArr = p0.c.f25855f;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i10, 0);
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 29) {
            saveAttributeDataForStyleable(context, iArr, attributeSet, typedArrayObtainStyledAttributes, i10, 0);
        }
        String string = typedArrayObtainStyledAttributes.getString(p0.c.f25864o);
        if (typedArrayObtainStyledAttributes.getInt(p0.c.f25858i, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.f3261s = typedArrayObtainStyledAttributes.getBoolean(p0.c.f25857h, true);
        boolean z10 = typedArrayObtainStyledAttributes.getBoolean(p0.c.f25859j, false);
        this.F = z10;
        if (z10) {
            r0((StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(p0.c.f25862m), typedArrayObtainStyledAttributes.getDrawable(p0.c.f25863n), (StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(p0.c.f25860k), typedArrayObtainStyledAttributes.getDrawable(p0.c.f25861l));
        }
        typedArrayObtainStyledAttributes.recycle();
        v(context, string, attributeSet, i10, 0);
        int[] iArr2 = K0;
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i10, 0);
        if (i11 >= 29) {
            saveAttributeDataForStyleable(context, iArr2, attributeSet, typedArrayObtainStyledAttributes2, i10, 0);
        }
        boolean z11 = typedArrayObtainStyledAttributes2.getBoolean(0, true);
        typedArrayObtainStyledAttributes2.recycle();
        setNestedScrollingEnabled(z11);
    }

    private void A() {
        int i10 = this.L;
        this.L = 0;
        if (i10 == 0 || !t0()) {
            return;
        }
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
        accessibilityEventObtain.setEventType(2048);
        androidx.core.view.accessibility.b.b(accessibilityEventObtain, i10);
        sendAccessibilityEventUnchecked(accessibilityEventObtain);
    }

    private void C() {
        this.f3264t0.a(1);
        Q(this.f3264t0);
        this.f3264t0.f3287j = false;
        q1();
        this.f3259r.f();
        G0();
        O0();
        d1();
        a0 a0Var = this.f3264t0;
        a0Var.f3286i = a0Var.f3288k && this.f3272x0;
        this.f3272x0 = false;
        this.f3270w0 = false;
        a0Var.f3285h = a0Var.f3289l;
        a0Var.f3283f = this.f3271x.c();
        U(this.C0);
        if (this.f3264t0.f3288k) {
            int iG = this.f3257q.g();
            for (int i10 = 0; i10 < iG; i10++) {
                d0 d0VarG0 = g0(this.f3257q.f(i10));
                if (!d0VarG0.J() && (!d0VarG0.t() || this.f3271x.j())) {
                    this.f3259r.e(d0VarG0, this.f3238b0.t(this.f3264t0, d0VarG0, l.e(d0VarG0), d0VarG0.o()));
                    if (this.f3264t0.f3286i && d0VarG0.y() && !d0VarG0.v() && !d0VarG0.J() && !d0VarG0.t()) {
                        this.f3259r.c(c0(d0VarG0), d0VarG0);
                    }
                }
            }
        }
        if (this.f3264t0.f3289l) {
            e1();
            a0 a0Var2 = this.f3264t0;
            boolean z10 = a0Var2.f3284g;
            a0Var2.f3284g = false;
            this.f3273y.X0(this.f3251n, a0Var2);
            this.f3264t0.f3284g = z10;
            for (int i11 = 0; i11 < this.f3257q.g(); i11++) {
                d0 d0VarG02 = g0(this.f3257q.f(i11));
                if (!d0VarG02.J() && !this.f3259r.i(d0VarG02)) {
                    int iE = l.e(d0VarG02);
                    boolean zP = d0VarG02.p(8192);
                    if (!zP) {
                        iE |= 4096;
                    }
                    l.c cVarT = this.f3238b0.t(this.f3264t0, d0VarG02, iE, d0VarG02.o());
                    if (zP) {
                        R0(d0VarG02, cVarT);
                    } else {
                        this.f3259r.a(d0VarG02, cVarT);
                    }
                }
            }
        }
        s();
        H0();
        s1(false);
        this.f3264t0.f3282e = 2;
    }

    private void D() {
        q1();
        G0();
        this.f3264t0.a(6);
        this.f3255p.j();
        this.f3264t0.f3283f = this.f3271x.c();
        a0 a0Var = this.f3264t0;
        a0Var.f3281d = 0;
        a0Var.f3285h = false;
        this.f3273y.X0(this.f3251n, a0Var);
        a0 a0Var2 = this.f3264t0;
        a0Var2.f3284g = false;
        this.f3253o = null;
        a0Var2.f3288k = a0Var2.f3288k && this.f3238b0 != null;
        a0Var2.f3282e = 4;
        H0();
        s1(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void E() {
        /*
            r11 = this;
            androidx.recyclerview.widget.RecyclerView$a0 r0 = r11.f3264t0
            r1 = 4
            r0.a(r1)
            r11.q1()
            r11.G0()
            androidx.recyclerview.widget.RecyclerView$a0 r0 = r11.f3264t0
            r1 = 1
            r0.f3282e = r1
            boolean r0 = r0.f3288k
            if (r0 == 0) goto L88
            androidx.recyclerview.widget.b r0 = r11.f3257q
            int r0 = r0.g()
            int r0 = r0 - r1
        L1c:
            if (r0 < 0) goto L81
            androidx.recyclerview.widget.b r2 = r11.f3257q
            android.view.View r2 = r2.f(r0)
            androidx.recyclerview.widget.RecyclerView$d0 r5 = g0(r2)
            boolean r2 = r5.J()
            if (r2 == 0) goto L2f
            goto L7e
        L2f:
            long r2 = r11.c0(r5)
            androidx.recyclerview.widget.RecyclerView$l r4 = r11.f3238b0
            androidx.recyclerview.widget.RecyclerView$a0 r6 = r11.f3264t0
            androidx.recyclerview.widget.RecyclerView$l$c r4 = r4.s(r6, r5)
            androidx.recyclerview.widget.p r6 = r11.f3259r
            androidx.recyclerview.widget.RecyclerView$d0 r6 = r6.g(r2)
            if (r6 == 0) goto L79
            boolean r7 = r6.J()
            if (r7 != 0) goto L79
            androidx.recyclerview.widget.p r7 = r11.f3259r
            boolean r8 = r7.h(r6)
            androidx.recyclerview.widget.p r7 = r11.f3259r
            boolean r9 = r7.h(r5)
            if (r8 == 0) goto L5a
            if (r6 != r5) goto L5a
            goto L79
        L5a:
            androidx.recyclerview.widget.p r7 = r11.f3259r
            androidx.recyclerview.widget.RecyclerView$l$c r7 = r7.n(r6)
            androidx.recyclerview.widget.p r10 = r11.f3259r
            r10.d(r5, r4)
            androidx.recyclerview.widget.p r4 = r11.f3259r
            androidx.recyclerview.widget.RecyclerView$l$c r10 = r4.m(r5)
            if (r7 != 0) goto L71
            r11.l0(r2, r5, r6)
            goto L7e
        L71:
            r3 = r11
            r4 = r6
            r6 = r7
            r7 = r10
            r3.m(r4, r5, r6, r7, r8, r9)
            goto L7e
        L79:
            androidx.recyclerview.widget.p r2 = r11.f3259r
            r2.d(r5, r4)
        L7e:
            int r0 = r0 + (-1)
            goto L1c
        L81:
            androidx.recyclerview.widget.p r0 = r11.f3259r
            androidx.recyclerview.widget.p$b r2 = r11.J0
            r0.o(r2)
        L88:
            androidx.recyclerview.widget.RecyclerView$o r0 = r11.f3273y
            androidx.recyclerview.widget.RecyclerView$v r2 = r11.f3251n
            r0.l1(r2)
            androidx.recyclerview.widget.RecyclerView$a0 r0 = r11.f3264t0
            int r2 = r0.f3283f
            r0.f3280c = r2
            r2 = 0
            r11.P = r2
            r11.Q = r2
            r0.f3288k = r2
            r0.f3289l = r2
            androidx.recyclerview.widget.RecyclerView$o r0 = r11.f3273y
            r0.f3345h = r2
            androidx.recyclerview.widget.RecyclerView$v r0 = r11.f3251n
            java.util.ArrayList r0 = r0.f3373b
            if (r0 == 0) goto Lab
            r0.clear()
        Lab:
            androidx.recyclerview.widget.RecyclerView$o r0 = r11.f3273y
            boolean r3 = r0.f3351n
            if (r3 == 0) goto Lba
            r0.f3350m = r2
            r0.f3351n = r2
            androidx.recyclerview.widget.RecyclerView$v r0 = r11.f3251n
            r0.K()
        Lba:
            androidx.recyclerview.widget.RecyclerView$o r0 = r11.f3273y
            androidx.recyclerview.widget.RecyclerView$a0 r3 = r11.f3264t0
            r0.Y0(r3)
            r11.H0()
            r11.s1(r2)
            androidx.recyclerview.widget.p r0 = r11.f3259r
            r0.f()
            int[] r0 = r11.C0
            r3 = r0[r2]
            r0 = r0[r1]
            boolean r0 = r11.x(r3, r0)
            if (r0 == 0) goto Ldb
            r11.I(r2, r2)
        Ldb:
            r11.S0()
            r11.b1()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.E():void");
    }

    private void J0(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f3240d0) {
            int i10 = actionIndex == 0 ? 1 : 0;
            this.f3240d0 = motionEvent.getPointerId(i10);
            int x10 = (int) (motionEvent.getX(i10) + 0.5f);
            this.f3244h0 = x10;
            this.f3242f0 = x10;
            int y10 = (int) (motionEvent.getY(i10) + 0.5f);
            this.f3245i0 = y10;
            this.f3243g0 = y10;
        }
    }

    private boolean K(MotionEvent motionEvent) {
        s sVar = this.C;
        if (sVar == null) {
            if (motionEvent.getAction() == 0) {
                return false;
            }
            return T(motionEvent);
        }
        sVar.b(this, motionEvent);
        int action = motionEvent.getAction();
        if (action == 3 || action == 1) {
            this.C = null;
        }
        return true;
    }

    private boolean N0() {
        return this.f3238b0 != null && this.f3273y.L1();
    }

    private void O0() {
        boolean z10;
        if (this.P) {
            this.f3255p.v();
            if (this.Q) {
                this.f3273y.S0(this);
            }
        }
        if (N0()) {
            this.f3255p.t();
        } else {
            this.f3255p.j();
        }
        boolean z11 = false;
        boolean z12 = this.f3270w0 || this.f3272x0;
        this.f3264t0.f3288k = this.G && this.f3238b0 != null && ((z10 = this.P) || z12 || this.f3273y.f3345h) && (!z10 || this.f3271x.j());
        a0 a0Var = this.f3264t0;
        if (a0Var.f3288k && z12 && !this.P && N0()) {
            z11 = true;
        }
        a0Var.f3289l = z11;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void Q0(float r7, float r8, float r9, float r10) {
        /*
            r6 = this;
            r0 = 0
            int r1 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            r2 = 1065353216(0x3f800000, float:1.0)
            r3 = 1
            if (r1 >= 0) goto L21
            r6.M()
            android.widget.EdgeEffect r1 = r6.U
            float r4 = -r8
            int r5 = r6.getWidth()
            float r5 = (float) r5
            float r4 = r4 / r5
            int r5 = r6.getHeight()
            float r5 = (float) r5
            float r9 = r9 / r5
            float r9 = r2 - r9
        L1c:
            androidx.core.widget.d.c(r1, r4, r9)
            r9 = r3
            goto L39
        L21:
            int r1 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r1 <= 0) goto L38
            r6.N()
            android.widget.EdgeEffect r1 = r6.W
            int r4 = r6.getWidth()
            float r4 = (float) r4
            float r4 = r8 / r4
            int r5 = r6.getHeight()
            float r5 = (float) r5
            float r9 = r9 / r5
            goto L1c
        L38:
            r9 = 0
        L39:
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r1 >= 0) goto L53
            r6.O()
            android.widget.EdgeEffect r9 = r6.V
            float r1 = -r10
            int r2 = r6.getHeight()
            float r2 = (float) r2
            float r1 = r1 / r2
            int r2 = r6.getWidth()
            float r2 = (float) r2
            float r7 = r7 / r2
            androidx.core.widget.d.c(r9, r1, r7)
            goto L6f
        L53:
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r1 <= 0) goto L6e
            r6.L()
            android.widget.EdgeEffect r9 = r6.f3237a0
            int r1 = r6.getHeight()
            float r1 = (float) r1
            float r1 = r10 / r1
            int r4 = r6.getWidth()
            float r4 = (float) r4
            float r7 = r7 / r4
            float r2 = r2 - r7
            androidx.core.widget.d.c(r9, r1, r2)
            goto L6f
        L6e:
            r3 = r9
        L6f:
            if (r3 != 0) goto L79
            int r7 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r7 != 0) goto L79
            int r7 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r7 == 0) goto L7c
        L79:
            androidx.core.view.w.f0(r6)
        L7c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.Q0(float, float, float, float):void");
    }

    private void S0() {
        View viewFindViewById;
        if (!this.f3256p0 || this.f3271x == null || !hasFocus() || getDescendantFocusability() == 393216) {
            return;
        }
        if (getDescendantFocusability() == 131072 && isFocused()) {
            return;
        }
        if (!isFocused()) {
            View focusedChild = getFocusedChild();
            if (!Q0 || (focusedChild.getParent() != null && focusedChild.hasFocus())) {
                if (!this.f3257q.n(focusedChild)) {
                    return;
                }
            } else if (this.f3257q.g() == 0) {
                requestFocus();
                return;
            }
        }
        View viewW = null;
        d0 d0VarY = (this.f3264t0.f3291n == -1 || !this.f3271x.j()) ? null : Y(this.f3264t0.f3291n);
        if (d0VarY != null && !this.f3257q.n(d0VarY.f3305a) && d0VarY.f3305a.hasFocusable()) {
            viewW = d0VarY.f3305a;
        } else if (this.f3257q.g() > 0) {
            viewW = W();
        }
        if (viewW != null) {
            int i10 = this.f3264t0.f3292o;
            if (i10 != -1 && (viewFindViewById = viewW.findViewById(i10)) != null && viewFindViewById.isFocusable()) {
                viewW = viewFindViewById;
            }
            viewW.requestFocus();
        }
    }

    private boolean T(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        int size = this.B.size();
        for (int i10 = 0; i10 < size; i10++) {
            s sVar = (s) this.B.get(i10);
            if (sVar.a(this, motionEvent) && action != 3) {
                this.C = sVar;
                return true;
            }
        }
        return false;
    }

    private void T0() {
        boolean zIsFinished;
        EdgeEffect edgeEffect = this.U;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            zIsFinished = this.U.isFinished();
        } else {
            zIsFinished = false;
        }
        EdgeEffect edgeEffect2 = this.V;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            zIsFinished |= this.V.isFinished();
        }
        EdgeEffect edgeEffect3 = this.W;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            zIsFinished |= this.W.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f3237a0;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            zIsFinished |= this.f3237a0.isFinished();
        }
        if (zIsFinished) {
            androidx.core.view.w.f0(this);
        }
    }

    private void U(int[] iArr) {
        int iG = this.f3257q.g();
        if (iG == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i10 = Integer.MAX_VALUE;
        int i11 = Integer.MIN_VALUE;
        for (int i12 = 0; i12 < iG; i12++) {
            d0 d0VarG0 = g0(this.f3257q.f(i12));
            if (!d0VarG0.J()) {
                int iM = d0VarG0.m();
                if (iM < i10) {
                    i10 = iM;
                }
                if (iM > i11) {
                    i11 = iM;
                }
            }
        }
        iArr[0] = i10;
        iArr[1] = i11;
    }

    static RecyclerView V(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            RecyclerView recyclerViewV = V(viewGroup.getChildAt(i10));
            if (recyclerViewV != null) {
                return recyclerViewV;
            }
        }
        return null;
    }

    private View W() {
        d0 d0VarX;
        a0 a0Var = this.f3264t0;
        int i10 = a0Var.f3290m;
        if (i10 == -1) {
            i10 = 0;
        }
        int iB = a0Var.b();
        for (int i11 = i10; i11 < iB; i11++) {
            d0 d0VarX2 = X(i11);
            if (d0VarX2 == null) {
                break;
            }
            if (d0VarX2.f3305a.hasFocusable()) {
                return d0VarX2.f3305a;
            }
        }
        int iMin = Math.min(iB, i10);
        do {
            iMin--;
            if (iMin < 0 || (d0VarX = X(iMin)) == null) {
                return null;
            }
        } while (!d0VarX.f3305a.hasFocusable());
        return d0VarX.f3305a;
    }

    private void a1(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        this.f3265u.set(0, 0, view3.getWidth(), view3.getHeight());
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof p) {
            p pVar = (p) layoutParams;
            if (!pVar.f3364c) {
                Rect rect = pVar.f3363b;
                Rect rect2 = this.f3265u;
                rect2.left -= rect.left;
                rect2.right += rect.right;
                rect2.top -= rect.top;
                rect2.bottom += rect.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, this.f3265u);
            offsetRectIntoDescendantCoords(view, this.f3265u);
        }
        this.f3273y.s1(this, view, this.f3265u, !this.G, view2 == null);
    }

    private void b1() {
        a0 a0Var = this.f3264t0;
        a0Var.f3291n = -1L;
        a0Var.f3290m = -1;
        a0Var.f3292o = -1;
    }

    private void c1() {
        VelocityTracker velocityTracker = this.f3241e0;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        t1(0);
        T0();
    }

    private void d1() {
        View focusedChild = (this.f3256p0 && hasFocus() && this.f3271x != null) ? getFocusedChild() : null;
        d0 d0VarS = focusedChild != null ? S(focusedChild) : null;
        if (d0VarS == null) {
            b1();
            return;
        }
        this.f3264t0.f3291n = this.f3271x.j() ? d0VarS.k() : -1L;
        this.f3264t0.f3290m = this.P ? -1 : d0VarS.v() ? d0VarS.f3308d : d0VarS.j();
        this.f3264t0.f3292o = i0(d0VarS.f3305a);
    }

    private void g(d0 d0Var) {
        View view = d0Var.f3305a;
        boolean z10 = view.getParent() == this;
        this.f3251n.J(f0(view));
        if (d0Var.x()) {
            this.f3257q.c(view, -1, view.getLayoutParams(), true);
            return;
        }
        androidx.recyclerview.widget.b bVar = this.f3257q;
        if (z10) {
            bVar.k(view);
        } else {
            bVar.b(view, true);
        }
    }

    static d0 g0(View view) {
        if (view == null) {
            return null;
        }
        return ((p) view.getLayoutParams()).f3362a;
    }

    private androidx.core.view.n getScrollingChildHelper() {
        if (this.D0 == null) {
            this.D0 = new androidx.core.view.n(this);
        }
        return this.D0;
    }

    static void h0(View view, Rect rect) {
        p pVar = (p) view.getLayoutParams();
        Rect rect2 = pVar.f3363b;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) pVar).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) pVar).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) pVar).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) pVar).bottomMargin);
    }

    private int i0(View view) {
        int id;
        loop0: while (true) {
            id = view.getId();
            while (!view.isFocused() && (view instanceof ViewGroup) && view.hasFocus()) {
                view = ((ViewGroup) view).getFocusedChild();
                if (view.getId() != -1) {
                    break;
                }
            }
        }
        return id;
    }

    private void i1(g gVar, boolean z10, boolean z11) {
        g gVar2 = this.f3271x;
        if (gVar2 != null) {
            gVar2.z(this.f3249m);
            this.f3271x.s(this);
        }
        if (!z10 || z11) {
            U0();
        }
        this.f3255p.v();
        g gVar3 = this.f3271x;
        this.f3271x = gVar;
        if (gVar != null) {
            gVar.x(this.f3249m);
            gVar.n(this);
        }
        o oVar = this.f3273y;
        if (oVar != null) {
            oVar.E0(gVar3, this.f3271x);
        }
        this.f3251n.x(gVar3, this.f3271x, z10);
        this.f3264t0.f3284g = true;
    }

    private String j0(Context context, String str) {
        if (str.charAt(0) == '.') {
            return context.getPackageName() + str;
        }
        if (str.contains(".")) {
            return str;
        }
        return RecyclerView.class.getPackage().getName() + '.' + str;
    }

    private void l0(long j10, d0 d0Var, d0 d0Var2) {
        int iG = this.f3257q.g();
        for (int i10 = 0; i10 < iG; i10++) {
            d0 d0VarG0 = g0(this.f3257q.f(i10));
            if (d0VarG0 != d0Var && c0(d0VarG0) == j10) {
                g gVar = this.f3271x;
                if (gVar == null || !gVar.j()) {
                    throw new IllegalStateException("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:" + d0VarG0 + " \n View Holder 2:" + d0Var + P());
                }
                throw new IllegalStateException("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:" + d0VarG0 + " \n View Holder 2:" + d0Var + P());
            }
        }
        Log.e("RecyclerView", "Problem while matching changed view holders with the newones. The pre-layout information for the change holder " + d0Var2 + " cannot be found but it is necessary for " + d0Var + P());
    }

    private void m(d0 d0Var, d0 d0Var2, l.c cVar, l.c cVar2, boolean z10, boolean z11) {
        d0Var.G(false);
        if (z10) {
            g(d0Var);
        }
        if (d0Var != d0Var2) {
            if (z11) {
                g(d0Var2);
            }
            d0Var.f3312h = d0Var2;
            g(d0Var);
            this.f3251n.J(d0Var);
            d0Var2.G(false);
            d0Var2.f3313i = d0Var;
        }
        if (this.f3238b0.b(d0Var, d0Var2, cVar, cVar2)) {
            M0();
        }
    }

    private boolean n0() {
        int iG = this.f3257q.g();
        for (int i10 = 0; i10 < iG; i10++) {
            d0 d0VarG0 = g0(this.f3257q.f(i10));
            if (d0VarG0 != null && !d0VarG0.J() && d0VarG0.y()) {
                return true;
            }
        }
        return false;
    }

    private void p0() {
        if (androidx.core.view.w.A(this) == 0) {
            androidx.core.view.w.z0(this, 8);
        }
    }

    private void q() {
        c1();
        setScrollState(0);
    }

    private void q0() {
        this.f3257q = new androidx.recyclerview.widget.b(new e());
    }

    static void r(d0 d0Var) {
        WeakReference weakReference = d0Var.f3306b;
        if (weakReference != null) {
            Object parent = weakReference.get();
            while (true) {
                for (View view = (View) parent; view != null; view = null) {
                    if (view == d0Var.f3305a) {
                        return;
                    }
                    parent = view.getParent();
                    if (parent instanceof View) {
                        break;
                    }
                }
                d0Var.f3306b = null;
                return;
            }
        }
    }

    private void v(Context context, String str, AttributeSet attributeSet, int i10, int i11) throws NoSuchMethodException, SecurityException {
        Constructor constructor;
        if (str != null) {
            String strTrim = str.trim();
            if (strTrim.isEmpty()) {
                return;
            }
            String strJ0 = j0(context, strTrim);
            try {
                Class<? extends U> clsAsSubclass = Class.forName(strJ0, false, isInEditMode() ? getClass().getClassLoader() : context.getClassLoader()).asSubclass(o.class);
                Object[] objArr = null;
                try {
                    constructor = clsAsSubclass.getConstructor(R0);
                    objArr = new Object[]{context, attributeSet, Integer.valueOf(i10), Integer.valueOf(i11)};
                } catch (NoSuchMethodException e5) {
                    try {
                        constructor = clsAsSubclass.getConstructor(new Class[0]);
                    } catch (NoSuchMethodException e10) {
                        e10.initCause(e5);
                        throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + strJ0, e10);
                    }
                }
                constructor.setAccessible(true);
                setLayoutManager((o) constructor.newInstance(objArr));
            } catch (ClassCastException e11) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + strJ0, e11);
            } catch (ClassNotFoundException e12) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + strJ0, e12);
            } catch (IllegalAccessException e13) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + strJ0, e13);
            } catch (InstantiationException e14) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + strJ0, e14);
            } catch (InvocationTargetException e15) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + strJ0, e15);
            }
        }
    }

    private boolean v0(View view, View view2, int i10) {
        int i11;
        if (view2 == null || view2 == this || R(view2) == null) {
            return false;
        }
        if (view == null || R(view) == null) {
            return true;
        }
        this.f3265u.set(0, 0, view.getWidth(), view.getHeight());
        this.f3267v.set(0, 0, view2.getWidth(), view2.getHeight());
        offsetDescendantRectToMyCoords(view, this.f3265u);
        offsetDescendantRectToMyCoords(view2, this.f3267v);
        char c10 = 65535;
        int i12 = this.f3273y.Z() == 1 ? -1 : 1;
        Rect rect = this.f3265u;
        int i13 = rect.left;
        Rect rect2 = this.f3267v;
        int i14 = rect2.left;
        if ((i13 < i14 || rect.right <= i14) && rect.right < rect2.right) {
            i11 = 1;
        } else {
            int i15 = rect.right;
            int i16 = rect2.right;
            i11 = ((i15 > i16 || i13 >= i16) && i13 > i14) ? -1 : 0;
        }
        int i17 = rect.top;
        int i18 = rect2.top;
        if ((i17 < i18 || rect.bottom <= i18) && rect.bottom < rect2.bottom) {
            c10 = 1;
        } else {
            int i19 = rect.bottom;
            int i20 = rect2.bottom;
            if ((i19 <= i20 && i17 < i20) || i17 <= i18) {
                c10 = 0;
            }
        }
        if (i10 == 1) {
            return c10 < 0 || (c10 == 0 && i11 * i12 <= 0);
        }
        if (i10 == 2) {
            return c10 > 0 || (c10 == 0 && i11 * i12 >= 0);
        }
        if (i10 == 17) {
            return i11 < 0;
        }
        if (i10 == 33) {
            return c10 < 0;
        }
        if (i10 == 66) {
            return i11 > 0;
        }
        if (i10 == 130) {
            return c10 > 0;
        }
        throw new IllegalArgumentException("Invalid direction: " + i10 + P());
    }

    private void v1() {
        this.f3258q0.g();
        o oVar = this.f3273y;
        if (oVar != null) {
            oVar.K1();
        }
    }

    private boolean x(int i10, int i11) {
        U(this.C0);
        int[] iArr = this.C0;
        return (iArr[0] == i10 && iArr[1] == i11) ? false : true;
    }

    public void A0(int i10) {
        int iG = this.f3257q.g();
        for (int i11 = 0; i11 < iG; i11++) {
            this.f3257q.f(i11).offsetTopAndBottom(i10);
        }
    }

    void B() {
        String str;
        if (this.f3271x == null) {
            str = "No adapter attached; skipping layout";
        } else {
            if (this.f3273y != null) {
                a0 a0Var = this.f3264t0;
                a0Var.f3287j = false;
                if (a0Var.f3282e != 1) {
                    if (!this.f3255p.q() && this.f3273y.o0() == getWidth() && this.f3273y.W() == getHeight()) {
                        this.f3273y.z1(this);
                    }
                    E();
                    return;
                }
                C();
                this.f3273y.z1(this);
                D();
                E();
                return;
            }
            str = "No layout manager attached; skipping layout";
        }
        Log.e("RecyclerView", str);
    }

    void B0(int i10, int i11) {
        int iJ = this.f3257q.j();
        for (int i12 = 0; i12 < iJ; i12++) {
            d0 d0VarG0 = g0(this.f3257q.i(i12));
            if (d0VarG0 != null && !d0VarG0.J() && d0VarG0.f3307c >= i10) {
                d0VarG0.A(i11, false);
                this.f3264t0.f3284g = true;
            }
        }
        this.f3251n.u(i10, i11);
        requestLayout();
    }

    void C0(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int iJ = this.f3257q.j();
        if (i10 < i11) {
            i14 = -1;
            i13 = i10;
            i12 = i11;
        } else {
            i12 = i10;
            i13 = i11;
            i14 = 1;
        }
        for (int i16 = 0; i16 < iJ; i16++) {
            d0 d0VarG0 = g0(this.f3257q.i(i16));
            if (d0VarG0 != null && (i15 = d0VarG0.f3307c) >= i13 && i15 <= i12) {
                if (i15 == i10) {
                    d0VarG0.A(i11 - i10, false);
                } else {
                    d0VarG0.A(i14, false);
                }
                this.f3264t0.f3284g = true;
            }
        }
        this.f3251n.v(i10, i11);
        requestLayout();
    }

    void D0(int i10, int i11, boolean z10) {
        int i12 = i10 + i11;
        int iJ = this.f3257q.j();
        for (int i13 = 0; i13 < iJ; i13++) {
            d0 d0VarG0 = g0(this.f3257q.i(i13));
            if (d0VarG0 != null && !d0VarG0.J()) {
                int i14 = d0VarG0.f3307c;
                if (i14 >= i12) {
                    d0VarG0.A(-i11, z10);
                } else if (i14 >= i10) {
                    d0VarG0.i(i10 - 1, -i11, z10);
                }
                this.f3264t0.f3284g = true;
            }
        }
        this.f3251n.w(i10, i11, z10);
        requestLayout();
    }

    public void E0(View view) {
    }

    public boolean F(int i10, int i11, int[] iArr, int[] iArr2, int i12) {
        return getScrollingChildHelper().d(i10, i11, iArr, iArr2, i12);
    }

    public void F0(View view) {
    }

    public final void G(int i10, int i11, int i12, int i13, int[] iArr, int i14, int[] iArr2) {
        getScrollingChildHelper().e(i10, i11, i12, i13, iArr, i14, iArr2);
    }

    void G0() {
        this.R++;
    }

    void H(int i10) {
        o oVar = this.f3273y;
        if (oVar != null) {
            oVar.e1(i10);
        }
        K0(i10);
        t tVar = this.f3266u0;
        if (tVar != null) {
            tVar.a(this, i10);
        }
        List list = this.f3268v0;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                ((t) this.f3268v0.get(size)).a(this, i10);
            }
        }
    }

    void H0() {
        I0(true);
    }

    void I(int i10, int i11) {
        this.S++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i10, scrollY - i11);
        L0(i10, i11);
        t tVar = this.f3266u0;
        if (tVar != null) {
            tVar.b(this, i10, i11);
        }
        List list = this.f3268v0;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                ((t) this.f3268v0.get(size)).b(this, i10, i11);
            }
        }
        this.S--;
    }

    void I0(boolean z10) {
        int i10 = this.R - 1;
        this.R = i10;
        if (i10 < 1) {
            this.R = 0;
            if (z10) {
                A();
                J();
            }
        }
    }

    void J() {
        int i10;
        for (int size = this.H0.size() - 1; size >= 0; size--) {
            d0 d0Var = (d0) this.H0.get(size);
            if (d0Var.f3305a.getParent() == this && !d0Var.J() && (i10 = d0Var.f3321q) != -1) {
                androidx.core.view.w.y0(d0Var.f3305a, i10);
                d0Var.f3321q = -1;
            }
        }
        this.H0.clear();
    }

    public void K0(int i10) {
    }

    void L() {
        int measuredWidth;
        int measuredHeight;
        if (this.f3237a0 != null) {
            return;
        }
        EdgeEffect edgeEffectA = this.T.a(this, 3);
        this.f3237a0 = edgeEffectA;
        if (this.f3261s) {
            measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        } else {
            measuredWidth = getMeasuredWidth();
            measuredHeight = getMeasuredHeight();
        }
        edgeEffectA.setSize(measuredWidth, measuredHeight);
    }

    public void L0(int i10, int i11) {
    }

    void M() {
        int measuredHeight;
        int measuredWidth;
        if (this.U != null) {
            return;
        }
        EdgeEffect edgeEffectA = this.T.a(this, 0);
        this.U = edgeEffectA;
        if (this.f3261s) {
            measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
            measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
        } else {
            measuredHeight = getMeasuredHeight();
            measuredWidth = getMeasuredWidth();
        }
        edgeEffectA.setSize(measuredHeight, measuredWidth);
    }

    void M0() {
        if (this.f3276z0 || !this.D) {
            return;
        }
        androidx.core.view.w.g0(this, this.I0);
        this.f3276z0 = true;
    }

    void N() {
        int measuredHeight;
        int measuredWidth;
        if (this.W != null) {
            return;
        }
        EdgeEffect edgeEffectA = this.T.a(this, 2);
        this.W = edgeEffectA;
        if (this.f3261s) {
            measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
            measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
        } else {
            measuredHeight = getMeasuredHeight();
            measuredWidth = getMeasuredWidth();
        }
        edgeEffectA.setSize(measuredHeight, measuredWidth);
    }

    void O() {
        int measuredWidth;
        int measuredHeight;
        if (this.V != null) {
            return;
        }
        EdgeEffect edgeEffectA = this.T.a(this, 1);
        this.V = edgeEffectA;
        if (this.f3261s) {
            measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        } else {
            measuredWidth = getMeasuredWidth();
            measuredHeight = getMeasuredHeight();
        }
        edgeEffectA.setSize(measuredWidth, measuredHeight);
    }

    String P() {
        return " " + super.toString() + ", adapter:" + this.f3271x + ", layout:" + this.f3273y + ", context:" + getContext();
    }

    void P0(boolean z10) {
        this.Q = z10 | this.Q;
        this.P = true;
        y0();
    }

    final void Q(a0 a0Var) {
        if (getScrollState() != 2) {
            a0Var.f3293p = 0;
            a0Var.f3294q = 0;
        } else {
            OverScroller overScroller = this.f3258q0.f3298o;
            a0Var.f3293p = overScroller.getFinalX() - overScroller.getCurrX();
            a0Var.f3294q = overScroller.getFinalY() - overScroller.getCurrY();
        }
    }

    public View R(View view) {
        Object parent;
        while (true) {
            parent = view.getParent();
            if (parent == null || parent == this || !(parent instanceof View)) {
                break;
            }
            view = (View) parent;
        }
        if (parent == this) {
            return view;
        }
        return null;
    }

    void R0(d0 d0Var, l.c cVar) {
        d0Var.F(0, 8192);
        if (this.f3264t0.f3286i && d0Var.y() && !d0Var.v() && !d0Var.J()) {
            this.f3259r.c(c0(d0Var), d0Var);
        }
        this.f3259r.e(d0Var, cVar);
    }

    public d0 S(View view) {
        View viewR = R(view);
        if (viewR == null) {
            return null;
        }
        return f0(viewR);
    }

    void U0() {
        l lVar = this.f3238b0;
        if (lVar != null) {
            lVar.k();
        }
        o oVar = this.f3273y;
        if (oVar != null) {
            oVar.k1(this.f3251n);
            this.f3273y.l1(this.f3251n);
        }
        this.f3251n.c();
    }

    boolean V0(View view) {
        q1();
        boolean zR = this.f3257q.r(view);
        if (zR) {
            d0 d0VarG0 = g0(view);
            this.f3251n.J(d0VarG0);
            this.f3251n.C(d0VarG0);
        }
        s1(!zR);
        return zR;
    }

    public void W0(n nVar) {
        o oVar = this.f3273y;
        if (oVar != null) {
            oVar.g("Cannot remove item decoration during a scroll  or layout");
        }
        this.A.remove(nVar);
        if (this.A.isEmpty()) {
            setWillNotDraw(getOverScrollMode() == 2);
        }
        x0();
        requestLayout();
    }

    public d0 X(int i10) {
        d0 d0Var = null;
        if (this.P) {
            return null;
        }
        int iJ = this.f3257q.j();
        for (int i11 = 0; i11 < iJ; i11++) {
            d0 d0VarG0 = g0(this.f3257q.i(i11));
            if (d0VarG0 != null && !d0VarG0.v() && b0(d0VarG0) == i10) {
                if (!this.f3257q.n(d0VarG0.f3305a)) {
                    return d0VarG0;
                }
                d0Var = d0VarG0;
            }
        }
        return d0Var;
    }

    public void X0(s sVar) {
        this.B.remove(sVar);
        if (this.C == sVar) {
            this.C = null;
        }
    }

    public d0 Y(long j10) {
        g gVar = this.f3271x;
        d0 d0Var = null;
        if (gVar != null && gVar.j()) {
            int iJ = this.f3257q.j();
            for (int i10 = 0; i10 < iJ; i10++) {
                d0 d0VarG0 = g0(this.f3257q.i(i10));
                if (d0VarG0 != null && !d0VarG0.v() && d0VarG0.k() == j10) {
                    if (!this.f3257q.n(d0VarG0.f3305a)) {
                        return d0VarG0;
                    }
                    d0Var = d0VarG0;
                }
            }
        }
        return d0Var;
    }

    public void Y0(t tVar) {
        List list = this.f3268v0;
        if (list != null) {
            list.remove(tVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    androidx.recyclerview.widget.RecyclerView.d0 Z(int r6, boolean r7) {
        /*
            r5 = this;
            androidx.recyclerview.widget.b r0 = r5.f3257q
            int r0 = r0.j()
            r1 = 0
            r2 = 0
        L8:
            if (r2 >= r0) goto L3a
            androidx.recyclerview.widget.b r3 = r5.f3257q
            android.view.View r3 = r3.i(r2)
            androidx.recyclerview.widget.RecyclerView$d0 r3 = g0(r3)
            if (r3 == 0) goto L37
            boolean r4 = r3.v()
            if (r4 != 0) goto L37
            if (r7 == 0) goto L23
            int r4 = r3.f3307c
            if (r4 == r6) goto L2a
            goto L37
        L23:
            int r4 = r3.m()
            if (r4 == r6) goto L2a
            goto L37
        L2a:
            androidx.recyclerview.widget.b r1 = r5.f3257q
            android.view.View r4 = r3.f3305a
            boolean r1 = r1.n(r4)
            if (r1 == 0) goto L36
            r1 = r3
            goto L37
        L36:
            return r3
        L37:
            int r2 = r2 + 1
            goto L8
        L3a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.Z(int, boolean):androidx.recyclerview.widget.RecyclerView$d0");
    }

    void Z0() {
        d0 d0Var;
        int iG = this.f3257q.g();
        for (int i10 = 0; i10 < iG; i10++) {
            View viewF = this.f3257q.f(i10);
            d0 d0VarF0 = f0(viewF);
            if (d0VarF0 != null && (d0Var = d0VarF0.f3313i) != null) {
                View view = d0Var.f3305a;
                int left = viewF.getLeft();
                int top = viewF.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
    }

    void a(int i10, int i11) {
        if (i10 < 0) {
            M();
            if (this.U.isFinished()) {
                this.U.onAbsorb(-i10);
            }
        } else if (i10 > 0) {
            N();
            if (this.W.isFinished()) {
                this.W.onAbsorb(i10);
            }
        }
        if (i11 < 0) {
            O();
            if (this.V.isFinished()) {
                this.V.onAbsorb(-i11);
            }
        } else if (i11 > 0) {
            L();
            if (this.f3237a0.isFinished()) {
                this.f3237a0.onAbsorb(i11);
            }
        }
        if (i10 == 0 && i11 == 0) {
            return;
        }
        androidx.core.view.w.f0(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6 */
    public boolean a0(int i10, int i11) {
        o oVar = this.f3273y;
        if (oVar == null) {
            Log.e("RecyclerView", "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return false;
        }
        if (this.J) {
            return false;
        }
        int iK = oVar.k();
        boolean zL = this.f3273y.l();
        if (iK == 0 || Math.abs(i10) < this.f3248l0) {
            i10 = 0;
        }
        if (!zL || Math.abs(i11) < this.f3248l0) {
            i11 = 0;
        }
        if (i10 == 0 && i11 == 0) {
            return false;
        }
        float f5 = i10;
        float f10 = i11;
        if (!dispatchNestedPreFling(f5, f10)) {
            boolean z10 = iK != 0 || zL;
            dispatchNestedFling(f5, f10, z10);
            r rVar = this.f3247k0;
            if (rVar != null && rVar.a(i10, i11)) {
                return true;
            }
            if (z10) {
                if (zL) {
                    iK = (iK == true ? 1 : 0) | 2;
                }
                r1(iK, 1);
                int i12 = this.f3250m0;
                int iMax = Math.max(-i12, Math.min(i10, i12));
                int i13 = this.f3250m0;
                this.f3258q0.c(iMax, Math.max(-i13, Math.min(i11, i13)));
                return true;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList arrayList, int i10, int i11) {
        o oVar = this.f3273y;
        if (oVar == null || !oVar.F0(this, arrayList, i10, i11)) {
            super.addFocusables(arrayList, i10, i11);
        }
    }

    int b0(d0 d0Var) {
        if (d0Var.p(524) || !d0Var.s()) {
            return -1;
        }
        return this.f3255p.e(d0Var.f3307c);
    }

    long c0(d0 d0Var) {
        return this.f3271x.j() ? d0Var.k() : d0Var.f3307c;
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof p) && this.f3273y.m((p) layoutParams);
    }

    @Override // android.view.View
    public int computeHorizontalScrollExtent() {
        o oVar = this.f3273y;
        if (oVar != null && oVar.k()) {
            return this.f3273y.q(this.f3264t0);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeHorizontalScrollOffset() {
        o oVar = this.f3273y;
        if (oVar != null && oVar.k()) {
            return this.f3273y.r(this.f3264t0);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeHorizontalScrollRange() {
        o oVar = this.f3273y;
        if (oVar != null && oVar.k()) {
            return this.f3273y.s(this.f3264t0);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollExtent() {
        o oVar = this.f3273y;
        if (oVar != null && oVar.l()) {
            return this.f3273y.t(this.f3264t0);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollOffset() {
        o oVar = this.f3273y;
        if (oVar != null && oVar.l()) {
            return this.f3273y.u(this.f3264t0);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollRange() {
        o oVar = this.f3273y;
        if (oVar != null && oVar.l()) {
            return this.f3273y.v(this.f3264t0);
        }
        return 0;
    }

    public int d0(View view) {
        d0 d0VarG0 = g0(view);
        if (d0VarG0 != null) {
            return d0VarG0.j();
        }
        return -1;
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f5, float f10, boolean z10) {
        return getScrollingChildHelper().a(f5, f10, z10);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f5, float f10) {
        return getScrollingChildHelper().b(f5, f10);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i10, int i11, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i10, i11, iArr, iArr2);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i10, int i11, int i12, int i13, int[] iArr) {
        return getScrollingChildHelper().f(i10, i11, i12, i13, iArr);
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchRestoreInstanceState(SparseArray sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchSaveInstanceState(SparseArray sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        boolean z10;
        float paddingRight;
        int paddingBottom;
        super.draw(canvas);
        int size = this.A.size();
        boolean z11 = false;
        for (int i10 = 0; i10 < size; i10++) {
            ((n) this.A.get(i10)).i(canvas, this, this.f3264t0);
        }
        EdgeEffect edgeEffect = this.U;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z10 = false;
        } else {
            int iSave = canvas.save();
            int paddingBottom2 = this.f3261s ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom2, 0.0f);
            EdgeEffect edgeEffect2 = this.U;
            z10 = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(iSave);
        }
        EdgeEffect edgeEffect3 = this.V;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int iSave2 = canvas.save();
            if (this.f3261s) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.V;
            z10 |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(iSave2);
        }
        EdgeEffect edgeEffect5 = this.W;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int iSave3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.f3261s ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(-paddingTop, -width);
            EdgeEffect edgeEffect6 = this.W;
            z10 |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(iSave3);
        }
        EdgeEffect edgeEffect7 = this.f3237a0;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int iSave4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.f3261s) {
                paddingRight = (-getWidth()) + getPaddingRight();
                paddingBottom = (-getHeight()) + getPaddingBottom();
            } else {
                paddingRight = -getWidth();
                paddingBottom = -getHeight();
            }
            canvas.translate(paddingRight, paddingBottom);
            EdgeEffect edgeEffect8 = this.f3237a0;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z11 = true;
            }
            z10 |= z11;
            canvas.restoreToCount(iSave4);
        }
        if ((z10 || this.f3238b0 == null || this.A.size() <= 0 || !this.f3238b0.p()) ? z10 : true) {
            androidx.core.view.w.f0(this);
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j10) {
        return super.drawChild(canvas, view, j10);
    }

    public int e0(View view) {
        d0 d0VarG0 = g0(view);
        if (d0VarG0 != null) {
            return d0VarG0.m();
        }
        return -1;
    }

    void e1() {
        int iJ = this.f3257q.j();
        for (int i10 = 0; i10 < iJ; i10++) {
            d0 d0VarG0 = g0(this.f3257q.i(i10));
            if (!d0VarG0.J()) {
                d0VarG0.E();
            }
        }
    }

    public d0 f0(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return g0(view);
        }
        throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
    }

    boolean f1(int i10, int i11, MotionEvent motionEvent) {
        int i12;
        int i13;
        int i14;
        int i15;
        u();
        if (this.f3271x != null) {
            int[] iArr = this.G0;
            iArr[0] = 0;
            iArr[1] = 0;
            g1(i10, i11, iArr);
            int[] iArr2 = this.G0;
            int i16 = iArr2[0];
            int i17 = iArr2[1];
            i12 = i17;
            i13 = i16;
            i14 = i10 - i16;
            i15 = i11 - i17;
        } else {
            i12 = 0;
            i13 = 0;
            i14 = 0;
            i15 = 0;
        }
        if (!this.A.isEmpty()) {
            invalidate();
        }
        int[] iArr3 = this.G0;
        iArr3[0] = 0;
        iArr3[1] = 0;
        G(i13, i12, i14, i15, this.E0, 0, iArr3);
        int[] iArr4 = this.G0;
        int i18 = i14 - iArr4[0];
        int i19 = i15 - iArr4[1];
        boolean z10 = (iArr4[0] == 0 && iArr4[1] == 0) ? false : true;
        int i20 = this.f3244h0;
        int[] iArr5 = this.E0;
        this.f3244h0 = i20 - iArr5[0];
        this.f3245i0 -= iArr5[1];
        int[] iArr6 = this.F0;
        iArr6[0] = iArr6[0] + iArr5[0];
        iArr6[1] = iArr6[1] + iArr5[1];
        if (getOverScrollMode() != 2) {
            if (motionEvent != null && !androidx.core.view.l.a(motionEvent, 8194)) {
                Q0(motionEvent.getX(), i18, motionEvent.getY(), i19);
            }
            t(i10, i11);
        }
        if (i13 != 0 || i12 != 0) {
            I(i13, i12);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        return (!z10 && i13 == 0 && i12 == 0) ? false : true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public View focusSearch(View view, int i10) {
        View viewJ0;
        boolean z10;
        View viewQ0 = this.f3273y.Q0(view, i10);
        if (viewQ0 != null) {
            return viewQ0;
        }
        boolean z11 = (this.f3271x == null || this.f3273y == null || u0() || this.J) ? false : true;
        FocusFinder focusFinder = FocusFinder.getInstance();
        if (z11 && (i10 == 2 || i10 == 1)) {
            if (this.f3273y.l()) {
                int i11 = i10 == 2 ? 130 : 33;
                z10 = focusFinder.findNextFocus(this, view, i11) == null;
                if (P0) {
                    i10 = i11;
                }
            } else {
                z10 = false;
            }
            if (!z10 && this.f3273y.k()) {
                int i12 = (this.f3273y.Z() == 1) ^ (i10 == 2) ? 66 : 17;
                boolean z12 = focusFinder.findNextFocus(this, view, i12) == null;
                if (P0) {
                    i10 = i12;
                }
                z10 = z12;
            }
            if (z10) {
                u();
                if (R(view) == null) {
                    return null;
                }
                q1();
                this.f3273y.J0(view, i10, this.f3251n, this.f3264t0);
                s1(false);
            }
            viewJ0 = focusFinder.findNextFocus(this, view, i10);
        } else {
            View viewFindNextFocus = focusFinder.findNextFocus(this, view, i10);
            if (viewFindNextFocus == null && z11) {
                u();
                if (R(view) == null) {
                    return null;
                }
                q1();
                viewJ0 = this.f3273y.J0(view, i10, this.f3251n, this.f3264t0);
                s1(false);
            } else {
                viewJ0 = viewFindNextFocus;
            }
        }
        if (viewJ0 == null || viewJ0.hasFocusable()) {
            return v0(view, viewJ0, i10) ? viewJ0 : super.focusSearch(view, i10);
        }
        if (getFocusedChild() == null) {
            return super.focusSearch(view, i10);
        }
        a1(viewJ0, null);
        return view;
    }

    void g1(int i10, int i11, int[] iArr) {
        q1();
        G0();
        androidx.core.os.m.a("RV Scroll");
        Q(this.f3264t0);
        int iW1 = i10 != 0 ? this.f3273y.w1(i10, this.f3251n, this.f3264t0) : 0;
        int iY1 = i11 != 0 ? this.f3273y.y1(i11, this.f3251n, this.f3264t0) : 0;
        androidx.core.os.m.b();
        Z0();
        H0();
        s1(false);
        if (iArr != null) {
            iArr[0] = iW1;
            iArr[1] = iY1;
        }
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        o oVar = this.f3273y;
        if (oVar != null) {
            return oVar.D();
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + P());
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        o oVar = this.f3273y;
        if (oVar != null) {
            return oVar.E(getContext(), attributeSet);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + P());
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        o oVar = this.f3273y;
        if (oVar != null) {
            return oVar.F(layoutParams);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + P());
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public g getAdapter() {
        return this.f3271x;
    }

    @Override // android.view.View
    public int getBaseline() {
        o oVar = this.f3273y;
        return oVar != null ? oVar.G() : super.getBaseline();
    }

    @Override // android.view.ViewGroup
    protected int getChildDrawingOrder(int i10, int i11) {
        j jVar = this.B0;
        return jVar == null ? super.getChildDrawingOrder(i10, i11) : jVar.a(i10, i11);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.f3261s;
    }

    public androidx.recyclerview.widget.k getCompatAccessibilityDelegate() {
        return this.A0;
    }

    public k getEdgeEffectFactory() {
        return this.T;
    }

    public l getItemAnimator() {
        return this.f3238b0;
    }

    public int getItemDecorationCount() {
        return this.A.size();
    }

    public o getLayoutManager() {
        return this.f3273y;
    }

    public int getMaxFlingVelocity() {
        return this.f3250m0;
    }

    public int getMinFlingVelocity() {
        return this.f3248l0;
    }

    long getNanoTime() {
        if (O0) {
            return System.nanoTime();
        }
        return 0L;
    }

    public r getOnFlingListener() {
        return this.f3247k0;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.f3256p0;
    }

    public u getRecycledViewPool() {
        return this.f3251n.i();
    }

    public int getScrollState() {
        return this.f3239c0;
    }

    public void h(n nVar) {
        i(nVar, -1);
    }

    public void h1(int i10) {
        if (this.J) {
            return;
        }
        u1();
        o oVar = this.f3273y;
        if (oVar == null) {
            Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            oVar.x1(i10);
            awakenScrollBars();
        }
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().j();
    }

    public void i(n nVar, int i10) {
        o oVar = this.f3273y;
        if (oVar != null) {
            oVar.g("Cannot add item decoration during a scroll  or layout");
        }
        if (this.A.isEmpty()) {
            setWillNotDraw(false);
        }
        if (i10 < 0) {
            this.A.add(nVar);
        } else {
            this.A.add(i10, nVar);
        }
        x0();
        requestLayout();
    }

    @Override // android.view.View
    public boolean isAttachedToWindow() {
        return this.D;
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.J;
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().l();
    }

    public void j(s sVar) {
        this.B.add(sVar);
    }

    boolean j1(d0 d0Var, int i10) {
        if (!u0()) {
            androidx.core.view.w.y0(d0Var.f3305a, i10);
            return true;
        }
        d0Var.f3321q = i10;
        this.H0.add(d0Var);
        return false;
    }

    public void k(t tVar) {
        if (this.f3268v0 == null) {
            this.f3268v0 = new ArrayList();
        }
        this.f3268v0.add(tVar);
    }

    Rect k0(View view) {
        p pVar = (p) view.getLayoutParams();
        if (!pVar.f3364c) {
            return pVar.f3363b;
        }
        if (this.f3264t0.e() && (pVar.b() || pVar.d())) {
            return pVar.f3363b;
        }
        Rect rect = pVar.f3363b;
        rect.set(0, 0, 0, 0);
        int size = this.A.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f3265u.set(0, 0, 0, 0);
            ((n) this.A.get(i10)).e(this.f3265u, view, this, this.f3264t0);
            int i11 = rect.left;
            Rect rect2 = this.f3265u;
            rect.left = i11 + rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        pVar.f3364c = false;
        return rect;
    }

    boolean k1(AccessibilityEvent accessibilityEvent) {
        if (!u0()) {
            return false;
        }
        int iA = accessibilityEvent != null ? androidx.core.view.accessibility.b.a(accessibilityEvent) : 0;
        this.L |= iA != 0 ? iA : 0;
        return true;
    }

    void l(d0 d0Var, l.c cVar, l.c cVar2) {
        d0Var.G(false);
        if (this.f3238b0.a(d0Var, cVar, cVar2)) {
            M0();
        }
    }

    public void l1(int i10, int i11) {
        m1(i10, i11, null);
    }

    public boolean m0() {
        return !this.G || this.P || this.f3255p.p();
    }

    public void m1(int i10, int i11, Interpolator interpolator) {
        n1(i10, i11, interpolator, Integer.MIN_VALUE);
    }

    void n(d0 d0Var, l.c cVar, l.c cVar2) {
        g(d0Var);
        d0Var.G(false);
        if (this.f3238b0.c(d0Var, cVar, cVar2)) {
            M0();
        }
    }

    public void n1(int i10, int i11, Interpolator interpolator, int i12) {
        o1(i10, i11, interpolator, i12, false);
    }

    void o(String str) {
        if (u0()) {
            if (str != null) {
                throw new IllegalStateException(str);
            }
            throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling" + P());
        }
        if (this.S > 0) {
            Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException("" + P()));
        }
    }

    void o0() {
        this.f3255p = new androidx.recyclerview.widget.a(new f());
    }

    void o1(int i10, int i11, Interpolator interpolator, int i12, boolean z10) {
        o oVar = this.f3273y;
        if (oVar == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.J) {
            return;
        }
        if (!oVar.k()) {
            i10 = 0;
        }
        if (!this.f3273y.l()) {
            i11 = 0;
        }
        if (i10 == 0 && i11 == 0) {
            return;
        }
        if (!(i12 == Integer.MIN_VALUE || i12 > 0)) {
            scrollBy(i10, i11);
            return;
        }
        if (z10) {
            int i13 = i10 != 0 ? 1 : 0;
            if (i11 != 0) {
                i13 |= 2;
            }
            r1(i13, 1);
        }
        this.f3258q0.f(i10, i11, i12, interpolator);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.R = 0;
        this.D = true;
        this.G = this.G && !isLayoutRequested();
        o oVar = this.f3273y;
        if (oVar != null) {
            oVar.z(this);
        }
        this.f3276z0 = false;
        if (O0) {
            ThreadLocal threadLocal = androidx.recyclerview.widget.e.f3536q;
            androidx.recyclerview.widget.e eVar = (androidx.recyclerview.widget.e) threadLocal.get();
            this.f3260r0 = eVar;
            if (eVar == null) {
                this.f3260r0 = new androidx.recyclerview.widget.e();
                Display displayV = androidx.core.view.w.v(this);
                float f5 = 60.0f;
                if (!isInEditMode() && displayV != null) {
                    float refreshRate = displayV.getRefreshRate();
                    if (refreshRate >= 30.0f) {
                        f5 = refreshRate;
                    }
                }
                androidx.recyclerview.widget.e eVar2 = this.f3260r0;
                eVar2.f3540o = (long) (1.0E9f / f5);
                threadLocal.set(eVar2);
            }
            this.f3260r0.a(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        androidx.recyclerview.widget.e eVar;
        super.onDetachedFromWindow();
        l lVar = this.f3238b0;
        if (lVar != null) {
            lVar.k();
        }
        u1();
        this.D = false;
        o oVar = this.f3273y;
        if (oVar != null) {
            oVar.A(this, this.f3251n);
        }
        this.H0.clear();
        removeCallbacks(this.I0);
        this.f3259r.j();
        if (!O0 || (eVar = this.f3260r0) == null) {
            return;
        }
        eVar.j(this);
        this.f3260r0 = null;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int size = this.A.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((n) this.A.get(i10)).g(canvas, this, this.f3264t0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006c  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onGenericMotionEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            androidx.recyclerview.widget.RecyclerView$o r0 = r5.f3273y
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            boolean r0 = r5.J
            if (r0 == 0) goto Lb
            return r1
        Lb:
            int r0 = r6.getAction()
            r2 = 8
            if (r0 != r2) goto L77
            int r0 = r6.getSource()
            r0 = r0 & 2
            r2 = 0
            if (r0 == 0) goto L3e
            androidx.recyclerview.widget.RecyclerView$o r0 = r5.f3273y
            boolean r0 = r0.l()
            if (r0 == 0) goto L2c
            r0 = 9
            float r0 = r6.getAxisValue(r0)
            float r0 = -r0
            goto L2d
        L2c:
            r0 = r2
        L2d:
            androidx.recyclerview.widget.RecyclerView$o r3 = r5.f3273y
            boolean r3 = r3.k()
            if (r3 == 0) goto L3c
            r3 = 10
            float r3 = r6.getAxisValue(r3)
            goto L64
        L3c:
            r3 = r2
            goto L64
        L3e:
            int r0 = r6.getSource()
            r3 = 4194304(0x400000, float:5.877472E-39)
            r0 = r0 & r3
            if (r0 == 0) goto L62
            r0 = 26
            float r0 = r6.getAxisValue(r0)
            androidx.recyclerview.widget.RecyclerView$o r3 = r5.f3273y
            boolean r3 = r3.l()
            if (r3 == 0) goto L57
            float r0 = -r0
            goto L3c
        L57:
            androidx.recyclerview.widget.RecyclerView$o r3 = r5.f3273y
            boolean r3 = r3.k()
            if (r3 == 0) goto L62
            r3 = r0
            r0 = r2
            goto L64
        L62:
            r0 = r2
            r3 = r0
        L64:
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L6c
            int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r2 == 0) goto L77
        L6c:
            float r2 = r5.f3252n0
            float r3 = r3 * r2
            int r2 = (int) r3
            float r3 = r5.f3254o0
            float r0 = r0 * r3
            int r0 = (int) r0
            r5.f1(r2, r0, r6)
        L77:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        if (this.J) {
            return false;
        }
        this.C = null;
        if (T(motionEvent)) {
            q();
            return true;
        }
        o oVar = this.f3273y;
        if (oVar == null) {
            return false;
        }
        boolean zK = oVar.k();
        boolean zL = this.f3273y.l();
        if (this.f3241e0 == null) {
            this.f3241e0 = VelocityTracker.obtain();
        }
        this.f3241e0.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            if (this.K) {
                this.K = false;
            }
            this.f3240d0 = motionEvent.getPointerId(0);
            int x10 = (int) (motionEvent.getX() + 0.5f);
            this.f3244h0 = x10;
            this.f3242f0 = x10;
            int y10 = (int) (motionEvent.getY() + 0.5f);
            this.f3245i0 = y10;
            this.f3243g0 = y10;
            if (this.f3239c0 == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(1);
                t1(1);
            }
            int[] iArr = this.F0;
            iArr[1] = 0;
            iArr[0] = 0;
            int i10 = zK;
            if (zL) {
                i10 = (zK ? 1 : 0) | 2;
            }
            r1(i10, 0);
        } else if (actionMasked == 1) {
            this.f3241e0.clear();
            t1(0);
        } else if (actionMasked == 2) {
            int iFindPointerIndex = motionEvent.findPointerIndex(this.f3240d0);
            if (iFindPointerIndex < 0) {
                Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.f3240d0 + " not found. Did any MotionEvents get skipped?");
                return false;
            }
            int x11 = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
            int y11 = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
            if (this.f3239c0 != 1) {
                int i11 = x11 - this.f3242f0;
                int i12 = y11 - this.f3243g0;
                if (zK == 0 || Math.abs(i11) <= this.f3246j0) {
                    z10 = false;
                } else {
                    this.f3244h0 = x11;
                    z10 = true;
                }
                if (zL && Math.abs(i12) > this.f3246j0) {
                    this.f3245i0 = y11;
                    z10 = true;
                }
                if (z10) {
                    setScrollState(1);
                }
            }
        } else if (actionMasked == 3) {
            q();
        } else if (actionMasked == 5) {
            this.f3240d0 = motionEvent.getPointerId(actionIndex);
            int x12 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.f3244h0 = x12;
            this.f3242f0 = x12;
            int y12 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.f3245i0 = y12;
            this.f3243g0 = y12;
        } else if (actionMasked == 6) {
            J0(motionEvent);
        }
        return this.f3239c0 == 1;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        androidx.core.os.m.a("RV OnLayout");
        B();
        androidx.core.os.m.b();
        this.G = true;
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        o oVar = this.f3273y;
        if (oVar == null) {
            w(i10, i11);
            return;
        }
        boolean z10 = false;
        if (oVar.s0()) {
            int mode = View.MeasureSpec.getMode(i10);
            int mode2 = View.MeasureSpec.getMode(i11);
            this.f3273y.Z0(this.f3251n, this.f3264t0, i10, i11);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z10 = true;
            }
            if (z10 || this.f3271x == null) {
                return;
            }
            if (this.f3264t0.f3282e == 1) {
                C();
            }
            this.f3273y.A1(i10, i11);
            this.f3264t0.f3287j = true;
            D();
            this.f3273y.D1(i10, i11);
            if (this.f3273y.G1()) {
                this.f3273y.A1(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                this.f3264t0.f3287j = true;
                D();
                this.f3273y.D1(i10, i11);
                return;
            }
            return;
        }
        if (this.E) {
            this.f3273y.Z0(this.f3251n, this.f3264t0, i10, i11);
            return;
        }
        if (this.M) {
            q1();
            G0();
            O0();
            H0();
            a0 a0Var = this.f3264t0;
            if (a0Var.f3289l) {
                a0Var.f3285h = true;
            } else {
                this.f3255p.j();
                this.f3264t0.f3285h = false;
            }
            this.M = false;
            s1(false);
        } else if (this.f3264t0.f3289l) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
            return;
        }
        g gVar = this.f3271x;
        if (gVar != null) {
            this.f3264t0.f3283f = gVar.c();
        } else {
            this.f3264t0.f3283f = 0;
        }
        q1();
        this.f3273y.Z0(this.f3251n, this.f3264t0, i10, i11);
        s1(false);
        this.f3264t0.f3285h = false;
    }

    @Override // android.view.ViewGroup
    protected boolean onRequestFocusInDescendants(int i10, Rect rect) {
        if (u0()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i10, rect);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof y)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        y yVar = (y) parcelable;
        this.f3253o = yVar;
        super.onRestoreInstanceState(yVar.a());
        o oVar = this.f3273y;
        if (oVar == null || (parcelable2 = this.f3253o.f3381o) == null) {
            return;
        }
        oVar.c1(parcelable2);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        y yVar = new y(super.onSaveInstanceState());
        y yVar2 = this.f3253o;
        if (yVar2 != null) {
            yVar.b(yVar2);
        } else {
            o oVar = this.f3273y;
            yVar.f3381o = oVar != null ? oVar.d1() : null;
        }
        return yVar;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (i10 == i12 && i11 == i13) {
            return;
        }
        s0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00dd A[PHI: r0
  0x00dd: PHI (r0v36 int) = (r0v26 int), (r0v40 int) binds: [B:41:0x00c8, B:46:0x00d9] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            Method dump skipped, instructions count: 476
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    boolean p(d0 d0Var) {
        l lVar = this.f3238b0;
        return lVar == null || lVar.g(d0Var, d0Var.o());
    }

    public void p1(int i10) {
        if (this.J) {
            return;
        }
        o oVar = this.f3273y;
        if (oVar == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            oVar.I1(this, this.f3264t0, i10);
        }
    }

    void q1() {
        int i10 = this.H + 1;
        this.H = i10;
        if (i10 != 1 || this.J) {
            return;
        }
        this.I = false;
    }

    void r0(StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2) {
        if (stateListDrawable != null && drawable != null && stateListDrawable2 != null && drawable2 != null) {
            Resources resources = getContext().getResources();
            new androidx.recyclerview.widget.d(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(p0.b.f25847a), resources.getDimensionPixelSize(p0.b.f25849c), resources.getDimensionPixelOffset(p0.b.f25848b));
        } else {
            throw new IllegalArgumentException("Trying to set fast scroller without both required drawables." + P());
        }
    }

    public boolean r1(int i10, int i11) {
        return getScrollingChildHelper().p(i10, i11);
    }

    @Override // android.view.ViewGroup
    protected void removeDetachedView(View view, boolean z10) {
        d0 d0VarG0 = g0(view);
        if (d0VarG0 != null) {
            if (d0VarG0.x()) {
                d0VarG0.f();
            } else if (!d0VarG0.J()) {
                throw new IllegalArgumentException("Called removeDetachedView with a view which is not flagged as tmp detached." + d0VarG0 + P());
            }
        }
        view.clearAnimation();
        z(view);
        super.removeDetachedView(view, z10);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (!this.f3273y.b1(this, this.f3264t0, view, view2) && view2 != null) {
            a1(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z10) {
        return this.f3273y.r1(this, view, rect, z10);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z10) {
        int size = this.B.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((s) this.B.get(i10)).c(z10);
        }
        super.requestDisallowInterceptTouchEvent(z10);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.H != 0 || this.J) {
            this.I = true;
        } else {
            super.requestLayout();
        }
    }

    void s() {
        int iJ = this.f3257q.j();
        for (int i10 = 0; i10 < iJ; i10++) {
            d0 d0VarG0 = g0(this.f3257q.i(i10));
            if (!d0VarG0.J()) {
                d0VarG0.c();
            }
        }
        this.f3251n.d();
    }

    void s0() {
        this.f3237a0 = null;
        this.V = null;
        this.W = null;
        this.U = null;
    }

    void s1(boolean z10) {
        if (this.H < 1) {
            this.H = 1;
        }
        if (!z10 && !this.J) {
            this.I = false;
        }
        if (this.H == 1) {
            if (z10 && this.I && !this.J && this.f3273y != null && this.f3271x != null) {
                B();
            }
            if (!this.J) {
                this.I = false;
            }
        }
        this.H--;
    }

    @Override // android.view.View
    public void scrollBy(int i10, int i11) {
        o oVar = this.f3273y;
        if (oVar == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.J) {
            return;
        }
        boolean zK = oVar.k();
        boolean zL = this.f3273y.l();
        if (zK || zL) {
            if (!zK) {
                i10 = 0;
            }
            if (!zL) {
                i11 = 0;
            }
            f1(i10, i11, null);
        }
    }

    @Override // android.view.View
    public void scrollTo(int i10, int i11) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (k1(accessibilityEvent)) {
            return;
        }
        super.sendAccessibilityEventUnchecked(accessibilityEvent);
    }

    public void setAccessibilityDelegateCompat(androidx.recyclerview.widget.k kVar) {
        this.A0 = kVar;
        androidx.core.view.w.o0(this, kVar);
    }

    public void setAdapter(g gVar) {
        setLayoutFrozen(false);
        i1(gVar, false, true);
        P0(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(j jVar) {
        if (jVar == this.B0) {
            return;
        }
        this.B0 = jVar;
        setChildrenDrawingOrderEnabled(jVar != null);
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z10) {
        if (z10 != this.f3261s) {
            s0();
        }
        this.f3261s = z10;
        super.setClipToPadding(z10);
        if (this.G) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(k kVar) {
        androidx.core.util.h.f(kVar);
        this.T = kVar;
        s0();
    }

    public void setHasFixedSize(boolean z10) {
        this.E = z10;
    }

    public void setItemAnimator(l lVar) {
        l lVar2 = this.f3238b0;
        if (lVar2 != null) {
            lVar2.k();
            this.f3238b0.v(null);
        }
        this.f3238b0 = lVar;
        if (lVar != null) {
            lVar.v(this.f3274y0);
        }
    }

    public void setItemViewCacheSize(int i10) {
        this.f3251n.G(i10);
    }

    @Deprecated
    public void setLayoutFrozen(boolean z10) {
        suppressLayout(z10);
    }

    public void setLayoutManager(o oVar) {
        if (oVar == this.f3273y) {
            return;
        }
        u1();
        if (this.f3273y != null) {
            l lVar = this.f3238b0;
            if (lVar != null) {
                lVar.k();
            }
            this.f3273y.k1(this.f3251n);
            this.f3273y.l1(this.f3251n);
            this.f3251n.c();
            if (this.D) {
                this.f3273y.A(this, this.f3251n);
            }
            this.f3273y.E1(null);
            this.f3273y = null;
        } else {
            this.f3251n.c();
        }
        this.f3257q.o();
        this.f3273y = oVar;
        if (oVar != null) {
            if (oVar.f3339b != null) {
                throw new IllegalArgumentException("LayoutManager " + oVar + " is already attached to a RecyclerView:" + oVar.f3339b.P());
            }
            oVar.E1(this);
            if (this.D) {
                this.f3273y.z(this);
            }
        }
        this.f3251n.K();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition != null) {
            throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
        }
        super.setLayoutTransition(null);
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z10) {
        getScrollingChildHelper().m(z10);
    }

    public void setOnFlingListener(r rVar) {
        this.f3247k0 = rVar;
    }

    @Deprecated
    public void setOnScrollListener(t tVar) {
        this.f3266u0 = tVar;
    }

    public void setPreserveFocusAfterLayout(boolean z10) {
        this.f3256p0 = z10;
    }

    public void setRecycledViewPool(u uVar) {
        this.f3251n.E(uVar);
    }

    public void setRecyclerListener(w wVar) {
        this.f3275z = wVar;
    }

    void setScrollState(int i10) {
        if (i10 == this.f3239c0) {
            return;
        }
        this.f3239c0 = i10;
        if (i10 != 2) {
            v1();
        }
        H(i10);
    }

    public void setScrollingTouchSlop(int i10) {
        int scaledTouchSlop;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i10 == 0) {
            scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
        } else if (i10 != 1) {
            Log.w("RecyclerView", "setScrollingTouchSlop(): bad argument constant " + i10 + "; using default value");
            scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
        } else {
            scaledTouchSlop = viewConfiguration.getScaledPagingTouchSlop();
        }
        this.f3246j0 = scaledTouchSlop;
    }

    public void setViewCacheExtension(b0 b0Var) {
        this.f3251n.F(b0Var);
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i10) {
        return getScrollingChildHelper().o(i10);
    }

    @Override // android.view.View
    public void stopNestedScroll() {
        getScrollingChildHelper().q();
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z10) {
        if (z10 != this.J) {
            o("Do not suppressLayout in layout or scroll");
            if (z10) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0));
                this.J = true;
                this.K = true;
                u1();
                return;
            }
            this.J = false;
            if (this.I && this.f3273y != null && this.f3271x != null) {
                requestLayout();
            }
            this.I = false;
        }
    }

    void t(int i10, int i11) {
        boolean zIsFinished;
        EdgeEffect edgeEffect = this.U;
        if (edgeEffect == null || edgeEffect.isFinished() || i10 <= 0) {
            zIsFinished = false;
        } else {
            this.U.onRelease();
            zIsFinished = this.U.isFinished();
        }
        EdgeEffect edgeEffect2 = this.W;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i10 < 0) {
            this.W.onRelease();
            zIsFinished |= this.W.isFinished();
        }
        EdgeEffect edgeEffect3 = this.V;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i11 > 0) {
            this.V.onRelease();
            zIsFinished |= this.V.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f3237a0;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i11 < 0) {
            this.f3237a0.onRelease();
            zIsFinished |= this.f3237a0.isFinished();
        }
        if (zIsFinished) {
            androidx.core.view.w.f0(this);
        }
    }

    boolean t0() {
        AccessibilityManager accessibilityManager = this.N;
        return accessibilityManager != null && accessibilityManager.isEnabled();
    }

    public void t1(int i10) {
        getScrollingChildHelper().r(i10);
    }

    void u() {
        if (!this.G || this.P) {
            androidx.core.os.m.a("RV FullInvalidate");
            B();
            androidx.core.os.m.b();
            return;
        }
        if (this.f3255p.p()) {
            if (this.f3255p.o(4) && !this.f3255p.o(11)) {
                androidx.core.os.m.a("RV PartialInvalidate");
                q1();
                G0();
                this.f3255p.t();
                if (!this.I) {
                    if (n0()) {
                        B();
                    } else {
                        this.f3255p.i();
                    }
                }
                s1(true);
                H0();
            } else {
                if (!this.f3255p.p()) {
                    return;
                }
                androidx.core.os.m.a("RV FullInvalidate");
                B();
            }
            androidx.core.os.m.b();
        }
    }

    public boolean u0() {
        return this.R > 0;
    }

    public void u1() {
        setScrollState(0);
        v1();
    }

    void w(int i10, int i11) {
        setMeasuredDimension(o.n(i10, getPaddingLeft() + getPaddingRight(), androidx.core.view.w.D(this)), o.n(i11, getPaddingTop() + getPaddingBottom(), androidx.core.view.w.C(this)));
    }

    void w0(int i10) {
        if (this.f3273y == null) {
            return;
        }
        setScrollState(2);
        this.f3273y.x1(i10);
        awakenScrollBars();
    }

    void w1(int i10, int i11, Object obj) {
        int i12;
        int iJ = this.f3257q.j();
        int i13 = i10 + i11;
        for (int i14 = 0; i14 < iJ; i14++) {
            View viewI = this.f3257q.i(i14);
            d0 d0VarG0 = g0(viewI);
            if (d0VarG0 != null && !d0VarG0.J() && (i12 = d0VarG0.f3307c) >= i10 && i12 < i13) {
                d0VarG0.b(2);
                d0VarG0.a(obj);
                ((p) viewI.getLayoutParams()).f3364c = true;
            }
        }
        this.f3251n.M(i10, i11);
    }

    void x0() {
        int iJ = this.f3257q.j();
        for (int i10 = 0; i10 < iJ; i10++) {
            ((p) this.f3257q.i(i10).getLayoutParams()).f3364c = true;
        }
        this.f3251n.s();
    }

    void y(View view) {
        d0 d0VarG0 = g0(view);
        E0(view);
        g gVar = this.f3271x;
        if (gVar != null && d0VarG0 != null) {
            gVar.u(d0VarG0);
        }
        List list = this.O;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                ((q) this.O.get(size)).a(view);
            }
        }
    }

    void y0() {
        int iJ = this.f3257q.j();
        for (int i10 = 0; i10 < iJ; i10++) {
            d0 d0VarG0 = g0(this.f3257q.i(i10));
            if (d0VarG0 != null && !d0VarG0.J()) {
                d0VarG0.b(6);
            }
        }
        x0();
        this.f3251n.t();
    }

    void z(View view) {
        d0 d0VarG0 = g0(view);
        F0(view);
        g gVar = this.f3271x;
        if (gVar != null && d0VarG0 != null) {
            gVar.v(d0VarG0);
        }
        List list = this.O;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                ((q) this.O.get(size)).b(view);
            }
        }
    }

    public void z0(int i10) {
        int iG = this.f3257q.g();
        for (int i11 = 0; i11 < iG; i11++) {
            this.f3257q.f(i11).offsetLeftAndRight(i10);
        }
    }
}
