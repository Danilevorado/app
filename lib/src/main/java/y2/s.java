package y2;

import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class s implements t2.b {

    /* renamed from: a, reason: collision with root package name */
    private final gb.a f28513a;

    /* renamed from: b, reason: collision with root package name */
    private final gb.a f28514b;

    /* renamed from: c, reason: collision with root package name */
    private final gb.a f28515c;

    /* renamed from: d, reason: collision with root package name */
    private final gb.a f28516d;

    /* renamed from: e, reason: collision with root package name */
    private final gb.a f28517e;

    /* renamed from: f, reason: collision with root package name */
    private final gb.a f28518f;

    /* renamed from: g, reason: collision with root package name */
    private final gb.a f28519g;

    /* renamed from: h, reason: collision with root package name */
    private final gb.a f28520h;

    /* renamed from: i, reason: collision with root package name */
    private final gb.a f28521i;

    public s(gb.a aVar, gb.a aVar2, gb.a aVar3, gb.a aVar4, gb.a aVar5, gb.a aVar6, gb.a aVar7, gb.a aVar8, gb.a aVar9) {
        this.f28513a = aVar;
        this.f28514b = aVar2;
        this.f28515c = aVar3;
        this.f28516d = aVar4;
        this.f28517e = aVar5;
        this.f28518f = aVar6;
        this.f28519g = aVar7;
        this.f28520h = aVar8;
        this.f28521i = aVar9;
    }

    public static s a(gb.a aVar, gb.a aVar2, gb.a aVar3, gb.a aVar4, gb.a aVar5, gb.a aVar6, gb.a aVar7, gb.a aVar8, gb.a aVar9) {
        return new s(aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9);
    }

    public static r c(Context context, s2.e eVar, z2.d dVar, x xVar, Executor executor, a3.b bVar, b3.a aVar, b3.a aVar2, z2.c cVar) {
        return new r(context, eVar, dVar, xVar, executor, bVar, aVar, aVar2, cVar);
    }

    @Override // gb.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public r get() {
        return c((Context) this.f28513a.get(), (s2.e) this.f28514b.get(), (z2.d) this.f28515c.get(), (x) this.f28516d.get(), (Executor) this.f28517e.get(), (a3.b) this.f28518f.get(), (b3.a) this.f28519g.get(), (b3.a) this.f28520h.get(), (z2.c) this.f28521i.get());
    }
}
