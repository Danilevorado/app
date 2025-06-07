package androidx.fragment.app;

import android.content.Context;
import android.graphics.Rect;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.v;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* loaded from: classes.dex */
abstract class w {

    /* renamed from: a, reason: collision with root package name */
    private static final int[] f2983a = {0, 3, 0, 1, 5, 4, 7, 6, 9, 8, 10};

    /* renamed from: b, reason: collision with root package name */
    static final y f2984b = new x();

    /* renamed from: c, reason: collision with root package name */
    static final y f2985c = w();

    class a implements Runnable {

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ g f2986m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ Fragment f2987n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ androidx.core.os.e f2988o;

        a(g gVar, Fragment fragment, androidx.core.os.e eVar) {
            this.f2986m = gVar;
            this.f2987n = fragment;
            this.f2988o = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f2986m.a(this.f2987n, this.f2988o);
        }
    }

    class b implements Runnable {

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ ArrayList f2989m;

        b(ArrayList arrayList) {
            this.f2989m = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            w.A(this.f2989m, 4);
        }
    }

    class c implements Runnable {

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ g f2990m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ Fragment f2991n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ androidx.core.os.e f2992o;

        c(g gVar, Fragment fragment, androidx.core.os.e eVar) {
            this.f2990m = gVar;
            this.f2991n = fragment;
            this.f2992o = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f2990m.a(this.f2991n, this.f2992o);
        }
    }

    class d implements Runnable {

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ Object f2993m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ y f2994n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ View f2995o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ Fragment f2996p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ ArrayList f2997q;

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ ArrayList f2998r;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ ArrayList f2999s;

        /* renamed from: t, reason: collision with root package name */
        final /* synthetic */ Object f3000t;

        d(Object obj, y yVar, View view, Fragment fragment, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, Object obj2) {
            this.f2993m = obj;
            this.f2994n = yVar;
            this.f2995o = view;
            this.f2996p = fragment;
            this.f2997q = arrayList;
            this.f2998r = arrayList2;
            this.f2999s = arrayList3;
            this.f3000t = obj2;
        }

        @Override // java.lang.Runnable
        public void run() {
            Object obj = this.f2993m;
            if (obj != null) {
                this.f2994n.p(obj, this.f2995o);
                this.f2998r.addAll(w.k(this.f2994n, this.f2993m, this.f2996p, this.f2997q, this.f2995o));
            }
            if (this.f2999s != null) {
                if (this.f3000t != null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(this.f2995o);
                    this.f2994n.q(this.f3000t, this.f2999s, arrayList);
                }
                this.f2999s.clear();
                this.f2999s.add(this.f2995o);
            }
        }
    }

    class e implements Runnable {

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ Fragment f3001m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ Fragment f3002n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ boolean f3003o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ q.a f3004p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ View f3005q;

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ y f3006r;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ Rect f3007s;

        e(Fragment fragment, Fragment fragment2, boolean z10, q.a aVar, View view, y yVar, Rect rect) {
            this.f3001m = fragment;
            this.f3002n = fragment2;
            this.f3003o = z10;
            this.f3004p = aVar;
            this.f3005q = view;
            this.f3006r = yVar;
            this.f3007s = rect;
        }

        @Override // java.lang.Runnable
        public void run() {
            w.f(this.f3001m, this.f3002n, this.f3003o, this.f3004p, false);
            View view = this.f3005q;
            if (view != null) {
                this.f3006r.k(view, this.f3007s);
            }
        }
    }

    class f implements Runnable {

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ y f3008m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ q.a f3009n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ Object f3010o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ h f3011p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ ArrayList f3012q;

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ View f3013r;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ Fragment f3014s;

        /* renamed from: t, reason: collision with root package name */
        final /* synthetic */ Fragment f3015t;

        /* renamed from: u, reason: collision with root package name */
        final /* synthetic */ boolean f3016u;

        /* renamed from: v, reason: collision with root package name */
        final /* synthetic */ ArrayList f3017v;

        /* renamed from: w, reason: collision with root package name */
        final /* synthetic */ Object f3018w;

