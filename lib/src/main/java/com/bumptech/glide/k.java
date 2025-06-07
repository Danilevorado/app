package com.bumptech.glide;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import g2.c;
import g2.m;
import g2.q;
import g2.r;
import g2.u;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public class k implements ComponentCallbacks2, m {

    /* renamed from: x, reason: collision with root package name */
    private static final j2.f f5394x = (j2.f) j2.f.m0(Bitmap.class).Q();

    /* renamed from: y, reason: collision with root package name */
    private static final j2.f f5395y = (j2.f) j2.f.m0(e2.c.class).Q();

    /* renamed from: z, reason: collision with root package name */
    private static final j2.f f5396z = (j2.f) ((j2.f) j2.f.n0(t1.j.f27215c).Z(g.LOW)).g0(true);

    /* renamed from: m, reason: collision with root package name */
    protected final com.bumptech.glide.b f5397m;

    /* renamed from: n, reason: collision with root package name */
    protected final Context f5398n;

    /* renamed from: o, reason: collision with root package name */
    final g2.l f5399o;

    /* renamed from: p, reason: collision with root package name */
    private final r f5400p;

    /* renamed from: q, reason: collision with root package name */
    private final q f5401q;

    /* renamed from: r, reason: collision with root package name */
    private final u f5402r;

    /* renamed from: s, reason: collision with root package name */
    private final Runnable f5403s;

    /* renamed from: t, reason: collision with root package name */
    private final g2.c f5404t;

    /* renamed from: u, reason: collision with root package name */
    private final CopyOnWriteArrayList f5405u;

    /* renamed from: v, reason: collision with root package name */
    private j2.f f5406v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f5407w;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            k kVar = k.this;
            kVar.f5399o.a(kVar);
        }
    }

    private class b implements c.a {

        /* renamed from: a, reason: collision with root package name */
        private final r f5409a;

        b(r rVar) {
            this.f5409a = rVar;
        }

        @Override // g2.c.a
        public void a(boolean z10) {
            if (z10) {
                synchronized (k.this) {
                    this.f5409a.e();
                }
            }
        }
    }

    public k(com.bumptech.glide.b bVar, g2.l lVar, q qVar, Context context) {
        this(bVar, lVar, qVar, new r(), bVar.g(), context);
    }

    k(com.bumptech.glide.b bVar, g2.l lVar, q qVar, r rVar, g2.d dVar, Context context) {
        this.f5402r = new u();
        a aVar = new a();
        this.f5403s = aVar;
        this.f5397m = bVar;
        this.f5399o = lVar;
        this.f5401q = qVar;
        this.f5400p = rVar;
        this.f5398n = context;
        g2.c cVarA = dVar.a(context.getApplicationContext(), new b(rVar));
        this.f5404t = cVarA;
        if (n2.l.p()) {
            n2.l.t(aVar);
        } else {
            lVar.a(this);
        }
        lVar.a(cVarA);
        this.f5405u = new CopyOnWriteArrayList(bVar.i().c());
        v(bVar.i().d());
        bVar.o(this);
    }

    private void y(k2.h hVar) {
        boolean zX = x(hVar);
        j2.c cVarE = hVar.e();
        if (zX || this.f5397m.p(hVar) || cVarE == null) {
            return;
        }
        hVar.h(null);
        cVarE.clear();
    }

    private synchronized void z(j2.f fVar) {
        this.f5406v = (j2.f) this.f5406v.a(fVar);
    }

    public synchronized k i(j2.f fVar) {
        z(fVar);
        return this;
    }

    public j j(Class cls) {
        return new j(this.f5397m, this, cls, this.f5398n);
    }

    public j k() {
        return j(Bitmap.class).a(f5394x);
    }

    public j l() {
        return j(Drawable.class);
    }

    public void m(k2.h hVar) {
        if (hVar == null) {
            return;
        }
        y(hVar);
    }

    List n() {
        return this.f5405u;
    }

    synchronized j2.f o() {
        return this.f5406v;
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
    }

    @Override // g2.m
    public synchronized void onDestroy() {
        this.f5402r.onDestroy();
        Iterator it = this.f5402r.j().iterator();
        while (it.hasNext()) {
            m((k2.h) it.next());
        }
        this.f5402r.i();
        this.f5400p.b();
        this.f5399o.b(this);
        this.f5399o.b(this.f5404t);
        n2.l.u(this.f5403s);
        this.f5397m.s(this);
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
    }

    @Override // g2.m
    public synchronized void onStart() {
        u();
        this.f5402r.onStart();
    }

    @Override // g2.m
    public synchronized void onStop() {
        t();
        this.f5402r.onStop();
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i10) {
        if (i10 == 60 && this.f5407w) {
            s();
        }
    }

    l p(Class cls) {
        return this.f5397m.i().e(cls);
    }

    public j q(Uri uri) {
        return l().z0(uri);
    }

    public synchronized void r() {
        this.f5400p.c();
    }

    public synchronized void s() {
        r();
        Iterator it = this.f5401q.a().iterator();
        while (it.hasNext()) {
            ((k) it.next()).r();
        }
    }

    public synchronized void t() {
        this.f5400p.d();
    }

    public synchronized String toString() {
        return super.toString() + "{tracker=" + this.f5400p + ", treeNode=" + this.f5401q + "}";
    }

    public synchronized void u() {
        this.f5400p.f();
    }

    protected synchronized void v(j2.f fVar) {
        this.f5406v = (j2.f) ((j2.f) fVar.clone()).b();
    }

    synchronized void w(k2.h hVar, j2.c cVar) {
        this.f5402r.k(hVar);
        this.f5400p.g(cVar);
    }

    synchronized boolean x(k2.h hVar) {
        j2.c cVarE = hVar.e();
        if (cVarE == null) {
            return true;
        }
        if (!this.f5400p.a(cVarE)) {
            return false;
        }
        this.f5402r.l(hVar);
        hVar.h(null);
        return true;
    }
}
