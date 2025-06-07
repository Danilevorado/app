package t1;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import t1.h;
import x1.m;

/* loaded from: classes.dex */
final class g {

    /* renamed from: a, reason: collision with root package name */
    private final List f27154a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private final List f27155b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private com.bumptech.glide.d f27156c;

    /* renamed from: d, reason: collision with root package name */
    private Object f27157d;

    /* renamed from: e, reason: collision with root package name */
    private int f27158e;

    /* renamed from: f, reason: collision with root package name */
    private int f27159f;

    /* renamed from: g, reason: collision with root package name */
    private Class f27160g;

    /* renamed from: h, reason: collision with root package name */
    private h.e f27161h;

    /* renamed from: i, reason: collision with root package name */
    private r1.h f27162i;

    /* renamed from: j, reason: collision with root package name */
    private Map f27163j;

    /* renamed from: k, reason: collision with root package name */
    private Class f27164k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f27165l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f27166m;

    /* renamed from: n, reason: collision with root package name */
    private r1.f f27167n;

    /* renamed from: o, reason: collision with root package name */
    private com.bumptech.glide.g f27168o;

    /* renamed from: p, reason: collision with root package name */
    private j f27169p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f27170q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f27171r;

    g() {
    }

    void a() {
        this.f27156c = null;
        this.f27157d = null;
        this.f27167n = null;
        this.f27160g = null;
        this.f27164k = null;
        this.f27162i = null;
        this.f27168o = null;
        this.f27163j = null;
        this.f27169p = null;
        this.f27154a.clear();
        this.f27165l = false;
        this.f27155b.clear();
        this.f27166m = false;
    }

    u1.b b() {
        return this.f27156c.b();
    }

    List c() {
        if (!this.f27166m) {
            this.f27166m = true;
            this.f27155b.clear();
            List listG = g();
            int size = listG.size();
            for (int i10 = 0; i10 < size; i10++) {
                m.a aVar = (m.a) listG.get(i10);
                if (!this.f27155b.contains(aVar.f28180a)) {
                    this.f27155b.add(aVar.f28180a);
                }
                for (int i11 = 0; i11 < aVar.f28181b.size(); i11++) {
                    if (!this.f27155b.contains(aVar.f28181b.get(i11))) {
                        this.f27155b.add(aVar.f28181b.get(i11));
                    }
                }
            }
        }
        return this.f27155b;
    }

    v1.a d() {
        return this.f27161h.a();
    }

    j e() {
        return this.f27169p;
    }

    int f() {
        return this.f27159f;
    }

    List g() {
        if (!this.f27165l) {
            this.f27165l = true;
            this.f27154a.clear();
            List listI = this.f27156c.i().i(this.f27157d);
            int size = listI.size();
            for (int i10 = 0; i10 < size; i10++) {
                m.a aVarA = ((x1.m) listI.get(i10)).a(this.f27157d, this.f27158e, this.f27159f, this.f27162i);
                if (aVarA != null) {
                    this.f27154a.add(aVarA);
                }
            }
        }
        return this.f27154a;
    }

    t h(Class cls) {
        return this.f27156c.i().h(cls, this.f27160g, this.f27164k);
    }

    Class i() {
        return this.f27157d.getClass();
    }

    List j(File file) {
        return this.f27156c.i().i(file);
    }

    r1.h k() {
        return this.f27162i;
    }

    com.bumptech.glide.g l() {
        return this.f27168o;
    }

    List m() {
        return this.f27156c.i().j(this.f27157d.getClass(), this.f27160g, this.f27164k);
    }

    r1.k n(v vVar) {
        return this.f27156c.i().k(vVar);
    }

    com.bumptech.glide.load.data.e o(Object obj) {
        return this.f27156c.i().l(obj);
    }

    r1.f p() {
        return this.f27167n;
    }

    r1.d q(Object obj) {
        return this.f27156c.i().m(obj);
    }

    Class r() {
        return this.f27164k;
    }

    r1.l s(Class cls) {
        r1.l lVar = (r1.l) this.f27163j.get(cls);
        if (lVar == null) {
            Iterator it = this.f27163j.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                if (((Class) entry.getKey()).isAssignableFrom(cls)) {
                    lVar = (r1.l) entry.getValue();
                    break;
                }
            }
        }
        if (lVar != null) {
            return lVar;
        }
        if (!this.f27163j.isEmpty() || !this.f27170q) {
            return z1.c.c();
        }
        throw new IllegalArgumentException("Missing transformation for " + cls + ". If you wish to ignore unknown resource types, use the optional transformation methods.");
    }

    int t() {
        return this.f27158e;
    }

    boolean u(Class cls) {
        return h(cls) != null;
    }

    void v(com.bumptech.glide.d dVar, Object obj, r1.f fVar, int i10, int i11, j jVar, Class cls, Class cls2, com.bumptech.glide.g gVar, r1.h hVar, Map map, boolean z10, boolean z11, h.e eVar) {
        this.f27156c = dVar;
        this.f27157d = obj;
        this.f27167n = fVar;
        this.f27158e = i10;
        this.f27159f = i11;
        this.f27169p = jVar;
        this.f27160g = cls;
        this.f27161h = eVar;
        this.f27164k = cls2;
        this.f27168o = gVar;
        this.f27162i = hVar;
        this.f27163j = map;
        this.f27170q = z10;
        this.f27171r = z11;
    }

    boolean w(v vVar) {
        return this.f27156c.i().n(vVar);
    }

    boolean x() {
        return this.f27171r;
    }

    boolean y(r1.f fVar) {
        List listG = g();
        int size = listG.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (((m.a) listG.get(i10)).f28180a.equals(fVar)) {
                return true;
            }
        }
        return false;
    }
}
