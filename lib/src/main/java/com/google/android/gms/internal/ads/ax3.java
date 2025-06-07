package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.util.Iterator;

/* loaded from: classes.dex */
final class ax3 extends fx3 {

    /* renamed from: f, reason: collision with root package name */
    private final Iterable f6280f;

    /* renamed from: g, reason: collision with root package name */
    private final Iterator f6281g;

    /* renamed from: h, reason: collision with root package name */
    private ByteBuffer f6282h;

    /* renamed from: i, reason: collision with root package name */
    private int f6283i;

    /* renamed from: j, reason: collision with root package name */
    private int f6284j;

    /* renamed from: k, reason: collision with root package name */
    private int f6285k;

    /* renamed from: l, reason: collision with root package name */
    private int f6286l;

    /* renamed from: m, reason: collision with root package name */
    private int f6287m;

    /* renamed from: n, reason: collision with root package name */
    private long f6288n;

    /* renamed from: o, reason: collision with root package name */
    private long f6289o;

    /* renamed from: p, reason: collision with root package name */
    private long f6290p;

    /* synthetic */ ax3(Iterable iterable, int i10, boolean z10, zw3 zw3Var) {
        super(null);
        this.f6285k = Integer.MAX_VALUE;
        this.f6283i = i10;
        this.f6280f = iterable;
        this.f6281g = iterable.iterator();
        this.f6287m = 0;
        if (i10 != 0) {
            H();
            return;
        }
        this.f6282h = ly3.f11872e;
        this.f6288n = 0L;
        this.f6289o = 0L;
        this.f6290p = 0L;
    }

    private final int D() {
        return (int) (((this.f6283i - this.f6287m) - this.f6288n) + this.f6289o);
    }

    private final void E() throws ny3 {
        if (!this.f6281g.hasNext()) {
            throw ny3.k();
        }
        H();
    }

    private final void F(byte[] bArr, int i10, int i11) throws ny3 {
        if (i11 > D()) {
            if (i11 > 0) {
                throw ny3.k();
            }
            return;
        }
        int i12 = i11;
        while (i12 > 0) {
            if (this.f6290p - this.f6288n == 0) {
                E();
            }
            int iMin = Math.min(i12, (int) (this.f6290p - this.f6288n));
            long j10 = iMin;
            t04.w(this.f6288n, bArr, i11 - i12, j10);
            i12 -= iMin;
            this.f6288n += j10;
        }
    }

    private final void G() {
        int i10 = this.f6283i + this.f6284j;
        this.f6283i = i10;
        int i11 = this.f6285k;
        if (i10 <= i11) {
            this.f6284j = 0;
            return;
        }
        int i12 = i10 - i11;
        this.f6284j = i12;
        this.f6283i = i10 - i12;
    }

    private final void H() {
        ByteBuffer byteBuffer = (ByteBuffer) this.f6281g.next();
        this.f6282h = byteBuffer;
        this.f6287m += (int) (this.f6288n - this.f6289o);
        long jPosition = byteBuffer.position();
        this.f6288n = jPosition;
        this.f6289o = jPosition;
        this.f6290p = this.f6282h.limit();
        long jM = t04.m(this.f6282h);
        this.f6288n += jM;
        this.f6289o += jM;
        this.f6290p += jM;
    }

    @Override // com.google.android.gms.internal.ads.fx3
    public final String A() throws ny3 {
        int iK = K();
        if (iK > 0) {
            long j10 = this.f6290p;
            long j11 = this.f6288n;
            long j12 = iK;
            if (j12 <= j10 - j11) {
                String strG = y04.g(this.f6282h, (int) (j11 - this.f6289o), iK);
                this.f6288n += j12;
                return strG;
            }
        }
        if (iK >= 0 && iK <= D()) {
            byte[] bArr = new byte[iK];
            F(bArr, 0, iK);
            return y04.h(bArr, 0, iK);
        }
        if (iK == 0) {
            return "";
        }
        if (iK <= 0) {
            throw ny3.f();
        }
        throw ny3.k();
    }

    @Override // com.google.android.gms.internal.ads.fx3
    public final void B(int i10) throws ny3 {
        if (this.f6286l != i10) {
            throw ny3.b();
        }
    }

