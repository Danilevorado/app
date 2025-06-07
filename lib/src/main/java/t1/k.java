package t1;

import android.util.Log;
import java.util.Map;
import java.util.concurrent.Executor;
import o2.a;
import t1.h;
import t1.p;
import v1.a;
import v1.h;

/* loaded from: classes.dex */
public class k implements m, h.a, p.a {

    /* renamed from: i, reason: collision with root package name */
    private static final boolean f27218i = Log.isLoggable("Engine", 2);

    /* renamed from: a, reason: collision with root package name */
    private final s f27219a;

    /* renamed from: b, reason: collision with root package name */
    private final o f27220b;

    /* renamed from: c, reason: collision with root package name */
    private final v1.h f27221c;

    /* renamed from: d, reason: collision with root package name */
    private final b f27222d;

    /* renamed from: e, reason: collision with root package name */
    private final y f27223e;

    /* renamed from: f, reason: collision with root package name */
    private final c f27224f;

    /* renamed from: g, reason: collision with root package name */
    private final a f27225g;

    /* renamed from: h, reason: collision with root package name */
    private final t1.a f27226h;

    static class a {

        /* renamed from: a, reason: collision with root package name */
        final h.e f27227a;

        /* renamed from: b, reason: collision with root package name */
        final androidx.core.util.e f27228b = o2.a.d(150, new C0192a());

        /* renamed from: c, reason: collision with root package name */
        private int f27229c;

        /* renamed from: t1.k$a$a, reason: collision with other inner class name */
        class C0192a implements a.d {
            C0192a() {
            }

            @Override // o2.a.d
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public h a() {
                a aVar = a.this;
                return new h(aVar.f27227a, aVar.f27228b);
            }
        }

        a(h.e eVar) {
            this.f27227a = eVar;
        }

        h a(com.bumptech.glide.d dVar, Object obj, n nVar, r1.f fVar, int i10, int i11, Class cls, Class cls2, com.bumptech.glide.g gVar, j jVar, Map map, boolean z10, boolean z11, boolean z12, r1.h hVar, h.b bVar) {
            h hVar2 = (h) n2.k.d((h) this.f27228b.b());
            int i12 = this.f27229c;
            this.f27229c = i12 + 1;
            return hVar2.t(dVar, obj, nVar, fVar, i10, i11, cls, cls2, gVar, jVar, map, z10, z11, z12, hVar, bVar, i12);
        }
    }

    static class b {

        /* renamed from: a, reason: collision with root package name */
        final w1.a f27231a;

        /* renamed from: b, reason: collision with root package name */
        final w1.a f27232b;

        /* renamed from: c, reason: collision with root package name */
        final w1.a f27233c;

        /* renamed from: d, reason: collision with root package name */
        final w1.a f27234d;

        /* renamed from: e, reason: collision with root package name */
        final m f27235e;

        /* renamed from: f, reason: collision with root package name */
        final p.a f27236f;

        /* renamed from: g, reason: collision with root package name */
        final androidx.core.util.e f27237g = o2.a.d(150, new a());

        class a implements a.d {
            a() {
            }

            @Override // o2.a.d
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public l a() {
                b bVar = b.this;
                return new l(bVar.f27231a, bVar.f27232b, bVar.f27233c, bVar.f27234d, bVar.f27235e, bVar.f27236f, bVar.f27237g);
            }
        }

        b(w1.a aVar, w1.a aVar2, w1.a aVar3, w1.a aVar4, m mVar, p.a aVar5) {
            this.f27231a = aVar;
            this.f27232b = aVar2;
            this.f27233c = aVar3;
            this.f27234d = aVar4;
            this.f27235e = mVar;
            this.f27236f = aVar5;
        }

        l a(r1.f fVar, boolean z10, boolean z11, boolean z12, boolean z13) {
            return ((l) n2.k.d((l) this.f27237g.b())).l(fVar, z10, z11, z12, z13);
        }
    }

    private static class c implements h.e {

        /* renamed from: a, reason: collision with root package name */
        private final a.InterfaceC0197a f27239a;

        /* renamed from: b, reason: collision with root package name */
        private volatile v1.a f27240b;

        c(a.InterfaceC0197a interfaceC0197a) {
            this.f27239a = interfaceC0197a;
        }

        @Override // t1.h.e
        public v1.a a() {
            if (this.f27240b == null) {
                synchronized (this) {
                    if (this.f27240b == null) {
                        this.f27240b = this.f27239a.build();
                    }
                    if (this.f27240b == null) {
                        this.f27240b = new v1.b();
                    }
                }
            }
            return this.f27240b;
        }
    }

    public class d {

        /* renamed from: a, reason: collision with root package name */
        private final l f27241a;

        /* renamed from: b, reason: collision with root package name */
        private final j2.g f27242b;

        d(j2.g gVar, l lVar) {
            this.f27242b = gVar;
            this.f27241a = lVar;
        }

        public void a() {
            synchronized (k.this) {
                this.f27241a.r(this.f27242b);
            }
        }
    }

