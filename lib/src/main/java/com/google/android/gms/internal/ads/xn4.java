package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.InterruptedIOException;

/* loaded from: classes.dex */
public abstract class xn4 {

    /* renamed from: a, reason: collision with root package name */
    protected final rn4 f17646a;

    /* renamed from: b, reason: collision with root package name */
    protected final wn4 f17647b;

    /* renamed from: c, reason: collision with root package name */
    protected tn4 f17648c;

    /* renamed from: d, reason: collision with root package name */
    private final int f17649d;

    protected xn4(un4 un4Var, wn4 wn4Var, long j10, long j11, long j12, long j13, long j14, long j15, int i10) {
        this.f17647b = wn4Var;
        this.f17649d = i10;
        this.f17646a = new rn4(un4Var, j10, 0L, j12, j13, j14, j15);
    }

    protected static final int f(l lVar, long j10, l0 l0Var) {
        if (j10 == lVar.e()) {
            return 0;
        }
        l0Var.f11275a = j10;
        return 1;
    }

    protected static final boolean g(l lVar, long j10) throws EOFException, InterruptedIOException {
        long jE = j10 - lVar.e();
        if (jE < 0 || jE > 262144) {
            return false;
        }
        ((bo4) lVar).h((int) jE, false);
        return true;
    }

    public final int a(l lVar, l0 l0Var) throws EOFException, InterruptedIOException {
        while (true) {
            tn4 tn4Var = this.f17648c;
            gt1.b(tn4Var);
            long j10 = tn4Var.f15932f;
            long j11 = tn4Var.f15933g - j10;
            long j12 = tn4Var.f15934h;
            if (j11 <= this.f17649d) {
                c(false, j10);
                return f(lVar, j10, l0Var);
            }
            if (!g(lVar, j12)) {
                return f(lVar, j12, l0Var);
            }
            lVar.j();
            vn4 vn4VarA = this.f17647b.a(lVar, tn4Var.f15928b);
            int i10 = vn4VarA.f16821a;
            if (i10 == -3) {
                c(false, j12);
                return f(lVar, j12, l0Var);
            }
            if (i10 == -2) {
                tn4.h(tn4Var, vn4VarA.f16822b, vn4VarA.f16823c);
            } else {
                if (i10 != -1) {
                    g(lVar, vn4VarA.f16823c);
                    c(true, vn4VarA.f16823c);
                    return f(lVar, vn4VarA.f16823c, l0Var);
                }
                tn4.g(tn4Var, vn4VarA.f16822b, vn4VarA.f16823c);
            }
        }
    }

    public final o0 b() {
        return this.f17646a;
    }

    protected final void c(boolean z10, long j10) {
        this.f17648c = null;
        this.f17647b.b();
    }

    public final void d(long j10) {
        tn4 tn4Var = this.f17648c;
        if (tn4Var == null || tn4Var.f15927a != j10) {
            long j11 = this.f17646a.j(j10);
            rn4 rn4Var = this.f17646a;
            this.f17648c = new tn4(j10, j11, 0L, rn4Var.f14857c, rn4Var.f14858d, rn4Var.f14859e, rn4Var.f14860f);
        }
    }

    public final boolean e() {
        return this.f17648c != null;
    }
}
