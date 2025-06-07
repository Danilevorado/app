package hb;

/* loaded from: classes2.dex */
public final class d implements Comparable {

    /* renamed from: q, reason: collision with root package name */
    public static final a f24162q = new a(null);

    /* renamed from: r, reason: collision with root package name */
    public static final d f24163r = e.a();

    /* renamed from: m, reason: collision with root package name */
    private final int f24164m;

    /* renamed from: n, reason: collision with root package name */
    private final int f24165n;

    /* renamed from: o, reason: collision with root package name */
    private final int f24166o;

    /* renamed from: p, reason: collision with root package name */
    private final int f24167p;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(rb.f fVar) {
            this();
        }
    }

    public d(int i10, int i11, int i12) {
        this.f24164m = i10;
        this.f24165n = i11;
        this.f24166o = i12;
        this.f24167p = d(i10, i11, i12);
    }

    private final int d(int i10, int i11, int i12) {
        boolean z10 = false;
        if (new ub.c(0, 255).k(i10) && new ub.c(0, 255).k(i11) && new ub.c(0, 255).k(i12)) {
            z10 = true;
        }
        if (z10) {
            return (i10 << 16) + (i11 << 8) + i12;
        }
        throw new IllegalArgumentException(("Version components are out of range: " + i10 + '.' + i11 + '.' + i12).toString());
    }

    @Override // java.lang.Comparable
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public int compareTo(d dVar) {
        rb.h.e(dVar, "other");
        return this.f24167p - dVar.f24167p;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        d dVar = obj instanceof d ? (d) obj : null;
        return dVar != null && this.f24167p == dVar.f24167p;
    }

    public int hashCode() {
        return this.f24167p;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f24164m);
        sb2.append('.');
        sb2.append(this.f24165n);
        sb2.append('.');
        sb2.append(this.f24166o);
        return sb2.toString();
    }
}
