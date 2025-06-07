package com.google.android.gms.internal.play_billing;

import java.util.List;

/* loaded from: classes.dex */
final class z0 implements n4 {

    /* renamed from: a, reason: collision with root package name */
    private final y0 f19713a;

    private z0(y0 y0Var) {
        byte[] bArr = v1.f19661d;
        this.f19713a = y0Var;
        y0Var.f19690a = this;
    }

    public static z0 J(y0 y0Var) {
        z0 z0Var = y0Var.f19690a;
        return z0Var != null ? z0Var : new z0(y0Var);
    }

    @Override // com.google.android.gms.internal.play_billing.n4
    public final void A(int i10, Object obj, f3 f3Var) {
        u2 u2Var = (u2) obj;
        v0 v0Var = (v0) this.f19713a;
        v0Var.q((i10 << 3) | 2);
        v0Var.q(((z) u2Var).b(f3Var));
        f3Var.h(u2Var, v0Var.f19690a);
    }

    @Override // com.google.android.gms.internal.play_billing.n4
    public final void B(int i10, int i11) {
        this.f19713a.g(i10, i11);
    }

    @Override // com.google.android.gms.internal.play_billing.n4
    public final void C(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                y0 y0Var = this.f19713a;
                long jLongValue = ((Long) list.get(i11)).longValue();
                y0Var.r(i10, (jLongValue >> 63) ^ (jLongValue + jLongValue));
                i11++;
            }
            return;
        }
        this.f19713a.o(i10, 2);
        int iX = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            long jLongValue2 = ((Long) list.get(i12)).longValue();
            iX += y0.x((jLongValue2 >> 63) ^ (jLongValue2 + jLongValue2));
        }
        this.f19713a.q(iX);
        while (i11 < list.size()) {
            y0 y0Var2 = this.f19713a;
            long jLongValue3 = ((Long) list.get(i11)).longValue();
            y0Var2.s((jLongValue3 >> 63) ^ (jLongValue3 + jLongValue3));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.n4
    public final void D(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof o1)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.f19713a.p(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            this.f19713a.o(i10, 2);
            int iW = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iW += y0.w(((Integer) list.get(i12)).intValue());
            }
            this.f19713a.q(iW);
            while (i11 < list.size()) {
                this.f19713a.q(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        o1 o1Var = (o1) list;
        if (!z10) {
            while (i11 < o1Var.size()) {
                this.f19713a.p(i10, o1Var.f(i11));
                i11++;
            }
            return;
        }
        this.f19713a.o(i10, 2);
        int iW2 = 0;
        for (int i13 = 0; i13 < o1Var.size(); i13++) {
            iW2 += y0.w(o1Var.f(i13));
        }
        this.f19713a.q(iW2);
        while (i11 < o1Var.size()) {
            this.f19713a.q(o1Var.f(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.n4
    public final void E(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f19713a.i(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        this.f19713a.o(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Long) list.get(i13)).longValue();
            i12 += 8;
        }
        this.f19713a.q(i12);
        while (i11 < list.size()) {
            this.f19713a.j(((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.n4
    public final void F(int i10, List list) {
        int i11 = 0;
        if (!(list instanceof e2)) {
            while (i11 < list.size()) {
                this.f19713a.n(i10, (String) list.get(i11));
                i11++;
            }
            return;
        }
        e2 e2Var = (e2) list;
        while (i11 < list.size()) {
            Object objC = e2Var.C(i11);
            if (objC instanceof String) {
                this.f19713a.n(i10, (String) objC);
            } else {
                this.f19713a.f(i10, (q0) objC);
            }
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.n4
    public final void G(int i10, long j10) {
        this.f19713a.i(i10, j10);
    }

    @Override // com.google.android.gms.internal.play_billing.n4
    public final void H(int i10, long j10) {
        this.f19713a.r(i10, j10);
    }

    @Override // com.google.android.gms.internal.play_billing.n4
    public final void I(int i10) {
        this.f19713a.o(i10, 3);
    }

    @Override // com.google.android.gms.internal.play_billing.n4
    public final void K(int i10, int i11) {
        this.f19713a.p(i10, (i11 >> 31) ^ (i11 + i11));
    }

    @Override // com.google.android.gms.internal.play_billing.n4
    public final void X(int i10) {
        this.f19713a.o(i10, 4);
    }

    @Override // com.google.android.gms.internal.play_billing.n4
    public final void a(int i10, int i11) {
        this.f19713a.k(i10, i11);
    }

    @Override // com.google.android.gms.internal.play_billing.n4
    public final void b(int i10, long j10) {
        this.f19713a.i(i10, j10);
    }

    @Override // com.google.android.gms.internal.play_billing.n4
    public final void c(int i10, double d10) {
        this.f19713a.i(i10, Double.doubleToRawLongBits(d10));
    }

    @Override // com.google.android.gms.internal.play_billing.n4
    public final void d(int i10, List list) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            this.f19713a.f(i10, (q0) list.get(i11));
        }
    }

    @Override // com.google.android.gms.internal.play_billing.n4
    public final void e(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f19713a.i(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        this.f19713a.o(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Long) list.get(i13)).longValue();
            i12 += 8;
        }
        this.f19713a.q(i12);
        while (i11 < list.size()) {
            this.f19713a.j(((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.n4
    public final void f(int i10, float f5) {
        this.f19713a.g(i10, Float.floatToRawIntBits(f5));
    }

    @Override // com.google.android.gms.internal.play_billing.n4
    public final void g(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f19713a.r(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        this.f19713a.o(i10, 2);
        int iX = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iX += y0.x(((Long) list.get(i12)).longValue());
        }
        this.f19713a.q(iX);
        while (i11 < list.size()) {
            this.f19713a.s(((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.n4
    public final void h(int i10, int i11) {
        this.f19713a.g(i10, i11);
    }

    @Override // com.google.android.gms.internal.play_billing.n4
    public final void i(int i10, boolean z10) {
        this.f19713a.e(i10, z10);
    }

    @Override // com.google.android.gms.internal.play_billing.n4
    public final void j(int i10, long j10) {
        this.f19713a.r(i10, j10);
    }

    @Override // com.google.android.gms.internal.play_billing.n4
    public final void k(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f19713a.e(i10, ((Boolean) list.get(i11)).booleanValue());
                i11++;
            }
            return;
        }
        this.f19713a.o(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Boolean) list.get(i13)).booleanValue();
            i12++;
        }
        this.f19713a.q(i12);
        while (i11 < list.size()) {
            this.f19713a.d(((Boolean) list.get(i11)).booleanValue() ? (byte) 1 : (byte) 0);
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.n4
    public final void l(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f19713a.i(i10, Double.doubleToRawLongBits(((Double) list.get(i11)).doubleValue()));
                i11++;
            }
            return;
        }
        this.f19713a.o(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Double) list.get(i13)).doubleValue();
            i12 += 8;
        }
        this.f19713a.q(i12);
        while (i11 < list.size()) {
            this.f19713a.j(Double.doubleToRawLongBits(((Double) list.get(i11)).doubleValue()));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.n4
    public final void m(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof o1)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.f19713a.g(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            this.f19713a.o(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Integer) list.get(i13)).intValue();
                i12 += 4;
            }
            this.f19713a.q(i12);
            while (i11 < list.size()) {
                this.f19713a.h(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        o1 o1Var = (o1) list;
        if (!z10) {
            while (i11 < o1Var.size()) {
                this.f19713a.g(i10, o1Var.f(i11));
                i11++;
            }
            return;
        }
        this.f19713a.o(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < o1Var.size(); i15++) {
            o1Var.f(i15);
            i14 += 4;
        }
        this.f19713a.q(i14);
        while (i11 < o1Var.size()) {
            this.f19713a.h(o1Var.f(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.n4
    public final void n(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof o1)) {
            if (!z10) {
                while (i11 < list.size()) {
                    y0 y0Var = this.f19713a;
                    int iIntValue = ((Integer) list.get(i11)).intValue();
                    y0Var.p(i10, (iIntValue >> 31) ^ (iIntValue + iIntValue));
                    i11++;
                }
                return;
            }
            this.f19713a.o(i10, 2);
            int iW = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                int iIntValue2 = ((Integer) list.get(i12)).intValue();
                iW += y0.w((iIntValue2 >> 31) ^ (iIntValue2 + iIntValue2));
            }
            this.f19713a.q(iW);
            while (i11 < list.size()) {
                y0 y0Var2 = this.f19713a;
                int iIntValue3 = ((Integer) list.get(i11)).intValue();
                y0Var2.q((iIntValue3 >> 31) ^ (iIntValue3 + iIntValue3));
                i11++;
            }
            return;
        }
        o1 o1Var = (o1) list;
        if (!z10) {
            while (i11 < o1Var.size()) {
                y0 y0Var3 = this.f19713a;
                int iF = o1Var.f(i11);
                y0Var3.p(i10, (iF >> 31) ^ (iF + iF));
                i11++;
            }
            return;
        }
        this.f19713a.o(i10, 2);
        int iW2 = 0;
        for (int i13 = 0; i13 < o1Var.size(); i13++) {
            int iF2 = o1Var.f(i13);
            iW2 += y0.w((iF2 >> 31) ^ (iF2 + iF2));
        }
        this.f19713a.q(iW2);
        while (i11 < o1Var.size()) {
            y0 y0Var4 = this.f19713a;
            int iF3 = o1Var.f(i11);
            y0Var4.q((iF3 >> 31) ^ (iF3 + iF3));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.n4
    public final void o(int i10, long j10) {
        this.f19713a.r(i10, (j10 >> 63) ^ (j10 + j10));
    }

    @Override // com.google.android.gms.internal.play_billing.n4
    public final void p(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f19713a.r(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        this.f19713a.o(i10, 2);
        int iX = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iX += y0.x(((Long) list.get(i12)).longValue());
        }
        this.f19713a.q(iX);
        while (i11 < list.size()) {
            this.f19713a.s(((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.n4
    public final void q(int i10, String str) {
        this.f19713a.n(i10, str);
    }

    @Override // com.google.android.gms.internal.play_billing.n4
    public final void r(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f19713a.g(i10, Float.floatToRawIntBits(((Float) list.get(i11)).floatValue()));
                i11++;
            }
            return;
        }
        this.f19713a.o(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Float) list.get(i13)).floatValue();
            i12 += 4;
        }
        this.f19713a.q(i12);
        while (i11 < list.size()) {
            this.f19713a.h(Float.floatToRawIntBits(((Float) list.get(i11)).floatValue()));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.n4
    public final void s(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof o1)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.f19713a.k(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            this.f19713a.o(i10, 2);
            int iX = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iX += y0.x(((Integer) list.get(i12)).intValue());
            }
            this.f19713a.q(iX);
            while (i11 < list.size()) {
                this.f19713a.l(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        o1 o1Var = (o1) list;
        if (!z10) {
            while (i11 < o1Var.size()) {
                this.f19713a.k(i10, o1Var.f(i11));
                i11++;
            }
            return;
        }
        this.f19713a.o(i10, 2);
        int iX2 = 0;
        for (int i13 = 0; i13 < o1Var.size(); i13++) {
            iX2 += y0.x(o1Var.f(i13));
        }
        this.f19713a.q(iX2);
        while (i11 < o1Var.size()) {
            this.f19713a.l(o1Var.f(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.n4
    public final void t(int i10, int i11) {
        this.f19713a.k(i10, i11);
    }

    @Override // com.google.android.gms.internal.play_billing.n4
    public final void u(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof o1)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.f19713a.k(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            this.f19713a.o(i10, 2);
            int iX = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iX += y0.x(((Integer) list.get(i12)).intValue());
            }
            this.f19713a.q(iX);
            while (i11 < list.size()) {
                this.f19713a.l(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        o1 o1Var = (o1) list;
        if (!z10) {
            while (i11 < o1Var.size()) {
                this.f19713a.k(i10, o1Var.f(i11));
                i11++;
            }
            return;
        }
        this.f19713a.o(i10, 2);
        int iX2 = 0;
        for (int i13 = 0; i13 < o1Var.size(); i13++) {
            iX2 += y0.x(o1Var.f(i13));
        }
        this.f19713a.q(iX2);
        while (i11 < o1Var.size()) {
            this.f19713a.l(o1Var.f(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.n4
    public final void v(int i10, Object obj, f3 f3Var) {
        y0 y0Var = this.f19713a;
        y0Var.o(i10, 3);
        f3Var.h((u2) obj, y0Var.f19690a);
        y0Var.o(i10, 4);
    }

    @Override // com.google.android.gms.internal.play_billing.n4
    public final void w(int i10, int i11) {
        this.f19713a.p(i10, i11);
    }

    @Override // com.google.android.gms.internal.play_billing.n4
    public final void x(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof o1)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.f19713a.g(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            this.f19713a.o(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Integer) list.get(i13)).intValue();
                i12 += 4;
            }
            this.f19713a.q(i12);
            while (i11 < list.size()) {
                this.f19713a.h(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        o1 o1Var = (o1) list;
        if (!z10) {
            while (i11 < o1Var.size()) {
                this.f19713a.g(i10, o1Var.f(i11));
                i11++;
            }
            return;
        }
        this.f19713a.o(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < o1Var.size(); i15++) {
            o1Var.f(i15);
            i14 += 4;
        }
        this.f19713a.q(i14);
        while (i11 < o1Var.size()) {
            this.f19713a.h(o1Var.f(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.n4
    public final void y(int i10, Object obj) {
        if (obj instanceof q0) {
            v0 v0Var = (v0) this.f19713a;
            v0Var.q(11);
            v0Var.p(2, i10);
            v0Var.f(3, (q0) obj);
            v0Var.q(12);
            return;
        }
        y0 y0Var = this.f19713a;
        u2 u2Var = (u2) obj;
        v0 v0Var2 = (v0) y0Var;
        v0Var2.q(11);
        v0Var2.p(2, i10);
        v0Var2.q(26);
        v0Var2.q(u2Var.e());
        u2Var.a(y0Var);
        v0Var2.q(12);
    }

    @Override // com.google.android.gms.internal.play_billing.n4
    public final void z(int i10, q0 q0Var) {
        this.f19713a.f(i10, q0Var);
    }
}
