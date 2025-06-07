package j2;

import j2.d;

/* loaded from: classes.dex */
public final class b implements d, c {

    /* renamed from: a, reason: collision with root package name */
    private final Object f24397a;

    /* renamed from: b, reason: collision with root package name */
    private final d f24398b;

    /* renamed from: c, reason: collision with root package name */
    private volatile c f24399c;

    /* renamed from: d, reason: collision with root package name */
    private volatile c f24400d;

    /* renamed from: e, reason: collision with root package name */
    private d.a f24401e;

    /* renamed from: f, reason: collision with root package name */
    private d.a f24402f;

    public b(Object obj, d dVar) {
        d.a aVar = d.a.CLEARED;
        this.f24401e = aVar;
        this.f24402f = aVar;
        this.f24397a = obj;
        this.f24398b = dVar;
    }

    private boolean l(c cVar) {
        return cVar.equals(this.f24399c) || (this.f24401e == d.a.FAILED && cVar.equals(this.f24400d));
    }

    private boolean m() {
        d dVar = this.f24398b;
        return dVar == null || dVar.k(this);
    }

    private boolean n() {
        d dVar = this.f24398b;
        return dVar == null || dVar.c(this);
    }

    private boolean o() {
        d dVar = this.f24398b;
        return dVar == null || dVar.f(this);
    }

    @Override // j2.d
    public void a(c cVar) {
        synchronized (this.f24397a) {
            if (cVar.equals(this.f24400d)) {
                this.f24402f = d.a.FAILED;
                d dVar = this.f24398b;
                if (dVar != null) {
                    dVar.a(this);
                }
                return;
            }
            this.f24401e = d.a.FAILED;
            d.a aVar = this.f24402f;
            d.a aVar2 = d.a.RUNNING;
            if (aVar != aVar2) {
                this.f24402f = aVar2;
                this.f24400d.h();
            }
        }
    }

    @Override // j2.d, j2.c
    public boolean b() {
        boolean z10;
        synchronized (this.f24397a) {
            z10 = this.f24399c.b() || this.f24400d.b();
        }
        return z10;
    }

    @Override // j2.d
    public boolean c(c cVar) {
        boolean z10;
        synchronized (this.f24397a) {
            z10 = n() && l(cVar);
        }
        return z10;
    }

    @Override // j2.c
    public void clear() {
        synchronized (this.f24397a) {
            d.a aVar = d.a.CLEARED;
            this.f24401e = aVar;
            this.f24399c.clear();
            if (this.f24402f != aVar) {
                this.f24402f = aVar;
                this.f24400d.clear();
            }
        }
    }

    @Override // j2.c
    public boolean d() {
        boolean z10;
        synchronized (this.f24397a) {
            d.a aVar = this.f24401e;
            d.a aVar2 = d.a.CLEARED;
            z10 = aVar == aVar2 && this.f24402f == aVar2;
        }
        return z10;
    }

    @Override // j2.d
    public d e() {
        d dVarE;
        synchronized (this.f24397a) {
            d dVar = this.f24398b;
            dVarE = dVar != null ? dVar.e() : this;
        }
        return dVarE;
    }

    @Override // j2.d
    public boolean f(c cVar) {
        boolean z10;
        synchronized (this.f24397a) {
            z10 = o() && l(cVar);
        }
        return z10;
    }

    @Override // j2.d
    public void g(c cVar) {
        synchronized (this.f24397a) {
            if (cVar.equals(this.f24399c)) {
                this.f24401e = d.a.SUCCESS;
            } else if (cVar.equals(this.f24400d)) {
                this.f24402f = d.a.SUCCESS;
            }
            d dVar = this.f24398b;
            if (dVar != null) {
                dVar.g(this);
            }
        }
    }

    @Override // j2.c
    public void h() {
        synchronized (this.f24397a) {
            d.a aVar = this.f24401e;
            d.a aVar2 = d.a.RUNNING;
            if (aVar != aVar2) {
                this.f24401e = aVar2;
                this.f24399c.h();
            }
        }
    }

    @Override // j2.c
    public boolean i(c cVar) {
        if (!(cVar instanceof b)) {
            return false;
        }
        b bVar = (b) cVar;
        return this.f24399c.i(bVar.f24399c) && this.f24400d.i(bVar.f24400d);
    }

    @Override // j2.c
    public boolean isRunning() {
        boolean z10;
        synchronized (this.f24397a) {
            d.a aVar = this.f24401e;
            d.a aVar2 = d.a.RUNNING;
            z10 = aVar == aVar2 || this.f24402f == aVar2;
        }
        return z10;
    }

    @Override // j2.c
    public boolean j() {
        boolean z10;
        synchronized (this.f24397a) {
            d.a aVar = this.f24401e;
            d.a aVar2 = d.a.SUCCESS;
            z10 = aVar == aVar2 || this.f24402f == aVar2;
        }
        return z10;
    }

    @Override // j2.d
    public boolean k(c cVar) {
        boolean z10;
        synchronized (this.f24397a) {
            z10 = m() && l(cVar);
        }
        return z10;
    }

    public void p(c cVar, c cVar2) {
        this.f24399c = cVar;
        this.f24400d = cVar2;
    }

    @Override // j2.c
    public void pause() {
        synchronized (this.f24397a) {
            d.a aVar = this.f24401e;
            d.a aVar2 = d.a.RUNNING;
            if (aVar == aVar2) {
                this.f24401e = d.a.PAUSED;
                this.f24399c.pause();
            }
            if (this.f24402f == aVar2) {
                this.f24402f = d.a.PAUSED;
                this.f24400d.pause();
            }
        }
    }
}
