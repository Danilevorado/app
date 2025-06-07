package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class x74 {

    /* renamed from: a, reason: collision with root package name */
    public final fh4 f17452a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f17453b;

    /* renamed from: c, reason: collision with root package name */
    public final xi4[] f17454c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f17455d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f17456e;

    /* renamed from: f, reason: collision with root package name */
    public y74 f17457f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f17458g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean[] f17459h;

    /* renamed from: i, reason: collision with root package name */
    private final u84[] f17460i;

    /* renamed from: j, reason: collision with root package name */
    private final xk4 f17461j;

    /* renamed from: k, reason: collision with root package name */
    private final m84 f17462k;

    /* renamed from: l, reason: collision with root package name */
    private x74 f17463l;

    /* renamed from: m, reason: collision with root package name */
    private fj4 f17464m;

    /* renamed from: n, reason: collision with root package name */
    private yk4 f17465n;

    /* renamed from: o, reason: collision with root package name */
    private long f17466o;

    public x74(u84[] u84VarArr, long j10, xk4 xk4Var, hl4 hl4Var, m84 m84Var, y74 y74Var, yk4 yk4Var) {
        this.f17460i = u84VarArr;
        this.f17466o = j10;
        this.f17461j = xk4Var;
        this.f17462k = m84Var;
        hh4 hh4Var = y74Var.f17921a;
        this.f17453b = hh4Var.f10401a;
        this.f17457f = y74Var;
        this.f17464m = fj4.f8300d;
        this.f17465n = yk4Var;
        this.f17454c = new xi4[2];
        this.f17459h = new boolean[2];
        long j11 = y74Var.f17922b;
        long j12 = y74Var.f17924d;
        fh4 fh4VarN = m84Var.n(hh4Var, hl4Var, j11);
        this.f17452a = j12 != -9223372036854775807L ? new lg4(fh4VarN, true, 0L, j12) : fh4VarN;
    }

    private final void s() {
        if (!u()) {
            return;
        }
        int i10 = 0;
        while (true) {
            yk4 yk4Var = this.f17465n;
            if (i10 >= yk4Var.f18085a) {
                return;
            }
            yk4Var.b(i10);
            rk4 rk4Var = this.f17465n.f18087c[i10];
            i10++;
        }
    }

    private final void t() {
        if (!u()) {
            return;
        }
        int i10 = 0;
        while (true) {
            yk4 yk4Var = this.f17465n;
            if (i10 >= yk4Var.f18085a) {
                return;
            }
            yk4Var.b(i10);
            rk4 rk4Var = this.f17465n.f18087c[i10];
            i10++;
        }
    }

    private final boolean u() {
        return this.f17463l == null;
    }

    public final long a(yk4 yk4Var, long j10, boolean z10) {
        return b(yk4Var, j10, false, new boolean[2]);
    }

    public final long b(yk4 yk4Var, long j10, boolean z10, boolean[] zArr) {
        int i10 = 0;
        while (true) {
            boolean z11 = true;
            if (i10 >= yk4Var.f18085a) {
                break;
            }
            boolean[] zArr2 = this.f17459h;
            if (z10 || !yk4Var.a(this.f17465n, i10)) {
                z11 = false;
            }
            zArr2[i10] = z11;
            i10++;
        }
        int i11 = 0;
        while (true) {
            u84[] u84VarArr = this.f17460i;
            if (i11 >= 2) {
                break;
            }
            u84VarArr[i11].b();
            i11++;
        }
        s();
        this.f17465n = yk4Var;
        t();
        long jQ = this.f17452a.q(yk4Var.f18087c, this.f17459h, this.f17454c, zArr, j10);
        int i12 = 0;
        while (true) {
            u84[] u84VarArr2 = this.f17460i;
            if (i12 >= 2) {
                break;
            }
            u84VarArr2[i12].b();
            i12++;
        }
        this.f17456e = false;
        int i13 = 0;
        while (true) {
            xi4[] xi4VarArr = this.f17454c;
            if (i13 >= 2) {
                return jQ;
            }
            if (xi4VarArr[i13] != null) {
                gt1.f(yk4Var.b(i13));
                this.f17460i[i13].b();
                this.f17456e = true;
            } else {
                gt1.f(yk4Var.f18087c[i13] == null);
            }
            i13++;
        }
    }

    public final long c() {
        if (!this.f17455d) {
            return this.f17457f.f17922b;
        }
        long jB = this.f17456e ? this.f17452a.b() : Long.MIN_VALUE;
        return jB == Long.MIN_VALUE ? this.f17457f.f17925e : jB;
    }

    public final long d() {
        if (this.f17455d) {
            return this.f17452a.d();
        }
        return 0L;
    }

    public final long e() {
        return this.f17466o;
    }

    public final long f() {
        return this.f17457f.f17922b + this.f17466o;
    }

    public final x74 g() {
        return this.f17463l;
    }

    public final fj4 h() {
        return this.f17464m;
    }

    public final yk4 i() {
        return this.f17465n;
    }

    public final yk4 j(float f5, h11 h11Var) {
        yk4 yk4VarD = this.f17461j.d(this.f17460i, this.f17464m, this.f17457f.f17921a, h11Var);
        for (rk4 rk4Var : yk4VarD.f18087c) {
        }
        return yk4VarD;
    }

    public final void k(long j10) {
        gt1.f(u());
        this.f17452a.c(j10 - this.f17466o);
    }

    public final void l(float f5, h11 h11Var) {
        this.f17455d = true;
        this.f17464m = this.f17452a.g();
        yk4 yk4VarJ = j(f5, h11Var);
        y74 y74Var = this.f17457f;
        long jMax = y74Var.f17922b;
        long j10 = y74Var.f17925e;
        if (j10 != -9223372036854775807L && jMax >= j10) {
            jMax = Math.max(0L, j10 - 1);
        }
        long jA = a(yk4VarJ, jMax, false);
        long j11 = this.f17466o;
        y74 y74Var2 = this.f17457f;
        this.f17466o = j11 + (y74Var2.f17922b - jA);
        this.f17457f = y74Var2.b(jA);
    }

    public final void m(long j10) {
        gt1.f(u());
        if (this.f17455d) {
            this.f17452a.a(j10 - this.f17466o);
        }
    }

    public final void n() {
        s();
        m84 m84Var = this.f17462k;
        fh4 fh4Var = this.f17452a;
        try {
            if (fh4Var instanceof lg4) {
                m84Var.h(((lg4) fh4Var).f11576m);
            } else {
                m84Var.h(fh4Var);
            }
        } catch (RuntimeException e5) {
            ad2.c("MediaPeriodHolder", "Period release failed.", e5);
        }
    }

    public final void o(x74 x74Var) {
        if (x74Var == this.f17463l) {
            return;
        }
        s();
        this.f17463l = x74Var;
        t();
    }

    public final void p(long j10) {
        this.f17466o = 1000000000000L;
    }

    public final void q() {
        fh4 fh4Var = this.f17452a;
        if (fh4Var instanceof lg4) {
            long j10 = this.f17457f.f17924d;
            if (j10 == -9223372036854775807L) {
                j10 = Long.MIN_VALUE;
            }
            ((lg4) fh4Var).j(0L, j10);
        }
    }

    public final boolean r() {
        return this.f17455d && (!this.f17456e || this.f17452a.b() == Long.MIN_VALUE);
    }
}
