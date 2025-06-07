package androidx.lifecycle;

import androidx.lifecycle.j;
import java.util.Map;
import k.b;

/* loaded from: classes.dex */
public abstract class LiveData {

    /* renamed from: k, reason: collision with root package name */
    static final Object f3066k = new Object();

    /* renamed from: a, reason: collision with root package name */
    final Object f3067a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private k.b f3068b = new k.b();

    /* renamed from: c, reason: collision with root package name */
    int f3069c = 0;

    /* renamed from: d, reason: collision with root package name */
    private boolean f3070d;

    /* renamed from: e, reason: collision with root package name */
    private volatile Object f3071e;

    /* renamed from: f, reason: collision with root package name */
    volatile Object f3072f;

    /* renamed from: g, reason: collision with root package name */
    private int f3073g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f3074h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f3075i;

    /* renamed from: j, reason: collision with root package name */
    private final Runnable f3076j;

    class LifecycleBoundObserver extends androidx.lifecycle.LiveData.c implements l {

        /* renamed from: e, reason: collision with root package name */
        final n f3077e;

        LifecycleBoundObserver(n nVar, t tVar) {
            super(tVar);
            this.f3077e = nVar;
        }

        @Override // androidx.lifecycle.l
        public void d(n nVar, j.b bVar) {
            j.c cVarB = this.f3077e.s().b();
            if (cVarB == j.c.DESTROYED) {
                LiveData.this.j(this.f3081a);
                return;
            }
            j.c cVar = null;
            while (cVar != cVarB) {
                h(k());
                cVar = cVarB;
                cVarB = this.f3077e.s().b();
            }
        }

        void i() {
            this.f3077e.s().c(this);
        }

        boolean j(n nVar) {
            return this.f3077e == nVar;
        }

        boolean k() {
            return this.f3077e.s().b().b(j.c.STARTED);
        }
    }

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Object obj;
            synchronized (LiveData.this.f3067a) {
                obj = LiveData.this.f3072f;
                LiveData.this.f3072f = LiveData.f3066k;
            }
            LiveData.this.k(obj);
        }
    }

    private class b extends c {
        b(t tVar) {
            super(tVar);
        }

        @Override // androidx.lifecycle.LiveData.c
        boolean k() {
            return true;
        }
    }

    private abstract class c {

        /* renamed from: a, reason: collision with root package name */
        final t f3081a;

        /* renamed from: b, reason: collision with root package name */
        boolean f3082b;

        /* renamed from: c, reason: collision with root package name */
        int f3083c = -1;

        c(t tVar) {
            this.f3081a = tVar;
        }

        void h(boolean z10) {
            if (z10 == this.f3082b) {
                return;
            }
            this.f3082b = z10;
            LiveData.this.b(z10 ? 1 : -1);
            if (this.f3082b) {
                LiveData.this.d(this);
            }
        }

        void i() {
        }

        boolean j(n nVar) {
            return false;
        }

        abstract boolean k();
    }

    public LiveData() {
        Object obj = f3066k;
        this.f3072f = obj;
        this.f3076j = new a();
        this.f3071e = obj;
        this.f3073g = -1;
    }

    static void a(String str) {
        if (j.a.e().b()) {
            return;
        }
        throw new IllegalStateException("Cannot invoke " + str + " on a background thread");
    }

    private void c(c cVar) {
        if (cVar.f3082b) {
            if (!cVar.k()) {
                cVar.h(false);
                return;
            }
            int i10 = cVar.f3083c;
            int i11 = this.f3073g;
            if (i10 >= i11) {
                return;
            }
            cVar.f3083c = i11;
            cVar.f3081a.a(this.f3071e);
        }
    }

    void b(int i10) {
        int i11 = this.f3069c;
        this.f3069c = i10 + i11;
        if (this.f3070d) {
            return;
        }
        this.f3070d = true;
        while (true) {
            try {
                int i12 = this.f3069c;
                if (i11 == i12) {
                    return;
                }
                boolean z10 = i11 == 0 && i12 > 0;
                boolean z11 = i11 > 0 && i12 == 0;
                if (z10) {
                    g();
                } else if (z11) {
                    h();
                }
                i11 = i12;
            } finally {
                this.f3070d = false;
            }
        }
    }

    void d(c cVar) {
        if (this.f3074h) {
            this.f3075i = true;
            return;
        }
        this.f3074h = true;
        do {
            this.f3075i = false;
            if (cVar != null) {
                c(cVar);
                cVar = null;
            } else {
                b.d dVarH = this.f3068b.h();
                while (dVarH.hasNext()) {
                    c((c) ((Map.Entry) dVarH.next()).getValue());
                    if (this.f3075i) {
                        break;
                    }
                }
            }
        } while (this.f3075i);
        this.f3074h = false;
    }

    public void e(n nVar, t tVar) {
        a("observe");
        if (nVar.s().b() == j.c.DESTROYED) {
            return;
        }
        LifecycleBoundObserver lifecycleBoundObserver = new LifecycleBoundObserver(nVar, tVar);
        c cVar = (c) this.f3068b.l(tVar, lifecycleBoundObserver);
        if (cVar != null && !cVar.j(nVar)) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (cVar != null) {
            return;
        }
        nVar.s().a(lifecycleBoundObserver);
    }

    public void f(t tVar) {
        a("observeForever");
        b bVar = new b(tVar);
        c cVar = (c) this.f3068b.l(tVar, bVar);
        if (cVar instanceof LifecycleBoundObserver) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (cVar != null) {
            return;
        }
        bVar.h(true);
    }

    protected void g() {
    }

    protected void h() {
    }

    protected void i(Object obj) {
        boolean z10;
        synchronized (this.f3067a) {
            z10 = this.f3072f == f3066k;
            this.f3072f = obj;
        }
        if (z10) {
            j.a.e().c(this.f3076j);
        }
    }

    public void j(t tVar) {
        a("removeObserver");
        c cVar = (c) this.f3068b.n(tVar);
        if (cVar == null) {
            return;
        }
        cVar.i();
        cVar.h(false);
    }

    protected void k(Object obj) {
        a("setValue");
        this.f3073g++;
        this.f3071e = obj;
        d(null);
    }
}
