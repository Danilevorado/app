package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes.dex */
public final class rv3 implements fo3 {

    /* renamed from: a, reason: collision with root package name */
    private final SecretKey f14986a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f14987b;

    /* renamed from: c, reason: collision with root package name */
    private final byte[] f14988c;

    public rv3(byte[] bArr) throws GeneralSecurityException {
        yv3.a(bArr.length);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        this.f14986a = secretKeySpec;
        Cipher cipherB = b();
        cipherB.init(1, secretKeySpec);
        byte[] bArrB = sn3.b(cipherB.doFinal(new byte[16]));
        this.f14987b = bArrB;
        this.f14988c = sn3.b(bArrB);
    }

    private static Cipher b() throws GeneralSecurityException {
        if (yh3.a(1)) {
            return (Cipher) fv3.f8456b.a("AES/ECB/NoPadding");
        }
        throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
    }

    @Override // com.google.android.gms.internal.ads.fo3
    public final byte[] a(byte[] bArr, int i10) throws GeneralSecurityException {
        if (i10 > 16) {
            throw new InvalidAlgorithmParameterException("outputLength too large, max is 16 bytes");
        }
        Cipher cipherB = b();
        cipherB.init(1, this.f14986a);
        int length = bArr.length;
        int iMax = Math.max(1, (int) Math.ceil(length / 16.0d));
        byte[] bArrD = iMax * 16 == length ? mu3.d(bArr, (iMax - 1) * 16, this.f14987b, 0, 16) : mu3.c(sn3.a(Arrays.copyOfRange(bArr, (iMax - 1) * 16, length)), this.f14988c);
        byte[] bArrDoFinal = new byte[16];
        for (int i11 = 0; i11 < iMax - 1; i11++) {
            bArrDoFinal = cipherB.doFinal(mu3.d(bArrDoFinal, 0, bArr, i11 * 16, 16));
        }
        return Arrays.copyOf(cipherB.doFinal(mu3.c(bArrD, bArrDoFinal)), i10);
    }
}
