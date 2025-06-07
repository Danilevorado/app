package t1;

/* loaded from: classes.dex */
class p implements v {

    /* renamed from: m, reason: collision with root package name */
    private final boolean f27274m;

    /* renamed from: n, reason: collision with root package name */
    private final boolean f27275n;

    /* renamed from: o, reason: collision with root package name */
    private final v f27276o;

    /* renamed from: p, reason: collision with root package name */
    private final a f27277p;

    /* renamed from: q, reason: collision with root package name */
    private final r1.f f27278q;

    /* renamed from: r, reason: collision with root package name */
    private int f27279r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f27280s;

    interface a {
        void b(r1.f fVar, p pVar);
    }

    p(v vVar, boolean z10, boolean z11, r1.f fVar, a aVar) {
        this.f27276o = (v) n2.k.d(vVar);
        this.f27274m = z10;
        this.f27275n = z11;
        this.f27278q = fVar;
        this.f27277p = (a) n2.k.d(aVar);
    }

    @Override // t1.v
    public int a() {
        return this.f27276o.a();
    }

    @Override // t1.v
    public Class b() {
        return this.f27276o.b();
    }

    @Override // t1.v
    public synchronized void c() {
        if (this.f27279r > 0) {
            throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
        }
        if (this.f27280s) {
            throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
        }
        this.f27280s = true;
        if (this.f27275n) {
            this.f27276o.c();
        }
    }

    synchronized void d() {
        if (this.f27280s) {
            throw new IllegalStateException("Cannot acquire a recycled resource");
        }
        this.f27279r++;
    }

    v e() {
        return this.f27276o;
    }

    boolean f() {
        return this.f27274m;
    }

    void g() {
        boolean z10;
        synchronized (this) {
            int i10 = this.f27279r;
            if (i10 <= 0) {
                throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
            }
            z10 = true;
            int i11 = i10 - 1;
            this.f27279r = i11;
            if (i11 != 0) {
                z10 = false;
            }
        }
        if (z10) {
            this.f27277p.b(this.f27278q, this);
        }
    }

    @Override // t1.v
    public Object get() {
        return this.f27276o.get();
    }

    public synchronized String toString() {
        return "EngineResource{isMemoryCacheable=" + this.f27274m + ", listener=" + this.f27277p + ", key=" + this.f27278q + ", acquired=" + this.f27279r + ", isRecycled=" + this.f27280s + ", resource=" + this.f27276o + '}';
    }
}
