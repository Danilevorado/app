package kb;

import kb.e;
import qb.l;
import rb.h;

/* loaded from: classes2.dex */
public abstract class b implements e.c {

    /* renamed from: a, reason: collision with root package name */
    private final l f24950a;

    /* renamed from: b, reason: collision with root package name */
    private final e.c f24951b;

    public b(e.c cVar, l lVar) {
        h.e(cVar, "baseKey");
        h.e(lVar, "safeCast");
        this.f24950a = lVar;
        this.f24951b = cVar instanceof b ? ((b) cVar).f24951b : cVar;
    }

    public final boolean a(e.c cVar) {
        h.e(cVar, "key");
        return cVar == this || this.f24951b == cVar;
    }

    public final e.b b(e.b bVar) {
        h.e(bVar, "element");
        return (e.b) this.f24950a.c(bVar);
    }
}
