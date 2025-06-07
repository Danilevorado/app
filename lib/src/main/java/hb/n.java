package hb;

import java.io.Serializable;

/* loaded from: classes2.dex */
final class n implements f, Serializable {

    /* renamed from: m, reason: collision with root package name */
    private qb.a f24173m;

    /* renamed from: n, reason: collision with root package name */
    private volatile Object f24174n;

    /* renamed from: o, reason: collision with root package name */
    private final Object f24175o;

    public n(qb.a aVar, Object obj) {
        rb.h.e(aVar, "initializer");
        this.f24173m = aVar;
        this.f24174n = p.f24176a;
        this.f24175o = obj == null ? this : obj;
    }

    public /* synthetic */ n(qb.a aVar, Object obj, int i10, rb.f fVar) {
        this(aVar, (i10 & 2) != 0 ? null : obj);
    }

    public boolean a() {
        return this.f24174n != p.f24176a;
    }

    @Override // hb.f
    public Object getValue() {
        Object objA;
        Object obj = this.f24174n;
        p pVar = p.f24176a;
        if (obj != pVar) {
            return obj;
        }
        synchronized (this.f24175o) {
            objA = this.f24174n;
            if (objA == pVar) {
                qb.a aVar = this.f24173m;
                rb.h.b(aVar);
                objA = aVar.a();
                this.f24174n = objA;
                this.f24173m = null;
            }
        }
        return objA;
    }

    public String toString() {
        return a() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
