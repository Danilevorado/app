package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
final class zd4 extends an1 {

    /* renamed from: i, reason: collision with root package name */
    private static final int f18533i = Float.floatToIntBits(Float.NaN);

    zd4() {
    }

    private static void o(int i10, ByteBuffer byteBuffer) {
        int iFloatToIntBits = Float.floatToIntBits((float) (i10 * 4.656612875245797E-10d));
        if (iFloatToIntBits == f18533i) {
            iFloatToIntBits = Float.floatToIntBits(0.0f);
        }
        byteBuffer.putInt(iFloatToIntBits);
    }

    @Override // com.google.android.gms.internal.ads.zl1
    public final void c(ByteBuffer byteBuffer) {
        ByteBuffer byteBufferJ;
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i10 = iLimit - iPosition;
        int i11 = this.f6176b.f17592c;
        if (i11 == 536870912) {
            byteBufferJ = j((i10 / 3) * 4);
            while (iPosition < iLimit) {
                o(((byteBuffer.get(iPosition) & 255) << 8) | ((byteBuffer.get(iPosition + 1) & 255) << 16) | ((byteBuffer.get(iPosition + 2) & 255) << 24), byteBufferJ);
                iPosition += 3;
            }
        } else {
            if (i11 != 805306368) {
                throw new IllegalStateException();
            }
            byteBufferJ = j(i10);
            while (iPosition < iLimit) {
                int i12 = byteBuffer.get(iPosition) & 255;
                int i13 = (byteBuffer.get(iPosition + 1) & 255) << 8;
                o(i12 | i13 | ((byteBuffer.get(iPosition + 2) & 255) << 16) | ((byteBuffer.get(iPosition + 3) & 255) << 24), byteBufferJ);
                iPosition += 4;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        byteBufferJ.flip();
    }

    @Override // com.google.android.gms.internal.ads.an1
    public final xj1 i(xj1 xj1Var) throws yk1 {
        int i10 = xj1Var.f17592c;
        int i11 = sv2.f15560a;
        if (i10 == 536870912 || i10 == 805306368) {
            return new xj1(xj1Var.f17590a, xj1Var.f17591b, 4);
        }
        if (i10 == 4) {
            return xj1.f17589e;
        }
        throw new yk1("Unhandled input format:", xj1Var);
    }
}
