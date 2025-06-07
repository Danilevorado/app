package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class aw3 implements wb3 {

    /* renamed from: a, reason: collision with root package name */
    private final uh3 f6275a;

    public aw3(byte[] bArr) {
        this.f6275a = new uh3(bArr);
    }

    @Override // com.google.android.gms.internal.ads.wb3
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        if (length < 40) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        return this.f6275a.c(ByteBuffer.wrap(bArr, 24, length - 24), Arrays.copyOf(bArr, 24), bArr2);
    }

    @Override // com.google.android.gms.internal.ads.wb3
    public final byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bArr.length + 40);
        byte[] bArrA = wv3.a(24);
        byteBufferAllocate.put(bArrA);
        this.f6275a.b(byteBufferAllocate, bArrA, bArr, bArr2);
        return byteBufferAllocate.array();
    }
}
