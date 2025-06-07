package com.google.android.gms.internal.ads;

import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class wg3 implements wb3 {

    /* renamed from: c, reason: collision with root package name */
    private static final byte[] f17121c = new byte[0];

    /* renamed from: a, reason: collision with root package name */
    private final ss3 f17122a;

    /* renamed from: b, reason: collision with root package name */
    private final wb3 f17123b;

    public wg3(ss3 ss3Var, wb3 wb3Var) {
        this.f17122a = ss3Var;
        this.f17123b = wb3Var;
    }

    @Override // com.google.android.gms.internal.ads.wb3
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        try {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
            int i10 = byteBufferWrap.getInt();
            if (i10 <= 0 || i10 > bArr.length - 4) {
                throw new GeneralSecurityException("invalid ciphertext");
            }
            byte[] bArr3 = new byte[i10];
            byteBufferWrap.get(bArr3, 0, i10);
            byte[] bArr4 = new byte[byteBufferWrap.remaining()];
            byteBufferWrap.get(bArr4, 0, byteBufferWrap.remaining());
            byte[] bArrA = this.f17123b.a(bArr3, f17121c);
            String strP = this.f17122a.P();
            int i11 = qd3.f14253g;
            ww3 ww3Var = ww3.f17284n;
            return ((wb3) qd3.f(strP, ww3.I(bArrA, 0, bArrA.length), wb3.class)).a(bArr4, bArr2);
        } catch (IndexOutOfBoundsException | NegativeArraySizeException | BufferUnderflowException e5) {
            throw new GeneralSecurityException("invalid ciphertext", e5);
        }
    }

    @Override // com.google.android.gms.internal.ads.wb3
    public final byte[] b(byte[] bArr, byte[] bArr2) {
        byte[] bArrX = qd3.d(this.f17122a).x();
        byte[] bArrB = this.f17123b.b(bArrX, f17121c);
        String strP = this.f17122a.P();
        ww3 ww3Var = ww3.f17284n;
        byte[] bArrB2 = ((wb3) qd3.f(strP, ww3.I(bArrX, 0, bArrX.length), wb3.class)).b(bArr, bArr2);
        int length = bArrB.length;
        return ByteBuffer.allocate(length + 4 + bArrB2.length).putInt(length).put(bArrB).put(bArrB2).array();
    }
}
