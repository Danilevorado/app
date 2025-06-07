package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.InterruptedIOException;

/* loaded from: classes.dex */
abstract class u6 {

    /* renamed from: b, reason: collision with root package name */
    private s0 f16180b;

    /* renamed from: c, reason: collision with root package name */
    private n f16181c;

    /* renamed from: d, reason: collision with root package name */
    private p6 f16182d;

    /* renamed from: e, reason: collision with root package name */
    private long f16183e;

    /* renamed from: f, reason: collision with root package name */
    private long f16184f;

    /* renamed from: g, reason: collision with root package name */
    private long f16185g;

    /* renamed from: h, reason: collision with root package name */
    private int f16186h;

    /* renamed from: i, reason: collision with root package name */
    private int f16187i;

    /* renamed from: k, reason: collision with root package name */
    private long f16189k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f16190l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f16191m;

    /* renamed from: a, reason: collision with root package name */
    private final n6 f16179a = new n6();

    /* renamed from: j, reason: collision with root package name */
    private r6 f16188j = new r6();

    protected abstract long a(jm2 jm2Var);

    protected void b(boolean z10) {
        int i10;
        if (z10) {
            this.f16188j = new r6();
            this.f16184f = 0L;
            i10 = 0;
        } else {
            i10 = 1;
        }
        this.f16186h = i10;
        this.f16183e = -1L;
        this.f16185g = 0L;
    }

    protected abstract boolean c(jm2 jm2Var, long j10, r6 r6Var);

    final int d(l lVar, l0 l0Var) throws EOFException, InterruptedIOException {
        gt1.b(this.f16180b);
        int i10 = sv2.f15560a;
        int i11 = this.f16186h;
        if (i11 == 0) {
            while (this.f16179a.e(lVar)) {
                long jE = lVar.e();
                long j10 = this.f16184f;
                this.f16189k = jE - j10;
                if (!c(this.f16179a.a(), j10, this.f16188j)) {
                    k9 k9Var = this.f16188j.f14643a;
                    this.f16187i = k9Var.f10912z;
                    if (!this.f16191m) {
                        this.f16180b.b(k9Var);
                        this.f16191m = true;
                    }
                    p6 p6Var = this.f16188j.f14644b;
                    if (p6Var != null) {
                        this.f16182d = p6Var;
                    } else if (lVar.f() == -1) {
                        this.f16182d = new t6(null);
                    } else {
                        o6 o6VarB = this.f16179a.b();
                        this.f16182d = new i6(this, this.f16184f, lVar.f(), o6VarB.f13022d + o6VarB.f13023e, o6VarB.f13020b, (o6VarB.f13019a & 4) != 0);
                    }
                    this.f16186h = 2;
                    this.f16179a.d();
                    return 0;
                }
                this.f16184f = lVar.e();
            }
            this.f16186h = 3;
            return -1;
        }
        if (i11 == 1) {
            ((bo4) lVar).h((int) this.f16184f, false);
            this.f16186h = 2;
            return 0;
        }
        if (i11 != 2) {
            return -1;
        }
        long jA = this.f16182d.a(lVar);
        if (jA >= 0) {
            l0Var.f11275a = jA;
            return 1;
        }
        if (jA < -1) {
            h(-(jA + 2));
        }
        if (!this.f16190l) {
            o0 o0VarC = this.f16182d.c();
            gt1.b(o0VarC);
            this.f16181c.R(o0VarC);
            this.f16190l = true;
        }
        if (this.f16189k <= 0 && !this.f16179a.e(lVar)) {
            this.f16186h = 3;
            return -1;
        }
        this.f16189k = 0L;
        jm2 jm2VarA = this.f16179a.a();
        long jA2 = a(jm2VarA);
        if (jA2 >= 0) {
            long j11 = this.f16185g;
            if (j11 + jA2 >= this.f16183e) {
                long jE2 = e(j11);
                q0.b(this.f16180b, jm2VarA, jm2VarA.l());
                this.f16180b.e(jE2, 1, jm2VarA.l(), 0, null);
                this.f16183e = -1L;
            }
        }
        this.f16185g += jA2;
        return 0;
    }

    protected final long e(long j10) {
        return (j10 * 1000000) / this.f16187i;
    }

    protected final long f(long j10) {
        return (this.f16187i * j10) / 1000000;
    }

    final void g(n nVar, s0 s0Var) {
        this.f16181c = nVar;
        this.f16180b = s0Var;
        b(true);
    }

    protected void h(long j10) {
        this.f16185g = j10;
    }

    final void i(long j10, long j11) {
        this.f16179a.c();
        if (j10 == 0) {
            b(!this.f16190l);
            return;
        }
        if (this.f16186h != 0) {
            long jF = f(j11);
            this.f16183e = jF;
            p6 p6Var = this.f16182d;
            int i10 = sv2.f15560a;
            p6Var.h(jF);
            this.f16186h = 2;
        }
    }
}
