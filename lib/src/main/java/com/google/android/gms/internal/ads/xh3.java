package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes.dex */
public final class xh3 implements wb3 {

    /* renamed from: b, reason: collision with root package name */
    private static final ThreadLocal f17567b = new wh3();

    /* renamed from: a, reason: collision with root package name */
    private final SecretKey f17568a;

    public xh3(byte[] bArr) throws InvalidAlgorithmParameterException {
        yv3.a(bArr.length);
        this.f17568a = new SecretKeySpec(bArr, "AES");
    }

    private static AlgorithmParameterSpec c(byte[] bArr, int i10, int i11) throws GeneralSecurityException, ClassNotFoundException {
        try {
            Class.forName("javax.crypto.spec.GCMParameterSpec");
            return new GCMParameterSpec(128, bArr, 0, i11);
        } catch (ClassNotFoundException unused) {
            if (xv3.a()) {
                return new IvParameterSpec(bArr, 0, i11);
            }
            throw new GeneralSecurityException("cannot use AES-GCM: javax.crypto.spec.GCMParameterSpec not found");
        }
    }

    @Override // com.google.android.gms.internal.ads.wb3
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException, ClassNotFoundException {
        int length = bArr.length;
        if (length < 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        AlgorithmParameterSpec algorithmParameterSpecC = c(bArr, 0, 12);
        ThreadLocal threadLocal = f17567b;
        ((Cipher) threadLocal.get()).init(2, this.f17568a, algorithmParameterSpecC);
        if (bArr2 != null && bArr2.length != 0) {
            ((Cipher) threadLocal.get()).updateAAD(bArr2);
        }
        return ((Cipher) threadLocal.get()).doFinal(bArr, 12, length - 12);
    }

    @Override // com.google.android.gms.internal.ads.wb3
    public final byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException, ClassNotFoundException {
        int length = bArr.length;
        if (length > 2147483619) {
            throw new GeneralSecurityException("plaintext too long");
        }
        byte[] bArr3 = new byte[length + 28];
        byte[] bArrA = wv3.a(12);
        System.arraycopy(bArrA, 0, bArr3, 0, 12);
        AlgorithmParameterSpec algorithmParameterSpecC = c(bArrA, 0, bArrA.length);
        ThreadLocal threadLocal = f17567b;
        ((Cipher) threadLocal.get()).init(1, this.f17568a, algorithmParameterSpecC);
        int iDoFinal = ((Cipher) threadLocal.get()).doFinal(bArr, 0, length, bArr3, 12);
        if (iDoFinal == length + 16) {
            return bArr3;
        }
        throw new GeneralSecurityException(String.format("encryption failed; GCM tag must be %s bytes, but got only %s bytes", 16, Integer.valueOf(iDoFinal - length)));
    }
}