    k(v1.h hVar, a.InterfaceC0197a interfaceC0197a, w1.a aVar, w1.a aVar2, w1.a aVar3, w1.a aVar4, s sVar, o oVar, t1.a aVar5, b bVar, a aVar6, y yVar, boolean z10) {
        this.f27221c = hVar;
        c cVar = new c(interfaceC0197a);
        this.f27224f = cVar;
        t1.a aVar7 = aVar5 == null ? new t1.a(z10) : aVar5;
        this.f27226h = aVar7;
        aVar7.f(this);
        this.f27220b = oVar == null ? new o() : oVar;
        this.f27219a = sVar == null ? new s() : sVar;
        this.f27222d = bVar == null ? new b(aVar, aVar2, aVar3, aVar4, this, this) : bVar;
        this.f27225g = aVar6 == null ? new a(cVar) : aVar6;
        this.f27223e = yVar == null ? new y() : yVar;
        hVar.c(this);
    }

    public k(v1.h hVar, a.InterfaceC0197a interfaceC0197a, w1.a aVar, w1.a aVar2, w1.a aVar3, w1.a aVar4, boolean z10) {
        this(hVar, interfaceC0197a, aVar, aVar2, aVar3, aVar4, null, null, null, null, null, null, z10);
    }

    private p e(r1.f fVar) {
        v vVarD = this.f27221c.d(fVar);
        if (vVarD == null) {
            return null;
        }
        return vVarD instanceof p ? (p) vVarD : new p(vVarD, true, true, fVar, this);
    }

    private p g(r1.f fVar) {
        p pVarE = this.f27226h.e(fVar);
        if (pVarE != null) {
            pVarE.d();
        }
        return pVarE;
    }

    private p h(r1.f fVar) {
        p pVarE = e(fVar);
        if (pVarE != null) {
            pVarE.d();
            this.f27226h.a(fVar, pVarE);
        }
        return pVarE;
    }

    private p i(n nVar, boolean z10, long j10) {
        if (!z10) {
            return null;
        }
        p pVarG = g(nVar);
        if (pVarG != null) {
            if (f27218i) {
                j("Loaded resource from active resources", j10, nVar);
            }
            return pVarG;
        }
        p pVarH = h(nVar);
        if (pVarH == null) {
            return null;
        }
        if (f27218i) {
            j("Loaded resource from cache", j10, nVar);
        }
        return pVarH;
    }

    private static void j(String str, long j10, r1.f fVar) {
        Log.v("Engine", str + " in " + n2.g.a(j10) + "ms, key: " + fVar);
    }

    private d l(com.bumptech.glide.d dVar, Object obj, r1.f fVar, int i10, int i11, Class cls, Class cls2, com.bumptech.glide.g gVar, j jVar, Map map, boolean z10, boolean z11, r1.h hVar, boolean z12, boolean z13, boolean z14, boolean z15, j2.g gVar2, Executor executor, n nVar, long j10) {
        l lVarA = this.f27219a.a(nVar, z15);
        if (lVarA != null) {
            lVarA.d(gVar2, executor);
            if (f27218i) {
                j("Added to existing load", j10, nVar);
            }
            return new d(gVar2, lVarA);
        }
        l lVarA2 = this.f27222d.a(nVar, z12, z13, z14, z15);
        h hVarA = this.f27225g.a(dVar, obj, nVar, fVar, i10, i11, cls, cls2, gVar, jVar, map, z10, z11, z15, hVar, lVarA2);
        this.f27219a.c(nVar, lVarA2);
        lVarA2.d(gVar2, executor);
        lVarA2.s(hVarA);
        if (f27218i) {
            j("Started new load", j10, nVar);
        }
        return new d(gVar2, lVarA2);
    }

    @Override // t1.m
    public synchronized void a(l lVar, r1.f fVar, p pVar) {
        if (pVar != null) {
            if (pVar.f()) {
                this.f27226h.a(fVar, pVar);
            }
            this.f27219a.d(fVar, lVar);
        } else {
            this.f27219a.d(fVar, lVar);
        }
    }

    @Override // t1.p.a
    public void b(r1.f fVar, p pVar) {
        this.f27226h.d(fVar);
        if (pVar.f()) {
            this.f27221c.e(fVar, pVar);
        } else {
            this.f27223e.a(pVar, false);
        }
    }

    @Override // v1.h.a
    public void c(v vVar) {
        this.f27223e.a(vVar, true);
    }

    @Override // t1.m
    public synchronized void d(l lVar, r1.f fVar) {
        this.f27219a.d(fVar, lVar);
    }

    public d f(com.bumptech.glide.d dVar, Object obj, r1.f fVar, int i10, int i11, Class cls, Class cls2, com.bumptech.glide.g gVar, j jVar, Map map, boolean z10, boolean z11, r1.h hVar, boolean z12, boolean z13, boolean z14, boolean z15, j2.g gVar2, Executor executor) {
        long jB = f27218i ? n2.g.b() : 0L;
        n nVarA = this.f27220b.a(obj, fVar, i10, i11, map, cls, cls2, hVar);
        synchronized (this) {
            p pVarI = i(nVarA, z12, jB);
            if (pVarI == null) {
                return l(dVar, obj, fVar, i10, i11, cls, cls2, gVar, jVar, map, z10, z11, hVar, z12, z13, z14, z15, gVar2, executor, nVarA, jB);
            }
            gVar2.a(pVarI, r1.a.MEMORY_CACHE, false);
            return null;
        }
    }

    public void k(v vVar) {
        if (!(vVar instanceof p)) {
            throw new IllegalArgumentException("Cannot release anything but an EngineResource");
        }
        ((p) vVar).g();
    }
}
