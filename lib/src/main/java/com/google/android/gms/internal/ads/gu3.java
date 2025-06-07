package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes.dex */
public final class gu3 implements qv3 {

    /* renamed from: d, reason: collision with root package name */
    private static final ThreadLocal f8887d = new fu3();

    /* renamed from: a, reason: collision with root package name */
    private final SecretKeySpec f8888a;

    /* renamed from: b, reason: collision with root package name */
    private final int f8889b;

    /* renamed from: c, reason: collision with root package name */
    private final int f8890c;

    public gu3(byte[] bArr, int i10) throws GeneralSecurityException {
        if (!yh3.a(2)) {
            throw new GeneralSecurityException("Can not use AES-CTR in FIPS-mode, as BoringCrypto module is not available.");
        }
        yv3.a(bArr.length);
        this.f8888a = new SecretKeySpec(bArr, "AES");
        int blockSize = ((Cipher) f8887d.get()).getBlockSize();
        this.f8890c = blockSize;
        if (i10 < 12 || i10 > blockSize) {
            throw new GeneralSecurityException("invalid IV size");
        }
        this.f8889b = i10;
    }

    private final void c(byte[] bArr, int i10, int i11, byte[] bArr2, int i12, byte[] bArr3, boolean z10) throws GeneralSecurityException {
        Cipher cipher = (Cipher) f8887d.get();
        byte[] bArr4 = new byte[this.f8890c];
        System.arraycopy(bArr3, 0, bArr4, 0, this.f8889b);
        cipher.init(z10 ? 1 : 2, this.f8888a, new IvParameterSpec(bArr4));
        if (cipher.doFinal(bArr, i10, i11, bArr2, i12) != i11) {
            throw new GeneralSecurityException("stored output's length does not match input's length");
        }
    }

    @Override // com.google.android.gms.internal.ads.qv3
    public final byte[] a(byte[] bArr) throws GeneralSecurityException {
        int length = bArr.length;
        int i10 = this.f8889b;
        if (length < i10) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        byte[] bArr2 = new byte[i10];
        System.arraycopy(bArr, 0, bArr2, 0, i10);
        int i11 = this.f8889b;
        int i12 = length - i11;
        byte[] bArr3 = new byte[i12];
        c(bArr, i11, i12, bArr3, 0, bArr2, false);
        return bArr3;
    }

    @Override // com.google.android.gms.internal.ads.qv3
    public final byte[] b(byte[] bArr) throws GeneralSecurityException {
        int length = bArr.length;
        int i10 = this.f8889b;
        if (length <= Integer.MAX_VALUE - i10) {
            byte[] bArr2 = new byte[i10 + length];
            byte[] bArrA = wv3.a(i10);
            System.arraycopy(bArrA, 0, bArr2, 0, this.f8889b);
            c(bArr, 0, length, bArr2, this.f8889b, bArrA, true);
            return bArr2;
        }
        throw new GeneralSecurityException("plaintext length can not exceed " + (Integer.MAX_VALUE - this.f8889b));
    }
}
