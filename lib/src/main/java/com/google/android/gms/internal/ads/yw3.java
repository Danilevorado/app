package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes.dex */
final class yw3 extends fx3 {

    /* renamed from: f, reason: collision with root package name */
    private final byte[] f18297f;

    /* renamed from: g, reason: collision with root package name */
    private int f18298g;

    /* renamed from: h, reason: collision with root package name */
    private int f18299h;

    /* renamed from: i, reason: collision with root package name */
    private int f18300i;

    /* renamed from: j, reason: collision with root package name */
    private final int f18301j;

    /* renamed from: k, reason: collision with root package name */
    private int f18302k;

    /* renamed from: l, reason: collision with root package name */
    private int f18303l;

    /* synthetic */ yw3(byte[] bArr, int i10, int i11, boolean z10, xw3 xw3Var) {
        super(null);
        this.f18303l = Integer.MAX_VALUE;
        this.f18297f = bArr;
        this.f18298g = i11 + i10;
        this.f18300i = i10;
        this.f18301j = i10;
    }

    private final void D() {
        int i10 = this.f18298g + this.f18299h;
        this.f18298g = i10;
        int i11 = i10 - this.f18301j;
        int i12 = this.f18303l;
        if (i11 <= i12) {
            this.f18299h = 0;
            return;
        }
        int i13 = i11 - i12;
        this.f18299h = i13;
        this.f18298g = i10 - i13;
    }

    @Override // com.google.android.gms.internal.ads.fx3
    public final String A() throws ny3 {
        int iG = G();
        if (iG > 0) {
            int i10 = this.f18298g;
            int i11 = this.f18300i;
            if (iG <= i10 - i11) {
                String strH = y04.h(this.f18297f, i11, iG);
                this.f18300i += iG;
                return strH;
            }
        }
        if (iG == 0) {
            return "";
        }
        if (iG <= 0) {
            throw ny3.f();
        }
        throw ny3.k();
    }

    @Override // com.google.android.gms.internal.ads.fx3
    public final void B(int i10) throws ny3 {
        if (this.f18302k != i10) {
            throw ny3.b();
        }
    }

    public final void C(int i10) throws ny3 {
        if (i10 >= 0) {
            int i11 = this.f18298g;
            int i12 = this.f18300i;
            if (i10 <= i11 - i12) {
                this.f18300i = i12 + i10;
                return;
            }
        }
        if (i10 >= 0) {
            throw ny3.k();
        }
        throw ny3.f();
    }

    public final byte E() throws ny3 {
        int i10 = this.f18300i;
        if (i10 == this.f18298g) {
            throw ny3.k();
        }
        byte[] bArr = this.f18297f;
        this.f18300i = i10 + 1;
        return bArr[i10];
    }

