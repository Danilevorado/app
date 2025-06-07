package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.app.a;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.widget.ActionMenuView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public class Toolbar extends ViewGroup {
    private int A;
    private int B;
    private int C;
    private int D;
    private int E;
    private s0 F;
    private int G;
    private int H;
    private int I;
    private CharSequence J;
    private CharSequence K;
    private ColorStateList L;
    private ColorStateList M;
    private boolean N;
    private boolean O;
    private final ArrayList P;
    private final ArrayList Q;
    private final int[] R;
    final androidx.core.view.i S;
    private ArrayList T;
    h U;
    private final ActionMenuView.e V;
    private c1 W;

    /* renamed from: a0, reason: collision with root package name */
    private androidx.appcompat.widget.c f1026a0;

    /* renamed from: b0, reason: collision with root package name */
    private f f1027b0;

    /* renamed from: c0, reason: collision with root package name */
    private m.a f1028c0;

    /* renamed from: d0, reason: collision with root package name */
    g.a f1029d0;

    /* renamed from: e0, reason: collision with root package name */
    private boolean f1030e0;

    /* renamed from: f0, reason: collision with root package name */
    private OnBackInvokedCallback f1031f0;

    /* renamed from: g0, reason: collision with root package name */
    private OnBackInvokedDispatcher f1032g0;

    /* renamed from: h0, reason: collision with root package name */
    private boolean f1033h0;

    /* renamed from: i0, reason: collision with root package name */
    private final Runnable f1034i0;

    /* renamed from: m, reason: collision with root package name */
    ActionMenuView f1035m;

    /* renamed from: n, reason: collision with root package name */
    private TextView f1036n;

    /* renamed from: o, reason: collision with root package name */
    private TextView f1037o;

    /* renamed from: p, reason: collision with root package name */
    private ImageButton f1038p;

    /* renamed from: q, reason: collision with root package name */
    private ImageView f1039q;

    /* renamed from: r, reason: collision with root package name */
    private Drawable f1040r;

    /* renamed from: s, reason: collision with root package name */
    private CharSequence f1041s;

    /* renamed from: t, reason: collision with root package name */
    ImageButton f1042t;

    /* renamed from: u, reason: collision with root package name */
    View f1043u;

    /* renamed from: v, reason: collision with root package name */
    private Context f1044v;

    /* renamed from: w, reason: collision with root package name */
    private int f1045w;

    /* renamed from: x, reason: collision with root package name */
    private int f1046x;

    /* renamed from: y, reason: collision with root package name */
    private int f1047y;

    /* renamed from: z, reason: collision with root package name */
    int f1048z;

    class a implements ActionMenuView.e {
        a() {
        }

        @Override // androidx.appcompat.widget.ActionMenuView.e
        public boolean onMenuItemClick(MenuItem menuItem) {
            if (Toolbar.this.S.c(menuItem)) {
                return true;
            }
            h hVar = Toolbar.this.U;
            if (hVar != null) {
                return hVar.onMenuItemClick(menuItem);
            }
            return false;
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Toolbar.this.Q();
        }
    }

    class c implements g.a {
        c() {
        }

        @Override // androidx.appcompat.view.menu.g.a
        public boolean a(androidx.appcompat.view.menu.g gVar, MenuItem menuItem) {
            g.a aVar = Toolbar.this.f1029d0;
            return aVar != null && aVar.a(gVar, menuItem);
        }

        @Override // androidx.appcompat.view.menu.g.a
        public void b(androidx.appcompat.view.menu.g gVar) {
            if (!Toolbar.this.f1035m.J()) {
                Toolbar.this.S.d(gVar);
            }
            g.a aVar = Toolbar.this.f1029d0;
            if (aVar != null) {
                aVar.b(gVar);
            }
        }
    }

    class d implements View.OnClickListener {
        d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Toolbar.this.e();
        }
    }

    static class e {
        static OnBackInvokedDispatcher a(View view) {
            return view.findOnBackInvokedDispatcher();
        }

        static OnBackInvokedCallback b(Runnable runnable) {
            Objects.requireNonNull(runnable);
            return new androidx.activity.j(runnable);
        }

        static void c(Object obj, Object obj2) {
            ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(1000000, (OnBackInvokedCallback) obj2);
        }

        static void d(Object obj, Object obj2) {
            ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
        }
    }

    private class f implements androidx.appcompat.view.menu.m {

        /* renamed from: m, reason: collision with root package name */
        androidx.appcompat.view.menu.g f1053m;

        /* renamed from: n, reason: collision with root package name */
        androidx.appcompat.view.menu.i f1054n;

        f() {
        }

        @Override // androidx.appcompat.view.menu.m
        public void a(androidx.appcompat.view.menu.g gVar, boolean z10) {
        }

        @Override // androidx.appcompat.view.menu.m
        public void c(Context context, androidx.appcompat.view.menu.g gVar) {
            androidx.appcompat.view.menu.i iVar;
            androidx.appcompat.view.menu.g gVar2 = this.f1053m;
            if (gVar2 != null && (iVar = this.f1054n) != null) {
                gVar2.f(iVar);
            }
            this.f1053m = gVar;
        }

        @Override // androidx.appcompat.view.menu.m
        public boolean d(androidx.appcompat.view.menu.r rVar) {
            return false;
        }

        @Override // androidx.appcompat.view.menu.m
        public void e(boolean z10) {
            if (this.f1054n != null) {
                androidx.appcompat.view.menu.g gVar = this.f1053m;
                boolean z11 = false;
                if (gVar != null) {
                    int size = gVar.size();
                    int i10 = 0;
                    while (true) {
                        if (i10 >= size) {
                            break;
                        }
                        if (this.f1053m.getItem(i10) == this.f1054n) {
                            z11 = true;
                            break;
                        }
                        i10++;
                    }
                }
                if (z11) {
                    return;
                }
                h(this.f1053m, this.f1054n);
            }
        }

        @Override // androidx.appcompat.view.menu.m
        public boolean g() {
            return false;
        }

        @Override // androidx.appcompat.view.menu.m
        public boolean h(androidx.appcompat.view.menu.g gVar, androidx.appcompat.view.menu.i iVar) {
            KeyEvent.Callback callback = Toolbar.this.f1043u;
            if (callback instanceof androidx.appcompat.view.c) {
                ((androidx.appcompat.view.c) callback).e();
            }
            Toolbar toolbar = Toolbar.this;
            toolbar.removeView(toolbar.f1043u);
            Toolbar toolbar2 = Toolbar.this;
            toolbar2.removeView(toolbar2.f1042t);
            Toolbar toolbar3 = Toolbar.this;
            toolbar3.f1043u = null;
            toolbar3.a();
            this.f1054n = null;
            Toolbar.this.requestLayout();
            iVar.r(false);
            Toolbar.this.R();
            return true;
        }

        @Override // androidx.appcompat.view.menu.m
        public boolean i(androidx.appcompat.view.menu.g gVar, androidx.appcompat.view.menu.i iVar) {
            Toolbar.this.g();
            ViewParent parent = Toolbar.this.f1042t.getParent();
            Toolbar toolbar = Toolbar.this;
            if (parent != toolbar) {
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(toolbar.f1042t);
                }
                Toolbar toolbar2 = Toolbar.this;
                toolbar2.addView(toolbar2.f1042t);
            }
            Toolbar.this.f1043u = iVar.getActionView();
            this.f1054n = iVar;
            ViewParent parent2 = Toolbar.this.f1043u.getParent();
            Toolbar toolbar3 = Toolbar.this;
            if (parent2 != toolbar3) {
                if (parent2 instanceof ViewGroup) {
                    ((ViewGroup) parent2).removeView(toolbar3.f1043u);
                }
                g gVarGenerateDefaultLayoutParams = Toolbar.this.generateDefaultLayoutParams();
                Toolbar toolbar4 = Toolbar.this;
                gVarGenerateDefaultLayoutParams.f476a = 8388611 | (toolbar4.f1048z & 112);
                gVarGenerateDefaultLayoutParams.f1056b = 2;
                toolbar4.f1043u.setLayoutParams(gVarGenerateDefaultLayoutParams);
                Toolbar toolbar5 = Toolbar.this;
                toolbar5.addView(toolbar5.f1043u);
            }
            Toolbar.this.I();
            Toolbar.this.requestLayout();
            iVar.r(true);
            KeyEvent.Callback callback = Toolbar.this.f1043u;
            if (callback instanceof androidx.appcompat.view.c) {
                ((androidx.appcompat.view.c) callback).c();
            }
            Toolbar.this.R();
            return true;
        }
    }

    public static class g extends a.C0007a {

        /* renamed from: b, reason: collision with root package name */
        int f1056b;

        public g(int i10, int i11) {
            super(i10, i11);
            this.f1056b = 0;
            this.f476a = 8388627;
        }

        public g(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f1056b = 0;
        }

        public g(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f1056b = 0;
        }

        public g(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f1056b = 0;
            a(marginLayoutParams);
        }

        public g(a.C0007a c0007a) {
            super(c0007a);
            this.f1056b = 0;
        }

        public g(g gVar) {
            super((a.C0007a) gVar);
            this.f1056b = 0;
            this.f1056b = gVar.f1056b;
        }

        void a(ViewGroup.MarginLayoutParams marginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) this).leftMargin = marginLayoutParams.leftMargin;
            ((ViewGroup.MarginLayoutParams) this).topMargin = marginLayoutParams.topMargin;
            ((ViewGroup.MarginLayoutParams) this).rightMargin = marginLayoutParams.rightMargin;
            ((ViewGroup.MarginLayoutParams) this).bottomMargin = marginLayoutParams.bottomMargin;
        }
    }

    public interface h {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public static class i extends e0.a {
        public static final Parcelable.Creator<i> CREATOR = new a();

        /* renamed from: o, reason: collision with root package name */
        int f1057o;

        /* renamed from: p, reason: collision with root package name */
        boolean f1058p;

        class a implements Parcelable.ClassLoaderCreator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public i createFromParcel(Parcel parcel) {
                return new i(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public i createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new i(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public i[] newArray(int i10) {
                return new i[i10];
            }
        }

        public i(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f1057o = parcel.readInt();
            this.f1058p = parcel.readInt() != 0;
        }

        public i(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // e0.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f1057o);
            parcel.writeInt(this.f1058p ? 1 : 0);
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, f.a.K);
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.I = 8388627;
        this.P = new ArrayList();
        this.Q = new ArrayList();
        this.R = new int[2];
        this.S = new androidx.core.view.i(new Runnable() { // from class: androidx.appcompat.widget.b1
            @Override // java.lang.Runnable
            public final void run() {
                this.f1103m.y();
            }
        });
        this.T = new ArrayList();
        this.V = new a();
        this.f1034i0 = new b();
        Context context2 = getContext();
        int[] iArr = f.j.O2;
        z0 z0VarV = z0.v(context2, attributeSet, iArr, i10, 0);
        androidx.core.view.w.m0(this, context, iArr, attributeSet, z0VarV.r(), i10, 0);
        this.f1046x = z0VarV.n(f.j.f23508q3, 0);
        this.f1047y = z0VarV.n(f.j.f23463h3, 0);
        this.I = z0VarV.l(f.j.P2, this.I);
        this.f1048z = z0VarV.l(f.j.Q2, 48);
        int iE = z0VarV.e(f.j.f23478k3, 0);
        int i11 = f.j.f23503p3;
        iE = z0VarV.s(i11) ? z0VarV.e(i11, iE) : iE;
        this.E = iE;
        this.D = iE;
        this.C = iE;
        this.B = iE;
        int iE2 = z0VarV.e(f.j.f23493n3, -1);
        if (iE2 >= 0) {
            this.B = iE2;
        }
        int iE3 = z0VarV.e(f.j.f23488m3, -1);
        if (iE3 >= 0) {
            this.C = iE3;
        }
        int iE4 = z0VarV.e(f.j.f23498o3, -1);
        if (iE4 >= 0) {
            this.D = iE4;
        }
        int iE5 = z0VarV.e(f.j.f23483l3, -1);
        if (iE5 >= 0) {
            this.E = iE5;
        }
        this.A = z0VarV.f(f.j.f23433b3, -1);
        int iE6 = z0VarV.e(f.j.X2, Integer.MIN_VALUE);
        int iE7 = z0VarV.e(f.j.T2, Integer.MIN_VALUE);
        int iF = z0VarV.f(f.j.V2, 0);
        int iF2 = z0VarV.f(f.j.W2, 0);
        h();
        this.F.e(iF, iF2);
        if (iE6 != Integer.MIN_VALUE || iE7 != Integer.MIN_VALUE) {
            this.F.g(iE6, iE7);
        }
        this.G = z0VarV.e(f.j.Y2, Integer.MIN_VALUE);
        this.H = z0VarV.e(f.j.U2, Integer.MIN_VALUE);
        this.f1040r = z0VarV.g(f.j.S2);
        this.f1041s = z0VarV.p(f.j.R2);
        CharSequence charSequenceP = z0VarV.p(f.j.f23473j3);
        if (!TextUtils.isEmpty(charSequenceP)) {
            setTitle(charSequenceP);
        }
        CharSequence charSequenceP2 = z0VarV.p(f.j.f23458g3);
        if (!TextUtils.isEmpty(charSequenceP2)) {
            setSubtitle(charSequenceP2);
        }
        this.f1044v = getContext();
        setPopupTheme(z0VarV.n(f.j.f23453f3, 0));
        Drawable drawableG = z0VarV.g(f.j.f23448e3);
        if (drawableG != null) {
            setNavigationIcon(drawableG);
        }
        CharSequence charSequenceP3 = z0VarV.p(f.j.f23443d3);
        if (!TextUtils.isEmpty(charSequenceP3)) {
            setNavigationContentDescription(charSequenceP3);
        }
        Drawable drawableG2 = z0VarV.g(f.j.Z2);
        if (drawableG2 != null) {
            setLogo(drawableG2);
        }
        CharSequence charSequenceP4 = z0VarV.p(f.j.f23428a3);
        if (!TextUtils.isEmpty(charSequenceP4)) {
            setLogoDescription(charSequenceP4);
        }
        int i12 = f.j.f23513r3;
        if (z0VarV.s(i12)) {
            setTitleTextColor(z0VarV.c(i12));
        }
        int i13 = f.j.f23468i3;
        if (z0VarV.s(i13)) {
            setSubtitleTextColor(z0VarV.c(i13));
        }
        int i14 = f.j.f23438c3;
        if (z0VarV.s(i14)) {
            x(z0VarV.n(i14, 0));
        }
        z0VarV.w();
    }

    private int C(View view, int i10, int[] iArr, int i11) {
        g gVar = (g) view.getLayoutParams();
        int i12 = ((ViewGroup.MarginLayoutParams) gVar).leftMargin - iArr[0];
        int iMax = i10 + Math.max(0, i12);
        iArr[0] = Math.max(0, -i12);
        int iQ = q(view, i11);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax, iQ, iMax + measuredWidth, view.getMeasuredHeight() + iQ);
        return iMax + measuredWidth + ((ViewGroup.MarginLayoutParams) gVar).rightMargin;
    }

    private int D(View view, int i10, int[] iArr, int i11) {
        g gVar = (g) view.getLayoutParams();
        int i12 = ((ViewGroup.MarginLayoutParams) gVar).rightMargin - iArr[1];
        int iMax = i10 - Math.max(0, i12);
        iArr[1] = Math.max(0, -i12);
        int iQ = q(view, i11);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax - measuredWidth, iQ, iMax, view.getMeasuredHeight() + iQ);
        return iMax - (measuredWidth + ((ViewGroup.MarginLayoutParams) gVar).leftMargin);
    }

    private int E(View view, int i10, int i11, int i12, int i13, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i14 = marginLayoutParams.leftMargin - iArr[0];
        int i15 = marginLayoutParams.rightMargin - iArr[1];
        int iMax = Math.max(0, i14) + Math.max(0, i15);
        iArr[0] = Math.max(0, -i14);
        iArr[1] = Math.max(0, -i15);
        view.measure(ViewGroup.getChildMeasureSpec(i10, getPaddingLeft() + getPaddingRight() + iMax + i11, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i12, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i13, marginLayoutParams.height));
        return view.getMeasuredWidth() + iMax;
    }

    private void F(View view, int i10, int i11, int i12, int i13, int i14) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i10, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i11, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i12, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i13, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i14 >= 0) {
            if (mode != 0) {
                i14 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i14);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i14, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    private void G() {
        Menu menu = getMenu();
        ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
        this.S.a(menu, getMenuInflater());
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.T = currentMenuItems2;
    }

    private void H() {
        removeCallbacks(this.f1034i0);
        post(this.f1034i0);
    }

    private boolean O() {
        if (!this.f1030e0) {
            return false;
        }
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (P(childAt) && childAt.getMeasuredWidth() > 0 && childAt.getMeasuredHeight() > 0) {
                return false;
            }
        }
        return true;
    }

    private boolean P(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    private void b(List list, int i10) {
        boolean z10 = androidx.core.view.w.B(this) == 1;
        int childCount = getChildCount();
        int iB = androidx.core.view.e.b(i10, androidx.core.view.w.B(this));
        list.clear();
        if (!z10) {
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = getChildAt(i11);
                g gVar = (g) childAt.getLayoutParams();
                if (gVar.f1056b == 0 && P(childAt) && p(gVar.f476a) == iB) {
                    list.add(childAt);
                }
            }
            return;
        }
        for (int i12 = childCount - 1; i12 >= 0; i12--) {
            View childAt2 = getChildAt(i12);
            g gVar2 = (g) childAt2.getLayoutParams();
            if (gVar2.f1056b == 0 && P(childAt2) && p(gVar2.f476a) == iB) {
                list.add(childAt2);
            }
        }
    }

    private void c(View view, boolean z10) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        g gVarGenerateDefaultLayoutParams = layoutParams == null ? generateDefaultLayoutParams() : !checkLayoutParams(layoutParams) ? generateLayoutParams(layoutParams) : (g) layoutParams;
        gVarGenerateDefaultLayoutParams.f1056b = 1;
        if (!z10 || this.f1043u == null) {
            addView(view, gVarGenerateDefaultLayoutParams);
        } else {
            view.setLayoutParams(gVarGenerateDefaultLayoutParams);
            this.Q.add(view);
        }
    }

    private ArrayList<MenuItem> getCurrentMenuItems() {
        ArrayList<MenuItem> arrayList = new ArrayList<>();
        Menu menu = getMenu();
        for (int i10 = 0; i10 < menu.size(); i10++) {
            arrayList.add(menu.getItem(i10));
        }
        return arrayList;
    }

    private MenuInflater getMenuInflater() {
        return new androidx.appcompat.view.g(getContext());
    }

    private void h() {
        if (this.F == null) {
            this.F = new s0();
        }
    }

    private void i() {
        if (this.f1039q == null) {
            this.f1039q = new r(getContext());
        }
    }

    private void j() {
        k();
        if (this.f1035m.N() == null) {
            androidx.appcompat.view.menu.g gVar = (androidx.appcompat.view.menu.g) this.f1035m.getMenu();
            if (this.f1027b0 == null) {
                this.f1027b0 = new f();
            }
            this.f1035m.setExpandedActionViewsExclusive(true);
            gVar.c(this.f1027b0, this.f1044v);
            R();
        }
    }

    private void k() {
        if (this.f1035m == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext());
            this.f1035m = actionMenuView;
            actionMenuView.setPopupTheme(this.f1045w);
            this.f1035m.setOnMenuItemClickListener(this.V);
            this.f1035m.O(this.f1028c0, new c());
            g gVarGenerateDefaultLayoutParams = generateDefaultLayoutParams();
            gVarGenerateDefaultLayoutParams.f476a = 8388613 | (this.f1048z & 112);
            this.f1035m.setLayoutParams(gVarGenerateDefaultLayoutParams);
            c(this.f1035m, false);
        }
    }

    private void l() {
        if (this.f1038p == null) {
            this.f1038p = new p(getContext(), null, f.a.J);
            g gVarGenerateDefaultLayoutParams = generateDefaultLayoutParams();
            gVarGenerateDefaultLayoutParams.f476a = 8388611 | (this.f1048z & 112);
            this.f1038p.setLayoutParams(gVarGenerateDefaultLayoutParams);
        }
    }

    private int p(int i10) {
        int iB = androidx.core.view.w.B(this);
        int iB2 = androidx.core.view.e.b(i10, iB) & 7;
        return (iB2 == 1 || iB2 == 3 || iB2 == 5) ? iB2 : iB == 1 ? 5 : 3;
    }

    private int q(View view, int i10) {
        g gVar = (g) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i11 = i10 > 0 ? (measuredHeight - i10) / 2 : 0;
        int iR = r(gVar.f476a);
        if (iR == 48) {
            return getPaddingTop() - i11;
        }
        if (iR == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) gVar).bottomMargin) - i11;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int iMax = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i12 = ((ViewGroup.MarginLayoutParams) gVar).topMargin;
        if (iMax < i12) {
            iMax = i12;
        } else {
            int i13 = (((height - paddingBottom) - measuredHeight) - iMax) - paddingTop;
            int i14 = ((ViewGroup.MarginLayoutParams) gVar).bottomMargin;
            if (i13 < i14) {
                iMax = Math.max(0, iMax - (i14 - i13));
            }
        }
        return paddingTop + iMax;
    }

    private int r(int i10) {
        int i11 = i10 & 112;
        return (i11 == 16 || i11 == 48 || i11 == 80) ? i11 : this.I & 112;
    }

    private int s(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return androidx.core.view.h.b(marginLayoutParams) + androidx.core.view.h.a(marginLayoutParams);
    }

    private int t(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    private int u(List list, int[] iArr) {
        int i10 = iArr[0];
        int i11 = iArr[1];
        int size = list.size();
        int i12 = 0;
        int measuredWidth = 0;
        while (i12 < size) {
            View view = (View) list.get(i12);
            g gVar = (g) view.getLayoutParams();
            int i13 = ((ViewGroup.MarginLayoutParams) gVar).leftMargin - i10;
            int i14 = ((ViewGroup.MarginLayoutParams) gVar).rightMargin - i11;
            int iMax = Math.max(0, i13);
            int iMax2 = Math.max(0, i14);
            int iMax3 = Math.max(0, -i13);
            int iMax4 = Math.max(0, -i14);
            measuredWidth += iMax + view.getMeasuredWidth() + iMax2;
            i12++;
            i11 = iMax4;
            i10 = iMax3;
        }
        return measuredWidth;
    }

    private boolean z(View view) {
        return view.getParent() == this || this.Q.contains(view);
    }

    public boolean A() {
        ActionMenuView actionMenuView = this.f1035m;
        return actionMenuView != null && actionMenuView.I();
    }

    public boolean B() {
        ActionMenuView actionMenuView = this.f1035m;
        return actionMenuView != null && actionMenuView.J();
    }

    void I() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (((g) childAt.getLayoutParams()).f1056b != 2 && childAt != this.f1035m) {
                removeViewAt(childCount);
                this.Q.add(childAt);
            }
        }
    }

    public void J(int i10, int i11) {
        h();
        this.F.g(i10, i11);
    }

    public void K(androidx.appcompat.view.menu.g gVar, androidx.appcompat.widget.c cVar) {
        if (gVar == null && this.f1035m == null) {
            return;
        }
        k();
        androidx.appcompat.view.menu.g gVarN = this.f1035m.N();
        if (gVarN == gVar) {
            return;
        }
        if (gVarN != null) {
            gVarN.O(this.f1026a0);
            gVarN.O(this.f1027b0);
        }
        if (this.f1027b0 == null) {
            this.f1027b0 = new f();
        }
        cVar.G(true);
        if (gVar != null) {
            gVar.c(cVar, this.f1044v);
            gVar.c(this.f1027b0, this.f1044v);
        } else {
            cVar.c(this.f1044v, null);
            this.f1027b0.c(this.f1044v, null);
            cVar.e(true);
            this.f1027b0.e(true);
        }
        this.f1035m.setPopupTheme(this.f1045w);
        this.f1035m.setPresenter(cVar);
        this.f1026a0 = cVar;
        R();
    }

    public void L(m.a aVar, g.a aVar2) {
        this.f1028c0 = aVar;
        this.f1029d0 = aVar2;
        ActionMenuView actionMenuView = this.f1035m;
        if (actionMenuView != null) {
            actionMenuView.O(aVar, aVar2);
        }
    }

    public void M(Context context, int i10) {
        this.f1047y = i10;
        TextView textView = this.f1037o;
        if (textView != null) {
            textView.setTextAppearance(context, i10);
        }
    }

    public void N(Context context, int i10) {
        this.f1046x = i10;
        TextView textView = this.f1036n;
        if (textView != null) {
            textView.setTextAppearance(context, i10);
        }
    }

    public boolean Q() {
        ActionMenuView actionMenuView = this.f1035m;
        return actionMenuView != null && actionMenuView.P();
    }

    void R() {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher onBackInvokedDispatcherA = e.a(this);
            boolean z10 = v() && onBackInvokedDispatcherA != null && androidx.core.view.w.R(this) && this.f1033h0;
            if (z10 && this.f1032g0 == null) {
                if (this.f1031f0 == null) {
                    this.f1031f0 = e.b(new Runnable() { // from class: androidx.appcompat.widget.a1
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f1099m.e();
                        }
                    });
                }
                e.c(onBackInvokedDispatcherA, this.f1031f0);
            } else {
                if (z10 || (onBackInvokedDispatcher = this.f1032g0) == null) {
                    return;
                }
                e.d(onBackInvokedDispatcher, this.f1031f0);
                onBackInvokedDispatcherA = null;
            }
            this.f1032g0 = onBackInvokedDispatcherA;
        }
    }

    void a() {
        for (int size = this.Q.size() - 1; size >= 0; size--) {
            addView((View) this.Q.get(size));
        }
        this.Q.clear();
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof g);
    }

    public boolean d() {
        ActionMenuView actionMenuView;
        return getVisibility() == 0 && (actionMenuView = this.f1035m) != null && actionMenuView.K();
    }

    public void e() {
        f fVar = this.f1027b0;
        androidx.appcompat.view.menu.i iVar = fVar == null ? null : fVar.f1054n;
        if (iVar != null) {
            iVar.collapseActionView();
        }
    }

    public void f() {
        ActionMenuView actionMenuView = this.f1035m;
        if (actionMenuView != null) {
            actionMenuView.B();
        }
    }

    void g() {
        if (this.f1042t == null) {
            p pVar = new p(getContext(), null, f.a.J);
            this.f1042t = pVar;
            pVar.setImageDrawable(this.f1040r);
            this.f1042t.setContentDescription(this.f1041s);
            g gVarGenerateDefaultLayoutParams = generateDefaultLayoutParams();
            gVarGenerateDefaultLayoutParams.f476a = 8388611 | (this.f1048z & 112);
            gVarGenerateDefaultLayoutParams.f1056b = 2;
            this.f1042t.setLayoutParams(gVarGenerateDefaultLayoutParams);
            this.f1042t.setOnClickListener(new d());
        }
    }

    public CharSequence getCollapseContentDescription() {
        ImageButton imageButton = this.f1042t;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        ImageButton imageButton = this.f1042t;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        s0 s0Var = this.F;
        if (s0Var != null) {
            return s0Var.a();
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i10 = this.H;
        return i10 != Integer.MIN_VALUE ? i10 : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        s0 s0Var = this.F;
        if (s0Var != null) {
            return s0Var.b();
        }
        return 0;
    }

    public int getContentInsetRight() {
        s0 s0Var = this.F;
        if (s0Var != null) {
            return s0Var.c();
        }
        return 0;
    }

    public int getContentInsetStart() {
        s0 s0Var = this.F;
        if (s0Var != null) {
            return s0Var.d();
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i10 = this.G;
        return i10 != Integer.MIN_VALUE ? i10 : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        androidx.appcompat.view.menu.g gVarN;
        ActionMenuView actionMenuView = this.f1035m;
        return actionMenuView != null && (gVarN = actionMenuView.N()) != null && gVarN.hasVisibleItems() ? Math.max(getContentInsetEnd(), Math.max(this.H, 0)) : getContentInsetEnd();
    }

    public int getCurrentContentInsetLeft() {
        return androidx.core.view.w.B(this) == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        return androidx.core.view.w.B(this) == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.G, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        ImageView imageView = this.f1039q;
        if (imageView != null) {
            return imageView.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        ImageView imageView = this.f1039q;
        if (imageView != null) {
            return imageView.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        j();
        return this.f1035m.getMenu();
    }

    View getNavButtonView() {
        return this.f1038p;
    }

    public CharSequence getNavigationContentDescription() {
        ImageButton imageButton = this.f1038p;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        ImageButton imageButton = this.f1038p;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    androidx.appcompat.widget.c getOuterActionMenuPresenter() {
        return this.f1026a0;
    }

    public Drawable getOverflowIcon() {
        j();
        return this.f1035m.getOverflowIcon();
    }

    Context getPopupContext() {
        return this.f1044v;
    }

    public int getPopupTheme() {
        return this.f1045w;
    }

    public CharSequence getSubtitle() {
        return this.K;
    }

    final TextView getSubtitleTextView() {
        return this.f1037o;
    }

    public CharSequence getTitle() {
        return this.J;
    }

    public int getTitleMarginBottom() {
        return this.E;
    }

    public int getTitleMarginEnd() {
        return this.C;
    }

    public int getTitleMarginStart() {
        return this.B;
    }

    public int getTitleMarginTop() {
        return this.D;
    }

    final TextView getTitleTextView() {
        return this.f1036n;
    }

    public h0 getWrapper() {
        if (this.W == null) {
            this.W = new c1(this, true);
        }
        return this.W;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public g generateDefaultLayoutParams() {
        return new g(-2, -2);
    }

    @Override // android.view.ViewGroup
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public g generateLayoutParams(AttributeSet attributeSet) {
        return new g(getContext(), attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public g generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof g ? new g((g) layoutParams) : layoutParams instanceof a.C0007a ? new g((a.C0007a) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new g((ViewGroup.MarginLayoutParams) layoutParams) : new g(layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        R();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f1034i0);
        R();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.O = false;
        }
        if (!this.O) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.O = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.O = false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x0295 A[LOOP:0: B:109:0x0293->B:110:0x0295, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02b7 A[LOOP:1: B:112:0x02b5->B:113:0x02b7, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02f0 A[LOOP:2: B:121:0x02ee->B:122:0x02f0, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x021d  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void onLayout(boolean r20, int r21, int r22, int r23, int r24) {
        /*
            Method dump skipped, instructions count: 773
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        int measuredWidth;
        int iMax;
        int iCombineMeasuredStates;
        int measuredWidth2;
        int measuredHeight;
        int iCombineMeasuredStates2;
        int iMax2;
        int[] iArr = this.R;
        boolean zB = j1.b(this);
        int i12 = !zB ? 1 : 0;
        if (P(this.f1038p)) {
            F(this.f1038p, i10, 0, i11, 0, this.A);
            measuredWidth = this.f1038p.getMeasuredWidth() + s(this.f1038p);
            iMax = Math.max(0, this.f1038p.getMeasuredHeight() + t(this.f1038p));
            iCombineMeasuredStates = View.combineMeasuredStates(0, this.f1038p.getMeasuredState());
        } else {
            measuredWidth = 0;
            iMax = 0;
            iCombineMeasuredStates = 0;
        }
        if (P(this.f1042t)) {
            F(this.f1042t, i10, 0, i11, 0, this.A);
            measuredWidth = this.f1042t.getMeasuredWidth() + s(this.f1042t);
            iMax = Math.max(iMax, this.f1042t.getMeasuredHeight() + t(this.f1042t));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f1042t.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int iMax3 = 0 + Math.max(currentContentInsetStart, measuredWidth);
        iArr[zB ? 1 : 0] = Math.max(0, currentContentInsetStart - measuredWidth);
        if (P(this.f1035m)) {
            F(this.f1035m, i10, iMax3, i11, 0, this.A);
            measuredWidth2 = this.f1035m.getMeasuredWidth() + s(this.f1035m);
            iMax = Math.max(iMax, this.f1035m.getMeasuredHeight() + t(this.f1035m));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f1035m.getMeasuredState());
        } else {
            measuredWidth2 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int iMax4 = iMax3 + Math.max(currentContentInsetEnd, measuredWidth2);
        iArr[i12] = Math.max(0, currentContentInsetEnd - measuredWidth2);
        if (P(this.f1043u)) {
            iMax4 += E(this.f1043u, i10, iMax4, i11, 0, iArr);
            iMax = Math.max(iMax, this.f1043u.getMeasuredHeight() + t(this.f1043u));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f1043u.getMeasuredState());
        }
        if (P(this.f1039q)) {
            iMax4 += E(this.f1039q, i10, iMax4, i11, 0, iArr);
            iMax = Math.max(iMax, this.f1039q.getMeasuredHeight() + t(this.f1039q));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f1039q.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (((g) childAt.getLayoutParams()).f1056b == 0 && P(childAt)) {
                iMax4 += E(childAt, i10, iMax4, i11, 0, iArr);
                iMax = Math.max(iMax, childAt.getMeasuredHeight() + t(childAt));
                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, childAt.getMeasuredState());
            }
        }
        int i14 = this.D + this.E;
        int i15 = this.B + this.C;
        if (P(this.f1036n)) {
            E(this.f1036n, i10, iMax4 + i15, i11, i14, iArr);
            int measuredWidth3 = this.f1036n.getMeasuredWidth() + s(this.f1036n);
            measuredHeight = this.f1036n.getMeasuredHeight() + t(this.f1036n);
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.f1036n.getMeasuredState());
            iMax2 = measuredWidth3;
        } else {
            measuredHeight = 0;
            iCombineMeasuredStates2 = iCombineMeasuredStates;
            iMax2 = 0;
        }
        if (P(this.f1037o)) {
            iMax2 = Math.max(iMax2, E(this.f1037o, i10, iMax4 + i15, i11, measuredHeight + i14, iArr));
            measuredHeight += this.f1037o.getMeasuredHeight() + t(this.f1037o);
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, this.f1037o.getMeasuredState());
        }
        setMeasuredDimension(View.resolveSizeAndState(Math.max(iMax4 + iMax2 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i10, (-16777216) & iCombineMeasuredStates2), O() ? 0 : View.resolveSizeAndState(Math.max(Math.max(iMax, measuredHeight) + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i11, iCombineMeasuredStates2 << 16));
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem menuItemFindItem;
        if (!(parcelable instanceof i)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        i iVar = (i) parcelable;
        super.onRestoreInstanceState(iVar.a());
        ActionMenuView actionMenuView = this.f1035m;
        androidx.appcompat.view.menu.g gVarN = actionMenuView != null ? actionMenuView.N() : null;
        int i10 = iVar.f1057o;
        if (i10 != 0 && this.f1027b0 != null && gVarN != null && (menuItemFindItem = gVarN.findItem(i10)) != null) {
            menuItemFindItem.expandActionView();
        }
        if (iVar.f1058p) {
            H();
        }
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i10) {
        super.onRtlPropertiesChanged(i10);
        h();
        this.F.f(i10 == 1);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        androidx.appcompat.view.menu.i iVar;
        i iVar2 = new i(super.onSaveInstanceState());
        f fVar = this.f1027b0;
        if (fVar != null && (iVar = fVar.f1054n) != null) {
            iVar2.f1057o = iVar.getItemId();
        }
        iVar2.f1058p = B();
        return iVar2;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.N = false;
        }
        if (!this.N) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.N = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.N = false;
        }
        return true;
    }

    public void setBackInvokedCallbackEnabled(boolean z10) {
        if (this.f1033h0 != z10) {
            this.f1033h0 = z10;
            R();
        }
    }

    public void setCollapseContentDescription(int i10) {
        setCollapseContentDescription(i10 != 0 ? getContext().getText(i10) : null);
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            g();
        }
        ImageButton imageButton = this.f1042t;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(int i10) {
        setCollapseIcon(g.a.b(getContext(), i10));
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            g();
            this.f1042t.setImageDrawable(drawable);
        } else {
            ImageButton imageButton = this.f1042t;
            if (imageButton != null) {
                imageButton.setImageDrawable(this.f1040r);
            }
        }
    }

    public void setCollapsible(boolean z10) {
        this.f1030e0 = z10;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i10) {
        if (i10 < 0) {
            i10 = Integer.MIN_VALUE;
        }
        if (i10 != this.H) {
            this.H = i10;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i10) {
        if (i10 < 0) {
            i10 = Integer.MIN_VALUE;
        }
        if (i10 != this.G) {
            this.G = i10;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i10) {
        setLogo(g.a.b(getContext(), i10));
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            i();
            if (!z(this.f1039q)) {
                c(this.f1039q, true);
            }
        } else {
            ImageView imageView = this.f1039q;
            if (imageView != null && z(imageView)) {
                removeView(this.f1039q);
                this.Q.remove(this.f1039q);
            }
        }
        ImageView imageView2 = this.f1039q;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(int i10) {
        setLogoDescription(getContext().getText(i10));
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            i();
        }
        ImageView imageView = this.f1039q;
        if (imageView != null) {
            imageView.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(int i10) {
        setNavigationContentDescription(i10 != 0 ? getContext().getText(i10) : null);
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            l();
        }
        ImageButton imageButton = this.f1038p;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
            d1.a(this.f1038p, charSequence);
        }
    }

    public void setNavigationIcon(int i10) {
        setNavigationIcon(g.a.b(getContext(), i10));
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            l();
            if (!z(this.f1038p)) {
                c(this.f1038p, true);
            }
        } else {
            ImageButton imageButton = this.f1038p;
            if (imageButton != null && z(imageButton)) {
                removeView(this.f1038p);
                this.Q.remove(this.f1038p);
            }
        }
        ImageButton imageButton2 = this.f1038p;
        if (imageButton2 != null) {
            imageButton2.setImageDrawable(drawable);
        }
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        l();
        this.f1038p.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(h hVar) {
        this.U = hVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        j();
        this.f1035m.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i10) {
        if (this.f1045w != i10) {
            this.f1045w = i10;
            if (i10 == 0) {
                this.f1044v = getContext();
            } else {
                this.f1044v = new ContextThemeWrapper(getContext(), i10);
            }
        }
    }

    public void setSubtitle(int i10) {
        setSubtitle(getContext().getText(i10));
    }

    public void setSubtitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            TextView textView = this.f1037o;
            if (textView != null && z(textView)) {
                removeView(this.f1037o);
                this.Q.remove(this.f1037o);
            }
        } else {
            if (this.f1037o == null) {
                Context context = getContext();
                d0 d0Var = new d0(context);
                this.f1037o = d0Var;
                d0Var.setSingleLine();
                this.f1037o.setEllipsize(TextUtils.TruncateAt.END);
                int i10 = this.f1047y;
                if (i10 != 0) {
                    this.f1037o.setTextAppearance(context, i10);
                }
                ColorStateList colorStateList = this.M;
                if (colorStateList != null) {
                    this.f1037o.setTextColor(colorStateList);
                }
            }
            if (!z(this.f1037o)) {
                c(this.f1037o, true);
            }
        }
        TextView textView2 = this.f1037o;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.K = charSequence;
    }

    public void setSubtitleTextColor(int i10) {
        setSubtitleTextColor(ColorStateList.valueOf(i10));
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.M = colorStateList;
        TextView textView = this.f1037o;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setTitle(int i10) {
        setTitle(getContext().getText(i10));
    }

    public void setTitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            TextView textView = this.f1036n;
            if (textView != null && z(textView)) {
                removeView(this.f1036n);
                this.Q.remove(this.f1036n);
            }
        } else {
            if (this.f1036n == null) {
                Context context = getContext();
                d0 d0Var = new d0(context);
                this.f1036n = d0Var;
                d0Var.setSingleLine();
                this.f1036n.setEllipsize(TextUtils.TruncateAt.END);
                int i10 = this.f1046x;
                if (i10 != 0) {
                    this.f1036n.setTextAppearance(context, i10);
                }
                ColorStateList colorStateList = this.L;
                if (colorStateList != null) {
                    this.f1036n.setTextColor(colorStateList);
                }
            }
            if (!z(this.f1036n)) {
                c(this.f1036n, true);
            }
        }
        TextView textView2 = this.f1036n;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.J = charSequence;
    }

    public void setTitleMarginBottom(int i10) {
        this.E = i10;
        requestLayout();
    }

    public void setTitleMarginEnd(int i10) {
        this.C = i10;
        requestLayout();
    }

    public void setTitleMarginStart(int i10) {
        this.B = i10;
        requestLayout();
    }

    public void setTitleMarginTop(int i10) {
        this.D = i10;
        requestLayout();
    }

    public void setTitleTextColor(int i10) {
        setTitleTextColor(ColorStateList.valueOf(i10));
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.L = colorStateList;
        TextView textView = this.f1036n;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public boolean v() {
        f fVar = this.f1027b0;
        return (fVar == null || fVar.f1054n == null) ? false : true;
    }

    public boolean w() {
        ActionMenuView actionMenuView = this.f1035m;
        return actionMenuView != null && actionMenuView.H();
    }

    public void x(int i10) {
        getMenuInflater().inflate(i10, getMenu());
    }

    public void y() {
        Iterator it = this.T.iterator();
        while (it.hasNext()) {
            getMenu().removeItem(((MenuItem) it.next()).getItemId());
        }
        G();
    }
}
