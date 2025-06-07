package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class nu3 implements wb3 {

    /* renamed from: a, reason: collision with root package name */
    private final rh3 f12864a;

    public nu3(byte[] bArr) {
        this.f12864a = new rh3(bArr);
    }

    @Override // com.google.android.gms.internal.ads.wb3
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        if (length < 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        return this.f12864a.c(ByteBuffer.wrap(bArr, 12, length - 12), Arrays.copyOf(bArr, 12), bArr2);
    }

    @Override // com.google.android.gms.internal.ads.wb3
    public final byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bArr.length + 28);
        byte[] bArrA = wv3.a(12);
        byteBufferAllocate.put(bArrA);
        this.f12864a.b(byteBufferAllocate, bArrA, bArr, bArr2);
        return byteBufferAllocate.array();
    }
}
