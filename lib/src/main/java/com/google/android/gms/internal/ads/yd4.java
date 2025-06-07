package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class yd4 extends an1 {

    /* renamed from: i, reason: collision with root package name */
    private int f17984i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f17985j;

    /* renamed from: k, reason: collision with root package name */
    private byte[] f17986k;

    /* renamed from: l, reason: collision with root package name */
    private byte[] f17987l;

    /* renamed from: m, reason: collision with root package name */
    private int f17988m;

    /* renamed from: n, reason: collision with root package name */
    private int f17989n;

    /* renamed from: o, reason: collision with root package name */
    private int f17990o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f17991p;

    /* renamed from: q, reason: collision with root package name */
    private long f17992q;

    public yd4() {
        byte[] bArr = sv2.f15565f;
        this.f17986k = bArr;
        this.f17987l = bArr;
    }

    private final int q(long j10) {
        return (int) ((j10 * this.f6176b.f17590a) / 1000000);
    }

    private final int r(ByteBuffer byteBuffer) {
        for (int iPosition = byteBuffer.position(); iPosition < byteBuffer.limit(); iPosition += 2) {
            if (Math.abs((int) byteBuffer.getShort(iPosition)) > 1024) {
                int i10 = this.f17984i;
                return i10 * (iPosition / i10);
            }
        }
        return byteBuffer.limit();
    }

    private final void s(byte[] bArr, int i10) {
        j(i10).put(bArr, 0, i10).flip();
        if (i10 > 0) {
            this.f17991p = true;
        }
    }

    private final void t(ByteBuffer byteBuffer, byte[] bArr, int i10) {
        int iMin = Math.min(byteBuffer.remaining(), this.f17990o);
        int i11 = this.f17990o - iMin;
        System.arraycopy(bArr, i10 - i11, this.f17987l, 0, i11);
        byteBuffer.position(byteBuffer.limit() - iMin);
        byteBuffer.get(this.f17987l, i11, iMin);
    }

    @Override // com.google.android.gms.internal.ads.zl1
    public final void c(ByteBuffer byteBuffer) {
        int iLimit;
        int iPosition;
        while (byteBuffer.hasRemaining() && !n()) {
            int i10 = this.f17988m;
            int i11 = 1;
            if (i10 == 0) {
                iLimit = byteBuffer.limit();
                byteBuffer.limit(Math.min(iLimit, byteBuffer.position() + this.f17986k.length));
                int iLimit2 = byteBuffer.limit();
                while (true) {
                    iLimit2 -= 2;
                    if (iLimit2 < byteBuffer.position()) {
                        iPosition = byteBuffer.position();
                        break;
                    } else if (Math.abs((int) byteBuffer.getShort(iLimit2)) > 1024) {
                        int i12 = this.f17984i;
                        iPosition = ((iLimit2 / i12) * i12) + i12;
                        break;
                    }
                }
                if (iPosition == byteBuffer.position()) {
                    this.f17988m = i11;
                } else {
                    byteBuffer.limit(iPosition);
                    int iRemaining = byteBuffer.remaining();
                    j(iRemaining).put(byteBuffer).flip();
                    if (iRemaining > 0) {
                        this.f17991p = true;
                    }
                }
                byteBuffer.limit(iLimit);
            } else if (i10 != 1) {
                iLimit = byteBuffer.limit();
                int iR = r(byteBuffer);
                byteBuffer.limit(iR);
                this.f17992q += byteBuffer.remaining() / this.f17984i;
                t(byteBuffer, this.f17987l, this.f17990o);
                if (iR < iLimit) {
                    s(this.f17987l, this.f17990o);
                    this.f17988m = 0;
                    byteBuffer.limit(iLimit);
                }
            } else {
                iLimit = byteBuffer.limit();
                int iR2 = r(byteBuffer);
                int iPosition2 = iR2 - byteBuffer.position();
                byte[] bArr = this.f17986k;
                int length = bArr.length;
                int i13 = this.f17989n;
                int i14 = length - i13;
                if (iR2 >= iLimit || iPosition2 >= i14) {
                    int iMin = Math.min(iPosition2, i14);
                    byteBuffer.limit(byteBuffer.position() + iMin);
                    byteBuffer.get(this.f17986k, this.f17989n, iMin);
                    int i15 = this.f17989n + iMin;
                    this.f17989n = i15;
                    byte[] bArr2 = this.f17986k;
                    if (i15 == bArr2.length) {
                        if (this.f17991p) {
                            s(bArr2, this.f17990o);
                            long j10 = this.f17992q;
                            int i16 = this.f17989n;
                            int i17 = this.f17990o;
                            this.f17992q = j10 + ((i16 - (i17 + i17)) / this.f17984i);
                            i15 = i16;
                        } else {
                            this.f17992q += (i15 - this.f17990o) / this.f17984i;
                        }
                        t(byteBuffer, this.f17986k, i15);
                        this.f17989n = 0;
                        i11 = 2;
                        this.f17988m = i11;
                    }
                    byteBuffer.limit(iLimit);
                } else {
                    s(bArr, i13);
                    this.f17989n = 0;
                    this.f17988m = 0;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.an1, com.google.android.gms.internal.ads.zl1
    public final boolean h() {
        return this.f17985j;
    }

    @Override // com.google.android.gms.internal.ads.an1
    public final xj1 i(xj1 xj1Var) throws yk1 {
        if (xj1Var.f17592c == 2) {
            return this.f17985j ? xj1Var : xj1.f17589e;
        }
        throw new yk1("Unhandled input format:", xj1Var);
    }

    @Override // com.google.android.gms.internal.ads.an1
    protected final void k() {
        if (this.f17985j) {
            this.f17984i = this.f6176b.f17593d;
            int iQ = q(150000L) * this.f17984i;
            if (this.f17986k.length != iQ) {
                this.f17986k = new byte[iQ];
            }
            int iQ2 = q(20000L) * this.f17984i;
            this.f17990o = iQ2;
            if (this.f17987l.length != iQ2) {
                this.f17987l = new byte[iQ2];
            }
        }
        this.f17988m = 0;
        this.f17992q = 0L;
        this.f17989n = 0;
        this.f17991p = false;
    }

    @Override // com.google.android.gms.internal.ads.an1
    protected final void l() {
        int i10 = this.f17989n;
        if (i10 > 0) {
            s(this.f17986k, i10);
        }
        if (this.f17991p) {
            return;
        }
        this.f17992q += this.f17990o / this.f17984i;
    }

    @Override // com.google.android.gms.internal.ads.an1
    protected final void m() {
        this.f17985j = false;
        this.f17990o = 0;
        byte[] bArr = sv2.f15565f;
        this.f17986k = bArr;
        this.f17987l = bArr;
    }

    public final long o() {
        return this.f17992q;
    }

    public final void p(boolean z10) {
        this.f17985j = z10;
    }
}
