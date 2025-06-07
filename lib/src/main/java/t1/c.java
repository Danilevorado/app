package t1;

import com.bumptech.glide.load.data.d;
import java.io.File;
import java.util.List;
import t1.f;
import x1.m;

/* loaded from: classes.dex */
class c implements f, d.a {

    /* renamed from: m, reason: collision with root package name */
    private final List f27140m;

    /* renamed from: n, reason: collision with root package name */
    private final g f27141n;

    /* renamed from: o, reason: collision with root package name */
    private final f.a f27142o;

    /* renamed from: p, reason: collision with root package name */
    private int f27143p;

    /* renamed from: q, reason: collision with root package name */
    private r1.f f27144q;

    /* renamed from: r, reason: collision with root package name */
    private List f27145r;

    /* renamed from: s, reason: collision with root package name */
    private int f27146s;

    /* renamed from: t, reason: collision with root package name */
    private volatile m.a f27147t;

    /* renamed from: u, reason: collision with root package name */
    private File f27148u;

    c(List list, g gVar, f.a aVar) {
        this.f27143p = -1;
        this.f27140m = list;
        this.f27141n = gVar;
        this.f27142o = aVar;
    }

    c(g gVar, f.a aVar) {
        this(gVar.c(), gVar, aVar);
    }

    private boolean b() {
        return this.f27146s < this.f27145r.size();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001b, code lost:
    
        if (b() == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x001d, code lost:
    
        r0 = r7.f27145r;
        r3 = r7.f27146s;
        r7.f27146s = r3 + 1;
        r7.f27147t = ((x1.m) r0.get(r3)).a(r7.f27148u, r7.f27141n.t(), r7.f27141n.f(), r7.f27141n.k());
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0047, code lost:
    
        if (r7.f27147t == null) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0057, code lost:
    
        if (r7.f27141n.u(r7.f27147t.f28182c.a()) == false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0059, code lost:
    
        r7.f27147t.f28182c.f(r7.f27141n.l(), r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0066, code lost:
    
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006b, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0012, code lost:
    
        r7.f27147t = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0015, code lost:
    
        if (r1 != false) goto L39;
     */
    @Override // t1.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean a() {
        /*
            r7 = this;
            java.lang.String r0 = "DataCacheGenerator.startNext"
            o2.b.a(r0)
        L5:
            java.util.List r0 = r7.f27145r     // Catch: java.lang.Throwable -> Lae
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L6c
            boolean r0 = r7.b()     // Catch: java.lang.Throwable -> Lae
            if (r0 != 0) goto L12
            goto L6c
        L12:
            r0 = 0
            r7.f27147t = r0     // Catch: java.lang.Throwable -> Lae
        L15:
            if (r1 != 0) goto L68
            boolean r0 = r7.b()     // Catch: java.lang.Throwable -> Lae
            if (r0 == 0) goto L68
            java.util.List r0 = r7.f27145r     // Catch: java.lang.Throwable -> Lae
            int r3 = r7.f27146s     // Catch: java.lang.Throwable -> Lae
            int r4 = r3 + 1
            r7.f27146s = r4     // Catch: java.lang.Throwable -> Lae
            java.lang.Object r0 = r0.get(r3)     // Catch: java.lang.Throwable -> Lae
            x1.m r0 = (x1.m) r0     // Catch: java.lang.Throwable -> Lae
            java.io.File r3 = r7.f27148u     // Catch: java.lang.Throwable -> Lae
            t1.g r4 = r7.f27141n     // Catch: java.lang.Throwable -> Lae
            int r4 = r4.t()     // Catch: java.lang.Throwable -> Lae
            t1.g r5 = r7.f27141n     // Catch: java.lang.Throwable -> Lae
            int r5 = r5.f()     // Catch: java.lang.Throwable -> Lae
            t1.g r6 = r7.f27141n     // Catch: java.lang.Throwable -> Lae
            r1.h r6 = r6.k()     // Catch: java.lang.Throwable -> Lae
            x1.m$a r0 = r0.a(r3, r4, r5, r6)     // Catch: java.lang.Throwable -> Lae
            r7.f27147t = r0     // Catch: java.lang.Throwable -> Lae
            x1.m$a r0 = r7.f27147t     // Catch: java.lang.Throwable -> Lae
            if (r0 == 0) goto L15
            t1.g r0 = r7.f27141n     // Catch: java.lang.Throwable -> Lae
            x1.m$a r3 = r7.f27147t     // Catch: java.lang.Throwable -> Lae
            com.bumptech.glide.load.data.d r3 = r3.f28182c     // Catch: java.lang.Throwable -> Lae
            java.lang.Class r3 = r3.a()     // Catch: java.lang.Throwable -> Lae
            boolean r0 = r0.u(r3)     // Catch: java.lang.Throwable -> Lae
            if (r0 == 0) goto L15
            x1.m$a r0 = r7.f27147t     // Catch: java.lang.Throwable -> Lae
            com.bumptech.glide.load.data.d r0 = r0.f28182c     // Catch: java.lang.Throwable -> Lae
            t1.g r1 = r7.f27141n     // Catch: java.lang.Throwable -> Lae
            com.bumptech.glide.g r1 = r1.l()     // Catch: java.lang.Throwable -> Lae
            r0.f(r1, r7)     // Catch: java.lang.Throwable -> Lae
            r1 = r2
            goto L15
        L68:
            o2.b.e()
            return r1
        L6c:
            int r0 = r7.f27143p     // Catch: java.lang.Throwable -> Lae
            int r0 = r0 + r2
            r7.f27143p = r0     // Catch: java.lang.Throwable -> Lae
            java.util.List r2 = r7.f27140m     // Catch: java.lang.Throwable -> Lae
            int r2 = r2.size()     // Catch: java.lang.Throwable -> Lae
            if (r0 < r2) goto L7d
            o2.b.e()
            return r1
        L7d:
            java.util.List r0 = r7.f27140m     // Catch: java.lang.Throwable -> Lae
            int r2 = r7.f27143p     // Catch: java.lang.Throwable -> Lae
            java.lang.Object r0 = r0.get(r2)     // Catch: java.lang.Throwable -> Lae
            r1.f r0 = (r1.f) r0     // Catch: java.lang.Throwable -> Lae
            t1.d r2 = new t1.d     // Catch: java.lang.Throwable -> Lae
            t1.g r3 = r7.f27141n     // Catch: java.lang.Throwable -> Lae
            r1.f r3 = r3.p()     // Catch: java.lang.Throwable -> Lae
            r2.<init>(r0, r3)     // Catch: java.lang.Throwable -> Lae
            t1.g r3 = r7.f27141n     // Catch: java.lang.Throwable -> Lae
            v1.a r3 = r3.d()     // Catch: java.lang.Throwable -> Lae
            java.io.File r2 = r3.b(r2)     // Catch: java.lang.Throwable -> Lae
            r7.f27148u = r2     // Catch: java.lang.Throwable -> Lae
            if (r2 == 0) goto L5
            r7.f27144q = r0     // Catch: java.lang.Throwable -> Lae
            t1.g r0 = r7.f27141n     // Catch: java.lang.Throwable -> Lae
            java.util.List r0 = r0.j(r2)     // Catch: java.lang.Throwable -> Lae
            r7.f27145r = r0     // Catch: java.lang.Throwable -> Lae
            r7.f27146s = r1     // Catch: java.lang.Throwable -> Lae
            goto L5
        Lae:
            r0 = move-exception
            o2.b.e()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: t1.c.a():boolean");
    }

    @Override // com.bumptech.glide.load.data.d.a
    public void c(Exception exc) {
        this.f27142o.g(this.f27144q, exc, this.f27147t.f28182c, r1.a.DATA_DISK_CACHE);
    }

    @Override // t1.f
    public void cancel() {
        m.a aVar = this.f27147t;
        if (aVar != null) {
            aVar.f28182c.cancel();
        }
    }

    @Override // com.bumptech.glide.load.data.d.a
    public void d(Object obj) {
        this.f27142o.d(this.f27144q, obj, this.f27147t.f28182c, r1.a.DATA_DISK_CACHE, this.f27144q);
    }
}
