package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes.dex */
final class ng4 implements rh4, ge4 {

    /* renamed from: a, reason: collision with root package name */
    private final Object f12616a;

    /* renamed from: b, reason: collision with root package name */
    private qh4 f12617b;

    /* renamed from: c, reason: collision with root package name */
    private fe4 f12618c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ pg4 f12619d;

    public ng4(pg4 pg4Var, Object obj) {
        this.f12619d = pg4Var;
        this.f12617b = pg4Var.o(null);
        this.f12618c = pg4Var.m(null);
        this.f12616a = obj;
    }

    private final dh4 a(dh4 dh4Var) {
        pg4 pg4Var = this.f12619d;
        Object obj = this.f12616a;
        long j10 = dh4Var.f7320c;
        pg4Var.z(obj, j10);
        pg4 pg4Var2 = this.f12619d;
        Object obj2 = this.f12616a;
        long j11 = dh4Var.f7321d;
        pg4Var2.z(obj2, j11);
        return (j10 == dh4Var.f7320c && j11 == dh4Var.f7321d) ? dh4Var : new dh4(1, dh4Var.f7318a, dh4Var.f7319b, 0, null, j10, j11);
    }

    private final boolean e(int i10, hh4 hh4Var) {
        hh4 hh4VarA;
        if (hh4Var != null) {
            hh4VarA = this.f12619d.A(this.f12616a, hh4Var);
            if (hh4VarA == null) {
                return false;
            }
        } else {
            hh4VarA = null;
        }
        this.f12619d.y(this.f12616a, 0);
        qh4 qh4Var = this.f12617b;
        int i11 = qh4Var.f14325a;
        if (!sv2.b(qh4Var.f14326b, hh4VarA)) {
            this.f12617b = this.f12619d.p(0, hh4VarA, 0L);
        }
        fe4 fe4Var = this.f12618c;
        int i12 = fe4Var.f8249a;
        if (sv2.b(fe4Var.f8250b, hh4VarA)) {
            return true;
        }
        this.f12618c = this.f12619d.n(0, hh4VarA);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.rh4
    public final void b(int i10, hh4 hh4Var, dh4 dh4Var) {
        if (e(0, hh4Var)) {
            this.f12617b.c(a(dh4Var));
        }
    }

    @Override // com.google.android.gms.internal.ads.rh4
    public final void c(int i10, hh4 hh4Var, xg4 xg4Var, dh4 dh4Var) {
        if (e(0, hh4Var)) {
            this.f12617b.e(xg4Var, a(dh4Var));
        }
    }

    @Override // com.google.android.gms.internal.ads.rh4
    public final void d(int i10, hh4 hh4Var, xg4 xg4Var, dh4 dh4Var) {
        if (e(0, hh4Var)) {
            this.f12617b.g(xg4Var, a(dh4Var));
        }
    }

    @Override // com.google.android.gms.internal.ads.rh4
    public final void f(int i10, hh4 hh4Var, xg4 xg4Var, dh4 dh4Var) {
        if (e(0, hh4Var)) {
            this.f12617b.k(xg4Var, a(dh4Var));
        }
    }

    @Override // com.google.android.gms.internal.ads.rh4
    public final void g(int i10, hh4 hh4Var, xg4 xg4Var, dh4 dh4Var, IOException iOException, boolean z10) {
        if (e(0, hh4Var)) {
            this.f12617b.i(xg4Var, a(dh4Var), iOException, z10);
        }
    }
}
