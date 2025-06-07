package androidx.fragment.app;

import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class y {

    class a implements Runnable {

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ int f3042m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ ArrayList f3043n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ ArrayList f3044o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ ArrayList f3045p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ ArrayList f3046q;

        a(int i10, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
            this.f3042m = i10;
            this.f3043n = arrayList;
            this.f3044o = arrayList2;
            this.f3045p = arrayList3;
            this.f3046q = arrayList4;
        }

        @Override // java.lang.Runnable
        public void run() {
            for (int i10 = 0; i10 < this.f3042m; i10++) {
                androidx.core.view.w.E0((View) this.f3043n.get(i10), (String) this.f3044o.get(i10));
                androidx.core.view.w.E0((View) this.f3045p.get(i10), (String) this.f3046q.get(i10));
            }
        }
    }

    class b implements Runnable {

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ ArrayList f3048m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ Map f3049n;

        b(ArrayList arrayList, Map map) {
            this.f3048m = arrayList;
            this.f3049n = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            int size = this.f3048m.size();
            for (int i10 = 0; i10 < size; i10++) {
                View view = (View) this.f3048m.get(i10);
                String strJ = androidx.core.view.w.J(view);
                if (strJ != null) {
                    androidx.core.view.w.E0(view, y.i(this.f3049n, strJ));
                }
            }
        }
    }

    class c implements Runnable {

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ ArrayList f3051m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ Map f3052n;

        c(ArrayList arrayList, Map map) {
            this.f3051m = arrayList;
            this.f3052n = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            int size = this.f3051m.size();
            for (int i10 = 0; i10 < size; i10++) {
                View view = (View) this.f3051m.get(i10);
                androidx.core.view.w.E0(view, (String) this.f3052n.get(androidx.core.view.w.J(view)));
            }
        }
    }

    protected static void d(List list, View view) {
        int size = list.size();
        if (h(list, view, size)) {
            return;
        }
        if (androidx.core.view.w.J(view) != null) {
            list.add(view);
        }
        for (int i10 = size; i10 < list.size(); i10++) {
            View view2 = (View) list.get(i10);
            if (view2 instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view2;
                int childCount = viewGroup.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = viewGroup.getChildAt(i11);
                    if (!h(list, childAt, size) && androidx.core.view.w.J(childAt) != null) {
                        list.add(childAt);
                    }
                }
            }
        }
    }

    private static boolean h(List list, View view, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            if (list.get(i11) == view) {
                return true;
            }
        }
        return false;
    }

    static String i(Map map, String str) {
        for (Map.Entry entry : map.entrySet()) {
            if (str.equals(entry.getValue())) {
                return (String) entry.getKey();
            }
        }
        return null;
    }

    protected static boolean l(List list) {
        return list == null || list.isEmpty();
    }

    public abstract void A(Object obj, ArrayList arrayList, ArrayList arrayList2);

    public abstract Object B(Object obj);

    public abstract void a(Object obj, View view);

    public abstract void b(Object obj, ArrayList arrayList);

    public abstract void c(ViewGroup viewGroup, Object obj);

    public abstract boolean e(Object obj);

    void f(ArrayList arrayList, View view) {
        if (view.getVisibility() == 0) {
            boolean z10 = view instanceof ViewGroup;
            View view2 = view;
            if (z10) {
                ViewGroup viewGroup = (ViewGroup) view;
                boolean zA = androidx.core.view.z.a(viewGroup);
                view2 = viewGroup;
                if (!zA) {
                    int childCount = viewGroup.getChildCount();
                    for (int i10 = 0; i10 < childCount; i10++) {
                        f(arrayList, viewGroup.getChildAt(i10));
                    }
                    return;
                }
            }
            arrayList.add(view2);
        }
    }

    public abstract Object g(Object obj);

    void j(Map map, View view) {
        if (view.getVisibility() == 0) {
            String strJ = androidx.core.view.w.J(view);
            if (strJ != null) {
                map.put(strJ, view);
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    j(map, viewGroup.getChildAt(i10));
                }
            }
        }
    }

    protected void k(View view, Rect rect) {
        if (androidx.core.view.w.R(view)) {
            RectF rectF = new RectF();
            rectF.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
            view.getMatrix().mapRect(rectF);
            rectF.offset(view.getLeft(), view.getTop());
            Object parent = view.getParent();
            while (parent instanceof View) {
                View view2 = (View) parent;
                rectF.offset(-view2.getScrollX(), -view2.getScrollY());
                view2.getMatrix().mapRect(rectF);
                rectF.offset(view2.getLeft(), view2.getTop());
                parent = view2.getParent();
            }
            view.getRootView().getLocationOnScreen(new int[2]);
            rectF.offset(r1[0], r1[1]);
            rect.set(Math.round(rectF.left), Math.round(rectF.top), Math.round(rectF.right), Math.round(rectF.bottom));
        }
    }

    public abstract Object m(Object obj, Object obj2, Object obj3);

    public abstract Object n(Object obj, Object obj2, Object obj3);

    ArrayList o(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            View view = (View) arrayList.get(i10);
            arrayList2.add(androidx.core.view.w.J(view));
            androidx.core.view.w.E0(view, null);
        }
        return arrayList2;
    }

    public abstract void p(Object obj, View view);

    public abstract void q(Object obj, ArrayList arrayList, ArrayList arrayList2);

    public abstract void r(Object obj, View view, ArrayList arrayList);

    void s(ViewGroup viewGroup, ArrayList arrayList, Map map) {
        androidx.core.view.u.a(viewGroup, new c(arrayList, map));
    }

    public abstract void t(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2, Object obj4, ArrayList arrayList3);

    public abstract void u(Object obj, Rect rect);

    public abstract void v(Object obj, View view);

    public void w(Fragment fragment, Object obj, androidx.core.os.e eVar, Runnable runnable) {
        runnable.run();
    }

    void x(View view, ArrayList arrayList, Map map) {
        androidx.core.view.u.a(view, new b(arrayList, map));
    }

    void y(View view, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, Map map) {
        int size = arrayList2.size();
        ArrayList arrayList4 = new ArrayList();
        for (int i10 = 0; i10 < size; i10++) {
            View view2 = (View) arrayList.get(i10);
            String strJ = androidx.core.view.w.J(view2);
            arrayList4.add(strJ);
            if (strJ != null) {
                androidx.core.view.w.E0(view2, null);
                String str = (String) map.get(strJ);
                int i11 = 0;
                while (true) {
                    if (i11 >= size) {
                        break;
                    }
                    if (str.equals(arrayList3.get(i11))) {
                        androidx.core.view.w.E0((View) arrayList2.get(i11), strJ);
                        break;
                    }
                    i11++;
                }
            }
        }
        androidx.core.view.u.a(view, new a(size, arrayList2, arrayList3, arrayList, arrayList4));
    }

    public abstract void z(Object obj, View view, ArrayList arrayList);
}
