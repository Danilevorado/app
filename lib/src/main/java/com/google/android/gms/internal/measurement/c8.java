package com.google.android.gms.internal.measurement;

import java.util.Objects;

/* loaded from: classes.dex */
final class c8 extends f8 {

    /* renamed from: d, reason: collision with root package name */
    private final byte[] f18878d;

    /* renamed from: e, reason: collision with root package name */
    private final int f18879e;

    /* renamed from: f, reason: collision with root package name */
    private int f18880f;

    c8(byte[] bArr, int i10, int i11) {
        super(null);
        Objects.requireNonNull(bArr, "buffer");
        int length = bArr.length;
        if (((length - i11) | i11) < 0) {
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(length), 0, Integer.valueOf(i11)));
        }
        this.f18878d = bArr;
        this.f18880f = 0;
        this.f18879e = i11;
    }

    public final void D(byte[] bArr, int i10, int i11) {
        try {
            System.arraycopy(bArr, 0, this.f18878d, this.f18880f, i11);
            this.f18880f += i11;
        } catch (IndexOutOfBoundsException e5) {
            throw new d8(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f18880f), Integer.valueOf(this.f18879e), Integer.valueOf(i11)), e5);
        }
    }

    public final void E(String str) throws d8 {
        int i10 = this.f18880f;
        try {
            int iA = f8.a(str.length() * 3);
            int iA2 = f8.a(str.length());
            if (iA2 != iA) {
                u(fb.c(str));
                byte[] bArr = this.f18878d;
                int i11 = this.f18880f;
                this.f18880f = fb.b(str, bArr, i11, this.f18879e - i11);
                return;
            }
            int i12 = i10 + iA2;
            this.f18880f = i12;
            int iB = fb.b(str, this.f18878d, i12, this.f18879e - i12);
            this.f18880f = i10;
            u((iB - i10) - iA2);
            this.f18880f = iB;
        } catch (eb e5) {
            this.f18880f = i10;
            e(str, e5);
        } catch (IndexOutOfBoundsException e10) {
            throw new d8(e10);
        }
    }

    @Override // com.google.android.gms.internal.measurement.f8
    public final int g() {
        return this.f18879e - this.f18880f;
    }

    @Override // com.google.android.gms.internal.measurement.f8
    public final void h(byte b10) throws d8 {
        try {
            byte[] bArr = this.f18878d;
            int i10 = this.f18880f;
            this.f18880f = i10 + 1;
            bArr[i10] = b10;
        } catch (IndexOutOfBoundsException e5) {
            throw new d8(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f18880f), Integer.valueOf(this.f18879e), 1), e5);
        }
    }

    @Override // com.google.android.gms.internal.measurement.f8
    public final void i(int i10, boolean z10) throws d8 {
        u(i10 << 3);
        h(z10 ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.gms.internal.measurement.f8
    public final void j(int i10, x7 x7Var) throws d8 {
        u((i10 << 3) | 2);
        u(x7Var.h());
        x7Var.o(this);
    }

    @Override // com.google.android.gms.internal.measurement.f8
    public final void k(int i10, int i11) throws d8 {
        u((i10 << 3) | 5);
        l(i11);
    }

    @Override // com.google.android.gms.internal.measurement.f8
    public final void l(int i10) throws d8 {
        try {
            byte[] bArr = this.f18878d;
            int i11 = this.f18880f;
            int i12 = i11 + 1;
            this.f18880f = i12;
            bArr[i11] = (byte) (i10 & 255);
            int i13 = i12 + 1;
            this.f18880f = i13;
            bArr[i12] = (byte) ((i10 >> 8) & 255);
            int i14 = i13 + 1;
            this.f18880f = i14;
            bArr[i13] = (byte) ((i10 >> 16) & 255);
            this.f18880f = i14 + 1;
            bArr[i14] = (byte) ((i10 >> 24) & 255);
        } catch (IndexOutOfBoundsException e5) {
            throw new d8(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f18880f), Integer.valueOf(this.f18879e), 1), e5);
        }
    }

    @Override // com.google.android.gms.internal.measurement.f8
    public final void m(int i10, long j10) throws d8 {
        u((i10 << 3) | 1);
        n(j10);
    }

    @Override // com.google.android.gms.internal.measurement.f8
    public final void n(long j10) throws d8 {
        try {
            byte[] bArr = this.f18878d;
            int i10 = this.f18880f;
            int i11 = i10 + 1;
            this.f18880f = i11;
            bArr[i10] = (byte) (((int) j10) & 255);
            int i12 = i11 + 1;
            this.f18880f = i12;
            bArr[i11] = (byte) (((int) (j10 >> 8)) & 255);
            int i13 = i12 + 1;
            this.f18880f = i13;
            bArr[i12] = (byte) (((int) (j10 >> 16)) & 255);
            int i14 = i13 + 1;
            this.f18880f = i14;
            bArr[i13] = (byte) (((int) (j10 >> 24)) & 255);
            int i15 = i14 + 1;
            this.f18880f = i15;
            bArr[i14] = (byte) (((int) (j10 >> 32)) & 255);
            int i16 = i15 + 1;
            this.f18880f = i16;
            bArr[i15] = (byte) (((int) (j10 >> 40)) & 255);
            int i17 = i16 + 1;
            this.f18880f = i17;
            bArr[i16] = (byte) (((int) (j10 >> 48)) & 255);
            this.f18880f = i17 + 1;
            bArr[i17] = (byte) (((int) (j10 >> 56)) & 255);
        } catch (IndexOutOfBoundsException e5) {
            throw new d8(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f18880f), Integer.valueOf(this.f18879e), 1), e5);
        }
    }

    @Override // com.google.android.gms.internal.measurement.f8
    public final void o(int i10, int i11) throws d8 {
        u(i10 << 3);
        p(i11);
    }

    @Override // com.google.android.gms.internal.measurement.f8
    public final void p(int i10) throws d8 {
        if (i10 >= 0) {
            u(i10);
        } else {
            w(i10);
        }
    }

    @Override // com.google.android.gms.internal.measurement.f8
    public final void q(byte[] bArr, int i10, int i11) {
        D(bArr, 0, i11);
    }

    @Override // com.google.android.gms.internal.measurement.f8
    public final void r(int i10, String str) throws d8 {
        u((i10 << 3) | 2);
        E(str);
    }

    @Override // com.google.android.gms.internal.measurement.f8
    public final void s(int i10, int i11) throws d8 {
        u((i10 << 3) | i11);
    }

    @Override // com.google.android.gms.internal.measurement.f8
    public final void t(int i10, int i11) throws d8 {
        u(i10 << 3);
        u(i11);
    }

    @Override // com.google.android.gms.internal.measurement.f8
    public final void u(int i10) throws d8 {
        while ((i10 & (-128)) != 0) {
            try {
                byte[] bArr = this.f18878d;
                int i11 = this.f18880f;
                this.f18880f = i11 + 1;
                bArr[i11] = (byte) ((i10 & 127) | 128);
                i10 >>>= 7;
            } catch (IndexOutOfBoundsException e5) {
                throw new d8(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f18880f), Integer.valueOf(this.f18879e), 1), e5);
            }
        }
        byte[] bArr2 = this.f18878d;
        int i12 = this.f18880f;
        this.f18880f = i12 + 1;
        bArr2[i12] = (byte) i10;
    }

    @Override // com.google.android.gms.internal.measurement.f8
    public final void v(int i10, long j10) throws d8 {
        u(i10 << 3);
        w(j10);
    }

    @Override // com.google.android.gms.internal.measurement.f8
    public final void w(long j10) throws d8 {
        if (f8.f18944c && this.f18879e - this.f18880f >= 10) {
            while ((j10 & (-128)) != 0) {
                byte[] bArr = this.f18878d;
                int i10 = this.f18880f;
                this.f18880f = i10 + 1;
                za.s(bArr, i10, (byte) ((((int) j10) & 127) | 128));
                j10 >>>= 7;
            }
            byte[] bArr2 = this.f18878d;
            int i11 = this.f18880f;
            this.f18880f = i11 + 1;
            za.s(bArr2, i11, (byte) j10);
            return;
        }
        while ((j10 & (-128)) != 0) {
            try {
                byte[] bArr3 = this.f18878d;
                int i12 = this.f18880f;
                this.f18880f = i12 + 1;
                bArr3[i12] = (byte) ((((int) j10) & 127) | 128);
                j10 >>>= 7;
            } catch (IndexOutOfBoundsException e5) {
                throw new d8(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f18880f), Integer.valueOf(this.f18879e), 1), e5);
            }
        }
        byte[] bArr4 = this.f18878d;
        int i13 = this.f18880f;
        this.f18880f = i13 + 1;
        bArr4[i13] = (byte) j10;
    }
}
