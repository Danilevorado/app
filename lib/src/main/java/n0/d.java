package n0;

import n0.a;
import rb.h;

/* loaded from: classes.dex */
public final class d extends a {
    public d() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public d(a aVar) {
        h.e(aVar, "initialExtras");
        b().putAll(aVar.b());
    }

    public /* synthetic */ d(a aVar, int i10, rb.f fVar) {
        this((i10 & 1) != 0 ? a.C0164a.f25446b : aVar);
    }

    @Override // n0.a
    public Object a(a.b bVar) {
        h.e(bVar, "key");
        return b().get(bVar);
    }

    public final void c(a.b bVar, Object obj) {
        h.e(bVar, "key");
        b().put(bVar, obj);
    }
}
