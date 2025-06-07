package kb;

import kb.d;
import qb.p;
import rb.h;
import rb.i;

/* loaded from: classes2.dex */
public interface e {

    public static final class a {

        /* renamed from: kb.e$a$a, reason: collision with other inner class name */
        static final class C0155a extends i implements p {

            /* renamed from: n, reason: collision with root package name */
            public static final C0155a f24957n = new C0155a();

            C0155a() {
                super(2);
            }

            @Override // qb.p
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public final e b(e eVar, b bVar) {
                kb.c cVar;
                h.e(eVar, "acc");
                h.e(bVar, "element");
                e eVarMinusKey = eVar.minusKey(bVar.getKey());
                f fVar = f.f24958m;
                if (eVarMinusKey == fVar) {
                    return bVar;
                }
                d.b bVar2 = d.f24955j;
                d dVar = (d) eVarMinusKey.get(bVar2);
                if (dVar == null) {
                    cVar = new kb.c(eVarMinusKey, bVar);
                } else {
                    e eVarMinusKey2 = eVarMinusKey.minusKey(bVar2);
                    if (eVarMinusKey2 == fVar) {
                        return new kb.c(bVar, dVar);
                    }
                    cVar = new kb.c(new kb.c(eVarMinusKey2, bVar), dVar);
                }
                return cVar;
            }
        }

        public static e a(e eVar, e eVar2) {
            h.e(eVar2, "context");
            return eVar2 == f.f24958m ? eVar : (e) eVar2.fold(eVar, C0155a.f24957n);
        }
    }

    public interface b extends e {

        public static final class a {
            public static Object a(b bVar, Object obj, p pVar) {
                h.e(pVar, "operation");
                return pVar.b(obj, bVar);
            }

            public static b b(b bVar, c cVar) {
                h.e(cVar, "key");
                if (!h.a(bVar.getKey(), cVar)) {
                    return null;
                }
                h.c(bVar, "null cannot be cast to non-null type E of kotlin.coroutines.CoroutineContext.Element.get");
                return bVar;
            }

            public static e c(b bVar, c cVar) {
                h.e(cVar, "key");
                return h.a(bVar.getKey(), cVar) ? f.f24958m : bVar;
            }

            public static e d(b bVar, e eVar) {
                h.e(eVar, "context");
                return a.a(bVar, eVar);
            }
        }

        @Override // kb.e
        b get(c cVar);

        c getKey();
    }

    public interface c {
    }

    Object fold(Object obj, p pVar);

    b get(c cVar);

    e minusKey(c cVar);
}
