package u1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
class g {

    /* renamed from: a, reason: collision with root package name */
    private final a f27539a = new a();

    /* renamed from: b, reason: collision with root package name */
    private final Map f27540b = new HashMap();

    private static class a {

        /* renamed from: a, reason: collision with root package name */
        final Object f27541a;

        /* renamed from: b, reason: collision with root package name */
        private List f27542b;

        /* renamed from: c, reason: collision with root package name */
        a f27543c;

        /* renamed from: d, reason: collision with root package name */
        a f27544d;

        a() {
            this(null);
        }

        a(Object obj) {
            this.f27544d = this;
            this.f27543c = this;
            this.f27541a = obj;
        }

        public void a(Object obj) {
            if (this.f27542b == null) {
                this.f27542b = new ArrayList();
            }
            this.f27542b.add(obj);
        }

        public Object b() {
            int iC = c();
            if (iC > 0) {
                return this.f27542b.remove(iC - 1);
            }
            return null;
        }

        public int c() {
            List list = this.f27542b;
            if (list != null) {
                return list.size();
            }
            return 0;
        }
    }

    g() {
    }

    private void b(a aVar) {
        e(aVar);
        a aVar2 = this.f27539a;
        aVar.f27544d = aVar2;
        aVar.f27543c = aVar2.f27543c;
        g(aVar);
    }

    private void c(a aVar) {
        e(aVar);
        a aVar2 = this.f27539a;
        aVar.f27544d = aVar2.f27544d;
        aVar.f27543c = aVar2;
        g(aVar);
    }

    private static void e(a aVar) {
        a aVar2 = aVar.f27544d;
        aVar2.f27543c = aVar.f27543c;
        aVar.f27543c.f27544d = aVar2;
    }

    private static void g(a aVar) {
        aVar.f27543c.f27544d = aVar;
        aVar.f27544d.f27543c = aVar;
    }

    public Object a(l lVar) {
        a aVar = (a) this.f27540b.get(lVar);
        if (aVar == null) {
            aVar = new a(lVar);
            this.f27540b.put(lVar, aVar);
        } else {
            lVar.a();
        }
        b(aVar);
        return aVar.b();
    }

    public void d(l lVar, Object obj) {
        a aVar = (a) this.f27540b.get(lVar);
        if (aVar == null) {
            aVar = new a(lVar);
            c(aVar);
            this.f27540b.put(lVar, aVar);
        } else {
            lVar.a();
        }
        aVar.a(obj);
    }

    public Object f() {
        a aVar = this.f27539a;
        while (true) {
            aVar = aVar.f27544d;
            if (aVar.equals(this.f27539a)) {
                return null;
            }
            Object objB = aVar.b();
            if (objB != null) {
                return objB;
            }
            e(aVar);
            this.f27540b.remove(aVar.f27541a);
            ((l) aVar.f27541a).a();
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("GroupedLinkedMap( ");
        boolean z10 = false;
        for (a aVar = this.f27539a.f27543c; !aVar.equals(this.f27539a); aVar = aVar.f27543c) {
            z10 = true;
            sb2.append('{');
            sb2.append(aVar.f27541a);
            sb2.append(':');
            sb2.append(aVar.c());
            sb2.append("}, ");
        }
        if (z10) {
            sb2.delete(sb2.length() - 2, sb2.length());
        }
        sb2.append(" )");
        return sb2.toString();
    }
}
