package com.google.android.gms.internal.ads;

import android.net.Uri;

/* loaded from: classes.dex */
public final class g01 {
    private static final String A;
    private static final String B;
    private static final String C;
    private static final String D;
    public static final xa4 E;

    /* renamed from: o, reason: collision with root package name */
    public static final Object f8518o = new Object();

    /* renamed from: p, reason: collision with root package name */
    private static final Object f8519p = new Object();

    /* renamed from: q, reason: collision with root package name */
    private static final v30 f8520q;

    /* renamed from: r, reason: collision with root package name */
    private static final String f8521r;

    /* renamed from: s, reason: collision with root package name */
    private static final String f8522s;

    /* renamed from: t, reason: collision with root package name */
    private static final String f8523t;

    /* renamed from: u, reason: collision with root package name */
    private static final String f8524u;

    /* renamed from: v, reason: collision with root package name */
    private static final String f8525v;

    /* renamed from: w, reason: collision with root package name */
    private static final String f8526w;

    /* renamed from: x, reason: collision with root package name */
    private static final String f8527x;

    /* renamed from: y, reason: collision with root package name */
    private static final String f8528y;

    /* renamed from: z, reason: collision with root package name */
    private static final String f8529z;

    /* renamed from: a, reason: collision with root package name */
    public Object f8530a = f8518o;

    /* renamed from: b, reason: collision with root package name */
    public v30 f8531b = f8520q;

    /* renamed from: c, reason: collision with root package name */
    public long f8532c;

    /* renamed from: d, reason: collision with root package name */
    public long f8533d;

    /* renamed from: e, reason: collision with root package name */
    public long f8534e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f8535f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f8536g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f8537h;

    /* renamed from: i, reason: collision with root package name */
    public fu f8538i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f8539j;

    /* renamed from: k, reason: collision with root package name */
    public long f8540k;

    /* renamed from: l, reason: collision with root package name */
    public long f8541l;

    /* renamed from: m, reason: collision with root package name */
    public int f8542m;

    /* renamed from: n, reason: collision with root package name */
    public int f8543n;

    static {
        rg rgVar = new rg();
        rgVar.a("androidx.media3.common.Timeline");
        rgVar.b(Uri.EMPTY);
        f8520q = rgVar.c();
        f8521r = Integer.toString(1, 36);
        f8522s = Integer.toString(2, 36);
        f8523t = Integer.toString(3, 36);
        f8524u = Integer.toString(4, 36);
        f8525v = Integer.toString(5, 36);
        f8526w = Integer.toString(6, 36);
        f8527x = Integer.toString(7, 36);
        f8528y = Integer.toString(8, 36);
        f8529z = Integer.toString(9, 36);
        A = Integer.toString(10, 36);
        B = Integer.toString(11, 36);
        C = Integer.toString(12, 36);
        D = Integer.toString(13, 36);
        E = new xa4() { // from class: com.google.android.gms.internal.ads.fz0
        };
    }

    public final g01 a(Object obj, v30 v30Var, Object obj2, long j10, long j11, long j12, boolean z10, boolean z11, fu fuVar, long j13, long j14, int i10, int i11, long j15) {
        this.f8530a = obj;
        this.f8531b = v30Var == null ? f8520q : v30Var;
        this.f8532c = -9223372036854775807L;
        this.f8533d = -9223372036854775807L;
        this.f8534e = -9223372036854775807L;
        this.f8535f = z10;
        this.f8536g = z11;
        this.f8537h = fuVar != null;
        this.f8538i = fuVar;
        this.f8540k = 0L;
        this.f8541l = j14;
        this.f8542m = 0;
        this.f8543n = 0;
        this.f8539j = false;
        return this;
    }

    public final boolean b() {
        gt1.f(this.f8537h == (this.f8538i != null));
        return this.f8538i != null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && g01.class.equals(obj.getClass())) {
            g01 g01Var = (g01) obj;
            if (sv2.b(this.f8530a, g01Var.f8530a) && sv2.b(this.f8531b, g01Var.f8531b) && sv2.b(null, null) && sv2.b(this.f8538i, g01Var.f8538i) && this.f8532c == g01Var.f8532c && this.f8533d == g01Var.f8533d && this.f8534e == g01Var.f8534e && this.f8535f == g01Var.f8535f && this.f8536g == g01Var.f8536g && this.f8539j == g01Var.f8539j && this.f8541l == g01Var.f8541l && this.f8542m == g01Var.f8542m && this.f8543n == g01Var.f8543n) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((this.f8530a.hashCode() + 217) * 31) + this.f8531b.hashCode();
        fu fuVar = this.f8538i;
        int iHashCode2 = ((iHashCode * 961) + (fuVar == null ? 0 : fuVar.hashCode())) * 31;
        long j10 = this.f8532c;
        int i10 = (iHashCode2 + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        long j11 = this.f8533d;
        int i11 = (i10 + ((int) (j11 ^ (j11 >>> 32)))) * 31;
        long j12 = this.f8534e;
        int i12 = ((((((i11 + ((int) (j12 ^ (j12 >>> 32)))) * 31) + (this.f8535f ? 1 : 0)) * 31) + (this.f8536g ? 1 : 0)) * 31) + (this.f8539j ? 1 : 0);
        long j13 = this.f8541l;
        return ((((((i12 * 961) + ((int) (j13 ^ (j13 >>> 32)))) * 31) + this.f8542m) * 31) + this.f8543n) * 31;
    }
}