        /* renamed from: x, reason: collision with root package name */
        final /* synthetic */ Rect f3019x;

        f(y yVar, q.a aVar, Object obj, h hVar, ArrayList arrayList, View view, Fragment fragment, Fragment fragment2, boolean z10, ArrayList arrayList2, Object obj2, Rect rect) {
            this.f3008m = yVar;
            this.f3009n = aVar;
            this.f3010o = obj;
            this.f3011p = hVar;
            this.f3012q = arrayList;
            this.f3013r = view;
            this.f3014s = fragment;
            this.f3015t = fragment2;
            this.f3016u = z10;
            this.f3017v = arrayList2;
            this.f3018w = obj2;
            this.f3019x = rect;
        }

        @Override // java.lang.Runnable
        public void run() {
            q.a aVarH = w.h(this.f3008m, this.f3009n, this.f3010o, this.f3011p);
            if (aVarH != null) {
                this.f3012q.addAll(aVarH.values());
                this.f3012q.add(this.f3013r);
            }
            w.f(this.f3014s, this.f3015t, this.f3016u, aVarH, false);
            Object obj = this.f3010o;
            if (obj != null) {
                this.f3008m.A(obj, this.f3017v, this.f3012q);
                View viewS = w.s(aVarH, this.f3011p, this.f3018w, this.f3016u);
                if (viewS != null) {
                    this.f3008m.k(viewS, this.f3019x);
                }
            }
        }
    }

    interface g {
        void a(Fragment fragment, androidx.core.os.e eVar);

        void b(Fragment fragment, androidx.core.os.e eVar);
    }

    static class h {

        /* renamed from: a, reason: collision with root package name */
        public Fragment f3020a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f3021b;

        /* renamed from: c, reason: collision with root package name */
        public androidx.fragment.app.a f3022c;

        /* renamed from: d, reason: collision with root package name */
        public Fragment f3023d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f3024e;

        /* renamed from: f, reason: collision with root package name */
        public androidx.fragment.app.a f3025f;

        h() {
        }
    }