    public final int F() throws ny3 {
        int i10 = this.f18300i;
        if (this.f18298g - i10 < 4) {
            throw ny3.k();
        }
        byte[] bArr = this.f18297f;
        this.f18300i = i10 + 4;
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
    public final int G() {
        /*
            r5 = this;
            int r0 = r5.f18300i
            int r1 = r5.f18298g
            if (r1 != r0) goto L7
            goto L6d
        L7:
            byte[] r2 = r5.f18297f
            int r3 = r0 + 1
            r0 = r2[r0]
            if (r0 < 0) goto L12
            r5.f18300i = r3
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
            r5.f18300i = r1
            return r0
        L6d:
            long r0 = r5.J()
            int r0 = (int) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.yw3.G():int");
    }

    public final long H() throws ny3 {
        int i10 = this.f18300i;
        if (this.f18298g - i10 < 8) {
            throw ny3.k();
        }
        byte[] bArr = this.f18297f;
        this.f18300i = i10 + 8;
        long j10 = bArr[i10];
        long j11 = bArr[i10 + 2];
        long j12 = bArr[i10 + 3];
        return ((bArr[i10 + 7] & 255) << 56) | (j10 & 255) | ((bArr[i10 + 1] & 255) << 8) | ((j11 & 255) << 16) | ((j12 & 255) << 24) | ((bArr[i10 + 4] & 255) << 32) | ((bArr[i10 + 5] & 255) << 40) | ((bArr[i10 + 6] & 255) << 48);
    }

    public final long I() {
        long j10;
        long j11;
        long j12;
        long j13;
        int i10;
        int i11 = this.f18300i;
        int i12 = this.f18298g;
        if (i12 != i11) {
            byte[] bArr = this.f18297f;
            int i13 = i11 + 1;
            byte b10 = bArr[i11];
            if (b10 >= 0) {
                this.f18300i = i13;
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
                                                    this.f18300i = i14;
                                                    return j11;
                                                }
                                            }
                                        }
                                    }
                                }
                                j11 = j12 ^ j15;
                                i14 = i19;
                                this.f18300i = i14;
                                return j11;
                            }
                            j13 = 266354560;
                            j10 = j14 ^ j13;
                        }
                    }
                    i14 = i16;
                    j11 = j10;
                    this.f18300i = i14;
                    return j11;
                }
                i10 = i15 ^ (-128);
                j11 = i10;
                this.f18300i = i14;
                return j11;
            }
        }
        return J();
    }

    final long J() throws ny3 {
        long j10 = 0;
        for (int i10 = 0; i10 < 64; i10 += 7) {
            j10 |= (r3 & Byte.MAX_VALUE) << i10;
            if ((E() & 128) == 0) {
                return j10;
            }
        }
        throw ny3.e();
    }

    @Override // com.google.android.gms.internal.ads.fx3
    public final void a(int i10) {
        this.f18303l = i10;
        D();
    }

    @Override // com.google.android.gms.internal.ads.fx3
    public final boolean b() {
        return this.f18300i == this.f18298g;
    }

    @Override // com.google.android.gms.internal.ads.fx3
    public final boolean c() {
        return I() != 0;
    }

    @Override // com.google.android.gms.internal.ads.fx3
    public final boolean d(int i10) throws ny3 {
        int iR;
        int i11 = i10 & 7;
        int i12 = 0;
        if (i11 == 0) {
            if (this.f18298g - this.f18300i < 10) {
                while (i12 < 10) {
                    if (E() < 0) {
                        i12++;
                    }
                }
                throw ny3.e();
            }
            while (i12 < 10) {
                byte[] bArr = this.f18297f;
                int i13 = this.f18300i;
                this.f18300i = i13 + 1;
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
            C(G());
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
        return Double.longBitsToDouble(H());
    }

    @Override // com.google.android.gms.internal.ads.fx3
    public final float j() {
        return Float.intBitsToFloat(F());
    }

    @Override // com.google.android.gms.internal.ads.fx3
    public final int k() {
        return this.f18300i - this.f18301j;
    }

    @Override // com.google.android.gms.internal.ads.fx3
    public final int l(int i10) {
        if (i10 < 0) {
            throw ny3.f();
        }
        int i11 = i10 + (this.f18300i - this.f18301j);
        if (i11 < 0) {
            throw ny3.g();
        }
        int i12 = this.f18303l;
        if (i11 > i12) {
            throw ny3.k();
        }
        this.f18303l = i11;
        D();
        return i12;
    }

    @Override // com.google.android.gms.internal.ads.fx3
    public final int m() {
        return G();
    }

    @Override // com.google.android.gms.internal.ads.fx3
    public final int n() {
        return F();
    }

    @Override // com.google.android.gms.internal.ads.fx3
    public final int o() {
        return G();
    }

    @Override // com.google.android.gms.internal.ads.fx3
    public final int p() {
        return F();
    }

    @Override // com.google.android.gms.internal.ads.fx3
    public final int q() {
        return fx3.e(G());
    }

    @Override // com.google.android.gms.internal.ads.fx3
    public final int r() throws ny3 {
        if (b()) {
            this.f18302k = 0;
            return 0;
        }
        int iG = G();
        this.f18302k = iG;
        if ((iG >>> 3) != 0) {
            return iG;
        }
        throw ny3.c();
    }

    @Override // com.google.android.gms.internal.ads.fx3
    public final int s() {
        return G();
    }

    @Override // com.google.android.gms.internal.ads.fx3
    public final long t() {
        return H();
    }

    @Override // com.google.android.gms.internal.ads.fx3
    public final long u() {
        return I();
    }

    @Override // com.google.android.gms.internal.ads.fx3
    public final long v() {
        return H();
    }

    @Override // com.google.android.gms.internal.ads.fx3
    public final long w() {
        return fx3.f(I());
    }

    @Override // com.google.android.gms.internal.ads.fx3
    public final long x() {
        return I();
    }

    @Override // com.google.android.gms.internal.ads.fx3
    public final ww3 y() throws ny3 {
        int iG = G();
        if (iG > 0) {
            int i10 = this.f18298g;
            int i11 = this.f18300i;
            if (iG <= i10 - i11) {
                ww3 ww3VarI = ww3.I(this.f18297f, i11, iG);
                this.f18300i += iG;
                return ww3VarI;
            }
        }
        if (iG == 0) {
            return ww3.f17284n;
        }
        if (iG > 0) {
            int i12 = this.f18298g;
            int i13 = this.f18300i;
            if (iG <= i12 - i13) {
                int i14 = iG + i13;
                this.f18300i = i14;
                return new sw3(Arrays.copyOfRange(this.f18297f, i13, i14));
            }
        }
        if (iG <= 0) {
            throw ny3.f();
        }
        throw ny3.k();
    }

    @Override // com.google.android.gms.internal.ads.fx3
    public final String z() throws ny3 {
        int iG = G();
        if (iG > 0) {
            int i10 = this.f18298g;
            int i11 = this.f18300i;
            if (iG <= i10 - i11) {
                String str = new String(this.f18297f, i11, iG, ly3.f11869b);
                this.f18300i += iG;
                return str;
            }
        }
        if (iG == 0) {
            return "";
        }
        if (iG < 0) {
            throw ny3.f();
        }
        throw ny3.k();
    }
}
