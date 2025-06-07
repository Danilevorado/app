package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.result.e;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.f;
import androidx.fragment.app.v;
import androidx.fragment.app.w;
import androidx.lifecycle.j;
import androidx.lifecycle.j0;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public abstract class m {
    private static boolean O = false;
    static boolean P = true;
    private androidx.activity.result.c A;
    private androidx.activity.result.c B;
    private boolean D;
    private boolean E;
    private boolean F;
    private boolean G;
    private boolean H;
    private ArrayList I;
    private ArrayList J;
    private ArrayList K;
    private ArrayList L;
    private androidx.fragment.app.p M;

    /* renamed from: b, reason: collision with root package name */
    private boolean f2868b;

    /* renamed from: d, reason: collision with root package name */
    ArrayList f2870d;

    /* renamed from: e, reason: collision with root package name */
    private ArrayList f2871e;

    /* renamed from: g, reason: collision with root package name */
    private OnBackPressedDispatcher f2873g;

    /* renamed from: l, reason: collision with root package name */
    private ArrayList f2878l;

    /* renamed from: r, reason: collision with root package name */
    private androidx.fragment.app.j f2884r;

    /* renamed from: s, reason: collision with root package name */
    private androidx.fragment.app.g f2885s;

    /* renamed from: t, reason: collision with root package name */
    private Fragment f2886t;

    /* renamed from: u, reason: collision with root package name */
    Fragment f2887u;

    /* renamed from: z, reason: collision with root package name */
    private androidx.activity.result.c f2892z;

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList f2867a = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private final u f2869c = new u();

    /* renamed from: f, reason: collision with root package name */
    private final androidx.fragment.app.k f2872f = new androidx.fragment.app.k(this);

    /* renamed from: h, reason: collision with root package name */
    private final androidx.activity.g f2874h = new c(false);

    /* renamed from: i, reason: collision with root package name */
    private final AtomicInteger f2875i = new AtomicInteger();

    /* renamed from: j, reason: collision with root package name */
    private final Map f2876j = Collections.synchronizedMap(new HashMap());

    /* renamed from: k, reason: collision with root package name */
    private final Map f2877k = Collections.synchronizedMap(new HashMap());

    /* renamed from: m, reason: collision with root package name */
    private Map f2879m = Collections.synchronizedMap(new HashMap());

    /* renamed from: n, reason: collision with root package name */
    private final w.g f2880n = new d();

    /* renamed from: o, reason: collision with root package name */
    private final androidx.fragment.app.l f2881o = new androidx.fragment.app.l(this);

    /* renamed from: p, reason: collision with root package name */
    private final CopyOnWriteArrayList f2882p = new CopyOnWriteArrayList();

    /* renamed from: q, reason: collision with root package name */
    int f2883q = -1;

    /* renamed from: v, reason: collision with root package name */
    private androidx.fragment.app.i f2888v = null;

    /* renamed from: w, reason: collision with root package name */
    private androidx.fragment.app.i f2889w = new e();

    /* renamed from: x, reason: collision with root package name */
    private c0 f2890x = null;

    /* renamed from: y, reason: collision with root package name */
    private c0 f2891y = new f();
    ArrayDeque C = new ArrayDeque();
    private Runnable N = new g();

    class a implements androidx.activity.result.b {
        a() {
        }

        @Override // androidx.activity.result.b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(androidx.activity.result.a aVar) {
            C0045m c0045m = (C0045m) m.this.C.pollFirst();
            if (c0045m == null) {
                Log.w("FragmentManager", "No IntentSenders were started for " + this);
                return;
            }
            String str = c0045m.f2907m;
            int i10 = c0045m.f2908n;
            Fragment fragmentI = m.this.f2869c.i(str);
            if (fragmentI != null) {
                fragmentI.o0(i10, aVar.b(), aVar.a());
                return;
            }
            Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str);
        }
    }

    class b implements androidx.activity.result.b {
        b() {
        }

        @Override // androidx.activity.result.b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(Map map) {
            StringBuilder sb2;
            String[] strArr = (String[]) map.keySet().toArray(new String[0]);
            ArrayList arrayList = new ArrayList(map.values());
            int[] iArr = new int[arrayList.size()];
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                iArr[i10] = ((Boolean) arrayList.get(i10)).booleanValue() ? 0 : -1;
            }
            C0045m c0045m = (C0045m) m.this.C.pollFirst();
            if (c0045m == null) {
                sb2 = new StringBuilder();
                sb2.append("No permissions were requested for ");
                sb2.append(this);
            } else {
                String str = c0045m.f2907m;
                int i11 = c0045m.f2908n;
                Fragment fragmentI = m.this.f2869c.i(str);
                if (fragmentI != null) {
                    fragmentI.N0(i11, strArr, iArr);
                    return;
                } else {
                    sb2 = new StringBuilder();
                    sb2.append("Permission request result delivered for unknown Fragment ");
                    sb2.append(str);
                }
            }
            Log.w("FragmentManager", sb2.toString());
        }
    }

    class c extends androidx.activity.g {
        c(boolean z10) {
            super(z10);
        }

        @Override // androidx.activity.g
        public void b() {
            m.this.B0();
        }
    }

    class d implements w.g {
        d() {
        }

        @Override // androidx.fragment.app.w.g
        public void a(Fragment fragment, androidx.core.os.e eVar) {
            if (eVar.c()) {
                return;
            }
            m.this.a1(fragment, eVar);
        }

        @Override // androidx.fragment.app.w.g
        public void b(Fragment fragment, androidx.core.os.e eVar) {
            m.this.f(fragment, eVar);
        }
    }

    class e extends androidx.fragment.app.i {
        e() {
        }

        @Override // androidx.fragment.app.i
        public Fragment a(ClassLoader classLoader, String str) {
            return m.this.t0().d(m.this.t0().h(), str, null);
        }
    }

    class f implements c0 {
        f() {
        }

        @Override // androidx.fragment.app.c0
        public b0 a(ViewGroup viewGroup) {
            return new androidx.fragment.app.c(viewGroup);
        }
    }

    class g implements Runnable {
        g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            m.this.a0(true);
        }
    }

    class h extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ViewGroup f2900a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f2901b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Fragment f2902c;

        h(ViewGroup viewGroup, View view, Fragment fragment) {
            this.f2900a = viewGroup;
            this.f2901b = view;
            this.f2902c = fragment;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f2900a.endViewTransition(this.f2901b);
            animator.removeListener(this);
            Fragment fragment = this.f2902c;
            View view = fragment.T;
            if (view == null || !fragment.L) {
                return;
            }
            view.setVisibility(8);
        }
    }

    class i implements androidx.fragment.app.q {

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ Fragment f2904m;

        i(Fragment fragment) {
            this.f2904m = fragment;
        }

        @Override // androidx.fragment.app.q
        public void a(m mVar, Fragment fragment) {
            this.f2904m.r0(fragment);
        }
    }

    class j implements androidx.activity.result.b {
        j() {
        }

        @Override // androidx.activity.result.b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(androidx.activity.result.a aVar) {
            C0045m c0045m = (C0045m) m.this.C.pollFirst();
            if (c0045m == null) {
                Log.w("FragmentManager", "No Activities were started for result for " + this);
                return;
            }
            String str = c0045m.f2907m;
            int i10 = c0045m.f2908n;
            Fragment fragmentI = m.this.f2869c.i(str);
            if (fragmentI != null) {
                fragmentI.o0(i10, aVar.b(), aVar.a());
                return;
            }
            Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str);
        }
    }

    static class k extends e.a {
        k() {
        }

        @Override // e.a
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public Intent a(Context context, androidx.activity.result.e eVar) {
            Bundle bundleExtra;
            Intent intent = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
            Intent intentA = eVar.a();
            if (intentA != null && (bundleExtra = intentA.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) != null) {
                intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
                intentA.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                if (intentA.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                    eVar = new e.b(eVar.d()).b(null).c(eVar.c(), eVar.b()).a();
                }
            }
            intent.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", eVar);
            if (m.F0(2)) {
                Log.v("FragmentManager", "CreateIntent created the following intent: " + intent);
            }
            return intent;
        }

        @Override // e.a
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public androidx.activity.result.a c(int i10, Intent intent) {
            return new androidx.activity.result.a(i10, intent);
        }
    }

    public static abstract class l {
        public void a(m mVar, Fragment fragment, Bundle bundle) {
        }

        public void b(m mVar, Fragment fragment, Context context) {
        }

        public void c(m mVar, Fragment fragment, Bundle bundle) {
        }

        public void d(m mVar, Fragment fragment) {
        }

        public void e(m mVar, Fragment fragment) {
        }

        public void f(m mVar, Fragment fragment) {
        }

        public void g(m mVar, Fragment fragment, Context context) {
        }

        public void h(m mVar, Fragment fragment, Bundle bundle) {
        }

        public void i(m mVar, Fragment fragment) {
        }

        public void j(m mVar, Fragment fragment, Bundle bundle) {
        }

        public void k(m mVar, Fragment fragment) {
        }

        public void l(m mVar, Fragment fragment) {
        }

        public void m(m mVar, Fragment fragment, View view, Bundle bundle) {
        }

        public void n(m mVar, Fragment fragment) {
        }
    }

    /* renamed from: androidx.fragment.app.m$m, reason: collision with other inner class name */
    static class C0045m implements Parcelable {
        public static final Parcelable.Creator<C0045m> CREATOR = new a();

        /* renamed from: m, reason: collision with root package name */
        String f2907m;

        /* renamed from: n, reason: collision with root package name */
        int f2908n;

        /* renamed from: androidx.fragment.app.m$m$a */
        class a implements Parcelable.Creator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public C0045m createFromParcel(Parcel parcel) {
                return new C0045m(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public C0045m[] newArray(int i10) {
                return new C0045m[i10];
            }
        }

        C0045m(Parcel parcel) {
            this.f2907m = parcel.readString();
            this.f2908n = parcel.readInt();
        }

        C0045m(String str, int i10) {
            this.f2907m = str;
            this.f2908n = i10;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeString(this.f2907m);
            parcel.writeInt(this.f2908n);
        }
    }

    public interface n {
        void a();
    }

    interface o {
        boolean a(ArrayList arrayList, ArrayList arrayList2);
    }

    private class p implements o {

        /* renamed from: a, reason: collision with root package name */
        final String f2909a;

        /* renamed from: b, reason: collision with root package name */
        final int f2910b;

        /* renamed from: c, reason: collision with root package name */
        final int f2911c;

        p(String str, int i10, int i11) {
            this.f2909a = str;
            this.f2910b = i10;
            this.f2911c = i11;
        }

        @Override // androidx.fragment.app.m.o
        public boolean a(ArrayList arrayList, ArrayList arrayList2) {
            Fragment fragment = m.this.f2887u;
            if (fragment == null || this.f2910b >= 0 || this.f2909a != null || !fragment.u().V0()) {
                return m.this.X0(arrayList, arrayList2, this.f2909a, this.f2910b, this.f2911c);
            }
            return false;
        }
    }

    static class q implements Fragment.g {

        /* renamed from: a, reason: collision with root package name */
        final boolean f2913a;

        /* renamed from: b, reason: collision with root package name */
        final androidx.fragment.app.a f2914b;

        /* renamed from: c, reason: collision with root package name */
        private int f2915c;

        q(androidx.fragment.app.a aVar, boolean z10) {
            this.f2913a = z10;
            this.f2914b = aVar;
        }

        @Override // androidx.fragment.app.Fragment.g
        public void a() {
            int i10 = this.f2915c - 1;
            this.f2915c = i10;
            if (i10 != 0) {
                return;
            }
            this.f2914b.f2723t.h1();
        }

        @Override // androidx.fragment.app.Fragment.g
        public void b() {
            this.f2915c++;
        }

        void c() {
            androidx.fragment.app.a aVar = this.f2914b;
            aVar.f2723t.t(aVar, this.f2913a, false, false);
        }

        void d() {
            boolean z10 = this.f2915c > 0;
            for (Fragment fragment : this.f2914b.f2723t.s0()) {
                fragment.F1(null);
                if (z10 && fragment.h0()) {
                    fragment.K1();
                }
            }
            androidx.fragment.app.a aVar = this.f2914b;
            aVar.f2723t.t(aVar, this.f2913a, !z10, true);
        }

        public boolean e() {
            return this.f2915c == 0;
        }
    }

    static boolean F0(int i10) {
        return O || Log.isLoggable("FragmentManager", i10);
    }

    private boolean G0(Fragment fragment) {
        return (fragment.P && fragment.Q) || fragment.G.n();
    }

    private void L(Fragment fragment) {
        if (fragment == null || !fragment.equals(g0(fragment.f2677r))) {
            return;
        }
        fragment.m1();
    }

    private void M0(q.b bVar) {
        int size = bVar.size();
        for (int i10 = 0; i10 < size; i10++) {
            Fragment fragment = (Fragment) bVar.o(i10);
            if (!fragment.f2683x) {
                View viewU1 = fragment.u1();
                fragment.f2660a0 = viewU1.getAlpha();
                viewU1.setAlpha(0.0f);
            }
        }
    }

    private void S(int i10) {
        try {
            this.f2868b = true;
            this.f2869c.d(i10);
            O0(i10, false);
            if (P) {
                Iterator it = r().iterator();
                while (it.hasNext()) {
                    ((b0) it.next()).j();
                }
            }
            this.f2868b = false;
            a0(true);
        } catch (Throwable th) {
            this.f2868b = false;
            throw th;
        }
    }

    private void V() {
        if (this.H) {
            this.H = false;
            n1();
        }
    }

    private boolean W0(String str, int i10, int i11) {
        a0(false);
        Z(true);
        Fragment fragment = this.f2887u;
        if (fragment != null && i10 < 0 && str == null && fragment.u().V0()) {
            return true;
        }
        boolean zX0 = X0(this.I, this.J, str, i10, i11);
        if (zX0) {
            this.f2868b = true;
            try {
                c1(this.I, this.J);
            } finally {
                p();
            }
        }
        p1();
        V();
        this.f2869c.b();
        return zX0;
    }

    private void X() {
        if (P) {
            Iterator it = r().iterator();
            while (it.hasNext()) {
                ((b0) it.next()).j();
            }
        } else {
            if (this.f2879m.isEmpty()) {
                return;
            }
            for (Fragment fragment : this.f2879m.keySet()) {
                m(fragment);
                P0(fragment);
            }
        }
    }

    private int Y0(ArrayList arrayList, ArrayList arrayList2, int i10, int i11, q.b bVar) {
        int i12 = i11;
        for (int i13 = i11 - 1; i13 >= i10; i13--) {
            androidx.fragment.app.a aVar = (androidx.fragment.app.a) arrayList.get(i13);
            boolean zBooleanValue = ((Boolean) arrayList2.get(i13)).booleanValue();
            if (aVar.A() && !aVar.y(arrayList, i13 + 1, i11)) {
                if (this.L == null) {
                    this.L = new ArrayList();
                }
                q qVar = new q(aVar, zBooleanValue);
                this.L.add(qVar);
                aVar.C(qVar);
                if (zBooleanValue) {
                    aVar.t();
                } else {
                    aVar.u(false);
                }
                i12--;
                if (i13 != i12) {
                    arrayList.remove(i13);
                    arrayList.add(i12, aVar);
                }
                d(bVar);
            }
        }
        return i12;
    }

    private void Z(boolean z10) {
        if (this.f2868b) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        }
        if (this.f2884r == null) {
            if (!this.G) {
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            throw new IllegalStateException("FragmentManager has been destroyed");
        }
        if (Looper.myLooper() != this.f2884r.i().getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
        if (!z10) {
            o();
        }
        if (this.I == null) {
            this.I = new ArrayList();
            this.J = new ArrayList();
        }
        this.f2868b = true;
        try {
            f0(null, null);
        } finally {
            this.f2868b = false;
        }
    }

    private static void c0(ArrayList arrayList, ArrayList arrayList2, int i10, int i11) {
        while (i10 < i11) {
            androidx.fragment.app.a aVar = (androidx.fragment.app.a) arrayList.get(i10);
            if (((Boolean) arrayList2.get(i10)).booleanValue()) {
                aVar.p(-1);
                aVar.u(i10 == i11 + (-1));
            } else {
                aVar.p(1);
                aVar.t();
            }
            i10++;
        }
    }

    private void c1(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() != arrayList2.size()) {
            throw new IllegalStateException("Internal error with the back stack records");
        }
        f0(arrayList, arrayList2);
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (i10 < size) {
            if (!((androidx.fragment.app.a) arrayList.get(i10)).f2973r) {
                if (i11 != i10) {
                    d0(arrayList, arrayList2, i11, i10);
                }
                i11 = i10 + 1;
                if (((Boolean) arrayList2.get(i10)).booleanValue()) {
                    while (i11 < size && ((Boolean) arrayList2.get(i11)).booleanValue() && !((androidx.fragment.app.a) arrayList.get(i11)).f2973r) {
                        i11++;
                    }
                }
                d0(arrayList, arrayList2, i10, i11);
                i10 = i11 - 1;
            }
            i10++;
        }
        if (i11 != size) {
            d0(arrayList, arrayList2, i11, size);
        }
    }

    private void d(q.b bVar) {
        int i10 = this.f2883q;
        if (i10 < 1) {
            return;
        }
        int iMin = Math.min(i10, 5);
        for (Fragment fragment : this.f2869c.n()) {
            if (fragment.f2672m < iMin) {
                Q0(fragment, iMin);
                if (fragment.T != null && !fragment.L && fragment.Y) {
                    bVar.add(fragment);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [boolean, int] */
    private void d0(ArrayList arrayList, ArrayList arrayList2, int i10, int i11) {
        ?? r12;
        int i12;
        boolean z10;
        int i13;
        int i14;
        ArrayList arrayList3;
        int iY0;
        ArrayList arrayList4;
        int i15;
        boolean z11;
        boolean z12 = ((androidx.fragment.app.a) arrayList.get(i10)).f2973r;
        ArrayList arrayList5 = this.K;
        if (arrayList5 == null) {
            this.K = new ArrayList();
        } else {
            arrayList5.clear();
        }
        this.K.addAll(this.f2869c.n());
        Fragment fragmentX0 = x0();
        boolean z13 = false;
        for (int i16 = i10; i16 < i11; i16++) {
            androidx.fragment.app.a aVar = (androidx.fragment.app.a) arrayList.get(i16);
            fragmentX0 = !((Boolean) arrayList2.get(i16)).booleanValue() ? aVar.v(this.K, fragmentX0) : aVar.D(this.K, fragmentX0);
            z13 = z13 || aVar.f2964i;
        }
        this.K.clear();
        if (z12 || this.f2883q < 1) {
            r12 = 1;
        } else if (P) {
            for (int i17 = i10; i17 < i11; i17++) {
                Iterator it = ((androidx.fragment.app.a) arrayList.get(i17)).f2958c.iterator();
                while (it.hasNext()) {
                    Fragment fragment = ((v.a) it.next()).f2976b;
                    if (fragment != null && fragment.E != null) {
                        this.f2869c.p(v(fragment));
                    }
                }
            }
            r12 = 1;
        } else {
            r12 = 1;
            w.B(this.f2884r.h(), this.f2885s, arrayList, arrayList2, i10, i11, false, this.f2880n);
        }
        c0(arrayList, arrayList2, i10, i11);
        if (P) {
            boolean zBooleanValue = ((Boolean) arrayList2.get(i11 - 1)).booleanValue();
            for (int i18 = i10; i18 < i11; i18++) {
                androidx.fragment.app.a aVar2 = (androidx.fragment.app.a) arrayList.get(i18);
                if (zBooleanValue) {
                    for (int size = aVar2.f2958c.size() - r12; size >= 0; size--) {
                        Fragment fragment2 = ((v.a) aVar2.f2958c.get(size)).f2976b;
                        if (fragment2 != null) {
                            v(fragment2).m();
                        }
                    }
                } else {
                    Iterator it2 = aVar2.f2958c.iterator();
                    while (it2.hasNext()) {
                        Fragment fragment3 = ((v.a) it2.next()).f2976b;
                        if (fragment3 != null) {
                            v(fragment3).m();
                        }
                    }
                }
            }
            O0(this.f2883q, r12);
            for (b0 b0Var : s(arrayList, i10, i11)) {
                b0Var.r(zBooleanValue);
                b0Var.p();
                b0Var.g();
            }
            i15 = i11;
            arrayList4 = arrayList2;
        } else {
            if (z12) {
                q.b bVar = new q.b();
                d(bVar);
                i12 = r12;
                z10 = z12;
                i13 = i11;
                i14 = i10;
                arrayList3 = arrayList2;
                iY0 = Y0(arrayList, arrayList2, i10, i11, bVar);
                M0(bVar);
            } else {
                i12 = r12;
                z10 = z12;
                i13 = i11;
                i14 = i10;
                arrayList3 = arrayList2;
                iY0 = i13;
            }
            if (iY0 == i14 || !z10) {
                arrayList4 = arrayList3;
                i15 = i13;
            } else {
                if (this.f2883q >= i12) {
                    arrayList4 = arrayList3;
                    int i19 = iY0;
                    i15 = i13;
                    z11 = i12;
                    w.B(this.f2884r.h(), this.f2885s, arrayList, arrayList2, i10, i19, true, this.f2880n);
                } else {
                    arrayList4 = arrayList3;
                    i15 = i13;
                    z11 = i12;
                }
                O0(this.f2883q, z11);
            }
        }
        for (int i20 = i10; i20 < i15; i20++) {
            androidx.fragment.app.a aVar3 = (androidx.fragment.app.a) arrayList.get(i20);
            if (((Boolean) arrayList4.get(i20)).booleanValue() && aVar3.f2725v >= 0) {
                aVar3.f2725v = -1;
            }
            aVar3.B();
        }
        if (z13) {
            d1();
        }
    }

    private void d1() {
        if (this.f2878l != null) {
            for (int i10 = 0; i10 < this.f2878l.size(); i10++) {
                ((n) this.f2878l.get(i10)).a();
            }
        }
    }

    private void f0(ArrayList arrayList, ArrayList arrayList2) {
        int iIndexOf;
        int iIndexOf2;
        ArrayList arrayList3 = this.L;
        int size = arrayList3 == null ? 0 : arrayList3.size();
        int i10 = 0;
        while (i10 < size) {
            q qVar = (q) this.L.get(i10);
            if (arrayList == null || qVar.f2913a || (iIndexOf2 = arrayList.indexOf(qVar.f2914b)) == -1 || arrayList2 == null || !((Boolean) arrayList2.get(iIndexOf2)).booleanValue()) {
                if (qVar.e() || (arrayList != null && qVar.f2914b.y(arrayList, 0, arrayList.size()))) {
                    this.L.remove(i10);
                    i10--;
                    size--;
                    if (arrayList == null || qVar.f2913a || (iIndexOf = arrayList.indexOf(qVar.f2914b)) == -1 || arrayList2 == null || !((Boolean) arrayList2.get(iIndexOf)).booleanValue()) {
                        qVar.d();
                    }
                }
                i10++;
            } else {
                this.L.remove(i10);
                i10--;
                size--;
            }
            qVar.c();
            i10++;
        }
    }

    static int f1(int i10) {
        if (i10 == 4097) {
            return 8194;
        }
        if (i10 != 4099) {
            return i10 != 8194 ? 0 : 4097;
        }
        return 4099;
    }

    private void k0() {
        if (P) {
            Iterator it = r().iterator();
            while (it.hasNext()) {
                ((b0) it.next()).k();
            }
        } else if (this.L != null) {
            while (!this.L.isEmpty()) {
                ((q) this.L.remove(0)).d();
            }
        }
    }

    private boolean l0(ArrayList arrayList, ArrayList arrayList2) {
        synchronized (this.f2867a) {
            if (this.f2867a.isEmpty()) {
                return false;
            }
            int size = this.f2867a.size();
            boolean zA = false;
            for (int i10 = 0; i10 < size; i10++) {
                zA |= ((o) this.f2867a.get(i10)).a(arrayList, arrayList2);
            }
            this.f2867a.clear();
            this.f2884r.i().removeCallbacks(this.N);
            return zA;
        }
    }

    private void l1(Fragment fragment) {
        ViewGroup viewGroupP0 = p0(fragment);
        if (viewGroupP0 == null || fragment.w() + fragment.z() + fragment.L() + fragment.M() <= 0) {
            return;
        }
        int i10 = j0.b.f24365c;
        if (viewGroupP0.getTag(i10) == null) {
            viewGroupP0.setTag(i10, fragment);
        }
        ((Fragment) viewGroupP0.getTag(i10)).G1(fragment.K());
    }

    private void m(Fragment fragment) {
        HashSet hashSet = (HashSet) this.f2879m.get(fragment);
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                ((androidx.core.os.e) it.next()).a();
            }
            hashSet.clear();
            w(fragment);
            this.f2879m.remove(fragment);
        }
    }

    private androidx.fragment.app.p n0(Fragment fragment) {
        return this.M.i(fragment);
    }

    private void n1() {
        Iterator it = this.f2869c.k().iterator();
        while (it.hasNext()) {
            T0((t) it.next());
        }
    }

    private void o() {
        if (K0()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
    }

    private void p() {
        this.f2868b = false;
        this.J.clear();
        this.I.clear();
    }

    private ViewGroup p0(Fragment fragment) {
        ViewGroup viewGroup = fragment.S;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (fragment.J > 0 && this.f2885s.f()) {
            View viewE = this.f2885s.e(fragment.J);
            if (viewE instanceof ViewGroup) {
                return (ViewGroup) viewE;
            }
        }
        return null;
    }

    private void p1() {
        synchronized (this.f2867a) {
            if (this.f2867a.isEmpty()) {
                this.f2874h.f(m0() > 0 && I0(this.f2886t));
            } else {
                this.f2874h.f(true);
            }
        }
    }

    private Set r() {
        HashSet hashSet = new HashSet();
        Iterator it = this.f2869c.k().iterator();
        while (it.hasNext()) {
            ViewGroup viewGroup = ((t) it.next()).k().S;
            if (viewGroup != null) {
                hashSet.add(b0.o(viewGroup, y0()));
            }
        }
        return hashSet;
    }

    private Set s(ArrayList arrayList, int i10, int i11) {
        ViewGroup viewGroup;
        HashSet hashSet = new HashSet();
        while (i10 < i11) {
            Iterator it = ((androidx.fragment.app.a) arrayList.get(i10)).f2958c.iterator();
            while (it.hasNext()) {
                Fragment fragment = ((v.a) it.next()).f2976b;
                if (fragment != null && (viewGroup = fragment.S) != null) {
                    hashSet.add(b0.n(viewGroup, this));
                }
            }
            i10++;
        }
        return hashSet;
    }

    private void u(Fragment fragment) {
        Animator animator;
        if (fragment.T != null) {
            f.d dVarC = androidx.fragment.app.f.c(this.f2884r.h(), fragment, !fragment.L, fragment.K());
            if (dVarC == null || (animator = dVarC.f2847b) == null) {
                if (dVarC != null) {
                    fragment.T.startAnimation(dVarC.f2846a);
                    dVarC.f2846a.start();
                }
                fragment.T.setVisibility((!fragment.L || fragment.e0()) ? 0 : 8);
                if (fragment.e0()) {
                    fragment.D1(false);
                }
            } else {
                animator.setTarget(fragment.T);
                if (!fragment.L) {
                    fragment.T.setVisibility(0);
                } else if (fragment.e0()) {
                    fragment.D1(false);
                } else {
                    ViewGroup viewGroup = fragment.S;
                    View view = fragment.T;
                    viewGroup.startViewTransition(view);
                    dVarC.f2847b.addListener(new h(viewGroup, view, fragment));
                }
                dVarC.f2847b.start();
            }
        }
        D0(fragment);
        fragment.Z = false;
        fragment.D0(fragment.L);
    }

    private void w(Fragment fragment) {
        fragment.c1();
        this.f2881o.n(fragment, false);
        fragment.S = null;
        fragment.T = null;
        fragment.f2665f0 = null;
        fragment.f2666g0.k(null);
        fragment.A = false;
    }

    static Fragment z0(View view) {
        Object tag = view.getTag(j0.b.f24363a);
        if (tag instanceof Fragment) {
            return (Fragment) tag;
        }
        return null;
    }

    void A(Configuration configuration) {
        for (Fragment fragment : this.f2869c.n()) {
            if (fragment != null) {
                fragment.W0(configuration);
            }
        }
    }

    j0 A0(Fragment fragment) {
        return this.M.l(fragment);
    }

    boolean B(MenuItem menuItem) {
        if (this.f2883q < 1) {
            return false;
        }
        for (Fragment fragment : this.f2869c.n()) {
            if (fragment != null && fragment.X0(menuItem)) {
                return true;
            }
        }
        return false;
    }

    void B0() {
        a0(true);
        if (this.f2874h.c()) {
            V0();
        } else {
            this.f2873g.f();
        }
    }

    void C() {
        this.E = false;
        this.F = false;
        this.M.o(false);
        S(1);
    }

    void C0(Fragment fragment) {
        if (F0(2)) {
            Log.v("FragmentManager", "hide: " + fragment);
        }
        if (fragment.L) {
            return;
        }
        fragment.L = true;
        fragment.Z = true ^ fragment.Z;
        l1(fragment);
    }

    boolean D(Menu menu, MenuInflater menuInflater) {
        if (this.f2883q < 1) {
            return false;
        }
        ArrayList arrayList = null;
        boolean z10 = false;
        for (Fragment fragment : this.f2869c.n()) {
            if (fragment != null && H0(fragment) && fragment.Z0(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(fragment);
                z10 = true;
            }
        }
        if (this.f2871e != null) {
            for (int i10 = 0; i10 < this.f2871e.size(); i10++) {
                Fragment fragment2 = (Fragment) this.f2871e.get(i10);
                if (arrayList == null || !arrayList.contains(fragment2)) {
                    fragment2.z0();
                }
            }
        }
        this.f2871e = arrayList;
        return z10;
    }

    void D0(Fragment fragment) {
        if (fragment.f2683x && G0(fragment)) {
            this.D = true;
        }
    }

    void E() {
        this.G = true;
        a0(true);
        X();
        S(-1);
        this.f2884r = null;
        this.f2885s = null;
        this.f2886t = null;
        if (this.f2873g != null) {
            this.f2874h.d();
            this.f2873g = null;
        }
        androidx.activity.result.c cVar = this.f2892z;
        if (cVar != null) {
            cVar.c();
            this.A.c();
            this.B.c();
        }
    }

    public boolean E0() {
        return this.G;
    }

    void F() {
        S(1);
    }

    void G() {
        for (Fragment fragment : this.f2869c.n()) {
            if (fragment != null) {
                fragment.f1();
            }
        }
    }

    void H(boolean z10) {
        for (Fragment fragment : this.f2869c.n()) {
            if (fragment != null) {
                fragment.g1(z10);
            }
        }
    }

    boolean H0(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        return fragment.g0();
    }

    void I(Fragment fragment) {
        Iterator it = this.f2882p.iterator();
        while (it.hasNext()) {
            ((androidx.fragment.app.q) it.next()).a(this, fragment);
        }
    }

    boolean I0(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        m mVar = fragment.E;
        return fragment.equals(mVar.x0()) && I0(mVar.f2886t);
    }

    boolean J(MenuItem menuItem) {
        if (this.f2883q < 1) {
            return false;
        }
        for (Fragment fragment : this.f2869c.n()) {
            if (fragment != null && fragment.h1(menuItem)) {
                return true;
            }
        }
        return false;
    }

    boolean J0(int i10) {
        return this.f2883q >= i10;
    }

    void K(Menu menu) {
        if (this.f2883q < 1) {
            return;
        }
        for (Fragment fragment : this.f2869c.n()) {
            if (fragment != null) {
                fragment.i1(menu);
            }
        }
    }

    public boolean K0() {
        return this.E || this.F;
    }

    void L0(Fragment fragment, Intent intent, int i10, Bundle bundle) {
        if (this.f2892z == null) {
            this.f2884r.m(fragment, intent, i10, bundle);
            return;
        }
        this.C.addLast(new C0045m(fragment.f2677r, i10));
        if (intent != null && bundle != null) {
            intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
        }
        this.f2892z.a(intent);
    }

    void M() {
        S(5);
    }

    void N(boolean z10) {
        for (Fragment fragment : this.f2869c.n()) {
            if (fragment != null) {
                fragment.k1(z10);
            }
        }
    }

    void N0(Fragment fragment) {
        if (!this.f2869c.c(fragment.f2677r)) {
            if (F0(3)) {
                Log.d("FragmentManager", "Ignoring moving " + fragment + " to state " + this.f2883q + "since it is not added to " + this);
                return;
            }
            return;
        }
        P0(fragment);
        View view = fragment.T;
        if (view != null && fragment.Y && fragment.S != null) {
            float f5 = fragment.f2660a0;
            if (f5 > 0.0f) {
                view.setAlpha(f5);
            }
            fragment.f2660a0 = 0.0f;
            fragment.Y = false;
            f.d dVarC = androidx.fragment.app.f.c(this.f2884r.h(), fragment, true, fragment.K());
            if (dVarC != null) {
                Animation animation = dVarC.f2846a;
                if (animation != null) {
                    fragment.T.startAnimation(animation);
                } else {
                    dVarC.f2847b.setTarget(fragment.T);
                    dVarC.f2847b.start();
                }
            }
        }
        if (fragment.Z) {
            u(fragment);
        }
    }

    boolean O(Menu menu) {
        boolean z10 = false;
        if (this.f2883q < 1) {
            return false;
        }
        for (Fragment fragment : this.f2869c.n()) {
            if (fragment != null && H0(fragment) && fragment.l1(menu)) {
                z10 = true;
            }
        }
        return z10;
    }

    void O0(int i10, boolean z10) {
        androidx.fragment.app.j jVar;
        if (this.f2884r == null && i10 != -1) {
            throw new IllegalStateException("No activity");
        }
        if (z10 || i10 != this.f2883q) {
            this.f2883q = i10;
            if (P) {
                this.f2869c.r();
            } else {
                Iterator it = this.f2869c.n().iterator();
                while (it.hasNext()) {
                    N0((Fragment) it.next());
                }
                for (t tVar : this.f2869c.k()) {
                    Fragment fragmentK = tVar.k();
                    if (!fragmentK.Y) {
                        N0(fragmentK);
                    }
                    if (fragmentK.f2684y && !fragmentK.f0()) {
                        this.f2869c.q(tVar);
                    }
                }
            }
            n1();
            if (this.D && (jVar = this.f2884r) != null && this.f2883q == 7) {
                jVar.o();
                this.D = false;
            }
        }
    }

    void P() {
        p1();
        L(this.f2887u);
    }

    void P0(Fragment fragment) {
        Q0(fragment, this.f2883q);
    }

    void Q() {
        this.E = false;
        this.F = false;
        this.M.o(false);
        S(7);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0160  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    void Q0(androidx.fragment.app.Fragment r11, int r12) {
        /*
            Method dump skipped, instructions count: 407
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.m.Q0(androidx.fragment.app.Fragment, int):void");
    }

    void R() {
        this.E = false;
        this.F = false;
        this.M.o(false);
        S(5);
    }

    void R0() {
        if (this.f2884r == null) {
            return;
        }
        this.E = false;
        this.F = false;
        this.M.o(false);
        for (Fragment fragment : this.f2869c.n()) {
            if (fragment != null) {
                fragment.m0();
            }
        }
    }

    void S0(FragmentContainerView fragmentContainerView) {
        View view;
        for (t tVar : this.f2869c.k()) {
            Fragment fragmentK = tVar.k();
            if (fragmentK.J == fragmentContainerView.getId() && (view = fragmentK.T) != null && view.getParent() == null) {
                fragmentK.S = fragmentContainerView;
                tVar.b();
            }
        }
    }

    void T() {
        this.F = true;
        this.M.o(true);
        S(4);
    }

    void T0(t tVar) {
        Fragment fragmentK = tVar.k();
        if (fragmentK.U) {
            if (this.f2868b) {
                this.H = true;
                return;
            }
            fragmentK.U = false;
            if (P) {
                tVar.m();
            } else {
                P0(fragmentK);
            }
        }
    }

    void U() {
        S(2);
    }

    public void U0(int i10, int i11) {
        if (i10 >= 0) {
            Y(new p(null, i10, i11), false);
            return;
        }
        throw new IllegalArgumentException("Bad id: " + i10);
    }

    public boolean V0() {
        return W0(null, -1, 0);
    }

    public void W(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        String str2 = str + "    ";
        this.f2869c.e(str, fileDescriptor, printWriter, strArr);
        ArrayList arrayList = this.f2871e;
        if (arrayList != null && (size2 = arrayList.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i10 = 0; i10 < size2; i10++) {
                Fragment fragment = (Fragment) this.f2871e.get(i10);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i10);
                printWriter.print(": ");
                printWriter.println(fragment.toString());
            }
        }
        ArrayList arrayList2 = this.f2870d;
        if (arrayList2 != null && (size = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i11 = 0; i11 < size; i11++) {
                androidx.fragment.app.a aVar = (androidx.fragment.app.a) this.f2870d.get(i11);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i11);
                printWriter.print(": ");
                printWriter.println(aVar.toString());
                aVar.r(str2, printWriter);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.f2875i.get());
        synchronized (this.f2867a) {
            int size3 = this.f2867a.size();
            if (size3 > 0) {
                printWriter.print(str);
                printWriter.println("Pending Actions:");
                for (int i12 = 0; i12 < size3; i12++) {
                    o oVar = (o) this.f2867a.get(i12);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i12);
                    printWriter.print(": ");
                    printWriter.println(oVar);
                }
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f2884r);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f2885s);
        if (this.f2886t != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f2886t);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f2883q);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.E);
        printWriter.print(" mStopped=");
        printWriter.print(this.F);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.G);
        if (this.D) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.D);
        }
    }

    boolean X0(ArrayList arrayList, ArrayList arrayList2, String str, int i10, int i11) {
        int i12;
        ArrayList arrayList3 = this.f2870d;
        if (arrayList3 == null) {
            return false;
        }
        if (str == null && i10 < 0 && (i11 & 1) == 0) {
            int size = arrayList3.size() - 1;
            if (size < 0) {
                return false;
            }
            arrayList.add(this.f2870d.remove(size));
            arrayList2.add(Boolean.TRUE);
        } else {
            if (str != null || i10 >= 0) {
                int size2 = arrayList3.size() - 1;
                while (size2 >= 0) {
                    androidx.fragment.app.a aVar = (androidx.fragment.app.a) this.f2870d.get(size2);
                    if ((str != null && str.equals(aVar.w())) || (i10 >= 0 && i10 == aVar.f2725v)) {
                        break;
                    }
                    size2--;
                }
                if (size2 < 0) {
                    return false;
                }
                if ((i11 & 1) != 0) {
                    while (true) {
                        size2--;
                        if (size2 < 0) {
                            break;
                        }
                        androidx.fragment.app.a aVar2 = (androidx.fragment.app.a) this.f2870d.get(size2);
                        if (str == null || !str.equals(aVar2.w())) {
                            if (i10 < 0 || i10 != aVar2.f2725v) {
                                break;
                            }
                        }
                    }
                }
                i12 = size2;
            } else {
                i12 = -1;
            }
            if (i12 == this.f2870d.size() - 1) {
                return false;
            }
            for (int size3 = this.f2870d.size() - 1; size3 > i12; size3--) {
                arrayList.add(this.f2870d.remove(size3));
                arrayList2.add(Boolean.TRUE);
            }
        }
        return true;
    }

    void Y(o oVar, boolean z10) {
        if (!z10) {
            if (this.f2884r == null) {
                if (!this.G) {
                    throw new IllegalStateException("FragmentManager has not been attached to a host.");
                }
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            o();
        }
        synchronized (this.f2867a) {
            if (this.f2884r == null) {
                if (!z10) {
                    throw new IllegalStateException("Activity has been destroyed");
                }
            } else {
                this.f2867a.add(oVar);
                h1();
            }
        }
    }

    public void Z0(l lVar, boolean z10) {
        this.f2881o.o(lVar, z10);
    }

    boolean a0(boolean z10) {
        Z(z10);
        boolean z11 = false;
        while (l0(this.I, this.J)) {
            this.f2868b = true;
            try {
                c1(this.I, this.J);
                p();
                z11 = true;
            } catch (Throwable th) {
                p();
                throw th;
            }
        }
        p1();
        V();
        this.f2869c.b();
        return z11;
    }

    void a1(Fragment fragment, androidx.core.os.e eVar) {
        HashSet hashSet = (HashSet) this.f2879m.get(fragment);
        if (hashSet != null && hashSet.remove(eVar) && hashSet.isEmpty()) {
            this.f2879m.remove(fragment);
            if (fragment.f2672m < 5) {
                w(fragment);
                P0(fragment);
            }
        }
    }

    void b0(o oVar, boolean z10) {
        if (z10 && (this.f2884r == null || this.G)) {
            return;
        }
        Z(z10);
        if (oVar.a(this.I, this.J)) {
            this.f2868b = true;
            try {
                c1(this.I, this.J);
            } finally {
                p();
            }
        }
        p1();
        V();
        this.f2869c.b();
    }

    void b1(Fragment fragment) {
        if (F0(2)) {
            Log.v("FragmentManager", "remove: " + fragment + " nesting=" + fragment.D);
        }
        boolean z10 = !fragment.f0();
        if (!fragment.M || z10) {
            this.f2869c.s(fragment);
            if (G0(fragment)) {
                this.D = true;
            }
            fragment.f2684y = true;
            l1(fragment);
        }
    }

    void e(androidx.fragment.app.a aVar) {
        if (this.f2870d == null) {
            this.f2870d = new ArrayList();
        }
        this.f2870d.add(aVar);
    }

    public boolean e0() {
        boolean zA0 = a0(true);
        k0();
        return zA0;
    }

    void e1(Parcelable parcelable) {
        t tVar;
        if (parcelable == null) {
            return;
        }
        androidx.fragment.app.o oVar = (androidx.fragment.app.o) parcelable;
        if (oVar.f2916m == null) {
            return;
        }
        this.f2869c.t();
        Iterator it = oVar.f2916m.iterator();
        while (it.hasNext()) {
            s sVar = (s) it.next();
            if (sVar != null) {
                Fragment fragmentH = this.M.h(sVar.f2933n);
                if (fragmentH != null) {
                    if (F0(2)) {
                        Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + fragmentH);
                    }
                    tVar = new t(this.f2881o, this.f2869c, fragmentH, sVar);
                } else {
                    tVar = new t(this.f2881o, this.f2869c, this.f2884r.h().getClassLoader(), q0(), sVar);
                }
                Fragment fragmentK = tVar.k();
                fragmentK.E = this;
                if (F0(2)) {
                    Log.v("FragmentManager", "restoreSaveState: active (" + fragmentK.f2677r + "): " + fragmentK);
                }
                tVar.o(this.f2884r.h().getClassLoader());
                this.f2869c.p(tVar);
                tVar.t(this.f2883q);
            }
        }
        for (Fragment fragment : this.M.k()) {
            if (!this.f2869c.c(fragment.f2677r)) {
                if (F0(2)) {
                    Log.v("FragmentManager", "Discarding retained Fragment " + fragment + " that was not found in the set of active Fragments " + oVar.f2916m);
                }
                this.M.n(fragment);
                fragment.E = this;
                t tVar2 = new t(this.f2881o, this.f2869c, fragment);
                tVar2.t(1);
                tVar2.m();
                fragment.f2684y = true;
                tVar2.m();
            }
        }
        this.f2869c.u(oVar.f2917n);
        if (oVar.f2918o != null) {
            this.f2870d = new ArrayList(oVar.f2918o.length);
            int i10 = 0;
            while (true) {
                androidx.fragment.app.b[] bVarArr = oVar.f2918o;
                if (i10 >= bVarArr.length) {
                    break;
                }
                androidx.fragment.app.a aVarA = bVarArr[i10].a(this);
                if (F0(2)) {
                    Log.v("FragmentManager", "restoreAllState: back stack #" + i10 + " (index " + aVarA.f2725v + "): " + aVarA);
                    PrintWriter printWriter = new PrintWriter(new a0("FragmentManager"));
                    aVarA.s("  ", printWriter, false);
                    printWriter.close();
                }
                this.f2870d.add(aVarA);
                i10++;
            }
        } else {
            this.f2870d = null;
        }
        this.f2875i.set(oVar.f2919p);
        String str = oVar.f2920q;
        if (str != null) {
            Fragment fragmentG0 = g0(str);
            this.f2887u = fragmentG0;
            L(fragmentG0);
        }
        ArrayList arrayList = oVar.f2921r;
        if (arrayList != null) {
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                Bundle bundle = (Bundle) oVar.f2922s.get(i11);
                bundle.setClassLoader(this.f2884r.h().getClassLoader());
                this.f2876j.put(arrayList.get(i11), bundle);
            }
        }
        this.C = new ArrayDeque(oVar.f2923t);
    }

    void f(Fragment fragment, androidx.core.os.e eVar) {
        if (this.f2879m.get(fragment) == null) {
            this.f2879m.put(fragment, new HashSet());
        }
        ((HashSet) this.f2879m.get(fragment)).add(eVar);
    }

    t g(Fragment fragment) {
        if (F0(2)) {
            Log.v("FragmentManager", "add: " + fragment);
        }
        t tVarV = v(fragment);
        fragment.E = this;
        this.f2869c.p(tVarV);
        if (!fragment.M) {
            this.f2869c.a(fragment);
            fragment.f2684y = false;
            if (fragment.T == null) {
                fragment.Z = false;
            }
            if (G0(fragment)) {
                this.D = true;
            }
        }
        return tVarV;
    }

    Fragment g0(String str) {
        return this.f2869c.f(str);
    }

    Parcelable g1() {
        int size;
        k0();
        X();
        a0(true);
        this.E = true;
        this.M.o(true);
        ArrayList arrayListV = this.f2869c.v();
        androidx.fragment.app.b[] bVarArr = null;
        if (arrayListV.isEmpty()) {
            if (F0(2)) {
                Log.v("FragmentManager", "saveAllState: no fragments!");
            }
            return null;
        }
        ArrayList arrayListW = this.f2869c.w();
        ArrayList arrayList = this.f2870d;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            bVarArr = new androidx.fragment.app.b[size];
            for (int i10 = 0; i10 < size; i10++) {
                bVarArr[i10] = new androidx.fragment.app.b((androidx.fragment.app.a) this.f2870d.get(i10));
                if (F0(2)) {
                    Log.v("FragmentManager", "saveAllState: adding back stack #" + i10 + ": " + this.f2870d.get(i10));
                }
            }
        }
        androidx.fragment.app.o oVar = new androidx.fragment.app.o();
        oVar.f2916m = arrayListV;
        oVar.f2917n = arrayListW;
        oVar.f2918o = bVarArr;
        oVar.f2919p = this.f2875i.get();
        Fragment fragment = this.f2887u;
        if (fragment != null) {
            oVar.f2920q = fragment.f2677r;
        }
        oVar.f2921r.addAll(this.f2876j.keySet());
        oVar.f2922s.addAll(this.f2876j.values());
        oVar.f2923t = new ArrayList(this.C);
        return oVar;
    }

    public void h(androidx.fragment.app.q qVar) {
        this.f2882p.add(qVar);
    }

    public Fragment h0(int i10) {
        return this.f2869c.g(i10);
    }

    void h1() {
        synchronized (this.f2867a) {
            ArrayList arrayList = this.L;
            boolean z10 = (arrayList == null || arrayList.isEmpty()) ? false : true;
            boolean z11 = this.f2867a.size() == 1;
            if (z10 || z11) {
                this.f2884r.i().removeCallbacks(this.N);
                this.f2884r.i().post(this.N);
                p1();
            }
        }
    }

    int i() {
        return this.f2875i.getAndIncrement();
    }

    public Fragment i0(String str) {
        return this.f2869c.h(str);
    }

    void i1(Fragment fragment, boolean z10) {
        ViewGroup viewGroupP0 = p0(fragment);
        if (viewGroupP0 == null || !(viewGroupP0 instanceof FragmentContainerView)) {
            return;
        }
        ((FragmentContainerView) viewGroupP0).setDrawDisappearingViewsLast(!z10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    void j(androidx.fragment.app.j r3, androidx.fragment.app.g r4, androidx.fragment.app.Fragment r5) {
        /*
            Method dump skipped, instructions count: 267
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.m.j(androidx.fragment.app.j, androidx.fragment.app.g, androidx.fragment.app.Fragment):void");
    }

    Fragment j0(String str) {
        return this.f2869c.i(str);
    }

    void j1(Fragment fragment, j.c cVar) {
        if (fragment.equals(g0(fragment.f2677r)) && (fragment.F == null || fragment.E == this)) {
            fragment.f2663d0 = cVar;
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    void k(Fragment fragment) {
        if (F0(2)) {
            Log.v("FragmentManager", "attach: " + fragment);
        }
        if (fragment.M) {
            fragment.M = false;
            if (fragment.f2683x) {
                return;
            }
            this.f2869c.a(fragment);
            if (F0(2)) {
                Log.v("FragmentManager", "add from attach: " + fragment);
            }
            if (G0(fragment)) {
                this.D = true;
            }
        }
    }

    void k1(Fragment fragment) {
        if (fragment == null || (fragment.equals(g0(fragment.f2677r)) && (fragment.F == null || fragment.E == this))) {
            Fragment fragment2 = this.f2887u;
            this.f2887u = fragment;
            L(fragment2);
            L(this.f2887u);
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    public v l() {
        return new androidx.fragment.app.a(this);
    }

    public int m0() {
        ArrayList arrayList = this.f2870d;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    void m1(Fragment fragment) {
        if (F0(2)) {
            Log.v("FragmentManager", "show: " + fragment);
        }
        if (fragment.L) {
            fragment.L = false;
            fragment.Z = !fragment.Z;
        }
    }

    boolean n() {
        boolean zG0 = false;
        for (Fragment fragment : this.f2869c.l()) {
            if (fragment != null) {
                zG0 = G0(fragment);
            }
            if (zG0) {
                return true;
            }
        }
        return false;
    }

    androidx.fragment.app.g o0() {
        return this.f2885s;
    }

    public void o1(l lVar) {
        this.f2881o.p(lVar);
    }

    public final void q(String str) {
        this.f2876j.remove(str);
    }

    public androidx.fragment.app.i q0() {
        androidx.fragment.app.i iVar = this.f2888v;
        if (iVar != null) {
            return iVar;
        }
        Fragment fragment = this.f2886t;
        return fragment != null ? fragment.E.q0() : this.f2889w;
    }

    u r0() {
        return this.f2869c;
    }

    public List s0() {
        return this.f2869c.n();
    }

    void t(androidx.fragment.app.a aVar, boolean z10, boolean z11, boolean z12) {
        if (z10) {
            aVar.u(z12);
        } else {
            aVar.t();
        }
        ArrayList arrayList = new ArrayList(1);
        ArrayList arrayList2 = new ArrayList(1);
        arrayList.add(aVar);
        arrayList2.add(Boolean.valueOf(z10));
        if (z11 && this.f2883q >= 1) {
            w.B(this.f2884r.h(), this.f2885s, arrayList, arrayList2, 0, 1, true, this.f2880n);
        }
        if (z12) {
            O0(this.f2883q, true);
        }
        for (Fragment fragment : this.f2869c.l()) {
            if (fragment != null && fragment.T != null && fragment.Y && aVar.x(fragment.J)) {
                float f5 = fragment.f2660a0;
                if (f5 > 0.0f) {
                    fragment.T.setAlpha(f5);
                }
                if (z12) {
                    fragment.f2660a0 = 0.0f;
                } else {
                    fragment.f2660a0 = -1.0f;
                    fragment.Y = false;
                }
            }
        }
    }

    androidx.fragment.app.j t0() {
        return this.f2884r;
    }

    public String toString() {
        Object obj;
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("FragmentManager{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" in ");
        Fragment fragment = this.f2886t;
        if (fragment != null) {
            sb2.append(fragment.getClass().getSimpleName());
            sb2.append("{");
            obj = this.f2886t;
        } else {
            androidx.fragment.app.j jVar = this.f2884r;
            if (jVar == null) {
                sb2.append("null");
                sb2.append("}}");
                return sb2.toString();
            }
            sb2.append(jVar.getClass().getSimpleName());
            sb2.append("{");
            obj = this.f2884r;
        }
        sb2.append(Integer.toHexString(System.identityHashCode(obj)));
        sb2.append("}");
        sb2.append("}}");
        return sb2.toString();
    }

    LayoutInflater.Factory2 u0() {
        return this.f2872f;
    }

    t v(Fragment fragment) {
        t tVarM = this.f2869c.m(fragment.f2677r);
        if (tVarM != null) {
            return tVarM;
        }
        t tVar = new t(this.f2881o, this.f2869c, fragment);
        tVar.o(this.f2884r.h().getClassLoader());
        tVar.t(this.f2883q);
        return tVar;
    }

    androidx.fragment.app.l v0() {
        return this.f2881o;
    }

    Fragment w0() {
        return this.f2886t;
    }

    void x(Fragment fragment) {
        if (F0(2)) {
            Log.v("FragmentManager", "detach: " + fragment);
        }
        if (fragment.M) {
            return;
        }
        fragment.M = true;
        if (fragment.f2683x) {
            if (F0(2)) {
                Log.v("FragmentManager", "remove from detach: " + fragment);
            }
            this.f2869c.s(fragment);
            if (G0(fragment)) {
                this.D = true;
            }
            l1(fragment);
        }
    }

    public Fragment x0() {
        return this.f2887u;
    }

    void y() {
        this.E = false;
        this.F = false;
        this.M.o(false);
        S(4);
    }

    c0 y0() {
        c0 c0Var = this.f2890x;
        if (c0Var != null) {
            return c0Var;
        }
        Fragment fragment = this.f2886t;
        return fragment != null ? fragment.E.y0() : this.f2891y;
    }

    void z() {
        this.E = false;
        this.F = false;
        this.M.o(false);
        S(0);
    }
}
