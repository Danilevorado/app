package r2;

/* loaded from: classes.dex */
final class r implements p2.f {

    /* renamed from: a, reason: collision with root package name */
    private final o f26528a;

    /* renamed from: b, reason: collision with root package name */
    private final String f26529b;

    /* renamed from: c, reason: collision with root package name */
    private final p2.b f26530c;

    /* renamed from: d, reason: collision with root package name */
    private final p2.e f26531d;

    /* renamed from: e, reason: collision with root package name */
    private final s f26532e;

    r(o oVar, String str, p2.b bVar, p2.e eVar, s sVar) {
        this.f26528a = oVar;
        this.f26529b = str;
        this.f26530c = bVar;
        this.f26531d = eVar;
        this.f26532e = sVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void c(Exception exc) {
    }

    @Override // p2.f
    public void a(p2.c cVar) {
        d(cVar, new p2.h() { // from class: r2.q
            @Override // p2.h
            public final void a(Exception exc) {
                r.c(exc);
            }
        });
    }

    public void d(p2.c cVar, p2.h hVar) {
        this.f26532e.a(n.a().e(this.f26528a).c(cVar).f(this.f26529b).d(this.f26531d).b(this.f26530c).a(), hVar);
    }
}
