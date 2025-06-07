package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public class n81 {
    public static final n81 A;
    public static final n81 B;
    private static final String C;
    private static final String D;
    private static final String E;
    private static final String F;
    private static final String G;
    private static final String H;
    private static final String I;
    private static final String J;
    private static final String K;
    private static final String L;
    private static final String M;
    private static final String N;
    private static final String O;
    private static final String P;
    private static final String Q;
    private static final String R;
    private static final String S;
    private static final String T;
    private static final String U;
    private static final String V;
    private static final String W;
    private static final String X;
    private static final String Y;
    private static final String Z;

    /* renamed from: a0, reason: collision with root package name */
    private static final String f12482a0;

    /* renamed from: b0, reason: collision with root package name */
    private static final String f12483b0;

    /* renamed from: c0, reason: collision with root package name */
    public static final xa4 f12484c0;

    /* renamed from: i, reason: collision with root package name */
    public final int f12493i;

    /* renamed from: j, reason: collision with root package name */
    public final int f12494j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f12495k;

    /* renamed from: l, reason: collision with root package name */
    public final c63 f12496l;

    /* renamed from: n, reason: collision with root package name */
    public final c63 f12498n;

    /* renamed from: r, reason: collision with root package name */
    public final c63 f12502r;

    /* renamed from: s, reason: collision with root package name */
    public final c63 f12503s;

    /* renamed from: t, reason: collision with root package name */
    public final int f12504t;

    /* renamed from: y, reason: collision with root package name */
    public final f63 f12509y;

    /* renamed from: z, reason: collision with root package name */
    public final h63 f12510z;

    /* renamed from: a, reason: collision with root package name */
    public final int f12485a = Integer.MAX_VALUE;

    /* renamed from: b, reason: collision with root package name */
    public final int f12486b = Integer.MAX_VALUE;

    /* renamed from: c, reason: collision with root package name */
    public final int f12487c = Integer.MAX_VALUE;

    /* renamed from: d, reason: collision with root package name */
    public final int f12488d = Integer.MAX_VALUE;

    /* renamed from: e, reason: collision with root package name */
    public final int f12489e = 0;

    /* renamed from: f, reason: collision with root package name */
    public final int f12490f = 0;

    /* renamed from: g, reason: collision with root package name */
    public final int f12491g = 0;

    /* renamed from: h, reason: collision with root package name */
    public final int f12492h = 0;

    /* renamed from: m, reason: collision with root package name */
    public final int f12497m = 0;

    /* renamed from: o, reason: collision with root package name */
    public final int f12499o = 0;

    /* renamed from: p, reason: collision with root package name */
    public final int f12500p = Integer.MAX_VALUE;

    /* renamed from: q, reason: collision with root package name */
    public final int f12501q = Integer.MAX_VALUE;

    /* renamed from: u, reason: collision with root package name */
    public final int f12505u = 0;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f12506v = false;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f12507w = false;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f12508x = false;

    static {
        n81 n81Var = new n81(new m71());
        A = n81Var;
        B = n81Var;
        C = Integer.toString(1, 36);
        D = Integer.toString(2, 36);
        E = Integer.toString(3, 36);
        F = Integer.toString(4, 36);
        G = Integer.toString(5, 36);
        H = Integer.toString(6, 36);
        I = Integer.toString(7, 36);
        J = Integer.toString(8, 36);
        K = Integer.toString(9, 36);
        L = Integer.toString(10, 36);
        M = Integer.toString(11, 36);
        N = Integer.toString(12, 36);
        O = Integer.toString(13, 36);
        P = Integer.toString(14, 36);
        Q = Integer.toString(15, 36);
        R = Integer.toString(16, 36);
        S = Integer.toString(17, 36);
        T = Integer.toString(18, 36);
        U = Integer.toString(19, 36);
        V = Integer.toString(20, 36);
        W = Integer.toString(21, 36);
        X = Integer.toString(22, 36);
        Y = Integer.toString(23, 36);
        Z = Integer.toString(24, 36);
        f12482a0 = Integer.toString(25, 36);
        f12483b0 = Integer.toString(26, 36);
        f12484c0 = new xa4() { // from class: com.google.android.gms.internal.ads.l61
        };
    }

    protected n81(m71 m71Var) {
        this.f12493i = m71Var.f11981e;
        this.f12494j = m71Var.f11982f;
        this.f12495k = m71Var.f11983g;
        this.f12496l = m71Var.f11984h;
        this.f12498n = m71Var.f11985i;
        this.f12502r = m71Var.f11988l;
        this.f12503s = m71Var.f11989m;
        this.f12504t = m71Var.f11990n;
        this.f12509y = f63.c(m71Var.f11991o);
        this.f12510z = h63.u(m71Var.f11992p);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            n81 n81Var = (n81) obj;
            if (this.f12495k == n81Var.f12495k && this.f12493i == n81Var.f12493i && this.f12494j == n81Var.f12494j && this.f12496l.equals(n81Var.f12496l) && this.f12498n.equals(n81Var.f12498n) && this.f12502r.equals(n81Var.f12502r) && this.f12503s.equals(n81Var.f12503s) && this.f12504t == n81Var.f12504t && this.f12509y.equals(n81Var.f12509y) && this.f12510z.equals(n81Var.f12510z)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (((((((((((((((((((((((this.f12495k ? 1 : 0) - 1048002209) * 31) + this.f12493i) * 31) + this.f12494j) * 31) + this.f12496l.hashCode()) * 961) + this.f12498n.hashCode()) * 961) + Integer.MAX_VALUE) * 31) + Integer.MAX_VALUE) * 31) + this.f12502r.hashCode()) * 31) + this.f12503s.hashCode()) * 31) + this.f12504t) * 28629151) + this.f12509y.hashCode()) * 31) + this.f12510z.hashCode();
    }
}
