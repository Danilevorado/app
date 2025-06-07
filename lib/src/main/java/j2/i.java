package j2;

import j2.d;

/* loaded from: classes.dex */
public class i implements d, c {

    /* renamed from: a, reason: collision with root package name */
    private final d f24443a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f24444b;

    /* renamed from: c, reason: collision with root package name */
    private volatile c f24445c;

    /* renamed from: d, reason: collision with root package name */
    private volatile c f24446d;

    /* renamed from: e, reason: collision with root package name */
    private d.a f24447e;

    /* renamed from: f, reason: collision with root package name */
    private d.a f24448f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f24449g;

    public i(Object obj, d dVar) {
        d.a aVar = d.a.CLEARED;
        this.f24447e = aVar;
        this.f24448f = aVar;
        this.f24444b = obj;
        this.f24443a = dVar;
    }

    private boolean l() {
        d dVar = this.f24443a;
        return dVar == null || dVar.k(this);
    }

    private boolean m() {
        d dVar = this.f24443a;
        return dVar == null || dVar.c(this);
    }

    private boolean n() {
        d dVar = this.f24443a;
        return dVar == null || dVar.f(this);
    }

    @Override // j2.d
    public void a(c cVar) {
        synchronized (this.f24444b) {
            if (!cVar.equals(this.f24445c)) {
                this.f24448f = d.a.FAILED;
                return;
            }
            this.f24447e = d.a.FAILED;
            d dVar = this.f24443a;
            if (dVar != null) {
                dVar.a(this);
            }
        }
    }

    @Override // j2.d, j2.c
    public boolean b() {
        boolean z10;
        synchronized (this.f24444b) {
            z10 = this.f24446d.b() || this.f24445c.b();
        }
        return z10;
    }

    @Override // j2.d
    public boolean c(c cVar) {
        boolean z10;
        synchronized (this.f24444b) {
            z10 = m() && cVar.equals(this.f24445c) && !b();
        }
        return z10;
    }

    @Override // j2.c
    public void clear() {
        synchronized (this.f24444b) {
            this.f24449g = false;
            d.a aVar = d.a.CLEARED;
            this.f24447e = aVar;
            this.f24448f = aVar;
            this.f24446d.clear();
            this.f24445c.clear();
        }
    }

    @Override // j2.c
    public boolean d() {
        boolean z10;
        synchronized (this.f24444b) {
            z10 = this.f24447e == d.a.CLEARED;
        }
        return z10;
    }

    @Override // j2.d
    public d e() {
        d dVarE;
        synchronized (this.f24444b) {
            d dVar = this.f24443a;
            dVarE = dVar != null ? dVar.e() : this;
        }
        return dVarE;
    }

    @Override // j2.d
    public boolean f(c cVar) {
        boolean z10;
        synchronized (this.f24444b) {
            z10 = n() && (cVar.equals(this.f24445c) || this.f24447e != d.a.SUCCESS);
        }
        return z10;
    }

    @Override // j2.d
    public void g(c cVar) {
        synchronized (this.f24444b) {
            if (cVar.equals(this.f24446d)) {
                this.f24448f = d.a.SUCCESS;
                return;
            }
            this.f24447e = d.a.SUCCESS;
            d dVar = this.f24443a;
            if (dVar != null) {
                dVar.g(this);
            }
            if (!this.f24448f.b()) {
                this.f24446d.clear();
            }
        }
    }

    @Override // j2.c
    public void h() {
        synchronized (this.f24444b) {
            this.f24449g = true;
            try {
                if (this.f24447e != d.a.SUCCESS) {
                    d.a aVar = this.f24448f;
                    d.a aVar2 = d.a.RUNNING;
                    if (aVar != aVar2) {
                        this.f24448f = aVar2;
                        this.f24446d.h();
                    }
                }
                if (this.f24449g) {
                    d.a aVar3 = this.f24447e;
                    d.a aVar4 = d.a.RUNNING;
                    if (aVar3 != aVar4) {
                        this.f24447e = aVar4;
                        this.f24445c.h();
                    }
                }
            } finally {
                this.f24449g = false;
            }
        }
    }

    @Override // j2.c
    public boolean i(c cVar) {
        if (!(cVar instanceof i)) {
            return false;
        }
        i iVar = (i) cVar;
        if (this.f24445c == null) {
            if (iVar.f24445c != null) {
                return false;
            }
        } else if (!this.f24445c.i(iVar.f24445c)) {
            return false;
        }
        if (this.f24446d == null) {
            if (iVar.f24446d != null) {
                return false;
            }
        } else if (!this.f24446d.i(iVar.f24446d)) {
            return false;
        }
        return true;
    }

    @Override // j2.c
    public boolean isRunning() {
        boolean z10;
        synchronized (this.f24444b) {
            z10 = this.f24447e == d.a.RUNNING;
        }
        return z10;
    }

    @Override // j2.c
    public boolean j() {
        boolean z10;
        synchronized (this.f24444b) {
            z10 = this.f24447e == d.a.SUCCESS;
        }
        return z10;
    }

    @Override // j2.d
    public boolean k(c cVar) {
        boolean z10;
        synchronized (this.f24444b) {
            z10 = l() && cVar.equals(this.f24445c) && this.f24447e != d.a.PAUSED;
        }
        return z10;
    }

    public void o(c cVar, c cVar2) {
        this.f24445c = cVar;
        this.f24446d = cVar2;
    }

    @Override // j2.c
    public void pause() {
        synchronized (this.f24444b) {
            if (!this.f24448f.b()) {
                this.f24448f = d.a.PAUSED;
                this.f24446d.pause();
            }
            if (!this.f24447e.b()) {
                this.f24447e = d.a.PAUSED;
                this.f24445c.pause();
            }
        }
    }
}
