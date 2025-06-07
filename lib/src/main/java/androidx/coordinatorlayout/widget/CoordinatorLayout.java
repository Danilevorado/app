package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import androidx.core.view.h0;
import androidx.core.view.o;
import androidx.core.view.p;
import androidx.core.view.q;
import androidx.core.view.r;
import androidx.core.view.w;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class CoordinatorLayout extends ViewGroup implements o, p {
    static final String G;
    static final Class[] H;
    static final ThreadLocal I;
    static final Comparator J;
    private static final androidx.core.util.e K;
    private h0 A;
    private boolean B;
    private Drawable C;
    ViewGroup.OnHierarchyChangeListener D;
    private r E;
    private final q F;

    /* renamed from: m, reason: collision with root package name */
    private final List f1979m;

    /* renamed from: n, reason: collision with root package name */
    private final androidx.coordinatorlayout.widget.a f1980n;

    /* renamed from: o, reason: collision with root package name */
    private final List f1981o;

    /* renamed from: p, reason: collision with root package name */
    private final List f1982p;

    /* renamed from: q, reason: collision with root package name */
    private Paint f1983q;

    /* renamed from: r, reason: collision with root package name */
    private final int[] f1984r;

    /* renamed from: s, reason: collision with root package name */
    private final int[] f1985s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f1986t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f1987u;

    /* renamed from: v, reason: collision with root package name */
    private int[] f1988v;

    /* renamed from: w, reason: collision with root package name */
    private View f1989w;

    /* renamed from: x, reason: collision with root package name */
    private View f1990x;

    /* renamed from: y, reason: collision with root package name */
    private g f1991y;

    /* renamed from: z, reason: collision with root package name */
    private boolean f1992z;

    class a implements r {
        a() {
        }

        @Override // androidx.core.view.r
        public h0 a(View view, h0 h0Var) {
            return CoordinatorLayout.this.W(h0Var);
        }
    }

    public interface b {
        c getBehavior();
    }

    public static abstract class c {
        public c() {
        }

        public c(Context context, AttributeSet attributeSet) {
        }

        public boolean A(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i10, int i11) {
            if (i11 == 0) {
                return z(coordinatorLayout, view, view2, view3, i10);
            }
            return false;
        }

        public void B(CoordinatorLayout coordinatorLayout, View view, View view2) {
        }

        public void C(CoordinatorLayout coordinatorLayout, View view, View view2, int i10) {
            if (i10 == 0) {
                B(coordinatorLayout, view, view2);
            }
        }

        public boolean D(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            return false;
        }

        public boolean a(CoordinatorLayout coordinatorLayout, View view) {
            return d(coordinatorLayout, view) > 0.0f;
        }

        public boolean b(CoordinatorLayout coordinatorLayout, View view, Rect rect) {
            return false;
        }

        public int c(CoordinatorLayout coordinatorLayout, View view) {
            return -16777216;
        }

        public float d(CoordinatorLayout coordinatorLayout, View view) {
            return 0.0f;
        }

        public boolean e(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return false;
        }

        public h0 f(CoordinatorLayout coordinatorLayout, View view, h0 h0Var) {
            return h0Var;
        }

        public void g(f fVar) {
        }

        public boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return false;
        }

        public void i(CoordinatorLayout coordinatorLayout, View view, View view2) {
        }

        public void j() {
        }

        public boolean k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            return false;
        }

        public boolean l(CoordinatorLayout coordinatorLayout, View view, int i10) {
            return false;
        }

        public boolean m(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12, int i13) {
            return false;
        }

        public boolean n(CoordinatorLayout coordinatorLayout, View view, View view2, float f5, float f10, boolean z10) {
            return false;
        }

        public boolean o(CoordinatorLayout coordinatorLayout, View view, View view2, float f5, float f10) {
            return false;
        }

        public void p(CoordinatorLayout coordinatorLayout, View view, View view2, int i10, int i11, int[] iArr) {
        }

        public void q(CoordinatorLayout coordinatorLayout, View view, View view2, int i10, int i11, int[] iArr, int i12) {
            if (i12 == 0) {
                p(coordinatorLayout, view, view2, i10, i11, iArr);
            }
        }

        public void r(CoordinatorLayout coordinatorLayout, View view, View view2, int i10, int i11, int i12, int i13) {
        }

        public void s(CoordinatorLayout coordinatorLayout, View view, View view2, int i10, int i11, int i12, int i13, int i14) {
            if (i14 == 0) {
                r(coordinatorLayout, view, view2, i10, i11, i12, i13);
            }
        }

        public void t(CoordinatorLayout coordinatorLayout, View view, View view2, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
            iArr[0] = iArr[0] + i12;
            iArr[1] = iArr[1] + i13;
            s(coordinatorLayout, view, view2, i10, i11, i12, i13, i14);
        }

        public void u(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i10) {
        }

        public void v(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i10, int i11) {
            if (i11 == 0) {
                u(coordinatorLayout, view, view2, view3, i10);
            }
        }

        public boolean w(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z10) {
            return false;
        }

        public void x(CoordinatorLayout coordinatorLayout, View view, Parcelable parcelable) {
        }

        public Parcelable y(CoordinatorLayout coordinatorLayout, View view) {
            return View.BaseSavedState.EMPTY_STATE;
        }

        public boolean z(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i10) {
            return false;
        }
    }

    @Retention(RetentionPolicy.RUNTIME)
    public @interface d {
        Class value();
    }

    private class e implements ViewGroup.OnHierarchyChangeListener {
        e() {
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewAdded(View view, View view2) {
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.D;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewRemoved(View view, View view2) {
            CoordinatorLayout.this.H(2);
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.D;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }

    public static class f extends ViewGroup.MarginLayoutParams {

        /* renamed from: a, reason: collision with root package name */
        c f1995a;

        /* renamed from: b, reason: collision with root package name */
        boolean f1996b;

        /* renamed from: c, reason: collision with root package name */
        public int f1997c;

        /* renamed from: d, reason: collision with root package name */
        public int f1998d;

        /* renamed from: e, reason: collision with root package name */
        public int f1999e;

        /* renamed from: f, reason: collision with root package name */
        int f2000f;

        /* renamed from: g, reason: collision with root package name */
        public int f2001g;

        /* renamed from: h, reason: collision with root package name */
        public int f2002h;

        /* renamed from: i, reason: collision with root package name */
        int f2003i;

        /* renamed from: j, reason: collision with root package name */
        int f2004j;

        /* renamed from: k, reason: collision with root package name */
        View f2005k;

        /* renamed from: l, reason: collision with root package name */
        View f2006l;

        /* renamed from: m, reason: collision with root package name */
        private boolean f2007m;

        /* renamed from: n, reason: collision with root package name */
        private boolean f2008n;

        /* renamed from: o, reason: collision with root package name */
        private boolean f2009o;

        /* renamed from: p, reason: collision with root package name */
        private boolean f2010p;

        /* renamed from: q, reason: collision with root package name */
        final Rect f2011q;

        /* renamed from: r, reason: collision with root package name */
        Object f2012r;

        public f(int i10, int i11) {
            super(i10, i11);
            this.f1996b = false;
            this.f1997c = 0;
            this.f1998d = 0;
            this.f1999e = -1;
            this.f2000f = -1;
            this.f2001g = 0;
            this.f2002h = 0;
            this.f2011q = new Rect();
        }

        f(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f1996b = false;
            this.f1997c = 0;
            this.f1998d = 0;
            this.f1999e = -1;
            this.f2000f = -1;
            this.f2001g = 0;
            this.f2002h = 0;
            this.f2011q = new Rect();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, x.c.f28117e);
            this.f1997c = typedArrayObtainStyledAttributes.getInteger(x.c.f28118f, 0);
            this.f2000f = typedArrayObtainStyledAttributes.getResourceId(x.c.f28119g, -1);
            this.f1998d = typedArrayObtainStyledAttributes.getInteger(x.c.f28120h, 0);
            this.f1999e = typedArrayObtainStyledAttributes.getInteger(x.c.f28124l, -1);
            this.f2001g = typedArrayObtainStyledAttributes.getInt(x.c.f28123k, 0);
            this.f2002h = typedArrayObtainStyledAttributes.getInt(x.c.f28122j, 0);
            int i10 = x.c.f28121i;
            boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(i10);
            this.f1996b = zHasValue;
            if (zHasValue) {
                this.f1995a = CoordinatorLayout.K(context, attributeSet, typedArrayObtainStyledAttributes.getString(i10));
            }
            typedArrayObtainStyledAttributes.recycle();
            c cVar = this.f1995a;
            if (cVar != null) {
                cVar.g(this);
            }
        }

        public f(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f1996b = false;
            this.f1997c = 0;
            this.f1998d = 0;
            this.f1999e = -1;
            this.f2000f = -1;
            this.f2001g = 0;
            this.f2002h = 0;
            this.f2011q = new Rect();
        }

        public f(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f1996b = false;
            this.f1997c = 0;
            this.f1998d = 0;
            this.f1999e = -1;
            this.f2000f = -1;
            this.f2001g = 0;
            this.f2002h = 0;
            this.f2011q = new Rect();
        }

        public f(f fVar) {
            super((ViewGroup.MarginLayoutParams) fVar);
            this.f1996b = false;
            this.f1997c = 0;
            this.f1998d = 0;
            this.f1999e = -1;
            this.f2000f = -1;
            this.f2001g = 0;
            this.f2002h = 0;
            this.f2011q = new Rect();
        }

        private void m(View view, CoordinatorLayout coordinatorLayout) {
            View viewFindViewById = coordinatorLayout.findViewById(this.f2000f);
            this.f2005k = viewFindViewById;
            if (viewFindViewById != null) {
                if (viewFindViewById != coordinatorLayout) {
                    for (ViewParent parent = viewFindViewById.getParent(); parent != coordinatorLayout && parent != null; parent = parent.getParent()) {
                        if (parent != view) {
                            if (parent instanceof View) {
                                viewFindViewById = parent;
                            }
                        } else if (!coordinatorLayout.isInEditMode()) {
                            throw new IllegalStateException("Anchor must not be a descendant of the anchored view");
                        }
                    }
                    this.f2006l = viewFindViewById;
                    return;
                }
                if (!coordinatorLayout.isInEditMode()) {
                    throw new IllegalStateException("View can not be anchored to the the parent CoordinatorLayout");
                }
            } else if (!coordinatorLayout.isInEditMode()) {
                throw new IllegalStateException("Could not find CoordinatorLayout descendant view with id " + coordinatorLayout.getResources().getResourceName(this.f2000f) + " to anchor view " + view);
            }
            this.f2006l = null;
            this.f2005k = null;
        }

        private boolean r(View view, int i10) {
            int iB = androidx.core.view.e.b(((f) view.getLayoutParams()).f2001g, i10);
            return iB != 0 && (androidx.core.view.e.b(this.f2002h, i10) & iB) == iB;
        }

        private boolean s(View view, CoordinatorLayout coordinatorLayout) {
            if (this.f2005k.getId() != this.f2000f) {
                return false;
            }
            View view2 = this.f2005k;
            for (ViewParent parent = view2.getParent(); parent != coordinatorLayout; parent = parent.getParent()) {
                if (parent == null || parent == view) {
                    this.f2006l = null;
                    this.f2005k = null;
                    return false;
                }
                if (parent instanceof View) {
                    view2 = parent;
                }
            }
            this.f2006l = view2;
            return true;
        }

        boolean a() {
            return this.f2005k == null && this.f2000f != -1;
        }

        boolean b(CoordinatorLayout coordinatorLayout, View view, View view2) {
            c cVar;
            return view2 == this.f2006l || r(view2, w.B(coordinatorLayout)) || ((cVar = this.f1995a) != null && cVar.e(coordinatorLayout, view, view2));
        }

        boolean c() {
            if (this.f1995a == null) {
                this.f2007m = false;
            }
            return this.f2007m;
        }

        View d(CoordinatorLayout coordinatorLayout, View view) {
            if (this.f2000f == -1) {
                this.f2006l = null;
                this.f2005k = null;
                return null;
            }
            if (this.f2005k == null || !s(view, coordinatorLayout)) {
                m(view, coordinatorLayout);
            }
            return this.f2005k;
        }

        public c e() {
            return this.f1995a;
        }

        boolean f() {
            return this.f2010p;
        }

        Rect g() {
            return this.f2011q;
        }

        boolean h(CoordinatorLayout coordinatorLayout, View view) {
            boolean z10 = this.f2007m;
            if (z10) {
                return true;
            }
            c cVar = this.f1995a;
            boolean zA = (cVar != null ? cVar.a(coordinatorLayout, view) : false) | z10;
            this.f2007m = zA;
            return zA;
        }

        boolean i(int i10) {
            if (i10 == 0) {
                return this.f2008n;
            }
            if (i10 != 1) {
                return false;
            }
            return this.f2009o;
        }

        void j() {
            this.f2010p = false;
        }

        void k(int i10) {
            q(i10, false);
        }

        void l() {
            this.f2007m = false;
        }

        public void n(c cVar) {
            c cVar2 = this.f1995a;
            if (cVar2 != cVar) {
                if (cVar2 != null) {
                    cVar2.j();
                }
                this.f1995a = cVar;
                this.f2012r = null;
                this.f1996b = true;
                if (cVar != null) {
                    cVar.g(this);
                }
            }
        }

        void o(boolean z10) {
            this.f2010p = z10;
        }

        void p(Rect rect) {
            this.f2011q.set(rect);
        }

        void q(int i10, boolean z10) {
            if (i10 == 0) {
                this.f2008n = z10;
            } else {
                if (i10 != 1) {
                    return;
                }
                this.f2009o = z10;
            }
        }
    }

    class g implements ViewTreeObserver.OnPreDrawListener {
        g() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            CoordinatorLayout.this.H(0);
            return true;
        }
    }

    protected static class h extends e0.a {
        public static final Parcelable.Creator<h> CREATOR = new a();

        /* renamed from: o, reason: collision with root package name */
        SparseArray f2014o;

        static class a implements Parcelable.ClassLoaderCreator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public h createFromParcel(Parcel parcel) {
                return new h(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public h createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new h(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public h[] newArray(int i10) {
                return new h[i10];
            }
        }

        public h(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            int i10 = parcel.readInt();
            int[] iArr = new int[i10];
            parcel.readIntArray(iArr);
            Parcelable[] parcelableArray = parcel.readParcelableArray(classLoader);
            this.f2014o = new SparseArray(i10);
            for (int i11 = 0; i11 < i10; i11++) {
                this.f2014o.append(iArr[i11], parcelableArray[i11]);
            }
        }

        public h(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // e0.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            SparseArray sparseArray = this.f2014o;
            int size = sparseArray != null ? sparseArray.size() : 0;
            parcel.writeInt(size);
            int[] iArr = new int[size];
            Parcelable[] parcelableArr = new Parcelable[size];
            for (int i11 = 0; i11 < size; i11++) {
                iArr[i11] = this.f2014o.keyAt(i11);
                parcelableArr[i11] = (Parcelable) this.f2014o.valueAt(i11);
            }
            parcel.writeIntArray(iArr);
            parcel.writeParcelableArray(parcelableArr, i10);
        }
    }

    static class i implements Comparator {
        i() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(View view, View view2) {
            float fL = w.L(view);
            float fL2 = w.L(view2);
            if (fL > fL2) {
                return -1;
            }
            return fL < fL2 ? 1 : 0;
        }
    }

    static {
        Package r02 = CoordinatorLayout.class.getPackage();
        G = r02 != null ? r02.getName() : null;
        J = new i();
        H = new Class[]{Context.class, AttributeSet.class};
        I = new ThreadLocal();
        K = new androidx.core.util.g(12);
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, x.a.f28111a);
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f1979m = new ArrayList();
        this.f1980n = new androidx.coordinatorlayout.widget.a();
        this.f1981o = new ArrayList();
        this.f1982p = new ArrayList();
        this.f1984r = new int[2];
        this.f1985s = new int[2];
        this.F = new q(this);
        int[] iArr = x.c.f28114b;
        TypedArray typedArrayObtainStyledAttributes = i10 == 0 ? context.obtainStyledAttributes(attributeSet, iArr, 0, x.b.f28112a) : context.obtainStyledAttributes(attributeSet, iArr, i10, 0);
        if (Build.VERSION.SDK_INT >= 29) {
            int[] iArr2 = x.c.f28114b;
            if (i10 == 0) {
                saveAttributeDataForStyleable(context, iArr2, attributeSet, typedArrayObtainStyledAttributes, 0, x.b.f28112a);
            } else {
                saveAttributeDataForStyleable(context, iArr2, attributeSet, typedArrayObtainStyledAttributes, i10, 0);
            }
        }
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(x.c.f28115c, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            this.f1988v = resources.getIntArray(resourceId);
            float f5 = resources.getDisplayMetrics().density;
            int length = this.f1988v.length;
            for (int i11 = 0; i11 < length; i11++) {
                this.f1988v[i11] = (int) (r12[i11] * f5);
            }
        }
        this.C = typedArrayObtainStyledAttributes.getDrawable(x.c.f28116d);
        typedArrayObtainStyledAttributes.recycle();
        X();
        super.setOnHierarchyChangeListener(new e());
        if (w.z(this) == 0) {
            w.y0(this, 1);
        }
    }

    private boolean A(View view) {
        return this.f1980n.j(view);
    }

    private void C(View view, int i10) {
        f fVar = (f) view.getLayoutParams();
        Rect rectA = a();
        rectA.set(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams) fVar).topMargin, (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin, (getHeight() - getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin);
        if (this.A != null && w.y(this) && !w.y(view)) {
            rectA.left += this.A.i();
            rectA.top += this.A.k();
            rectA.right -= this.A.j();
            rectA.bottom -= this.A.h();
        }
        Rect rectA2 = a();
        androidx.core.view.e.a(S(fVar.f1997c), view.getMeasuredWidth(), view.getMeasuredHeight(), rectA, rectA2, i10);
        view.layout(rectA2.left, rectA2.top, rectA2.right, rectA2.bottom);
        O(rectA);
        O(rectA2);
    }

    private void D(View view, View view2, int i10) {
        Rect rectA = a();
        Rect rectA2 = a();
        try {
            t(view2, rectA);
            u(view, i10, rectA, rectA2);
            view.layout(rectA2.left, rectA2.top, rectA2.right, rectA2.bottom);
        } finally {
            O(rectA);
            O(rectA2);
        }
    }

    private void E(View view, int i10, int i11) {
        f fVar = (f) view.getLayoutParams();
        int iB = androidx.core.view.e.b(T(fVar.f1997c), i11);
        int i12 = iB & 7;
        int i13 = iB & 112;
        int width = getWidth();
        int height = getHeight();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        if (i11 == 1) {
            i10 = width - i10;
        }
        int iW = w(i10) - measuredWidth;
        int i14 = 0;
        if (i12 == 1) {
            iW += measuredWidth / 2;
        } else if (i12 == 5) {
            iW += measuredWidth;
        }
        if (i13 == 16) {
            i14 = 0 + (measuredHeight / 2);
        } else if (i13 == 80) {
            i14 = measuredHeight + 0;
        }
        int iMax = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin, Math.min(iW, ((width - getPaddingRight()) - measuredWidth) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin));
        int iMax2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) fVar).topMargin, Math.min(i14, ((height - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin));
        view.layout(iMax, iMax2, measuredWidth + iMax, measuredHeight + iMax2);
    }

    private void F(View view, Rect rect, int i10) {
        boolean z10;
        boolean z11;
        int width;
        int i11;
        int i12;
        int i13;
        int height;
        int i14;
        int i15;
        int i16;
        if (w.S(view) && view.getWidth() > 0 && view.getHeight() > 0) {
            f fVar = (f) view.getLayoutParams();
            c cVarE = fVar.e();
            Rect rectA = a();
            Rect rectA2 = a();
            rectA2.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            if (cVarE == null || !cVarE.b(this, view, rectA)) {
                rectA.set(rectA2);
            } else if (!rectA2.contains(rectA)) {
                throw new IllegalArgumentException("Rect should be within the child's bounds. Rect:" + rectA.toShortString() + " | Bounds:" + rectA2.toShortString());
            }
            O(rectA2);
            if (rectA.isEmpty()) {
                O(rectA);
                return;
            }
            int iB = androidx.core.view.e.b(fVar.f2002h, i10);
            boolean z12 = true;
            if ((iB & 48) != 48 || (i15 = (rectA.top - ((ViewGroup.MarginLayoutParams) fVar).topMargin) - fVar.f2004j) >= (i16 = rect.top)) {
                z10 = false;
            } else {
                V(view, i16 - i15);
                z10 = true;
            }
            if ((iB & 80) == 80 && (height = ((getHeight() - rectA.bottom) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin) + fVar.f2004j) < (i14 = rect.bottom)) {
                V(view, height - i14);
                z10 = true;
            }
            if (!z10) {
                V(view, 0);
            }
            if ((iB & 3) != 3 || (i12 = (rectA.left - ((ViewGroup.MarginLayoutParams) fVar).leftMargin) - fVar.f2003i) >= (i13 = rect.left)) {
                z11 = false;
            } else {
                U(view, i13 - i12);
                z11 = true;
            }
            if ((iB & 5) != 5 || (width = ((getWidth() - rectA.right) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin) + fVar.f2003i) >= (i11 = rect.right)) {
                z12 = z11;
            } else {
                U(view, width - i11);
            }
            if (!z12) {
                U(view, 0);
            }
            O(rectA);
        }
    }

    static c K(Context context, AttributeSet attributeSet, String str) throws NoSuchMethodException, SecurityException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.startsWith(".")) {
            str = context.getPackageName() + str;
        } else if (str.indexOf(46) < 0) {
            String str2 = G;
            if (!TextUtils.isEmpty(str2)) {
                str = str2 + '.' + str;
            }
        }
        try {
            ThreadLocal threadLocal = I;
            Map map = (Map) threadLocal.get();
            if (map == null) {
                map = new HashMap();
                threadLocal.set(map);
            }
            Constructor<?> constructor = (Constructor) map.get(str);
            if (constructor == null) {
                constructor = Class.forName(str, false, context.getClassLoader()).getConstructor(H);
                constructor.setAccessible(true);
                map.put(str, constructor);
            }
            return (c) constructor.newInstance(context, attributeSet);
        } catch (Exception e5) {
            throw new RuntimeException("Could not inflate Behavior subclass " + str, e5);
        }
    }

    private boolean L(MotionEvent motionEvent, int i10) {
        int actionMasked = motionEvent.getActionMasked();
        List list = this.f1981o;
        z(list);
        int size = list.size();
        MotionEvent motionEventObtain = null;
        boolean zK = false;
        boolean z10 = false;
        for (int i11 = 0; i11 < size; i11++) {
            View view = (View) list.get(i11);
            f fVar = (f) view.getLayoutParams();
            c cVarE = fVar.e();
            if (!(zK || z10) || actionMasked == 0) {
                if (!zK && cVarE != null) {
                    if (i10 == 0) {
                        zK = cVarE.k(this, view, motionEvent);
                    } else if (i10 == 1) {
                        zK = cVarE.D(this, view, motionEvent);
                    }
                    if (zK) {
                        this.f1989w = view;
                    }
                }
                boolean zC = fVar.c();
                boolean zH = fVar.h(this, view);
                z10 = zH && !zC;
                if (zH && !z10) {
                    break;
                }
            } else if (cVarE != null) {
                if (motionEventObtain == null) {
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                }
                if (i10 == 0) {
                    cVarE.k(this, view, motionEventObtain);
                } else if (i10 == 1) {
                    cVarE.D(this, view, motionEventObtain);
                }
            }
        }
        list.clear();
        return zK;
    }

    private void M() {
        this.f1979m.clear();
        this.f1980n.c();
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            f fVarY = y(childAt);
            fVarY.d(this, childAt);
            this.f1980n.b(childAt);
            for (int i11 = 0; i11 < childCount; i11++) {
                if (i11 != i10) {
                    View childAt2 = getChildAt(i11);
                    if (fVarY.b(this, childAt, childAt2)) {
                        if (!this.f1980n.d(childAt2)) {
                            this.f1980n.b(childAt2);
                        }
                        this.f1980n.a(childAt2, childAt);
                    }
                }
            }
        }
        this.f1979m.addAll(this.f1980n.i());
        Collections.reverse(this.f1979m);
    }

    private static void O(Rect rect) {
        rect.setEmpty();
        K.a(rect);
    }

    private void Q(boolean z10) {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            c cVarE = ((f) childAt.getLayoutParams()).e();
            if (cVarE != null) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z10) {
                    cVarE.k(this, childAt, motionEventObtain);
                } else {
                    cVarE.D(this, childAt, motionEventObtain);
                }
                motionEventObtain.recycle();
            }
        }
        for (int i11 = 0; i11 < childCount; i11++) {
            ((f) getChildAt(i11).getLayoutParams()).l();
        }
        this.f1989w = null;
        this.f1986t = false;
    }

    private static int R(int i10) {
        if (i10 == 0) {
            return 17;
        }
        return i10;
    }

    private static int S(int i10) {
        if ((i10 & 7) == 0) {
            i10 |= 8388611;
        }
        return (i10 & 112) == 0 ? i10 | 48 : i10;
    }

    private static int T(int i10) {
        if (i10 == 0) {
            return 8388661;
        }
        return i10;
    }

    private void U(View view, int i10) {
        f fVar = (f) view.getLayoutParams();
        int i11 = fVar.f2003i;
        if (i11 != i10) {
            w.Y(view, i10 - i11);
            fVar.f2003i = i10;
        }
    }

    private void V(View view, int i10) {
        f fVar = (f) view.getLayoutParams();
        int i11 = fVar.f2004j;
        if (i11 != i10) {
            w.Z(view, i10 - i11);
            fVar.f2004j = i10;
        }
    }

    private void X() {
        if (!w.y(this)) {
            w.A0(this, null);
            return;
        }
        if (this.E == null) {
            this.E = new a();
        }
        w.A0(this, this.E);
        setSystemUiVisibility(1280);
    }

    private static Rect a() {
        Rect rect = (Rect) K.b();
        return rect == null ? new Rect() : rect;
    }

    private static int c(int i10, int i11, int i12) {
        return i10 < i11 ? i11 : i10 > i12 ? i12 : i10;
    }

    private void d(f fVar, Rect rect, int i10, int i11) {
        int width = getWidth();
        int height = getHeight();
        int iMax = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i10) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin));
        int iMax2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) fVar).topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i11) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin));
        rect.set(iMax, iMax2, i10 + iMax, i11 + iMax2);
    }

    private h0 e(h0 h0Var) {
        c cVarE;
        if (h0Var.n()) {
            return h0Var;
        }
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (w.y(childAt) && (cVarE = ((f) childAt.getLayoutParams()).e()) != null) {
                h0Var = cVarE.f(this, childAt, h0Var);
                if (h0Var.n()) {
                    break;
                }
            }
        }
        return h0Var;
    }

    private void v(View view, int i10, Rect rect, Rect rect2, f fVar, int i11, int i12) {
        int iB = androidx.core.view.e.b(R(fVar.f1997c), i10);
        int iB2 = androidx.core.view.e.b(S(fVar.f1998d), i10);
        int i13 = iB & 7;
        int i14 = iB & 112;
        int i15 = iB2 & 7;
        int i16 = iB2 & 112;
        int iWidth = i15 != 1 ? i15 != 5 ? rect.left : rect.right : rect.left + (rect.width() / 2);
        int iHeight = i16 != 16 ? i16 != 80 ? rect.top : rect.bottom : rect.top + (rect.height() / 2);
        if (i13 == 1) {
            iWidth -= i11 / 2;
        } else if (i13 != 5) {
            iWidth -= i11;
        }
        if (i14 == 16) {
            iHeight -= i12 / 2;
        } else if (i14 != 80) {
            iHeight -= i12;
        }
        rect2.set(iWidth, iHeight, i11 + iWidth, i12 + iHeight);
    }

    private int w(int i10) {
        StringBuilder sb2;
        int[] iArr = this.f1988v;
        if (iArr == null) {
            sb2 = new StringBuilder();
            sb2.append("No keylines defined for ");
            sb2.append(this);
            sb2.append(" - attempted index lookup ");
            sb2.append(i10);
        } else {
            if (i10 >= 0 && i10 < iArr.length) {
                return iArr[i10];
            }
            sb2 = new StringBuilder();
            sb2.append("Keyline index ");
            sb2.append(i10);
            sb2.append(" out of range for ");
            sb2.append(this);
        }
        Log.e("CoordinatorLayout", sb2.toString());
        return 0;
    }

    private void z(List list) {
        list.clear();
        boolean zIsChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i10 = childCount - 1; i10 >= 0; i10--) {
            list.add(getChildAt(zIsChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i10) : i10));
        }
        Comparator comparator = J;
        if (comparator != null) {
            Collections.sort(list, comparator);
        }
    }

    public boolean B(View view, int i10, int i11) {
        Rect rectA = a();
        t(view, rectA);
        try {
            return rectA.contains(i10, i11);
        } finally {
            O(rectA);
        }
    }

    void G(View view, int i10) {
        c cVarE;
        f fVar = (f) view.getLayoutParams();
        if (fVar.f2005k != null) {
            Rect rectA = a();
            Rect rectA2 = a();
            Rect rectA3 = a();
            t(fVar.f2005k, rectA);
            q(view, false, rectA2);
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            v(view, i10, rectA, rectA3, fVar, measuredWidth, measuredHeight);
            boolean z10 = (rectA3.left == rectA2.left && rectA3.top == rectA2.top) ? false : true;
            d(fVar, rectA3, measuredWidth, measuredHeight);
            int i11 = rectA3.left - rectA2.left;
            int i12 = rectA3.top - rectA2.top;
            if (i11 != 0) {
                w.Y(view, i11);
            }
            if (i12 != 0) {
                w.Z(view, i12);
            }
            if (z10 && (cVarE = fVar.e()) != null) {
                cVarE.h(this, view, fVar.f2005k);
            }
            O(rectA);
            O(rectA2);
            O(rectA3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00ca  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final void H(int r18) {
        /*
            Method dump skipped, instructions count: 273
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.H(int):void");
    }

    public void I(View view, int i10) {
        f fVar = (f) view.getLayoutParams();
        if (fVar.a()) {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        }
        View view2 = fVar.f2005k;
        if (view2 != null) {
            D(view, view2, i10);
            return;
        }
        int i11 = fVar.f1999e;
        if (i11 >= 0) {
            E(view, i11, i10);
        } else {
            C(view, i10);
        }
    }

    public void J(View view, int i10, int i11, int i12, int i13) {
        measureChildWithMargins(view, i10, i11, i12, i13);
    }

    void N(View view, Rect rect) {
        ((f) view.getLayoutParams()).p(rect);
    }

    void P() {
        if (this.f1987u && this.f1991y != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f1991y);
        }
        this.f1992z = false;
    }

    final h0 W(h0 h0Var) {
        if (androidx.core.util.c.a(this.A, h0Var)) {
            return h0Var;
        }
        this.A = h0Var;
        boolean z10 = h0Var != null && h0Var.k() > 0;
        this.B = z10;
        setWillNotDraw(!z10 && getBackground() == null);
        h0 h0VarE = e(h0Var);
        requestLayout();
        return h0VarE;
    }

    void b() {
        if (this.f1987u) {
            if (this.f1991y == null) {
                this.f1991y = new g();
            }
            getViewTreeObserver().addOnPreDrawListener(this.f1991y);
        }
        this.f1992z = true;
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof f) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.ViewGroup
    protected boolean drawChild(Canvas canvas, View view, long j10) {
        f fVar = (f) view.getLayoutParams();
        c cVar = fVar.f1995a;
        if (cVar != null) {
            float fD = cVar.d(this, view);
            if (fD > 0.0f) {
                if (this.f1983q == null) {
                    this.f1983q = new Paint();
                }
                this.f1983q.setColor(fVar.f1995a.c(this, view));
                this.f1983q.setAlpha(c(Math.round(fD * 255.0f), 0, 255));
                int iSave = canvas.save();
                if (view.isOpaque()) {
                    canvas.clipRect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), Region.Op.DIFFERENCE);
                }
                canvas.drawRect(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom(), this.f1983q);
                canvas.restoreToCount(iSave);
            }
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.C;
        boolean state = false;
        if (drawable != null && drawable.isStateful()) {
            state = false | drawable.setState(drawableState);
        }
        if (state) {
            invalidate();
        }
    }

    public void f(View view) {
        List listG = this.f1980n.g(view);
        if (listG == null || listG.isEmpty()) {
            return;
        }
        for (int i10 = 0; i10 < listG.size(); i10++) {
            View view2 = (View) listG.get(i10);
            c cVarE = ((f) view2.getLayoutParams()).e();
            if (cVarE != null) {
                cVarE.h(this, view2, view);
            }
        }
    }

    void g() {
        int childCount = getChildCount();
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            if (i10 >= childCount) {
                break;
            }
            if (A(getChildAt(i10))) {
                z10 = true;
                break;
            }
            i10++;
        }
        if (z10 != this.f1992z) {
            if (z10) {
                b();
            } else {
                P();
            }
        }
    }

    final List<View> getDependencySortedChildren() {
        M();
        return Collections.unmodifiableList(this.f1979m);
    }

    public final h0 getLastWindowInsets() {
        return this.A;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.F.a();
    }

    public Drawable getStatusBarBackground() {
        return this.C;
    }

    @Override // android.view.View
    protected int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingTop() + getPaddingBottom());
    }

    @Override // android.view.View
    protected int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingLeft() + getPaddingRight());
    }

    @Override // androidx.core.view.o
    public void h(View view, View view2, int i10, int i11) {
        c cVarE;
        this.F.c(view, view2, i10, i11);
        this.f1990x = view2;
        int childCount = getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            f fVar = (f) childAt.getLayoutParams();
            if (fVar.i(i11) && (cVarE = fVar.e()) != null) {
                cVarE.v(this, childAt, view, view2, i10, i11);
            }
        }
    }

    @Override // androidx.core.view.o
    public void i(View view, int i10) {
        this.F.e(view, i10);
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            f fVar = (f) childAt.getLayoutParams();
            if (fVar.i(i10)) {
                c cVarE = fVar.e();
                if (cVarE != null) {
                    cVarE.C(this, childAt, view, i10);
                }
                fVar.k(i10);
                fVar.j();
            }
        }
        this.f1990x = null;
    }

    @Override // androidx.core.view.o
    public void j(View view, int i10, int i11, int[] iArr, int i12) {
        c cVarE;
        int childCount = getChildCount();
        boolean z10 = false;
        int iMax = 0;
        int iMax2 = 0;
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.i(i12) && (cVarE = fVar.e()) != null) {
                    int[] iArr2 = this.f1984r;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    cVarE.q(this, childAt, view, i10, i11, iArr2, i12);
                    int[] iArr3 = this.f1984r;
                    iMax = i10 > 0 ? Math.max(iMax, iArr3[0]) : Math.min(iMax, iArr3[0]);
                    int[] iArr4 = this.f1984r;
                    iMax2 = i11 > 0 ? Math.max(iMax2, iArr4[1]) : Math.min(iMax2, iArr4[1]);
                    z10 = true;
                }
            }
        }
        iArr[0] = iMax;
        iArr[1] = iMax2;
        if (z10) {
            H(1);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public f generateDefaultLayoutParams() {
        return new f(-2, -2);
    }

    @Override // android.view.ViewGroup
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public f generateLayoutParams(AttributeSet attributeSet) {
        return new f(getContext(), attributeSet);
    }

    @Override // androidx.core.view.p
    public void m(View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        c cVarE;
        boolean z10;
        int iMin;
        int childCount = getChildCount();
        boolean z11 = false;
        int iMax = 0;
        int i15 = 0;
        for (int i16 = 0; i16 < childCount; i16++) {
            View childAt = getChildAt(i16);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.i(i14) && (cVarE = fVar.e()) != null) {
                    int[] iArr2 = this.f1984r;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    cVarE.t(this, childAt, view, i10, i11, i12, i13, i14, iArr2);
                    int[] iArr3 = this.f1984r;
                    iMax = i12 > 0 ? Math.max(iMax, iArr3[0]) : Math.min(iMax, iArr3[0]);
                    if (i13 > 0) {
                        z10 = true;
                        iMin = Math.max(i15, this.f1984r[1]);
                    } else {
                        z10 = true;
                        iMin = Math.min(i15, this.f1984r[1]);
                    }
                    i15 = iMin;
                    z11 = z10;
                }
            }
        }
        iArr[0] = iArr[0] + iMax;
        iArr[1] = iArr[1] + i15;
        if (z11) {
            H(1);
        }
    }

    @Override // androidx.core.view.o
    public void n(View view, int i10, int i11, int i12, int i13, int i14) {
        m(view, i10, i11, i12, i13, 0, this.f1985s);
    }

    @Override // androidx.core.view.o
    public boolean o(View view, View view2, int i10, int i11) {
        int childCount = getChildCount();
        boolean z10 = false;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                c cVarE = fVar.e();
                if (cVarE != null) {
                    boolean zA = cVarE.A(this, childAt, view, view2, i10, i11);
                    z10 |= zA;
                    fVar.q(i11, zA);
                } else {
                    fVar.q(i11, false);
                }
            }
        }
        return z10;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Q(false);
        if (this.f1992z) {
            if (this.f1991y == null) {
                this.f1991y = new g();
            }
            getViewTreeObserver().addOnPreDrawListener(this.f1991y);
        }
        if (this.A == null && w.y(this)) {
            w.l0(this);
        }
        this.f1987u = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Q(false);
        if (this.f1992z && this.f1991y != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f1991y);
        }
        View view = this.f1990x;
        if (view != null) {
            onStopNestedScroll(view);
        }
        this.f1987u = false;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.B || this.C == null) {
            return;
        }
        h0 h0Var = this.A;
        int iK = h0Var != null ? h0Var.k() : 0;
        if (iK > 0) {
            this.C.setBounds(0, 0, getWidth(), iK);
            this.C.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            Q(true);
        }
        boolean zL = L(motionEvent, 0);
        if (actionMasked == 1 || actionMasked == 3) {
            Q(true);
        }
        return zL;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        c cVarE;
        int iB = w.B(this);
        int size = this.f1979m.size();
        for (int i14 = 0; i14 < size; i14++) {
            View view = (View) this.f1979m.get(i14);
            if (view.getVisibility() != 8 && ((cVarE = ((f) view.getLayoutParams()).e()) == null || !cVarE.l(this, view, iB))) {
                I(view, iB);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x011d  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void onMeasure(int r31, int r32) {
        /*
            Method dump skipped, instructions count: 391
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f5, float f10, boolean z10) {
        c cVarE;
        int childCount = getChildCount();
        boolean zN = false;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.i(0) && (cVarE = fVar.e()) != null) {
                    zN |= cVarE.n(this, childAt, view, f5, f10, z10);
                }
            }
        }
        if (zN) {
            H(1);
        }
        return zN;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f5, float f10) {
        c cVarE;
        int childCount = getChildCount();
        boolean zO = false;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.i(0) && (cVarE = fVar.e()) != null) {
                    zO |= cVarE.o(this, childAt, view, f5, f10);
                }
            }
        }
        return zO;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View view, int i10, int i11, int[] iArr) {
        j(view, i10, i11, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        n(view, i10, i11, i12, i13, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(View view, View view2, int i10) {
        h(view, view2, i10, 0);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof h)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        h hVar = (h) parcelable;
        super.onRestoreInstanceState(hVar.a());
        SparseArray sparseArray = hVar.f2014o;
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            int id = childAt.getId();
            c cVarE = y(childAt).e();
            if (id != -1 && cVarE != null && (parcelable2 = (Parcelable) sparseArray.get(id)) != null) {
                cVarE.x(this, childAt, parcelable2);
            }
        }
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        Parcelable parcelableY;
        h hVar = new h(super.onSaveInstanceState());
        SparseArray sparseArray = new SparseArray();
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            int id = childAt.getId();
            c cVarE = ((f) childAt.getLayoutParams()).e();
            if (id != -1 && cVarE != null && (parcelableY = cVarE.y(this, childAt)) != null) {
                sparseArray.append(id, parcelableY);
            }
        }
        hVar.f2014o = sparseArray;
        return hVar;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i10) {
        return o(view, view2, i10, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        i(view, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002b A[PHI: r3
  0x002b: PHI (r3v4 boolean) = (r3v2 boolean), (r3v5 boolean) binds: [B:9:0x0022, B:5:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0054  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            int r2 = r18.getActionMasked()
            android.view.View r3 = r0.f1989w
            r4 = 1
            r5 = 0
            if (r3 != 0) goto L15
            boolean r3 = r0.L(r1, r4)
            if (r3 == 0) goto L2b
            goto L16
        L15:
            r3 = r5
        L16:
            android.view.View r6 = r0.f1989w
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r6 = (androidx.coordinatorlayout.widget.CoordinatorLayout.f) r6
            androidx.coordinatorlayout.widget.CoordinatorLayout$c r6 = r6.e()
            if (r6 == 0) goto L2b
            android.view.View r7 = r0.f1989w
            boolean r6 = r6.D(r0, r7, r1)
            goto L2c
        L2b:
            r6 = r5
        L2c:
            android.view.View r7 = r0.f1989w
            r8 = 0
            if (r7 != 0) goto L37
            boolean r1 = super.onTouchEvent(r18)
            r6 = r6 | r1
            goto L4a
        L37:
            if (r3 == 0) goto L4a
            long r11 = android.os.SystemClock.uptimeMillis()
            r13 = 3
            r14 = 0
            r15 = 0
            r16 = 0
            r9 = r11
            android.view.MotionEvent r8 = android.view.MotionEvent.obtain(r9, r11, r13, r14, r15, r16)
            super.onTouchEvent(r8)
        L4a:
            if (r8 == 0) goto L4f
            r8.recycle()
        L4f:
            if (r2 == r4) goto L54
            r1 = 3
            if (r2 != r1) goto L57
        L54:
            r0.Q(r5)
        L57:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public f generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof f ? new f((f) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new f((ViewGroup.MarginLayoutParams) layoutParams) : new f(layoutParams);
    }

    void q(View view, boolean z10, Rect rect) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z10) {
            t(view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    public List r(View view) {
        List listH = this.f1980n.h(view);
        this.f1982p.clear();
        if (listH != null) {
            this.f1982p.addAll(listH);
        }
        return this.f1982p;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z10) {
        c cVarE = ((f) view.getLayoutParams()).e();
        if (cVarE == null || !cVarE.w(this, view, rect, z10)) {
            return super.requestChildRectangleOnScreen(view, rect, z10);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z10) {
        super.requestDisallowInterceptTouchEvent(z10);
        if (!z10 || this.f1986t) {
            return;
        }
        Q(false);
        this.f1986t = true;
    }

    public List s(View view) {
        List listG = this.f1980n.g(view);
        this.f1982p.clear();
        if (listG != null) {
            this.f1982p.addAll(listG);
        }
        return this.f1982p;
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean z10) {
        super.setFitsSystemWindows(z10);
        X();
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.D = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
        Drawable drawable2 = this.C;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.C = drawableMutate;
            if (drawableMutate != null) {
                if (drawableMutate.isStateful()) {
                    this.C.setState(getDrawableState());
                }
                androidx.core.graphics.drawable.a.m(this.C, w.B(this));
                this.C.setVisible(getVisibility() == 0, false);
                this.C.setCallback(this);
            }
            w.f0(this);
        }
    }

    public void setStatusBarBackgroundColor(int i10) {
        setStatusBarBackground(new ColorDrawable(i10));
    }

    public void setStatusBarBackgroundResource(int i10) {
        setStatusBarBackground(i10 != 0 ? androidx.core.content.a.e(getContext(), i10) : null);
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        boolean z10 = i10 == 0;
        Drawable drawable = this.C;
        if (drawable == null || drawable.isVisible() == z10) {
            return;
        }
        this.C.setVisible(z10, false);
    }

    void t(View view, Rect rect) {
        androidx.coordinatorlayout.widget.b.a(this, view, rect);
    }

    void u(View view, int i10, Rect rect, Rect rect2) {
        f fVar = (f) view.getLayoutParams();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        v(view, i10, rect, rect2, fVar, measuredWidth, measuredHeight);
        d(fVar, rect2, measuredWidth, measuredHeight);
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.C;
    }

    void x(View view, Rect rect) {
        rect.set(((f) view.getLayoutParams()).g());
    }

    /* JADX WARN: Multi-variable type inference failed */
    f y(View view) {
        f fVar = (f) view.getLayoutParams();
        if (!fVar.f1996b) {
            if (view instanceof b) {
                c behavior = ((b) view).getBehavior();
                if (behavior == null) {
                    Log.e("CoordinatorLayout", "Attached behavior class is null");
                }
                fVar.n(behavior);
            } else {
                d dVar = null;
                for (Class<?> superclass = view.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
                    dVar = (d) superclass.getAnnotation(d.class);
                    if (dVar != null) {
                        break;
                    }
                }
                if (dVar != null) {
                    try {
                        fVar.n((c) dVar.value().getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                    } catch (Exception e5) {
                        Log.e("CoordinatorLayout", "Default behavior class " + dVar.value().getName() + " could not be instantiated. Did you forget a default constructor?", e5);
                    }
                }
            }
            fVar.f1996b = true;
        }
        return fVar;
    }
}
