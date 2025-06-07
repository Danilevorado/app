package z0;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import z0.l;

/* loaded from: classes.dex */
public class e extends androidx.fragment.app.y {

    class a extends l.e {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Rect f28667a;

        a(Rect rect) {
            this.f28667a = rect;
        }
    }

    class b implements l.f {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f28669a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ArrayList f28670b;

        b(View view, ArrayList arrayList) {
            this.f28669a = view;
            this.f28670b = arrayList;
        }

        @Override // z0.l.f
        public void a(l lVar) {
        }

        @Override // z0.l.f
        public void b(l lVar) {
        }

        @Override // z0.l.f
        public void c(l lVar) {
            lVar.W(this);
            this.f28669a.setVisibility(8);
            int size = this.f28670b.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((View) this.f28670b.get(i10)).setVisibility(0);
            }
        }

        @Override // z0.l.f
        public void d(l lVar) {
        }

        @Override // z0.l.f
        public void e(l lVar) {
        }
    }

    class c extends m {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f28672a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ArrayList f28673b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Object f28674c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ArrayList f28675d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Object f28676e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ArrayList f28677f;

        c(Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
            this.f28672a = obj;
            this.f28673b = arrayList;
            this.f28674c = obj2;
            this.f28675d = arrayList2;
            this.f28676e = obj3;
            this.f28677f = arrayList3;
        }

        @Override // z0.m, z0.l.f
        public void b(l lVar) {
            Object obj = this.f28672a;
            if (obj != null) {
                e.this.q(obj, this.f28673b, null);
            }
            Object obj2 = this.f28674c;
            if (obj2 != null) {
                e.this.q(obj2, this.f28675d, null);
            }
            Object obj3 = this.f28676e;
            if (obj3 != null) {
                e.this.q(obj3, this.f28677f, null);
            }
        }

        @Override // z0.l.f
        public void c(l lVar) {
            lVar.W(this);
        }
    }

    class d extends l.e {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Rect f28679a;

        d(Rect rect) {
            this.f28679a = rect;
        }
    }

    private static boolean C(l lVar) {
        return (androidx.fragment.app.y.l(lVar.G()) && androidx.fragment.app.y.l(lVar.H()) && androidx.fragment.app.y.l(lVar.I())) ? false : true;
    }

    @Override // androidx.fragment.app.y
    public void A(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        p pVar = (p) obj;
        if (pVar != null) {
            pVar.J().clear();
            pVar.J().addAll(arrayList2);
            q(pVar, arrayList, arrayList2);
        }
    }

    @Override // androidx.fragment.app.y
    public Object B(Object obj) {
        if (obj == null) {
            return null;
        }
        p pVar = new p();
        pVar.l0((l) obj);
        return pVar;
    }

    @Override // androidx.fragment.app.y
    public void a(Object obj, View view) {
        if (obj != null) {
            ((l) obj).b(view);
        }
    }

    @Override // androidx.fragment.app.y
    public void b(Object obj, ArrayList arrayList) {
        l lVar = (l) obj;
        if (lVar == null) {
            return;
        }
        int i10 = 0;
        if (lVar instanceof p) {
            p pVar = (p) lVar;
            int iO0 = pVar.o0();
            while (i10 < iO0) {
                b(pVar.n0(i10), arrayList);
                i10++;
            }
            return;
        }
        if (C(lVar) || !androidx.fragment.app.y.l(lVar.J())) {
            return;
        }
        int size = arrayList.size();
        while (i10 < size) {
            lVar.b((View) arrayList.get(i10));
            i10++;
        }
    }

    @Override // androidx.fragment.app.y
    public void c(ViewGroup viewGroup, Object obj) {
        n.a(viewGroup, (l) obj);
    }

    @Override // androidx.fragment.app.y
    public boolean e(Object obj) {
        return obj instanceof l;
    }

    @Override // androidx.fragment.app.y
    public Object g(Object obj) {
        if (obj != null) {
            return ((l) obj).clone();
        }
        return null;
    }

    @Override // androidx.fragment.app.y
    public Object m(Object obj, Object obj2, Object obj3) {
        l lVarT0 = (l) obj;
        l lVar = (l) obj2;
        l lVar2 = (l) obj3;
        if (lVarT0 != null && lVar != null) {
            lVarT0 = new p().l0(lVarT0).l0(lVar).t0(1);
        } else if (lVarT0 == null) {
            lVarT0 = lVar != null ? lVar : null;
        }
        if (lVar2 == null) {
            return lVarT0;
        }
        p pVar = new p();
        if (lVarT0 != null) {
            pVar.l0(lVarT0);
        }
        pVar.l0(lVar2);
        return pVar;
    }

    @Override // androidx.fragment.app.y
    public Object n(Object obj, Object obj2, Object obj3) {
        p pVar = new p();
        if (obj != null) {
            pVar.l0((l) obj);
        }
        if (obj2 != null) {
            pVar.l0((l) obj2);
        }
        if (obj3 != null) {
            pVar.l0((l) obj3);
        }
        return pVar;
    }

    @Override // androidx.fragment.app.y
    public void p(Object obj, View view) {
        if (obj != null) {
            ((l) obj).X(view);
        }
    }

    @Override // androidx.fragment.app.y
    public void q(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        l lVar = (l) obj;
        int i10 = 0;
        if (lVar instanceof p) {
            p pVar = (p) lVar;
            int iO0 = pVar.o0();
            while (i10 < iO0) {
                q(pVar.n0(i10), arrayList, arrayList2);
                i10++;
            }
            return;
        }
        if (C(lVar)) {
            return;
        }
        List listJ = lVar.J();
        if (listJ.size() == arrayList.size() && listJ.containsAll(arrayList)) {
            int size = arrayList2 == null ? 0 : arrayList2.size();
            while (i10 < size) {
                lVar.b((View) arrayList2.get(i10));
                i10++;
            }
            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                lVar.X((View) arrayList.get(size2));
            }
        }
    }

    @Override // androidx.fragment.app.y
    public void r(Object obj, View view, ArrayList arrayList) {
        ((l) obj).a(new b(view, arrayList));
    }

    @Override // androidx.fragment.app.y
    public void t(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2, Object obj4, ArrayList arrayList3) {
        ((l) obj).a(new c(obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    @Override // androidx.fragment.app.y
    public void u(Object obj, Rect rect) {
        if (obj != null) {
            ((l) obj).c0(new d(rect));
        }
    }

    @Override // androidx.fragment.app.y
    public void v(Object obj, View view) {
        if (view != null) {
            Rect rect = new Rect();
            k(view, rect);
            ((l) obj).c0(new a(rect));
        }
    }

    @Override // androidx.fragment.app.y
    public void z(Object obj, View view, ArrayList arrayList) {
        p pVar = (p) obj;
        List listJ = pVar.J();
        listJ.clear();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            androidx.fragment.app.y.d(listJ, (View) arrayList.get(i10));
        }
        listJ.add(view);
        arrayList.add(view);
        b(pVar, arrayList);
    }
}
