package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class ey0 {

    /* renamed from: h, reason: collision with root package name */
    private static final String f8033h = Integer.toString(0, 36);

    /* renamed from: i, reason: collision with root package name */
    private static final String f8034i = Integer.toString(1, 36);

    /* renamed from: j, reason: collision with root package name */
    private static final String f8035j = Integer.toString(2, 36);

    /* renamed from: k, reason: collision with root package name */
    private static final String f8036k = Integer.toString(3, 36);

    /* renamed from: l, reason: collision with root package name */
    private static final String f8037l = Integer.toString(4, 36);

    /* renamed from: m, reason: collision with root package name */
    public static final xa4 f8038m = new xa4() { // from class: com.google.android.gms.internal.ads.dx0
    };

    /* renamed from: a, reason: collision with root package name */
    public Object f8039a;

    /* renamed from: b, reason: collision with root package name */
    public Object f8040b;

    /* renamed from: c, reason: collision with root package name */
    public int f8041c;

    /* renamed from: d, reason: collision with root package name */
    public long f8042d;

    /* renamed from: e, reason: collision with root package name */
    public long f8043e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f8044f;

    /* renamed from: g, reason: collision with root package name */
    private k61 f8045g = k61.f10845d;

    public final int a(int i10) {
        return this.f8045g.a(i10).f11559b;
    }

    public final int b() {
        int i10 = this.f8045g.f10852a;
        return 0;
    }

    public final int c(long j10) {
        return -1;
    }

    public final int d(long j10) {
        return -1;
    }

    public final int e(int i10) {
        return this.f8045g.a(i10).a(-1);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ey0.class.equals(obj.getClass())) {
            ey0 ey0Var = (ey0) obj;
            if (sv2.b(this.f8039a, ey0Var.f8039a) && sv2.b(this.f8040b, ey0Var.f8040b) && this.f8041c == ey0Var.f8041c && this.f8042d == ey0Var.f8042d && this.f8044f == ey0Var.f8044f && sv2.b(this.f8045g, ey0Var.f8045g)) {
                return true;
            }
        }
        return false;
    }

    public final int f(int i10, int i11) {
        return this.f8045g.a(i10).a(i11);
    }

    public final long g(int i10, int i11) {
        lf0 lf0VarA = this.f8045g.a(i10);
        if (lf0VarA.f11559b != -1) {
            return lf0VarA.f11562e[i11];
        }
        return -9223372036854775807L;
    }

    public final long h(int i10) {
        long j10 = this.f8045g.a(i10).f11558a;
        return 0L;
    }

    public final int hashCode() {
        Object obj = this.f8039a;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.f8040b;
        int iHashCode2 = ((((iHashCode + 217) * 31) + (obj2 != null ? obj2.hashCode() : 0)) * 31) + this.f8041c;
        long j10 = this.f8042d;
        return (((((iHashCode2 * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 961) + (this.f8044f ? 1 : 0)) * 31) + this.f8045g.hashCode();
    }

    public final long i() {
        long j10 = this.f8045g.f10853b;
        return 0L;
    }

    public final long j(int i10) {
        long j10 = this.f8045g.a(i10).f11563f;
        return 0L;
    }

    public final ey0 k(Object obj, Object obj2, int i10, long j10, long j11, k61 k61Var, boolean z10) {
        this.f8039a = obj;
        this.f8040b = obj2;
        this.f8041c = 0;
        this.f8042d = j10;
        this.f8043e = 0L;
        this.f8045g = k61Var;
        this.f8044f = z10;
        return this;
    }

    public final boolean l(int i10) {
        boolean z10 = this.f8045g.a(i10).f11564g;
        return false;
    }
}
