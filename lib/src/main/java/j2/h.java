package j2;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.Log;
import com.bumptech.glide.c;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import n2.l;
import t1.k;
import t1.q;
import t1.v;

/* loaded from: classes.dex */
public final class h implements c, k2.g, g {
    private static final boolean E = Log.isLoggable("GlideRequest", 2);
    private int A;
    private int B;
    private boolean C;
    private RuntimeException D;

    /* renamed from: a, reason: collision with root package name */
    private int f24410a;

    /* renamed from: b, reason: collision with root package name */
    private final String f24411b;

    /* renamed from: c, reason: collision with root package name */
    private final o2.c f24412c;

    /* renamed from: d, reason: collision with root package name */
    private final Object f24413d;

    /* renamed from: e, reason: collision with root package name */
    private final e f24414e;

    /* renamed from: f, reason: collision with root package name */
    private final d f24415f;

    /* renamed from: g, reason: collision with root package name */
    private final Context f24416g;

    /* renamed from: h, reason: collision with root package name */
    private final com.bumptech.glide.d f24417h;

    /* renamed from: i, reason: collision with root package name */
    private final Object f24418i;

    /* renamed from: j, reason: collision with root package name */
    private final Class f24419j;

    /* renamed from: k, reason: collision with root package name */
    private final j2.a f24420k;

    /* renamed from: l, reason: collision with root package name */
    private final int f24421l;

    /* renamed from: m, reason: collision with root package name */
    private final int f24422m;

    /* renamed from: n, reason: collision with root package name */
    private final com.bumptech.glide.g f24423n;

    /* renamed from: o, reason: collision with root package name */
    private final k2.h f24424o;

    /* renamed from: p, reason: collision with root package name */
    private final List f24425p;

    /* renamed from: q, reason: collision with root package name */
    private final l2.c f24426q;

    /* renamed from: r, reason: collision with root package name */
    private final Executor f24427r;

    /* renamed from: s, reason: collision with root package name */
    private v f24428s;

    /* renamed from: t, reason: collision with root package name */
    private k.d f24429t;

    /* renamed from: u, reason: collision with root package name */
    private long f24430u;

    /* renamed from: v, reason: collision with root package name */
    private volatile k f24431v;

    /* renamed from: w, reason: collision with root package name */
    private a f24432w;

    /* renamed from: x, reason: collision with root package name */
    private Drawable f24433x;

    /* renamed from: y, reason: collision with root package name */
    private Drawable f24434y;

    /* renamed from: z, reason: collision with root package name */
    private Drawable f24435z;

    private enum a {
        PENDING,
        RUNNING,
        WAITING_FOR_SIZE,
        COMPLETE,
        FAILED,
        CLEARED
    }

    private h(Context context, com.bumptech.glide.d dVar, Object obj, Object obj2, Class cls, j2.a aVar, int i10, int i11, com.bumptech.glide.g gVar, k2.h hVar, e eVar, List list, d dVar2, k kVar, l2.c cVar, Executor executor) {
        this.f24411b = E ? String.valueOf(super.hashCode()) : null;
        this.f24412c = o2.c.a();
        this.f24413d = obj;
        this.f24416g = context;
        this.f24417h = dVar;
        this.f24418i = obj2;
        this.f24419j = cls;
        this.f24420k = aVar;
        this.f24421l = i10;
        this.f24422m = i11;
        this.f24423n = gVar;
        this.f24424o = hVar;
        this.f24414e = eVar;
        this.f24425p = list;
        this.f24415f = dVar2;
        this.f24431v = kVar;
        this.f24426q = cVar;
        this.f24427r = executor;
        this.f24432w = a.PENDING;
        if (this.D == null && dVar.g().a(c.d.class)) {
            this.D = new RuntimeException("Glide request origin trace");
        }
    }

