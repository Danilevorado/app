package t1;

import android.util.Log;
import com.bumptech.glide.load.data.d;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import t1.f;
import x1.m;

/* loaded from: classes.dex */
class z implements f, f.a {

    /* renamed from: m, reason: collision with root package name */
    private final g f27322m;

    /* renamed from: n, reason: collision with root package name */
    private final f.a f27323n;

    /* renamed from: o, reason: collision with root package name */
    private volatile int f27324o;

    /* renamed from: p, reason: collision with root package name */
    private volatile c f27325p;

    /* renamed from: q, reason: collision with root package name */
    private volatile Object f27326q;

    /* renamed from: r, reason: collision with root package name */
    private volatile m.a f27327r;

    /* renamed from: s, reason: collision with root package name */
    private volatile d f27328s;

    class a implements d.a {

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ m.a f27329m;

        a(m.a aVar) {
            this.f27329m = aVar;
        }

        @Override // com.bumptech.glide.load.data.d.a
        public void c(Exception exc) {
            if (z.this.f(this.f27329m)) {
                z.this.i(this.f27329m, exc);
            }
        }

        @Override // com.bumptech.glide.load.data.d.a
        public void d(Object obj) {
            if (z.this.f(this.f27329m)) {
                z.this.h(this.f27329m, obj);
            }
        }
    }

    z(g gVar, f.a aVar) {
        this.f27322m = gVar;
        this.f27323n = aVar;
    }

    private boolean c(Object obj) throws Throwable {
        long jB = n2.g.b();
        boolean z10 = true;
        try {
            com.bumptech.glide.load.data.e eVarO = this.f27322m.o(obj);
            Object objA = eVarO.a();
            r1.d dVarQ = this.f27322m.q(objA);
            e eVar = new e(dVarQ, objA, this.f27322m.k());
            d dVar = new d(this.f27327r.f28180a, this.f27322m.p());
            v1.a aVarD = this.f27322m.d();
            aVarD.a(dVar, eVar);
            if (Log.isLoggable("SourceGenerator", 2)) {
                Log.v("SourceGenerator", "Finished encoding source to cache, key: " + dVar + ", data: " + obj + ", encoder: " + dVarQ + ", duration: " + n2.g.a(jB));
            }
            if (aVarD.b(dVar) != null) {
                this.f27328s = dVar;
                this.f27325p = new c(Collections.singletonList(this.f27327r.f28180a), this.f27322m, this);
                this.f27327r.f28182c.b();
                return true;
            }
            if (Log.isLoggable("SourceGenerator", 3)) {
                Log.d("SourceGenerator", "Attempt to write: " + this.f27328s + ", data: " + obj + " to the disk cache failed, maybe the disk cache is disabled? Trying to decode the data directly...");
            }
            try {
                this.f27323n.d(this.f27327r.f28180a, eVarO.a(), this.f27327r.f28182c, this.f27327r.f28182c.e(), this.f27327r.f28180a);
                return false;
            } catch (Throwable th) {
                th = th;
                if (!z10) {
                    this.f27327r.f28182c.b();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            z10 = false;
        }
    }

    private boolean e() {
        return this.f27324o < this.f27322m.g().size();
    }

    private void j(m.a aVar) {
        this.f27327r.f28182c.f(this.f27322m.l(), new a(aVar));
    }

    @Override // t1.f
    public boolean a() {
        if (this.f27326q != null) {
            Object obj = this.f27326q;
            this.f27326q = null;
            try {
                if (!c(obj)) {
                    return true;
                }
            } catch (IOException e5) {
                if (Log.isLoggable("SourceGenerator", 3)) {
                    Log.d("SourceGenerator", "Failed to properly rewind or write data to cache", e5);
                }
            }
        }
        if (this.f27325p != null && this.f27325p.a()) {
            return true;
        }
        this.f27325p = null;
        this.f27327r = null;
        boolean z10 = false;
        while (!z10 && e()) {
            List listG = this.f27322m.g();
            int i10 = this.f27324o;
            this.f27324o = i10 + 1;
            this.f27327r = (m.a) listG.get(i10);
            if (this.f27327r != null && (this.f27322m.e().c(this.f27327r.f28182c.e()) || this.f27322m.u(this.f27327r.f28182c.a()))) {
                j(this.f27327r);
                z10 = true;
            }
        }
        return z10;
    }

    @Override // t1.f.a
    public void b() {
        throw new UnsupportedOperationException();
    }

    @Override // t1.f
    public void cancel() {
        m.a aVar = this.f27327r;
        if (aVar != null) {
            aVar.f28182c.cancel();
        }
    }

    @Override // t1.f.a
    public void d(r1.f fVar, Object obj, com.bumptech.glide.load.data.d dVar, r1.a aVar, r1.f fVar2) {
        this.f27323n.d(fVar, obj, dVar, this.f27327r.f28182c.e(), fVar);
    }

    boolean f(m.a aVar) {
        m.a aVar2 = this.f27327r;
        return aVar2 != null && aVar2 == aVar;
    }

    @Override // t1.f.a
    public void g(r1.f fVar, Exception exc, com.bumptech.glide.load.data.d dVar, r1.a aVar) {
        this.f27323n.g(fVar, exc, dVar, this.f27327r.f28182c.e());
    }

    void h(m.a aVar, Object obj) {
        j jVarE = this.f27322m.e();
        if (obj != null && jVarE.c(aVar.f28182c.e())) {
            this.f27326q = obj;
            this.f27323n.b();
        } else {
            f.a aVar2 = this.f27323n;
            r1.f fVar = aVar.f28180a;
            com.bumptech.glide.load.data.d dVar = aVar.f28182c;
            aVar2.d(fVar, obj, dVar, dVar.e(), this.f27328s);
        }
    }

    void i(m.a aVar, Exception exc) {
        f.a aVar2 = this.f27323n;
        d dVar = this.f27328s;
        com.bumptech.glide.load.data.d dVar2 = aVar.f28182c;
        aVar2.g(dVar, exc, dVar2, dVar2.e());
    }
}
