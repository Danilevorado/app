package kb;

import kb.e;
import rb.h;

/* loaded from: classes2.dex */
public interface d extends e.b {

    /* renamed from: j, reason: collision with root package name */
    public static final b f24955j = b.f24956a;

    public static final class a {
        public static e.b a(d dVar, e.c cVar) {
            h.e(cVar, "key");
            if (!(cVar instanceof kb.b)) {
                if (d.f24955j != cVar) {
                    return null;
                }
                h.c(dVar, "null cannot be cast to non-null type E of kotlin.coroutines.ContinuationInterceptor.get");
                return dVar;
            }
            kb.b bVar = (kb.b) cVar;
            if (!bVar.a(dVar.getKey())) {
                return null;
            }
            e.b bVarB = bVar.b(dVar);
            if (bVarB instanceof e.b) {
                return bVarB;
            }
            return null;
        }

        public static e b(d dVar, e.c cVar) {
            h.e(cVar, "key");
            if (!(cVar instanceof kb.b)) {
                return d.f24955j == cVar ? f.f24958m : dVar;
            }
            kb.b bVar = (kb.b) cVar;
            return (!bVar.a(dVar.getKey()) || bVar.b(dVar) == null) ? dVar : f.f24958m;
        }
    }

    public static final class b implements e.c {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ b f24956a = new b();

        private b() {
        }
    }
}
