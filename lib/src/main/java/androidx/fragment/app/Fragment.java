package androidx.fragment.app;

import android.animation.Animator;
import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.g0;
import androidx.lifecycle.j;
import androidx.lifecycle.j0;
import androidx.lifecycle.k0;
import androidx.lifecycle.l0;
import androidx.lifecycle.m0;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public abstract class Fragment implements ComponentCallbacks, View.OnCreateContextMenuListener, androidx.lifecycle.n, k0, androidx.lifecycle.i, t0.e {

    /* renamed from: m0, reason: collision with root package name */
    static final Object f2659m0 = new Object();
    boolean A;
    boolean B;
    boolean C;
    int D;
    m E;
    j F;
    Fragment H;
    int I;
    int J;
    String K;
    boolean L;
    boolean M;
    boolean N;
    boolean O;
    boolean P;
    private boolean R;
    ViewGroup S;
    View T;
    boolean U;
    e W;
    boolean Y;
    boolean Z;

    /* renamed from: a0, reason: collision with root package name */
    float f2660a0;

    /* renamed from: b0, reason: collision with root package name */
    LayoutInflater f2661b0;

    /* renamed from: c0, reason: collision with root package name */
    boolean f2662c0;

    /* renamed from: e0, reason: collision with root package name */
    androidx.lifecycle.o f2664e0;

    /* renamed from: f0, reason: collision with root package name */
    z f2665f0;

    /* renamed from: h0, reason: collision with root package name */
    g0.b f2667h0;

    /* renamed from: i0, reason: collision with root package name */
    t0.d f2668i0;

    /* renamed from: j0, reason: collision with root package name */
    private int f2669j0;

    /* renamed from: n, reason: collision with root package name */
    Bundle f2673n;

    /* renamed from: o, reason: collision with root package name */
    SparseArray f2674o;

    /* renamed from: p, reason: collision with root package name */
    Bundle f2675p;

    /* renamed from: q, reason: collision with root package name */
    Boolean f2676q;

    /* renamed from: s, reason: collision with root package name */
    Bundle f2678s;

    /* renamed from: t, reason: collision with root package name */
    Fragment f2679t;

    /* renamed from: v, reason: collision with root package name */
    int f2681v;

    /* renamed from: x, reason: collision with root package name */
    boolean f2683x;

    /* renamed from: y, reason: collision with root package name */
    boolean f2684y;

    /* renamed from: z, reason: collision with root package name */
    boolean f2685z;

    /* renamed from: m, reason: collision with root package name */
    int f2672m = -1;

    /* renamed from: r, reason: collision with root package name */
    String f2677r = UUID.randomUUID().toString();

    /* renamed from: u, reason: collision with root package name */
    String f2680u = null;

    /* renamed from: w, reason: collision with root package name */
    private Boolean f2682w = null;
    m G = new n();
    boolean Q = true;
    boolean V = true;
    Runnable X = new a();

    /* renamed from: d0, reason: collision with root package name */
    j.c f2663d0 = j.c.RESUMED;

    /* renamed from: g0, reason: collision with root package name */
    androidx.lifecycle.s f2666g0 = new androidx.lifecycle.s();

    /* renamed from: k0, reason: collision with root package name */
    private final AtomicInteger f2670k0 = new AtomicInteger();

    /* renamed from: l0, reason: collision with root package name */
    private final ArrayList f2671l0 = new ArrayList();

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Fragment.this.K1();
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Fragment.this.f(false);
        }
    }

    class c implements Runnable {

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ b0 f2689m;

        c(b0 b0Var) {
            this.f2689m = b0Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f2689m.g();
        }
    }

    class d extends androidx.fragment.app.g {
        d() {
        }

        @Override // androidx.fragment.app.g
        public View e(int i10) {
            View view = Fragment.this.T;
            if (view != null) {
                return view.findViewById(i10);
            }
            throw new IllegalStateException("Fragment " + Fragment.this + " does not have a view");
        }

        @Override // androidx.fragment.app.g
        public boolean f() {
            return Fragment.this.T != null;
        }
    }

    static class e {

        /* renamed from: a, reason: collision with root package name */
        View f2692a;

        /* renamed from: b, reason: collision with root package name */
        Animator f2693b;

        /* renamed from: c, reason: collision with root package name */
        boolean f2694c;

        /* renamed from: d, reason: collision with root package name */
        int f2695d;

        /* renamed from: e, reason: collision with root package name */
        int f2696e;

        /* renamed from: f, reason: collision with root package name */
        int f2697f;

        /* renamed from: g, reason: collision with root package name */
        int f2698g;

        /* renamed from: h, reason: collision with root package name */
        int f2699h;

        /* renamed from: i, reason: collision with root package name */
        ArrayList f2700i;

        /* renamed from: j, reason: collision with root package name */
        ArrayList f2701j;

        /* renamed from: k, reason: collision with root package name */
        Object f2702k = null;

        /* renamed from: l, reason: collision with root package name */
        Object f2703l;

        /* renamed from: m, reason: collision with root package name */
        Object f2704m;

        /* renamed from: n, reason: collision with root package name */
        Object f2705n;

        /* renamed from: o, reason: collision with root package name */
        Object f2706o;

        /* renamed from: p, reason: collision with root package name */
        Object f2707p;

        /* renamed from: q, reason: collision with root package name */
        Boolean f2708q;

        /* renamed from: r, reason: collision with root package name */
        Boolean f2709r;

        /* renamed from: s, reason: collision with root package name */
        float f2710s;

        /* renamed from: t, reason: collision with root package name */
        View f2711t;

        /* renamed from: u, reason: collision with root package name */
        boolean f2712u;

        /* renamed from: v, reason: collision with root package name */
        g f2713v;

        /* renamed from: w, reason: collision with root package name */
        boolean f2714w;

        e() {
            Object obj = Fragment.f2659m0;
            this.f2703l = obj;
            this.f2704m = null;
            this.f2705n = obj;
            this.f2706o = null;
            this.f2707p = obj;
            this.f2710s = 1.0f;
            this.f2711t = null;
        }
    }

    public static class f extends RuntimeException {
        public f(String str, Exception exc) {
            super(str, exc);
        }
    }

    interface g {
        void a();

        void b();
    }

    public Fragment() {
        Z();
    }

    private int G() {
        j.c cVar = this.f2663d0;
        return (cVar == j.c.INITIALIZED || this.H == null) ? cVar.ordinal() : Math.min(cVar.ordinal(), this.H.G());
    }

    private void Z() {
        this.f2664e0 = new androidx.lifecycle.o(this);
        this.f2668i0 = t0.d.a(this);
        this.f2667h0 = null;
    }

    public static Fragment b0(Context context, String str, Bundle bundle) {
        try {
            Fragment fragment = (Fragment) i.d(context.getClassLoader(), str).getConstructor(new Class[0]).newInstance(new Object[0]);
            if (bundle != null) {
                bundle.setClassLoader(fragment.getClass().getClassLoader());
                fragment.B1(bundle);
            }
            return fragment;
        } catch (IllegalAccessException e5) {
            throw new f("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e5);
        } catch (InstantiationException e10) {
            throw new f("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e10);
        } catch (NoSuchMethodException e11) {
            throw new f("Unable to instantiate fragment " + str + ": could not find Fragment constructor", e11);
        } catch (InvocationTargetException e12) {
            throw new f("Unable to instantiate fragment " + str + ": calling Fragment constructor caused an exception", e12);
        }
    }

    private e i() {
        if (this.W == null) {
            this.W = new e();
        }
        return this.W;
    }

    private void w1() {
        if (m.F0(3)) {
            Log.d("FragmentManager", "moveto RESTORE_VIEW_STATE: " + this);
        }
        if (this.T != null) {
            x1(this.f2673n);
        }
        this.f2673n = null;
    }

    public Object A() {
        e eVar = this.W;
        if (eVar == null) {
            return null;
        }
        return eVar.f2704m;
    }

    public void A0() {
        this.R = true;
    }

    void A1(Animator animator) {
        i().f2693b = animator;
    }

    androidx.core.app.r B() {
        e eVar = this.W;
        if (eVar == null) {
            return null;
        }
        Objects.requireNonNull(eVar);
        return null;
    }

    public void B0() {
        this.R = true;
    }

    public void B1(Bundle bundle) {
        if (this.E != null && k0()) {
            throw new IllegalStateException("Fragment already added and state has been saved");
        }
        this.f2678s = bundle;
    }

    View C() {
        e eVar = this.W;
        if (eVar == null) {
            return null;
        }
        return eVar.f2711t;
    }

    public LayoutInflater C0(Bundle bundle) {
        return F(bundle);
    }

    void C1(View view) {
        i().f2711t = view;
    }

    public final m D() {
        return this.E;
    }

    public void D0(boolean z10) {
    }

    void D1(boolean z10) {
        i().f2714w = z10;
    }

    public final Object E() {
        j jVar = this.F;
        if (jVar == null) {
            return null;
        }
        return jVar.j();
    }

    public void E0(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        this.R = true;
    }

    void E1(int i10) {
        if (this.W == null && i10 == 0) {
            return;
        }
        i();
        this.W.f2699h = i10;
    }

    public LayoutInflater F(Bundle bundle) {
        j jVar = this.F;
        if (jVar == null) {
            throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
        }
        LayoutInflater layoutInflaterK = jVar.k();
        androidx.core.view.g.a(layoutInflaterK, this.G.u0());
        return layoutInflaterK;
    }

    public void F0(Context context, AttributeSet attributeSet, Bundle bundle) {
        this.R = true;
        j jVar = this.F;
        Activity activityG = jVar == null ? null : jVar.g();
        if (activityG != null) {
            this.R = false;
            E0(activityG, attributeSet, bundle);
        }
    }

    void F1(g gVar) {
        i();
        e eVar = this.W;
        g gVar2 = eVar.f2713v;
        if (gVar == gVar2) {
            return;
        }
        if (gVar != null && gVar2 != null) {
            throw new IllegalStateException("Trying to set a replacement startPostponedEnterTransition on " + this);
        }
        if (eVar.f2712u) {
            eVar.f2713v = gVar;
        }
        if (gVar != null) {
            gVar.b();
        }
    }

    public void G0(boolean z10) {
    }

    void G1(boolean z10) {
        if (this.W == null) {
            return;
        }
        i().f2694c = z10;
    }

    int H() {
        e eVar = this.W;
        if (eVar == null) {
            return 0;
        }
        return eVar.f2699h;
    }

    public boolean H0(MenuItem menuItem) {
        return false;
    }

    void H1(float f5) {
        i().f2710s = f5;
    }

    public final Fragment I() {
        return this.H;
    }

    public void I0(Menu menu) {
    }

    void I1(ArrayList arrayList, ArrayList arrayList2) {
        i();
        e eVar = this.W;
        eVar.f2700i = arrayList;
        eVar.f2701j = arrayList2;
    }

    public final m J() {
        m mVar = this.E;
        if (mVar != null) {
            return mVar;
        }
        throw new IllegalStateException("Fragment " + this + " not associated with a fragment manager.");
    }

    public void J0() {
        this.R = true;
    }

    public void J1(Intent intent, int i10, Bundle bundle) {
        if (this.F != null) {
            J().L0(this, intent, i10, bundle);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    boolean K() {
        e eVar = this.W;
        if (eVar == null) {
            return false;
        }
        return eVar.f2694c;
    }

    public void K0(boolean z10) {
    }

    public void K1() {
        if (this.W == null || !i().f2712u) {
            return;
        }
        if (this.F == null) {
            i().f2712u = false;
        } else if (Looper.myLooper() != this.F.i().getLooper()) {
            this.F.i().postAtFrontOfQueue(new b());
        } else {
            f(true);
        }
    }

    int L() {
        e eVar = this.W;
        if (eVar == null) {
            return 0;
        }
        return eVar.f2697f;
    }

    public void L0(Menu menu) {
    }

    int M() {
        e eVar = this.W;
        if (eVar == null) {
            return 0;
        }
        return eVar.f2698g;
    }

    public void M0(boolean z10) {
    }

    float N() {
        e eVar = this.W;
        if (eVar == null) {
            return 1.0f;
        }
        return eVar.f2710s;
    }

    public void N0(int i10, String[] strArr, int[] iArr) {
    }

    public Object O() {
        e eVar = this.W;
        if (eVar == null) {
            return null;
        }
        Object obj = eVar.f2705n;
        return obj == f2659m0 ? A() : obj;
    }

    public void O0() {
        this.R = true;
    }

    public final Resources P() {
        return t1().getResources();
    }

    public void P0(Bundle bundle) {
    }

    public Object Q() {
        e eVar = this.W;
        if (eVar == null) {
            return null;
        }
        Object obj = eVar.f2703l;
        return obj == f2659m0 ? x() : obj;
    }

    public void Q0() {
        this.R = true;
    }

    public Object R() {
        e eVar = this.W;
        if (eVar == null) {
            return null;
        }
        return eVar.f2706o;
    }

    public void R0() {
        this.R = true;
    }

    public Object S() {
        e eVar = this.W;
        if (eVar == null) {
            return null;
        }
        Object obj = eVar.f2707p;
        return obj == f2659m0 ? R() : obj;
    }

    public void S0(View view, Bundle bundle) {
    }

    ArrayList T() {
        ArrayList arrayList;
        e eVar = this.W;
        return (eVar == null || (arrayList = eVar.f2700i) == null) ? new ArrayList() : arrayList;
    }

    public void T0(Bundle bundle) {
        this.R = true;
    }

    ArrayList U() {
        ArrayList arrayList;
        e eVar = this.W;
        return (eVar == null || (arrayList = eVar.f2701j) == null) ? new ArrayList() : arrayList;
    }

    void U0(Bundle bundle) {
        this.G.R0();
        this.f2672m = 3;
        this.R = false;
        n0(bundle);
        if (this.R) {
            w1();
            this.G.y();
        } else {
            throw new d0("Fragment " + this + " did not call through to super.onActivityCreated()");
        }
    }

    public final String V(int i10) {
        return P().getString(i10);
    }

    void V0() {
        Iterator it = this.f2671l0.iterator();
        if (it.hasNext()) {
            a5.a.a(it.next());
            throw null;
        }
        this.f2671l0.clear();
        this.G.j(this.F, g(), this);
        this.f2672m = 0;
        this.R = false;
        q0(this.F.h());
        if (this.R) {
            this.E.I(this);
            this.G.z();
        } else {
            throw new d0("Fragment " + this + " did not call through to super.onAttach()");
        }
    }

    public final Fragment W() {
        String str;
        Fragment fragment = this.f2679t;
        if (fragment != null) {
            return fragment;
        }
        m mVar = this.E;
        if (mVar == null || (str = this.f2680u) == null) {
            return null;
        }
        return mVar.g0(str);
    }

    void W0(Configuration configuration) {
        onConfigurationChanged(configuration);
        this.G.A(configuration);
    }

    public View X() {
        return this.T;
    }

    boolean X0(MenuItem menuItem) {
        if (this.L) {
            return false;
        }
        if (s0(menuItem)) {
            return true;
        }
        return this.G.B(menuItem);
    }

    public LiveData Y() {
        return this.f2666g0;
    }

    void Y0(Bundle bundle) {
        this.G.R0();
        this.f2672m = 1;
        this.R = false;
        this.f2664e0.a(new androidx.lifecycle.l() { // from class: androidx.fragment.app.Fragment.5
            @Override // androidx.lifecycle.l
            public void d(androidx.lifecycle.n nVar, j.b bVar) {
                View view;
                if (bVar != j.b.ON_STOP || (view = Fragment.this.T) == null) {
                    return;
                }
                view.cancelPendingInputEvents();
            }
        });
        this.f2668i0.d(bundle);
        t0(bundle);
        this.f2662c0 = true;
        if (this.R) {
            this.f2664e0.h(j.b.ON_CREATE);
            return;
        }
        throw new d0("Fragment " + this + " did not call through to super.onCreate()");
    }

    boolean Z0(Menu menu, MenuInflater menuInflater) {
        boolean z10 = false;
        if (this.L) {
            return false;
        }
        if (this.P && this.Q) {
            z10 = true;
            w0(menu, menuInflater);
        }
        return z10 | this.G.D(menu, menuInflater);
    }

    void a0() {
        Z();
        this.f2677r = UUID.randomUUID().toString();
        this.f2683x = false;
        this.f2684y = false;
        this.f2685z = false;
        this.A = false;
        this.B = false;
        this.D = 0;
        this.E = null;
        this.G = new n();
        this.F = null;
        this.I = 0;
        this.J = 0;
        this.K = null;
        this.L = false;
        this.M = false;
    }

    void a1(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.G.R0();
        this.C = true;
        this.f2665f0 = new z(this, r());
        View viewX0 = x0(layoutInflater, viewGroup, bundle);
        this.T = viewX0;
        if (viewX0 == null) {
            if (this.f2665f0.e()) {
                throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
            }
            this.f2665f0 = null;
        } else {
            this.f2665f0.d();
            l0.a(this.T, this.f2665f0);
            m0.a(this.T, this.f2665f0);
            t0.f.a(this.T, this.f2665f0);
            this.f2666g0.k(this.f2665f0);
        }
    }

    void b1() {
        this.G.E();
        this.f2664e0.h(j.b.ON_DESTROY);
        this.f2672m = 0;
        this.R = false;
        this.f2662c0 = false;
        y0();
        if (this.R) {
            return;
        }
        throw new d0("Fragment " + this + " did not call through to super.onDestroy()");
    }

    @Override // t0.e
    public final t0.c c() {
        return this.f2668i0.b();
    }

    public final boolean c0() {
        return this.F != null && this.f2683x;
    }

    void c1() {
        this.G.F();
        if (this.T != null && this.f2665f0.s().b().b(j.c.CREATED)) {
            this.f2665f0.a(j.b.ON_DESTROY);
        }
        this.f2672m = 1;
        this.R = false;
        A0();
        if (this.R) {
            androidx.loader.app.a.b(this).c();
            this.C = false;
        } else {
            throw new d0("Fragment " + this + " did not call through to super.onDestroyView()");
        }
    }

    public final boolean d0() {
        return this.L;
    }

    void d1() {
        this.f2672m = -1;
        this.R = false;
        B0();
        this.f2661b0 = null;
        if (this.R) {
            if (this.G.E0()) {
                return;
            }
            this.G.E();
            this.G = new n();
            return;
        }
        throw new d0("Fragment " + this + " did not call through to super.onDetach()");
    }

    boolean e0() {
        e eVar = this.W;
        if (eVar == null) {
            return false;
        }
        return eVar.f2714w;
    }

    LayoutInflater e1(Bundle bundle) {
        LayoutInflater layoutInflaterC0 = C0(bundle);
        this.f2661b0 = layoutInflaterC0;
        return layoutInflaterC0;
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    void f(boolean z10) {
        ViewGroup viewGroup;
        m mVar;
        e eVar = this.W;
        g gVar = null;
        if (eVar != null) {
            eVar.f2712u = false;
            g gVar2 = eVar.f2713v;
            eVar.f2713v = null;
            gVar = gVar2;
        }
        if (gVar != null) {
            gVar.a();
            return;
        }
        if (!m.P || this.T == null || (viewGroup = this.S) == null || (mVar = this.E) == null) {
            return;
        }
        b0 b0VarN = b0.n(viewGroup, mVar);
        b0VarN.p();
        if (z10) {
            this.F.i().post(new c(b0VarN));
        } else {
            b0VarN.g();
        }
    }

    final boolean f0() {
        return this.D > 0;
    }

    void f1() {
        onLowMemory();
        this.G.G();
    }

    androidx.fragment.app.g g() {
        return new d();
    }

    public final boolean g0() {
        m mVar;
        return this.Q && ((mVar = this.E) == null || mVar.H0(this.H));
    }

    void g1(boolean z10) {
        G0(z10);
        this.G.H(z10);
    }

    public void h(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.I));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.J));
        printWriter.print(" mTag=");
        printWriter.println(this.K);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.f2672m);
        printWriter.print(" mWho=");
        printWriter.print(this.f2677r);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.D);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.f2683x);
        printWriter.print(" mRemoving=");
        printWriter.print(this.f2684y);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.f2685z);
        printWriter.print(" mInLayout=");
        printWriter.println(this.A);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.L);
        printWriter.print(" mDetached=");
        printWriter.print(this.M);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.Q);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.P);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.N);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.V);
        if (this.E != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.E);
        }
        if (this.F != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.F);
        }
        if (this.H != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.H);
        }
        if (this.f2678s != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.f2678s);
        }
        if (this.f2673n != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.f2673n);
        }
        if (this.f2674o != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.f2674o);
        }
        if (this.f2675p != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewRegistryState=");
            printWriter.println(this.f2675p);
        }
        Fragment fragmentW = W();
        if (fragmentW != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(fragmentW);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.f2681v);
        }
        printWriter.print(str);
        printWriter.print("mPopDirection=");
        printWriter.println(K());
        if (w() != 0) {
            printWriter.print(str);
            printWriter.print("getEnterAnim=");
            printWriter.println(w());
        }
        if (z() != 0) {
            printWriter.print(str);
            printWriter.print("getExitAnim=");
            printWriter.println(z());
        }
        if (L() != 0) {
            printWriter.print(str);
            printWriter.print("getPopEnterAnim=");
            printWriter.println(L());
        }
        if (M() != 0) {
            printWriter.print(str);
            printWriter.print("getPopExitAnim=");
            printWriter.println(M());
        }
        if (this.S != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.S);
        }
        if (this.T != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.T);
        }
        if (p() != null) {
            printWriter.print(str);
            printWriter.print("mAnimatingAway=");
            printWriter.println(p());
        }
        if (v() != null) {
            androidx.loader.app.a.b(this).a(str, fileDescriptor, printWriter, strArr);
        }
        printWriter.print(str);
        printWriter.println("Child " + this.G + ":");
        this.G.W(str + "  ", fileDescriptor, printWriter, strArr);
    }

    boolean h0() {
        e eVar = this.W;
        if (eVar == null) {
            return false;
        }
        return eVar.f2712u;
    }

    boolean h1(MenuItem menuItem) {
        if (this.L) {
            return false;
        }
        if (this.P && this.Q && H0(menuItem)) {
            return true;
        }
        return this.G.J(menuItem);
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public final boolean i0() {
        return this.f2684y;
    }

    void i1(Menu menu) {
        if (this.L) {
            return;
        }
        if (this.P && this.Q) {
            I0(menu);
        }
        this.G.K(menu);
    }

    Fragment j(String str) {
        return str.equals(this.f2677r) ? this : this.G.j0(str);
    }

    final boolean j0() {
        Fragment fragmentI = I();
        return fragmentI != null && (fragmentI.i0() || fragmentI.j0());
    }

    void j1() {
        this.G.M();
        if (this.T != null) {
            this.f2665f0.a(j.b.ON_PAUSE);
        }
        this.f2664e0.h(j.b.ON_PAUSE);
        this.f2672m = 6;
        this.R = false;
        J0();
        if (this.R) {
            return;
        }
        throw new d0("Fragment " + this + " did not call through to super.onPause()");
    }

    public final androidx.fragment.app.e k() {
        j jVar = this.F;
        if (jVar == null) {
            return null;
        }
        return (androidx.fragment.app.e) jVar.g();
    }

    public final boolean k0() {
        m mVar = this.E;
        if (mVar == null) {
            return false;
        }
        return mVar.K0();
    }

    void k1(boolean z10) {
        K0(z10);
        this.G.N(z10);
    }

    @Override // androidx.lifecycle.i
    public g0.b l() {
        if (this.E == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (this.f2667h0 == null) {
            Application application = null;
            Context applicationContext = t1().getApplicationContext();
            while (true) {
                if (!(applicationContext instanceof ContextWrapper)) {
                    break;
                }
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                    break;
                }
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            }
            if (application == null && m.F0(3)) {
                Log.d("FragmentManager", "Could not find Application instance from Context " + t1().getApplicationContext() + ", you will not be able to use AndroidViewModel with the default ViewModelProvider.Factory");
            }
            this.f2667h0 = new androidx.lifecycle.c0(application, this, t());
        }
        return this.f2667h0;
    }

    public final boolean l0() {
        View view;
        return (!c0() || d0() || (view = this.T) == null || view.getWindowToken() == null || this.T.getVisibility() != 0) ? false : true;
    }

    boolean l1(Menu menu) {
        boolean z10 = false;
        if (this.L) {
            return false;
        }
        if (this.P && this.Q) {
            z10 = true;
            L0(menu);
        }
        return z10 | this.G.O(menu);
    }

    @Override // androidx.lifecycle.i
    public /* synthetic */ n0.a m() {
        return androidx.lifecycle.h.a(this);
    }

    void m0() {
        this.G.R0();
    }

    void m1() {
        boolean zI0 = this.E.I0(this);
        Boolean bool = this.f2682w;
        if (bool == null || bool.booleanValue() != zI0) {
            this.f2682w = Boolean.valueOf(zI0);
            M0(zI0);
            this.G.P();
        }
    }

    public boolean n() {
        Boolean bool;
        e eVar = this.W;
        if (eVar == null || (bool = eVar.f2709r) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public void n0(Bundle bundle) {
        this.R = true;
    }

    void n1() {
        this.G.R0();
        this.G.a0(true);
        this.f2672m = 7;
        this.R = false;
        O0();
        if (!this.R) {
            throw new d0("Fragment " + this + " did not call through to super.onResume()");
        }
        androidx.lifecycle.o oVar = this.f2664e0;
        j.b bVar = j.b.ON_RESUME;
        oVar.h(bVar);
        if (this.T != null) {
            this.f2665f0.a(bVar);
        }
        this.G.Q();
    }

    public boolean o() {
        Boolean bool;
        e eVar = this.W;
        if (eVar == null || (bool = eVar.f2708q) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public void o0(int i10, int i11, Intent intent) {
        if (m.F0(2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in onActivityResult(): requestCode: " + i10 + " resultCode: " + i11 + " data: " + intent);
        }
    }

    void o1(Bundle bundle) {
        P0(bundle);
        this.f2668i0.e(bundle);
        Parcelable parcelableG1 = this.G.g1();
        if (parcelableG1 != null) {
            bundle.putParcelable("android:support:fragments", parcelableG1);
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        this.R = true;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        s1().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        this.R = true;
    }

    View p() {
        e eVar = this.W;
        if (eVar == null) {
            return null;
        }
        return eVar.f2692a;
    }

    public void p0(Activity activity) {
        this.R = true;
    }

    void p1() {
        this.G.R0();
        this.G.a0(true);
        this.f2672m = 5;
        this.R = false;
        Q0();
        if (!this.R) {
            throw new d0("Fragment " + this + " did not call through to super.onStart()");
        }
        androidx.lifecycle.o oVar = this.f2664e0;
        j.b bVar = j.b.ON_START;
        oVar.h(bVar);
        if (this.T != null) {
            this.f2665f0.a(bVar);
        }
        this.G.R();
    }

    Animator q() {
        e eVar = this.W;
        if (eVar == null) {
            return null;
        }
        return eVar.f2693b;
    }

    public void q0(Context context) {
        this.R = true;
        j jVar = this.F;
        Activity activityG = jVar == null ? null : jVar.g();
        if (activityG != null) {
            this.R = false;
            p0(activityG);
        }
    }

    void q1() {
        this.G.T();
        if (this.T != null) {
            this.f2665f0.a(j.b.ON_STOP);
        }
        this.f2664e0.h(j.b.ON_STOP);
        this.f2672m = 4;
        this.R = false;
        R0();
        if (this.R) {
            return;
        }
        throw new d0("Fragment " + this + " did not call through to super.onStop()");
    }

    @Override // androidx.lifecycle.k0
    public j0 r() {
        if (this.E == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (G() != j.c.INITIALIZED.ordinal()) {
            return this.E.A0(this);
        }
        throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
    }

    public void r0(Fragment fragment) {
    }

    void r1() {
        S0(this.T, this.f2673n);
        this.G.U();
    }

    @Override // androidx.lifecycle.n
    public androidx.lifecycle.j s() {
        return this.f2664e0;
    }

    public boolean s0(MenuItem menuItem) {
        return false;
    }

    public final androidx.fragment.app.e s1() {
        androidx.fragment.app.e eVarK = k();
        if (eVarK != null) {
            return eVarK;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to an activity.");
    }

    public void startActivityForResult(Intent intent, int i10) {
        J1(intent, i10, null);
    }

    public final Bundle t() {
        return this.f2678s;
    }

    public void t0(Bundle bundle) {
        this.R = true;
        v1(bundle);
        if (this.G.J0(1)) {
            return;
        }
        this.G.C();
    }

    public final Context t1() {
        Context contextV = v();
        if (contextV != null) {
            return contextV;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append(getClass().getSimpleName());
        sb2.append("{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("}");
        sb2.append(" (");
        sb2.append(this.f2677r);
        if (this.I != 0) {
            sb2.append(" id=0x");
            sb2.append(Integer.toHexString(this.I));
        }
        if (this.K != null) {
            sb2.append(" tag=");
            sb2.append(this.K);
        }
        sb2.append(")");
        return sb2.toString();
    }

    public final m u() {
        if (this.F != null) {
            return this.G;
        }
        throw new IllegalStateException("Fragment " + this + " has not been attached yet.");
    }

    public Animation u0(int i10, boolean z10, int i11) {
        return null;
    }

    public final View u1() {
        View viewX = X();
        if (viewX != null) {
            return viewX;
        }
        throw new IllegalStateException("Fragment " + this + " did not return a View from onCreateView() or this was called before onCreateView().");
    }

    public Context v() {
        j jVar = this.F;
        if (jVar == null) {
            return null;
        }
        return jVar.h();
    }

    public Animator v0(int i10, boolean z10, int i11) {
        return null;
    }

    void v1(Bundle bundle) {
        Parcelable parcelable;
        if (bundle == null || (parcelable = bundle.getParcelable("android:support:fragments")) == null) {
            return;
        }
        this.G.e1(parcelable);
        this.G.C();
    }

    int w() {
        e eVar = this.W;
        if (eVar == null) {
            return 0;
        }
        return eVar.f2695d;
    }

    public void w0(Menu menu, MenuInflater menuInflater) {
    }

    public Object x() {
        e eVar = this.W;
        if (eVar == null) {
            return null;
        }
        return eVar.f2702k;
    }

    public View x0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i10 = this.f2669j0;
        if (i10 != 0) {
            return layoutInflater.inflate(i10, viewGroup, false);
        }
        return null;
    }

    final void x1(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = this.f2674o;
        if (sparseArray != null) {
            this.T.restoreHierarchyState(sparseArray);
            this.f2674o = null;
        }
        if (this.T != null) {
            this.f2665f0.f(this.f2675p);
            this.f2675p = null;
        }
        this.R = false;
        T0(bundle);
        if (this.R) {
            if (this.T != null) {
                this.f2665f0.a(j.b.ON_CREATE);
            }
        } else {
            throw new d0("Fragment " + this + " did not call through to super.onViewStateRestored()");
        }
    }

    androidx.core.app.r y() {
        e eVar = this.W;
        if (eVar == null) {
            return null;
        }
        Objects.requireNonNull(eVar);
        return null;
    }

    public void y0() {
        this.R = true;
    }

    void y1(View view) {
        i().f2692a = view;
    }

    int z() {
        e eVar = this.W;
        if (eVar == null) {
            return 0;
        }
        return eVar.f2696e;
    }

    public void z0() {
    }

    void z1(int i10, int i11, int i12, int i13) {
        if (this.W == null && i10 == 0 && i11 == 0 && i12 == 0 && i13 == 0) {
            return;
        }
        i().f2695d = i10;
        i().f2696e = i11;
        i().f2697f = i12;
        i().f2698g = i13;
    }
}
