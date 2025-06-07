package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
final class be4 extends an1 {

    /* renamed from: i, reason: collision with root package name */
    private int f6442i;

    /* renamed from: j, reason: collision with root package name */
    private int f6443j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f6444k;

    /* renamed from: l, reason: collision with root package name */
    private int f6445l;

    /* renamed from: m, reason: collision with root package name */
    private byte[] f6446m = sv2.f15565f;

    /* renamed from: n, reason: collision with root package name */
    private int f6447n;

    /* renamed from: o, reason: collision with root package name */
    private long f6448o;

    @Override // com.google.android.gms.internal.ads.an1, com.google.android.gms.internal.ads.zl1
    public final ByteBuffer b() {
        int i10;
        if (super.g() && (i10 = this.f6447n) > 0) {
            j(i10).put(this.f6446m, 0, this.f6447n).flip();
            this.f6447n = 0;
        }
        return super.b();
    }

    @Override // com.google.android.gms.internal.ads.zl1
    public final void c(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i10 = iLimit - iPosition;
        if (i10 == 0) {
            return;
        }
        int iMin = Math.min(i10, this.f6445l);
        this.f6448o += iMin / this.f6176b.f17593d;
        this.f6445l -= iMin;
        byteBuffer.position(iPosition + iMin);
        if (this.f6445l > 0) {
            return;
        }
        int i11 = i10 - iMin;
        int length = (this.f6447n + i11) - this.f6446m.length;
        ByteBuffer byteBufferJ = j(length);
        int iMax = Math.max(0, Math.min(length, this.f6447n));
        byteBufferJ.put(this.f6446m, 0, iMax);
        int iMax2 = Math.max(0, Math.min(length - iMax, i11));
        byteBuffer.limit(byteBuffer.position() + iMax2);
        byteBufferJ.put(byteBuffer);
        byteBuffer.limit(iLimit);
        int i12 = i11 - iMax2;
        int i13 = this.f6447n - iMax;
        this.f6447n = i13;
        byte[] bArr = this.f6446m;
        System.arraycopy(bArr, iMax, bArr, 0, i13);
        byteBuffer.get(this.f6446m, this.f6447n, i12);
        this.f6447n += i12;
        byteBufferJ.flip();
    }

    @Override // com.google.android.gms.internal.ads.an1, com.google.android.gms.internal.ads.zl1
    public final boolean g() {
        return super.g() && this.f6447n == 0;
    }

    @Override // com.google.android.gms.internal.ads.an1
    public final xj1 i(xj1 xj1Var) throws yk1 {
        if (xj1Var.f17592c != 2) {
            throw new yk1("Unhandled input format:", xj1Var);
        }
        this.f6444k = true;
        return (this.f6442i == 0 && this.f6443j == 0) ? xj1.f17589e : xj1Var;
    }

    @Override // com.google.android.gms.internal.ads.an1
    protected final void k() {
        if (this.f6444k) {
            this.f6444k = false;
            int i10 = this.f6443j;
            int i11 = this.f6176b.f17593d;
            this.f6446m = new byte[i10 * i11];
            this.f6445l = this.f6442i * i11;
        }
        this.f6447n = 0;
    }

    @Override // com.google.android.gms.internal.ads.an1
    protected final void l() {
        if (this.f6444k) {
            if (this.f6447n > 0) {
                this.f6448o += r0 / this.f6176b.f17593d;
            }
            this.f6447n = 0;
        }
    }

    @Override // com.google.android.gms.internal.ads.an1
    protected final void m() {
        this.f6446m = sv2.f15565f;
    }

    public final long o() {
        return this.f6448o;
    }

    public final void p() {
        this.f6448o = 0L;
    }

    public final void q(int i10, int i11) {
        this.f6442i = i10;
        this.f6443j = i11;
    }
}
