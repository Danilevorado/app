package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

/* loaded from: classes.dex */
abstract class qh3 {

    /* renamed from: a, reason: collision with root package name */
    int[] f14323a;

    /* renamed from: b, reason: collision with root package name */
    private final int f14324b;

    public qh3(byte[] bArr, int i10) throws InvalidKeyException {
        if (bArr.length != 32) {
            throw new InvalidKeyException("The key length in bytes must be 32.");
        }
        this.f14323a = lh3.d(bArr);
        this.f14324b = i10;
    }

    private final void f(byte[] bArr, ByteBuffer byteBuffer, ByteBuffer byteBuffer2) throws GeneralSecurityException {
        if (bArr.length != a()) {
            throw new GeneralSecurityException("The nonce length (in bytes) must be " + a());
        }
        int iRemaining = byteBuffer2.remaining();
        int i10 = iRemaining / 64;
        int i11 = 0;
        while (true) {
            int i12 = i10 + 1;
            if (i11 >= i12) {
                return;
            }
            ByteBuffer byteBufferC = c(bArr, this.f14324b + i11);
            if (i11 == i12 - 1) {
                mu3.a(byteBuffer, byteBuffer2, byteBufferC, iRemaining % 64);
            } else {
                mu3.a(byteBuffer, byteBuffer2, byteBufferC, 64);
            }
            i11++;
        }
    }

    abstract int a();

    abstract int[] b(int[] iArr, int i10);

    final ByteBuffer c(byte[] bArr, int i10) {
        int[] iArrB = b(lh3.d(bArr), i10);
        int[] iArr = (int[]) iArrB.clone();
        lh3.c(iArr);
        for (int i11 = 0; i11 < 16; i11++) {
            iArrB[i11] = iArrB[i11] + iArr[i11];
        }
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(64).order(ByteOrder.LITTLE_ENDIAN);
        byteBufferOrder.asIntBuffer().put(iArrB, 0, 16);
        return byteBufferOrder;
    }

    public final void d(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (byteBuffer.remaining() < bArr2.length) {
            throw new IllegalArgumentException("Given ByteBuffer output is too small");
        }
        f(bArr, byteBuffer, ByteBuffer.wrap(bArr2));
    }

    public final byte[] e(byte[] bArr, ByteBuffer byteBuffer) throws GeneralSecurityException {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(byteBuffer.remaining());
        f(bArr, byteBufferAllocate, byteBuffer);
        return byteBufferAllocate.array();
    }
}
