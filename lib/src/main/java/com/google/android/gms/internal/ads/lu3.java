package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.util.Arrays;
import java.util.Collection;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes.dex */
public final class lu3 implements dc3 {

    /* renamed from: c, reason: collision with root package name */
    private static final Collection f11851c = Arrays.asList(64);

    /* renamed from: d, reason: collision with root package name */
    private static final byte[] f11852d = new byte[16];

    /* renamed from: a, reason: collision with root package name */
    private final rv3 f11853a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f11854b;

    public lu3(byte[] bArr) throws GeneralSecurityException {
        if (!yh3.a(1)) {
            throw new GeneralSecurityException("Can not use AES-SIV in FIPS-mode.");
        }
        Collection collection = f11851c;
        int length = bArr.length;
        if (collection.contains(Integer.valueOf(length))) {
            int i10 = length >> 1;
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 0, i10);
            this.f11854b = Arrays.copyOfRange(bArr, i10, length);
            this.f11853a = new rv3(bArrCopyOfRange);
            return;
        }
        throw new InvalidKeyException("invalid key size: " + length + " bytes; key must have 64 bytes");
    }

    @Override // com.google.android.gms.internal.ads.dc3
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArrC;
        if (bArr.length > 2147483631) {
            throw new GeneralSecurityException("plaintext too long");
        }
        Cipher cipher = (Cipher) fv3.f8456b.a("AES/CTR/NoPadding");
        byte[][] bArr3 = {bArr2, bArr};
        byte[] bArrA = this.f11853a.a(f11852d, 16);
        for (int i10 = 0; i10 <= 0; i10++) {
            byte[] bArr4 = bArr3[i10];
            if (bArr4 == null) {
                bArr4 = new byte[0];
            }
            bArrA = mu3.c(sn3.b(bArrA), this.f11853a.a(bArr4, 16));
        }
        byte[] bArr5 = bArr3[1];
        int length = bArr5.length;
        if (length >= 16) {
            int length2 = bArrA.length;
            if (length < length2) {
                throw new IllegalArgumentException("xorEnd requires a.length >= b.length");
            }
            bArrC = Arrays.copyOf(bArr5, length);
            for (int i11 = 0; i11 < bArrA.length; i11++) {
                int i12 = (length - length2) + i11;
                bArrC[i12] = (byte) (bArrC[i12] ^ bArrA[i11]);
            }
        } else {
            bArrC = mu3.c(sn3.a(bArr5), sn3.b(bArrA));
        }
        byte[] bArrA2 = this.f11853a.a(bArrC, 16);
        byte[] bArr6 = (byte[]) bArrA2.clone();
        bArr6[8] = (byte) (bArr6[8] & Byte.MAX_VALUE);
        bArr6[12] = (byte) (bArr6[12] & Byte.MAX_VALUE);
        cipher.init(1, new SecretKeySpec(this.f11854b, "AES"), new IvParameterSpec(bArr6));
        return mu3.b(bArrA2, cipher.doFinal(bArr));
    }
}
