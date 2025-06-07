package q;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public class a extends g implements Map {

    /* renamed from: t, reason: collision with root package name */
    f f26016t;

    /* renamed from: q.a$a, reason: collision with other inner class name */
    class C0176a extends f {
        C0176a() {
        }

        @Override // q.f
        protected void a() {
            a.this.clear();
        }

        @Override // q.f
        protected Object b(int i10, int i11) {
            return a.this.f26065n[(i10 << 1) + i11];
        }

        @Override // q.f
        protected Map c() {
            return a.this;
        }

        @Override // q.f
        protected int d() {
            return a.this.f26066o;
        }

        @Override // q.f
        protected int e(Object obj) {
            return a.this.f(obj);
        }

        @Override // q.f
        protected int f(Object obj) {
            return a.this.h(obj);
        }

        @Override // q.f
        protected void g(Object obj, Object obj2) {
            a.this.put(obj, obj2);
        }

        @Override // q.f
        protected void h(int i10) {
            a.this.k(i10);
        }

        @Override // q.f
        protected Object i(int i10, Object obj) {
            return a.this.l(i10, obj);
        }
    }

    public a() {
    }

    public a(int i10) {
        super(i10);
    }

    public a(g gVar) {
        super(gVar);
    }

    private f n() {
        if (this.f26016t == null) {
            this.f26016t = new C0176a();
        }
        return this.f26016t;
    }

    @Override // java.util.Map
    public Set entrySet() {
        return n().l();
    }

    @Override // java.util.Map
    public Set keySet() {
        return n().m();
    }

    public boolean o(Collection collection) {
        return f.p(this, collection);
    }

    @Override // java.util.Map
    public void putAll(Map map) {
        c(this.f26066o + map.size());
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public Collection values() {
        return n().n();
    }
}
