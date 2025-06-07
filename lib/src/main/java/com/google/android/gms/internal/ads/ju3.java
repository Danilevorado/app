package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import javax.crypto.AEADBadTagException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes.dex */
public final class ju3 implements wb3 {

    /* renamed from: e, reason: collision with root package name */
    private static final ThreadLocal f10717e = new hu3();

    /* renamed from: f, reason: collision with root package name */
    private static final ThreadLocal f10718f = new iu3();

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f10719a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f10720b;

    /* renamed from: c, reason: collision with root package name */
    private final SecretKeySpec f10721c;

    /* renamed from: d, reason: collision with root package name */
    private final int f10722d;

    public ju3(byte[] bArr, int i10) throws GeneralSecurityException {
        if (!yh3.a(1)) {
            throw new GeneralSecurityException("Can not use AES-EAX in FIPS-mode.");
        }
        if (i10 != 12 && i10 != 16) {
            throw new IllegalArgumentException("IV size should be either 12 or 16 bytes");
        }
        this.f10722d = i10;
        yv3.a(bArr.length);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        this.f10721c = secretKeySpec;
        Cipher cipher = (Cipher) f10717e.get();
        cipher.init(1, secretKeySpec);
        byte[] bArrC = c(cipher.doFinal(new byte[16]));
        this.f10719a = bArrC;
        this.f10720b = c(bArrC);
    }

    private static byte[] c(byte[] bArr) {
        byte[] bArr2 = new byte[16];
        int i10 = 0;
        while (i10 < 15) {
            byte b10 = bArr[i10];
            int i11 = i10 + 1;
            bArr2[i10] = (byte) (((b10 + b10) ^ ((bArr[i11] & 255) >>> 7)) & 255);
            i10 = i11;
        }
        byte b11 = bArr[15];
        bArr2[15] = (byte) (((bArr[0] >> 7) & 135) ^ (b11 + b11));
        return bArr2;
    }

    private final byte[] d(Cipher cipher, int i10, byte[] bArr, int i11, int i12) throws BadPaddingException, IllegalBlockSizeException {
        int length;
        byte[] bArrE;
        byte[] bArr2 = new byte[16];
        bArr2[15] = (byte) i10;
        if (i12 == 0) {
            return cipher.doFinal(e(bArr2, this.f10719a));
        }
        byte[] bArrDoFinal = cipher.doFinal(bArr2);
        int i13 = 0;
        int i14 = 0;
        while (i12 - i14 > 16) {
            for (int i15 = 0; i15 < 16; i15++) {
                bArrDoFinal[i15] = (byte) (bArrDoFinal[i15] ^ bArr[(i11 + i14) + i15]);
            }
            bArrDoFinal = cipher.doFinal(bArrDoFinal);
            i14 += 16;
        }
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, i14 + i11, i11 + i12);
        if (bArrCopyOfRange.length == 16) {
            bArrE = e(bArrCopyOfRange, this.f10719a);
        } else {
            byte[] bArrCopyOf = Arrays.copyOf(this.f10720b, 16);
            while (true) {
                length = bArrCopyOfRange.length;
                if (i13 >= length) {
                    break;
                }
                bArrCopyOf[i13] = (byte) (bArrCopyOf[i13] ^ bArrCopyOfRange[i13]);
                i13++;
            }
            bArrCopyOf[length] = (byte) (bArrCopyOf[length] ^ 128);
            bArrE = bArrCopyOf;
        }
        return cipher.doFinal(e(bArrDoFinal, bArrE));
    }

    private static byte[] e(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        byte[] bArr3 = new byte[length];
        for (int i10 = 0; i10 < length; i10++) {
            bArr3[i10] = (byte) (bArr[i10] ^ bArr2[i10]);
        }
        return bArr3;
    }

    @Override // com.google.android.gms.internal.ads.wb3
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        int i10 = (length - this.f10722d) - 16;
        if (i10 < 0) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        Cipher cipher = (Cipher) f10717e.get();
        cipher.init(1, this.f10721c);
        byte[] bArrD = d(cipher, 0, bArr, 0, this.f10722d);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        byte[] bArr3 = bArr2;
        byte[] bArrD2 = d(cipher, 1, bArr3, 0, bArr3.length);
        byte[] bArrD3 = d(cipher, 2, bArr, this.f10722d, i10);
        int i11 = length - 16;
        byte b10 = 0;
        for (int i12 = 0; i12 < 16; i12++) {
            b10 = (byte) (b10 | (((bArr[i11 + i12] ^ bArrD2[i12]) ^ bArrD[i12]) ^ bArrD3[i12]));
        }
        if (b10 != 0) {
            throw new AEADBadTagException("tag mismatch");
        }
        Cipher cipher2 = (Cipher) f10718f.get();
        cipher2.init(1, this.f10721c, new IvParameterSpec(bArrD));
        return cipher2.doFinal(bArr, this.f10722d, i10);
    }

    @Override // com.google.android.gms.internal.ads.wb3
    public final byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        int i10 = this.f10722d;
        if (length > (Integer.MAX_VALUE - i10) - 16) {
            throw new GeneralSecurityException("plaintext too long");
        }
        byte[] bArr3 = new byte[i10 + length + 16];
        byte[] bArrA = wv3.a(i10);
        System.arraycopy(bArrA, 0, bArr3, 0, this.f10722d);
        Cipher cipher = (Cipher) f10717e.get();
        cipher.init(1, this.f10721c);
        byte[] bArrD = d(cipher, 0, bArrA, 0, bArrA.length);
        byte[] bArrD2 = d(cipher, 1, bArr2, 0, 0);
        Cipher cipher2 = (Cipher) f10718f.get();
        cipher2.init(1, this.f10721c, new IvParameterSpec(bArrD));
        cipher2.doFinal(bArr, 0, length, bArr3, this.f10722d);
        byte[] bArrD3 = d(cipher, 2, bArr3, this.f10722d, length);
        int i11 = length + this.f10722d;
        for (int i12 = 0; i12 < 16; i12++) {
            bArr3[i11 + i12] = (byte) ((bArrD2[i12] ^ bArrD[i12]) ^ bArrD3[i12]);
        }
        return bArr3;
    }
}
