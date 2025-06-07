package r2;

/* loaded from: classes.dex */
public final class a implements b6.a {

    /* renamed from: a, reason: collision with root package name */
    public static final b6.a f26454a = new a();

    /* renamed from: r2.a$a, reason: collision with other inner class name */
    private static final class C0181a implements a6.d {

        /* renamed from: a, reason: collision with root package name */
        static final C0181a f26455a = new C0181a();

        /* renamed from: b, reason: collision with root package name */
        private static final a6.c f26456b = a6.c.a("window").b(d6.a.b().c(1).a()).a();

        /* renamed from: c, reason: collision with root package name */
        private static final a6.c f26457c = a6.c.a("logSourceMetrics").b(d6.a.b().c(2).a()).a();

        /* renamed from: d, reason: collision with root package name */
        private static final a6.c f26458d = a6.c.a("globalMetrics").b(d6.a.b().c(3).a()).a();

        /* renamed from: e, reason: collision with root package name */
        private static final a6.c f26459e = a6.c.a("appNamespace").b(d6.a.b().c(4).a()).a();

        private C0181a() {
        }

        @Override // a6.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(u2.a aVar, a6.e eVar) {
            eVar.a(f26456b, aVar.d());
            eVar.a(f26457c, aVar.c());
            eVar.a(f26458d, aVar.b());
            eVar.a(f26459e, aVar.a());
        }
    }

    private static final class b implements a6.d {

        /* renamed from: a, reason: collision with root package name */
        static final b f26460a = new b();

        /* renamed from: b, reason: collision with root package name */
        private static final a6.c f26461b = a6.c.a("storageMetrics").b(d6.a.b().c(1).a()).a();

        private b() {
        }

        @Override // a6.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(u2.b bVar, a6.e eVar) {
            eVar.a(f26461b, bVar.a());
        }
    }

    private static final class c implements a6.d {

        /* renamed from: a, reason: collision with root package name */
        static final c f26462a = new c();

        /* renamed from: b, reason: collision with root package name */
        private static final a6.c f26463b = a6.c.a("eventsDroppedCount").b(d6.a.b().c(1).a()).a();

        /* renamed from: c, reason: collision with root package name */
        private static final a6.c f26464c = a6.c.a("reason").b(d6.a.b().c(3).a()).a();

        private c() {
        }

        @Override // a6.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(u2.c cVar, a6.e eVar) {
            eVar.e(f26463b, cVar.a());
            eVar.a(f26464c, cVar.b());
        }
    }

    private static final class d implements a6.d {

        /* renamed from: a, reason: collision with root package name */
        static final d f26465a = new d();

        /* renamed from: b, reason: collision with root package name */
        private static final a6.c f26466b = a6.c.a("logSource").b(d6.a.b().c(1).a()).a();

        /* renamed from: c, reason: collision with root package name */
        private static final a6.c f26467c = a6.c.a("logEventDropped").b(d6.a.b().c(2).a()).a();

        private d() {
        }

        @Override // a6.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(u2.d dVar, a6.e eVar) {
            eVar.a(f26466b, dVar.b());
            eVar.a(f26467c, dVar.a());
        }
    }

    private static final class e implements a6.d {

        /* renamed from: a, reason: collision with root package name */
        static final e f26468a = new e();

        /* renamed from: b, reason: collision with root package name */
        private static final a6.c f26469b = a6.c.d("clientMetrics");

        private e() {
        }

        @Override // a6.d
        public /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
            a5.a.a(obj);
            b(null, (a6.e) obj2);
        }

        public void b(l lVar, a6.e eVar) {
            throw null;
        }
    }

    private static final class f implements a6.d {

        /* renamed from: a, reason: collision with root package name */
        static final f f26470a = new f();

        /* renamed from: b, reason: collision with root package name */
        private static final a6.c f26471b = a6.c.a("currentCacheSizeBytes").b(d6.a.b().c(1).a()).a();

        /* renamed from: c, reason: collision with root package name */
        private static final a6.c f26472c = a6.c.a("maxCacheSizeBytes").b(d6.a.b().c(2).a()).a();

        private f() {
        }

        @Override // a6.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(u2.e eVar, a6.e eVar2) {
            eVar2.e(f26471b, eVar.a());
            eVar2.e(f26472c, eVar.b());
        }
    }

    private static final class g implements a6.d {

        /* renamed from: a, reason: collision with root package name */
        static final g f26473a = new g();

        /* renamed from: b, reason: collision with root package name */
        private static final a6.c f26474b = a6.c.a("startMs").b(d6.a.b().c(1).a()).a();

        /* renamed from: c, reason: collision with root package name */
        private static final a6.c f26475c = a6.c.a("endMs").b(d6.a.b().c(2).a()).a();

        private g() {
        }

        @Override // a6.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(u2.f fVar, a6.e eVar) {
            eVar.e(f26474b, fVar.b());
            eVar.e(f26475c, fVar.a());
        }
    }

    private a() {
    }

    @Override // b6.a
    public void a(b6.b bVar) {
        bVar.a(l.class, e.f26468a);
        bVar.a(u2.a.class, C0181a.f26455a);
        bVar.a(u2.f.class, g.f26473a);
        bVar.a(u2.d.class, d.f26465a);
        bVar.a(u2.c.class, c.f26462a);
        bVar.a(u2.b.class, b.f26460a);
        bVar.a(u2.e.class, f.f26470a);
    }
}
