package e1;

import g1.v;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class c implements d1.a {

    /* renamed from: a, reason: collision with root package name */
    private final f1.h f23007a;

    /* renamed from: b, reason: collision with root package name */
    private final List f23008b;

    /* renamed from: c, reason: collision with root package name */
    private final List f23009c;

    /* renamed from: d, reason: collision with root package name */
    private Object f23010d;

    /* renamed from: e, reason: collision with root package name */
    private a f23011e;

    public interface a {
        void b(List list);

        void c(List list);
    }

    public c(f1.h hVar) {
        rb.h.e(hVar, "tracker");
        this.f23007a = hVar;
        this.f23008b = new ArrayList();
        this.f23009c = new ArrayList();
    }

    private final void h(a aVar, Object obj) {
        if (this.f23008b.isEmpty() || aVar == null) {
            return;
        }
        if (obj == null || c(obj)) {
            aVar.c(this.f23008b);
        } else {
            aVar.b(this.f23008b);
        }
    }

    @Override // d1.a
    public void a(Object obj) {
        this.f23010d = obj;
        h(this.f23011e, obj);
    }

    public abstract boolean b(v vVar);

    public abstract boolean c(Object obj);

    public final boolean d(String str) {
        rb.h.e(str, "workSpecId");
        Object obj = this.f23010d;
        return obj != null && c(obj) && this.f23009c.contains(str);
    }

    public final void e(Iterable iterable) {
        rb.h.e(iterable, "workSpecs");
        this.f23008b.clear();
        this.f23009c.clear();
        List list = this.f23008b;
        for (Object obj : iterable) {
            if (b((v) obj)) {
                list.add(obj);
            }
        }
        List list2 = this.f23008b;
        List list3 = this.f23009c;
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            list3.add(((v) it.next()).f23739a);
        }
        if (this.f23008b.isEmpty()) {
            this.f23007a.f(this);
        } else {
            this.f23007a.c(this);
        }
        h(this.f23011e, this.f23010d);
    }

    public final void f() {
        if (!this.f23008b.isEmpty()) {
            this.f23008b.clear();
            this.f23007a.f(this);
        }
    }

    public final void g(a aVar) {
        if (this.f23011e != aVar) {
            this.f23011e = aVar;
            h(aVar, this.f23010d);
        }
    }
}