    private void A(v vVar, Object obj, r1.a aVar, boolean z10) {
        boolean zA;
        boolean zS = s();
        this.f24432w = a.COMPLETE;
        this.f24428s = vVar;
        if (this.f24417h.h() <= 3) {
            Log.d("Glide", "Finished loading " + obj.getClass().getSimpleName() + " from " + aVar + " for " + this.f24418i + " with size [" + this.A + "x" + this.B + "] in " + n2.g.a(this.f24430u) + " ms");
        }
        boolean z11 = true;
        this.C = true;
        try {
            List list = this.f24425p;
            if (list != null) {
                Iterator it = list.iterator();
                zA = false;
                while (it.hasNext()) {
                    zA |= ((e) it.next()).a(obj, this.f24418i, this.f24424o, aVar, zS);
                }
            } else {
                zA = false;
            }
            e eVar = this.f24414e;
            if (eVar == null || !eVar.a(obj, this.f24418i, this.f24424o, aVar, zS)) {
                z11 = false;
            }
            if (!(z11 | zA)) {
                this.f24424o.f(obj, this.f24426q.a(aVar, zS));
            }
            this.C = false;
            x();
            o2.b.f("GlideRequest", this.f24410a);
        } catch (Throwable th) {
            this.C = false;
            throw th;
        }
    }

    private void B() {
        if (l()) {
            Drawable drawableQ = this.f24418i == null ? q() : null;
            if (drawableQ == null) {
                drawableQ = p();
            }
            if (drawableQ == null) {
                drawableQ = r();
            }
            this.f24424o.a(drawableQ);
        }
    }

    private void g() {
        if (this.C) {
            throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
        }
    }

    private boolean k() {
        d dVar = this.f24415f;
        return dVar == null || dVar.k(this);
    }

    private boolean l() {
        d dVar = this.f24415f;
        return dVar == null || dVar.c(this);
    }

    private boolean m() {
        d dVar = this.f24415f;
        return dVar == null || dVar.f(this);
    }

    private void n() {
        g();
        this.f24412c.c();
        this.f24424o.c(this);
        k.d dVar = this.f24429t;
        if (dVar != null) {
            dVar.a();
            this.f24429t = null;
        }
    }

    private void o(Object obj) {
        List<e> list = this.f24425p;
        if (list == null) {
            return;
        }
        for (e eVar : list) {
        }
    }

    private Drawable p() {
        if (this.f24433x == null) {
            Drawable drawableK = this.f24420k.k();
            this.f24433x = drawableK;
            if (drawableK == null && this.f24420k.j() > 0) {
                this.f24433x = t(this.f24420k.j());
            }
        }
        return this.f24433x;
    }

    private Drawable q() {
        if (this.f24435z == null) {
            Drawable drawableM = this.f24420k.m();
            this.f24435z = drawableM;
            if (drawableM == null && this.f24420k.r() > 0) {
                this.f24435z = t(this.f24420k.r());
            }
        }
        return this.f24435z;
    }

    private Drawable r() {
        if (this.f24434y == null) {
            Drawable drawableW = this.f24420k.w();
            this.f24434y = drawableW;
            if (drawableW == null && this.f24420k.x() > 0) {
                this.f24434y = t(this.f24420k.x());
            }
        }
        return this.f24434y;
    }

    private boolean s() {
        d dVar = this.f24415f;
        return dVar == null || !dVar.e().b();
    }

    private Drawable t(int i10) {
        return c2.b.a(this.f24417h, i10, this.f24420k.C() != null ? this.f24420k.C() : this.f24416g.getTheme());
    }

    private void u(String str) {
        Log.v("GlideRequest", str + " this: " + this.f24411b);
    }

    private static int v(int i10, float f5) {
        return i10 == Integer.MIN_VALUE ? i10 : Math.round(f5 * i10);
    }

    private void w() {
        d dVar = this.f24415f;
        if (dVar != null) {
            dVar.a(this);
        }
    }

    private void x() {
        d dVar = this.f24415f;
        if (dVar != null) {
            dVar.g(this);
        }
    }

    public static h y(Context context, com.bumptech.glide.d dVar, Object obj, Object obj2, Class cls, j2.a aVar, int i10, int i11, com.bumptech.glide.g gVar, k2.h hVar, e eVar, List list, d dVar2, k kVar, l2.c cVar, Executor executor) {
        return new h(context, dVar, obj, obj2, cls, aVar, i10, i11, gVar, hVar, eVar, list, dVar2, kVar, cVar, executor);
    }

