package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class ch4 extends hj4 {

    /* renamed from: l, reason: collision with root package name */
    private final boolean f6923l;

    /* renamed from: m, reason: collision with root package name */
    private final g01 f6924m;

    /* renamed from: n, reason: collision with root package name */
    private final ey0 f6925n;

    /* renamed from: o, reason: collision with root package name */
    private zg4 f6926o;

    /* renamed from: p, reason: collision with root package name */
    private yg4 f6927p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f6928q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f6929r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f6930s;

    public ch4(jh4 jh4Var, boolean z10) {
        boolean z11;
        super(jh4Var);
        if (z10) {
            jh4Var.u();
            z11 = true;
        } else {
            z11 = false;
        }
        this.f6923l = z11;
        this.f6924m = new g01();
        this.f6925n = new ey0();
        jh4Var.g0();
        this.f6926o = zg4.q(jh4Var.L());
    }

    private final Object H(Object obj) {
        return (this.f6926o.f18587h == null || !obj.equals(zg4.f18585i)) ? obj : this.f6926o.f18587h;
    }

    private final void I(long j10) {
        yg4 yg4Var = this.f6927p;
        int iA = this.f6926o.a(yg4Var.f18037m.f10401a);
        if (iA == -1) {
            return;
        }
        zg4 zg4Var = this.f6926o;
        ey0 ey0Var = this.f6925n;
        zg4Var.d(iA, ey0Var, false);
        long j11 = ey0Var.f8042d;
        if (j11 != -9223372036854775807L && j10 >= j11) {
            j10 = Math.max(0L, j11 - 1);
        }
        yg4Var.s(j10);
    }

    @Override // com.google.android.gms.internal.ads.hj4
    protected final hh4 C(hh4 hh4Var) {
        Object obj = hh4Var.f10401a;
        if (this.f6926o.f18587h != null && this.f6926o.f18587h.equals(obj)) {
            obj = zg4.f18585i;
        }
        return hh4Var.c(obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0062  */
    @Override // com.google.android.gms.internal.ads.hj4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void D(com.google.android.gms.internal.ads.h11 r15) {
        /*
            r14 = this;
            boolean r0 = r14.f6929r
            r1 = 0
            if (r0 == 0) goto L1a
            com.google.android.gms.internal.ads.zg4 r0 = r14.f6926o
            com.google.android.gms.internal.ads.zg4 r15 = r0.p(r15)
            r14.f6926o = r15
            com.google.android.gms.internal.ads.yg4 r15 = r14.f6927p
            if (r15 == 0) goto L9b
            long r2 = r15.j()
            r14.I(r2)
            goto L9b
        L1a:
            boolean r0 = r15.o()
            if (r0 == 0) goto L36
            boolean r0 = r14.f6930s
            if (r0 == 0) goto L2b
            com.google.android.gms.internal.ads.zg4 r0 = r14.f6926o
            com.google.android.gms.internal.ads.zg4 r15 = r0.p(r15)
            goto L33
        L2b:
            java.lang.Object r0 = com.google.android.gms.internal.ads.g01.f8518o
            java.lang.Object r2 = com.google.android.gms.internal.ads.zg4.f18585i
            com.google.android.gms.internal.ads.zg4 r15 = com.google.android.gms.internal.ads.zg4.r(r15, r0, r2)
        L33:
            r14.f6926o = r15
            goto L9b
        L36:
            com.google.android.gms.internal.ads.g01 r0 = r14.f6924m
            r2 = 0
            r3 = 0
            r15.e(r2, r0, r3)
            com.google.android.gms.internal.ads.g01 r0 = r14.f6924m
            java.lang.Object r0 = r0.f8530a
            com.google.android.gms.internal.ads.yg4 r5 = r14.f6927p
            if (r5 == 0) goto L62
            long r6 = r5.p()
            com.google.android.gms.internal.ads.zg4 r8 = r14.f6926o
            com.google.android.gms.internal.ads.hh4 r5 = r5.f18037m
            java.lang.Object r5 = r5.f10401a
            com.google.android.gms.internal.ads.ey0 r9 = r14.f6925n
            r8.n(r5, r9)
            com.google.android.gms.internal.ads.zg4 r5 = r14.f6926o
            com.google.android.gms.internal.ads.g01 r8 = r14.f6924m
            r5.e(r2, r8, r3)
            int r2 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r2 == 0) goto L62
            r12 = r6
            goto L63
        L62:
            r12 = r3
        L63:
            com.google.android.gms.internal.ads.g01 r9 = r14.f6924m
            com.google.android.gms.internal.ads.ey0 r10 = r14.f6925n
            r11 = 0
            r8 = r15
            android.util.Pair r2 = r8.l(r9, r10, r11, r12)
            java.lang.Object r3 = r2.first
            java.lang.Object r2 = r2.second
            java.lang.Long r2 = (java.lang.Long) r2
            long r4 = r2.longValue()
            boolean r2 = r14.f6930s
            if (r2 == 0) goto L82
            com.google.android.gms.internal.ads.zg4 r0 = r14.f6926o
            com.google.android.gms.internal.ads.zg4 r15 = r0.p(r15)
            goto L86
        L82:
            com.google.android.gms.internal.ads.zg4 r15 = com.google.android.gms.internal.ads.zg4.r(r15, r0, r3)
        L86:
            r14.f6926o = r15
            com.google.android.gms.internal.ads.yg4 r15 = r14.f6927p
            if (r15 == 0) goto L9b
            r14.I(r4)
            com.google.android.gms.internal.ads.hh4 r15 = r15.f18037m
            java.lang.Object r0 = r15.f10401a
            java.lang.Object r0 = r14.H(r0)
            com.google.android.gms.internal.ads.hh4 r1 = r15.c(r0)
        L9b:
            r15 = 1
            r14.f6930s = r15
            r14.f6929r = r15
            com.google.android.gms.internal.ads.zg4 r15 = r14.f6926o
            r14.t(r15)
            if (r1 == 0) goto Laf
            com.google.android.gms.internal.ads.yg4 r15 = r14.f6927p
            java.util.Objects.requireNonNull(r15)
            r15.r(r1)
        Laf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ch4.D(com.google.android.gms.internal.ads.h11):void");
    }

    @Override // com.google.android.gms.internal.ads.hj4
    public final void E() {
        if (this.f6923l) {
            return;
        }
        this.f6928q = true;
        x(null, this.f9158k);
    }

    public final h11 F() {
        return this.f6926o;
    }

    @Override // com.google.android.gms.internal.ads.jh4
    /* renamed from: G, reason: merged with bridge method [inline-methods] */
    public final yg4 g(hh4 hh4Var, hl4 hl4Var, long j10) {
        yg4 yg4Var = new yg4(hh4Var, hl4Var, j10);
        yg4Var.u(this.f9158k);
        if (this.f6929r) {
            yg4Var.r(hh4Var.c(H(hh4Var.f10401a)));
        } else {
            this.f6927p = yg4Var;
            if (!this.f6928q) {
                this.f6928q = true;
                x(null, this.f9158k);
            }
        }
        return yg4Var;
    }

    @Override // com.google.android.gms.internal.ads.pg4, com.google.android.gms.internal.ads.jh4
    public final void N() {
    }

    @Override // com.google.android.gms.internal.ads.hj4, com.google.android.gms.internal.ads.jh4
    public final void a(fh4 fh4Var) {
        ((yg4) fh4Var).t();
        if (fh4Var == this.f6927p) {
            this.f6927p = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.pg4, com.google.android.gms.internal.ads.ig4
    public final void v() {
        this.f6929r = false;
        this.f6928q = false;
        super.v();
    }
}
