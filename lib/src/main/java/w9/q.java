package w9;

/* loaded from: classes2.dex */
final class q {

    /* renamed from: d, reason: collision with root package name */
    private static q f28088d;

    /* renamed from: a, reason: collision with root package name */
    private final o8.a f28089a;

    /* renamed from: b, reason: collision with root package name */
    private a9.o f28090b;

    /* renamed from: c, reason: collision with root package name */
    private a9.o f28091c;

    private q(o8.a aVar) {
        this.f28089a = aVar;
    }

    private void c() {
        this.f28090b = a9.i.f(y9.b.class, new a9.j() { // from class: w9.p
            @Override // a9.j
            public final void a(a9.g gVar) {
                this.f28087a.f((y9.b) gVar);
            }
        });
        this.f28091c = a9.i.f(y9.a.class, new a9.j() { // from class: w9.o
            @Override // a9.j
            public final void a(a9.g gVar) {
                this.f28086a.e((y9.a) gVar);
            }
        });
    }

    public static void d(o8.a aVar) {
        if (aVar == null || f28088d != null) {
            return;
        }
        q qVar = new q(aVar);
        f28088d = qVar;
        qVar.c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e(y9.a aVar) {
        g();
        this.f28089a.a(o8.b.c(new e8.f((String) aVar.a())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f(y9.b bVar) {
        g();
        this.f28089a.a(o8.b.b((String) bVar.a()));
    }

    private void g() {
        a9.o oVar = this.f28090b;
        if (oVar != null) {
            oVar.a();
        }
        a9.o oVar2 = this.f28091c;
        if (oVar2 != null) {
            oVar2.a();
        }
        f28088d = null;
    }
}
