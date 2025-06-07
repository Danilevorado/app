package t1;

import android.os.Build;
import android.util.Log;
import com.bumptech.glide.i;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import o2.a;
import t1.f;
import t1.i;

/* loaded from: classes.dex */
class h implements f.a, Runnable, Comparable, a.f {
    private r1.h A;
    private b B;
    private int C;
    private EnumC0191h D;
    private g E;
    private long F;
    private boolean G;
    private Object H;
    private Thread I;
    private r1.f J;
    private r1.f K;
    private Object L;
    private r1.a M;
    private com.bumptech.glide.load.data.d N;
    private volatile t1.f O;
    private volatile boolean P;
    private volatile boolean Q;
    private boolean R;

    /* renamed from: p, reason: collision with root package name */
    private final e f27175p;

    /* renamed from: q, reason: collision with root package name */
    private final androidx.core.util.e f27176q;

    /* renamed from: t, reason: collision with root package name */
    private com.bumptech.glide.d f27179t;

    /* renamed from: u, reason: collision with root package name */
    private r1.f f27180u;

    /* renamed from: v, reason: collision with root package name */
    private com.bumptech.glide.g f27181v;

    /* renamed from: w, reason: collision with root package name */
    private n f27182w;

    /* renamed from: x, reason: collision with root package name */
    private int f27183x;

    /* renamed from: y, reason: collision with root package name */
    private int f27184y;

    /* renamed from: z, reason: collision with root package name */
    private j f27185z;

    /* renamed from: m, reason: collision with root package name */
    private final t1.g f27172m = new t1.g();

    /* renamed from: n, reason: collision with root package name */
    private final List f27173n = new ArrayList();

    /* renamed from: o, reason: collision with root package name */
    private final o2.c f27174o = o2.c.a();

    /* renamed from: r, reason: collision with root package name */
    private final d f27177r = new d();

    /* renamed from: s, reason: collision with root package name */
    private final f f27178s = new f();

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f27186a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f27187b;

        /* renamed from: c, reason: collision with root package name */
        static final /* synthetic */ int[] f27188c;

