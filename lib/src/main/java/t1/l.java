package t1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import o2.a;
import t1.h;
import t1.p;

/* loaded from: classes.dex */
class l implements h.b, a.f {
    private static final c L = new c();
    private boolean A;
    private boolean B;
    private v C;
    r1.a D;
    private boolean E;
    q F;
    private boolean G;
    p H;
    private h I;
    private volatile boolean J;
    private boolean K;

    /* renamed from: m, reason: collision with root package name */
    final e f27244m;

    /* renamed from: n, reason: collision with root package name */
    private final o2.c f27245n;

    /* renamed from: o, reason: collision with root package name */
    private final p.a f27246o;

    /* renamed from: p, reason: collision with root package name */
    private final androidx.core.util.e f27247p;

    /* renamed from: q, reason: collision with root package name */
    private final c f27248q;

    /* renamed from: r, reason: collision with root package name */
    private final m f27249r;

    /* renamed from: s, reason: collision with root package name */
    private final w1.a f27250s;

    /* renamed from: t, reason: collision with root package name */
    private final w1.a f27251t;

    /* renamed from: u, reason: collision with root package name */
    private final w1.a f27252u;

    /* renamed from: v, reason: collision with root package name */
    private final w1.a f27253v;

    /* renamed from: w, reason: collision with root package name */
    private final AtomicInteger f27254w;

    /* renamed from: x, reason: collision with root package name */
    private r1.f f27255x;

    /* renamed from: y, reason: collision with root package name */
    private boolean f27256y;

    /* renamed from: z, reason: collision with root package name */
    private boolean f27257z;

    private class a implements Runnable {

        /* renamed from: m, reason: collision with root package name */
        private final j2.g f27258m;

