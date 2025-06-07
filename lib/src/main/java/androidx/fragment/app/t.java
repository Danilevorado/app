package androidx.fragment.app;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.fragment.app.b0;
import androidx.lifecycle.j;
import androidx.lifecycle.k0;
import com.facebook.ads.internal.api.AdSizeApi;

/* loaded from: classes.dex */
class t {

    /* renamed from: a, reason: collision with root package name */
    private final l f2945a;

    /* renamed from: b, reason: collision with root package name */
    private final u f2946b;

    /* renamed from: c, reason: collision with root package name */
    private final Fragment f2947c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f2948d = false;

    /* renamed from: e, reason: collision with root package name */
    private int f2949e = -1;

    class a implements View.OnAttachStateChangeListener {

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ View f2950m;

        a(View view) {
            this.f2950m = view;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            this.f2950m.removeOnAttachStateChangeListener(this);
            androidx.core.view.w.l0(this.f2950m);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    static /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f2952a;

        static {
            int[] iArr = new int[j.c.values().length];
            f2952a = iArr;
            try {
                iArr[j.c.RESUMED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2952a[j.c.STARTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2952a[j.c.CREATED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2952a[j.c.INITIALIZED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    t(l lVar, u uVar, Fragment fragment) {
        this.f2945a = lVar;
        this.f2946b = uVar;
        this.f2947c = fragment;
    }

    t(l lVar, u uVar, Fragment fragment, s sVar) {
        this.f2945a = lVar;
        this.f2946b = uVar;
        this.f2947c = fragment;
        fragment.f2674o = null;
        fragment.f2675p = null;
        fragment.D = 0;
        fragment.A = false;
        fragment.f2683x = false;
        Fragment fragment2 = fragment.f2679t;
        fragment.f2680u = fragment2 != null ? fragment2.f2677r : null;
        fragment.f2679t = null;
        Bundle bundle = sVar.f2944y;
        fragment.f2673n = bundle == null ? new Bundle() : bundle;
    }

    t(l lVar, u uVar, ClassLoader classLoader, i iVar, s sVar) {
        this.f2945a = lVar;
        this.f2946b = uVar;
        Fragment fragmentA = iVar.a(classLoader, sVar.f2932m);
        this.f2947c = fragmentA;
        Bundle bundle = sVar.f2941v;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
        }
        fragmentA.B1(sVar.f2941v);
        fragmentA.f2677r = sVar.f2933n;
        fragmentA.f2685z = sVar.f2934o;
        fragmentA.B = true;
        fragmentA.I = sVar.f2935p;
        fragmentA.J = sVar.f2936q;
        fragmentA.K = sVar.f2937r;
        fragmentA.N = sVar.f2938s;
        fragmentA.f2684y = sVar.f2939t;
        fragmentA.M = sVar.f2940u;
        fragmentA.L = sVar.f2942w;
        fragmentA.f2663d0 = j.c.values()[sVar.f2943x];
        Bundle bundle2 = sVar.f2944y;
        fragmentA.f2673n = bundle2 == null ? new Bundle() : bundle2;
        if (m.F0(2)) {
            Log.v("FragmentManager", "Instantiated fragment " + fragmentA);
        }
    }

    private boolean l(View view) {
        if (view == this.f2947c.T) {
            return true;
        }
        for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
            if (parent == this.f2947c.T) {
                return true;
            }
        }
        return false;
    }

    private Bundle q() {
        Bundle bundle = new Bundle();
        this.f2947c.o1(bundle);
        this.f2945a.j(this.f2947c, bundle, false);
        if (bundle.isEmpty()) {
            bundle = null;
        }
        if (this.f2947c.T != null) {
            s();
        }
        if (this.f2947c.f2674o != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putSparseParcelableArray("android:view_state", this.f2947c.f2674o);
        }
        if (this.f2947c.f2675p != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBundle("android:view_registry_state", this.f2947c.f2675p);
        }
        if (!this.f2947c.V) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean("android:user_visible_hint", this.f2947c.V);
        }
        return bundle;
    }

    void a() {
        if (m.F0(3)) {
            Log.d("FragmentManager", "moveto ACTIVITY_CREATED: " + this.f2947c);
        }
        Fragment fragment = this.f2947c;
        fragment.U0(fragment.f2673n);
        l lVar = this.f2945a;
        Fragment fragment2 = this.f2947c;
        lVar.a(fragment2, fragment2.f2673n, false);
    }

    void b() {
        int iJ = this.f2946b.j(this.f2947c);
        Fragment fragment = this.f2947c;
        fragment.S.addView(fragment.T, iJ);
    }

    void c() {
        if (m.F0(3)) {
            Log.d("FragmentManager", "moveto ATTACHED: " + this.f2947c);
        }
        Fragment fragment = this.f2947c;
        Fragment fragment2 = fragment.f2679t;
        t tVarM = null;
        if (fragment2 != null) {
            t tVarM2 = this.f2946b.m(fragment2.f2677r);
            if (tVarM2 == null) {
                throw new IllegalStateException("Fragment " + this.f2947c + " declared target fragment " + this.f2947c.f2679t + " that does not belong to this FragmentManager!");
            }
            Fragment fragment3 = this.f2947c;
            fragment3.f2680u = fragment3.f2679t.f2677r;
            fragment3.f2679t = null;
            tVarM = tVarM2;
        } else {
            String str = fragment.f2680u;
            if (str != null && (tVarM = this.f2946b.m(str)) == null) {
                throw new IllegalStateException("Fragment " + this.f2947c + " declared target fragment " + this.f2947c.f2680u + " that does not belong to this FragmentManager!");
            }
        }
        if (tVarM != null && (m.P || tVarM.k().f2672m < 1)) {
            tVarM.m();
        }
        Fragment fragment4 = this.f2947c;
        fragment4.F = fragment4.E.t0();
        Fragment fragment5 = this.f2947c;
        fragment5.H = fragment5.E.w0();
        this.f2945a.g(this.f2947c, false);
        this.f2947c.V0();
        this.f2945a.b(this.f2947c, false);
    }

    int d() {
        Fragment fragment;
        ViewGroup viewGroup;
        Fragment fragment2 = this.f2947c;
        if (fragment2.E == null) {
            return fragment2.f2672m;
        }
        int iMin = this.f2949e;
        int i10 = b.f2952a[fragment2.f2663d0.ordinal()];
        if (i10 != 1) {
            iMin = i10 != 2 ? i10 != 3 ? i10 != 4 ? Math.min(iMin, -1) : Math.min(iMin, 0) : Math.min(iMin, 1) : Math.min(iMin, 5);
        }
        Fragment fragment3 = this.f2947c;
        if (fragment3.f2685z) {
            if (fragment3.A) {
                iMin = Math.max(this.f2949e, 2);
                View view = this.f2947c.T;
                if (view != null && view.getParent() == null) {
                    iMin = Math.min(iMin, 2);
                }
            } else {
                iMin = this.f2949e < 4 ? Math.min(iMin, fragment3.f2672m) : Math.min(iMin, 1);
            }
        }
        if (!this.f2947c.f2683x) {
            iMin = Math.min(iMin, 1);
        }
        b0.e.b bVarL = null;
        if (m.P && (viewGroup = (fragment = this.f2947c).S) != null) {
            bVarL = b0.n(viewGroup, fragment.J()).l(this);
        }
        if (bVarL == b0.e.b.ADDING) {
            iMin = Math.min(iMin, 6);
        } else if (bVarL == b0.e.b.REMOVING) {
            iMin = Math.max(iMin, 3);
        } else {
            Fragment fragment4 = this.f2947c;
            if (fragment4.f2684y) {
                iMin = fragment4.f0() ? Math.min(iMin, 1) : Math.min(iMin, -1);
            }
        }
        Fragment fragment5 = this.f2947c;
        if (fragment5.U && fragment5.f2672m < 5) {
            iMin = Math.min(iMin, 4);
        }
        if (m.F0(2)) {
            Log.v("FragmentManager", "computeExpectedState() of " + iMin + " for " + this.f2947c);
        }
        return iMin;
    }

    void e() {
        if (m.F0(3)) {
            Log.d("FragmentManager", "moveto CREATED: " + this.f2947c);
        }
        Fragment fragment = this.f2947c;
        if (fragment.f2662c0) {
            fragment.v1(fragment.f2673n);
            this.f2947c.f2672m = 1;
            return;
        }
        this.f2945a.h(fragment, fragment.f2673n, false);
        Fragment fragment2 = this.f2947c;
        fragment2.Y0(fragment2.f2673n);
        l lVar = this.f2945a;
        Fragment fragment3 = this.f2947c;
        lVar.c(fragment3, fragment3.f2673n, false);
    }

    void f() {
        String resourceName;
        if (this.f2947c.f2685z) {
            return;
        }
        if (m.F0(3)) {
            Log.d("FragmentManager", "moveto CREATE_VIEW: " + this.f2947c);
        }
        Fragment fragment = this.f2947c;
        LayoutInflater layoutInflaterE1 = fragment.e1(fragment.f2673n);
        ViewGroup viewGroup = null;
        Fragment fragment2 = this.f2947c;
        ViewGroup viewGroup2 = fragment2.S;
        if (viewGroup2 != null) {
            viewGroup = viewGroup2;
        } else {
            int i10 = fragment2.J;
            if (i10 != 0) {
                if (i10 == -1) {
                    throw new IllegalArgumentException("Cannot create fragment " + this.f2947c + " for a container view with no id");
                }
                viewGroup = (ViewGroup) fragment2.E.o0().e(this.f2947c.J);
                if (viewGroup == null) {
                    Fragment fragment3 = this.f2947c;
                    if (!fragment3.B) {
                        try {
                            resourceName = fragment3.P().getResourceName(this.f2947c.J);
                        } catch (Resources.NotFoundException unused) {
                            resourceName = "unknown";
                        }
                        throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(this.f2947c.J) + " (" + resourceName + ") for fragment " + this.f2947c);
                    }
                }
            }
        }
        Fragment fragment4 = this.f2947c;
        fragment4.S = viewGroup;
        fragment4.a1(layoutInflaterE1, viewGroup, fragment4.f2673n);
        View view = this.f2947c.T;
        if (view != null) {
            boolean z10 = false;
            view.setSaveFromParentEnabled(false);
            Fragment fragment5 = this.f2947c;
            fragment5.T.setTag(j0.b.f24363a, fragment5);
            if (viewGroup != null) {
                b();
            }
            Fragment fragment6 = this.f2947c;
            if (fragment6.L) {
                fragment6.T.setVisibility(8);
            }
            if (androidx.core.view.w.R(this.f2947c.T)) {
                androidx.core.view.w.l0(this.f2947c.T);
            } else {
                View view2 = this.f2947c.T;
                view2.addOnAttachStateChangeListener(new a(view2));
            }
            this.f2947c.r1();
            l lVar = this.f2945a;
            Fragment fragment7 = this.f2947c;
            lVar.m(fragment7, fragment7.T, fragment7.f2673n, false);
            int visibility = this.f2947c.T.getVisibility();
            float alpha = this.f2947c.T.getAlpha();
            if (m.P) {
                this.f2947c.H1(alpha);
                Fragment fragment8 = this.f2947c;
                if (fragment8.S != null && visibility == 0) {
                    View viewFindFocus = fragment8.T.findFocus();
                    if (viewFindFocus != null) {
                        this.f2947c.C1(viewFindFocus);
                        if (m.F0(2)) {
                            Log.v("FragmentManager", "requestFocus: Saved focused view " + viewFindFocus + " for Fragment " + this.f2947c);
                        }
                    }
                    this.f2947c.T.setAlpha(0.0f);
                }
            } else {
                Fragment fragment9 = this.f2947c;
                if (visibility == 0 && fragment9.S != null) {
                    z10 = true;
                }
                fragment9.Y = z10;
            }
        }
        this.f2947c.f2672m = 2;
    }

    void g() {
        Fragment fragmentF;
        if (m.F0(3)) {
            Log.d("FragmentManager", "movefrom CREATED: " + this.f2947c);
        }
        Fragment fragment = this.f2947c;
        boolean zIsChangingConfigurations = true;
        boolean z10 = fragment.f2684y && !fragment.f0();
        if (!(z10 || this.f2946b.o().p(this.f2947c))) {
            String str = this.f2947c.f2680u;
            if (str != null && (fragmentF = this.f2946b.f(str)) != null && fragmentF.N) {
                this.f2947c.f2679t = fragmentF;
            }
            this.f2947c.f2672m = 0;
            return;
        }
        j jVar = this.f2947c.F;
        if (jVar instanceof k0) {
            zIsChangingConfigurations = this.f2946b.o().m();
        } else if (jVar.h() instanceof Activity) {
            zIsChangingConfigurations = true ^ ((Activity) jVar.h()).isChangingConfigurations();
        }
        if (z10 || zIsChangingConfigurations) {
            this.f2946b.o().g(this.f2947c);
        }
        this.f2947c.b1();
        this.f2945a.d(this.f2947c, false);
        for (t tVar : this.f2946b.k()) {
            if (tVar != null) {
                Fragment fragmentK = tVar.k();
                if (this.f2947c.f2677r.equals(fragmentK.f2680u)) {
                    fragmentK.f2679t = this.f2947c;
                    fragmentK.f2680u = null;
                }
            }
        }
        Fragment fragment2 = this.f2947c;
        String str2 = fragment2.f2680u;
        if (str2 != null) {
            fragment2.f2679t = this.f2946b.f(str2);
        }
        this.f2946b.q(this);
    }

    void h() {
        View view;
        if (m.F0(3)) {
            Log.d("FragmentManager", "movefrom CREATE_VIEW: " + this.f2947c);
        }
        Fragment fragment = this.f2947c;
        ViewGroup viewGroup = fragment.S;
        if (viewGroup != null && (view = fragment.T) != null) {
            viewGroup.removeView(view);
        }
        this.f2947c.c1();
        this.f2945a.n(this.f2947c, false);
        Fragment fragment2 = this.f2947c;
        fragment2.S = null;
        fragment2.T = null;
        fragment2.f2665f0 = null;
        fragment2.f2666g0.k(null);
        this.f2947c.A = false;
    }

    void i() {
        if (m.F0(3)) {
            Log.d("FragmentManager", "movefrom ATTACHED: " + this.f2947c);
        }
        this.f2947c.d1();
        boolean z10 = false;
        this.f2945a.e(this.f2947c, false);
        Fragment fragment = this.f2947c;
        fragment.f2672m = -1;
        fragment.F = null;
        fragment.H = null;
        fragment.E = null;
        if (fragment.f2684y && !fragment.f0()) {
            z10 = true;
        }
        if (z10 || this.f2946b.o().p(this.f2947c)) {
            if (m.F0(3)) {
                Log.d("FragmentManager", "initState called for fragment: " + this.f2947c);
            }
            this.f2947c.a0();
        }
    }

    void j() {
        Fragment fragment = this.f2947c;
        if (fragment.f2685z && fragment.A && !fragment.C) {
            if (m.F0(3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + this.f2947c);
            }
            Fragment fragment2 = this.f2947c;
            fragment2.a1(fragment2.e1(fragment2.f2673n), null, this.f2947c.f2673n);
            View view = this.f2947c.T;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                Fragment fragment3 = this.f2947c;
                fragment3.T.setTag(j0.b.f24363a, fragment3);
                Fragment fragment4 = this.f2947c;
                if (fragment4.L) {
                    fragment4.T.setVisibility(8);
                }
                this.f2947c.r1();
                l lVar = this.f2945a;
                Fragment fragment5 = this.f2947c;
                lVar.m(fragment5, fragment5.T, fragment5.f2673n, false);
                this.f2947c.f2672m = 2;
            }
        }
    }

    Fragment k() {
        return this.f2947c;
    }

    void m() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        if (this.f2948d) {
            if (m.F0(2)) {
                Log.v("FragmentManager", "Ignoring re-entrant call to moveToExpectedState() for " + k());
                return;
            }
            return;
        }
        try {
            this.f2948d = true;
            while (true) {
                int iD = d();
                Fragment fragment = this.f2947c;
                int i10 = fragment.f2672m;
                if (iD == i10) {
                    if (m.P && fragment.Z) {
                        if (fragment.T != null && (viewGroup = fragment.S) != null) {
                            b0 b0VarN = b0.n(viewGroup, fragment.J());
                            if (this.f2947c.L) {
                                b0VarN.c(this);
                            } else {
                                b0VarN.e(this);
                            }
                        }
                        Fragment fragment2 = this.f2947c;
                        m mVar = fragment2.E;
                        if (mVar != null) {
                            mVar.D0(fragment2);
                        }
                        Fragment fragment3 = this.f2947c;
                        fragment3.Z = false;
                        fragment3.D0(fragment3.L);
                    }
                    return;
                }
                if (iD <= i10) {
                    switch (i10 - 1) {
                        case -1:
                            i();
                            break;
                        case 0:
                            g();
                            break;
                        case 1:
                            h();
                            this.f2947c.f2672m = 1;
                            break;
                        case 2:
                            fragment.A = false;
                            fragment.f2672m = 2;
                            break;
                        case 3:
                            if (m.F0(3)) {
                                Log.d("FragmentManager", "movefrom ACTIVITY_CREATED: " + this.f2947c);
                            }
                            Fragment fragment4 = this.f2947c;
                            if (fragment4.T != null && fragment4.f2674o == null) {
                                s();
                            }
                            Fragment fragment5 = this.f2947c;
                            if (fragment5.T != null && (viewGroup3 = fragment5.S) != null) {
                                b0.n(viewGroup3, fragment5.J()).d(this);
                            }
                            this.f2947c.f2672m = 3;
                            break;
                        case 4:
                            v();
                            break;
                        case 5:
                            fragment.f2672m = 5;
                            break;
                        case 6:
                            n();
                            break;
                    }
                } else {
                    switch (i10 + 1) {
                        case 0:
                            c();
                            break;
                        case 1:
                            e();
                            break;
                        case 2:
                            j();
                            f();
                            break;
                        case 3:
                            a();
                            break;
                        case 4:
                            if (fragment.T != null && (viewGroup2 = fragment.S) != null) {
                                b0.n(viewGroup2, fragment.J()).b(b0.e.c.d(this.f2947c.T.getVisibility()), this);
                            }
                            this.f2947c.f2672m = 4;
                            break;
                        case 5:
                            u();
                            break;
                        case 6:
                            fragment.f2672m = 6;
                            break;
                        case AdSizeApi.RECTANGLE_HEIGHT_250 /* 7 */:
                            p();
                            break;
                    }
                }
            }
        } finally {
            this.f2948d = false;
        }
    }

    void n() {
        if (m.F0(3)) {
            Log.d("FragmentManager", "movefrom RESUMED: " + this.f2947c);
        }
        this.f2947c.j1();
        this.f2945a.f(this.f2947c, false);
    }

    void o(ClassLoader classLoader) {
        Bundle bundle = this.f2947c.f2673n;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        Fragment fragment = this.f2947c;
        fragment.f2674o = fragment.f2673n.getSparseParcelableArray("android:view_state");
        Fragment fragment2 = this.f2947c;
        fragment2.f2675p = fragment2.f2673n.getBundle("android:view_registry_state");
        Fragment fragment3 = this.f2947c;
        fragment3.f2680u = fragment3.f2673n.getString("android:target_state");
        Fragment fragment4 = this.f2947c;
        if (fragment4.f2680u != null) {
            fragment4.f2681v = fragment4.f2673n.getInt("android:target_req_state", 0);
        }
        Fragment fragment5 = this.f2947c;
        Boolean bool = fragment5.f2676q;
        if (bool != null) {
            fragment5.V = bool.booleanValue();
            this.f2947c.f2676q = null;
        } else {
            fragment5.V = fragment5.f2673n.getBoolean("android:user_visible_hint", true);
        }
        Fragment fragment6 = this.f2947c;
        if (fragment6.V) {
            return;
        }
        fragment6.U = true;
    }

    void p() {
        if (m.F0(3)) {
            Log.d("FragmentManager", "moveto RESUMED: " + this.f2947c);
        }
        View viewC = this.f2947c.C();
        if (viewC != null && l(viewC)) {
            boolean zRequestFocus = viewC.requestFocus();
            if (m.F0(2)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("requestFocus: Restoring focused view ");
                sb2.append(viewC);
                sb2.append(" ");
                sb2.append(zRequestFocus ? "succeeded" : "failed");
                sb2.append(" on Fragment ");
                sb2.append(this.f2947c);
                sb2.append(" resulting in focused view ");
                sb2.append(this.f2947c.T.findFocus());
                Log.v("FragmentManager", sb2.toString());
            }
        }
        this.f2947c.C1(null);
        this.f2947c.n1();
        this.f2945a.i(this.f2947c, false);
        Fragment fragment = this.f2947c;
        fragment.f2673n = null;
        fragment.f2674o = null;
        fragment.f2675p = null;
    }

    s r() {
        s sVar = new s(this.f2947c);
        Fragment fragment = this.f2947c;
        if (fragment.f2672m <= -1 || sVar.f2944y != null) {
            sVar.f2944y = fragment.f2673n;
        } else {
            Bundle bundleQ = q();
            sVar.f2944y = bundleQ;
            if (this.f2947c.f2680u != null) {
                if (bundleQ == null) {
                    sVar.f2944y = new Bundle();
                }
                sVar.f2944y.putString("android:target_state", this.f2947c.f2680u);
                int i10 = this.f2947c.f2681v;
                if (i10 != 0) {
                    sVar.f2944y.putInt("android:target_req_state", i10);
                }
            }
        }
        return sVar;
    }

    void s() {
        if (this.f2947c.T == null) {
            return;
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        this.f2947c.T.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            this.f2947c.f2674o = sparseArray;
        }
        Bundle bundle = new Bundle();
        this.f2947c.f2665f0.g(bundle);
        if (bundle.isEmpty()) {
            return;
        }
        this.f2947c.f2675p = bundle;
    }

    void t(int i10) {
        this.f2949e = i10;
    }

    void u() {
        if (m.F0(3)) {
            Log.d("FragmentManager", "moveto STARTED: " + this.f2947c);
        }
        this.f2947c.p1();
        this.f2945a.k(this.f2947c, false);
    }

    void v() {
        if (m.F0(3)) {
            Log.d("FragmentManager", "movefrom STARTED: " + this.f2947c);
        }
        this.f2947c.q1();
        this.f2945a.l(this.f2947c, false);
    }
}
