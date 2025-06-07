package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
final class dx3 extends fx3 {

    /* renamed from: f, reason: collision with root package name */
    private final InputStream f7543f;

    /* renamed from: g, reason: collision with root package name */
    private final byte[] f7544g;

    /* renamed from: h, reason: collision with root package name */
    private int f7545h;

    /* renamed from: i, reason: collision with root package name */
    private int f7546i;

    /* renamed from: j, reason: collision with root package name */
    private int f7547j;

    /* renamed from: k, reason: collision with root package name */
    private int f7548k;

    /* renamed from: l, reason: collision with root package name */
    private int f7549l;

    /* renamed from: m, reason: collision with root package name */
    private int f7550m;

    /* synthetic */ dx3(InputStream inputStream, int i10, cx3 cx3Var) {
        super(null);
        this.f7550m = Integer.MAX_VALUE;
        byte[] bArr = ly3.f11871d;
        this.f7543f = inputStream;
        this.f7544g = new byte[4096];
        this.f7545h = 0;
        this.f7547j = 0;
        this.f7549l = 0;
    }

    private final List D(int i10) throws IOException {
        ArrayList arrayList = new ArrayList();
        while (i10 > 0) {
            int iMin = Math.min(i10, 4096);
            byte[] bArr = new byte[iMin];
            int i11 = 0;
            while (i11 < iMin) {
                int i12 = this.f7543f.read(bArr, i11, iMin - i11);
                if (i12 == -1) {
                    throw ny3.k();
                }
                this.f7549l += i12;
                i11 += i12;
            }
            i10 -= iMin;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    private final void E() {
        int i10 = this.f7545h + this.f7546i;
        this.f7545h = i10;
        int i11 = this.f7549l + i10;
        int i12 = this.f7550m;
        if (i11 <= i12) {
            this.f7546i = 0;
            return;
        }
        int i13 = i11 - i12;
        this.f7546i = i13;
        this.f7545h = i10 - i13;
    }

    private final void F(int i10) throws ny3 {
        if (G(i10)) {
            return;
        }
        if (i10 <= (Integer.MAX_VALUE - this.f7549l) - this.f7547j) {
            throw ny3.k();
        }
        throw ny3.j();
    }

    private final boolean G(int i10) throws IOException {
        int i11 = this.f7547j;
        int i12 = i11 + i10;
        int i13 = this.f7545h;
        if (i12 <= i13) {
            throw new IllegalStateException("refillBuffer() called when " + i10 + " bytes were already available in buffer");
        }
        int i14 = this.f7549l;
        if (i10 > (Integer.MAX_VALUE - i14) - i11 || i14 + i11 + i10 > this.f7550m) {
            return false;
        }
        if (i11 > 0) {
            if (i13 > i11) {
                byte[] bArr = this.f7544g;
                System.arraycopy(bArr, i11, bArr, 0, i13 - i11);
            }
            i14 = this.f7549l + i11;
            this.f7549l = i14;
            i13 = this.f7545h - i11;
            this.f7545h = i13;
            this.f7547j = 0;
        }
        try {
            int i15 = this.f7543f.read(this.f7544g, i13, Math.min(4096 - i13, (Integer.MAX_VALUE - i14) - i13));
            if (i15 == 0 || i15 < -1 || i15 > 4096) {
                throw new IllegalStateException(String.valueOf(this.f7543f.getClass()) + "#read(byte[]) returned invalid result: " + i15 + "\nThe InputStream implementation is buggy.");
            }
            if (i15 <= 0) {
                return false;
            }
            this.f7545h += i15;
            E();
            if (this.f7545h >= i10) {
                return true;
            }
            return G(i10);
        } catch (ny3 e5) {
            e5.l();
            throw e5;
        }
    }

    private final byte[] H(int i10, boolean z10) throws IOException {
        byte[] bArrI = I(i10);
        if (bArrI != null) {
            return bArrI;
        }
        int i11 = this.f7547j;
        int i12 = this.f7545h;
        int i13 = i12 - i11;
        this.f7549l += i12;
        this.f7547j = 0;
        this.f7545h = 0;
        List<byte[]> listD = D(i10 - i13);
        byte[] bArr = new byte[i10];
        System.arraycopy(this.f7544g, i11, bArr, 0, i13);
        for (byte[] bArr2 : listD) {
            int length = bArr2.length;
            System.arraycopy(bArr2, 0, bArr, i13, length);
            i13 += length;
        }
        return bArr;
    }

    private final byte[] I(int i10) throws IOException {
        if (i10 == 0) {
            return ly3.f11871d;
        }
        if (i10 < 0) {
            throw ny3.f();
        }
        int i11 = this.f7549l;
        int i12 = this.f7547j;
        int i13 = i11 + i12 + i10;
        if ((-2147483647) + i13 > 0) {
            throw ny3.j();
        }
        int i14 = this.f7550m;
        if (i13 > i14) {
            C((i14 - i11) - i12);
            throw ny3.k();
        }
        int i15 = this.f7545h - i12;
        int i16 = i10 - i15;
        if (i16 >= 4096) {
            try {
                if (i16 > this.f7543f.available()) {
                    return null;
                }
            } catch (ny3 e5) {
                e5.l();
                throw e5;
            }
        }
        byte[] bArr = new byte[i10];
        System.arraycopy(this.f7544g, this.f7547j, bArr, 0, i15);
        this.f7549l += this.f7545h;
        this.f7547j = 0;
        this.f7545h = 0;
        while (i15 < i10) {
            try {
                int i17 = this.f7543f.read(bArr, i15, i10 - i15);
                if (i17 == -1) {
                    throw ny3.k();
                }
                this.f7549l += i17;
                i15 += i17;
            } catch (ny3 e10) {
                e10.l();
                throw e10;
            }
        }
        return bArr;
    }

    @Override // com.google.android.gms.internal.ads.fx3
    public final String A() throws IOException {
        byte[] bArrH;
        int iL = L();
        int i10 = this.f7547j;
        int i11 = this.f7545h;
        if (iL <= i11 - i10 && iL > 0) {
            bArrH = this.f7544g;
            this.f7547j = i10 + iL;
        } else {
            if (iL == 0) {
                return "";
            }
            if (iL <= i11) {
                F(iL);
                bArrH = this.f7544g;
                this.f7547j = iL;
            } else {
                bArrH = H(iL, false);
            }
            i10 = 0;
        }
        return y04.h(bArrH, i10, iL);
    }

    @Override // com.google.android.gms.internal.ads.fx3
    public final void B(int i10) throws ny3 {
        if (this.f7548k != i10) {
            throw ny3.b();
        }
    }

    public final void C(int i10) throws ny3 {
        int i11 = this.f7545h;
        int i12 = this.f7547j;
        int i13 = i11 - i12;
        if (i10 <= i13 && i10 >= 0) {
            this.f7547j = i12 + i10;
            return;
        }
        if (i10 < 0) {
            throw ny3.f();
        }
        int i14 = this.f7549l;
        int i15 = i14 + i12;
        int i16 = this.f7550m;
        if (i15 + i10 > i16) {
            C((i16 - i14) - i12);
            throw ny3.k();
        }
        this.f7549l = i15;
        this.f7545h = 0;
        this.f7547j = 0;
        while (i13 < i10) {
            try {
                long j10 = i10 - i13;
                try {
                    long jSkip = this.f7543f.skip(j10);
                    if (jSkip < 0 || jSkip > j10) {
                        throw new IllegalStateException(String.valueOf(this.f7543f.getClass()) + "#skip returned invalid result: " + jSkip + "\nThe InputStream implementation is buggy.");
                    }
                    if (jSkip == 0) {
                        break;
                    } else {
                        i13 += (int) jSkip;
                    }
                } catch (ny3 e5) {
                    e5.l();
                    throw e5;
                }
            } finally {
                this.f7549l += i13;
                E();
            }
        }
        if (i13 >= i10) {
            return;
        }
        int i17 = this.f7545h;
        int i18 = i17 - this.f7547j;
        this.f7547j = i17;
        while (true) {
            F(1);
            int i19 = i10 - i18;
            int i20 = this.f7545h;
            if (i19 <= i20) {
                this.f7547j = i19;
                return;
            } else {
                i18 += i20;
                this.f7547j = i20;
            }
        }
    }

    public final byte J() throws ny3 {
        if (this.f7547j == this.f7545h) {
            F(1);
        }
        byte[] bArr = this.f7544g;
        int i10 = this.f7547j;
        this.f7547j = i10 + 1;
        return bArr[i10];
    }

    public final int K() throws ny3 {
        int i10 = this.f7547j;
        if (this.f7545h - i10 < 4) {
            F(4);
            i10 = this.f7547j;
        }
        byte[] bArr = this.f7544g;
        this.f7547j = i10 + 4;
        int i11 = bArr[i10] & 255;
        int i12 = bArr[i10 + 1] & 255;
        int i13 = bArr[i10 + 2] & 255;
        return ((bArr[i10 + 3] & 255) << 24) | (i12 << 8) | i11 | (i13 << 16);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0067, code lost:
    
        if (r2[r3] < 0) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int L() {
        /*
            r5 = this;
            int r0 = r5.f7547j
            int r1 = r5.f7545h
            if (r1 != r0) goto L7
            goto L6d
        L7:
            byte[] r2 = r5.f7544g
            int r3 = r0 + 1
            r0 = r2[r0]
            if (r0 < 0) goto L12
            r5.f7547j = r3
            return r0
        L12:
            int r1 = r1 - r3
            r4 = 9
            if (r1 < r4) goto L6d
            int r1 = r3 + 1
            r3 = r2[r3]
            int r3 = r3 << 7
            r0 = r0 ^ r3
            if (r0 >= 0) goto L23
            r0 = r0 ^ (-128(0xffffffffffffff80, float:NaN))
            goto L6a
        L23:
            int r3 = r1 + 1
            r1 = r2[r1]
            int r1 = r1 << 14
            r0 = r0 ^ r1
            if (r0 < 0) goto L30
            r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
        L2e:
            r1 = r3
            goto L6a
        L30:
            int r1 = r3 + 1
            r3 = r2[r3]
            int r3 = r3 << 21
            r0 = r0 ^ r3
            if (r0 >= 0) goto L3e
            r2 = -2080896(0xffffffffffe03f80, float:NaN)
            r0 = r0 ^ r2
            goto L6a
        L3e:
            int r3 = r1 + 1
            r1 = r2[r1]
            int r4 = r1 << 28
            r0 = r0 ^ r4
            r4 = 266354560(0xfe03f80, float:2.2112565E-29)
            r0 = r0 ^ r4
            if (r1 >= 0) goto L2e
            int r1 = r3 + 1
            r3 = r2[r3]
            if (r3 >= 0) goto L6a
            int r3 = r1 + 1
            r1 = r2[r1]
            if (r1 >= 0) goto L2e
            int r1 = r3 + 1
            r3 = r2[r3]
            if (r3 >= 0) goto L6a
            int r3 = r1 + 1
            r1 = r2[r1]
            if (r1 >= 0) goto L2e
            int r1 = r3 + 1
            r2 = r2[r3]
            if (r2 >= 0) goto L6a
            goto L6d
        L6a:
            r5.f7547j = r1
            return r0
        L6d:
            long r0 = r5.O()
            int r0 = (int) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.dx3.L():int");
    }

    public final long M() throws ny3 {
        int i10 = this.f7547j;
        if (this.f7545h - i10 < 8) {
            F(8);
            i10 = this.f7547j;
        }
        byte[] bArr = this.f7544g;
        this.f7547j = i10 + 8;
        long j10 = bArr[i10];
        long j11 = bArr[i10 + 2];
        long j12 = bArr[i10 + 3];
        return ((bArr[i10 + 7] & 255) << 56) | (j10 & 255) | ((bArr[i10 + 1] & 255) << 8) | ((j11 & 255) << 16) | ((j12 & 255) << 24) | ((bArr[i10 + 4] & 255) << 32) | ((bArr[i10 + 5] & 255) << 40) | ((bArr[i10 + 6] & 255) << 48);
    }

    public final long N() {
        long j10;
        long j11;
        long j12;
        long j13;
        int i10;
        int i11 = this.f7547j;
        int i12 = this.f7545h;
        if (i12 != i11) {
            byte[] bArr = this.f7544g;
            int i13 = i11 + 1;
            byte b10 = bArr[i11];
            if (b10 >= 0) {
                this.f7547j = i13;
                return b10;
            }
            if (i12 - i13 >= 9) {
                int i14 = i13 + 1;
                int i15 = b10 ^ (bArr[i13] << 7);
                if (i15 >= 0) {
                    int i16 = i14 + 1;
                    int i17 = i15 ^ (bArr[i14] << 14);
                    if (i17 >= 0) {
                        j10 = i17 ^ 16256;
                    } else {
                        i14 = i16 + 1;
                        int i18 = i17 ^ (bArr[i16] << 21);
                        if (i18 < 0) {
                            i10 = i18 ^ (-2080896);
                        } else {
                            i16 = i14 + 1;
                            long j14 = i18 ^ (bArr[i14] << 28);
                            if (j14 < 0) {
                                int i19 = i16 + 1;
                                long j15 = j14 ^ (bArr[i16] << 35);
                                if (j15 < 0) {
                                    j12 = -34093383808L;
                                } else {
                                    i16 = i19 + 1;
                                    j14 = j15 ^ (bArr[i19] << 42);
                                    if (j14 >= 0) {
                                        j13 = 4363953127296L;
                                    } else {
                                        i19 = i16 + 1;
                                        j15 = j14 ^ (bArr[i16] << 49);
                                        if (j15 < 0) {
                                            j12 = -558586000294016L;
                                        } else {
                                            i16 = i19 + 1;
                                            j10 = (j15 ^ (bArr[i19] << 56)) ^ 71499008037633920L;
                                            if (j10 < 0) {
                                                i19 = i16 + 1;
                                                if (bArr[i16] >= 0) {
                                                    j11 = j10;
                                                    i14 = i19;
                                                    this.f7547j = i14;
                                                    return j11;
                                                }
                                            }
                                        }
                                    }
                                }
                                j11 = j12 ^ j15;
                                i14 = i19;
                                this.f7547j = i14;
                                return j11;
                            }
                            j13 = 266354560;
                            j10 = j14 ^ j13;
                        }
                    }
                    i14 = i16;
                    j11 = j10;
                    this.f7547j = i14;
                    return j11;
                }
                i10 = i15 ^ (-128);
                j11 = i10;
                this.f7547j = i14;
                return j11;
            }
        }
        return O();
    }

    final long O() throws ny3 {
        long j10 = 0;
        for (int i10 = 0; i10 < 64; i10 += 7) {
            j10 |= (r3 & Byte.MAX_VALUE) << i10;
            if ((J() & 128) == 0) {
                return j10;
            }
        }
        throw ny3.e();
    }

    @Override // com.google.android.gms.internal.ads.fx3
    public final void a(int i10) {
        this.f7550m = i10;
        E();
    }

    @Override // com.google.android.gms.internal.ads.fx3
    public final boolean b() {
        return this.f7547j == this.f7545h && !G(1);
    }

    @Override // com.google.android.gms.internal.ads.fx3
    public final boolean c() {
        return N() != 0;
    }

    @Override // com.google.android.gms.internal.ads.fx3
    public final boolean d(int i10) throws ny3 {
        int iR;
        int i11 = i10 & 7;
        int i12 = 0;
        if (i11 == 0) {
            if (this.f7545h - this.f7547j < 10) {
                while (i12 < 10) {
                    if (J() < 0) {
                        i12++;
                    }
                }
                throw ny3.e();
            }
            while (i12 < 10) {
                byte[] bArr = this.f7544g;
                int i13 = this.f7547j;
                this.f7547j = i13 + 1;
                if (bArr[i13] < 0) {
                    i12++;
                }
            }
            throw ny3.e();
            return true;
        }
        if (i11 == 1) {
            C(8);
            return true;
        }
        if (i11 == 2) {
            C(L());
            return true;
        }
        if (i11 != 3) {
            if (i11 == 4) {
                return false;
            }
            if (i11 != 5) {
                throw ny3.a();
            }
            C(4);
            return true;
        }
        do {
            iR = r();
            if (iR == 0) {
                break;
            }
        } while (d(iR));
        B(((i10 >>> 3) << 3) | 4);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.fx3
    public final double i() {
        return Double.longBitsToDouble(M());
    }

    @Override // com.google.android.gms.internal.ads.fx3
    public final float j() {
        return Float.intBitsToFloat(K());
    }

    @Override // com.google.android.gms.internal.ads.fx3
    public final int k() {
        return this.f7549l + this.f7547j;
    }

    @Override // com.google.android.gms.internal.ads.fx3
    public final int l(int i10) throws ny3 {
        if (i10 < 0) {
            throw ny3.f();
        }
        int i11 = this.f7549l + this.f7547j;
        int i12 = this.f7550m;
        int i13 = i10 + i11;
        if (i13 > i12) {
            throw ny3.k();
        }
        this.f7550m = i13;
        E();
        return i12;
    }

    @Override // com.google.android.gms.internal.ads.fx3
    public final int m() {
        return L();
    }

    @Override // com.google.android.gms.internal.ads.fx3
    public final int n() {
        return K();
    }

    @Override // com.google.android.gms.internal.ads.fx3
    public final int o() {
        return L();
    }

    @Override // com.google.android.gms.internal.ads.fx3
    public final int p() {
        return K();
    }

    @Override // com.google.android.gms.internal.ads.fx3
    public final int q() {
        return fx3.e(L());
    }

    @Override // com.google.android.gms.internal.ads.fx3
    public final int r() throws ny3 {
        if (b()) {
            this.f7548k = 0;
            return 0;
        }
        int iL = L();
        this.f7548k = iL;
        if ((iL >>> 3) != 0) {
            return iL;
        }
        throw ny3.c();
    }

    @Override // com.google.android.gms.internal.ads.fx3
    public final int s() {
        return L();
    }

    @Override // com.google.android.gms.internal.ads.fx3
    public final long t() {
        return M();
    }

    @Override // com.google.android.gms.internal.ads.fx3
    public final long u() {
        return N();
    }

    @Override // com.google.android.gms.internal.ads.fx3
    public final long v() {
        return M();
    }

    @Override // com.google.android.gms.internal.ads.fx3
    public final long w() {
        return fx3.f(N());
    }

    @Override // com.google.android.gms.internal.ads.fx3
    public final long x() {
        return N();
    }

    @Override // com.google.android.gms.internal.ads.fx3
    public final ww3 y() throws IOException {
        int iL = L();
        int i10 = this.f7545h;
        int i11 = this.f7547j;
        if (iL <= i10 - i11 && iL > 0) {
            ww3 ww3VarI = ww3.I(this.f7544g, i11, iL);
            this.f7547j += iL;
            return ww3VarI;
        }
        if (iL == 0) {
            return ww3.f17284n;
        }
        byte[] bArrI = I(iL);
        if (bArrI != null) {
            return ww3.I(bArrI, 0, bArrI.length);
        }
        int i12 = this.f7547j;
        int i13 = this.f7545h;
        int i14 = i13 - i12;
        this.f7549l += i13;
        this.f7547j = 0;
        this.f7545h = 0;
        List<byte[]> listD = D(iL - i14);
        byte[] bArr = new byte[iL];
        System.arraycopy(this.f7544g, i12, bArr, 0, i14);
        for (byte[] bArr2 : listD) {
            int length = bArr2.length;
            System.arraycopy(bArr2, 0, bArr, i14, length);
            i14 += length;
        }
        return new sw3(bArr);
    }

    @Override // com.google.android.gms.internal.ads.fx3
    public final String z() throws ny3 {
        int iL = L();
        if (iL > 0) {
            int i10 = this.f7545h;
            int i11 = this.f7547j;
            if (iL <= i10 - i11) {
                String str = new String(this.f7544g, i11, iL, ly3.f11869b);
                this.f7547j += iL;
                return str;
            }
        }
        if (iL == 0) {
            return "";
        }
        if (iL > this.f7545h) {
            return new String(H(iL, false), ly3.f11869b);
        }
        F(iL);
        String str2 = new String(this.f7544g, this.f7547j, iL, ly3.f11869b);
        this.f7547j += iL;
        return str2;
    }
}
