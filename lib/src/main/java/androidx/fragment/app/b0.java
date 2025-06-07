package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.os.e;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
abstract class b0 {

    /* renamed from: a, reason: collision with root package name */
    private final ViewGroup f2742a;

    /* renamed from: b, reason: collision with root package name */
    final ArrayList f2743b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    final ArrayList f2744c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    boolean f2745d = false;

    /* renamed from: e, reason: collision with root package name */
    boolean f2746e = false;

    class a implements Runnable {

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ d f2747m;

        a(d dVar) {
            this.f2747m = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (b0.this.f2743b.contains(this.f2747m)) {
                this.f2747m.e().b(this.f2747m.f().T);
            }
        }
    }

    class b implements Runnable {

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ d f2749m;

        b(d dVar) {
            this.f2749m = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            b0.this.f2743b.remove(this.f2749m);
            b0.this.f2744c.remove(this.f2749m);
        }
    }

    static /* synthetic */ class c {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f2751a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f2752b;

        static {
            int[] iArr = new int[e.b.values().length];
            f2752b = iArr;
            try {
                iArr[e.b.ADDING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2752b[e.b.REMOVING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2752b[e.b.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[e.c.values().length];
            f2751a = iArr2;
            try {
                iArr2[e.c.REMOVED.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f2751a[e.c.VISIBLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f2751a[e.c.GONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f2751a[e.c.INVISIBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    private static class d extends e {

        /* renamed from: h, reason: collision with root package name */
        private final t f2753h;

        d(e.c cVar, e.b bVar, t tVar, androidx.core.os.e eVar) {
            super(cVar, bVar, tVar.k(), eVar);
            this.f2753h = tVar;
        }

        @Override // androidx.fragment.app.b0.e
        public void c() {
            super.c();
            this.f2753h.m();
        }

        @Override // androidx.fragment.app.b0.e
        void l() {
            if (g() == e.b.ADDING) {
                Fragment fragmentK = this.f2753h.k();
                View viewFindFocus = fragmentK.T.findFocus();
                if (viewFindFocus != null) {
                    fragmentK.C1(viewFindFocus);
                    if (m.F0(2)) {
                        Log.v("FragmentManager", "requestFocus: Saved focused view " + viewFindFocus + " for Fragment " + fragmentK);
                    }
                }
                View viewU1 = f().u1();
                if (viewU1.getParent() == null) {
                    this.f2753h.b();
                    viewU1.setAlpha(0.0f);
                }
                if (viewU1.getAlpha() == 0.0f && viewU1.getVisibility() == 0) {
                    viewU1.setVisibility(4);
                }
                viewU1.setAlpha(fragmentK.N());
            }
        }
    }

    static class e {

        /* renamed from: a, reason: collision with root package name */
        private c f2754a;

        /* renamed from: b, reason: collision with root package name */
        private b f2755b;

        /* renamed from: c, reason: collision with root package name */
        private final Fragment f2756c;

        /* renamed from: d, reason: collision with root package name */
        private final List f2757d = new ArrayList();

        /* renamed from: e, reason: collision with root package name */
        private final HashSet f2758e = new HashSet();

        /* renamed from: f, reason: collision with root package name */
        private boolean f2759f = false;

        /* renamed from: g, reason: collision with root package name */
        private boolean f2760g = false;

        class a implements e.b {
            a() {
            }

            @Override // androidx.core.os.e.b
            public void a() {
                e.this.b();
            }
        }

        enum b {
            NONE,
            ADDING,
            REMOVING
        }

        enum c {
            REMOVED,
            VISIBLE,
            GONE,
            INVISIBLE;

            static c d(int i10) {
                if (i10 == 0) {
                    return VISIBLE;
                }
                if (i10 == 4) {
                    return INVISIBLE;
                }
                if (i10 == 8) {
                    return GONE;
                }
                throw new IllegalArgumentException("Unknown visibility " + i10);
            }

            static c g(View view) {
                return (view.getAlpha() == 0.0f && view.getVisibility() == 0) ? INVISIBLE : d(view.getVisibility());
            }

            void b(View view) {
                int i10;
                int i11 = c.f2751a[ordinal()];
                if (i11 == 1) {
                    ViewGroup viewGroup = (ViewGroup) view.getParent();
                    if (viewGroup != null) {
                        if (m.F0(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Removing view " + view + " from container " + viewGroup);
                        }
                        viewGroup.removeView(view);
                        return;
                    }
                    return;
                }
                if (i11 == 2) {
                    if (m.F0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to VISIBLE");
                    }
                    i10 = 0;
                } else {
                    if (i11 != 3) {
                        if (i11 != 4) {
                            return;
                        }
                        if (m.F0(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to INVISIBLE");
                        }
                        view.setVisibility(4);
                        return;
                    }
                    if (m.F0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to GONE");
                    }
                    i10 = 8;
                }
                view.setVisibility(i10);
            }
        }

        e(c cVar, b bVar, Fragment fragment, androidx.core.os.e eVar) {
            this.f2754a = cVar;
            this.f2755b = bVar;
            this.f2756c = fragment;
            eVar.d(new a());
        }

        final void a(Runnable runnable) {
            this.f2757d.add(runnable);
        }

        final void b() {
            if (h()) {
                return;
            }
            this.f2759f = true;
            if (this.f2758e.isEmpty()) {
                c();
                return;
            }
            Iterator it = new ArrayList(this.f2758e).iterator();
            while (it.hasNext()) {
                ((androidx.core.os.e) it.next()).a();
            }
        }

        public void c() {
            if (this.f2760g) {
                return;
            }
            if (m.F0(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: " + this + " has called complete.");
            }
            this.f2760g = true;
            Iterator it = this.f2757d.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
        }

        public final void d(androidx.core.os.e eVar) {
            if (this.f2758e.remove(eVar) && this.f2758e.isEmpty()) {
                c();
            }
        }

        public c e() {
            return this.f2754a;
        }

        public final Fragment f() {
            return this.f2756c;
        }

        b g() {
            return this.f2755b;
        }

        final boolean h() {
            return this.f2759f;
        }

        final boolean i() {
            return this.f2760g;
        }

        public final void j(androidx.core.os.e eVar) {
            l();
            this.f2758e.add(eVar);
        }

        final void k(c cVar, b bVar) {
            b bVar2;
            int i10 = c.f2752b[bVar.ordinal()];
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 == 3 && this.f2754a != c.REMOVED) {
                        if (m.F0(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.f2756c + " mFinalState = " + this.f2754a + " -> " + cVar + ". ");
                        }
                        this.f2754a = cVar;
                        return;
                    }
                    return;
                }
                if (m.F0(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.f2756c + " mFinalState = " + this.f2754a + " -> REMOVED. mLifecycleImpact  = " + this.f2755b + " to REMOVING.");
                }
                this.f2754a = c.REMOVED;
                bVar2 = b.REMOVING;
            } else {
                if (this.f2754a != c.REMOVED) {
                    return;
                }
                if (m.F0(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.f2756c + " mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = " + this.f2755b + " to ADDING.");
                }
                this.f2754a = c.VISIBLE;
                bVar2 = b.ADDING;
            }
            this.f2755b = bVar2;
        }

        abstract void l();

        public String toString() {
            return "Operation {" + Integer.toHexString(System.identityHashCode(this)) + "} {mFinalState = " + this.f2754a + "} {mLifecycleImpact = " + this.f2755b + "} {mFragment = " + this.f2756c + "}";
        }
    }

    b0(ViewGroup viewGroup) {
        this.f2742a = viewGroup;
    }

    private void a(e.c cVar, e.b bVar, t tVar) {
        synchronized (this.f2743b) {
            androidx.core.os.e eVar = new androidx.core.os.e();
            e eVarH = h(tVar.k());
            if (eVarH != null) {
                eVarH.k(cVar, bVar);
                return;
            }
            d dVar = new d(cVar, bVar, tVar, eVar);
            this.f2743b.add(dVar);
            dVar.a(new a(dVar));
            dVar.a(new b(dVar));
        }
    }

    private e h(Fragment fragment) {
        Iterator it = this.f2743b.iterator();
        while (it.hasNext()) {
            e eVar = (e) it.next();
            if (eVar.f().equals(fragment) && !eVar.h()) {
                return eVar;
            }
        }
        return null;
    }

    private e i(Fragment fragment) {
        Iterator it = this.f2744c.iterator();
        while (it.hasNext()) {
            e eVar = (e) it.next();
            if (eVar.f().equals(fragment) && !eVar.h()) {
                return eVar;
            }
        }
        return null;
    }

    static b0 n(ViewGroup viewGroup, m mVar) {
        return o(viewGroup, mVar.y0());
    }

    static b0 o(ViewGroup viewGroup, c0 c0Var) {
        int i10 = j0.b.f24364b;
        Object tag = viewGroup.getTag(i10);
        if (tag instanceof b0) {
            return (b0) tag;
        }
        b0 b0VarA = c0Var.a(viewGroup);
        viewGroup.setTag(i10, b0VarA);
        return b0VarA;
    }

    private void q() {
        Iterator it = this.f2743b.iterator();
        while (it.hasNext()) {
            e eVar = (e) it.next();
            if (eVar.g() == e.b.ADDING) {
                eVar.k(e.c.d(eVar.f().u1().getVisibility()), e.b.NONE);
            }
        }
    }

    void b(e.c cVar, t tVar) {
        if (m.F0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing add operation for fragment " + tVar.k());
        }
        a(cVar, e.b.ADDING, tVar);
    }

    void c(t tVar) {
        if (m.F0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing hide operation for fragment " + tVar.k());
        }
        a(e.c.GONE, e.b.NONE, tVar);
    }

    void d(t tVar) {
        if (m.F0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing remove operation for fragment " + tVar.k());
        }
        a(e.c.REMOVED, e.b.REMOVING, tVar);
    }

    void e(t tVar) {
        if (m.F0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing show operation for fragment " + tVar.k());
        }
        a(e.c.VISIBLE, e.b.NONE, tVar);
    }

    abstract void f(List list, boolean z10);

    void g() {
        if (this.f2746e) {
            return;
        }
        if (!androidx.core.view.w.R(this.f2742a)) {
            j();
            this.f2745d = false;
            return;
        }
        synchronized (this.f2743b) {
            if (!this.f2743b.isEmpty()) {
                ArrayList arrayList = new ArrayList(this.f2744c);
                this.f2744c.clear();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    e eVar = (e) it.next();
                    if (m.F0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Cancelling operation " + eVar);
                    }
                    eVar.b();
                    if (!eVar.i()) {
                        this.f2744c.add(eVar);
                    }
                }
                q();
                ArrayList arrayList2 = new ArrayList(this.f2743b);
                this.f2743b.clear();
                this.f2744c.addAll(arrayList2);
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    ((e) it2.next()).l();
                }
                f(arrayList2, this.f2745d);
                this.f2745d = false;
            }
        }
    }

    void j() {
        String str;
        String str2;
        boolean zR = androidx.core.view.w.R(this.f2742a);
        synchronized (this.f2743b) {
            q();
            Iterator it = this.f2743b.iterator();
            while (it.hasNext()) {
                ((e) it.next()).l();
            }
            Iterator it2 = new ArrayList(this.f2744c).iterator();
            while (it2.hasNext()) {
                e eVar = (e) it2.next();
                if (m.F0(2)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("SpecialEffectsController: ");
                    if (zR) {
                        str2 = "";
                    } else {
                        str2 = "Container " + this.f2742a + " is not attached to window. ";
                    }
                    sb2.append(str2);
                    sb2.append("Cancelling running operation ");
                    sb2.append(eVar);
                    Log.v("FragmentManager", sb2.toString());
                }
                eVar.b();
            }
            Iterator it3 = new ArrayList(this.f2743b).iterator();
            while (it3.hasNext()) {
                e eVar2 = (e) it3.next();
                if (m.F0(2)) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("SpecialEffectsController: ");
                    if (zR) {
                        str = "";
                    } else {
                        str = "Container " + this.f2742a + " is not attached to window. ";
                    }
                    sb3.append(str);
                    sb3.append("Cancelling pending operation ");
                    sb3.append(eVar2);
                    Log.v("FragmentManager", sb3.toString());
                }
                eVar2.b();
            }
        }
    }

    void k() {
        if (this.f2746e) {
            this.f2746e = false;
            g();
        }
    }

    e.b l(t tVar) {
        e eVarH = h(tVar.k());
        e.b bVarG = eVarH != null ? eVarH.g() : null;
        e eVarI = i(tVar.k());
        return (eVarI == null || !(bVarG == null || bVarG == e.b.NONE)) ? bVarG : eVarI.g();
    }

    public ViewGroup m() {
        return this.f2742a;
    }

    void p() {
        synchronized (this.f2743b) {
            q();
            this.f2746e = false;
            int size = this.f2743b.size() - 1;
            while (true) {
                if (size < 0) {
                    break;
                }
                e eVar = (e) this.f2743b.get(size);
                e.c cVarG = e.c.g(eVar.f().T);
                e.c cVarE = eVar.e();
                e.c cVar = e.c.VISIBLE;
                if (cVarE == cVar && cVarG != cVar) {
                    this.f2746e = eVar.f().h0();
                    break;
                }
                size--;
            }
        }
    }

    void r(boolean z10) {
        this.f2745d = z10;
    }
}
