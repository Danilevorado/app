package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes.dex */
final class ix3 extends mx3 {

    /* renamed from: e, reason: collision with root package name */
    private final byte[] f10208e;

    /* renamed from: f, reason: collision with root package name */
    private final int f10209f;

    /* renamed from: g, reason: collision with root package name */
    private int f10210g;

    ix3(byte[] bArr, int i10, int i11) {
        super(null);
        Objects.requireNonNull(bArr, "buffer");
        int length = bArr.length;
        if (((length - i11) | i11) < 0) {
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(length), 0, Integer.valueOf(i11)));
        }
        this.f10208e = bArr;
        this.f10210g = 0;
        this.f10209f = i11;
    }

    public final void D(byte[] bArr, int i10, int i11) throws jx3 {
        try {
            System.arraycopy(bArr, i10, this.f10208e, this.f10210g, i11);
            this.f10210g += i11;
        } catch (IndexOutOfBoundsException e5) {
            throw new jx3(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f10210g), Integer.valueOf(this.f10209f), Integer.valueOf(i11)), e5);
        }
    }

    public final void E(String str) throws jx3 {
        int i10 = this.f10210g;
        try {
            int iB = mx3.b(str.length() * 3);
            int iB2 = mx3.b(str.length());
            if (iB2 != iB) {
                w(y04.e(str));
                byte[] bArr = this.f10208e;
                int i11 = this.f10210g;
                this.f10210g = y04.d(str, bArr, i11, this.f10209f - i11);
                return;
            }
            int i12 = i10 + iB2;
            this.f10210g = i12;
            int iD = y04.d(str, this.f10208e, i12, this.f10209f - i12);
            this.f10210g = i10;
            w((iD - i10) - iB2);
            this.f10210g = iD;
        } catch (x04 e5) {
            this.f10210g = i10;
            f(str, e5);
        } catch (IndexOutOfBoundsException e10) {
            throw new jx3(e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.mx3, com.google.android.gms.internal.ads.lw3
    public final void a(byte[] bArr, int i10, int i11) throws jx3 {
        D(bArr, i10, i11);
    }

    @Override // com.google.android.gms.internal.ads.mx3
    public final void h() {
    }

    @Override // com.google.android.gms.internal.ads.mx3
    public final void i(byte b10) throws jx3 {
        try {
            byte[] bArr = this.f10208e;
            int i10 = this.f10210g;
            this.f10210g = i10 + 1;
            bArr[i10] = b10;
        } catch (IndexOutOfBoundsException e5) {
            throw new jx3(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f10210g), Integer.valueOf(this.f10209f), 1), e5);
        }
    }

    @Override // com.google.android.gms.internal.ads.mx3
    public final void j(int i10, boolean z10) throws jx3 {
        w(i10 << 3);
        i(z10 ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.gms.internal.ads.mx3
    public final void k(int i10, ww3 ww3Var) throws jx3 {
        w((i10 << 3) | 2);
        w(ww3Var.n());
        ww3Var.z(this);
    }

    @Override // com.google.android.gms.internal.ads.mx3
    public final int l() {
        return this.f10209f - this.f10210g;
    }

    @Override // com.google.android.gms.internal.ads.mx3
    public final void m(int i10, int i11) throws jx3 {
        w((i10 << 3) | 5);
        n(i11);
    }

    @Override // com.google.android.gms.internal.ads.mx3
    public final void n(int i10) throws jx3 {
        try {
            byte[] bArr = this.f10208e;
            int i11 = this.f10210g;
            int i12 = i11 + 1;
            this.f10210g = i12;
            bArr[i11] = (byte) (i10 & 255);
            int i13 = i12 + 1;
            this.f10210g = i13;
            bArr[i12] = (byte) ((i10 >> 8) & 255);
            int i14 = i13 + 1;
            this.f10210g = i14;
            bArr[i13] = (byte) ((i10 >> 16) & 255);
            this.f10210g = i14 + 1;
            bArr[i14] = (byte) ((i10 >> 24) & 255);
        } catch (IndexOutOfBoundsException e5) {
            throw new jx3(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f10210g), Integer.valueOf(this.f10209f), 1), e5);
        }
    }

    @Override // com.google.android.gms.internal.ads.mx3
    public final void o(int i10, long j10) throws jx3 {
        w((i10 << 3) | 1);
        p(j10);
    }

    @Override // com.google.android.gms.internal.ads.mx3
    public final void p(long j10) throws jx3 {
        try {
            byte[] bArr = this.f10208e;
            int i10 = this.f10210g;
            int i11 = i10 + 1;
            this.f10210g = i11;
            bArr[i10] = (byte) (((int) j10) & 255);
            int i12 = i11 + 1;
            this.f10210g = i12;
            bArr[i11] = (byte) (((int) (j10 >> 8)) & 255);
            int i13 = i12 + 1;
            this.f10210g = i13;
            bArr[i12] = (byte) (((int) (j10 >> 16)) & 255);
            int i14 = i13 + 1;
            this.f10210g = i14;
            bArr[i13] = (byte) (((int) (j10 >> 24)) & 255);
            int i15 = i14 + 1;
            this.f10210g = i15;
            bArr[i14] = (byte) (((int) (j10 >> 32)) & 255);
            int i16 = i15 + 1;
            this.f10210g = i16;
            bArr[i15] = (byte) (((int) (j10 >> 40)) & 255);
            int i17 = i16 + 1;
            this.f10210g = i17;
            bArr[i16] = (byte) (((int) (j10 >> 48)) & 255);
            this.f10210g = i17 + 1;
            bArr[i17] = (byte) (((int) (j10 >> 56)) & 255);
        } catch (IndexOutOfBoundsException e5) {
            throw new jx3(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f10210g), Integer.valueOf(this.f10209f), 1), e5);
        }
    }

    @Override // com.google.android.gms.internal.ads.mx3
    public final void q(int i10, int i11) throws jx3 {
        w(i10 << 3);
        r(i11);
    }

    @Override // com.google.android.gms.internal.ads.mx3
    public final void r(int i10) throws jx3 {
        if (i10 >= 0) {
            w(i10);
        } else {
            y(i10);
        }
    }

    @Override // com.google.android.gms.internal.ads.mx3
    final void s(int i10, jz3 jz3Var, d04 d04Var) throws jx3 {
        w((i10 << 3) | 2);
        w(((gw3) jz3Var).e(d04Var));
        d04Var.h(jz3Var, this.f12292a);
    }

    @Override // com.google.android.gms.internal.ads.mx3
    public final void t(int i10, String str) throws jx3 {
        w((i10 << 3) | 2);
        E(str);
    }

    @Override // com.google.android.gms.internal.ads.mx3
    public final void u(int i10, int i11) throws jx3 {
        w((i10 << 3) | i11);
    }

    @Override // com.google.android.gms.internal.ads.mx3
    public final void v(int i10, int i11) throws jx3 {
        w(i10 << 3);
        w(i11);
    }

    @Override // com.google.android.gms.internal.ads.mx3
    public final void w(int i10) throws jx3 {
        while ((i10 & (-128)) != 0) {
            try {
                byte[] bArr = this.f10208e;
                int i11 = this.f10210g;
                this.f10210g = i11 + 1;
                bArr[i11] = (byte) ((i10 & 127) | 128);
                i10 >>>= 7;
            } catch (IndexOutOfBoundsException e5) {
                throw new jx3(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f10210g), Integer.valueOf(this.f10209f), 1), e5);
            }
        }
        byte[] bArr2 = this.f10208e;
        int i12 = this.f10210g;
        this.f10210g = i12 + 1;
        bArr2[i12] = (byte) i10;
    }

    @Override // com.google.android.gms.internal.ads.mx3
    public final void x(int i10, long j10) throws jx3 {
        w(i10 << 3);
        y(j10);
    }

    @Override // com.google.android.gms.internal.ads.mx3
    public final void y(long j10) throws jx3 {
        if (mx3.f12290c && this.f10209f - this.f10210g >= 10) {
            while ((j10 & (-128)) != 0) {
                byte[] bArr = this.f10208e;
                int i10 = this.f10210g;
                this.f10210g = i10 + 1;
                t04.y(bArr, i10, (byte) ((((int) j10) & 127) | 128));
                j10 >>>= 7;
            }
            byte[] bArr2 = this.f10208e;
            int i11 = this.f10210g;
            this.f10210g = i11 + 1;
            t04.y(bArr2, i11, (byte) j10);
            return;
        }
        while ((j10 & (-128)) != 0) {
            try {
                byte[] bArr3 = this.f10208e;
                int i12 = this.f10210g;
                this.f10210g = i12 + 1;
                bArr3[i12] = (byte) ((((int) j10) & 127) | 128);
                j10 >>>= 7;
            } catch (IndexOutOfBoundsException e5) {
                throw new jx3(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f10210g), Integer.valueOf(this.f10209f), 1), e5);
            }
        }
        byte[] bArr4 = this.f10208e;
        int i13 = this.f10210g;
        this.f10210g = i13 + 1;
        bArr4[i13] = (byte) j10;
    }
}
