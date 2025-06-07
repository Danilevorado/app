package com.google.firebase.messaging;

/* loaded from: classes.dex */
public final class a implements b6.a {

    /* renamed from: a, reason: collision with root package name */
    public static final b6.a f21413a = new a();

    /* renamed from: com.google.firebase.messaging.a$a, reason: collision with other inner class name */
    private static final class C0107a implements a6.d {

        /* renamed from: a, reason: collision with root package name */
        static final C0107a f21414a = new C0107a();

        /* renamed from: b, reason: collision with root package name */
        private static final a6.c f21415b = a6.c.a("projectNumber").b(d6.a.b().c(1).a()).a();

        /* renamed from: c, reason: collision with root package name */
        private static final a6.c f21416c = a6.c.a("messageId").b(d6.a.b().c(2).a()).a();

        /* renamed from: d, reason: collision with root package name */
        private static final a6.c f21417d = a6.c.a("instanceId").b(d6.a.b().c(3).a()).a();

        /* renamed from: e, reason: collision with root package name */
        private static final a6.c f21418e = a6.c.a("messageType").b(d6.a.b().c(4).a()).a();

        /* renamed from: f, reason: collision with root package name */
        private static final a6.c f21419f = a6.c.a("sdkPlatform").b(d6.a.b().c(5).a()).a();

        /* renamed from: g, reason: collision with root package name */
        private static final a6.c f21420g = a6.c.a("packageName").b(d6.a.b().c(6).a()).a();

        /* renamed from: h, reason: collision with root package name */
        private static final a6.c f21421h = a6.c.a("collapseKey").b(d6.a.b().c(7).a()).a();

        /* renamed from: i, reason: collision with root package name */
        private static final a6.c f21422i = a6.c.a("priority").b(d6.a.b().c(8).a()).a();

        /* renamed from: j, reason: collision with root package name */
        private static final a6.c f21423j = a6.c.a("ttl").b(d6.a.b().c(9).a()).a();

        /* renamed from: k, reason: collision with root package name */
        private static final a6.c f21424k = a6.c.a("topic").b(d6.a.b().c(10).a()).a();

        /* renamed from: l, reason: collision with root package name */
        private static final a6.c f21425l = a6.c.a("bulkId").b(d6.a.b().c(11).a()).a();

        /* renamed from: m, reason: collision with root package name */
        private static final a6.c f21426m = a6.c.a("event").b(d6.a.b().c(12).a()).a();

        /* renamed from: n, reason: collision with root package name */
        private static final a6.c f21427n = a6.c.a("analyticsLabel").b(d6.a.b().c(13).a()).a();

        /* renamed from: o, reason: collision with root package name */
        private static final a6.c f21428o = a6.c.a("campaignId").b(d6.a.b().c(14).a()).a();

        /* renamed from: p, reason: collision with root package name */
        private static final a6.c f21429p = a6.c.a("composerLabel").b(d6.a.b().c(15).a()).a();

        private C0107a() {
        }

        @Override // a6.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(o6.a aVar, a6.e eVar) {
            eVar.e(f21415b, aVar.l());
            eVar.a(f21416c, aVar.h());
            eVar.a(f21417d, aVar.g());
            eVar.a(f21418e, aVar.i());
            eVar.a(f21419f, aVar.m());
            eVar.a(f21420g, aVar.j());
            eVar.a(f21421h, aVar.d());
            eVar.d(f21422i, aVar.k());
            eVar.d(f21423j, aVar.o());
            eVar.a(f21424k, aVar.n());
            eVar.e(f21425l, aVar.b());
            eVar.a(f21426m, aVar.f());
            eVar.a(f21427n, aVar.a());
            eVar.e(f21428o, aVar.c());
            eVar.a(f21429p, aVar.e());
        }
    }

    private static final class b implements a6.d {

        /* renamed from: a, reason: collision with root package name */
        static final b f21430a = new b();

        /* renamed from: b, reason: collision with root package name */
        private static final a6.c f21431b = a6.c.a("messagingClientEvent").b(d6.a.b().c(1).a()).a();

        private b() {
        }

        @Override // a6.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(o6.b bVar, a6.e eVar) {
            eVar.a(f21431b, bVar.a());
        }
    }

    private static final class c implements a6.d {

        /* renamed from: a, reason: collision with root package name */
        static final c f21432a = new c();

        /* renamed from: b, reason: collision with root package name */
        private static final a6.c f21433b = a6.c.d("messagingClientEventExtension");

        private c() {
        }

        @Override // a6.d
        public /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
            a5.a.a(obj);
            b(null, (a6.e) obj2);
        }

        public void b(j0 j0Var, a6.e eVar) {
            throw null;
        }
    }

    private a() {
    }

    @Override // b6.a
    public void a(b6.b bVar) {
        bVar.a(j0.class, c.f21432a);
        bVar.a(o6.b.class, b.f21430a);
        bVar.a(o6.a.class, C0107a.f21414a);
    }
}
