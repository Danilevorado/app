package com.google.android.gms.internal.ads;

import java.util.List;

/* loaded from: classes.dex */
final class gx3 implements uz3 {

    /* renamed from: a, reason: collision with root package name */
    private final fx3 f8902a;

    /* renamed from: b, reason: collision with root package name */
    private int f8903b;

    /* renamed from: c, reason: collision with root package name */
    private int f8904c;

    /* renamed from: d, reason: collision with root package name */
    private int f8905d = 0;

    private gx3(fx3 fx3Var) {
        byte[] bArr = ly3.f11871d;
        this.f8902a = fx3Var;
        fx3Var.f8475c = this;
    }

    private final void O(Object obj, d04 d04Var, qx3 qx3Var) {
        int i10 = this.f8904c;
        this.f8904c = ((this.f8903b >>> 3) << 3) | 4;
        try {
            d04Var.j(obj, this, qx3Var);
            if (this.f8903b == this.f8904c) {
            } else {
                throw ny3.g();
            }
        } finally {
            this.f8904c = i10;
        }
    }

    private final void P(Object obj, d04 d04Var, qx3 qx3Var) throws ny3 {
        int iS = this.f8902a.s();
        fx3 fx3Var = this.f8902a;
        if (fx3Var.f8473a >= fx3Var.f8474b) {
            throw new ny3("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
        }
        int iL = fx3Var.l(iS);
        this.f8902a.f8473a++;
        d04Var.j(obj, this, qx3Var);
        this.f8902a.B(0);
        r5.f8473a--;
        this.f8902a.a(iL);
    }

    private final void Q(int i10) throws ny3 {
        if (this.f8902a.k() != i10) {
            throw ny3.k();
        }
    }

    private final void R(int i10) throws my3 {
        if ((this.f8903b & 7) != i10) {
            throw ny3.a();
        }
    }

    private static final void S(int i10) throws ny3 {
        if ((i10 & 3) != 0) {
            throw ny3.g();
        }
    }

    private static final void T(int i10) throws ny3 {
        if ((i10 & 7) != 0) {
            throw ny3.g();
        }
    }

    public static gx3 U(fx3 fx3Var) {
        gx3 gx3Var = fx3Var.f8475c;
        return gx3Var != null ? gx3Var : new gx3(fx3Var);
    }

    @Override // com.google.android.gms.internal.ads.uz3
    public final void A(List list) throws ny3 {
        int iR;
        int i10 = this.f8903b & 7;
        if (i10 == 1) {
            do {
                list.add(Double.valueOf(this.f8902a.i()));
                if (this.f8902a.b()) {
                    return;
                } else {
                    iR = this.f8902a.r();
                }
            } while (iR == this.f8903b);
            this.f8905d = iR;
            return;
        }
        if (i10 != 2) {
            throw ny3.a();
        }
        int iS = this.f8902a.s();
        T(iS);
        int iK = this.f8902a.k() + iS;
        do {
            list.add(Double.valueOf(this.f8902a.i()));
        } while (this.f8902a.k() < iK);
    }

    @Override // com.google.android.gms.internal.ads.uz3
    public final void B(List list) throws ny3 {
        int iR;
        int iR2;
        if (!(list instanceof cy3)) {
            int i10 = this.f8903b & 7;
            if (i10 == 0) {
                do {
                    list.add(Integer.valueOf(this.f8902a.q()));
                    if (this.f8902a.b()) {
                        return;
                    } else {
                        iR = this.f8902a.r();
                    }
                } while (iR == this.f8903b);
                this.f8905d = iR;
                return;
            }
            if (i10 != 2) {
                throw ny3.a();
            }
            int iK = this.f8902a.k() + this.f8902a.s();
            do {
                list.add(Integer.valueOf(this.f8902a.q()));
            } while (this.f8902a.k() < iK);
            Q(iK);
            return;
        }
        cy3 cy3Var = (cy3) list;
        int i11 = this.f8903b & 7;
        if (i11 == 0) {
            do {
                cy3Var.X(this.f8902a.q());
                if (this.f8902a.b()) {
                    return;
                } else {
                    iR2 = this.f8902a.r();
                }
            } while (iR2 == this.f8903b);
            this.f8905d = iR2;
            return;
        }
        if (i11 != 2) {
            throw ny3.a();
        }
        int iK2 = this.f8902a.k() + this.f8902a.s();
        do {
            cy3Var.X(this.f8902a.q());
        } while (this.f8902a.k() < iK2);
        Q(iK2);
    }

    @Override // com.google.android.gms.internal.ads.uz3
    public final void C(List list) throws my3 {
        int iR;
        if ((this.f8903b & 7) != 2) {
            throw ny3.a();
        }
        do {
            list.add(o());
            if (this.f8902a.b()) {
                return;
            } else {
                iR = this.f8902a.r();
            }
        } while (iR == this.f8903b);
        this.f8905d = iR;
    }

    @Override // com.google.android.gms.internal.ads.uz3
    public final void D(List list) throws ny3 {
        int iR;
        int iR2;
        if (!(list instanceof cy3)) {
            int i10 = this.f8903b & 7;
            if (i10 == 0) {
                do {
                    list.add(Integer.valueOf(this.f8902a.o()));
                    if (this.f8902a.b()) {
                        return;
                    } else {
                        iR = this.f8902a.r();
                    }
                } while (iR == this.f8903b);
                this.f8905d = iR;
                return;
            }
            if (i10 != 2) {
                throw ny3.a();
            }
            int iK = this.f8902a.k() + this.f8902a.s();
            do {
                list.add(Integer.valueOf(this.f8902a.o()));
            } while (this.f8902a.k() < iK);
            Q(iK);
            return;
        }
        cy3 cy3Var = (cy3) list;
        int i11 = this.f8903b & 7;
        if (i11 == 0) {
            do {
                cy3Var.X(this.f8902a.o());
                if (this.f8902a.b()) {
                    return;
                } else {
                    iR2 = this.f8902a.r();
                }
            } while (iR2 == this.f8903b);
            this.f8905d = iR2;
            return;
        }
        if (i11 != 2) {
            throw ny3.a();
        }
        int iK2 = this.f8902a.k() + this.f8902a.s();
        do {
            cy3Var.X(this.f8902a.o());
        } while (this.f8902a.k() < iK2);
        Q(iK2);
    }

    @Override // com.google.android.gms.internal.ads.uz3
    public final void E(Object obj, d04 d04Var, qx3 qx3Var) throws ny3 {
        R(2);
        P(obj, d04Var, qx3Var);
    }

    @Override // com.google.android.gms.internal.ads.uz3
    public final void F(List list) throws ny3 {
        int iR;
        int iR2;
        if (!(list instanceof cy3)) {
            int i10 = this.f8903b & 7;
            if (i10 == 0) {
                do {
                    list.add(Integer.valueOf(this.f8902a.s()));
                    if (this.f8902a.b()) {
                        return;
                    } else {
                        iR = this.f8902a.r();
                    }
                } while (iR == this.f8903b);
                this.f8905d = iR;
                return;
            }
            if (i10 != 2) {
                throw ny3.a();
            }
            int iK = this.f8902a.k() + this.f8902a.s();
            do {
                list.add(Integer.valueOf(this.f8902a.s()));
            } while (this.f8902a.k() < iK);
            Q(iK);
            return;
        }
        cy3 cy3Var = (cy3) list;
        int i11 = this.f8903b & 7;
        if (i11 == 0) {
            do {
                cy3Var.X(this.f8902a.s());
                if (this.f8902a.b()) {
                    return;
                } else {
                    iR2 = this.f8902a.r();
                }
            } while (iR2 == this.f8903b);
            this.f8905d = iR2;
            return;
        }
        if (i11 != 2) {
            throw ny3.a();
        }
        int iK2 = this.f8902a.k() + this.f8902a.s();
        do {
            cy3Var.X(this.f8902a.s());
        } while (this.f8902a.k() < iK2);
        Q(iK2);
    }

    @Override // com.google.android.gms.internal.ads.uz3
    public final boolean G() throws my3 {
        R(0);
        return this.f8902a.c();
    }

    @Override // com.google.android.gms.internal.ads.uz3
    public final void H(List list) throws ny3 {
        int iR;
        int iR2;
        if (!(list instanceof zy3)) {
            int i10 = this.f8903b & 7;
            if (i10 == 1) {
                do {
                    list.add(Long.valueOf(this.f8902a.v()));
                    if (this.f8902a.b()) {
                        return;
                    } else {
                        iR = this.f8902a.r();
                    }
                } while (iR == this.f8903b);
                this.f8905d = iR;
                return;
            }
            if (i10 != 2) {
                throw ny3.a();
            }
            int iS = this.f8902a.s();
            T(iS);
            int iK = this.f8902a.k() + iS;
            do {
                list.add(Long.valueOf(this.f8902a.v()));
            } while (this.f8902a.k() < iK);
            return;
        }
        zy3 zy3Var = (zy3) list;
        int i11 = this.f8903b & 7;
        if (i11 == 1) {
            do {
                zy3Var.i(this.f8902a.v());
                if (this.f8902a.b()) {
                    return;
                } else {
                    iR2 = this.f8902a.r();
                }
            } while (iR2 == this.f8903b);
            this.f8905d = iR2;
            return;
        }
        if (i11 != 2) {
            throw ny3.a();
        }
        int iS2 = this.f8902a.s();
        T(iS2);
        int iK2 = this.f8902a.k() + iS2;
        do {
            zy3Var.i(this.f8902a.v());
        } while (this.f8902a.k() < iK2);
    }

    @Override // com.google.android.gms.internal.ads.uz3
    public final boolean I() {
        int i10;
        if (this.f8902a.b() || (i10 = this.f8903b) == this.f8904c) {
            return false;
        }
        return this.f8902a.d(i10);
    }

    @Override // com.google.android.gms.internal.ads.uz3
    public final void J(List list) throws ny3 {
        int iR;
        int i10 = this.f8903b & 7;
        if (i10 == 0) {
            do {
                list.add(Boolean.valueOf(this.f8902a.c()));
                if (this.f8902a.b()) {
                    return;
                } else {
                    iR = this.f8902a.r();
                }
            } while (iR == this.f8903b);
            this.f8905d = iR;
            return;
        }
        if (i10 != 2) {
            throw ny3.a();
        }
        int iK = this.f8902a.k() + this.f8902a.s();
        do {
            list.add(Boolean.valueOf(this.f8902a.c()));
        } while (this.f8902a.k() < iK);
        Q(iK);
    }

    @Override // com.google.android.gms.internal.ads.uz3
    public final void K(List list) throws ny3 {
        int iR;
        int iR2;
        if (!(list instanceof cy3)) {
            int i10 = this.f8903b & 7;
            if (i10 == 2) {
                int iS = this.f8902a.s();
                S(iS);
                int iK = this.f8902a.k() + iS;
                do {
                    list.add(Integer.valueOf(this.f8902a.p()));
                } while (this.f8902a.k() < iK);
                return;
            }
            if (i10 != 5) {
                throw ny3.a();
            }
            do {
                list.add(Integer.valueOf(this.f8902a.p()));
                if (this.f8902a.b()) {
                    return;
                } else {
                    iR = this.f8902a.r();
                }
            } while (iR == this.f8903b);
            this.f8905d = iR;
            return;
        }
        cy3 cy3Var = (cy3) list;
        int i11 = this.f8903b & 7;
        if (i11 == 2) {
            int iS2 = this.f8902a.s();
            S(iS2);
            int iK2 = this.f8902a.k() + iS2;
            do {
                cy3Var.X(this.f8902a.p());
            } while (this.f8902a.k() < iK2);
            return;
        }
        if (i11 != 5) {
            throw ny3.a();
        }
        do {
            cy3Var.X(this.f8902a.p());
            if (this.f8902a.b()) {
                return;
            } else {
                iR2 = this.f8902a.r();
            }
        } while (iR2 == this.f8903b);
        this.f8905d = iR2;
    }

    @Override // com.google.android.gms.internal.ads.uz3
    public final void L(List list) throws ny3 {
        int iR;
        int iR2;
        if (!(list instanceof cy3)) {
            int i10 = this.f8903b & 7;
            if (i10 == 2) {
                int iS = this.f8902a.s();
                S(iS);
                int iK = this.f8902a.k() + iS;
                do {
                    list.add(Integer.valueOf(this.f8902a.n()));
                } while (this.f8902a.k() < iK);
                return;
            }
            if (i10 != 5) {
                throw ny3.a();
            }
            do {
                list.add(Integer.valueOf(this.f8902a.n()));
                if (this.f8902a.b()) {
                    return;
                } else {
                    iR = this.f8902a.r();
                }
            } while (iR == this.f8903b);
            this.f8905d = iR;
            return;
        }
        cy3 cy3Var = (cy3) list;
        int i11 = this.f8903b & 7;
        if (i11 == 2) {
            int iS2 = this.f8902a.s();
            S(iS2);
            int iK2 = this.f8902a.k() + iS2;
            do {
                cy3Var.X(this.f8902a.n());
            } while (this.f8902a.k() < iK2);
            return;
        }
        if (i11 != 5) {
            throw ny3.a();
        }
        do {
            cy3Var.X(this.f8902a.n());
            if (this.f8902a.b()) {
                return;
            } else {
                iR2 = this.f8902a.r();
            }
        } while (iR2 == this.f8903b);
        this.f8905d = iR2;
    }

    @Override // com.google.android.gms.internal.ads.uz3
    public final void M(List list) throws ny3 {
        int iR;
        int i10 = this.f8903b & 7;
        if (i10 == 2) {
            int iS = this.f8902a.s();
            S(iS);
            int iK = this.f8902a.k() + iS;
            do {
                list.add(Float.valueOf(this.f8902a.j()));
            } while (this.f8902a.k() < iK);
            return;
        }
        if (i10 != 5) {
            throw ny3.a();
        }
        do {
            list.add(Float.valueOf(this.f8902a.j()));
            if (this.f8902a.b()) {
                return;
            } else {
                iR = this.f8902a.r();
            }
        } while (iR == this.f8903b);
        this.f8905d = iR;
    }

    public final void N(List list, boolean z10) throws my3 {
        int iR;
        int iR2;
        if ((this.f8903b & 7) != 2) {
            throw ny3.a();
        }
        if (!(list instanceof ry3) || z10) {
            do {
                list.add(z10 ? t() : r());
                if (this.f8902a.b()) {
                    return;
                } else {
                    iR = this.f8902a.r();
                }
            } while (iR == this.f8903b);
            this.f8905d = iR;
            return;
        }
        ry3 ry3Var = (ry3) list;
        do {
            ry3Var.m(o());
            if (this.f8902a.b()) {
                return;
            } else {
                iR2 = this.f8902a.r();
            }
        } while (iR2 == this.f8903b);
        this.f8905d = iR2;
    }

    @Override // com.google.android.gms.internal.ads.uz3
    public final double a() throws my3 {
        R(1);
        return this.f8902a.i();
    }

    @Override // com.google.android.gms.internal.ads.uz3
    public final float b() throws my3 {
        R(5);
        return this.f8902a.j();
    }

    @Override // com.google.android.gms.internal.ads.uz3
    public final int c() throws my3 {
        R(0);
        return this.f8902a.m();
    }

    @Override // com.google.android.gms.internal.ads.uz3
    public final int d() {
        int iR = this.f8905d;
        if (iR != 0) {
            this.f8903b = iR;
            this.f8905d = 0;
        } else {
            iR = this.f8902a.r();
            this.f8903b = iR;
        }
        if (iR == 0 || iR == this.f8904c) {
            return Integer.MAX_VALUE;
        }
        return iR >>> 3;
    }

    @Override // com.google.android.gms.internal.ads.uz3
    public final int e() throws my3 {
        R(5);
        return this.f8902a.n();
    }

    @Override // com.google.android.gms.internal.ads.uz3
    public final int f() {
        return this.f8903b;
    }

    @Override // com.google.android.gms.internal.ads.uz3
    public final int g() throws my3 {
        R(5);
        return this.f8902a.p();
    }

    @Override // com.google.android.gms.internal.ads.uz3
    public final int h() throws my3 {
        R(0);
        return this.f8902a.o();
    }

    @Override // com.google.android.gms.internal.ads.uz3
    public final int i() throws my3 {
        R(0);
        return this.f8902a.q();
    }

    @Override // com.google.android.gms.internal.ads.uz3
    public final int j() throws my3 {
        R(0);
        return this.f8902a.s();
    }

    @Override // com.google.android.gms.internal.ads.uz3
    public final long k() throws my3 {
        R(1);
        return this.f8902a.t();
    }

    @Override // com.google.android.gms.internal.ads.uz3
    public final long l() throws my3 {
        R(0);
        return this.f8902a.u();
    }

    @Override // com.google.android.gms.internal.ads.uz3
    public final long m() throws my3 {
        R(0);
        return this.f8902a.w();
    }

    @Override // com.google.android.gms.internal.ads.uz3
    public final long n() throws my3 {
        R(1);
        return this.f8902a.v();
    }

    @Override // com.google.android.gms.internal.ads.uz3
    public final ww3 o() throws my3 {
        R(2);
        return this.f8902a.y();
    }

    @Override // com.google.android.gms.internal.ads.uz3
    public final long p() throws my3 {
        R(0);
        return this.f8902a.x();
    }

    @Override // com.google.android.gms.internal.ads.uz3
    public final void q(List list) throws ny3 {
        int iR;
        int iR2;
        if (!(list instanceof zy3)) {
            int i10 = this.f8903b & 7;
            if (i10 == 0) {
                do {
                    list.add(Long.valueOf(this.f8902a.w()));
                    if (this.f8902a.b()) {
                        return;
                    } else {
                        iR = this.f8902a.r();
                    }
                } while (iR == this.f8903b);
                this.f8905d = iR;
                return;
            }
            if (i10 != 2) {
                throw ny3.a();
            }
            int iK = this.f8902a.k() + this.f8902a.s();
            do {
                list.add(Long.valueOf(this.f8902a.w()));
            } while (this.f8902a.k() < iK);
            Q(iK);
            return;
        }
        zy3 zy3Var = (zy3) list;
        int i11 = this.f8903b & 7;
        if (i11 == 0) {
            do {
                zy3Var.i(this.f8902a.w());
                if (this.f8902a.b()) {
                    return;
                } else {
                    iR2 = this.f8902a.r();
                }
            } while (iR2 == this.f8903b);
            this.f8905d = iR2;
            return;
        }
        if (i11 != 2) {
            throw ny3.a();
        }
        int iK2 = this.f8902a.k() + this.f8902a.s();
        do {
            zy3Var.i(this.f8902a.w());
        } while (this.f8902a.k() < iK2);
        Q(iK2);
    }

    @Override // com.google.android.gms.internal.ads.uz3
    public final String r() throws my3 {
        R(2);
        return this.f8902a.z();
    }

    @Override // com.google.android.gms.internal.ads.uz3
    public final void s(List list, d04 d04Var, qx3 qx3Var) throws ny3 {
        int iR;
        int i10 = this.f8903b;
        if ((i10 & 7) != 2) {
            throw ny3.a();
        }
        do {
            Object objC = d04Var.c();
            P(objC, d04Var, qx3Var);
            d04Var.d(objC);
            list.add(objC);
            if (this.f8902a.b() || this.f8905d != 0) {
                return;
            } else {
                iR = this.f8902a.r();
            }
        } while (iR == i10);
        this.f8905d = iR;
    }

    @Override // com.google.android.gms.internal.ads.uz3
    public final String t() throws my3 {
        R(2);
        return this.f8902a.A();
    }

    @Override // com.google.android.gms.internal.ads.uz3
    public final void u(List list) throws ny3 {
        int iR;
        int iR2;
        if (!(list instanceof cy3)) {
            int i10 = this.f8903b & 7;
            if (i10 == 0) {
                do {
                    list.add(Integer.valueOf(this.f8902a.m()));
                    if (this.f8902a.b()) {
                        return;
                    } else {
                        iR = this.f8902a.r();
                    }
                } while (iR == this.f8903b);
                this.f8905d = iR;
                return;
            }
            if (i10 != 2) {
                throw ny3.a();
            }
            int iK = this.f8902a.k() + this.f8902a.s();
            do {
                list.add(Integer.valueOf(this.f8902a.m()));
            } while (this.f8902a.k() < iK);
            Q(iK);
            return;
        }
        cy3 cy3Var = (cy3) list;
        int i11 = this.f8903b & 7;
        if (i11 == 0) {
            do {
                cy3Var.X(this.f8902a.m());
                if (this.f8902a.b()) {
                    return;
                } else {
                    iR2 = this.f8902a.r();
                }
            } while (iR2 == this.f8903b);
            this.f8905d = iR2;
            return;
        }
        if (i11 != 2) {
            throw ny3.a();
        }
        int iK2 = this.f8902a.k() + this.f8902a.s();
        do {
            cy3Var.X(this.f8902a.m());
        } while (this.f8902a.k() < iK2);
        Q(iK2);
    }

    @Override // com.google.android.gms.internal.ads.uz3
    public final void v(List list) throws ny3 {
        int iR;
        int iR2;
        if (!(list instanceof zy3)) {
            int i10 = this.f8903b & 7;
            if (i10 == 0) {
                do {
                    list.add(Long.valueOf(this.f8902a.u()));
                    if (this.f8902a.b()) {
                        return;
                    } else {
                        iR = this.f8902a.r();
                    }
                } while (iR == this.f8903b);
                this.f8905d = iR;
                return;
            }
            if (i10 != 2) {
                throw ny3.a();
            }
            int iK = this.f8902a.k() + this.f8902a.s();
            do {
                list.add(Long.valueOf(this.f8902a.u()));
            } while (this.f8902a.k() < iK);
            Q(iK);
            return;
        }
        zy3 zy3Var = (zy3) list;
        int i11 = this.f8903b & 7;
        if (i11 == 0) {
            do {
                zy3Var.i(this.f8902a.u());
                if (this.f8902a.b()) {
                    return;
                } else {
                    iR2 = this.f8902a.r();
                }
            } while (iR2 == this.f8903b);
            this.f8905d = iR2;
            return;
        }
        if (i11 != 2) {
            throw ny3.a();
        }
        int iK2 = this.f8902a.k() + this.f8902a.s();
        do {
            zy3Var.i(this.f8902a.u());
        } while (this.f8902a.k() < iK2);
        Q(iK2);
    }

    @Override // com.google.android.gms.internal.ads.uz3
    public final void w(List list) throws ny3 {
        int iR;
        int iR2;
        if (!(list instanceof zy3)) {
            int i10 = this.f8903b & 7;
            if (i10 == 1) {
                do {
                    list.add(Long.valueOf(this.f8902a.t()));
                    if (this.f8902a.b()) {
                        return;
                    } else {
                        iR = this.f8902a.r();
                    }
                } while (iR == this.f8903b);
                this.f8905d = iR;
                return;
            }
            if (i10 != 2) {
                throw ny3.a();
            }
            int iS = this.f8902a.s();
            T(iS);
            int iK = this.f8902a.k() + iS;
            do {
                list.add(Long.valueOf(this.f8902a.t()));
            } while (this.f8902a.k() < iK);
            return;
        }
        zy3 zy3Var = (zy3) list;
        int i11 = this.f8903b & 7;
        if (i11 == 1) {
            do {
                zy3Var.i(this.f8902a.t());
                if (this.f8902a.b()) {
                    return;
                } else {
                    iR2 = this.f8902a.r();
                }
            } while (iR2 == this.f8903b);
            this.f8905d = iR2;
            return;
        }
        if (i11 != 2) {
            throw ny3.a();
        }
        int iS2 = this.f8902a.s();
        T(iS2);
        int iK2 = this.f8902a.k() + iS2;
        do {
            zy3Var.i(this.f8902a.t());
        } while (this.f8902a.k() < iK2);
    }

    @Override // com.google.android.gms.internal.ads.uz3
    public final void x(Object obj, d04 d04Var, qx3 qx3Var) throws my3 {
        R(3);
        O(obj, d04Var, qx3Var);
    }

    @Override // com.google.android.gms.internal.ads.uz3
    public final void y(List list, d04 d04Var, qx3 qx3Var) throws my3 {
        int iR;
        int i10 = this.f8903b;
        if ((i10 & 7) != 3) {
            throw ny3.a();
        }
        do {
            Object objC = d04Var.c();
            O(objC, d04Var, qx3Var);
            d04Var.d(objC);
            list.add(objC);
            if (this.f8902a.b() || this.f8905d != 0) {
                return;
            } else {
                iR = this.f8902a.r();
            }
        } while (iR == i10);
        this.f8905d = iR;
    }

    @Override // com.google.android.gms.internal.ads.uz3
    public final void z(List list) throws ny3 {
        int iR;
        int iR2;
        if (!(list instanceof zy3)) {
            int i10 = this.f8903b & 7;
            if (i10 == 0) {
                do {
                    list.add(Long.valueOf(this.f8902a.x()));
                    if (this.f8902a.b()) {
                        return;
                    } else {
                        iR = this.f8902a.r();
                    }
                } while (iR == this.f8903b);
                this.f8905d = iR;
                return;
            }
            if (i10 != 2) {
                throw ny3.a();
            }
            int iK = this.f8902a.k() + this.f8902a.s();
            do {
                list.add(Long.valueOf(this.f8902a.x()));
            } while (this.f8902a.k() < iK);
            Q(iK);
            return;
        }
        zy3 zy3Var = (zy3) list;
        int i11 = this.f8903b & 7;
        if (i11 == 0) {
            do {
                zy3Var.i(this.f8902a.x());
                if (this.f8902a.b()) {
                    return;
                } else {
                    iR2 = this.f8902a.r();
                }
            } while (iR2 == this.f8903b);
            this.f8905d = iR2;
            return;
        }
        if (i11 != 2) {
            throw ny3.a();
        }
        int iK2 = this.f8902a.k() + this.f8902a.s();
        do {
            zy3Var.i(this.f8902a.x());
        } while (this.f8902a.k() < iK2);
        Q(iK2);
    }
}
