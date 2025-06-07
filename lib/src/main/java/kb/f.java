package kb;

import java.io.Serializable;
import kb.e;
import qb.p;
import rb.h;

/* loaded from: classes2.dex */
public final class f implements e, Serializable {

    /* renamed from: m, reason: collision with root package name */
    public static final f f24958m = new f();

    private f() {
    }

    @Override // kb.e
    public Object fold(Object obj, p pVar) {
        h.e(pVar, "operation");
        return obj;
    }

    @Override // kb.e
    public e.b get(e.c cVar) {
        h.e(cVar, "key");
        return null;
    }

    public int hashCode() {
        return 0;
    }

    @Override // kb.e
    public e minusKey(e.c cVar) {
        h.e(cVar, "key");
        return this;
    }

    public String toString() {
        return "EmptyCoroutineContext";
    }
}
