package com.google.android.gms.internal.play_billing;

/* loaded from: classes.dex */
final class v0 extends y0 {

    /* renamed from: d, reason: collision with root package name */
    private final byte[] f19655d;

    /* renamed from: e, reason: collision with root package name */
    private final int f19656e;

    /* renamed from: f, reason: collision with root package name */
    private int f19657f;

    v0(byte[] bArr, int i10, int i11) {
        super(null);
        int length = bArr.length;
        if (((length - i11) | i11) < 0) {
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(length), 0, Integer.valueOf(i11)));
        }
        this.f19655d = bArr;
        this.f19657f = 0;
        this.f19656e = i11;
    }

    public final void A(byte[] bArr, int i10, int i11) {
        try {
            System.arraycopy(bArr, 0, this.f19655d, this.f19657f, i11);
            this.f19657f += i11;
        } catch (IndexOutOfBoundsException e5) {
            throw new w0(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f19657f), Integer.valueOf(this.f19656e), Integer.valueOf(i11)), e5);
        }
    }

    public final void B(String str) throws w0 {
        int i10 = this.f19657f;
        try {
            int iW = y0.w(str.length() * 3);
            int iW2 = y0.w(str.length());
            if (iW2 != iW) {
                q(k4.c(str));
                byte[] bArr = this.f19655d;
                int i11 = this.f19657f;
                this.f19657f = k4.b(str, bArr, i11, this.f19656e - i11);
                return;
            }
            int i12 = i10 + iW2;
            this.f19657f = i12;
            int iB = k4.b(str, this.f19655d, i12, this.f19656e - i12);
            this.f19657f = i10;
            q((iB - i10) - iW2);
            this.f19657f = iB;
        } catch (j4 e5) {
            this.f19657f = i10;
            a(str, e5);
        } catch (IndexOutOfBoundsException e10) {
            throw new w0(e10);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.y0
    public final int c() {
        return this.f19656e - this.f19657f;
    }

    @Override // com.google.android.gms.internal.play_billing.y0
    public final void d(byte b10) throws w0 {
        try {
            byte[] bArr = this.f19655d;
            int i10 = this.f19657f;
            this.f19657f = i10 + 1;
            bArr[i10] = b10;
        } catch (IndexOutOfBoundsException e5) {
            throw new w0(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f19657f), Integer.valueOf(this.f19656e), 1), e5);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.y0
    public final void e(int i10, boolean z10) throws w0 {
        q(i10 << 3);
        d(z10 ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.gms.internal.play_billing.y0
    public final void f(int i10, q0 q0Var) {
        q((i10 << 3) | 2);
        q(q0Var.h());
        q0Var.o(this);
    }

    @Override // com.google.android.gms.internal.play_billing.y0
    public final void g(int i10, int i11) throws w0 {
        q((i10 << 3) | 5);
        h(i11);
    }

    @Override // com.google.android.gms.internal.play_billing.y0
    public final void h(int i10) throws w0 {
        try {
            byte[] bArr = this.f19655d;
            int i11 = this.f19657f;
            int i12 = i11 + 1;
            this.f19657f = i12;
            bArr[i11] = (byte) (i10 & 255);
            int i13 = i12 + 1;
            this.f19657f = i13;
            bArr[i12] = (byte) ((i10 >> 8) & 255);
            int i14 = i13 + 1;
            this.f19657f = i14;
            bArr[i13] = (byte) ((i10 >> 16) & 255);
            this.f19657f = i14 + 1;
            bArr[i14] = (byte) ((i10 >> 24) & 255);
        } catch (IndexOutOfBoundsException e5) {
            throw new w0(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f19657f), Integer.valueOf(this.f19656e), 1), e5);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.y0
    public final void i(int i10, long j10) throws w0 {
        q((i10 << 3) | 1);
        j(j10);
    }

    @Override // com.google.android.gms.internal.play_billing.y0
    public final void j(long j10) throws w0 {
        try {
            byte[] bArr = this.f19655d;
            int i10 = this.f19657f;
            int i11 = i10 + 1;
            this.f19657f = i11;
            bArr[i10] = (byte) (((int) j10) & 255);
            int i12 = i11 + 1;
            this.f19657f = i12;
            bArr[i11] = (byte) (((int) (j10 >> 8)) & 255);
            int i13 = i12 + 1;
            this.f19657f = i13;
            bArr[i12] = (byte) (((int) (j10 >> 16)) & 255);
            int i14 = i13 + 1;
            this.f19657f = i14;
            bArr[i13] = (byte) (((int) (j10 >> 24)) & 255);
            int i15 = i14 + 1;
            this.f19657f = i15;
            bArr[i14] = (byte) (((int) (j10 >> 32)) & 255);
            int i16 = i15 + 1;
            this.f19657f = i16;
            bArr[i15] = (byte) (((int) (j10 >> 40)) & 255);
            int i17 = i16 + 1;
            this.f19657f = i17;
            bArr[i16] = (byte) (((int) (j10 >> 48)) & 255);
            this.f19657f = i17 + 1;
            bArr[i17] = (byte) (((int) (j10 >> 56)) & 255);
        } catch (IndexOutOfBoundsException e5) {
            throw new w0(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f19657f), Integer.valueOf(this.f19656e), 1), e5);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.y0
    public final void k(int i10, int i11) throws w0 {
        q(i10 << 3);
        l(i11);
    }

    @Override // com.google.android.gms.internal.play_billing.y0
    public final void l(int i10) throws w0 {
        if (i10 >= 0) {
            q(i10);
        } else {
            s(i10);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.y0
    public final void m(byte[] bArr, int i10, int i11) {
        A(bArr, 0, i11);
    }

    @Override // com.google.android.gms.internal.play_billing.y0
    public final void n(int i10, String str) throws w0 {
        q((i10 << 3) | 2);
        B(str);
    }

    @Override // com.google.android.gms.internal.play_billing.y0
    public final void o(int i10, int i11) {
        q((i10 << 3) | i11);
    }

    @Override // com.google.android.gms.internal.play_billing.y0
    public final void p(int i10, int i11) {
        q(i10 << 3);
        q(i11);
    }

    @Override // com.google.android.gms.internal.play_billing.y0
    public final void q(int i10) {
        while ((i10 & (-128)) != 0) {
            try {
                byte[] bArr = this.f19655d;
                int i11 = this.f19657f;
                this.f19657f = i11 + 1;
                bArr[i11] = (byte) ((i10 | 128) & 255);
                i10 >>>= 7;
            } catch (IndexOutOfBoundsException e5) {
                throw new w0(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f19657f), Integer.valueOf(this.f19656e), 1), e5);
            }
        }
        byte[] bArr2 = this.f19655d;
        int i12 = this.f19657f;
        this.f19657f = i12 + 1;
        bArr2[i12] = (byte) i10;
    }

    @Override // com.google.android.gms.internal.play_billing.y0
    public final void r(int i10, long j10) throws w0 {
        q(i10 << 3);
        s(j10);
    }

    @Override // com.google.android.gms.internal.play_billing.y0
    public final void s(long j10) throws w0 {
        if (!y0.f19689c || this.f19656e - this.f19657f < 10) {
            while ((j10 & (-128)) != 0) {
                try {
                    byte[] bArr = this.f19655d;
                    int i10 = this.f19657f;
                    this.f19657f = i10 + 1;
                    bArr[i10] = (byte) ((((int) j10) | 128) & 255);
                    j10 >>>= 7;
                } catch (IndexOutOfBoundsException e5) {
                    throw new w0(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f19657f), Integer.valueOf(this.f19656e), 1), e5);
                }
            }
            byte[] bArr2 = this.f19655d;
            int i11 = this.f19657f;
            this.f19657f = i11 + 1;
            bArr2[i11] = (byte) j10;
            return;
        }
        while (true) {
            int i12 = (int) j10;
            if ((j10 & (-128)) == 0) {
                byte[] bArr3 = this.f19655d;
                int i13 = this.f19657f;
                this.f19657f = i13 + 1;
                f4.s(bArr3, i13, (byte) i12);
                return;
            }
            byte[] bArr4 = this.f19655d;
            int i14 = this.f19657f;
            this.f19657f = i14 + 1;
            f4.s(bArr4, i14, (byte) ((i12 | 128) & 255));
            j10 >>>= 7;
        }
    }
}
