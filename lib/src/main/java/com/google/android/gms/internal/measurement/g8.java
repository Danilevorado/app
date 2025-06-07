package com.google.android.gms.internal.measurement;

import java.util.List;

/* loaded from: classes.dex */
final class g8 implements gb {

    /* renamed from: a, reason: collision with root package name */
    private final f8 f18959a;

    private g8(f8 f8Var) {
        b9.f(f8Var, "output");
        this.f18959a = f8Var;
        f8Var.f18945a = this;
    }

    public static g8 n(f8 f8Var) {
        g8 g8Var = f8Var.f18945a;
        return g8Var != null ? g8Var : new g8(f8Var);
    }

    @Override // com.google.android.gms.internal.measurement.gb
    public final void A(int i10, Object obj, ja jaVar) {
        f8 f8Var = this.f18959a;
        f8Var.s(i10, 3);
        jaVar.h((y9) obj, f8Var.f18945a);
        f8Var.s(i10, 4);
    }

    @Override // com.google.android.gms.internal.measurement.gb
    public final void B(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f18959a.v(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        this.f18959a.s(i10, 2);
        int iB = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iB += f8.b(((Long) list.get(i12)).longValue());
        }
        this.f18959a.u(iB);
        while (i11 < list.size()) {
            this.f18959a.w(((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.gb
    public final void C(int i10, int i11) {
        this.f18959a.t(i10, (i11 >> 31) ^ (i11 + i11));
    }

    @Override // com.google.android.gms.internal.measurement.gb
    public final void D(int i10, String str) {
        this.f18959a.r(i10, str);
    }

    @Override // com.google.android.gms.internal.measurement.gb
    public final void E(int i10, long j10) {
        this.f18959a.m(i10, j10);
    }

    @Override // com.google.android.gms.internal.measurement.gb
    public final void F(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f18959a.k(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        this.f18959a.s(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Integer) list.get(i13)).intValue();
            i12 += 4;
        }
        this.f18959a.u(i12);
        while (i11 < list.size()) {
            this.f18959a.l(((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.gb
    public final void G(int i10, long j10) {
        this.f18959a.v(i10, j10);
    }

    @Override // com.google.android.gms.internal.measurement.gb
    public final void H(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f18959a.t(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        this.f18959a.s(i10, 2);
        int iA = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iA += f8.a(((Integer) list.get(i12)).intValue());
        }
        this.f18959a.u(iA);
        while (i11 < list.size()) {
            this.f18959a.u(((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.gb
    public final void I(int i10, Object obj, ja jaVar) throws d8 {
        Object obj2 = (y9) obj;
        c8 c8Var = (c8) this.f18959a;
        c8Var.u((i10 << 3) | 2);
        h7 h7Var = (h7) obj2;
        int iB = h7Var.b();
        if (iB == -1) {
            iB = jaVar.a(h7Var);
            h7Var.d(iB);
        }
        c8Var.u(iB);
        jaVar.h(obj2, c8Var.f18945a);
    }

    @Override // com.google.android.gms.internal.measurement.gb
    public final void J(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                f8 f8Var = this.f18959a;
                long jLongValue = ((Long) list.get(i11)).longValue();
                f8Var.v(i10, (jLongValue >> 63) ^ (jLongValue + jLongValue));
                i11++;
            }
            return;
        }
        this.f18959a.s(i10, 2);
        int iB = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            long jLongValue2 = ((Long) list.get(i12)).longValue();
            iB += f8.b((jLongValue2 >> 63) ^ (jLongValue2 + jLongValue2));
        }
        this.f18959a.u(iB);
        while (i11 < list.size()) {
            f8 f8Var2 = this.f18959a;
            long jLongValue3 = ((Long) list.get(i11)).longValue();
            f8Var2.w((jLongValue3 >> 63) ^ (jLongValue3 + jLongValue3));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.gb
    public final void K(int i10, long j10) {
        this.f18959a.v(i10, (j10 >> 63) ^ (j10 + j10));
    }

    @Override // com.google.android.gms.internal.measurement.gb
    public final void L(int i10, x7 x7Var) {
        this.f18959a.j(i10, x7Var);
    }

    @Override // com.google.android.gms.internal.measurement.gb
    public final void X(int i10) {
        this.f18959a.s(i10, 4);
    }

    @Override // com.google.android.gms.internal.measurement.gb
    public final void a(int i10, int i11) {
        this.f18959a.o(i10, i11);
    }

    @Override // com.google.android.gms.internal.measurement.gb
    public final void b(int i10, long j10) {
        this.f18959a.m(i10, j10);
    }

    @Override // com.google.android.gms.internal.measurement.gb
    public final void c(int i10, double d10) {
        this.f18959a.m(i10, Double.doubleToRawLongBits(d10));
    }

    @Override // com.google.android.gms.internal.measurement.gb
    public final void d(int i10, List list) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            this.f18959a.j(i10, (x7) list.get(i11));
        }
    }

    @Override // com.google.android.gms.internal.measurement.gb
    public final void e(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f18959a.m(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        this.f18959a.s(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Long) list.get(i13)).longValue();
            i12 += 8;
        }
        this.f18959a.u(i12);
        while (i11 < list.size()) {
            this.f18959a.n(((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.gb
    public final void f(int i10, float f5) {
        this.f18959a.k(i10, Float.floatToRawIntBits(f5));
    }

    @Override // com.google.android.gms.internal.measurement.gb
    public final void g(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f18959a.v(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        this.f18959a.s(i10, 2);
        int iB = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iB += f8.b(((Long) list.get(i12)).longValue());
        }
        this.f18959a.u(iB);
        while (i11 < list.size()) {
            this.f18959a.w(((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.gb
    public final void h(int i10, int i11) {
        this.f18959a.k(i10, i11);
    }

    @Override // com.google.android.gms.internal.measurement.gb
    public final void i(int i10, boolean z10) {
        this.f18959a.i(i10, z10);
    }

    @Override // com.google.android.gms.internal.measurement.gb
    public final void j(int i10, long j10) {
        this.f18959a.v(i10, j10);
    }

    @Override // com.google.android.gms.internal.measurement.gb
    public final void k(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f18959a.i(i10, ((Boolean) list.get(i11)).booleanValue());
                i11++;
            }
            return;
        }
        this.f18959a.s(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Boolean) list.get(i13)).booleanValue();
            i12++;
        }
        this.f18959a.u(i12);
        while (i11 < list.size()) {
            this.f18959a.h(((Boolean) list.get(i11)).booleanValue() ? (byte) 1 : (byte) 0);
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.gb
    public final void l(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f18959a.m(i10, Double.doubleToRawLongBits(((Double) list.get(i11)).doubleValue()));
                i11++;
            }
            return;
        }
        this.f18959a.s(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Double) list.get(i13)).doubleValue();
            i12 += 8;
        }
        this.f18959a.u(i12);
        while (i11 < list.size()) {
            this.f18959a.n(Double.doubleToRawLongBits(((Double) list.get(i11)).doubleValue()));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.gb
    public final void m(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f18959a.k(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        this.f18959a.s(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Integer) list.get(i13)).intValue();
            i12 += 4;
        }
        this.f18959a.u(i12);
        while (i11 < list.size()) {
            this.f18959a.l(((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.gb
    public final void q(int i10) {
        this.f18959a.s(i10, 3);
    }

    @Override // com.google.android.gms.internal.measurement.gb
    public final void r(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f18959a.k(i10, Float.floatToRawIntBits(((Float) list.get(i11)).floatValue()));
                i11++;
            }
            return;
        }
        this.f18959a.s(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Float) list.get(i13)).floatValue();
            i12 += 4;
        }
        this.f18959a.u(i12);
        while (i11 < list.size()) {
            this.f18959a.l(Float.floatToRawIntBits(((Float) list.get(i11)).floatValue()));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.gb
    public final void s(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f18959a.o(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        this.f18959a.s(i10, 2);
        int iZ = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iZ += f8.z(((Integer) list.get(i12)).intValue());
        }
        this.f18959a.u(iZ);
        while (i11 < list.size()) {
            this.f18959a.p(((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.gb
    public final void t(int i10, int i11) {
        this.f18959a.o(i10, i11);
    }

    @Override // com.google.android.gms.internal.measurement.gb
    public final void u(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f18959a.o(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        this.f18959a.s(i10, 2);
        int iZ = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iZ += f8.z(((Integer) list.get(i12)).intValue());
        }
        this.f18959a.u(iZ);
        while (i11 < list.size()) {
            this.f18959a.p(((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.gb
    public final void v(int i10, List list) {
        int i11 = 0;
        if (!(list instanceof g9)) {
            while (i11 < list.size()) {
                this.f18959a.r(i10, (String) list.get(i11));
                i11++;
            }
            return;
        }
        g9 g9Var = (g9) list;
        while (i11 < list.size()) {
            Object objC = g9Var.C(i11);
            if (objC instanceof String) {
                this.f18959a.r(i10, (String) objC);
            } else {
                this.f18959a.j(i10, (x7) objC);
            }
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.gb
    public final void w(int i10, int i11) {
        this.f18959a.t(i10, i11);
    }

    @Override // com.google.android.gms.internal.measurement.gb
    public final void x(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f18959a.m(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        this.f18959a.s(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Long) list.get(i13)).longValue();
            i12 += 8;
        }
        this.f18959a.u(i12);
        while (i11 < list.size()) {
            this.f18959a.n(((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.gb
    public final void y(int i10, int i11) {
        this.f18959a.k(i10, i11);
    }

    @Override // com.google.android.gms.internal.measurement.gb
    public final void z(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                f8 f8Var = this.f18959a;
                int iIntValue = ((Integer) list.get(i11)).intValue();
                f8Var.t(i10, (iIntValue >> 31) ^ (iIntValue + iIntValue));
                i11++;
            }
            return;
        }
        this.f18959a.s(i10, 2);
        int iA = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            int iIntValue2 = ((Integer) list.get(i12)).intValue();
            iA += f8.a((iIntValue2 >> 31) ^ (iIntValue2 + iIntValue2));
        }
        this.f18959a.u(iA);
        while (i11 < list.size()) {
            f8 f8Var2 = this.f18959a;
            int iIntValue3 = ((Integer) list.get(i11)).intValue();
            f8Var2.u((iIntValue3 >> 31) ^ (iIntValue3 + iIntValue3));
            i11++;
        }
    }
}