    static void A(ArrayList arrayList, int i10) {
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((View) arrayList.get(size)).setVisibility(i10);
        }
    }

    static void B(Context context, androidx.fragment.app.g gVar, ArrayList arrayList, ArrayList arrayList2, int i10, int i11, boolean z10, g gVar2) {
        ViewGroup viewGroup;
        SparseArray sparseArray = new SparseArray();
        for (int i12 = i10; i12 < i11; i12++) {
            androidx.fragment.app.a aVar = (androidx.fragment.app.a) arrayList.get(i12);
            if (((Boolean) arrayList2.get(i12)).booleanValue()) {
                e(aVar, sparseArray, z10);
            } else {
                c(aVar, sparseArray, z10);
            }
        }
        if (sparseArray.size() != 0) {
            View view = new View(context);
            int size = sparseArray.size();
            for (int i13 = 0; i13 < size; i13++) {
                int iKeyAt = sparseArray.keyAt(i13);
                q.a aVarD = d(iKeyAt, arrayList, arrayList2, i10, i11);
                h hVar = (h) sparseArray.valueAt(i13);
                if (gVar.f() && (viewGroup = (ViewGroup) gVar.e(iKeyAt)) != null) {
                    if (z10) {
                        o(viewGroup, hVar, view, aVarD, gVar2);
                    } else {
                        n(viewGroup, hVar, view, aVarD, gVar2);
                    }
                }
            }
        }
    }

    private static void a(ArrayList arrayList, q.a aVar, Collection collection) {
        for (int size = aVar.size() - 1; size >= 0; size--) {
            View view = (View) aVar.m(size);
            if (collection.contains(androidx.core.view.w.J(view))) {
                arrayList.add(view);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x008c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void b(androidx.fragment.app.a r8, androidx.fragment.app.v.a r9, android.util.SparseArray r10, boolean r11, boolean r12) {
        /*
            Method dump skipped, instructions count: 226
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.w.b(androidx.fragment.app.a, androidx.fragment.app.v$a, android.util.SparseArray, boolean, boolean):void");
    }

    public static void c(androidx.fragment.app.a aVar, SparseArray sparseArray, boolean z10) {
        int size = aVar.f2958c.size();
        for (int i10 = 0; i10 < size; i10++) {
            b(aVar, (v.a) aVar.f2958c.get(i10), sparseArray, false, z10);
        }
    }

    private static q.a d(int i10, ArrayList arrayList, ArrayList arrayList2, int i11, int i12) {
        ArrayList arrayList3;
        ArrayList arrayList4;
        q.a aVar = new q.a();
        for (int i13 = i12 - 1; i13 >= i11; i13--) {
            androidx.fragment.app.a aVar2 = (androidx.fragment.app.a) arrayList.get(i13);
            if (aVar2.x(i10)) {
                boolean zBooleanValue = ((Boolean) arrayList2.get(i13)).booleanValue();
                ArrayList arrayList5 = aVar2.f2971p;
                if (arrayList5 != null) {
                    int size = arrayList5.size();
                    if (zBooleanValue) {
                        arrayList3 = aVar2.f2971p;
                        arrayList4 = aVar2.f2972q;
                    } else {
                        ArrayList arrayList6 = aVar2.f2971p;
                        arrayList3 = aVar2.f2972q;
                        arrayList4 = arrayList6;
                    }
                    for (int i14 = 0; i14 < size; i14++) {
                        String str = (String) arrayList4.get(i14);
                        String str2 = (String) arrayList3.get(i14);
                        String str3 = (String) aVar.remove(str2);
                        if (str3 != null) {
                            aVar.put(str, str3);
                        } else {
                            aVar.put(str, str2);
                        }
                    }
                }
            }
        }
        return aVar;
    }

    public static void e(androidx.fragment.app.a aVar, SparseArray sparseArray, boolean z10) {
        if (aVar.f2723t.o0().f()) {
            for (int size = aVar.f2958c.size() - 1; size >= 0; size--) {
                b(aVar, (v.a) aVar.f2958c.get(size), sparseArray, true, z10);
            }
        }
    }

    static void f(Fragment fragment, Fragment fragment2, boolean z10, q.a aVar, boolean z11) {
        if (z10) {
            fragment2.y();
        } else {
            fragment.y();
        }
    }

    private static boolean g(y yVar, List list) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (!yVar.e(list.get(i10))) {
                return false;
            }
        }
        return true;
    }

    static q.a h(y yVar, q.a aVar, Object obj, h hVar) {
        ArrayList arrayList;
        Fragment fragment = hVar.f3020a;
        View viewX = fragment.X();
        if (aVar.isEmpty() || obj == null || viewX == null) {
            aVar.clear();
            return null;
        }
        q.a aVar2 = new q.a();
        yVar.j(aVar2, viewX);
        androidx.fragment.app.a aVar3 = hVar.f3022c;
        if (hVar.f3021b) {
            fragment.B();
            arrayList = aVar3.f2971p;
        } else {
            fragment.y();
            arrayList = aVar3.f2972q;
        }
        if (arrayList != null) {
            aVar2.o(arrayList);
            aVar2.o(aVar.values());
        }
        x(aVar, aVar2);
        return aVar2;
    }

    private static q.a i(y yVar, q.a aVar, Object obj, h hVar) {
        ArrayList arrayList;
        if (aVar.isEmpty() || obj == null) {
            aVar.clear();
            return null;
        }
        Fragment fragment = hVar.f3023d;
        q.a aVar2 = new q.a();
        yVar.j(aVar2, fragment.u1());
        androidx.fragment.app.a aVar3 = hVar.f3025f;
        if (hVar.f3024e) {
            fragment.y();
            arrayList = aVar3.f2972q;
        } else {
            fragment.B();
            arrayList = aVar3.f2971p;
        }
        if (arrayList != null) {
            aVar2.o(arrayList);
        }
        aVar.o(aVar2.keySet());
        return aVar2;
    }

    private static y j(Fragment fragment, Fragment fragment2) {
        ArrayList arrayList = new ArrayList();
        if (fragment != null) {
            Object objA = fragment.A();
            if (objA != null) {
                arrayList.add(objA);
            }
            Object objQ = fragment.Q();
            if (objQ != null) {
                arrayList.add(objQ);
            }
            Object objS = fragment.S();
            if (objS != null) {
                arrayList.add(objS);
            }
        }
        if (fragment2 != null) {
            Object objX = fragment2.x();
            if (objX != null) {
                arrayList.add(objX);
            }
            Object objO = fragment2.O();
            if (objO != null) {
                arrayList.add(objO);
            }
            Object objR = fragment2.R();
            if (objR != null) {
                arrayList.add(objR);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        y yVar = f2984b;
        if (yVar != null && g(yVar, arrayList)) {
            return yVar;
        }
        y yVar2 = f2985c;
        if (yVar2 != null && g(yVar2, arrayList)) {
            return yVar2;
        }
        if (yVar == null && yVar2 == null) {
            return null;
        }
        throw new IllegalArgumentException("Invalid Transition types");
    }

    static ArrayList k(y yVar, Object obj, Fragment fragment, ArrayList arrayList, View view) {
        if (obj == null) {
            return null;
        }
        ArrayList arrayList2 = new ArrayList();
        View viewX = fragment.X();
        if (viewX != null) {
            yVar.f(arrayList2, viewX);
        }
        if (arrayList != null) {
            arrayList2.removeAll(arrayList);
        }
        if (arrayList2.isEmpty()) {
            return arrayList2;
        }
        arrayList2.add(view);
        yVar.b(obj, arrayList2);
        return arrayList2;
    }

    private static Object l(y yVar, ViewGroup viewGroup, View view, q.a aVar, h hVar, ArrayList arrayList, ArrayList arrayList2, Object obj, Object obj2) {
        Object objT;
        q.a aVar2;
        Object obj3;
        Rect rect;
        Fragment fragment = hVar.f3020a;
        Fragment fragment2 = hVar.f3023d;
        if (fragment == null || fragment2 == null) {
            return null;
        }
        boolean z10 = hVar.f3021b;
        if (aVar.isEmpty()) {
            aVar2 = aVar;
            objT = null;
        } else {
            objT = t(yVar, fragment, fragment2, z10);
            aVar2 = aVar;
        }
        q.a aVarI = i(yVar, aVar2, objT, hVar);
        if (aVar.isEmpty()) {
            obj3 = null;
        } else {
            arrayList.addAll(aVarI.values());
            obj3 = objT;
        }
        if (obj == null && obj2 == null && obj3 == null) {
            return null;
        }
        f(fragment, fragment2, z10, aVarI, true);
        if (obj3 != null) {
            rect = new Rect();
            yVar.z(obj3, view, arrayList);
            z(yVar, obj3, obj2, aVarI, hVar.f3024e, hVar.f3025f);
            if (obj != null) {
                yVar.u(obj, rect);
            }
        } else {
            rect = null;
        }
        androidx.core.view.u.a(viewGroup, new f(yVar, aVar, obj3, hVar, arrayList2, view, fragment, fragment2, z10, arrayList, obj, rect));
        return obj3;
    }

    private static Object m(y yVar, ViewGroup viewGroup, View view, q.a aVar, h hVar, ArrayList arrayList, ArrayList arrayList2, Object obj, Object obj2) {
        Object obj3;
        View view2;
        Rect rect;
        Fragment fragment = hVar.f3020a;
        Fragment fragment2 = hVar.f3023d;
        if (fragment != null) {
            fragment.u1().setVisibility(0);
        }
        if (fragment == null || fragment2 == null) {
            return null;
        }
        boolean z10 = hVar.f3021b;
        Object objT = aVar.isEmpty() ? null : t(yVar, fragment, fragment2, z10);
        q.a aVarI = i(yVar, aVar, objT, hVar);
        q.a aVarH = h(yVar, aVar, objT, hVar);
        if (aVar.isEmpty()) {
            if (aVarI != null) {
                aVarI.clear();
            }
            if (aVarH != null) {
                aVarH.clear();
            }
            obj3 = null;
        } else {
            a(arrayList, aVarI, aVar.keySet());
            a(arrayList2, aVarH, aVar.values());
            obj3 = objT;
        }
        if (obj == null && obj2 == null && obj3 == null) {
            return null;
        }
        f(fragment, fragment2, z10, aVarI, true);
        if (obj3 != null) {
            arrayList2.add(view);
            yVar.z(obj3, view, arrayList);
            z(yVar, obj3, obj2, aVarI, hVar.f3024e, hVar.f3025f);
            Rect rect2 = new Rect();
            View viewS = s(aVarH, hVar, obj, z10);
            if (viewS != null) {
                yVar.u(obj, rect2);
            }
            rect = rect2;
            view2 = viewS;
        } else {
            view2 = null;
            rect = null;
        }
        androidx.core.view.u.a(viewGroup, new e(fragment, fragment2, z10, aVarH, view2, yVar, rect));
        return obj3;
    }

    private static void n(ViewGroup viewGroup, h hVar, View view, q.a aVar, g gVar) {
        Object obj;
        Fragment fragment = hVar.f3020a;
        Fragment fragment2 = hVar.f3023d;
        y yVarJ = j(fragment2, fragment);
        if (yVarJ == null) {
            return;
        }
        boolean z10 = hVar.f3021b;
        boolean z11 = hVar.f3024e;
        Object objQ = q(yVarJ, fragment, z10);
        Object objR = r(yVarJ, fragment2, z11);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Object objL = l(yVarJ, viewGroup, view, aVar, hVar, arrayList, arrayList2, objQ, objR);
        if (objQ == null && objL == null) {
            obj = objR;
            if (obj == null) {
                return;
            }
        } else {
            obj = objR;
        }
        ArrayList arrayListK = k(yVarJ, obj, fragment2, arrayList, view);
        if (arrayListK == null || arrayListK.isEmpty()) {
            obj = null;
        }
        Object obj2 = obj;
        yVarJ.a(objQ, view);
        Object objU = u(yVarJ, objQ, obj2, objL, fragment, hVar.f3021b);
        if (fragment2 != null && arrayListK != null && (arrayListK.size() > 0 || arrayList.size() > 0)) {
            androidx.core.os.e eVar = new androidx.core.os.e();
            gVar.b(fragment2, eVar);
            yVarJ.w(fragment2, objU, eVar, new c(gVar, fragment2, eVar));
        }
        if (objU != null) {
            ArrayList arrayList3 = new ArrayList();
            yVarJ.t(objU, objQ, arrayList3, obj2, arrayListK, objL, arrayList2);
            y(yVarJ, viewGroup, fragment, view, arrayList2, objQ, arrayList3, obj2, arrayListK);
            yVarJ.x(viewGroup, arrayList2, aVar);
            yVarJ.c(viewGroup, objU);
            yVarJ.s(viewGroup, arrayList2, aVar);
        }
    }

    private static void o(ViewGroup viewGroup, h hVar, View view, q.a aVar, g gVar) {
        Object obj;
        Fragment fragment = hVar.f3020a;
        Fragment fragment2 = hVar.f3023d;
        y yVarJ = j(fragment2, fragment);
        if (yVarJ == null) {
            return;
        }
        boolean z10 = hVar.f3021b;
        boolean z11 = hVar.f3024e;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Object objQ = q(yVarJ, fragment, z10);
        Object objR = r(yVarJ, fragment2, z11);
        Object objM = m(yVarJ, viewGroup, view, aVar, hVar, arrayList2, arrayList, objQ, objR);
        if (objQ == null && objM == null) {
            obj = objR;
            if (obj == null) {
                return;
            }
        } else {
            obj = objR;
        }
        ArrayList arrayListK = k(yVarJ, obj, fragment2, arrayList2, view);
        ArrayList arrayListK2 = k(yVarJ, objQ, fragment, arrayList, view);
        A(arrayListK2, 4);
        Object objU = u(yVarJ, objQ, obj, objM, fragment, z10);
        if (fragment2 != null && arrayListK != null && (arrayListK.size() > 0 || arrayList2.size() > 0)) {
            androidx.core.os.e eVar = new androidx.core.os.e();
            gVar.b(fragment2, eVar);
            yVarJ.w(fragment2, objU, eVar, new a(gVar, fragment2, eVar));
        }
        if (objU != null) {
            v(yVarJ, obj, fragment2, arrayListK);
            ArrayList arrayListO = yVarJ.o(arrayList);
            yVarJ.t(objU, objQ, arrayListK2, obj, arrayListK, objM, arrayList);
            yVarJ.c(viewGroup, objU);
            yVarJ.y(viewGroup, arrayList2, arrayList, arrayListO, aVar);
            A(arrayListK2, 0);
            yVarJ.A(objM, arrayList2, arrayList);
        }
    }

    private static h p(h hVar, SparseArray sparseArray, int i10) {
        if (hVar != null) {
            return hVar;
        }
        h hVar2 = new h();
        sparseArray.put(i10, hVar2);
        return hVar2;
    }

    private static Object q(y yVar, Fragment fragment, boolean z10) {
        if (fragment == null) {
            return null;
        }
        return yVar.g(z10 ? fragment.O() : fragment.x());
    }

    private static Object r(y yVar, Fragment fragment, boolean z10) {
        if (fragment == null) {
            return null;
        }
        return yVar.g(z10 ? fragment.Q() : fragment.A());
    }

    static View s(q.a aVar, h hVar, Object obj, boolean z10) {
        ArrayList arrayList;
        androidx.fragment.app.a aVar2 = hVar.f3022c;
        if (obj == null || aVar == null || (arrayList = aVar2.f2971p) == null || arrayList.isEmpty()) {
            return null;
        }
        return (View) aVar.get((String) (z10 ? aVar2.f2971p : aVar2.f2972q).get(0));
    }

    private static Object t(y yVar, Fragment fragment, Fragment fragment2, boolean z10) {
        if (fragment == null || fragment2 == null) {
            return null;
        }
        return yVar.B(yVar.g(z10 ? fragment2.S() : fragment.R()));
    }

    private static Object u(y yVar, Object obj, Object obj2, Object obj3, Fragment fragment, boolean z10) {
        return (obj == null || obj2 == null || fragment == null) ? true : z10 ? fragment.o() : fragment.n() ? yVar.n(obj2, obj, obj3) : yVar.m(obj2, obj, obj3);
    }

    private static void v(y yVar, Object obj, Fragment fragment, ArrayList arrayList) {
        if (fragment != null && obj != null && fragment.f2683x && fragment.L && fragment.Z) {
            fragment.D1(true);
            yVar.r(obj, fragment.X(), arrayList);
            androidx.core.view.u.a(fragment.S, new b(arrayList));
        }
    }

    private static y w() {
        try {
            return (y) z0.e.class.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    static void x(q.a aVar, q.a aVar2) {
        for (int size = aVar.size() - 1; size >= 0; size--) {
            if (!aVar2.containsKey((String) aVar.m(size))) {
                aVar.k(size);
            }
        }
    }

    private static void y(y yVar, ViewGroup viewGroup, Fragment fragment, View view, ArrayList arrayList, Object obj, ArrayList arrayList2, Object obj2, ArrayList arrayList3) {
        androidx.core.view.u.a(viewGroup, new d(obj, yVar, view, fragment, arrayList, arrayList2, arrayList3, obj2));
    }

    private static void z(y yVar, Object obj, Object obj2, q.a aVar, boolean z10, androidx.fragment.app.a aVar2) {
        ArrayList arrayList = aVar2.f2971p;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        View view = (View) aVar.get((String) (z10 ? aVar2.f2972q : aVar2.f2971p).get(0));
        yVar.v(obj, view);
        if (obj2 != null) {
            yVar.v(obj2, view);
        }
    }
}
