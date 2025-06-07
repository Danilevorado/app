package kb;

import java.io.Serializable;
import kb.e;
import qb.p;
import rb.h;
import rb.i;

/* loaded from: classes2.dex */
public final class c implements e, Serializable {

    /* renamed from: m, reason: collision with root package name */
    private final e f24952m;

    /* renamed from: n, reason: collision with root package name */
    private final e.b f24953n;

    static final class a extends i implements p {

        /* renamed from: n, reason: collision with root package name */
        public static final a f24954n = new a();

        a() {
            super(2);
        }

        @Override // qb.p
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final String b(String str, e.b bVar) {
            h.e(str, "acc");
            h.e(bVar, "element");
            if (str.length() == 0) {
                return bVar.toString();
            }
            return str + ", " + bVar;
        }
    }

    public c(e eVar, e.b bVar) {
        h.e(eVar, "left");
        h.e(bVar, "element");
        this.f24952m = eVar;
        this.f24953n = bVar;
    }

    private final boolean b(e.b bVar) {
        return h.a(get(bVar.getKey()), bVar);
    }

    private final boolean c(c cVar) {
        while (b(cVar.f24953n)) {
            e eVar = cVar.f24952m;
            if (!(eVar instanceof c)) {
                h.c(eVar, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                return b((e.b) eVar);
            }
            cVar = (c) eVar;
        }
        return false;
    }

    private final int d() {
        int i10 = 2;
        c cVar = this;
        while (true) {
            e eVar = cVar.f24952m;
            cVar = eVar instanceof c ? (c) eVar : null;
            if (cVar == null) {
                return i10;
            }
            i10++;
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof c) {
                c cVar = (c) obj;
                if (cVar.d() != d() || !cVar.c(this)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // kb.e
    public Object fold(Object obj, p pVar) {
        h.e(pVar, "operation");
        return pVar.b(this.f24952m.fold(obj, pVar), this.f24953n);
    }

    @Override // kb.e
    public e.b get(e.c cVar) {
        h.e(cVar, "key");
        c cVar2 = this;
        while (true) {
            e.b bVar = cVar2.f24953n.get(cVar);
            if (bVar != null) {
                return bVar;
            }
            e eVar = cVar2.f24952m;
            if (!(eVar instanceof c)) {
                return eVar.get(cVar);
            }
            cVar2 = (c) eVar;
        }
    }

    public int hashCode() {
        return this.f24952m.hashCode() + this.f24953n.hashCode();
    }

    @Override // kb.e
    public e minusKey(e.c cVar) {
        h.e(cVar, "key");
        if (this.f24953n.get(cVar) != null) {
            return this.f24952m;
        }
        e eVarMinusKey = this.f24952m.minusKey(cVar);
        return eVarMinusKey == this.f24952m ? this : eVarMinusKey == f.f24958m ? this.f24953n : new c(eVarMinusKey, this.f24953n);
    }

    public String toString() {
        return '[' + ((String) fold("", a.f24954n)) + ']';
    }
}