        static {
            int[] iArr = new int[r1.c.values().length];
            f27188c = iArr;
            try {
                iArr[r1.c.SOURCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f27188c[r1.c.TRANSFORMED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[EnumC0191h.values().length];
            f27187b = iArr2;
            try {
                iArr2[EnumC0191h.RESOURCE_CACHE.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f27187b[EnumC0191h.DATA_CACHE.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f27187b[EnumC0191h.SOURCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f27187b[EnumC0191h.FINISHED.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f27187b[EnumC0191h.INITIALIZE.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr3 = new int[g.values().length];
            f27186a = iArr3;
            try {
                iArr3[g.INITIALIZE.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f27186a[g.SWITCH_TO_SOURCE_SERVICE.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f27186a[g.DECODE_DATA.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    interface b {
        void a(v vVar, r1.a aVar, boolean z10);

        void b(h hVar);

        void c(q qVar);
    }

    private final class c implements i.a {

        /* renamed from: a, reason: collision with root package name */
        private final r1.a f27189a;

        c(r1.a aVar) {
            this.f27189a = aVar;
        }

        @Override // t1.i.a
        public v a(v vVar) {
            return h.this.B(this.f27189a, vVar);
        }
    }

    private static class d {

        /* renamed from: a, reason: collision with root package name */
        private r1.f f27191a;

        /* renamed from: b, reason: collision with root package name */
        private r1.k f27192b;

        /* renamed from: c, reason: collision with root package name */
        private u f27193c;

        d() {
        }

        void a() {
            this.f27191a = null;
            this.f27192b = null;
            this.f27193c = null;
        }

        void b(e eVar, r1.h hVar) {
            o2.b.a("DecodeJob.encode");
            try {
                eVar.a().a(this.f27191a, new t1.e(this.f27192b, this.f27193c, hVar));
            } finally {
                this.f27193c.g();
                o2.b.e();
            }
        }

        boolean c() {
            return this.f27193c != null;
        }

        void d(r1.f fVar, r1.k kVar, u uVar) {
            this.f27191a = fVar;
            this.f27192b = kVar;
            this.f27193c = uVar;
        }
    }

    interface e {
        v1.a a();
    }

    private static class f {

        /* renamed from: a, reason: collision with root package name */
        private boolean f27194a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f27195b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f27196c;

        f() {
        }

        private boolean a(boolean z10) {
            return (this.f27196c || z10 || this.f27195b) && this.f27194a;
        }

        synchronized boolean b() {
            this.f27195b = true;
            return a(false);
        }

        synchronized boolean c() {
            this.f27196c = true;
            return a(false);
        }

        synchronized boolean d(boolean z10) {
            this.f27194a = true;
            return a(z10);
        }

        synchronized void e() {
            this.f27195b = false;
            this.f27194a = false;
            this.f27196c = false;
        }
    }

    private enum g {
        INITIALIZE,
        SWITCH_TO_SOURCE_SERVICE,
        DECODE_DATA
    }

    /* renamed from: t1.h$h, reason: collision with other inner class name */
    private enum EnumC0191h {
        INITIALIZE,
        RESOURCE_CACHE,
        DATA_CACHE,
        SOURCE,
        ENCODE,
        FINISHED
    }

    h(e eVar, androidx.core.util.e eVar2) {
        this.f27175p = eVar;
        this.f27176q = eVar2;
    }

    private void A() {
        if (this.f27178s.c()) {
            D();
        }
    }

    private void D() {
        this.f27178s.e();
        this.f27177r.a();
        this.f27172m.a();
        this.P = false;
        this.f27179t = null;
        this.f27180u = null;
        this.A = null;
        this.f27181v = null;
        this.f27182w = null;
        this.B = null;
        this.D = null;
        this.O = null;
        this.I = null;
        this.J = null;
        this.L = null;
        this.M = null;
        this.N = null;
        this.F = 0L;
        this.Q = false;
        this.H = null;
        this.f27173n.clear();
        this.f27176q.a(this);
    }

    private void E() {
        this.I = Thread.currentThread();
        this.F = n2.g.b();
        boolean zA = false;
        while (!this.Q && this.O != null && !(zA = this.O.a())) {
            this.D = q(this.D);
            this.O = p();
            if (this.D == EnumC0191h.SOURCE) {
                b();
                return;
            }
        }
        if ((this.D == EnumC0191h.FINISHED || this.Q) && !zA) {
            y();
        }
    }

    private v F(Object obj, r1.a aVar, t tVar) {
        r1.h hVarR = r(aVar);
        com.bumptech.glide.load.data.e eVarL = this.f27179t.i().l(obj);
        try {
            return tVar.a(eVarL, hVarR, this.f27183x, this.f27184y, new c(aVar));
        } finally {
            eVarL.b();
        }
    }

    private void G() {
        int i10 = a.f27186a[this.E.ordinal()];
        if (i10 == 1) {
            this.D = q(EnumC0191h.INITIALIZE);
            this.O = p();
        } else if (i10 != 2) {
            if (i10 == 3) {
                o();
                return;
            }
            throw new IllegalStateException("Unrecognized run reason: " + this.E);
        }
        E();
    }

    private void H() {
        Throwable th;
        this.f27174o.c();
        if (!this.P) {
            this.P = true;
            return;
        }
        if (this.f27173n.isEmpty()) {
            th = null;
        } else {
            List list = this.f27173n;
            th = (Throwable) list.get(list.size() - 1);
        }
        throw new IllegalStateException("Already notified", th);
    }

    private v m(com.bumptech.glide.load.data.d dVar, Object obj, r1.a aVar) {
        if (obj == null) {
            return null;
        }
        try {
            long jB = n2.g.b();
            v vVarN = n(obj, aVar);
            if (Log.isLoggable("DecodeJob", 2)) {
                u("Decoded result " + vVarN, jB);
            }
            return vVarN;
        } finally {
            dVar.b();
        }
    }

    private v n(Object obj, r1.a aVar) {
        return F(obj, aVar, this.f27172m.h(obj.getClass()));
    }

    private void o() {
        if (Log.isLoggable("DecodeJob", 2)) {
            v("Retrieved data", this.F, "data: " + this.L + ", cache key: " + this.J + ", fetcher: " + this.N);
        }
        v vVarM = null;
        try {
            vVarM = m(this.N, this.L, this.M);
        } catch (q e5) {
            e5.j(this.K, this.M);
            this.f27173n.add(e5);
        }
        if (vVarM != null) {
            x(vVarM, this.M, this.R);
        } else {
            E();
        }
    }

    private t1.f p() {
        int i10 = a.f27187b[this.D.ordinal()];
        if (i10 == 1) {
            return new w(this.f27172m, this);
        }
        if (i10 == 2) {
            return new t1.c(this.f27172m, this);
        }
        if (i10 == 3) {
            return new z(this.f27172m, this);
        }
        if (i10 == 4) {
            return null;
        }
        throw new IllegalStateException("Unrecognized stage: " + this.D);
    }

    private EnumC0191h q(EnumC0191h enumC0191h) {
        int i10 = a.f27187b[enumC0191h.ordinal()];
        if (i10 == 1) {
            return this.f27185z.a() ? EnumC0191h.DATA_CACHE : q(EnumC0191h.DATA_CACHE);
        }
        if (i10 == 2) {
            return this.G ? EnumC0191h.FINISHED : EnumC0191h.SOURCE;
        }
        if (i10 == 3 || i10 == 4) {
            return EnumC0191h.FINISHED;
        }
        if (i10 == 5) {
            return this.f27185z.b() ? EnumC0191h.RESOURCE_CACHE : q(EnumC0191h.RESOURCE_CACHE);
        }
        throw new IllegalArgumentException("Unrecognized stage: " + enumC0191h);
    }

    private r1.h r(r1.a aVar) {
        r1.h hVar = this.A;
        if (Build.VERSION.SDK_INT < 26) {
            return hVar;
        }
        boolean z10 = aVar == r1.a.RESOURCE_DISK_CACHE || this.f27172m.x();
        r1.g gVar = a2.m.f48j;
        Boolean bool = (Boolean) hVar.c(gVar);
        if (bool != null && (!bool.booleanValue() || z10)) {
            return hVar;
        }
        r1.h hVar2 = new r1.h();
        hVar2.d(this.A);
        hVar2.e(gVar, Boolean.valueOf(z10));
        return hVar2;
    }

    private int s() {
        return this.f27181v.ordinal();
    }

    private void u(String str, long j10) {
        v(str, j10, null);
    }

    private void v(String str, long j10, String str2) {
        String str3;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(" in ");
        sb2.append(n2.g.a(j10));
        sb2.append(", load key: ");
        sb2.append(this.f27182w);
        if (str2 != null) {
            str3 = ", " + str2;
        } else {
            str3 = "";
        }
        sb2.append(str3);
        sb2.append(", thread: ");
        sb2.append(Thread.currentThread().getName());
        Log.v("DecodeJob", sb2.toString());
    }

    private void w(v vVar, r1.a aVar, boolean z10) {
        H();
        this.B.a(vVar, aVar, z10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void x(v vVar, r1.a aVar, boolean z10) {
        o2.b.a("DecodeJob.notifyEncodeAndRelease");
        try {
            if (vVar instanceof r) {
                ((r) vVar).initialize();
            }
            u uVar = 0;
            if (this.f27177r.c()) {
                vVar = u.e(vVar);
                uVar = vVar;
            }
            w(vVar, aVar, z10);
            this.D = EnumC0191h.ENCODE;
            try {
                if (this.f27177r.c()) {
                    this.f27177r.b(this.f27175p, this.A);
                }
                z();
            } finally {
                if (uVar != 0) {
                    uVar.g();
                }
            }
        } finally {
            o2.b.e();
        }
    }

    private void y() {
        H();
        this.B.c(new q("Failed to load resource", new ArrayList(this.f27173n)));
        A();
    }

    private void z() {
        if (this.f27178s.b()) {
            D();
        }
    }

    v B(r1.a aVar, v vVar) {
        v vVarA;
        r1.l lVar;
        r1.c cVarA;
        r1.f dVar;
        Class<?> cls = vVar.get().getClass();
        r1.k kVarN = null;
        if (aVar != r1.a.RESOURCE_DISK_CACHE) {
            r1.l lVarS = this.f27172m.s(cls);
            lVar = lVarS;
            vVarA = lVarS.a(this.f27179t, vVar, this.f27183x, this.f27184y);
        } else {
            vVarA = vVar;
            lVar = null;
        }
        if (!vVar.equals(vVarA)) {
            vVar.c();
        }
        if (this.f27172m.w(vVarA)) {
            kVarN = this.f27172m.n(vVarA);
            cVarA = kVarN.a(this.A);
        } else {
            cVarA = r1.c.NONE;
        }
        r1.k kVar = kVarN;
        if (!this.f27185z.d(!this.f27172m.y(this.J), aVar, cVarA)) {
            return vVarA;
        }
        if (kVar == null) {
            throw new i.d(vVarA.get().getClass());
        }
        int i10 = a.f27188c[cVarA.ordinal()];
        if (i10 == 1) {
            dVar = new t1.d(this.J, this.f27180u);
        } else {
            if (i10 != 2) {
                throw new IllegalArgumentException("Unknown strategy: " + cVarA);
            }
            dVar = new x(this.f27172m.b(), this.J, this.f27180u, this.f27183x, this.f27184y, lVar, cls, this.A);
        }
        u uVarE = u.e(vVarA);
        this.f27177r.d(dVar, kVar, uVarE);
        return uVarE;
    }

    void C(boolean z10) {
        if (this.f27178s.d(z10)) {
            D();
        }
    }

    boolean I() {
        EnumC0191h enumC0191hQ = q(EnumC0191h.INITIALIZE);
        return enumC0191hQ == EnumC0191h.RESOURCE_CACHE || enumC0191hQ == EnumC0191h.DATA_CACHE;
    }

    @Override // t1.f.a
    public void b() {
        this.E = g.SWITCH_TO_SOURCE_SERVICE;
        this.B.b(this);
    }

    @Override // t1.f.a
    public void d(r1.f fVar, Object obj, com.bumptech.glide.load.data.d dVar, r1.a aVar, r1.f fVar2) {
        this.J = fVar;
        this.L = obj;
        this.N = dVar;
        this.M = aVar;
        this.K = fVar2;
        this.R = fVar != this.f27172m.c().get(0);
        if (Thread.currentThread() != this.I) {
            this.E = g.DECODE_DATA;
            this.B.b(this);
        } else {
            o2.b.a("DecodeJob.decodeFromRetrievedData");
            try {
                o();
            } finally {
                o2.b.e();
            }
        }
    }

    @Override // t1.f.a
    public void g(r1.f fVar, Exception exc, com.bumptech.glide.load.data.d dVar, r1.a aVar) {
        dVar.b();
        q qVar = new q("Fetching data failed", exc);
        qVar.k(fVar, aVar, dVar.a());
        this.f27173n.add(qVar);
        if (Thread.currentThread() == this.I) {
            E();
        } else {
            this.E = g.SWITCH_TO_SOURCE_SERVICE;
            this.B.b(this);
        }
    }

    @Override // o2.a.f
    public o2.c i() {
        return this.f27174o;
    }

    public void k() {
        this.Q = true;
        t1.f fVar = this.O;
        if (fVar != null) {
            fVar.cancel();
        }
    }

    @Override // java.lang.Comparable
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public int compareTo(h hVar) {
        int iS = s() - hVar.s();
        return iS == 0 ? this.C - hVar.C : iS;
    }

    @Override // java.lang.Runnable
    public void run() {
        o2.b.c("DecodeJob#run(reason=%s, model=%s)", this.E, this.H);
        com.bumptech.glide.load.data.d dVar = this.N;
        try {
            try {
                try {
                    if (this.Q) {
                        y();
                        if (dVar != null) {
                            dVar.b();
                        }
                        o2.b.e();
                        return;
                    }
                    G();
                    if (dVar != null) {
                        dVar.b();
                    }
                    o2.b.e();
                } catch (t1.b e5) {
                    throw e5;
                }
            } catch (Throwable th) {
                if (Log.isLoggable("DecodeJob", 3)) {
                    Log.d("DecodeJob", "DecodeJob threw unexpectedly, isCancelled: " + this.Q + ", stage: " + this.D, th);
                }
                if (this.D != EnumC0191h.ENCODE) {
                    this.f27173n.add(th);
                    y();
                }
                if (!this.Q) {
                    throw th;
                }
                throw th;
            }
        } catch (Throwable th2) {
            if (dVar != null) {
                dVar.b();
            }
            o2.b.e();
            throw th2;
        }
    }

    h t(com.bumptech.glide.d dVar, Object obj, n nVar, r1.f fVar, int i10, int i11, Class cls, Class cls2, com.bumptech.glide.g gVar, j jVar, Map map, boolean z10, boolean z11, boolean z12, r1.h hVar, b bVar, int i12) {
        this.f27172m.v(dVar, obj, fVar, i10, i11, jVar, cls, cls2, gVar, hVar, map, z10, z11, this.f27175p);
        this.f27179t = dVar;
        this.f27180u = fVar;
        this.f27181v = gVar;
        this.f27182w = nVar;
        this.f27183x = i10;
        this.f27184y = i11;
        this.f27185z = jVar;
        this.G = z12;
        this.A = hVar;
        this.B = bVar;
        this.C = i12;
        this.E = g.INITIALIZE;
        this.H = obj;
        return this;
    }
}
