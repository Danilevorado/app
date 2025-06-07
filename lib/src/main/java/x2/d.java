package x2;

import java.util.concurrent.Executor;
import y2.x;

/* loaded from: classes.dex */
public final class d implements t2.b {

    /* renamed from: a, reason: collision with root package name */
    private final gb.a f28236a;

    /* renamed from: b, reason: collision with root package name */
    private final gb.a f28237b;

    /* renamed from: c, reason: collision with root package name */
    private final gb.a f28238c;

    /* renamed from: d, reason: collision with root package name */
    private final gb.a f28239d;

    /* renamed from: e, reason: collision with root package name */
    private final gb.a f28240e;

    public d(gb.a aVar, gb.a aVar2, gb.a aVar3, gb.a aVar4, gb.a aVar5) {
        this.f28236a = aVar;
        this.f28237b = aVar2;
        this.f28238c = aVar3;
        this.f28239d = aVar4;
        this.f28240e = aVar5;
    }

    public static d a(gb.a aVar, gb.a aVar2, gb.a aVar3, gb.a aVar4, gb.a aVar5) {
        return new d(aVar, aVar2, aVar3, aVar4, aVar5);
    }

    public static c c(Executor executor, s2.e eVar, x xVar, z2.d dVar, a3.b bVar) {
        return new c(executor, eVar, xVar, dVar, bVar);
    }

    @Override // gb.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public c get() {
        return c((Executor) this.f28236a.get(), (s2.e) this.f28237b.get(), (x) this.f28238c.get(), (z2.d) this.f28239d.get(), (a3.b) this.f28240e.get());
    }
}
