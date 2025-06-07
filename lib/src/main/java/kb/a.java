package kb;

import kb.e;
import qb.p;
import rb.h;

/* loaded from: classes2.dex */
public abstract class a implements e.b {
    private final e.c key;

    public a(e.c cVar) {
        h.e(cVar, "key");
        this.key = cVar;
    }

    @Override // kb.e
    public <R> R fold(R r10, p pVar) {
        return (R) e.b.a.a(this, r10, pVar);
    }

    @Override // kb.e.b, kb.e
    public <E extends e.b> E get(e.c cVar) {
        return (E) e.b.a.b(this, cVar);
    }

    @Override // kb.e.b
    public e.c getKey() {
        return this.key;
    }

    @Override // kb.e
    public e minusKey(e.c cVar) {
        return e.b.a.c(this, cVar);
    }

    public e plus(e eVar) {
        return e.b.a.d(this, eVar);
    }
}
