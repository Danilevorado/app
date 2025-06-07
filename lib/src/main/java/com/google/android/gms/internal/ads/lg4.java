package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes.dex */
public final class lg4 implements fh4, eh4 {

    /* renamed from: m, reason: collision with root package name */
    public final fh4 f11576m;

    /* renamed from: n, reason: collision with root package name */
    private eh4 f11577n;

    /* renamed from: o, reason: collision with root package name */
    private kg4[] f11578o = new kg4[0];

    /* renamed from: p, reason: collision with root package name */
    private long f11579p = 0;

    /* renamed from: q, reason: collision with root package name */
    long f11580q;

    public lg4(fh4 fh4Var, boolean z10, long j10, long j11) {
        this.f11576m = fh4Var;
        this.f11580q = j11;
    }

    @Override // com.google.android.gms.internal.ads.fh4, com.google.android.gms.internal.ads.zi4
    public final void a(long j10) {
        this.f11576m.a(j10);
    }

    @Override // com.google.android.gms.internal.ads.fh4, com.google.android.gms.internal.ads.zi4
    public final long b() {
        long jB = this.f11576m.b();
        if (jB != Long.MIN_VALUE) {
            long j10 = this.f11580q;
            if (j10 == Long.MIN_VALUE || jB < j10) {
                return jB;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // com.google.android.gms.internal.ads.fh4, com.google.android.gms.internal.ads.zi4
    public final boolean c(long j10) {
        return this.f11576m.c(j10);
    }

    @Override // com.google.android.gms.internal.ads.fh4, com.google.android.gms.internal.ads.zi4
    public final long d() {
        long jD = this.f11576m.d();
        if (jD != Long.MIN_VALUE) {
            long j10 = this.f11580q;
            if (j10 == Long.MIN_VALUE || jD < j10) {
                return jD;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // com.google.android.gms.internal.ads.fh4
    public final void e(eh4 eh4Var, long j10) {
        this.f11577n = eh4Var;
        this.f11576m.e(this, j10);
    }

    @Override // com.google.android.gms.internal.ads.fh4
    public final long f() {
        if (p()) {
            long j10 = this.f11579p;
            this.f11579p = -9223372036854775807L;
            long jF = f();
            return jF != -9223372036854775807L ? jF : j10;
        }
        long jF2 = this.f11576m.f();
        if (jF2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        gt1.f(jF2 >= 0);
        long j11 = this.f11580q;
        gt1.f(j11 == Long.MIN_VALUE || jF2 <= j11);
        return jF2;
    }

    @Override // com.google.android.gms.internal.ads.fh4
    public final fj4 g() {
        return this.f11576m.g();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0035  */
    @Override // com.google.android.gms.internal.ads.fh4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long h(long r8) {
        /*
            r7 = this;
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7.f11579p = r0
            com.google.android.gms.internal.ads.kg4[] r0 = r7.f11578o
            int r1 = r0.length
            r2 = 0
            r3 = r2
        Lc:
            if (r3 >= r1) goto L18
            r4 = r0[r3]
            if (r4 == 0) goto L15
            r4.d()
        L15:
            int r3 = r3 + 1
            goto Lc
        L18:
            com.google.android.gms.internal.ads.fh4 r0 = r7.f11576m
            long r0 = r0.h(r8)
            int r8 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            r9 = 1
            if (r8 == 0) goto L35
            r3 = 0
            int r8 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r8 < 0) goto L36
            long r3 = r7.f11580q
            r5 = -9223372036854775808
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r8 == 0) goto L35
            int r8 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r8 > 0) goto L36
        L35:
            r2 = r9
        L36:
            com.google.android.gms.internal.ads.gt1.f(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.lg4.h(long):long");
    }

    @Override // com.google.android.gms.internal.ads.eh4
    public final void i(fh4 fh4Var) {
        eh4 eh4Var = this.f11577n;
        Objects.requireNonNull(eh4Var);
        eh4Var.i(this);
    }

    public final void j(long j10, long j11) {
        this.f11580q = j11;
    }

    @Override // com.google.android.gms.internal.ads.fh4
    public final void k() {
        this.f11576m.k();
    }

    @Override // com.google.android.gms.internal.ads.yi4
    public final /* bridge */ /* synthetic */ void l(zi4 zi4Var) {
        eh4 eh4Var = this.f11577n;
        Objects.requireNonNull(eh4Var);
        eh4Var.l(this);
    }

    @Override // com.google.android.gms.internal.ads.fh4
    public final void m(long j10, boolean z10) {
        this.f11576m.m(j10, false);
    }

    @Override // com.google.android.gms.internal.ads.fh4
    public final long n(long j10, x84 x84Var) {
        if (j10 == 0) {
            return 0L;
        }
        long jMax = Math.max(0L, Math.min(x84Var.f17479a, j10));
        long j11 = x84Var.f17480b;
        long j12 = this.f11580q;
        long jMax2 = Math.max(0L, Math.min(j11, j12 == Long.MIN_VALUE ? Long.MAX_VALUE : j12 - j10));
        if (jMax != x84Var.f17479a || jMax2 != x84Var.f17480b) {
            x84Var = new x84(jMax, jMax2);
        }
        return this.f11576m.n(j10, x84Var);
    }

    @Override // com.google.android.gms.internal.ads.fh4, com.google.android.gms.internal.ads.zi4
    public final boolean o() {
        return this.f11576m.o();
    }

    final boolean p() {
        return this.f11579p != -9223372036854775807L;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x005c  */
    @Override // com.google.android.gms.internal.ads.fh4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long q(com.google.android.gms.internal.ads.rk4[] r15, boolean[] r16, com.google.android.gms.internal.ads.xi4[] r17, boolean[] r18, long r19) {
        /*
            r14 = this;
            r0 = r14
            r1 = r17
            int r2 = r1.length
            com.google.android.gms.internal.ads.kg4[] r3 = new com.google.android.gms.internal.ads.kg4[r2]
            r0.f11578o = r3
            com.google.android.gms.internal.ads.xi4[] r2 = new com.google.android.gms.internal.ads.xi4[r2]
            r3 = 0
            r4 = r3
        Lc:
            int r5 = r1.length
            r11 = 0
            if (r4 >= r5) goto L21
            com.google.android.gms.internal.ads.kg4[] r5 = r0.f11578o
            r6 = r1[r4]
            com.google.android.gms.internal.ads.kg4 r6 = (com.google.android.gms.internal.ads.kg4) r6
            r5[r4] = r6
            if (r6 == 0) goto L1c
            com.google.android.gms.internal.ads.xi4 r11 = r6.f11039a
        L1c:
            r2[r4] = r11
            int r4 = r4 + 1
            goto Lc
        L21:
            com.google.android.gms.internal.ads.fh4 r4 = r0.f11576m
            r5 = r15
            r6 = r16
            r7 = r2
            r8 = r18
            r9 = r19
            long r4 = r4.q(r5, r6, r7, r8, r9)
            boolean r6 = r14.p()
            r7 = 0
            if (r6 == 0) goto L3d
            int r6 = (r19 > r7 ? 1 : (r19 == r7 ? 0 : -1))
            if (r6 != 0) goto L3d
            r9 = r7
            goto L3f
        L3d:
            r9 = r19
        L3f:
            r12 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r0.f11579p = r12
            int r6 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            r9 = 1
            if (r6 == 0) goto L5d
            int r6 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r6 < 0) goto L5c
            long r6 = r0.f11580q
            r12 = -9223372036854775808
            int r8 = (r6 > r12 ? 1 : (r6 == r12 ? 0 : -1))
            if (r8 == 0) goto L5d
            int r6 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r6 > 0) goto L5c
            goto L5d
        L5c:
            r9 = r3
        L5d:
            com.google.android.gms.internal.ads.gt1.f(r9)
        L60:
            int r6 = r1.length
            if (r3 >= r6) goto L86
            r6 = r2[r3]
            if (r6 != 0) goto L6c
            com.google.android.gms.internal.ads.kg4[] r6 = r0.f11578o
            r6[r3] = r11
            goto L7d
        L6c:
            com.google.android.gms.internal.ads.kg4[] r7 = r0.f11578o
            r8 = r7[r3]
            if (r8 == 0) goto L76
            com.google.android.gms.internal.ads.xi4 r8 = r8.f11039a
            if (r8 == r6) goto L7d
        L76:
            com.google.android.gms.internal.ads.kg4 r8 = new com.google.android.gms.internal.ads.kg4
            r8.<init>(r14, r6)
            r7[r3] = r8
        L7d:
            com.google.android.gms.internal.ads.kg4[] r6 = r0.f11578o
            r6 = r6[r3]
            r1[r3] = r6
            int r3 = r3 + 1
            goto L60
        L86:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.lg4.q(com.google.android.gms.internal.ads.rk4[], boolean[], com.google.android.gms.internal.ads.xi4[], boolean[], long):long");
    }
}
