package y2;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class w implements t2.b {

    /* renamed from: a, reason: collision with root package name */
    private final gb.a f28528a;

    /* renamed from: b, reason: collision with root package name */
    private final gb.a f28529b;

    /* renamed from: c, reason: collision with root package name */
    private final gb.a f28530c;

    /* renamed from: d, reason: collision with root package name */
    private final gb.a f28531d;

    public w(gb.a aVar, gb.a aVar2, gb.a aVar3, gb.a aVar4) {
        this.f28528a = aVar;
        this.f28529b = aVar2;
        this.f28530c = aVar3;
        this.f28531d = aVar4;
    }

    public static w a(gb.a aVar, gb.a aVar2, gb.a aVar3, gb.a aVar4) {
        return new w(aVar, aVar2, aVar3, aVar4);
    }

    public static v c(Executor executor, z2.d dVar, x xVar, a3.b bVar) {
        return new v(executor, dVar, xVar, bVar);
    }

    @Override // gb.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public v get() {
        return c((Executor) this.f28528a.get(), (z2.d) this.f28529b.get(), (x) this.f28530c.get(), (a3.b) this.f28531d.get());
    }
}
