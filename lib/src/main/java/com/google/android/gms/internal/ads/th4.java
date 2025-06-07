package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes.dex */
final class th4 implements fh4, eh4 {

    /* renamed from: m, reason: collision with root package name */
    private final fh4 f15847m;

    /* renamed from: n, reason: collision with root package name */
    private final long f15848n;

    /* renamed from: o, reason: collision with root package name */
    private eh4 f15849o;

    public th4(fh4 fh4Var, long j10) {
        this.f15847m = fh4Var;
        this.f15848n = j10;
    }

    @Override // com.google.android.gms.internal.ads.fh4, com.google.android.gms.internal.ads.zi4
    public final void a(long j10) {
        this.f15847m.a(j10 - this.f15848n);
    }

    @Override // com.google.android.gms.internal.ads.fh4, com.google.android.gms.internal.ads.zi4
    public final long b() {
        long jB = this.f15847m.b();
        if (jB == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return jB + this.f15848n;
    }

    @Override // com.google.android.gms.internal.ads.fh4, com.google.android.gms.internal.ads.zi4
    public final boolean c(long j10) {
        return this.f15847m.c(j10 - this.f15848n);
    }

    @Override // com.google.android.gms.internal.ads.fh4, com.google.android.gms.internal.ads.zi4
    public final long d() {
        long jD = this.f15847m.d();
        if (jD == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return jD + this.f15848n;
    }

    @Override // com.google.android.gms.internal.ads.fh4
    public final void e(eh4 eh4Var, long j10) {
        this.f15849o = eh4Var;
        this.f15847m.e(this, j10 - this.f15848n);
    }

    @Override // com.google.android.gms.internal.ads.fh4
    public final long f() {
        long jF = this.f15847m.f();
        if (jF == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return jF + this.f15848n;
    }

    @Override // com.google.android.gms.internal.ads.fh4
    public final fj4 g() {
        return this.f15847m.g();
    }

    @Override // com.google.android.gms.internal.ads.fh4
    public final long h(long j10) {
        return this.f15847m.h(j10 - this.f15848n) + this.f15848n;
    }

    @Override // com.google.android.gms.internal.ads.eh4
    public final void i(fh4 fh4Var) {
        eh4 eh4Var = this.f15849o;
        Objects.requireNonNull(eh4Var);
        eh4Var.i(this);
    }

    @Override // com.google.android.gms.internal.ads.fh4
    public final void k() {
        this.f15847m.k();
    }

    @Override // com.google.android.gms.internal.ads.yi4
    public final /* bridge */ /* synthetic */ void l(zi4 zi4Var) {
        eh4 eh4Var = this.f15849o;
        Objects.requireNonNull(eh4Var);
        eh4Var.l(this);
    }

    @Override // com.google.android.gms.internal.ads.fh4
    public final void m(long j10, boolean z10) {
        this.f15847m.m(j10 - this.f15848n, false);
    }

    @Override // com.google.android.gms.internal.ads.fh4
    public final long n(long j10, x84 x84Var) {
        return this.f15847m.n(j10 - this.f15848n, x84Var) + this.f15848n;
    }

    @Override // com.google.android.gms.internal.ads.fh4, com.google.android.gms.internal.ads.zi4
    public final boolean o() {
        return this.f15847m.o();
    }

    @Override // com.google.android.gms.internal.ads.fh4
    public final long q(rk4[] rk4VarArr, boolean[] zArr, xi4[] xi4VarArr, boolean[] zArr2, long j10) {
        xi4[] xi4VarArr2 = new xi4[xi4VarArr.length];
        int i10 = 0;
        while (true) {
            xi4 xi4VarD = null;
            if (i10 >= xi4VarArr.length) {
                break;
            }
            uh4 uh4Var = (uh4) xi4VarArr[i10];
            if (uh4Var != null) {
                xi4VarD = uh4Var.d();
            }
            xi4VarArr2[i10] = xi4VarD;
            i10++;
        }
        long jQ = this.f15847m.q(rk4VarArr, zArr, xi4VarArr2, zArr2, j10 - this.f15848n);
        for (int i11 = 0; i11 < xi4VarArr.length; i11++) {
            xi4 xi4Var = xi4VarArr2[i11];
            if (xi4Var == null) {
                xi4VarArr[i11] = null;
            } else {
                xi4 xi4Var2 = xi4VarArr[i11];
                if (xi4Var2 == null || ((uh4) xi4Var2).d() != xi4Var) {
                    xi4VarArr[i11] = new uh4(xi4Var, this.f15848n);
                }
            }
        }
        return jQ + this.f15848n;
    }
}
