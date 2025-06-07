package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class dq1 extends an1 {
    @Override // com.google.android.gms.internal.ads.zl1
    public final void c(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i10 = iLimit - iPosition;
        int i11 = this.f6176b.f17592c;
        if (i11 == 3) {
            i10 += i10;
        } else if (i11 == 4) {
            i10 /= 2;
        } else if (i11 != 268435456) {
            if (i11 != 536870912) {
                if (i11 != 805306368) {
                    throw new IllegalStateException();
                }
                i10 /= 2;
            } else {
                i10 /= 3;
                i10 += i10;
            }
        }
        ByteBuffer byteBufferJ = j(i10);
        int i12 = this.f6176b.f17592c;
        if (i12 == 3) {
            while (iPosition < iLimit) {
                byteBufferJ.put((byte) 0);
                byteBufferJ.put((byte) ((byteBuffer.get(iPosition) & 255) - 128));
                iPosition++;
            }
        } else if (i12 == 4) {
            while (iPosition < iLimit) {
                short sMax = (short) (Math.max(-1.0f, Math.min(byteBuffer.getFloat(iPosition), 1.0f)) * 32767.0f);
                byteBufferJ.put((byte) (sMax & 255));
                byteBufferJ.put((byte) ((sMax >> 8) & 255));
                iPosition += 4;
            }
        } else if (i12 == 268435456) {
            while (iPosition < iLimit) {
                byteBufferJ.put(byteBuffer.get(iPosition + 1));
                byteBufferJ.put(byteBuffer.get(iPosition));
                iPosition += 2;
            }
        } else if (i12 == 536870912) {
            while (iPosition < iLimit) {
                byteBufferJ.put(byteBuffer.get(iPosition + 1));
                byteBufferJ.put(byteBuffer.get(iPosition + 2));
                iPosition += 3;
            }
        } else {
            if (i12 != 805306368) {
                throw new IllegalStateException();
            }
            while (iPosition < iLimit) {
                byteBufferJ.put(byteBuffer.get(iPosition + 2));
                byteBufferJ.put(byteBuffer.get(iPosition + 3));
                iPosition += 4;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        byteBufferJ.flip();
    }

    @Override // com.google.android.gms.internal.ads.an1
    public final xj1 i(xj1 xj1Var) throws yk1 {
        int i10 = xj1Var.f17592c;
        if (i10 != 3) {
            if (i10 == 2) {
                return xj1.f17589e;
            }
            if (i10 != 268435456 && i10 != 536870912 && i10 != 805306368 && i10 != 4) {
                throw new yk1("Unhandled input format:", xj1Var);
            }
        }
        return new xj1(xj1Var.f17590a, xj1Var.f17591b, 2);
    }
}