    public final void C(int i10) throws ny3 {
        if (i10 >= 0) {
            if (i10 <= ((this.f6283i - this.f6287m) - this.f6288n) + this.f6289o) {
                while (i10 > 0) {
                    if (this.f6290p - this.f6288n == 0) {
                        E();
                    }
                    int iMin = Math.min(i10, (int) (this.f6290p - this.f6288n));
                    i10 -= iMin;
                    this.f6288n += iMin;
                }
                return;
            }
        }
        if (i10 >= 0) {
            throw ny3.k();
        }
        throw ny3.f();
    }

    public final byte I() throws ny3 {
        if (this.f6290p - this.f6288n == 0) {
            E();
        }
        long j10 = this.f6288n;
        this.f6288n = 1 + j10;
        return t04.i(j10);
    }

    public final int J() {
        long j10 = this.f6290p;
        long j11 = this.f6288n;
        if (j10 - j11 < 4) {
            int I = I() & 255;
            int I2 = (I() & 255) << 8;
            return I | I2 | ((I() & 255) << 16) | ((I() & 255) << 24);
        }
        this.f6288n = 4 + j11;
        int i10 = t04.i(j11) & 255;
        int i11 = (t04.i(1 + j11) & 255) << 8;
        return i10 | i11 | ((t04.i(2 + j11) & 255) << 16) | ((t04.i(j11 + 3) & 255) << 24);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0087, code lost:
    
        if (com.google.android.gms.internal.ads.t04.i(r4) >= 0) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int K() {
        /*
            r10 = this;
            long r0 = r10.f6288n
            long r2 = r10.f6290p
            int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r2 != 0) goto La
            goto L8c
        La:
            r2 = 1
            long r4 = r0 + r2
            byte r0 = com.google.android.gms.internal.ads.t04.i(r0)
            if (r0 < 0) goto L1a
            long r4 = r10.f6288n
            long r4 = r4 + r2
            r10.f6288n = r4
            return r0
        L1a:
            long r6 = r10.f6290p
            long r8 = r10.f6288n
            long r6 = r6 - r8
            r8 = 10
            int r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r1 < 0) goto L8c
            long r6 = r4 + r2
            byte r1 = com.google.android.gms.internal.ads.t04.i(r4)
            int r1 = r1 << 7
            r0 = r0 ^ r1
            if (r0 >= 0) goto L33
            r0 = r0 ^ (-128(0xffffffffffffff80, float:NaN))
            goto L89
        L33:
            long r4 = r6 + r2
            byte r1 = com.google.android.gms.internal.ads.t04.i(r6)
            int r1 = r1 << 14
            r0 = r0 ^ r1
            if (r0 < 0) goto L42
            r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
        L40:
            r6 = r4
            goto L89
        L42:
            long r6 = r4 + r2
            byte r1 = com.google.android.gms.internal.ads.t04.i(r4)
            int r1 = r1 << 21
            r0 = r0 ^ r1
            if (r0 >= 0) goto L52
            r1 = -2080896(0xffffffffffe03f80, float:NaN)
            r0 = r0 ^ r1
            goto L89
        L52:
            long r4 = r6 + r2
            byte r1 = com.google.android.gms.internal.ads.t04.i(r6)
            int r6 = r1 << 28
            r0 = r0 ^ r6
            r6 = 266354560(0xfe03f80, float:2.2112565E-29)
            r0 = r0 ^ r6
            if (r1 >= 0) goto L40
            long r6 = r4 + r2
            byte r1 = com.google.android.gms.internal.ads.t04.i(r4)
            if (r1 >= 0) goto L89
            long r4 = r6 + r2
            byte r1 = com.google.android.gms.internal.ads.t04.i(r6)
            if (r1 >= 0) goto L40
            long r6 = r4 + r2
            byte r1 = com.google.android.gms.internal.ads.t04.i(r4)
            if (r1 >= 0) goto L89
            long r4 = r6 + r2
            byte r1 = com.google.android.gms.internal.ads.t04.i(r6)
            if (r1 >= 0) goto L40
            long r6 = r4 + r2
            byte r1 = com.google.android.gms.internal.ads.t04.i(r4)
            if (r1 < 0) goto L8c
        L89:
            r10.f6288n = r6
            return r0
        L8c:
            long r0 = r10.N()
            int r0 = (int) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ax3.K():int");
    }

    public final long L() {
        long j10 = this.f6290p;
        long j11 = this.f6288n;
        if (j10 - j11 < 8) {
            return (I() & 255) | ((I() & 255) << 8) | ((I() & 255) << 16) | ((I() & 255) << 24) | ((I() & 255) << 32) | ((I() & 255) << 40) | ((I() & 255) << 48) | ((I() & 255) << 56);
        }
        this.f6288n = 8 + j11;
        long jI = t04.i(j11) & 255;
        long jI2 = (t04.i(1 + j11) & 255) << 8;
        long jI3 = (t04.i(j11 + 2) & 255) << 16;
        long jI4 = (t04.i(3 + j11) & 255) << 24;
        long jI5 = (t04.i(j11 + 4) & 255) << 32;
        return jI5 | jI | jI2 | jI3 | jI4 | ((t04.i(j11 + 5) & 255) << 40) | ((t04.i(j11 + 6) & 255) << 48) | ((t04.i(j11 + 7) & 255) << 56);
    }

    public final long M() {
        long jI;
        long j10;
        long j11;
        int i10;
        long j12 = this.f6288n;
        if (this.f6290p != j12) {
            long j13 = j12 + 1;
            byte bI = t04.i(j12);
            if (bI >= 0) {
                this.f6288n++;
                return bI;
            }
            if (this.f6290p - this.f6288n >= 10) {
                long j14 = j13 + 1;
                int i11 = bI ^ (t04.i(j13) << 7);
                if (i11 >= 0) {
                    long j15 = j14 + 1;
                    int i12 = i11 ^ (t04.i(j14) << 14);
                    if (i12 >= 0) {
                        jI = i12 ^ 16256;
                    } else {
                        j14 = j15 + 1;
                        int i13 = i12 ^ (t04.i(j15) << 21);
                        if (i13 < 0) {
                            i10 = i13 ^ (-2080896);
                        } else {
                            j15 = j14 + 1;
                            long jI2 = i13 ^ (t04.i(j14) << 28);
                            if (jI2 < 0) {
                                long j16 = j15 + 1;
                                long jI3 = jI2 ^ (t04.i(j15) << 35);
                                if (jI3 < 0) {
                                    j10 = -34093383808L;
                                } else {
                                    j15 = j16 + 1;
                                    jI2 = jI3 ^ (t04.i(j16) << 42);
                                    if (jI2 >= 0) {
                                        j11 = 4363953127296L;
                                    } else {
                                        j16 = j15 + 1;
                                        jI3 = jI2 ^ (t04.i(j15) << 49);
                                        if (jI3 >= 0) {
                                            j15 = j16 + 1;
                                            jI = (jI3 ^ (t04.i(j16) << 56)) ^ 71499008037633920L;
                                            if (jI < 0) {
                                                long j17 = 1 + j15;
                                                if (t04.i(j15) >= 0) {
                                                    j14 = j17;
                                                }
                                            }
                                            this.f6288n = j14;
                                            return jI;
                                        }
                                        j10 = -558586000294016L;
                                    }
                                }
                                jI = jI3 ^ j10;
                                j14 = j16;
                                this.f6288n = j14;
                                return jI;
                            }
                            j11 = 266354560;
                            jI = jI2 ^ j11;
                        }
                    }
                    j14 = j15;
                    this.f6288n = j14;
                    return jI;
                }
                i10 = i11 ^ (-128);
                jI = i10;
                this.f6288n = j14;
                return jI;
            }
        }
        return N();
    }

    final long N() throws ny3 {
        long j10 = 0;
        for (int i10 = 0; i10 < 64; i10 += 7) {
            j10 |= (r3 & Byte.MAX_VALUE) << i10;
            if ((I() & 128) == 0) {
                return j10;
            }
        }
        throw ny3.e();
    }

    @Override // com.google.android.gms.internal.ads.fx3
    public final void a(int i10) {
        this.f6285k = i10;
        G();
    }

    @Override // com.google.android.gms.internal.ads.fx3
    public final boolean b() {
        return (((long) this.f6287m) + this.f6288n) - this.f6289o == ((long) this.f6283i);
    }

    @Override // com.google.android.gms.internal.ads.fx3
    public final boolean c() {
        return M() != 0;
    }

    @Override // com.google.android.gms.internal.ads.fx3
    public final boolean d(int i10) throws ny3 {
        int iR;
        int i11 = i10 & 7;
        if (i11 == 0) {
            for (int i12 = 0; i12 < 10; i12++) {
                if (I() >= 0) {
                    return true;
                }
            }
            throw ny3.e();
        }
        if (i11 == 1) {
            C(8);
            return true;
        }
        if (i11 == 2) {
            C(K());
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
        return Double.longBitsToDouble(L());
    }

    @Override // com.google.android.gms.internal.ads.fx3
    public final float j() {
        return Float.intBitsToFloat(J());
    }

    @Override // com.google.android.gms.internal.ads.fx3
    public final int k() {
        return (int) ((this.f6287m + this.f6288n) - this.f6289o);
    }

    @Override // com.google.android.gms.internal.ads.fx3
    public final int l(int i10) throws ny3 {
        if (i10 < 0) {
            throw ny3.f();
        }
        int iK = i10 + k();
        int i11 = this.f6285k;
        if (iK > i11) {
            throw ny3.k();
        }
        this.f6285k = iK;
        G();
        return i11;
    }

    @Override // com.google.android.gms.internal.ads.fx3
    public final int m() {
        return K();
    }

    @Override // com.google.android.gms.internal.ads.fx3
    public final int n() {
        return J();
    }

    @Override // com.google.android.gms.internal.ads.fx3
    public final int o() {
        return K();
    }

    @Override // com.google.android.gms.internal.ads.fx3
    public final int p() {
        return J();
    }

    @Override // com.google.android.gms.internal.ads.fx3
    public final int q() {
        return fx3.e(K());
    }

    @Override // com.google.android.gms.internal.ads.fx3
    public final int r() throws ny3 {
        if (b()) {
            this.f6286l = 0;
            return 0;
        }
        int iK = K();
        this.f6286l = iK;
        if ((iK >>> 3) != 0) {
            return iK;
        }
        throw ny3.c();
    }

    @Override // com.google.android.gms.internal.ads.fx3
    public final int s() {
        return K();
    }

    @Override // com.google.android.gms.internal.ads.fx3
    public final long t() {
        return L();
    }

    @Override // com.google.android.gms.internal.ads.fx3
    public final long u() {
        return M();
    }

    @Override // com.google.android.gms.internal.ads.fx3
    public final long v() {
        return L();
    }

    @Override // com.google.android.gms.internal.ads.fx3
    public final long w() {
        return fx3.f(M());
    }

    @Override // com.google.android.gms.internal.ads.fx3
    public final long x() {
        return M();
    }

    @Override // com.google.android.gms.internal.ads.fx3
    public final ww3 y() throws ny3 {
        int iK = K();
        if (iK > 0) {
            long j10 = this.f6290p;
            long j11 = this.f6288n;
            long j12 = iK;
            if (j12 <= j10 - j11) {
                byte[] bArr = new byte[iK];
                t04.w(j11, bArr, 0L, j12);
                this.f6288n += j12;
                return new sw3(bArr);
            }
        }
        if (iK > 0 && iK <= D()) {
            byte[] bArr2 = new byte[iK];
            F(bArr2, 0, iK);
            return new sw3(bArr2);
        }
        if (iK == 0) {
            return ww3.f17284n;
        }
        if (iK < 0) {
            throw ny3.f();
        }
        throw ny3.k();
    }

    @Override // com.google.android.gms.internal.ads.fx3
    public final String z() throws ny3 {
        int iK = K();
        if (iK > 0) {
            long j10 = this.f6290p;
            long j11 = this.f6288n;
            long j12 = iK;
            if (j12 <= j10 - j11) {
                byte[] bArr = new byte[iK];
                t04.w(j11, bArr, 0L, j12);
                String str = new String(bArr, ly3.f11869b);
                this.f6288n += j12;
                return str;
            }
        }
        if (iK > 0 && iK <= D()) {
            byte[] bArr2 = new byte[iK];
            F(bArr2, 0, iK);
            return new String(bArr2, ly3.f11869b);
        }
        if (iK == 0) {
            return "";
        }
        if (iK < 0) {
            throw ny3.f();
        }
        throw ny3.k();
    }
}
