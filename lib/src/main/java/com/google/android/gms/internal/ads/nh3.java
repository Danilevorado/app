package com.google.android.gms.internal.ads;

import android.os.Build;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes.dex */
public final class nh3 {

    /* renamed from: c, reason: collision with root package name */
    private static final ThreadLocal f12637c = new mh3();

    /* renamed from: a, reason: collision with root package name */
    private final SecretKey f12638a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f12639b;

    public nh3(byte[] bArr, boolean z10) throws GeneralSecurityException {
        if (!yh3.a(2)) {
            throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
        }
        yv3.a(bArr.length);
        this.f12638a = new SecretKeySpec(bArr, "AES");
        this.f12639b = z10;
    }

    private static AlgorithmParameterSpec c(byte[] bArr, int i10, int i11) {
        String property = System.getProperty("java.vendor");
        Integer numValueOf = null;
        if (property == "The Android Project" || (property != null && property.equals("The Android Project"))) {
            numValueOf = Integer.valueOf(Build.VERSION.SDK_INT);
        }
        return (numValueOf == null || numValueOf.intValue() > 19) ? new GCMParameterSpec(128, bArr, 0, 12) : new IvParameterSpec(bArr, 0, 12);
    }

    public final byte[] a(byte[] bArr, byte[] bArr2, byte[] bArr3) throws GeneralSecurityException {
        if (bArr.length != 12) {
            throw new GeneralSecurityException("iv is wrong size");
        }
        boolean z10 = this.f12639b;
        int i10 = true != z10 ? 16 : 28;
        int length = bArr2.length;
        if (length < i10) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        if (z10 && !ByteBuffer.wrap(bArr).equals(ByteBuffer.wrap(bArr2, 0, 12))) {
            throw new GeneralSecurityException("iv does not match prepended iv");
        }
        AlgorithmParameterSpec algorithmParameterSpecC = c(bArr, 0, 12);
        ThreadLocal threadLocal = f12637c;
        ((Cipher) threadLocal.get()).init(2, this.f12638a, algorithmParameterSpecC);
        if (bArr3 != null && bArr3.length != 0) {
            ((Cipher) threadLocal.get()).updateAAD(bArr3);
        }
        boolean z11 = this.f12639b;
        int i11 = true != z11 ? 0 : 12;
        if (z11) {
            length -= 12;
        }
        return ((Cipher) threadLocal.get()).doFinal(bArr2, i11, length);
    }

    public final byte[] b(byte[] bArr, byte[] bArr2, byte[] bArr3) throws GeneralSecurityException {
        if (bArr.length != 12) {
            throw new GeneralSecurityException("iv is wrong size");
        }
        int length = bArr2.length;
        if (length > 2147483619) {
            throw new GeneralSecurityException("plaintext too long");
        }
        boolean z10 = this.f12639b;
        byte[] bArr4 = new byte[z10 ? length + 28 : length + 16];
        if (z10) {
            System.arraycopy(bArr, 0, bArr4, 0, 12);
        }
        AlgorithmParameterSpec algorithmParameterSpecC = c(bArr, 0, 12);
        ThreadLocal threadLocal = f12637c;
        ((Cipher) threadLocal.get()).init(1, this.f12638a, algorithmParameterSpecC);
        int iDoFinal = ((Cipher) threadLocal.get()).doFinal(bArr2, 0, length, bArr4, true != this.f12639b ? 0 : 12);
        if (iDoFinal == length + 16) {
            return bArr4;
        }
        throw new GeneralSecurityException(String.format("encryption failed; GCM tag must be %s bytes, but got only %s bytes", 16, Integer.valueOf(iDoFinal - length)));
    }
}
