package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
abstract class hx3 extends mx3 {

    /* renamed from: e, reason: collision with root package name */
    final byte[] f9448e;

    /* renamed from: f, reason: collision with root package name */
    final int f9449f;

    /* renamed from: g, reason: collision with root package name */
    int f9450g;

    /* renamed from: h, reason: collision with root package name */
    int f9451h;

    hx3(int i10) {
        super(null);
        if (i10 < 0) {
            throw new IllegalArgumentException("bufferSize must be >= 0");
        }
        byte[] bArr = new byte[Math.max(i10, 20)];
        this.f9448e = bArr;
        this.f9449f = bArr.length;
    }

    final void D(byte b10) {
        byte[] bArr = this.f9448e;
        int i10 = this.f9450g;
        this.f9450g = i10 + 1;
        bArr[i10] = b10;
        this.f9451h++;
    }

    final void E(int i10) {
        byte[] bArr = this.f9448e;
        int i11 = this.f9450g;
        int i12 = i11 + 1;
        this.f9450g = i12;
        bArr[i11] = (byte) (i10 & 255);
        int i13 = i12 + 1;
        this.f9450g = i13;
        bArr[i12] = (byte) ((i10 >> 8) & 255);
        int i14 = i13 + 1;
        this.f9450g = i14;
        bArr[i13] = (byte) ((i10 >> 16) & 255);
        this.f9450g = i14 + 1;
        bArr[i14] = (byte) ((i10 >> 24) & 255);
        this.f9451h += 4;
    }

    final void F(long j10) {
        byte[] bArr = this.f9448e;
        int i10 = this.f9450g;
        int i11 = i10 + 1;
        this.f9450g = i11;
        bArr[i10] = (byte) (j10 & 255);
        int i12 = i11 + 1;
        this.f9450g = i12;
        bArr[i11] = (byte) ((j10 >> 8) & 255);
        int i13 = i12 + 1;
        this.f9450g = i13;
        bArr[i12] = (byte) ((j10 >> 16) & 255);
        int i14 = i13 + 1;
        this.f9450g = i14;
        bArr[i13] = (byte) (255 & (j10 >> 24));
        int i15 = i14 + 1;
        this.f9450g = i15;
        bArr[i14] = (byte) (((int) (j10 >> 32)) & 255);
        int i16 = i15 + 1;
        this.f9450g = i16;
        bArr[i15] = (byte) (((int) (j10 >> 40)) & 255);
        int i17 = i16 + 1;
        this.f9450g = i17;
        bArr[i16] = (byte) (((int) (j10 >> 48)) & 255);
        this.f9450g = i17 + 1;
        bArr[i17] = (byte) (((int) (j10 >> 56)) & 255);
        this.f9451h += 8;
    }

    final void G(int i10) {
        int i11;
        if (mx3.f12290c) {
            long j10 = this.f9450g;
            while ((i10 & (-128)) != 0) {
                byte[] bArr = this.f9448e;
                int i12 = this.f9450g;
                this.f9450g = i12 + 1;
                t04.y(bArr, i12, (byte) ((i10 & 127) | 128));
                i10 >>>= 7;
            }
            byte[] bArr2 = this.f9448e;
            int i13 = this.f9450g;
            this.f9450g = i13 + 1;
            t04.y(bArr2, i13, (byte) i10);
            i11 = this.f9451h + ((int) (this.f9450g - j10));
        } else {
            while ((i10 & (-128)) != 0) {
                byte[] bArr3 = this.f9448e;
                int i14 = this.f9450g;
                this.f9450g = i14 + 1;
                bArr3[i14] = (byte) ((i10 & 127) | 128);
                this.f9451h++;
                i10 >>>= 7;
            }
            byte[] bArr4 = this.f9448e;
            int i15 = this.f9450g;
            this.f9450g = i15 + 1;
            bArr4[i15] = (byte) i10;
            i11 = this.f9451h + 1;
        }
        this.f9451h = i11;
    }

    final void H(long j10) {
        if (!mx3.f12290c) {
            while ((j10 & (-128)) != 0) {
                byte[] bArr = this.f9448e;
                int i10 = this.f9450g;
                this.f9450g = i10 + 1;
                bArr[i10] = (byte) ((((int) j10) & 127) | 128);
                this.f9451h++;
                j10 >>>= 7;
            }
            byte[] bArr2 = this.f9448e;
            int i11 = this.f9450g;
            this.f9450g = i11 + 1;
            bArr2[i11] = (byte) j10;
            this.f9451h++;
            return;
        }
        long j11 = this.f9450g;
        while ((j10 & (-128)) != 0) {
            byte[] bArr3 = this.f9448e;
            int i12 = this.f9450g;
            this.f9450g = i12 + 1;
            t04.y(bArr3, i12, (byte) ((((int) j10) & 127) | 128));
            j10 >>>= 7;
        }
        byte[] bArr4 = this.f9448e;
        int i13 = this.f9450g;
        this.f9450g = i13 + 1;
        t04.y(bArr4, i13, (byte) j10);
        this.f9451h += (int) (this.f9450g - j11);
    }

    @Override // com.google.android.gms.internal.ads.mx3
    public final int l() {
        throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer.");
    }
}
