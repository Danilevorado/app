package g1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: u, reason: collision with root package name */
    public static final a f23736u = new a(null);

    /* renamed from: v, reason: collision with root package name */
    private static final String f23737v;

    /* renamed from: w, reason: collision with root package name */
    public static final l.a f23738w;

    /* renamed from: a, reason: collision with root package name */
    public final String f23739a;

    /* renamed from: b, reason: collision with root package name */
    public b1.t f23740b;

    /* renamed from: c, reason: collision with root package name */
    public String f23741c;

    /* renamed from: d, reason: collision with root package name */
    public String f23742d;

    /* renamed from: e, reason: collision with root package name */
    public androidx.work.b f23743e;

    /* renamed from: f, reason: collision with root package name */
    public androidx.work.b f23744f;

    /* renamed from: g, reason: collision with root package name */
    public long f23745g;

    /* renamed from: h, reason: collision with root package name */
    public long f23746h;

    /* renamed from: i, reason: collision with root package name */
    public long f23747i;

    /* renamed from: j, reason: collision with root package name */
    public b1.b f23748j;

    /* renamed from: k, reason: collision with root package name */
    public int f23749k;

    /* renamed from: l, reason: collision with root package name */
    public b1.a f23750l;

    /* renamed from: m, reason: collision with root package name */
    public long f23751m;

    /* renamed from: n, reason: collision with root package name */
    public long f23752n;

    /* renamed from: o, reason: collision with root package name */
    public long f23753o;

    /* renamed from: p, reason: collision with root package name */
    public long f23754p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f23755q;

    /* renamed from: r, reason: collision with root package name */
    public b1.n f23756r;

    /* renamed from: s, reason: collision with root package name */
    private int f23757s;

    /* renamed from: t, reason: collision with root package name */
    private final int f23758t;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(rb.f fVar) {
            this();
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public String f23759a;

        /* renamed from: b, reason: collision with root package name */
        public b1.t f23760b;

        public b(String str, b1.t tVar) {
            rb.h.e(str, "id");
            rb.h.e(tVar, "state");
            this.f23759a = str;
            this.f23760b = tVar;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return rb.h.a(this.f23759a, bVar.f23759a) && this.f23760b == bVar.f23760b;
        }

        public int hashCode() {
            return (this.f23759a.hashCode() * 31) + this.f23760b.hashCode();
        }

        public String toString() {
            return "IdAndState(id=" + this.f23759a + ", state=" + this.f23760b + ')';
        }
    }

    static {
        String strI = b1.j.i("WorkSpec");
        rb.h.d(strI, "tagWithPrefix(\"WorkSpec\")");
        f23737v = strI;
        f23738w = new l.a() { // from class: g1.u
            @Override // l.a
            public final Object a(Object obj) {
                return v.b((List) obj);
            }
        };
    }

    public v(String str, b1.t tVar, String str2, String str3, androidx.work.b bVar, androidx.work.b bVar2, long j10, long j11, long j12, b1.b bVar3, int i10, b1.a aVar, long j13, long j14, long j15, long j16, boolean z10, b1.n nVar, int i11, int i12) {
        rb.h.e(str, "id");
        rb.h.e(tVar, "state");
        rb.h.e(str2, "workerClassName");
        rb.h.e(bVar, "input");
        rb.h.e(bVar2, "output");
        rb.h.e(bVar3, "constraints");
        rb.h.e(aVar, "backoffPolicy");
        rb.h.e(nVar, "outOfQuotaPolicy");
        this.f23739a = str;
        this.f23740b = tVar;
        this.f23741c = str2;
        this.f23742d = str3;
        this.f23743e = bVar;
        this.f23744f = bVar2;
        this.f23745g = j10;
        this.f23746h = j11;
        this.f23747i = j12;
        this.f23748j = bVar3;
        this.f23749k = i10;
        this.f23750l = aVar;
        this.f23751m = j13;
        this.f23752n = j14;
        this.f23753o = j15;
        this.f23754p = j16;
        this.f23755q = z10;
        this.f23756r = nVar;
        this.f23757s = i11;
        this.f23758t = i12;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ v(String str, b1.t tVar, String str2, String str3, androidx.work.b bVar, androidx.work.b bVar2, long j10, long j11, long j12, b1.b bVar3, int i10, b1.a aVar, long j13, long j14, long j15, long j16, boolean z10, b1.n nVar, int i11, int i12, int i13, rb.f fVar) {
        androidx.work.b bVar4;
        androidx.work.b bVar5;
        b1.t tVar2 = (i13 & 2) != 0 ? b1.t.ENQUEUED : tVar;
        String str4 = (i13 & 8) != 0 ? null : str3;
        if ((i13 & 16) != 0) {
            androidx.work.b bVar6 = androidx.work.b.f4046c;
            rb.h.d(bVar6, "EMPTY");
            bVar4 = bVar6;
        } else {
            bVar4 = bVar;
        }
        if ((i13 & 32) != 0) {
            androidx.work.b bVar7 = androidx.work.b.f4046c;
            rb.h.d(bVar7, "EMPTY");
            bVar5 = bVar7;
        } else {
            bVar5 = bVar2;
        }
        this(str, tVar2, str2, str4, bVar4, bVar5, (i13 & 64) != 0 ? 0L : j10, (i13 & 128) != 0 ? 0L : j11, (i13 & 256) != 0 ? 0L : j12, (i13 & 512) != 0 ? b1.b.f4323j : bVar3, (i13 & 1024) != 0 ? 0 : i10, (i13 & 2048) != 0 ? b1.a.EXPONENTIAL : aVar, (i13 & 4096) != 0 ? 30000L : j13, (i13 & 8192) != 0 ? 0L : j14, (i13 & 16384) != 0 ? 0L : j15, (32768 & i13) != 0 ? -1L : j16, (65536 & i13) != 0 ? false : z10, (131072 & i13) != 0 ? b1.n.RUN_AS_NON_EXPEDITED_WORK_REQUEST : nVar, (262144 & i13) != 0 ? 0 : i11, (i13 & 524288) != 0 ? 0 : i12);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public v(String str, v vVar) {
        this(str, vVar.f23740b, vVar.f23741c, vVar.f23742d, new androidx.work.b(vVar.f23743e), new androidx.work.b(vVar.f23744f), vVar.f23745g, vVar.f23746h, vVar.f23747i, new b1.b(vVar.f23748j), vVar.f23749k, vVar.f23750l, vVar.f23751m, vVar.f23752n, vVar.f23753o, vVar.f23754p, vVar.f23755q, vVar.f23756r, vVar.f23757s, 0, 524288, null);
        rb.h.e(str, "newId");
        rb.h.e(vVar, "other");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public v(String str, String str2) {
        this(str, null, str2, null, null, null, 0L, 0L, 0L, null, 0, null, 0L, 0L, 0L, 0L, false, null, 0, 0, 1048570, null);
        rb.h.e(str, "id");
        rb.h.e(str2, "workerClassName_");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List b(List list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(ib.k.h(list, 10));
        Iterator it = list.iterator();
        if (!it.hasNext()) {
            return arrayList;
        }
        a5.a.a(it.next());
        throw null;
    }

    public final long c() {
        if (i()) {
            return this.f23752n + ub.f.c(this.f23750l == b1.a.LINEAR ? this.f23751m * this.f23749k : (long) Math.scalb(this.f23751m, this.f23749k - 1), 18000000L);
        }
        if (!j()) {
            long jCurrentTimeMillis = this.f23752n;
            if (jCurrentTimeMillis == 0) {
                jCurrentTimeMillis = System.currentTimeMillis();
            }
            return this.f23745g + jCurrentTimeMillis;
        }
        int i10 = this.f23757s;
        long j10 = this.f23752n;
        if (i10 == 0) {
            j10 += this.f23745g;
        }
        long j11 = this.f23747i;
        long j12 = this.f23746h;
        if (j11 != j12) {
            j = i10 == 0 ? (-1) * j11 : 0L;
            j10 += j12;
        } else if (i10 != 0) {
            j = j12;
        }
        return j10 + j;
    }

    public final v d(String str, b1.t tVar, String str2, String str3, androidx.work.b bVar, androidx.work.b bVar2, long j10, long j11, long j12, b1.b bVar3, int i10, b1.a aVar, long j13, long j14, long j15, long j16, boolean z10, b1.n nVar, int i11, int i12) {
        rb.h.e(str, "id");
        rb.h.e(tVar, "state");
        rb.h.e(str2, "workerClassName");
        rb.h.e(bVar, "input");
        rb.h.e(bVar2, "output");
        rb.h.e(bVar3, "constraints");
        rb.h.e(aVar, "backoffPolicy");
        rb.h.e(nVar, "outOfQuotaPolicy");
        return new v(str, tVar, str2, str3, bVar, bVar2, j10, j11, j12, bVar3, i10, aVar, j13, j14, j15, j16, z10, nVar, i11, i12);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return rb.h.a(this.f23739a, vVar.f23739a) && this.f23740b == vVar.f23740b && rb.h.a(this.f23741c, vVar.f23741c) && rb.h.a(this.f23742d, vVar.f23742d) && rb.h.a(this.f23743e, vVar.f23743e) && rb.h.a(this.f23744f, vVar.f23744f) && this.f23745g == vVar.f23745g && this.f23746h == vVar.f23746h && this.f23747i == vVar.f23747i && rb.h.a(this.f23748j, vVar.f23748j) && this.f23749k == vVar.f23749k && this.f23750l == vVar.f23750l && this.f23751m == vVar.f23751m && this.f23752n == vVar.f23752n && this.f23753o == vVar.f23753o && this.f23754p == vVar.f23754p && this.f23755q == vVar.f23755q && this.f23756r == vVar.f23756r && this.f23757s == vVar.f23757s && this.f23758t == vVar.f23758t;
    }

    public final int f() {
        return this.f23758t;
    }

    public final int g() {
        return this.f23757s;
    }

    public final boolean h() {
        return !rb.h.a(b1.b.f4323j, this.f23748j);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int iHashCode = ((((this.f23739a.hashCode() * 31) + this.f23740b.hashCode()) * 31) + this.f23741c.hashCode()) * 31;
        String str = this.f23742d;
        int iHashCode2 = (((((((((((((((((((((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f23743e.hashCode()) * 31) + this.f23744f.hashCode()) * 31) + t.a(this.f23745g)) * 31) + t.a(this.f23746h)) * 31) + t.a(this.f23747i)) * 31) + this.f23748j.hashCode()) * 31) + this.f23749k) * 31) + this.f23750l.hashCode()) * 31) + t.a(this.f23751m)) * 31) + t.a(this.f23752n)) * 31) + t.a(this.f23753o)) * 31) + t.a(this.f23754p)) * 31;
        boolean z10 = this.f23755q;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        return ((((((iHashCode2 + i10) * 31) + this.f23756r.hashCode()) * 31) + this.f23757s) * 31) + this.f23758t;
    }

    public final boolean i() {
        return this.f23740b == b1.t.ENQUEUED && this.f23749k > 0;
    }

    public final boolean j() {
        return this.f23746h != 0;
    }

    public final void k(long j10) {
        if (j10 > 18000000) {
            b1.j.e().k(f23737v, "Backoff delay duration exceeds maximum value");
        }
        if (j10 < 10000) {
            b1.j.e().k(f23737v, "Backoff delay duration less than minimum value");
        }
        this.f23751m = ub.f.d(j10, 10000L, 18000000L);
    }

    public String toString() {
        return "{WorkSpec: " + this.f23739a + '}';
    }
}