        a(j2.g gVar) {
            this.f27258m = gVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this.f27258m.e()) {
                synchronized (l.this) {
                    if (l.this.f27244m.f(this.f27258m)) {
                        l.this.e(this.f27258m);
                    }
                    l.this.h();
                }
            }
        }
    }

    private class b implements Runnable {

        /* renamed from: m, reason: collision with root package name */
        private final j2.g f27260m;

        b(j2.g gVar) {
            this.f27260m = gVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this.f27260m.e()) {
                synchronized (l.this) {
                    if (l.this.f27244m.f(this.f27260m)) {
                        l.this.H.d();
                        l.this.f(this.f27260m);
                        l.this.r(this.f27260m);
                    }
                    l.this.h();
                }
            }
        }
    }

    static class c {
        c() {
        }

        public p a(v vVar, boolean z10, r1.f fVar, p.a aVar) {
            return new p(vVar, z10, true, fVar, aVar);
        }
    }

    static final class d {

        /* renamed from: a, reason: collision with root package name */
        final j2.g f27262a;

        /* renamed from: b, reason: collision with root package name */
        final Executor f27263b;

        d(j2.g gVar, Executor executor) {
            this.f27262a = gVar;
            this.f27263b = executor;
        }

        public boolean equals(Object obj) {
            if (obj instanceof d) {
                return this.f27262a.equals(((d) obj).f27262a);
            }
            return false;
        }

        public int hashCode() {
            return this.f27262a.hashCode();
        }
    }

    static final class e implements Iterable {

        /* renamed from: m, reason: collision with root package name */
        private final List f27264m;

        e() {
            this(new ArrayList(2));
        }

        e(List list) {
            this.f27264m = list;
        }

        private static d i(j2.g gVar) {
            return new d(gVar, n2.e.a());
        }

        void clear() {
            this.f27264m.clear();
        }

        void e(j2.g gVar, Executor executor) {
            this.f27264m.add(new d(gVar, executor));
        }

        boolean f(j2.g gVar) {
            return this.f27264m.contains(i(gVar));
        }

        e h() {
            return new e(new ArrayList(this.f27264m));
        }

        boolean isEmpty() {
            return this.f27264m.isEmpty();
        }

        @Override // java.lang.Iterable
        public Iterator iterator() {
            return this.f27264m.iterator();
        }

        void k(j2.g gVar) {
            this.f27264m.remove(i(gVar));
        }

        int size() {
            return this.f27264m.size();
        }
    }

    l(w1.a aVar, w1.a aVar2, w1.a aVar3, w1.a aVar4, m mVar, p.a aVar5, androidx.core.util.e eVar) {
        this(aVar, aVar2, aVar3, aVar4, mVar, aVar5, eVar, L);
    }

    l(w1.a aVar, w1.a aVar2, w1.a aVar3, w1.a aVar4, m mVar, p.a aVar5, androidx.core.util.e eVar, c cVar) {
        this.f27244m = new e();
        this.f27245n = o2.c.a();
        this.f27254w = new AtomicInteger();
        this.f27250s = aVar;
        this.f27251t = aVar2;
        this.f27252u = aVar3;
        this.f27253v = aVar4;
        this.f27249r = mVar;
        this.f27246o = aVar5;
        this.f27247p = eVar;
        this.f27248q = cVar;
    }

    private w1.a j() {
        return this.f27257z ? this.f27252u : this.A ? this.f27253v : this.f27251t;
    }

    private boolean m() {
        return this.G || this.E || this.J;
    }

    private synchronized void q() {
        if (this.f27255x == null) {
            throw new IllegalArgumentException();
        }
        this.f27244m.clear();
        this.f27255x = null;
        this.H = null;
        this.C = null;
        this.G = false;
        this.J = false;
        this.E = false;
        this.K = false;
        this.I.C(false);
        this.I = null;
        this.F = null;
        this.D = null;
        this.f27247p.a(this);
    }

    @Override // t1.h.b
    public void a(v vVar, r1.a aVar, boolean z10) {
        synchronized (this) {
            this.C = vVar;
            this.D = aVar;
            this.K = z10;
        }
        o();
    }

    @Override // t1.h.b
    public void b(h hVar) {
        j().execute(hVar);
    }

    @Override // t1.h.b
    public void c(q qVar) {
        synchronized (this) {
            this.F = qVar;
        }
        n();
    }

    synchronized void d(j2.g gVar, Executor executor) {
        Runnable aVar;
        this.f27245n.c();
        this.f27244m.e(gVar, executor);
        boolean z10 = true;
        if (this.E) {
            k(1);
            aVar = new b(gVar);
        } else if (this.G) {
            k(1);
            aVar = new a(gVar);
        } else {
            if (this.J) {
                z10 = false;
            }
            n2.k.a(z10, "Cannot add callbacks to a cancelled EngineJob");
        }
        executor.execute(aVar);
    }

    void e(j2.g gVar) {
        try {
            gVar.c(this.F);
        } catch (Throwable th) {
            throw new t1.b(th);
        }
    }

    void f(j2.g gVar) {
        try {
            gVar.a(this.H, this.D, this.K);
        } catch (Throwable th) {
            throw new t1.b(th);
        }
    }

    void g() {
        if (m()) {
            return;
        }
        this.J = true;
        this.I.k();
        this.f27249r.d(this, this.f27255x);
    }

    void h() {
        p pVar;
        synchronized (this) {
            this.f27245n.c();
            n2.k.a(m(), "Not yet complete!");
            int iDecrementAndGet = this.f27254w.decrementAndGet();
            n2.k.a(iDecrementAndGet >= 0, "Can't decrement below 0");
            if (iDecrementAndGet == 0) {
                pVar = this.H;
                q();
            } else {
                pVar = null;
            }
        }
        if (pVar != null) {
            pVar.g();
        }
    }

    @Override // o2.a.f
    public o2.c i() {
        return this.f27245n;
    }

    synchronized void k(int i10) {
        p pVar;
        n2.k.a(m(), "Not yet complete!");
        if (this.f27254w.getAndAdd(i10) == 0 && (pVar = this.H) != null) {
            pVar.d();
        }
    }

    synchronized l l(r1.f fVar, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.f27255x = fVar;
        this.f27256y = z10;
        this.f27257z = z11;
        this.A = z12;
        this.B = z13;
        return this;
    }

    void n() {
        synchronized (this) {
            this.f27245n.c();
            if (this.J) {
                q();
                return;
            }
            if (this.f27244m.isEmpty()) {
                throw new IllegalStateException("Received an exception without any callbacks to notify");
            }
            if (this.G) {
                throw new IllegalStateException("Already failed once");
            }
            this.G = true;
            r1.f fVar = this.f27255x;
            e eVarH = this.f27244m.h();
            k(eVarH.size() + 1);
            this.f27249r.a(this, fVar, null);
            Iterator it = eVarH.iterator();
            while (it.hasNext()) {
                d dVar = (d) it.next();
                dVar.f27263b.execute(new a(dVar.f27262a));
            }
            h();
        }
    }

    void o() {
        synchronized (this) {
            this.f27245n.c();
            if (this.J) {
                this.C.c();
                q();
                return;
            }
            if (this.f27244m.isEmpty()) {
                throw new IllegalStateException("Received a resource without any callbacks to notify");
            }
            if (this.E) {
                throw new IllegalStateException("Already have resource");
            }
            this.H = this.f27248q.a(this.C, this.f27256y, this.f27255x, this.f27246o);
            this.E = true;
            e eVarH = this.f27244m.h();
            k(eVarH.size() + 1);
            this.f27249r.a(this, this.f27255x, this.H);
            Iterator it = eVarH.iterator();
            while (it.hasNext()) {
                d dVar = (d) it.next();
                dVar.f27263b.execute(new b(dVar.f27262a));
            }
            h();
        }
    }

    boolean p() {
        return this.B;
    }

    synchronized void r(j2.g gVar) {
        this.f27245n.c();
        this.f27244m.k(gVar);
        if (this.f27244m.isEmpty()) {
            g();
            if ((this.E || this.G) && this.f27254w.get() == 0) {
                q();
            }
        }
    }

    public synchronized void s(h hVar) {
        this.I = hVar;
        (hVar.I() ? this.f27250s : j()).execute(hVar);
    }
}
