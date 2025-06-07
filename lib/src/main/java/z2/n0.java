package z2;

/* loaded from: classes.dex */
public final class n0 implements t2.b {

    /* renamed from: a, reason: collision with root package name */
    private final gb.a f28814a;

    /* renamed from: b, reason: collision with root package name */
    private final gb.a f28815b;

    /* renamed from: c, reason: collision with root package name */
    private final gb.a f28816c;

    /* renamed from: d, reason: collision with root package name */
    private final gb.a f28817d;

    /* renamed from: e, reason: collision with root package name */
    private final gb.a f28818e;

    public n0(gb.a aVar, gb.a aVar2, gb.a aVar3, gb.a aVar4, gb.a aVar5) {
        this.f28814a = aVar;
        this.f28815b = aVar2;
        this.f28816c = aVar3;
        this.f28817d = aVar4;
        this.f28818e = aVar5;
    }

    public static n0 a(gb.a aVar, gb.a aVar2, gb.a aVar3, gb.a aVar4, gb.a aVar5) {
        return new n0(aVar, aVar2, aVar3, aVar4, aVar5);
    }

    public static m0 c(b3.a aVar, b3.a aVar2, Object obj, Object obj2, gb.a aVar3) {
        return new m0(aVar, aVar2, (e) obj, (t0) obj2, aVar3);
    }

    @Override // gb.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public m0 get() {
        return c((b3.a) this.f28814a.get(), (b3.a) this.f28815b.get(), this.f28816c.get(), this.f28817d.get(), this.f28818e);
    }
}
