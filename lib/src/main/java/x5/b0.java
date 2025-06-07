package x5;

/* loaded from: classes.dex */
class b0 implements h6.b {

    /* renamed from: c, reason: collision with root package name */
    private static final h6.a f28278c = new h6.a() { // from class: x5.z
        @Override // h6.a
        public final void a(h6.b bVar) {
            b0.d(bVar);
        }
    };

    /* renamed from: d, reason: collision with root package name */
    private static final h6.b f28279d = new h6.b() { // from class: x5.a0
        @Override // h6.b
        public final Object get() {
            return b0.e();
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private h6.a f28280a;

    /* renamed from: b, reason: collision with root package name */
    private volatile h6.b f28281b;

    private b0(h6.a aVar, h6.b bVar) {
        this.f28280a = aVar;
        this.f28281b = bVar;
    }

    static b0 c() {
        return new b0(f28278c, f28279d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void d(h6.b bVar) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object e() {
        return null;
    }

    void f(h6.b bVar) {
        h6.a aVar;
        if (this.f28281b != f28279d) {
            throw new IllegalStateException("provide() can be called only once.");
        }
        synchronized (this) {
            aVar = this.f28280a;
            this.f28280a = null;
            this.f28281b = bVar;
        }
        aVar.a(bVar);
    }

    @Override // h6.b
    public Object get() {
        return this.f28281b.get();
    }
}
