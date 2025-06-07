package t1;

import o2.a;

/* loaded from: classes.dex */
final class u implements v, a.f {

    /* renamed from: q, reason: collision with root package name */
    private static final androidx.core.util.e f27296q = o2.a.d(20, new a());

    /* renamed from: m, reason: collision with root package name */
    private final o2.c f27297m = o2.c.a();

    /* renamed from: n, reason: collision with root package name */
    private v f27298n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f27299o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f27300p;

    class a implements a.d {
        a() {
        }

        @Override // o2.a.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public u a() {
            return new u();
        }
    }

    u() {
    }

    private void d(v vVar) {
        this.f27300p = false;
        this.f27299o = true;
        this.f27298n = vVar;
    }

    static u e(v vVar) {
        u uVar = (u) n2.k.d((u) f27296q.b());
        uVar.d(vVar);
        return uVar;
    }

    private void f() {
        this.f27298n = null;
        f27296q.a(this);
    }

    @Override // t1.v
    public int a() {
        return this.f27298n.a();
    }

    @Override // t1.v
    public Class b() {
        return this.f27298n.b();
    }

    @Override // t1.v
    public synchronized void c() {
        this.f27297m.c();
        this.f27300p = true;
        if (!this.f27299o) {
            this.f27298n.c();
            f();
        }
    }

    synchronized void g() {
        this.f27297m.c();
        if (!this.f27299o) {
            throw new IllegalStateException("Already unlocked");
        }
        this.f27299o = false;
        if (this.f27300p) {
            c();
        }
    }

    @Override // t1.v
    public Object get() {
        return this.f27298n.get();
    }

    @Override // o2.a.f
    public o2.c i() {
        return this.f27297m;
    }
}
