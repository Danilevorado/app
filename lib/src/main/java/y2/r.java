package y2;

import a3.b;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import s2.g;
import u2.c;

/* loaded from: classes.dex */
public class r {

    /* renamed from: a, reason: collision with root package name */
    private final Context f28504a;

    /* renamed from: b, reason: collision with root package name */
    private final s2.e f28505b;

    /* renamed from: c, reason: collision with root package name */
    private final z2.d f28506c;

    /* renamed from: d, reason: collision with root package name */
    private final x f28507d;

    /* renamed from: e, reason: collision with root package name */
    private final Executor f28508e;

    /* renamed from: f, reason: collision with root package name */
    private final a3.b f28509f;

    /* renamed from: g, reason: collision with root package name */
    private final b3.a f28510g;

    /* renamed from: h, reason: collision with root package name */
    private final b3.a f28511h;

    /* renamed from: i, reason: collision with root package name */
    private final z2.c f28512i;

    public r(Context context, s2.e eVar, z2.d dVar, x xVar, Executor executor, a3.b bVar, b3.a aVar, b3.a aVar2, z2.c cVar) {
        this.f28504a = context;
        this.f28505b = eVar;
        this.f28506c = dVar;
        this.f28507d = xVar;
        this.f28508e = executor;
        this.f28509f = bVar;
        this.f28510g = aVar;
        this.f28511h = aVar2;
        this.f28512i = cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean l(r2.o oVar) {
        return Boolean.valueOf(this.f28506c.T(oVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Iterable m(r2.o oVar) {
        return this.f28506c.D(oVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object n(Iterable iterable, r2.o oVar, long j10) {
        this.f28506c.N(iterable);
        this.f28506c.o(oVar, this.f28510g.a() + j10);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object o(Iterable iterable) {
        this.f28506c.l(iterable);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object p() {
        this.f28512i.e();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object q(Map map) {
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            this.f28512i.f(((Integer) r0.getValue()).intValue(), c.b.INVALID_PAYLOD, (String) ((Map.Entry) it.next()).getKey());
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object r(r2.o oVar, long j10) {
        this.f28506c.o(oVar, this.f28510g.a() + j10);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object s(r2.o oVar, int i10) {
        this.f28507d.b(oVar, i10 + 1);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void t(final r2.o oVar, final int i10, Runnable runnable) {
        try {
            try {
                a3.b bVar = this.f28509f;
                final z2.d dVar = this.f28506c;
                Objects.requireNonNull(dVar);
                bVar.a(new b.a() { // from class: y2.q
                    @Override // a3.b.a
                    public final Object a() {
                        return Integer.valueOf(dVar.k());
                    }
                });
                if (k()) {
                    u(oVar, i10);
                } else {
                    this.f28509f.a(new b.a() { // from class: y2.n
                        @Override // a3.b.a
                        public final Object a() {
                            return this.f28496a.s(oVar, i10);
                        }
                    });
                }
            } catch (a3.a unused) {
                this.f28507d.b(oVar, i10 + 1);
            }
        } finally {
            runnable.run();
        }
    }

    public r2.i j(s2.m mVar) {
        a3.b bVar = this.f28509f;
        final z2.c cVar = this.f28512i;
        Objects.requireNonNull(cVar);
        return mVar.b(r2.i.a().i(this.f28510g.a()).k(this.f28511h.a()).j("GDT_CLIENT_METRICS").h(new r2.h(p2.b.b("proto"), ((u2.a) bVar.a(new b.a() { // from class: y2.p
            @Override // a3.b.a
            public final Object a() {
                return cVar.c();
            }
        })).f())).d());
    }

    boolean k() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.f28504a.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public s2.g u(final r2.o oVar, int i10) {
        s2.g gVarA;
        s2.m mVarA = this.f28505b.a(oVar.b());
        long jMax = 0;
        s2.g gVarE = s2.g.e(0L);
        while (true) {
            final long j10 = jMax;
            while (((Boolean) this.f28509f.a(new b.a() { // from class: y2.l
                @Override // a3.b.a
                public final Object a() {
                    return this.f28492a.l(oVar);
                }
            })).booleanValue()) {
                final Iterable iterable = (Iterable) this.f28509f.a(new b.a() { // from class: y2.m
                    @Override // a3.b.a
                    public final Object a() {
                        return this.f28494a.m(oVar);
                    }
                });
                if (!iterable.iterator().hasNext()) {
                    return gVarE;
                }
                if (mVarA == null) {
                    v2.a.b("Uploader", "Unknown backend for %s, deleting event batch for it...", oVar);
                    gVarA = s2.g.a();
                } else {
                    ArrayList arrayList = new ArrayList();
                    Iterator it = iterable.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((z2.k) it.next()).b());
                    }
                    if (oVar.e()) {
                        arrayList.add(j(mVarA));
                    }
                    gVarA = mVarA.a(s2.f.a().b(arrayList).c(oVar.c()).a());
                }
                gVarE = gVarA;
                if (gVarE.c() == g.a.TRANSIENT_ERROR) {
                    this.f28509f.a(new b.a() { // from class: y2.j
                        @Override // a3.b.a
                        public final Object a() {
                            return this.f28486a.n(iterable, oVar, j10);
                        }
                    });
                    this.f28507d.a(oVar, i10 + 1, true);
                    return gVarE;
                }
                this.f28509f.a(new b.a() { // from class: y2.i
                    @Override // a3.b.a
                    public final Object a() {
                        return this.f28484a.o(iterable);
                    }
                });
                if (gVarE.c() == g.a.OK) {
                    jMax = Math.max(j10, gVarE.b());
                    if (oVar.e()) {
                        this.f28509f.a(new b.a() { // from class: y2.g
                            @Override // a3.b.a
                            public final Object a() {
                                return this.f28479a.p();
                            }
                        });
                    }
                } else if (gVarE.c() == g.a.INVALID_PAYLOAD) {
                    final HashMap map = new HashMap();
                    Iterator it2 = iterable.iterator();
                    while (it2.hasNext()) {
                        String strJ = ((z2.k) it2.next()).b().j();
                        map.put(strJ, !map.containsKey(strJ) ? 1 : Integer.valueOf(((Integer) map.get(strJ)).intValue() + 1));
                    }
                    this.f28509f.a(new b.a() { // from class: y2.k
                        @Override // a3.b.a
                        public final Object a() {
                            return this.f28490a.q(map);
                        }
                    });
                }
            }
            this.f28509f.a(new b.a() { // from class: y2.o
                @Override // a3.b.a
                public final Object a() {
                    return this.f28499a.r(oVar, j10);
                }
            });
            return gVarE;
        }
    }

    public void v(final r2.o oVar, final int i10, final Runnable runnable) {
        this.f28508e.execute(new Runnable() { // from class: y2.h
            @Override // java.lang.Runnable
            public final void run() {
                this.f28480m.t(oVar, i10, runnable);
            }
        });
    }
}
