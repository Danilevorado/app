package com.google.android.gms.internal.ads;

import java.util.List;

/* loaded from: classes.dex */
final class nx3 {

    /* renamed from: a, reason: collision with root package name */
    private final mx3 f12894a;

    private nx3(mx3 mx3Var) {
        byte[] bArr = ly3.f11871d;
        this.f12894a = mx3Var;
        mx3Var.f12292a = this;
    }

    public static nx3 l(mx3 mx3Var) {
        nx3 nx3Var = mx3Var.f12292a;
        return nx3Var != null ? nx3Var : new nx3(mx3Var);
    }

    public final void A(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f12894a.m(i10, Float.floatToRawIntBits(((Float) list.get(i11)).floatValue()));
                i11++;
            }
            return;
        }
        this.f12894a.u(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Float) list.get(i13)).floatValue();
            i12 += 4;
        }
        this.f12894a.w(i12);
        while (i11 < list.size()) {
            this.f12894a.n(Float.floatToRawIntBits(((Float) list.get(i11)).floatValue()));
            i11++;
        }
    }

    public final void B(int i10, Object obj, d04 d04Var) {
        mx3 mx3Var = this.f12894a;
        mx3Var.u(i10, 3);
        d04Var.h((jz3) obj, mx3Var.f12292a);
        mx3Var.u(i10, 4);
    }

    public final void C(int i10, int i11) {
        this.f12894a.q(i10, i11);
    }

    public final void D(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f12894a.q(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        this.f12894a.u(i10, 2);
        int iA = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iA += mx3.A(((Integer) list.get(i12)).intValue());
        }
        this.f12894a.w(iA);
        while (i11 < list.size()) {
            this.f12894a.r(((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    public final void E(int i10, long j10) {
        this.f12894a.x(i10, j10);
    }

    public final void F(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f12894a.x(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        this.f12894a.u(i10, 2);
        int iC = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iC += mx3.c(((Long) list.get(i12)).longValue());
        }
        this.f12894a.w(iC);
        while (i11 < list.size()) {
            this.f12894a.y(((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    public final void G(int i10, Object obj, d04 d04Var) {
        this.f12894a.s(i10, (jz3) obj, d04Var);
    }

    public final void H(int i10, int i11) {
        this.f12894a.m(i10, i11);
    }

    public final void I(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f12894a.m(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        this.f12894a.u(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Integer) list.get(i13)).intValue();
            i12 += 4;
        }
        this.f12894a.w(i12);
        while (i11 < list.size()) {
            this.f12894a.n(((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    public final void J(int i10, long j10) {
        this.f12894a.o(i10, j10);
    }

    public final void K(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f12894a.o(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        this.f12894a.u(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Long) list.get(i13)).longValue();
            i12 += 8;
        }
        this.f12894a.w(i12);
        while (i11 < list.size()) {
            this.f12894a.p(((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    public final void a(int i10, int i11) {
        this.f12894a.v(i10, (i11 >> 31) ^ (i11 + i11));
    }

    public final void b(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                mx3 mx3Var = this.f12894a;
                int iIntValue = ((Integer) list.get(i11)).intValue();
                mx3Var.v(i10, (iIntValue >> 31) ^ (iIntValue + iIntValue));
                i11++;
            }
            return;
        }
        this.f12894a.u(i10, 2);
        int iB = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            int iIntValue2 = ((Integer) list.get(i12)).intValue();
            iB += mx3.b((iIntValue2 >> 31) ^ (iIntValue2 + iIntValue2));
        }
        this.f12894a.w(iB);
        while (i11 < list.size()) {
            mx3 mx3Var2 = this.f12894a;
            int iIntValue3 = ((Integer) list.get(i11)).intValue();
            mx3Var2.w((iIntValue3 >> 31) ^ (iIntValue3 + iIntValue3));
            i11++;
        }
    }

    public final void c(int i10, long j10) {
        this.f12894a.x(i10, (j10 >> 63) ^ (j10 + j10));
    }

    public final void d(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                mx3 mx3Var = this.f12894a;
                long jLongValue = ((Long) list.get(i11)).longValue();
                mx3Var.x(i10, (jLongValue >> 63) ^ (jLongValue + jLongValue));
                i11++;
            }
            return;
        }
        this.f12894a.u(i10, 2);
        int iC = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            long jLongValue2 = ((Long) list.get(i12)).longValue();
            iC += mx3.c((jLongValue2 >> 63) ^ (jLongValue2 + jLongValue2));
        }
        this.f12894a.w(iC);
        while (i11 < list.size()) {
            mx3 mx3Var2 = this.f12894a;
            long jLongValue3 = ((Long) list.get(i11)).longValue();
            mx3Var2.y((jLongValue3 >> 63) ^ (jLongValue3 + jLongValue3));
            i11++;
        }
    }

    public final void e(int i10) {
        this.f12894a.u(i10, 3);
    }

    public final void f(int i10, String str) {
        this.f12894a.t(i10, str);
    }

    public final void g(int i10, List list) {
        int i11 = 0;
        if (!(list instanceof ry3)) {
            while (i11 < list.size()) {
                this.f12894a.t(i10, (String) list.get(i11));
                i11++;
            }
            return;
        }
        ry3 ry3Var = (ry3) list;
        while (i11 < list.size()) {
            Object objC = ry3Var.C(i11);
            if (objC instanceof String) {
                this.f12894a.t(i10, (String) objC);
            } else {
                this.f12894a.k(i10, (ww3) objC);
            }
            i11++;
        }
    }

    public final void h(int i10, int i11) {
        this.f12894a.v(i10, i11);
    }

    public final void i(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f12894a.v(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        this.f12894a.u(i10, 2);
        int iB = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iB += mx3.b(((Integer) list.get(i12)).intValue());
        }
        this.f12894a.w(iB);
        while (i11 < list.size()) {
            this.f12894a.w(((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    public final void j(int i10, long j10) {
        this.f12894a.x(i10, j10);
    }

    public final void k(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f12894a.x(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        this.f12894a.u(i10, 2);
        int iC = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iC += mx3.c(((Long) list.get(i12)).longValue());
        }
        this.f12894a.w(iC);
        while (i11 < list.size()) {
            this.f12894a.y(((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    public final void m(int i10, boolean z10) {
        this.f12894a.j(i10, z10);
    }

    public final void n(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f12894a.j(i10, ((Boolean) list.get(i11)).booleanValue());
                i11++;
            }
            return;
        }
        this.f12894a.u(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Boolean) list.get(i13)).booleanValue();
            i12++;
        }
        this.f12894a.w(i12);
        while (i11 < list.size()) {
            this.f12894a.i(((Boolean) list.get(i11)).booleanValue() ? (byte) 1 : (byte) 0);
            i11++;
        }
    }

    public final void o(int i10, ww3 ww3Var) {
        this.f12894a.k(i10, ww3Var);
    }

    public final void p(int i10, List list) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            this.f12894a.k(i10, (ww3) list.get(i11));
        }
    }

    public final void q(int i10, double d10) {
        this.f12894a.o(i10, Double.doubleToRawLongBits(d10));
    }

    public final void r(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f12894a.o(i10, Double.doubleToRawLongBits(((Double) list.get(i11)).doubleValue()));
                i11++;
            }
            return;
        }
        this.f12894a.u(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Double) list.get(i13)).doubleValue();
            i12 += 8;
        }
        this.f12894a.w(i12);
        while (i11 < list.size()) {
            this.f12894a.p(Double.doubleToRawLongBits(((Double) list.get(i11)).doubleValue()));
            i11++;
        }
    }

    public final void s(int i10) {
        this.f12894a.u(i10, 4);
    }

    public final void t(int i10, int i11) {
        this.f12894a.q(i10, i11);
    }

    public final void u(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f12894a.q(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        this.f12894a.u(i10, 2);
        int iA = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iA += mx3.A(((Integer) list.get(i12)).intValue());
        }
        this.f12894a.w(iA);
        while (i11 < list.size()) {
            this.f12894a.r(((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    public final void v(int i10, int i11) {
        this.f12894a.m(i10, i11);
    }

    public final void w(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f12894a.m(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        this.f12894a.u(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Integer) list.get(i13)).intValue();
            i12 += 4;
        }
        this.f12894a.w(i12);
        while (i11 < list.size()) {
            this.f12894a.n(((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    public final void x(int i10, long j10) {
        this.f12894a.o(i10, j10);
    }

    public final void y(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f12894a.o(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        this.f12894a.u(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Long) list.get(i13)).longValue();
            i12 += 8;
        }
        this.f12894a.w(i12);
        while (i11 < list.size()) {
            this.f12894a.p(((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    public final void z(int i10, float f5) {
        this.f12894a.m(i10, Float.floatToRawIntBits(f5));
    }
}
