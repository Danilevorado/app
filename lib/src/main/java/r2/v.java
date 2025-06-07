package r2;

/* loaded from: classes.dex */
public final class v implements t2.b {

    /* renamed from: a, reason: collision with root package name */
    private final gb.a f26538a;

    /* renamed from: b, reason: collision with root package name */
    private final gb.a f26539b;

    /* renamed from: c, reason: collision with root package name */
    private final gb.a f26540c;

    /* renamed from: d, reason: collision with root package name */
    private final gb.a f26541d;

    /* renamed from: e, reason: collision with root package name */
    private final gb.a f26542e;

    public v(gb.a aVar, gb.a aVar2, gb.a aVar3, gb.a aVar4, gb.a aVar5) {
        this.f26538a = aVar;
        this.f26539b = aVar2;
        this.f26540c = aVar3;
        this.f26541d = aVar4;
        this.f26542e = aVar5;
    }

    public static v a(gb.a aVar, gb.a aVar2, gb.a aVar3, gb.a aVar4, gb.a aVar5) {
        return new v(aVar, aVar2, aVar3, aVar4, aVar5);
    }

    public static t c(b3.a aVar, b3.a aVar2, x2.e eVar, y2.r rVar, y2.v vVar) {
        return new t(aVar, aVar2, eVar, rVar, vVar);
    }

    @Override // gb.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public t get() {
        return c((b3.a) this.f26538a.get(), (b3.a) this.f26539b.get(), (x2.e) this.f26540c.get(), (y2.r) this.f26541d.get(), (y2.v) this.f26542e.get());
    }
}
