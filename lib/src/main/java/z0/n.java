package z0;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class n {

    /* renamed from: a, reason: collision with root package name */
    private static l f28725a = new b();

    /* renamed from: b, reason: collision with root package name */
    private static ThreadLocal f28726b = new ThreadLocal();

    /* renamed from: c, reason: collision with root package name */
    static ArrayList f28727c = new ArrayList();

    private static class a implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

        /* renamed from: m, reason: collision with root package name */
        l f28728m;

        /* renamed from: n, reason: collision with root package name */
        ViewGroup f28729n;

        /* renamed from: z0.n$a$a, reason: collision with other inner class name */
        class C0218a extends m {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ q.a f28730a;

            C0218a(q.a aVar) {
                this.f28730a = aVar;
            }

            @Override // z0.l.f
            public void c(l lVar) {
                ((ArrayList) this.f28730a.get(a.this.f28729n)).remove(lVar);
                lVar.W(this);
            }
        }

        a(l lVar, ViewGroup viewGroup) {
            this.f28728m = lVar;
            this.f28729n = viewGroup;
        }

        private void a() {
            this.f28729n.getViewTreeObserver().removeOnPreDrawListener(this);
            this.f28729n.removeOnAttachStateChangeListener(this);
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            a();
            if (!n.f28727c.remove(this.f28729n)) {
                return true;
            }
            q.a aVarB = n.b();
            ArrayList arrayList = (ArrayList) aVarB.get(this.f28729n);
            ArrayList arrayList2 = null;
            if (arrayList == null) {
                arrayList = new ArrayList();
                aVarB.put(this.f28729n, arrayList);
            } else if (arrayList.size() > 0) {
                arrayList2 = new ArrayList(arrayList);
            }
            arrayList.add(this.f28728m);
            this.f28728m.a(new C0218a(aVarB));
            this.f28728m.r(this.f28729n, false);
            if (arrayList2 != null) {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    ((l) it.next()).Y(this.f28729n);
                }
            }
            this.f28728m.V(this.f28729n);
            return true;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            a();
            n.f28727c.remove(this.f28729n);
            ArrayList arrayList = (ArrayList) n.b().get(this.f28729n);
            if (arrayList != null && arrayList.size() > 0) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((l) it.next()).Y(this.f28729n);
                }
            }
            this.f28728m.s(true);
        }
    }

    public static void a(ViewGroup viewGroup, l lVar) {
        if (f28727c.contains(viewGroup) || !androidx.core.view.w.S(viewGroup)) {
            return;
        }
        f28727c.add(viewGroup);
        if (lVar == null) {
            lVar = f28725a;
        }
        l lVarClone = lVar.clone();
        d(viewGroup, lVarClone);
        k.b(viewGroup, null);
        c(viewGroup, lVarClone);
    }

    static q.a b() {
        q.a aVar;
        WeakReference weakReference = (WeakReference) f28726b.get();
        if (weakReference != null && (aVar = (q.a) weakReference.get()) != null) {
            return aVar;
        }
        q.a aVar2 = new q.a();
        f28726b.set(new WeakReference(aVar2));
        return aVar2;
    }

    private static void c(ViewGroup viewGroup, l lVar) {
        if (lVar == null || viewGroup == null) {
            return;
        }
        a aVar = new a(lVar, viewGroup);
        viewGroup.addOnAttachStateChangeListener(aVar);
        viewGroup.getViewTreeObserver().addOnPreDrawListener(aVar);
    }

    private static void d(ViewGroup viewGroup, l lVar) {
        ArrayList arrayList = (ArrayList) b().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((l) it.next()).U(viewGroup);
            }
        }
        if (lVar != null) {
            lVar.r(viewGroup, true);
        }
        k.a(viewGroup);
    }
}
