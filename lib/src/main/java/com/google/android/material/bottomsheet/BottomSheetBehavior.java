package com.google.android.material.bottomsheet;

import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.accessibility.d;
import androidx.core.view.accessibility.g;
import androidx.core.view.w;
import c5.i;
import c5.j;
import com.facebook.ads.AdError;
import com.google.android.material.internal.n;
import f0.c;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import s5.k;

/* loaded from: classes.dex */
public class BottomSheetBehavior<V extends View> extends CoordinatorLayout.c {

    /* renamed from: d0, reason: collision with root package name */
    private static final int f20731d0 = j.f4803d;
    private ValueAnimator A;
    int B;
    int C;
    int D;
    float E;
    int F;
    float G;
    boolean H;
    private boolean I;
    private boolean J;
    int K;
    int L;
    f0.c M;
    private boolean N;
    private int O;
    private boolean P;
    private int Q;
    int R;
    int S;
    WeakReference T;
    WeakReference U;
    private final ArrayList V;
    private VelocityTracker W;
    int X;
    private int Y;
    boolean Z;

    /* renamed from: a, reason: collision with root package name */
    private int f20732a;

    /* renamed from: a0, reason: collision with root package name */
    private Map f20733a0;

    /* renamed from: b, reason: collision with root package name */
    private boolean f20734b;

    /* renamed from: b0, reason: collision with root package name */
    private int f20735b0;

    /* renamed from: c, reason: collision with root package name */
    private boolean f20736c;

    /* renamed from: c0, reason: collision with root package name */
    private final c.AbstractC0128c f20737c0;

    /* renamed from: d, reason: collision with root package name */
    private float f20738d;

    /* renamed from: e, reason: collision with root package name */
    private int f20739e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f20740f;

    /* renamed from: g, reason: collision with root package name */
    private int f20741g;

    /* renamed from: h, reason: collision with root package name */
    private int f20742h;

    /* renamed from: i, reason: collision with root package name */
    private s5.g f20743i;

    /* renamed from: j, reason: collision with root package name */
    private ColorStateList f20744j;

    /* renamed from: k, reason: collision with root package name */
    private int f20745k;

    /* renamed from: l, reason: collision with root package name */
    private int f20746l;

    /* renamed from: m, reason: collision with root package name */
    private int f20747m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f20748n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f20749o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f20750p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f20751q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f20752r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f20753s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f20754t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f20755u;

    /* renamed from: v, reason: collision with root package name */
    private int f20756v;

    /* renamed from: w, reason: collision with root package name */
    private int f20757w;

    /* renamed from: x, reason: collision with root package name */
    private k f20758x;

    /* renamed from: y, reason: collision with root package name */
    private boolean f20759y;

    /* renamed from: z, reason: collision with root package name */
    private final g f20760z;

    class a implements Runnable {

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ View f20761m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ int f20762n;

        a(View view, int i10) {
            this.f20761m = view;
            this.f20762n = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            BottomSheetBehavior.this.J0(this.f20761m, this.f20762n, false);
        }
    }

