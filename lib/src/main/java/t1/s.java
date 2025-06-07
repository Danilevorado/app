package t1;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
final class s {

    /* renamed from: a, reason: collision with root package name */
    private final Map f27290a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private final Map f27291b = new HashMap();

    s() {
    }

    private Map b(boolean z10) {
        return z10 ? this.f27291b : this.f27290a;
    }

    l a(r1.f fVar, boolean z10) {
        return (l) b(z10).get(fVar);
    }

    void c(r1.f fVar, l lVar) {
        b(lVar.p()).put(fVar, lVar);
    }

    void d(r1.f fVar, l lVar) {
        Map mapB = b(lVar.p());
        if (lVar.equals(mapB.get(fVar))) {
            mapB.remove(fVar);
        }
    }
}
