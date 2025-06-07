package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Objects;

/* loaded from: classes.dex */
public final class yg4 implements fh4, eh4 {

    /* renamed from: m, reason: collision with root package name */
    public final hh4 f18037m;

    /* renamed from: n, reason: collision with root package name */
    private final long f18038n;

    /* renamed from: o, reason: collision with root package name */
    private jh4 f18039o;

    /* renamed from: p, reason: collision with root package name */
    private fh4 f18040p;

    /* renamed from: q, reason: collision with root package name */
    private eh4 f18041q;

    /* renamed from: r, reason: collision with root package name */
    private long f18042r = -9223372036854775807L;

    /* renamed from: s, reason: collision with root package name */
    private final hl4 f18043s;

    public yg4(hh4 hh4Var, hl4 hl4Var, long j10) {
        this.f18037m = hh4Var;
        this.f18043s = hl4Var;
        this.f18038n = j10;
    }

    private final long v(long j10) {
        long j11 = this.f18042r;
        return j11 != -9223372036854775807L ? j11 : j10;
    }

    @Override // com.google.android.gms.internal.ads.fh4, com.google.android.gms.internal.ads.zi4
    public final void a(long j10) {
        fh4 fh4Var = this.f18040p;
        int i10 = sv2.f15560a;
        fh4Var.a(j10);
    }

    @Override // com.google.android.gms.internal.ads.fh4, com.google.android.gms.internal.ads.zi4
    public final long b() {
        fh4 fh4Var = this.f18040p;
        int i10 = sv2.f15560a;
        return fh4Var.b();
    }

    @Override // com.google.android.gms.internal.ads.fh4, com.google.android.gms.internal.ads.zi4
    public final boolean c(long j10) {
        fh4 fh4Var = this.f18040p;
        return fh4Var != null && fh4Var.c(j10);
    }

    @Override // com.google.android.gms.internal.ads.fh4, com.google.android.gms.internal.ads.zi4
    public final long d() {
        fh4 fh4Var = this.f18040p;
        int i10 = sv2.f15560a;
        return fh4Var.d();
    }

    @Override // com.google.android.gms.internal.ads.fh4
    public final void e(eh4 eh4Var, long j10) {
        this.f18041q = eh4Var;
        fh4 fh4Var = this.f18040p;
        if (fh4Var != null) {
            fh4Var.e(this, v(this.f18038n));
        }
    }

    @Override // com.google.android.gms.internal.ads.fh4
    public final long f() {
        fh4 fh4Var = this.f18040p;
        int i10 = sv2.f15560a;
        return fh4Var.f();
    }

    @Override // com.google.android.gms.internal.ads.fh4
    public final fj4 g() {
        fh4 fh4Var = this.f18040p;
        int i10 = sv2.f15560a;
        return fh4Var.g();
    }

    @Override // com.google.android.gms.internal.ads.fh4
    public final long h(long j10) {
        fh4 fh4Var = this.f18040p;
        int i10 = sv2.f15560a;
        return fh4Var.h(j10);
    }

    @Override // com.google.android.gms.internal.ads.eh4
    public final void i(fh4 fh4Var) {
        eh4 eh4Var = this.f18041q;
        int i10 = sv2.f15560a;
        eh4Var.i(this);
    }

    public final long j() {
        return this.f18042r;
    }

    @Override // com.google.android.gms.internal.ads.fh4
    public final void k() throws IOException {
        try {
            fh4 fh4Var = this.f18040p;
            if (fh4Var != null) {
                fh4Var.k();
                return;
            }
            jh4 jh4Var = this.f18039o;
            if (jh4Var != null) {
                jh4Var.N();
            }
        } catch (IOException e5) {
            throw e5;
        }
    }

    @Override // com.google.android.gms.internal.ads.yi4
    public final /* bridge */ /* synthetic */ void l(zi4 zi4Var) {
        eh4 eh4Var = this.f18041q;
        int i10 = sv2.f15560a;
        eh4Var.l(this);
    }

    @Override // com.google.android.gms.internal.ads.fh4
    public final void m(long j10, boolean z10) {
        fh4 fh4Var = this.f18040p;
        int i10 = sv2.f15560a;
        fh4Var.m(j10, false);
    }

    @Override // com.google.android.gms.internal.ads.fh4
    public final long n(long j10, x84 x84Var) {
        fh4 fh4Var = this.f18040p;
        int i10 = sv2.f15560a;
        return fh4Var.n(j10, x84Var);
    }

    @Override // com.google.android.gms.internal.ads.fh4, com.google.android.gms.internal.ads.zi4
    public final boolean o() {
        fh4 fh4Var = this.f18040p;
        return fh4Var != null && fh4Var.o();
    }

    public final long p() {
        return this.f18038n;
    }

    @Override // com.google.android.gms.internal.ads.fh4
    public final long q(rk4[] rk4VarArr, boolean[] zArr, xi4[] xi4VarArr, boolean[] zArr2, long j10) {
        long j11;
        long j12 = this.f18042r;
        if (j12 == -9223372036854775807L || j10 != this.f18038n) {
            j11 = j10;
        } else {
            this.f18042r = -9223372036854775807L;
            j11 = j12;
        }
        fh4 fh4Var = this.f18040p;
        int i10 = sv2.f15560a;
        return fh4Var.q(rk4VarArr, zArr, xi4VarArr, zArr2, j11);
    }

    public final void r(hh4 hh4Var) {
        long jV = v(this.f18038n);
        jh4 jh4Var = this.f18039o;
        Objects.requireNonNull(jh4Var);
        fh4 fh4VarG = jh4Var.g(hh4Var, this.f18043s, jV);
        this.f18040p = fh4VarG;
        if (this.f18041q != null) {
            fh4VarG.e(this, jV);
        }
    }

    public final void s(long j10) {
        this.f18042r = j10;
    }

    public final void t() {
        fh4 fh4Var = this.f18040p;
        if (fh4Var != null) {
            jh4 jh4Var = this.f18039o;
            Objects.requireNonNull(jh4Var);
            jh4Var.a(fh4Var);
        }
    }

    public final void u(jh4 jh4Var) {
        gt1.f(this.f18039o == null);
        this.f18039o = jh4Var;
    }
}
