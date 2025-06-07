package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class wu3 implements wb3 {

    /* renamed from: a, reason: collision with root package name */
    private final qv3 f17275a;

    /* renamed from: b, reason: collision with root package name */
    private final cd3 f17276b;

    /* renamed from: c, reason: collision with root package name */
    private final int f17277c;

    public wu3(qv3 qv3Var, cd3 cd3Var, int i10) {
        this.f17275a = qv3Var;
        this.f17276b = cd3Var;
        this.f17277c = i10;
    }

    @Override // com.google.android.gms.internal.ads.wb3
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        int i10 = this.f17277c;
        if (length < i10) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 0, length - i10);
        byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr, length - this.f17277c, length);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        this.f17276b.a(bArrCopyOfRange2, mu3.b(bArr2, bArrCopyOfRange, Arrays.copyOf(ByteBuffer.allocate(8).putLong(bArr2.length * 8).array(), 8)));
        return this.f17275a.a(bArrCopyOfRange);
    }

    @Override // com.google.android.gms.internal.ads.wb3
    public final byte[] b(byte[] bArr, byte[] bArr2) {
        byte[] bArrB = this.f17275a.b(bArr);
        return mu3.b(bArrB, this.f17276b.b(mu3.b(bArr2, bArrB, Arrays.copyOf(ByteBuffer.allocate(8).putLong(0L).array(), 8))));
    }
}
