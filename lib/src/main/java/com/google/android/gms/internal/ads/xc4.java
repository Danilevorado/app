package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.util.Objects;

/* loaded from: classes.dex */
final class xc4 extends an1 {

    /* renamed from: i, reason: collision with root package name */
    private int[] f17515i;

    /* renamed from: j, reason: collision with root package name */
    private int[] f17516j;

    xc4() {
    }

    @Override // com.google.android.gms.internal.ads.zl1
    public final void c(ByteBuffer byteBuffer) {
        int[] iArr = this.f17516j;
        Objects.requireNonNull(iArr);
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        ByteBuffer byteBufferJ = j(((iLimit - iPosition) / this.f6176b.f17593d) * this.f6177c.f17593d);
        while (iPosition < iLimit) {
            for (int i10 : iArr) {
                byteBufferJ.putShort(byteBuffer.getShort(i10 + i10 + iPosition));
            }
            iPosition += this.f6176b.f17593d;
        }
        byteBuffer.position(iLimit);
        byteBufferJ.flip();
    }

    @Override // com.google.android.gms.internal.ads.an1
    public final xj1 i(xj1 xj1Var) throws yk1 {
        int[] iArr = this.f17515i;
        if (iArr == null) {
            return xj1.f17589e;
        }
        if (xj1Var.f17592c != 2) {
            throw new yk1("Unhandled input format:", xj1Var);
        }
        boolean z10 = xj1Var.f17591b != iArr.length;
        int i10 = 0;
        while (true) {
            int length = iArr.length;
            if (i10 >= length) {
                return z10 ? new xj1(xj1Var.f17590a, length, 2) : xj1.f17589e;
            }
            int i11 = iArr[i10];
            if (i11 >= xj1Var.f17591b) {
                throw new yk1("Unhandled input format:", xj1Var);
            }
            z10 |= i11 != i10;
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.ads.an1
    protected final void k() {
        this.f17516j = this.f17515i;
    }

    @Override // com.google.android.gms.internal.ads.an1
    protected final void m() {
        this.f17516j = null;
        this.f17515i = null;
    }

    public final void o(int[] iArr) {
        this.f17515i = iArr;
    }
}
