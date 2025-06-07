package androidx.lifecycle;

import androidx.lifecycle.j;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import k.b;

/* loaded from: classes.dex */
public class o extends j {

    /* renamed from: b, reason: collision with root package name */
    private k.a f3146b;

    /* renamed from: c, reason: collision with root package name */
    private j.c f3147c;

    /* renamed from: d, reason: collision with root package name */
    private final WeakReference f3148d;

    /* renamed from: e, reason: collision with root package name */
    private int f3149e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f3150f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f3151g;

    /* renamed from: h, reason: collision with root package name */
    private ArrayList f3152h;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f3153i;

    static class a {

        /* renamed from: a, reason: collision with root package name */
        j.c f3154a;

        /* renamed from: b, reason: collision with root package name */
        l f3155b;

        a(m mVar, j.c cVar) {
            this.f3155b = q.f(mVar);
            this.f3154a = cVar;
        }

        void a(n nVar, j.b bVar) {
            j.c cVarD = bVar.d();
            this.f3154a = o.k(this.f3154a, cVarD);
            this.f3155b.d(nVar, bVar);
            this.f3154a = cVarD;
        }
    }

    public o(n nVar) {
        this(nVar, true);
    }

    private o(n nVar, boolean z10) {
        this.f3146b = new k.a();
        this.f3149e = 0;
        this.f3150f = false;
        this.f3151g = false;
        this.f3152h = new ArrayList();
        this.f3148d = new WeakReference(nVar);
        this.f3147c = j.c.INITIALIZED;
        this.f3153i = z10;
    }

    private void d(n nVar) {
        Iterator itDescendingIterator = this.f3146b.descendingIterator();
        while (itDescendingIterator.hasNext() && !this.f3151g) {
            Map.Entry entry = (Map.Entry) itDescendingIterator.next();
            a aVar = (a) entry.getValue();
            while (aVar.f3154a.compareTo(this.f3147c) > 0 && !this.f3151g && this.f3146b.contains((m) entry.getKey())) {
                j.b bVarB = j.b.b(aVar.f3154a);
                if (bVarB == null) {
                    throw new IllegalStateException("no event down from " + aVar.f3154a);
                }
                n(bVarB.d());
                aVar.a(nVar, bVarB);
                m();
            }
        }
    }

    private j.c e(m mVar) {
        Map.Entry entryO = this.f3146b.o(mVar);
        j.c cVar = null;
        j.c cVar2 = entryO != null ? ((a) entryO.getValue()).f3154a : null;
        if (!this.f3152h.isEmpty()) {
            cVar = (j.c) this.f3152h.get(r0.size() - 1);
        }
        return k(k(this.f3147c, cVar2), cVar);
    }

    private void f(String str) {
        if (!this.f3153i || j.a.e().b()) {
            return;
        }
        throw new IllegalStateException("Method " + str + " must be called on the main thread");
    }

    private void g(n nVar) {
        b.d dVarH = this.f3146b.h();
        while (dVarH.hasNext() && !this.f3151g) {
            Map.Entry entry = (Map.Entry) dVarH.next();
            a aVar = (a) entry.getValue();
            while (aVar.f3154a.compareTo(this.f3147c) < 0 && !this.f3151g && this.f3146b.contains((m) entry.getKey())) {
                n(aVar.f3154a);
                j.b bVarG = j.b.g(aVar.f3154a);
                if (bVarG == null) {
                    throw new IllegalStateException("no event up from " + aVar.f3154a);
                }
                aVar.a(nVar, bVarG);
                m();
            }
        }
    }

    private boolean i() {
        if (this.f3146b.size() == 0) {
            return true;
        }
        j.c cVar = ((a) this.f3146b.e().getValue()).f3154a;
        j.c cVar2 = ((a) this.f3146b.i().getValue()).f3154a;
        return cVar == cVar2 && this.f3147c == cVar2;
    }

    static j.c k(j.c cVar, j.c cVar2) {
        return (cVar2 == null || cVar2.compareTo(cVar) >= 0) ? cVar : cVar2;
    }

    private void l(j.c cVar) {
        j.c cVar2 = this.f3147c;
        if (cVar2 == cVar) {
            return;
        }
        if (cVar2 == j.c.INITIALIZED && cVar == j.c.DESTROYED) {
            throw new IllegalStateException("no event down from " + this.f3147c);
        }
        this.f3147c = cVar;
        if (this.f3150f || this.f3149e != 0) {
            this.f3151g = true;
            return;
        }
        this.f3150f = true;
        p();
        this.f3150f = false;
        if (this.f3147c == j.c.DESTROYED) {
            this.f3146b = new k.a();
        }
    }

    private void m() {
        this.f3152h.remove(r0.size() - 1);
    }

    private void n(j.c cVar) {
        this.f3152h.add(cVar);
    }

    private void p() {
        n nVar = (n) this.f3148d.get();
        if (nVar == null) {
            throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is alreadygarbage collected. It is too late to change lifecycle state.");
        }
        while (true) {
            boolean zI = i();
            this.f3151g = false;
            if (zI) {
                return;
            }
            if (this.f3147c.compareTo(((a) this.f3146b.e().getValue()).f3154a) < 0) {
                d(nVar);
            }
            Map.Entry entryI = this.f3146b.i();
            if (!this.f3151g && entryI != null && this.f3147c.compareTo(((a) entryI.getValue()).f3154a) > 0) {
                g(nVar);
            }
        }
    }

    @Override // androidx.lifecycle.j
    public void a(m mVar) {
        n nVar;
        f("addObserver");
        j.c cVar = this.f3147c;
        j.c cVar2 = j.c.DESTROYED;
        if (cVar != cVar2) {
            cVar2 = j.c.INITIALIZED;
        }
        a aVar = new a(mVar, cVar2);
        if (((a) this.f3146b.l(mVar, aVar)) == null && (nVar = (n) this.f3148d.get()) != null) {
            boolean z10 = this.f3149e != 0 || this.f3150f;
            j.c cVarE = e(mVar);
            this.f3149e++;
            while (aVar.f3154a.compareTo(cVarE) < 0 && this.f3146b.contains(mVar)) {
                n(aVar.f3154a);
                j.b bVarG = j.b.g(aVar.f3154a);
                if (bVarG == null) {
                    throw new IllegalStateException("no event up from " + aVar.f3154a);
                }
                aVar.a(nVar, bVarG);
                m();
                cVarE = e(mVar);
            }
            if (!z10) {
                p();
            }
            this.f3149e--;
        }
    }

    @Override // androidx.lifecycle.j
    public j.c b() {
        return this.f3147c;
    }

    @Override // androidx.lifecycle.j
    public void c(m mVar) {
        f("removeObserver");
        this.f3146b.n(mVar);
    }

    public void h(j.b bVar) {
        f("handleLifecycleEvent");
        l(bVar.d());
    }

    public void j(j.c cVar) {
        f("markState");
        o(cVar);
    }

    public void o(j.c cVar) {
        f("setCurrentState");
        l(cVar);
    }
}
