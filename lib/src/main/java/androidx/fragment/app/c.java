package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.core.os.e;
import androidx.fragment.app.b0;
import androidx.fragment.app.f;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
class c extends b0 {

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f2771a;

        static {
            int[] iArr = new int[b0.e.c.values().length];
            f2771a = iArr;
            try {
                iArr[b0.e.c.GONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2771a[b0.e.c.INVISIBLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2771a[b0.e.c.REMOVED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2771a[b0.e.c.VISIBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    class b implements Runnable {

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ List f2772m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ b0.e f2773n;

        b(List list, b0.e eVar) {
            this.f2772m = list;
            this.f2773n = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f2772m.contains(this.f2773n)) {
                this.f2772m.remove(this.f2773n);
                c.this.s(this.f2773n);
            }
        }
    }

    /* renamed from: androidx.fragment.app.c$c, reason: collision with other inner class name */
    class C0043c extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ViewGroup f2775a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f2776b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f2777c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ b0.e f2778d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ k f2779e;

        C0043c(ViewGroup viewGroup, View view, boolean z10, b0.e eVar, k kVar) {
            this.f2775a = viewGroup;
            this.f2776b = view;
            this.f2777c = z10;
            this.f2778d = eVar;
            this.f2779e = kVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f2775a.endViewTransition(this.f2776b);
            if (this.f2777c) {
                this.f2778d.e().b(this.f2776b);
            }
            this.f2779e.a();
        }
    }

    class d implements e.b {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Animator f2781a;

        d(Animator animator) {
            this.f2781a = animator;
        }

        @Override // androidx.core.os.e.b
        public void a() {
            this.f2781a.end();
        }
    }

    class e implements Animation.AnimationListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ViewGroup f2783a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f2784b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ k f2785c;

        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                e eVar = e.this;
                eVar.f2783a.endViewTransition(eVar.f2784b);
                e.this.f2785c.a();
            }
        }

        e(ViewGroup viewGroup, View view, k kVar) {
            this.f2783a = viewGroup;
            this.f2784b = view;
            this.f2785c = kVar;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            this.f2783a.post(new a());
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    class f implements e.b {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f2788a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ViewGroup f2789b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ k f2790c;

        f(View view, ViewGroup viewGroup, k kVar) {
            this.f2788a = view;
            this.f2789b = viewGroup;
            this.f2790c = kVar;
        }

        @Override // androidx.core.os.e.b
        public void a() {
            this.f2788a.clearAnimation();
            this.f2789b.endViewTransition(this.f2788a);
            this.f2790c.a();
        }
    }

    class g implements Runnable {

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ b0.e f2792m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ b0.e f2793n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ boolean f2794o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ q.a f2795p;

        g(b0.e eVar, b0.e eVar2, boolean z10, q.a aVar) {
            this.f2792m = eVar;
            this.f2793n = eVar2;
            this.f2794o = z10;
            this.f2795p = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            w.f(this.f2792m.f(), this.f2793n.f(), this.f2794o, this.f2795p, false);
        }
    }

    class h implements Runnable {

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ y f2797m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ View f2798n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ Rect f2799o;

        h(y yVar, View view, Rect rect) {
            this.f2797m = yVar;
            this.f2798n = view;
            this.f2799o = rect;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f2797m.k(this.f2798n, this.f2799o);
        }
    }

    class i implements Runnable {

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ ArrayList f2801m;

        i(ArrayList arrayList) {
            this.f2801m = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            w.A(this.f2801m, 4);
        }
    }

    class j implements Runnable {

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ m f2803m;

        j(m mVar) {
            this.f2803m = mVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f2803m.a();
        }
    }

    private static class k extends l {

        /* renamed from: c, reason: collision with root package name */
        private boolean f2805c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f2806d;

        /* renamed from: e, reason: collision with root package name */
        private f.d f2807e;

        k(b0.e eVar, androidx.core.os.e eVar2, boolean z10) {
            super(eVar, eVar2);
            this.f2806d = false;
            this.f2805c = z10;
        }

        f.d e(Context context) {
            if (this.f2806d) {
                return this.f2807e;
            }
            f.d dVarC = androidx.fragment.app.f.c(context, b().f(), b().e() == b0.e.c.VISIBLE, this.f2805c);
            this.f2807e = dVarC;
            this.f2806d = true;
            return dVarC;
        }
    }

    private static class l {

        /* renamed from: a, reason: collision with root package name */
        private final b0.e f2808a;

        /* renamed from: b, reason: collision with root package name */
        private final androidx.core.os.e f2809b;

        l(b0.e eVar, androidx.core.os.e eVar2) {
            this.f2808a = eVar;
            this.f2809b = eVar2;
        }

        void a() {
            this.f2808a.d(this.f2809b);
        }

        b0.e b() {
            return this.f2808a;
        }

        androidx.core.os.e c() {
            return this.f2809b;
        }

        boolean d() {
            b0.e.c cVar;
            b0.e.c cVarG = b0.e.c.g(this.f2808a.f().T);
            b0.e.c cVarE = this.f2808a.e();
            return cVarG == cVarE || !(cVarG == (cVar = b0.e.c.VISIBLE) || cVarE == cVar);
        }
    }

    private static class m extends l {

        /* renamed from: c, reason: collision with root package name */
        private final Object f2810c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f2811d;

        /* renamed from: e, reason: collision with root package name */
        private final Object f2812e;

        m(b0.e eVar, androidx.core.os.e eVar2, boolean z10, boolean z11) {
            boolean zO;
            Object objS;
            super(eVar, eVar2);
            if (eVar.e() == b0.e.c.VISIBLE) {
                Fragment fragmentF = eVar.f();
                this.f2810c = z10 ? fragmentF.O() : fragmentF.x();
                Fragment fragmentF2 = eVar.f();
                zO = z10 ? fragmentF2.o() : fragmentF2.n();
            } else {
                Fragment fragmentF3 = eVar.f();
                this.f2810c = z10 ? fragmentF3.Q() : fragmentF3.A();
                zO = true;
            }
            this.f2811d = zO;
            if (z11) {
                Fragment fragmentF4 = eVar.f();
                objS = z10 ? fragmentF4.S() : fragmentF4.R();
            } else {
                objS = null;
            }
            this.f2812e = objS;
        }

        private y f(Object obj) {
            if (obj == null) {
                return null;
            }
            y yVar = w.f2984b;
            if (yVar != null && yVar.e(obj)) {
                return yVar;
            }
            y yVar2 = w.f2985c;
            if (yVar2 != null && yVar2.e(obj)) {
                return yVar2;
            }
            throw new IllegalArgumentException("Transition " + obj + " for fragment " + b().f() + " is not a valid framework Transition or AndroidX Transition");
        }

        y e() {
            y yVarF = f(this.f2810c);
            y yVarF2 = f(this.f2812e);
            if (yVarF == null || yVarF2 == null || yVarF == yVarF2) {
                return yVarF != null ? yVarF : yVarF2;
            }
            throw new IllegalArgumentException("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + b().f() + " returned Transition " + this.f2810c + " which uses a different Transition  type than its shared element transition " + this.f2812e);
        }

        public Object g() {
            return this.f2812e;
        }

        Object h() {
            return this.f2810c;
        }

        public boolean i() {
            return this.f2812e != null;
        }

        boolean j() {
            return this.f2811d;
        }
    }

    c(ViewGroup viewGroup) {
        super(viewGroup);
    }

    private void w(List list, List list2, boolean z10, Map map) {
        StringBuilder sb2;
        String str;
        f.d dVarE;
        ViewGroup viewGroupM = m();
        Context context = viewGroupM.getContext();
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        boolean z11 = false;
        while (it.hasNext()) {
            k kVar = (k) it.next();
            if (kVar.d() || (dVarE = kVar.e(context)) == null) {
                kVar.a();
            } else {
                Animator animator = dVarE.f2847b;
                if (animator == null) {
                    arrayList.add(kVar);
                } else {
                    b0.e eVarB = kVar.b();
                    Fragment fragmentF = eVarB.f();
                    if (Boolean.TRUE.equals(map.get(eVarB))) {
                        if (androidx.fragment.app.m.F0(2)) {
                            Log.v("FragmentManager", "Ignoring Animator set on " + fragmentF + " as this Fragment was involved in a Transition.");
                        }
                        kVar.a();
                    } else {
                        boolean z12 = eVarB.e() == b0.e.c.GONE;
                        if (z12) {
                            list2.remove(eVarB);
                        }
                        View view = fragmentF.T;
                        viewGroupM.startViewTransition(view);
                        animator.addListener(new C0043c(viewGroupM, view, z12, eVarB, kVar));
                        animator.setTarget(view);
                        animator.start();
                        kVar.c().d(new d(animator));
                        z11 = true;
                    }
                }
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            k kVar2 = (k) it2.next();
            b0.e eVarB2 = kVar2.b();
            Fragment fragmentF2 = eVarB2.f();
            if (z10) {
                if (androidx.fragment.app.m.F0(2)) {
                    sb2 = new StringBuilder();
                    sb2.append("Ignoring Animation set on ");
                    sb2.append(fragmentF2);
                    str = " as Animations cannot run alongside Transitions.";
                    sb2.append(str);
                    Log.v("FragmentManager", sb2.toString());
                }
                kVar2.a();
            } else if (z11) {
                if (androidx.fragment.app.m.F0(2)) {
                    sb2 = new StringBuilder();
                    sb2.append("Ignoring Animation set on ");
                    sb2.append(fragmentF2);
                    str = " as Animations cannot run alongside Animators.";
                    sb2.append(str);
                    Log.v("FragmentManager", sb2.toString());
                }
                kVar2.a();
            } else {
                View view2 = fragmentF2.T;
                Animation animation = (Animation) androidx.core.util.h.f(((f.d) androidx.core.util.h.f(kVar2.e(context))).f2846a);
                if (eVarB2.e() != b0.e.c.REMOVED) {
                    view2.startAnimation(animation);
                    kVar2.a();
                } else {
                    viewGroupM.startViewTransition(view2);
                    f.e eVar = new f.e(animation, viewGroupM, view2);
                    eVar.setAnimationListener(new e(viewGroupM, view2, kVar2));
                    view2.startAnimation(eVar);
                }
                kVar2.c().d(new f(view2, viewGroupM, kVar2));
            }
        }
    }

    private Map x(List list, List list2, boolean z10, b0.e eVar, b0.e eVar2) {
        View view;
        Object obj;
        ArrayList arrayList;
        Object obj2;
        ArrayList arrayList2;
        b0.e eVar3;
        b0.e eVar4;
        View view2;
        Object objN;
        q.a aVar;
        ArrayList arrayList3;
        b0.e eVar5;
        ArrayList arrayList4;
        Rect rect;
        View view3;
        y yVar;
        b0.e eVar6;
        View view4;
        boolean z11 = z10;
        b0.e eVar7 = eVar;
        b0.e eVar8 = eVar2;
        HashMap map = new HashMap();
        Iterator it = list.iterator();
        y yVar2 = null;
        while (it.hasNext()) {
            m mVar = (m) it.next();
            if (!mVar.d()) {
                y yVarE = mVar.e();
                if (yVar2 == null) {
                    yVar2 = yVarE;
                } else if (yVarE != null && yVar2 != yVarE) {
                    throw new IllegalArgumentException("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + mVar.b().f() + " returned Transition " + mVar.h() + " which uses a different Transition  type than other Fragments.");
                }
            }
        }
        if (yVar2 == null) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                m mVar2 = (m) it2.next();
                map.put(mVar2.b(), Boolean.FALSE);
                mVar2.a();
            }
            return map;
        }
        View view5 = new View(m().getContext());
        Rect rect2 = new Rect();
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        q.a aVar2 = new q.a();
        Iterator it3 = list.iterator();
        Object obj3 = null;
        View view6 = null;
        boolean z12 = false;
        while (it3.hasNext()) {
            m mVar3 = (m) it3.next();
            if (!mVar3.i() || eVar7 == null || eVar8 == null) {
                aVar = aVar2;
                arrayList3 = arrayList6;
                eVar5 = eVar7;
                arrayList4 = arrayList5;
                rect = rect2;
                view3 = view5;
                yVar = yVar2;
                eVar6 = eVar8;
                view6 = view6;
            } else {
                Object objB = yVar2.B(yVar2.g(mVar3.g()));
                ArrayList arrayListT = eVar2.f().T();
                ArrayList arrayListT2 = eVar.f().T();
                ArrayList arrayListU = eVar.f().U();
                View view7 = view6;
                int i10 = 0;
                while (i10 < arrayListU.size()) {
                    int iIndexOf = arrayListT.indexOf(arrayListU.get(i10));
                    ArrayList arrayList7 = arrayListU;
                    if (iIndexOf != -1) {
                        arrayListT.set(iIndexOf, arrayListT2.get(i10));
                    }
                    i10++;
                    arrayListU = arrayList7;
                }
                ArrayList arrayListU2 = eVar2.f().U();
                Fragment fragmentF = eVar.f();
                if (z11) {
                    fragmentF.y();
                    eVar2.f().B();
                } else {
                    fragmentF.B();
                    eVar2.f().y();
                }
                int i11 = 0;
                for (int size = arrayListT.size(); i11 < size; size = size) {
                    aVar2.put((String) arrayListT.get(i11), (String) arrayListU2.get(i11));
                    i11++;
                }
                q.a aVar3 = new q.a();
                u(aVar3, eVar.f().T);
                aVar3.o(arrayListT);
                aVar2.o(aVar3.keySet());
                q.a aVar4 = new q.a();
                u(aVar4, eVar2.f().T);
                aVar4.o(arrayListU2);
                aVar4.o(aVar2.values());
                w.x(aVar2, aVar4);
                v(aVar3, aVar2.keySet());
                v(aVar4, aVar2.values());
                if (aVar2.isEmpty()) {
                    arrayList5.clear();
                    arrayList6.clear();
                    aVar = aVar2;
                    arrayList3 = arrayList6;
                    eVar5 = eVar7;
                    arrayList4 = arrayList5;
                    rect = rect2;
                    view3 = view5;
                    yVar = yVar2;
                    view6 = view7;
                    obj3 = null;
                    eVar6 = eVar8;
                } else {
                    w.f(eVar2.f(), eVar.f(), z11, aVar3, true);
                    aVar = aVar2;
                    ArrayList arrayList8 = arrayList6;
                    androidx.core.view.u.a(m(), new g(eVar2, eVar, z10, aVar4));
                    arrayList5.addAll(aVar3.values());
                    if (arrayListT.isEmpty()) {
                        view6 = view7;
                    } else {
                        View view8 = (View) aVar3.get((String) arrayListT.get(0));
                        yVar2.v(objB, view8);
                        view6 = view8;
                    }
                    arrayList3 = arrayList8;
                    arrayList3.addAll(aVar4.values());
                    if (!arrayListU2.isEmpty() && (view4 = (View) aVar4.get((String) arrayListU2.get(0))) != null) {
                        androidx.core.view.u.a(m(), new h(yVar2, view4, rect2));
                        z12 = true;
                    }
                    yVar2.z(objB, view5, arrayList5);
                    arrayList4 = arrayList5;
                    rect = rect2;
                    view3 = view5;
                    yVar = yVar2;
                    yVar2.t(objB, null, null, null, null, objB, arrayList3);
                    Boolean bool = Boolean.TRUE;
                    eVar5 = eVar;
                    map.put(eVar5, bool);
                    eVar6 = eVar2;
                    map.put(eVar6, bool);
                    obj3 = objB;
                }
            }
            eVar7 = eVar5;
            arrayList5 = arrayList4;
            rect2 = rect;
            view5 = view3;
            eVar8 = eVar6;
            aVar2 = aVar;
            z11 = z10;
            arrayList6 = arrayList3;
            yVar2 = yVar;
        }
        View view9 = view6;
        q.a aVar5 = aVar2;
        ArrayList arrayList9 = arrayList6;
        b0.e eVar9 = eVar7;
        ArrayList arrayList10 = arrayList5;
        Rect rect3 = rect2;
        View view10 = view5;
        y yVar3 = yVar2;
        boolean z13 = false;
        b0.e eVar10 = eVar8;
        ArrayList arrayList11 = new ArrayList();
        Iterator it4 = list.iterator();
        Object obj4 = null;
        Object objN2 = null;
        while (it4.hasNext()) {
            m mVar4 = (m) it4.next();
            if (mVar4.d()) {
                map.put(mVar4.b(), Boolean.FALSE);
                mVar4.a();
            } else {
                Object objG = yVar3.g(mVar4.h());
                b0.e eVarB = mVar4.b();
                boolean z14 = (obj3 == null || !(eVarB == eVar9 || eVarB == eVar10)) ? z13 : true;
                if (objG == null) {
                    if (!z14) {
                        map.put(eVarB, Boolean.FALSE);
                        mVar4.a();
                    }
                    arrayList2 = arrayList9;
                    arrayList = arrayList10;
                    view = view10;
                    objN = obj4;
                    eVar3 = eVar10;
                    view2 = view9;
                } else {
                    ArrayList arrayList12 = new ArrayList();
                    Object obj5 = obj4;
                    t(arrayList12, eVarB.f().T);
                    if (z14) {
                        if (eVarB == eVar9) {
                            arrayList12.removeAll(arrayList10);
                        } else {
                            arrayList12.removeAll(arrayList9);
                        }
                    }
                    if (arrayList12.isEmpty()) {
                        yVar3.a(objG, view10);
                        arrayList2 = arrayList9;
                        arrayList = arrayList10;
                        view = view10;
                        eVar4 = eVarB;
                        obj2 = objN2;
                        eVar3 = eVar10;
                        obj = obj5;
                    } else {
                        yVar3.b(objG, arrayList12);
                        view = view10;
                        obj = obj5;
                        arrayList = arrayList10;
                        obj2 = objN2;
                        arrayList2 = arrayList9;
                        eVar3 = eVar10;
                        yVar3.t(objG, objG, arrayList12, null, null, null, null);
                        if (eVarB.e() == b0.e.c.GONE) {
                            eVar4 = eVarB;
                            list2.remove(eVar4);
                            ArrayList arrayList13 = new ArrayList(arrayList12);
                            arrayList13.remove(eVar4.f().T);
                            yVar3.r(objG, eVar4.f().T, arrayList13);
                            androidx.core.view.u.a(m(), new i(arrayList12));
                        } else {
                            eVar4 = eVarB;
                        }
                    }
                    if (eVar4.e() == b0.e.c.VISIBLE) {
                        arrayList11.addAll(arrayList12);
                        if (z12) {
                            yVar3.u(objG, rect3);
                        }
                        view2 = view9;
                    } else {
                        view2 = view9;
                        yVar3.v(objG, view2);
                    }
                    map.put(eVar4, Boolean.TRUE);
                    if (mVar4.j()) {
                        objN2 = yVar3.n(obj2, objG, null);
                        objN = obj;
                    } else {
                        objN = yVar3.n(obj, objG, null);
                        objN2 = obj2;
                    }
                }
                eVar10 = eVar3;
                obj4 = objN;
                view9 = view2;
                view10 = view;
                arrayList10 = arrayList;
                arrayList9 = arrayList2;
                z13 = false;
            }
        }
        ArrayList arrayList14 = arrayList9;
        ArrayList arrayList15 = arrayList10;
        b0.e eVar11 = eVar10;
        Object objM = yVar3.m(objN2, obj4, obj3);
        Iterator it5 = list.iterator();
        while (it5.hasNext()) {
            m mVar5 = (m) it5.next();
            if (!mVar5.d()) {
                Object objH = mVar5.h();
                b0.e eVarB2 = mVar5.b();
                boolean z15 = obj3 != null && (eVarB2 == eVar9 || eVarB2 == eVar11);
                if (objH != null || z15) {
                    if (androidx.core.view.w.S(m())) {
                        yVar3.w(mVar5.b().f(), objM, mVar5.c(), new j(mVar5));
                    } else {
                        if (androidx.fragment.app.m.F0(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Container " + m() + " has not been laid out. Completing operation " + eVarB2);
                        }
                        mVar5.a();
                    }
                }
            }
        }
        if (!androidx.core.view.w.S(m())) {
            return map;
        }
        w.A(arrayList11, 4);
        ArrayList arrayListO = yVar3.o(arrayList14);
        yVar3.c(m(), objM);
        yVar3.y(m(), arrayList15, arrayList14, arrayListO, aVar5);
        w.A(arrayList11, 0);
        yVar3.A(obj3, arrayList15, arrayList14);
        return map;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0085  */
    @Override // androidx.fragment.app.b0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    void f(java.util.List r11, boolean r12) {
        /*
            r10 = this;
            java.util.Iterator r0 = r11.iterator()
            r1 = 0
            r6 = r1
            r7 = r6
        L7:
            boolean r1 = r0.hasNext()
            r2 = 1
            if (r1 == 0) goto L44
            java.lang.Object r1 = r0.next()
            androidx.fragment.app.b0$e r1 = (androidx.fragment.app.b0.e) r1
            androidx.fragment.app.Fragment r3 = r1.f()
            android.view.View r3 = r3.T
            androidx.fragment.app.b0$e$c r3 = androidx.fragment.app.b0.e.c.g(r3)
            int[] r4 = androidx.fragment.app.c.a.f2771a
            androidx.fragment.app.b0$e$c r5 = r1.e()
            int r5 = r5.ordinal()
            r4 = r4[r5]
            if (r4 == r2) goto L3c
            r2 = 2
            if (r4 == r2) goto L3c
            r2 = 3
            if (r4 == r2) goto L3c
            r2 = 4
            if (r4 == r2) goto L36
            goto L7
        L36:
            androidx.fragment.app.b0$e$c r2 = androidx.fragment.app.b0.e.c.VISIBLE
            if (r3 == r2) goto L7
            r7 = r1
            goto L7
        L3c:
            androidx.fragment.app.b0$e$c r2 = androidx.fragment.app.b0.e.c.VISIBLE
            if (r3 != r2) goto L7
            if (r6 != 0) goto L7
            r6 = r1
            goto L7
        L44:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r11)
            java.util.Iterator r11 = r11.iterator()
        L57:
            boolean r4 = r11.hasNext()
            if (r4 == 0) goto L95
            java.lang.Object r4 = r11.next()
            androidx.fragment.app.b0$e r4 = (androidx.fragment.app.b0.e) r4
            androidx.core.os.e r5 = new androidx.core.os.e
            r5.<init>()
            r4.j(r5)
            androidx.fragment.app.c$k r8 = new androidx.fragment.app.c$k
            r8.<init>(r4, r5, r12)
            r0.add(r8)
            androidx.core.os.e r5 = new androidx.core.os.e
            r5.<init>()
            r4.j(r5)
            androidx.fragment.app.c$m r8 = new androidx.fragment.app.c$m
            r9 = 0
            if (r12 == 0) goto L83
            if (r4 != r6) goto L86
            goto L85
        L83:
            if (r4 != r7) goto L86
        L85:
            r9 = r2
        L86:
            r8.<init>(r4, r5, r12, r9)
            r3.add(r8)
            androidx.fragment.app.c$b r5 = new androidx.fragment.app.c$b
            r5.<init>(r1, r4)
            r4.a(r5)
            goto L57
        L95:
            r2 = r10
            r4 = r1
            r5 = r12
            java.util.Map r11 = r2.x(r3, r4, r5, r6, r7)
            java.lang.Boolean r12 = java.lang.Boolean.TRUE
            boolean r12 = r11.containsValue(r12)
            r10.w(r0, r1, r12, r11)
            java.util.Iterator r11 = r1.iterator()
        La9:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto Lb9
            java.lang.Object r12 = r11.next()
            androidx.fragment.app.b0$e r12 = (androidx.fragment.app.b0.e) r12
            r10.s(r12)
            goto La9
        Lb9:
            r1.clear()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.c.f(java.util.List, boolean):void");
    }

    void s(b0.e eVar) {
        eVar.e().b(eVar.f().T);
    }

    void t(ArrayList arrayList, View view) {
        if (!(view instanceof ViewGroup)) {
            if (arrayList.contains(view)) {
                return;
            }
            arrayList.add(view);
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        if (androidx.core.view.z.a(viewGroup)) {
            if (arrayList.contains(view)) {
                return;
            }
            arrayList.add(viewGroup);
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            if (childAt.getVisibility() == 0) {
                t(arrayList, childAt);
            }
        }
    }

    void u(Map map, View view) {
        String strJ = androidx.core.view.w.J(view);
        if (strJ != null) {
            map.put(strJ, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = viewGroup.getChildAt(i10);
                if (childAt.getVisibility() == 0) {
                    u(map, childAt);
                }
            }
        }
    }

    void v(q.a aVar, Collection collection) {
        Iterator it = aVar.entrySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(androidx.core.view.w.J((View) ((Map.Entry) it.next()).getValue()))) {
                it.remove();
            }
        }
    }
}