    class b implements ValueAnimator.AnimatorUpdateListener {
        b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            if (BottomSheetBehavior.this.f20743i != null) {
                BottomSheetBehavior.this.f20743i.W(fFloatValue);
            }
        }
    }

    class c implements n.d {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f20765a;

        c(boolean z10) {
            this.f20765a = z10;
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0080  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x00a3  */
        @Override // com.google.android.material.internal.n.d
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public androidx.core.view.h0 a(android.view.View r11, androidx.core.view.h0 r12, com.google.android.material.internal.n.e r13) {
            /*
                r10 = this;
                int r0 = androidx.core.view.h0.m.c()
                androidx.core.graphics.b r0 = r12.f(r0)
                int r1 = androidx.core.view.h0.m.b()
                androidx.core.graphics.b r1 = r12.f(r1)
                com.google.android.material.bottomsheet.BottomSheetBehavior r2 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r3 = r0.f2207b
                com.google.android.material.bottomsheet.BottomSheetBehavior.N(r2, r3)
                boolean r2 = com.google.android.material.internal.n.e(r11)
                int r3 = r11.getPaddingBottom()
                int r4 = r11.getPaddingLeft()
                int r5 = r11.getPaddingRight()
                com.google.android.material.bottomsheet.BottomSheetBehavior r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.O(r6)
                if (r6 == 0) goto L41
                com.google.android.material.bottomsheet.BottomSheetBehavior r3 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r6 = r12.h()
                com.google.android.material.bottomsheet.BottomSheetBehavior.Q(r3, r6)
                int r3 = r13.f21099d
                com.google.android.material.bottomsheet.BottomSheetBehavior r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.P(r6)
                int r3 = r3 + r6
            L41:
                com.google.android.material.bottomsheet.BottomSheetBehavior r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.R(r6)
                if (r6 == 0) goto L53
                if (r2 == 0) goto L4e
                int r4 = r13.f21098c
                goto L50
            L4e:
                int r4 = r13.f21096a
            L50:
                int r6 = r0.f2206a
                int r4 = r4 + r6
            L53:
                com.google.android.material.bottomsheet.BottomSheetBehavior r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.S(r6)
                if (r6 == 0) goto L66
                if (r2 == 0) goto L60
                int r13 = r13.f21096a
                goto L62
            L60:
                int r13 = r13.f21098c
            L62:
                int r2 = r0.f2208c
                int r5 = r13 + r2
            L66:
                android.view.ViewGroup$LayoutParams r13 = r11.getLayoutParams()
                android.view.ViewGroup$MarginLayoutParams r13 = (android.view.ViewGroup.MarginLayoutParams) r13
                com.google.android.material.bottomsheet.BottomSheetBehavior r2 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r2 = com.google.android.material.bottomsheet.BottomSheetBehavior.T(r2)
                r6 = 0
                r7 = 1
                if (r2 == 0) goto L80
                int r2 = r13.leftMargin
                int r8 = r0.f2206a
                if (r2 == r8) goto L80
                r13.leftMargin = r8
                r2 = r7
                goto L81
            L80:
                r2 = r6
            L81:
                com.google.android.material.bottomsheet.BottomSheetBehavior r8 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r8 = com.google.android.material.bottomsheet.BottomSheetBehavior.U(r8)
                if (r8 == 0) goto L92
                int r8 = r13.rightMargin
                int r9 = r0.f2208c
                if (r8 == r9) goto L92
                r13.rightMargin = r9
                r2 = r7
            L92:
                com.google.android.material.bottomsheet.BottomSheetBehavior r8 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r8 = com.google.android.material.bottomsheet.BottomSheetBehavior.F(r8)
                if (r8 == 0) goto La3
                int r8 = r13.topMargin
                int r0 = r0.f2207b
                if (r8 == r0) goto La3
                r13.topMargin = r0
                goto La4
            La3:
                r7 = r2
            La4:
                if (r7 == 0) goto La9
                r11.setLayoutParams(r13)
            La9:
                int r13 = r11.getPaddingTop()
                r11.setPadding(r4, r13, r5, r3)
                boolean r11 = r10.f20765a
                if (r11 == 0) goto Lbb
                com.google.android.material.bottomsheet.BottomSheetBehavior r11 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r13 = r1.f2209d
                com.google.android.material.bottomsheet.BottomSheetBehavior.G(r11, r13)
            Lbb:
                com.google.android.material.bottomsheet.BottomSheetBehavior r11 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r11 = com.google.android.material.bottomsheet.BottomSheetBehavior.O(r11)
                if (r11 != 0) goto Lc7
                boolean r11 = r10.f20765a
                if (r11 == 0) goto Lcc
            Lc7:
                com.google.android.material.bottomsheet.BottomSheetBehavior r11 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                com.google.android.material.bottomsheet.BottomSheetBehavior.H(r11, r6)
            Lcc:
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.c.a(android.view.View, androidx.core.view.h0, com.google.android.material.internal.n$e):androidx.core.view.h0");
        }
    }

    class d extends c.AbstractC0128c {

        /* renamed from: a, reason: collision with root package name */
        private long f20767a;

        d() {
        }

        private boolean n(View view) {
            int top = view.getTop();
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return top > (bottomSheetBehavior.S + bottomSheetBehavior.f0()) / 2;
        }

        @Override // f0.c.AbstractC0128c
        public int a(View view, int i10, int i11) {
            return view.getLeft();
        }

        @Override // f0.c.AbstractC0128c
        public int b(View view, int i10, int i11) {
            int iF0 = BottomSheetBehavior.this.f0();
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return a0.a.b(i10, iF0, bottomSheetBehavior.H ? bottomSheetBehavior.S : bottomSheetBehavior.F);
        }

        @Override // f0.c.AbstractC0128c
        public int e(View view) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return bottomSheetBehavior.H ? bottomSheetBehavior.S : bottomSheetBehavior.F;
        }

        @Override // f0.c.AbstractC0128c
        public void j(int i10) {
            if (i10 == 1 && BottomSheetBehavior.this.J) {
                BottomSheetBehavior.this.C0(1);
            }
        }

        @Override // f0.c.AbstractC0128c
        public void k(View view, int i10, int i11, int i12, int i13) {
            BottomSheetBehavior.this.c0(i11);
        }

        /* JADX WARN: Removed duplicated region for block: B:39:0x00a7  */
        /* JADX WARN: Removed duplicated region for block: B:6:0x0010  */
        @Override // f0.c.AbstractC0128c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void l(android.view.View r8, float r9, float r10) {
            /*
                Method dump skipped, instructions count: 302
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.d.l(android.view.View, float, float):void");
        }

        @Override // f0.c.AbstractC0128c
        public boolean m(View view, int i10) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            int i11 = bottomSheetBehavior.K;
            if (i11 == 1 || bottomSheetBehavior.Z) {
                return false;
            }
            if (i11 == 3 && bottomSheetBehavior.X == i10) {
                WeakReference weakReference = bottomSheetBehavior.U;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && view2.canScrollVertically(-1)) {
                    return false;
                }
            }
            this.f20767a = System.currentTimeMillis();
            WeakReference weakReference2 = BottomSheetBehavior.this.T;
            return weakReference2 != null && weakReference2.get() == view;
        }
    }

    class e implements androidx.core.view.accessibility.g {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f20769a;

        e(int i10) {
            this.f20769a = i10;
        }

        @Override // androidx.core.view.accessibility.g
        public boolean a(View view, g.a aVar) {
            BottomSheetBehavior.this.B0(this.f20769a);
            return true;
        }
    }

    protected static class f extends e0.a {
        public static final Parcelable.Creator<f> CREATOR = new a();

        /* renamed from: o, reason: collision with root package name */
        final int f20771o;

        /* renamed from: p, reason: collision with root package name */
        int f20772p;

        /* renamed from: q, reason: collision with root package name */
        boolean f20773q;

        /* renamed from: r, reason: collision with root package name */
        boolean f20774r;

        /* renamed from: s, reason: collision with root package name */
        boolean f20775s;

        class a implements Parcelable.ClassLoaderCreator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public f createFromParcel(Parcel parcel) {
                return new f(parcel, (ClassLoader) null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public f createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new f(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public f[] newArray(int i10) {
                return new f[i10];
            }
        }

        public f(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f20771o = parcel.readInt();
            this.f20772p = parcel.readInt();
            this.f20773q = parcel.readInt() == 1;
            this.f20774r = parcel.readInt() == 1;
            this.f20775s = parcel.readInt() == 1;
        }

        public f(Parcelable parcelable, BottomSheetBehavior bottomSheetBehavior) {
            super(parcelable);
            this.f20771o = bottomSheetBehavior.K;
            this.f20772p = bottomSheetBehavior.f20739e;
            this.f20773q = bottomSheetBehavior.f20734b;
            this.f20774r = bottomSheetBehavior.H;
            this.f20775s = bottomSheetBehavior.I;
        }

        @Override // e0.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f20771o);
            parcel.writeInt(this.f20772p);
            parcel.writeInt(this.f20773q ? 1 : 0);
            parcel.writeInt(this.f20774r ? 1 : 0);
            parcel.writeInt(this.f20775s ? 1 : 0);
        }
    }

    private class g {

        /* renamed from: a, reason: collision with root package name */
        private int f20776a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f20777b;

        /* renamed from: c, reason: collision with root package name */
        private final Runnable f20778c;

        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                g.this.f20777b = false;
                f0.c cVar = BottomSheetBehavior.this.M;
                if (cVar != null && cVar.k(true)) {
                    g gVar = g.this;
                    gVar.c(gVar.f20776a);
                    return;
                }
                g gVar2 = g.this;
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                if (bottomSheetBehavior.K == 2) {
                    bottomSheetBehavior.C0(gVar2.f20776a);
                }
            }
        }

        private g() {
            this.f20778c = new a();
        }

        /* synthetic */ g(BottomSheetBehavior bottomSheetBehavior, a aVar) {
            this();
        }

        void c(int i10) {
            WeakReference weakReference = BottomSheetBehavior.this.T;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            this.f20776a = i10;
            if (this.f20777b) {
                return;
            }
            w.g0((View) BottomSheetBehavior.this.T.get(), this.f20778c);
            this.f20777b = true;
        }
    }

    public BottomSheetBehavior() {
        this.f20732a = 0;
        this.f20734b = true;
        this.f20736c = false;
        this.f20745k = -1;
        this.f20746l = -1;
        this.f20760z = new g(this, null);
        this.E = 0.5f;
        this.G = -1.0f;
        this.J = true;
        this.K = 4;
        this.L = 4;
        this.V = new ArrayList();
        this.f20735b0 = -1;
        this.f20737c0 = new d();
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        int i10;
        super(context, attributeSet);
        this.f20732a = 0;
        this.f20734b = true;
        this.f20736c = false;
        this.f20745k = -1;
        this.f20746l = -1;
        this.f20760z = new g(this, null);
        this.E = 0.5f;
        this.G = -1.0f;
        this.J = true;
        this.K = 4;
        this.L = 4;
        this.V = new ArrayList();
        this.f20735b0 = -1;
        this.f20737c0 = new d();
        this.f20742h = context.getResources().getDimensionPixelSize(c5.d.J);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c5.k.H);
        int i11 = c5.k.L;
        if (typedArrayObtainStyledAttributes.hasValue(i11)) {
            this.f20744j = p5.c.a(context, typedArrayObtainStyledAttributes, i11);
        }
        if (typedArrayObtainStyledAttributes.hasValue(c5.k.f4834c0)) {
            this.f20758x = k.e(context, attributeSet, c5.b.f4675c, f20731d0).m();
        }
        a0(context);
        b0();
        this.G = typedArrayObtainStyledAttributes.getDimension(c5.k.K, -1.0f);
        int i12 = c5.k.I;
        if (typedArrayObtainStyledAttributes.hasValue(i12)) {
            w0(typedArrayObtainStyledAttributes.getDimensionPixelSize(i12, -1));
        }
        int i13 = c5.k.J;
        if (typedArrayObtainStyledAttributes.hasValue(i13)) {
            v0(typedArrayObtainStyledAttributes.getDimensionPixelSize(i13, -1));
        }
        int i14 = c5.k.R;
        TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes.peekValue(i14);
        if (typedValuePeekValue == null || (i10 = typedValuePeekValue.data) != -1) {
            x0(typedArrayObtainStyledAttributes.getDimensionPixelSize(i14, -1));
        } else {
            x0(i10);
        }
        u0(typedArrayObtainStyledAttributes.getBoolean(c5.k.Q, false));
        s0(typedArrayObtainStyledAttributes.getBoolean(c5.k.U, false));
        r0(typedArrayObtainStyledAttributes.getBoolean(c5.k.O, true));
        A0(typedArrayObtainStyledAttributes.getBoolean(c5.k.T, false));
        p0(typedArrayObtainStyledAttributes.getBoolean(c5.k.M, true));
        z0(typedArrayObtainStyledAttributes.getInt(c5.k.S, 0));
        t0(typedArrayObtainStyledAttributes.getFloat(c5.k.P, 0.5f));
        int i15 = c5.k.N;
        TypedValue typedValuePeekValue2 = typedArrayObtainStyledAttributes.peekValue(i15);
        q0((typedValuePeekValue2 == null || typedValuePeekValue2.type != 16) ? typedArrayObtainStyledAttributes.getDimensionPixelOffset(i15, 0) : typedValuePeekValue2.data);
        this.f20749o = typedArrayObtainStyledAttributes.getBoolean(c5.k.Y, false);
        this.f20750p = typedArrayObtainStyledAttributes.getBoolean(c5.k.Z, false);
        this.f20751q = typedArrayObtainStyledAttributes.getBoolean(c5.k.f4818a0, false);
        this.f20752r = typedArrayObtainStyledAttributes.getBoolean(c5.k.f4826b0, true);
        this.f20753s = typedArrayObtainStyledAttributes.getBoolean(c5.k.V, false);
        this.f20754t = typedArrayObtainStyledAttributes.getBoolean(c5.k.W, false);
        this.f20755u = typedArrayObtainStyledAttributes.getBoolean(c5.k.X, false);
        typedArrayObtainStyledAttributes.recycle();
        this.f20738d = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    private void D0(View view) {
        boolean z10 = (Build.VERSION.SDK_INT < 29 || i0() || this.f20740f) ? false : true;
        if (this.f20749o || this.f20750p || this.f20751q || this.f20753s || this.f20754t || this.f20755u || z10) {
            n.a(view, new c(z10));
        }
    }

    private boolean F0() {
        return this.M != null && (this.J || this.K == 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void J0(View view, int i10, boolean z10) {
        int iG0 = g0(i10);
        f0.c cVar = this.M;
        if (!(cVar != null && (!z10 ? !cVar.H(view, view.getLeft(), iG0) : !cVar.F(view.getLeft(), iG0)))) {
            C0(i10);
            return;
        }
        C0(2);
        L0(i10);
        this.f20760z.c(i10);
    }

    private void K0() {
        View view;
        int i10;
        d.a aVar;
        WeakReference weakReference = this.T;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        w.i0(view, 524288);
        w.i0(view, 262144);
        w.i0(view, 1048576);
        int i11 = this.f20735b0;
        if (i11 != -1) {
            w.i0(view, i11);
        }
        if (!this.f20734b && this.K != 6) {
            this.f20735b0 = V(view, i.f4784a, 6);
        }
        if (this.H && this.K != 5) {
            l0(view, d.a.f2400y, 5);
        }
        int i12 = this.K;
        if (i12 == 3) {
            i10 = this.f20734b ? 4 : 6;
            aVar = d.a.f2399x;
        } else {
            if (i12 != 4) {
                if (i12 != 6) {
                    return;
                }
                l0(view, d.a.f2399x, 4);
                l0(view, d.a.f2398w, 3);
                return;
            }
            i10 = this.f20734b ? 3 : 6;
            aVar = d.a.f2398w;
        }
        l0(view, aVar, i10);
    }

    private void L0(int i10) {
        ValueAnimator valueAnimator;
        if (i10 == 2) {
            return;
        }
        boolean z10 = i10 == 3;
        if (this.f20759y != z10) {
            this.f20759y = z10;
            if (this.f20743i == null || (valueAnimator = this.A) == null) {
                return;
            }
            if (valueAnimator.isRunning()) {
                this.A.reverse();
                return;
            }
            float f5 = z10 ? 0.0f : 1.0f;
            this.A.setFloatValues(1.0f - f5, f5);
            this.A.start();
        }
    }

    private void M0(boolean z10) {
        Map map;
        int iIntValue;
        WeakReference weakReference = this.T;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = ((View) weakReference.get()).getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z10) {
                if (this.f20733a0 != null) {
                    return;
                } else {
                    this.f20733a0 = new HashMap(childCount);
                }
            }
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = coordinatorLayout.getChildAt(i10);
                if (childAt != this.T.get()) {
                    if (z10) {
                        this.f20733a0.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                        if (this.f20736c) {
                            iIntValue = 4;
                            w.y0(childAt, iIntValue);
                        }
                    } else if (this.f20736c && (map = this.f20733a0) != null && map.containsKey(childAt)) {
                        iIntValue = ((Integer) this.f20733a0.get(childAt)).intValue();
                        w.y0(childAt, iIntValue);
                    }
                }
            }
            if (!z10) {
                this.f20733a0 = null;
            } else if (this.f20736c) {
                ((View) this.T.get()).sendAccessibilityEvent(8);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void N0(boolean z10) {
        View view;
        if (this.T != null) {
            W();
            if (this.K != 4 || (view = (View) this.T.get()) == null) {
                return;
            }
            if (z10) {
                B0(4);
            } else {
                view.requestLayout();
            }
        }
    }

    private int V(View view, int i10, int i11) {
        return w.c(view, view.getResources().getString(i10), Z(i11));
    }

    private void W() {
        int iY = Y();
        if (this.f20734b) {
            this.F = Math.max(this.S - iY, this.C);
        } else {
            this.F = this.S - iY;
        }
    }

    private void X() {
        this.D = (int) (this.S * (1.0f - this.E));
    }

    private int Y() {
        int i10;
        return this.f20740f ? Math.min(Math.max(this.f20741g, this.S - ((this.R * 9) / 16)), this.Q) + this.f20756v : (this.f20748n || this.f20749o || (i10 = this.f20747m) <= 0) ? this.f20739e + this.f20756v : Math.max(this.f20739e, i10 + this.f20742h);
    }

    private androidx.core.view.accessibility.g Z(int i10) {
        return new e(i10);
    }

    private void a0(Context context) {
        if (this.f20758x == null) {
            return;
        }
        s5.g gVar = new s5.g(this.f20758x);
        this.f20743i = gVar;
        gVar.L(context);
        ColorStateList colorStateList = this.f20744j;
        if (colorStateList != null) {
            this.f20743i.V(colorStateList);
            return;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.colorBackground, typedValue, true);
        this.f20743i.setTint(typedValue.data);
    }

    private void b0() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.A = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(500L);
        this.A.addUpdateListener(new b());
    }

    private int e0(int i10, int i11, int i12, int i13) {
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i10, i11, i13);
        if (i12 == -1) {
            return childMeasureSpec;
        }
        int mode = View.MeasureSpec.getMode(childMeasureSpec);
        int size = View.MeasureSpec.getSize(childMeasureSpec);
        if (mode == 1073741824) {
            return View.MeasureSpec.makeMeasureSpec(Math.min(size, i12), 1073741824);
        }
        if (size != 0) {
            i12 = Math.min(size, i12);
        }
        return View.MeasureSpec.makeMeasureSpec(i12, Integer.MIN_VALUE);
    }

    private int g0(int i10) {
        if (i10 == 3) {
            return f0();
        }
        if (i10 == 4) {
            return this.F;
        }
        if (i10 == 5) {
            return this.S;
        }
        if (i10 == 6) {
            return this.D;
        }
        throw new IllegalArgumentException("Invalid state to get top offset: " + i10);
    }

    private float h0() {
        VelocityTracker velocityTracker = this.W;
        if (velocityTracker == null) {
            return 0.0f;
        }
        velocityTracker.computeCurrentVelocity(AdError.NETWORK_ERROR_CODE, this.f20738d);
        return this.W.getYVelocity(this.X);
    }

    private boolean j0(View view) {
        ViewParent parent = view.getParent();
        return parent != null && parent.isLayoutRequested() && w.R(view);
    }

    private void l0(View view, d.a aVar, int i10) {
        w.k0(view, aVar, null, Z(i10));
    }

    private void m0() {
        this.X = -1;
        VelocityTracker velocityTracker = this.W;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.W = null;
        }
    }

    private void n0(f fVar) {
        int i10 = this.f20732a;
        if (i10 == 0) {
            return;
        }
        if (i10 == -1 || (i10 & 1) == 1) {
            this.f20739e = fVar.f20772p;
        }
        if (i10 == -1 || (i10 & 2) == 2) {
            this.f20734b = fVar.f20773q;
        }
        if (i10 == -1 || (i10 & 4) == 4) {
            this.H = fVar.f20774r;
        }
        if (i10 == -1 || (i10 & 8) == 8) {
            this.I = fVar.f20775s;
        }
    }

    private void o0(View view, Runnable runnable) {
        if (j0(view)) {
            view.post(runnable);
        } else {
            runnable.run();
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean A(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i10, int i11) {
        this.O = 0;
        this.P = false;
        return (i10 & 2) != 0;
    }

    public void A0(boolean z10) {
        this.I = z10;
    }

    public void B0(int i10) {
        if (i10 == 1 || i10 == 2) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("STATE_");
            sb2.append(i10 == 1 ? "DRAGGING" : "SETTLING");
            sb2.append(" should not be set externally.");
            throw new IllegalArgumentException(sb2.toString());
        }
        if (!this.H && i10 == 5) {
            Log.w("BottomSheetBehavior", "Cannot set state: " + i10);
            return;
        }
        int i11 = (i10 == 6 && this.f20734b && g0(i10) <= this.C) ? 3 : i10;
        WeakReference weakReference = this.T;
        if (weakReference == null || weakReference.get() == null) {
            C0(i10);
        } else {
            View view = (View) this.T.get();
            o0(view, new a(view, i11));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a9  */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void C(androidx.coordinatorlayout.widget.CoordinatorLayout r3, android.view.View r4, android.view.View r5, int r6) {
        /*
            r2 = this;
            int r3 = r4.getTop()
            int r6 = r2.f0()
            r0 = 3
            if (r3 != r6) goto Lf
            r2.C0(r0)
            return
        Lf:
            boolean r3 = r2.k0()
            if (r3 == 0) goto L24
            java.lang.ref.WeakReference r3 = r2.U
            if (r3 == 0) goto L23
            java.lang.Object r3 = r3.get()
            if (r5 != r3) goto L23
            boolean r3 = r2.P
            if (r3 != 0) goto L24
        L23:
            return
        L24:
            int r3 = r2.O
            r5 = 6
            r6 = 4
            if (r3 <= 0) goto L3a
            boolean r3 = r2.f20734b
            if (r3 == 0) goto L30
            goto Laa
        L30:
            int r3 = r4.getTop()
            int r6 = r2.D
            if (r3 <= r6) goto Laa
            goto La9
        L3a:
            boolean r3 = r2.H
            if (r3 == 0) goto L4a
            float r3 = r2.h0()
            boolean r3 = r2.G0(r4, r3)
            if (r3 == 0) goto L4a
            r0 = 5
            goto Laa
        L4a:
            int r3 = r2.O
            if (r3 != 0) goto L8e
            int r3 = r4.getTop()
            boolean r1 = r2.f20734b
            if (r1 == 0) goto L68
            int r5 = r2.C
            int r5 = r3 - r5
            int r5 = java.lang.Math.abs(r5)
            int r1 = r2.F
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r5 >= r3) goto L92
            goto Laa
        L68:
            int r1 = r2.D
            if (r3 >= r1) goto L7e
            int r1 = r2.F
            int r1 = r3 - r1
            int r1 = java.lang.Math.abs(r1)
            if (r3 >= r1) goto L77
            goto Laa
        L77:
            boolean r3 = r2.H0()
            if (r3 == 0) goto La9
            goto L92
        L7e:
            int r0 = r3 - r1
            int r0 = java.lang.Math.abs(r0)
            int r1 = r2.F
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r0 >= r3) goto L92
            goto La9
        L8e:
            boolean r3 = r2.f20734b
            if (r3 == 0) goto L94
        L92:
            r0 = r6
            goto Laa
        L94:
            int r3 = r4.getTop()
            int r0 = r2.D
            int r0 = r3 - r0
            int r0 = java.lang.Math.abs(r0)
            int r1 = r2.F
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r0 >= r3) goto L92
        La9:
            r0 = r5
        Laa:
            r3 = 0
            r2.J0(r4, r0, r3)
            r2.P = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.C(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.View, int):void");
    }

    void C0(int i10) {
        if (this.K == i10) {
            return;
        }
        this.K = i10;
        if (i10 == 4 || i10 == 3 || i10 == 6 || (this.H && i10 == 5)) {
            this.L = i10;
        }
        WeakReference weakReference = this.T;
        if (weakReference == null || ((View) weakReference.get()) == null) {
            return;
        }
        if (i10 == 3) {
            M0(true);
        } else if (i10 == 6 || i10 == 5 || i10 == 4) {
            M0(false);
        }
        L0(i10);
        if (this.V.size() <= 0) {
            K0();
        } else {
            a5.a.a(this.V.get(0));
            throw null;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean D(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.K == 1 && actionMasked == 0) {
            return true;
        }
        if (F0()) {
            this.M.z(motionEvent);
        }
        if (actionMasked == 0) {
            m0();
        }
        if (this.W == null) {
            this.W = VelocityTracker.obtain();
        }
        this.W.addMovement(motionEvent);
        if (F0() && actionMasked == 2 && !this.N && Math.abs(this.Y - motionEvent.getY()) > this.M.u()) {
            this.M.b(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
        return !this.N;
    }

    public boolean E0(long j10, float f5) {
        return false;
    }

    boolean G0(View view, float f5) {
        if (this.I) {
            return true;
        }
        if (view.getTop() < this.F) {
            return false;
        }
        return Math.abs((((float) view.getTop()) + (f5 * 0.1f)) - ((float) this.F)) / ((float) Y()) > 0.5f;
    }

    public boolean H0() {
        return false;
    }

    public boolean I0() {
        return true;
    }

    void c0(int i10) {
        if (((View) this.T.get()) == null || this.V.isEmpty()) {
            return;
        }
        int i11 = this.F;
        if (i10 <= i11 && i11 != f0()) {
            f0();
        }
        if (this.V.size() <= 0) {
            return;
        }
        a5.a.a(this.V.get(0));
        throw null;
    }

    View d0(View view) {
        if (w.T(view)) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View viewD0 = d0(viewGroup.getChildAt(i10));
            if (viewD0 != null) {
                return viewD0;
            }
        }
        return null;
    }

    public int f0() {
        if (this.f20734b) {
            return this.C;
        }
        return Math.max(this.B, this.f20752r ? 0 : this.f20757w);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void g(CoordinatorLayout.f fVar) {
        super.g(fVar);
        this.T = null;
        this.M = null;
    }

    public boolean i0() {
        return this.f20748n;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void j() {
        super.j();
        this.T = null;
        this.M = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        f0.c cVar;
        if (!view.isShown() || !this.J) {
            this.N = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            m0();
        }
        if (this.W == null) {
            this.W = VelocityTracker.obtain();
        }
        this.W.addMovement(motionEvent);
        if (actionMasked == 0) {
            int x10 = (int) motionEvent.getX();
            this.Y = (int) motionEvent.getY();
            if (this.K != 2) {
                WeakReference weakReference = this.U;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && coordinatorLayout.B(view2, x10, this.Y)) {
                    this.X = motionEvent.getPointerId(motionEvent.getActionIndex());
                    this.Z = true;
                }
            }
            this.N = this.X == -1 && !coordinatorLayout.B(view, x10, this.Y);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.Z = false;
            this.X = -1;
            if (this.N) {
                this.N = false;
                return false;
            }
        }
        if (!this.N && (cVar = this.M) != null && cVar.G(motionEvent)) {
            return true;
        }
        WeakReference weakReference2 = this.U;
        View view3 = weakReference2 != null ? (View) weakReference2.get() : null;
        return (actionMasked != 2 || view3 == null || this.N || this.K == 1 || coordinatorLayout.B(view3, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.M == null || Math.abs(((float) this.Y) - motionEvent.getY()) <= ((float) this.M.u())) ? false : true;
    }

    public boolean k0() {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x00f5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00f6  */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean l(androidx.coordinatorlayout.widget.CoordinatorLayout r7, android.view.View r8, int r9) {
        /*
            Method dump skipped, instructions count: 257
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.l(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, int):boolean");
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean m(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12, int i13) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(e0(i10, coordinatorLayout.getPaddingLeft() + coordinatorLayout.getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i11, this.f20745k, marginLayoutParams.width), e0(i12, coordinatorLayout.getPaddingTop() + coordinatorLayout.getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i13, this.f20746l, marginLayoutParams.height));
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean o(CoordinatorLayout coordinatorLayout, View view, View view2, float f5, float f10) {
        WeakReference weakReference;
        if (k0() && (weakReference = this.U) != null && view2 == weakReference.get()) {
            return this.K != 3 || super.o(coordinatorLayout, view, view2, f5, f10);
        }
        return false;
    }

    public void p0(boolean z10) {
        this.J = z10;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void q(CoordinatorLayout coordinatorLayout, View view, View view2, int i10, int i11, int[] iArr, int i12) {
        int i13;
        if (i12 == 1) {
            return;
        }
        WeakReference weakReference = this.U;
        View view3 = weakReference != null ? (View) weakReference.get() : null;
        if (!k0() || view2 == view3) {
            int top = view.getTop();
            int i14 = top - i11;
            if (i11 > 0) {
                if (i14 < f0()) {
                    iArr[1] = top - f0();
                    w.Z(view, -iArr[1]);
                    i13 = 3;
                    C0(i13);
                } else {
                    if (!this.J) {
                        return;
                    }
                    iArr[1] = i11;
                    w.Z(view, -i11);
                    C0(1);
                }
            } else if (i11 < 0 && !view2.canScrollVertically(-1)) {
                int i15 = this.F;
                if (i14 > i15 && !this.H) {
                    iArr[1] = top - i15;
                    w.Z(view, -iArr[1]);
                    i13 = 4;
                    C0(i13);
                } else {
                    if (!this.J) {
                        return;
                    }
                    iArr[1] = i11;
                    w.Z(view, -i11);
                    C0(1);
                }
            }
            c0(view.getTop());
            this.O = i11;
            this.P = true;
        }
    }

    public void q0(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("offset must be greater than or equal to 0");
        }
        this.B = i10;
    }

    public void r0(boolean z10) {
        if (this.f20734b == z10) {
            return;
        }
        this.f20734b = z10;
        if (this.T != null) {
            W();
        }
        C0((this.f20734b && this.K == 6) ? 3 : this.K);
        K0();
    }

    public void s0(boolean z10) {
        this.f20748n = z10;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void t(CoordinatorLayout coordinatorLayout, View view, View view2, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
    }

    public void t0(float f5) {
        if (f5 <= 0.0f || f5 >= 1.0f) {
            throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
        }
        this.E = f5;
        if (this.T != null) {
            X();
        }
    }

    public void u0(boolean z10) {
        if (this.H != z10) {
            this.H = z10;
            if (!z10 && this.K == 5) {
                B0(4);
            }
            K0();
        }
    }

    public void v0(int i10) {
        this.f20746l = i10;
    }

    public void w0(int i10) {
        this.f20745k = i10;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void x(CoordinatorLayout coordinatorLayout, View view, Parcelable parcelable) {
        f fVar = (f) parcelable;
        super.x(coordinatorLayout, view, fVar.a());
        n0(fVar);
        int i10 = fVar.f20771o;
        if (i10 == 1 || i10 == 2) {
            i10 = 4;
        }
        this.K = i10;
        this.L = i10;
    }

    public void x0(int i10) {
        y0(i10, false);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public Parcelable y(CoordinatorLayout coordinatorLayout, View view) {
        return new f(super.y(coordinatorLayout, view), this);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void y0(int r4, boolean r5) {
        /*
            r3 = this;
            r0 = 1
            r1 = 0
            r2 = -1
            if (r4 != r2) goto Lc
            boolean r4 = r3.f20740f
            if (r4 != 0) goto L15
            r3.f20740f = r0
            goto L1f
        Lc:
            boolean r2 = r3.f20740f
            if (r2 != 0) goto L17
            int r2 = r3.f20739e
            if (r2 == r4) goto L15
            goto L17
        L15:
            r0 = r1
            goto L1f
        L17:
            r3.f20740f = r1
            int r4 = java.lang.Math.max(r1, r4)
            r3.f20739e = r4
        L1f:
            if (r0 == 0) goto L24
            r3.N0(r5)
        L24:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.y0(int, boolean):void");
    }

    public void z0(int i10) {
        this.f20732a = i10;
    }
}
