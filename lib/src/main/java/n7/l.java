package n7;

/* loaded from: classes.dex */
public class l {

    /* renamed from: u, reason: collision with root package name */
    private static boolean f25552u = false;

    /* renamed from: v, reason: collision with root package name */
    private static l f25553v;

    /* renamed from: a, reason: collision with root package name */
    private z7.i f25554a;

    /* renamed from: b, reason: collision with root package name */
    private g8.f f25555b;

    /* renamed from: c, reason: collision with root package name */
    private final z7.d f25556c;

    /* renamed from: d, reason: collision with root package name */
    private final w9.f f25557d;

    /* renamed from: e, reason: collision with root package name */
    private final n9.o f25558e;

    /* renamed from: f, reason: collision with root package name */
    private final ka.d f25559f;

    /* renamed from: g, reason: collision with root package name */
    private final y7.e f25560g;

    /* renamed from: h, reason: collision with root package name */
    private final b8.n f25561h;

    /* renamed from: i, reason: collision with root package name */
    private final va.c f25562i;

    /* renamed from: j, reason: collision with root package name */
    private w9.c f25563j;

    /* renamed from: k, reason: collision with root package name */
    private h f25564k;

    /* renamed from: l, reason: collision with root package name */
    private ma.g f25565l;

    /* renamed from: m, reason: collision with root package name */
    private z7.c f25566m;

    /* renamed from: n, reason: collision with root package name */
    private com.pushwoosh.a f25567n;

    /* renamed from: o, reason: collision with root package name */
    private n9.e f25568o;

    /* renamed from: p, reason: collision with root package name */
    private ma.c f25569p;

    /* renamed from: q, reason: collision with root package name */
    private z8.a f25570q;

    /* renamed from: r, reason: collision with root package name */
    private u8.b f25571r;

    /* renamed from: s, reason: collision with root package name */
    private r7.g f25572s;

    /* renamed from: t, reason: collision with root package name */
    private ia.b f25573t;

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private z7.d f25574a;

        /* renamed from: b, reason: collision with root package name */
        private i9.a f25575b;

        public b a(i9.a aVar) {
            this.f25575b = aVar;
            return this;
        }

        public b b(z7.d dVar) {
            this.f25574a = dVar;
            return this;
        }

        public l c() {
            l unused = l.f25553v = new l(this);
            return l.f25553v;
        }
    }

    private l(b bVar) {
        this.f25554a = new z7.i();
        z7.d dVar = bVar.f25574a;
        this.f25556c = dVar;
        z8.a aVar = new z8.a();
        this.f25570q = aVar;
        this.f25571r = new u8.b(aVar);
        n9.e eVar = new n9.e();
        this.f25568o = eVar;
        ka.e.j(dVar, this.f25554a, eVar);
        ka.d dVarF = ka.e.f();
        this.f25559f = dVarF;
        va.c cVar = new va.c();
        this.f25562i = cVar;
        p9.b bVar2 = new p9.b();
        b9.b.b(dVarF, bVar2, cVar);
        w9.f fVar = new w9.f(bVar.f25575b, dVar);
        this.f25557d = fVar;
        y7.e eVar2 = new y7.e(new y7.g(), cVar);
        this.f25560g = eVar2;
        this.f25555b = new g8.f();
        e9.a aVarH = c9.a.h();
        xa.a aVarA = c9.a.a();
        z7.h hVarK = c9.a.k();
        this.f25566m = new z7.c(c9.a.h().a("PWAppVersion"));
        this.f25561h = new b8.n(aVarH, aVarA, hVarK, this.f25566m);
        n9.o oVar = new n9.o(b9.b.a(), new n9.r(), dVarF, ka.e.d(), ka.e.g(), bVar2, cVar);
        this.f25558e = oVar;
        this.f25564k = new h(oVar, fVar, eVar2);
        this.f25569p = new ma.c(0, new na.b());
        this.f25565l = new ma.g(new ea.e(), new ma.h(), y7.b.b(), this.f25569p);
        this.f25572s = new r7.g();
        this.f25573t = new ia.b(dVar.t(), fVar);
        this.f25567n = new com.pushwoosh.a(dVar, dVarF, this.f25566m, oVar, fVar, eVar2, this.f25568o, this.f25572s, this.f25573t, cVar);
    }

    public static l i() {
        return f25553v;
    }

    public static void o() {
        if (f25552u) {
            return;
        }
        k9.h.x("PushwooshPlatform", "Pushwoosh library not initialized. All method calls will be ignored");
        f25552u = true;
    }

    z7.c c() {
        return this.f25566m;
    }

    public b8.n d() {
        return this.f25561h;
    }

    public z7.d e() {
        return this.f25556c;
    }

    public h f() {
        return this.f25564k;
    }

    public g8.f g() {
        return this.f25555b;
    }

    public ia.b h() {
        return this.f25573t;
    }

    public ka.d j() {
        return this.f25559f;
    }

    public ma.g k() {
        return this.f25565l;
    }

    public ma.c l() {
        return this.f25569p;
    }

    public va.c m() {
        return this.f25562i;
    }

    public w9.c n() {
        if (this.f25563j == null) {
            try {
                Class clsO = this.f25556c.o();
                this.f25563j = clsO != null ? (w9.c) clsO.newInstance() : new w9.c();
            } catch (Exception e5) {
                k9.h.o(e5);
                this.f25563j = new w9.c();
            }
        }
        return this.f25563j;
    }

    public void p() {
        this.f25567n.z();
    }

    public w9.f q() {
        return this.f25557d;
    }

    public u8.b r() {
        return this.f25571r;
    }

    public y7.e s() {
        return this.f25560g;
    }

    public n9.o t() {
        return this.f25558e;
    }

    public void u() {
        this.f25567n.C();
    }
}
