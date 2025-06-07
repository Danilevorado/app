package yb;

import kb.d;
import kb.e;

/* loaded from: classes2.dex */
public abstract class c extends kb.a implements kb.d {

    /* renamed from: m, reason: collision with root package name */
    public static final a f28599m = new a(null);

    public static final class a extends kb.b {

        /* renamed from: yb.c$a$a, reason: collision with other inner class name */
        static final class C0215a extends rb.i implements qb.l {

            /* renamed from: n, reason: collision with root package name */
            public static final C0215a f28600n = new C0215a();

            C0215a() {
                super(1);
            }

            @Override // qb.l
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public final c c(e.b bVar) {
                if (bVar instanceof c) {
                    return (c) bVar;
                }
                return null;
            }
        }

        private a() {
            super(kb.d.f24955j, C0215a.f28600n);
        }

        public /* synthetic */ a(rb.f fVar) {
            this();
        }
    }

    public c() {
        super(kb.d.f24955j);
    }

    public abstract void c(kb.e eVar, Runnable runnable);

    public boolean e(kb.e eVar) {
        return true;
    }

    public c f(int i10) {
        bc.d.a(i10);
        return new bc.c(this, i10);
    }

    @Override // kb.a, kb.e.b, kb.e
    public e.b get(e.c cVar) {
        return d.a.a(this, cVar);
    }

    @Override // kb.a, kb.e
    public kb.e minusKey(e.c cVar) {
        return d.a.b(this, cVar);
    }

    public String toString() {
        return g.a(this) + '@' + g.b(this);
    }
}