    private void z(q qVar, int i10) {
        boolean zB;
        this.f24412c.c();
        synchronized (this.f24413d) {
            qVar.l(this.D);
            int iH = this.f24417h.h();
            if (iH <= i10) {
                Log.w("Glide", "Load failed for " + this.f24418i + " with size [" + this.A + "x" + this.B + "]", qVar);
                if (iH <= 4) {
                    qVar.g("Glide");
                }
            }
            this.f24429t = null;
            this.f24432w = a.FAILED;
            boolean z10 = true;
            this.C = true;
            try {
                List list = this.f24425p;
                if (list != null) {
                    Iterator it = list.iterator();
                    zB = false;
                    while (it.hasNext()) {
                        zB |= ((e) it.next()).b(qVar, this.f24418i, this.f24424o, s());
                    }
                } else {
                    zB = false;
                }
                e eVar = this.f24414e;
                if (eVar == null || !eVar.b(qVar, this.f24418i, this.f24424o, s())) {
                    z10 = false;
                }
                if (!(zB | z10)) {
                    B();
                }
                this.C = false;
                w();
                o2.b.f("GlideRequest", this.f24410a);
            } catch (Throwable th) {
                this.C = false;
                throw th;
            }
        }
    }

    @Override // j2.g
    public void a(v vVar, r1.a aVar, boolean z10) {
        this.f24412c.c();
        v vVar2 = null;
        try {
            synchronized (this.f24413d) {
                try {
                    this.f24429t = null;
                    if (vVar == null) {
                        c(new q("Expected to receive a Resource<R> with an object of " + this.f24419j + " inside, but instead got null."));
                        return;
                    }
                    Object obj = vVar.get();
                    try {
                        if (obj != null && this.f24419j.isAssignableFrom(obj.getClass())) {
                            if (m()) {
                                A(vVar, obj, aVar, z10);
                                return;
                            }
                            this.f24428s = null;
                            this.f24432w = a.COMPLETE;
                            o2.b.f("GlideRequest", this.f24410a);
                            this.f24431v.k(vVar);
                            return;
                        }
                        this.f24428s = null;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Expected to receive an object of ");
                        sb2.append(this.f24419j);
                        sb2.append(" but instead got ");
                        sb2.append(obj != null ? obj.getClass() : "");
                        sb2.append("{");
                        sb2.append(obj);
                        sb2.append("} inside Resource{");
                        sb2.append(vVar);
                        sb2.append("}.");
                        sb2.append(obj != null ? "" : " To indicate failure return a null Resource object, rather than a Resource object containing null data.");
                        c(new q(sb2.toString()));
                        this.f24431v.k(vVar);
                    } catch (Throwable th) {
                        vVar2 = vVar;
                        th = th;
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
        } catch (Throwable th3) {
            if (vVar2 != null) {
                this.f24431v.k(vVar2);
            }
            throw th3;
        }
    }

    @Override // j2.c
    public boolean b() {
        boolean z10;
        synchronized (this.f24413d) {
            z10 = this.f24432w == a.COMPLETE;
        }
        return z10;
    }

    @Override // j2.g
    public void c(q qVar) {
        z(qVar, 5);
    }

    @Override // j2.c
    public void clear() {
        synchronized (this.f24413d) {
            g();
            this.f24412c.c();
            a aVar = this.f24432w;
            a aVar2 = a.CLEARED;
            if (aVar == aVar2) {
                return;
            }
            n();
            v vVar = this.f24428s;
            if (vVar != null) {
                this.f24428s = null;
            } else {
                vVar = null;
            }
            if (k()) {
                this.f24424o.g(r());
            }
            o2.b.f("GlideRequest", this.f24410a);
            this.f24432w = aVar2;
            if (vVar != null) {
                this.f24431v.k(vVar);
            }
        }
    }

    @Override // j2.c
    public boolean d() {
        boolean z10;
        synchronized (this.f24413d) {
            z10 = this.f24432w == a.CLEARED;
        }
        return z10;
    }

    @Override // j2.g
    public Object e() {
        this.f24412c.c();
        return this.f24413d;
    }

    @Override // k2.g
    public void f(int i10, int i11) throws Throwable {
        Object obj;
        this.f24412c.c();
        Object obj2 = this.f24413d;
        synchronized (obj2) {
            try {
                try {
                    boolean z10 = E;
                    if (z10) {
                        u("Got onSizeReady in " + n2.g.a(this.f24430u));
                    }
                    if (this.f24432w == a.WAITING_FOR_SIZE) {
                        a aVar = a.RUNNING;
                        this.f24432w = aVar;
                        float fB = this.f24420k.B();
                        this.A = v(i10, fB);
                        this.B = v(i11, fB);
                        if (z10) {
                            u("finished setup for calling load in " + n2.g.a(this.f24430u));
                        }
                        obj = obj2;
                        try {
                            this.f24429t = this.f24431v.f(this.f24417h, this.f24418i, this.f24420k.A(), this.A, this.B, this.f24420k.z(), this.f24419j, this.f24423n, this.f24420k.i(), this.f24420k.D(), this.f24420k.N(), this.f24420k.J(), this.f24420k.t(), this.f24420k.H(), this.f24420k.F(), this.f24420k.E(), this.f24420k.s(), this, this.f24427r);
                            if (this.f24432w != aVar) {
                                this.f24429t = null;
                            }
                            if (z10) {
                                u("finished onSizeReady in " + n2.g.a(this.f24430u));
                            }
                        } catch (Throwable th) {
                            th = th;
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    obj = obj2;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }
    }

    @Override // j2.c
    public void h() {
        synchronized (this.f24413d) {
            g();
            this.f24412c.c();
            this.f24430u = n2.g.b();
            Object obj = this.f24418i;
            if (obj == null) {
                if (l.s(this.f24421l, this.f24422m)) {
                    this.A = this.f24421l;
                    this.B = this.f24422m;
                }
                z(new q("Received null model"), q() == null ? 5 : 3);
                return;
            }
            a aVar = this.f24432w;
            a aVar2 = a.RUNNING;
            if (aVar == aVar2) {
                throw new IllegalArgumentException("Cannot restart a running request");
            }
            if (aVar == a.COMPLETE) {
                a(this.f24428s, r1.a.MEMORY_CACHE, false);
                return;
            }
            o(obj);
            this.f24410a = o2.b.b("GlideRequest");
            a aVar3 = a.WAITING_FOR_SIZE;
            this.f24432w = aVar3;
            if (l.s(this.f24421l, this.f24422m)) {
                f(this.f24421l, this.f24422m);
            } else {
                this.f24424o.b(this);
            }
            a aVar4 = this.f24432w;
            if ((aVar4 == aVar2 || aVar4 == aVar3) && l()) {
                this.f24424o.d(r());
            }
            if (E) {
                u("finished run method in " + n2.g.a(this.f24430u));
            }
        }
    }

    @Override // j2.c
    public boolean i(c cVar) {
        int i10;
        int i11;
        Object obj;
        Class cls;
        j2.a aVar;
        com.bumptech.glide.g gVar;
        int size;
        int i12;
        int i13;
        Object obj2;
        Class cls2;
        j2.a aVar2;
        com.bumptech.glide.g gVar2;
        int size2;
        if (!(cVar instanceof h)) {
            return false;
        }
        synchronized (this.f24413d) {
            i10 = this.f24421l;
            i11 = this.f24422m;
            obj = this.f24418i;
            cls = this.f24419j;
            aVar = this.f24420k;
            gVar = this.f24423n;
            List list = this.f24425p;
            size = list != null ? list.size() : 0;
        }
        h hVar = (h) cVar;
        synchronized (hVar.f24413d) {
            i12 = hVar.f24421l;
            i13 = hVar.f24422m;
            obj2 = hVar.f24418i;
            cls2 = hVar.f24419j;
            aVar2 = hVar.f24420k;
            gVar2 = hVar.f24423n;
            List list2 = hVar.f24425p;
            size2 = list2 != null ? list2.size() : 0;
        }
        return i10 == i12 && i11 == i13 && l.b(obj, obj2) && cls.equals(cls2) && aVar.equals(aVar2) && gVar == gVar2 && size == size2;
    }

    @Override // j2.c
    public boolean isRunning() {
        boolean z10;
        synchronized (this.f24413d) {
            a aVar = this.f24432w;
            z10 = aVar == a.RUNNING || aVar == a.WAITING_FOR_SIZE;
        }
        return z10;
    }

    @Override // j2.c
    public boolean j() {
        boolean z10;
        synchronized (this.f24413d) {
            z10 = this.f24432w == a.COMPLETE;
        }
        return z10;
    }

    @Override // j2.c
    public void pause() {
        synchronized (this.f24413d) {
            if (isRunning()) {
                clear();
            }
        }
    }

    public String toString() {
        Object obj;
        Class cls;
        synchronized (this.f24413d) {
            obj = this.f24418i;
            cls = this.f24419j;
        }
        return super.toString() + "[model=" + obj + ", transcodeClass=" + cls + "]";
    }
}
