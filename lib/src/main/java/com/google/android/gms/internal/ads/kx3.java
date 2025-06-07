package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes.dex */
final class kx3 extends hx3 {

    /* renamed from: i, reason: collision with root package name */
    private final OutputStream f11268i;

    kx3(OutputStream outputStream, int i10) {
        super(i10);
        this.f11268i = outputStream;
    }

    private final void I() throws IOException {
        this.f11268i.write(this.f9448e, 0, this.f9450g);
        this.f9450g = 0;
    }

    private final void J(int i10) throws IOException {
        if (this.f9449f - this.f9450g < i10) {
            I();
        }
    }

    public final void K(byte[] bArr, int i10, int i11) throws IOException {
        int i12 = this.f9449f;
        int i13 = this.f9450g;
        int i14 = i12 - i13;
        if (i14 >= i11) {
            System.arraycopy(bArr, i10, this.f9448e, i13, i11);
            this.f9450g += i11;
        } else {
            System.arraycopy(bArr, i10, this.f9448e, i13, i14);
            int i15 = i10 + i14;
            this.f9450g = this.f9449f;
            this.f9451h += i14;
            I();
            i11 -= i14;
            if (i11 <= this.f9449f) {
                System.arraycopy(bArr, i15, this.f9448e, 0, i11);
                this.f9450g = i11;
            } else {
                this.f11268i.write(bArr, i15, i11);
            }
        }
        this.f9451h += i11;
    }

    public final void L(String str) throws IOException {
        int iE;
        try {
            int length = str.length() * 3;
            int iB = mx3.b(length);
            int i10 = iB + length;
            int i11 = this.f9449f;
            if (i10 > i11) {
                byte[] bArr = new byte[length];
                int iD = y04.d(str, bArr, 0, length);
                w(iD);
                K(bArr, 0, iD);
                return;
            }
            if (i10 > i11 - this.f9450g) {
                I();
            }
            int iB2 = mx3.b(str.length());
            int i12 = this.f9450g;
            try {
                if (iB2 == iB) {
                    int i13 = i12 + iB2;
                    this.f9450g = i13;
                    int iD2 = y04.d(str, this.f9448e, i13, this.f9449f - i13);
                    this.f9450g = i12;
                    iE = (iD2 - i12) - iB2;
                    G(iE);
                    this.f9450g = iD2;
                } else {
                    iE = y04.e(str);
                    G(iE);
                    this.f9450g = y04.d(str, this.f9448e, this.f9450g, iE);
                }
                this.f9451h += iE;
            } catch (x04 e5) {
                this.f9451h -= this.f9450g - i12;
                this.f9450g = i12;
                throw e5;
            } catch (ArrayIndexOutOfBoundsException e10) {
                throw new jx3(e10);
            }
        } catch (x04 e11) {
            f(str, e11);
        }
    }

    @Override // com.google.android.gms.internal.ads.mx3, com.google.android.gms.internal.ads.lw3
    public final void a(byte[] bArr, int i10, int i11) throws IOException {
        K(bArr, i10, i11);
    }

    @Override // com.google.android.gms.internal.ads.mx3
    public final void h() throws IOException {
        if (this.f9450g > 0) {
            I();
        }
    }

    @Override // com.google.android.gms.internal.ads.mx3
    public final void i(byte b10) throws IOException {
        if (this.f9450g == this.f9449f) {
            I();
        }
        D(b10);
    }

    @Override // com.google.android.gms.internal.ads.mx3
    public final void j(int i10, boolean z10) throws IOException {
        J(11);
        G(i10 << 3);
        D(z10 ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.gms.internal.ads.mx3
    public final void k(int i10, ww3 ww3Var) throws IOException {
        w((i10 << 3) | 2);
        w(ww3Var.n());
        ww3Var.z(this);
    }

    @Override // com.google.android.gms.internal.ads.mx3
    public final void m(int i10, int i11) throws IOException {
        J(14);
        G((i10 << 3) | 5);
        E(i11);
    }

    @Override // com.google.android.gms.internal.ads.mx3
    public final void n(int i10) throws IOException {
        J(4);
        E(i10);
    }

    @Override // com.google.android.gms.internal.ads.mx3
    public final void o(int i10, long j10) throws IOException {
        J(18);
        G((i10 << 3) | 1);
        F(j10);
    }

    @Override // com.google.android.gms.internal.ads.mx3
    public final void p(long j10) throws IOException {
        J(8);
        F(j10);
    }

    @Override // com.google.android.gms.internal.ads.mx3
    public final void q(int i10, int i11) throws IOException {
        J(20);
        G(i10 << 3);
        if (i11 >= 0) {
            G(i11);
        } else {
            H(i11);
        }
    }

    @Override // com.google.android.gms.internal.ads.mx3
    public final void r(int i10) throws IOException {
        if (i10 >= 0) {
            w(i10);
        } else {
            y(i10);
        }
    }

    @Override // com.google.android.gms.internal.ads.mx3
    final void s(int i10, jz3 jz3Var, d04 d04Var) throws IOException {
        w((i10 << 3) | 2);
        w(((gw3) jz3Var).e(d04Var));
        d04Var.h(jz3Var, this.f12292a);
    }

    @Override // com.google.android.gms.internal.ads.mx3
    public final void t(int i10, String str) throws IOException {
        w((i10 << 3) | 2);
        L(str);
    }

    @Override // com.google.android.gms.internal.ads.mx3
    public final void u(int i10, int i11) throws IOException {
        w((i10 << 3) | i11);
    }

    @Override // com.google.android.gms.internal.ads.mx3
    public final void v(int i10, int i11) throws IOException {
        J(20);
        G(i10 << 3);
        G(i11);
    }

    @Override // com.google.android.gms.internal.ads.mx3
    public final void w(int i10) throws IOException {
        J(5);
        G(i10);
    }

    @Override // com.google.android.gms.internal.ads.mx3
    public final void x(int i10, long j10) throws IOException {
        J(20);
        G(i10 << 3);
        H(j10);
    }

    @Override // com.google.android.gms.internal.ads.mx3
    public final void y(long j10) throws IOException {
        J(10);
        H(j10);
    }
}
