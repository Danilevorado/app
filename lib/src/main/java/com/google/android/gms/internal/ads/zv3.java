package com.google.android.gms.internal.ads;

import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.util.Arrays;

/* loaded from: classes.dex */
public abstract class zv3 {
    public static byte[] a(byte[] bArr, byte[] bArr2) throws InvalidKeyException {
        if (bArr.length != 32) {
            throw new InvalidKeyException("Private key must have 32 bytes.");
        }
        long[] jArr = new long[11];
        byte[] bArrCopyOf = Arrays.copyOf(bArr, 32);
        bArrCopyOf[0] = (byte) (bArrCopyOf[0] & 248);
        int i10 = bArrCopyOf[31] & Byte.MAX_VALUE;
        bArrCopyOf[31] = (byte) i10;
        bArrCopyOf[31] = (byte) (i10 | 64);
        int i11 = ou3.f13404b;
        if (bArr2.length != 32) {
            throw new InvalidKeyException("Public key length is not 32-byte");
        }
        byte[] bArrCopyOf2 = Arrays.copyOf(bArr2, 32);
        bArrCopyOf2[31] = (byte) (bArrCopyOf2[31] & Byte.MAX_VALUE);
        for (int i12 = 0; i12 < 7; i12++) {
            byte[][] bArr3 = ou3.f13403a;
            if (MessageDigest.isEqual(bArr3[i12], bArrCopyOf2)) {
                throw new InvalidKeyException("Banned public key: ".concat(pv3.a(bArr3[i12])));
            }
        }
        long[] jArrK = ov3.k(bArrCopyOf2);
        long[] jArr2 = new long[19];
        long[] jArr3 = new long[19];
        jArr3[0] = 1;
        long[] jArr4 = new long[19];
        jArr4[0] = 1;
        long[] jArr5 = new long[19];
        long[] jArr6 = new long[19];
        long[] jArr7 = new long[19];
        jArr7[0] = 1;
        long[] jArr8 = new long[19];
        long[] jArr9 = new long[19];
        jArr9[0] = 1;
        int i13 = 10;
        System.arraycopy(jArrK, 0, jArr2, 0, 10);
        int i14 = 0;
        int i15 = 32;
        while (i14 < i15) {
            int i16 = bArrCopyOf[(32 - i14) - 1] & 255;
            int i17 = 0;
            while (i17 < 8) {
                int i18 = (i16 >> (7 - i17)) & 1;
                ou3.a(jArr4, jArr2, i18);
                ou3.a(jArr5, jArr3, i18);
                byte[] bArr4 = bArrCopyOf;
                long[] jArrCopyOf = Arrays.copyOf(jArr4, 10);
                int i19 = i16;
                long[] jArr10 = new long[19];
                long[] jArr11 = jArr;
                long[] jArr12 = new long[19];
                int i20 = i14;
                long[] jArr13 = new long[19];
                int i21 = i17;
                long[] jArr14 = new long[19];
                long[] jArr15 = new long[19];
                long[] jArr16 = jArr9;
                long[] jArr17 = new long[19];
                long[] jArr18 = new long[19];
                ov3.i(jArr4, jArr4, jArr5);
                ov3.h(jArr5, jArrCopyOf, jArr5);
                long[] jArrCopyOf2 = Arrays.copyOf(jArr2, 10);
                ov3.i(jArr2, jArr2, jArr3);
                ov3.h(jArr3, jArrCopyOf2, jArr3);
                ov3.b(jArr14, jArr2, jArr5);
                ov3.b(jArr15, jArr4, jArr3);
                ov3.e(jArr14);
                ov3.d(jArr14);
                ov3.e(jArr15);
                ov3.d(jArr15);
                long[] jArr19 = jArr2;
                System.arraycopy(jArr14, 0, jArrCopyOf2, 0, 10);
                ov3.i(jArr14, jArr14, jArr15);
                ov3.h(jArr15, jArrCopyOf2, jArr15);
                ov3.g(jArr18, jArr14);
                ov3.g(jArr17, jArr15);
                ov3.b(jArr15, jArr17, jArrK);
                ov3.e(jArr15);
                ov3.d(jArr15);
                System.arraycopy(jArr18, 0, jArr6, 0, 10);
                System.arraycopy(jArr15, 0, jArr7, 0, 10);
                ov3.g(jArr12, jArr4);
                ov3.g(jArr13, jArr5);
                ov3.b(jArr8, jArr12, jArr13);
                ov3.e(jArr8);
                ov3.d(jArr8);
                ov3.h(jArr13, jArr12, jArr13);
                Arrays.fill(jArr10, 10, 18, 0L);
                ov3.f(jArr10, jArr13, 121665L);
                ov3.d(jArr10);
                ov3.i(jArr10, jArr10, jArr12);
                ov3.b(jArr16, jArr13, jArr10);
                ov3.e(jArr16);
                ov3.d(jArr16);
                ou3.a(jArr8, jArr6, i18);
                ou3.a(jArr16, jArr7, i18);
                i17 = i21 + 1;
                jArr9 = jArr5;
                jArr2 = jArr6;
                i16 = i19;
                jArr = jArr11;
                i14 = i20;
                jArr6 = jArr19;
                jArr5 = jArr16;
                bArrCopyOf = bArr4;
                long[] jArr20 = jArr4;
                jArr4 = jArr8;
                jArr8 = jArr20;
                long[] jArr21 = jArr7;
                jArr7 = jArr3;
                jArr3 = jArr21;
            }
            i14++;
            bArrCopyOf = bArrCopyOf;
            i15 = 32;
            i13 = 10;
        }
        long[] jArr22 = jArr;
        int i22 = i13;
        long[] jArr23 = new long[i22];
        long[] jArr24 = new long[i22];
        long[] jArr25 = new long[i22];
        long[] jArr26 = new long[i22];
        long[] jArr27 = new long[i22];
        long[] jArr28 = new long[i22];
        long[] jArr29 = new long[i22];
        long[] jArr30 = new long[i22];
        long[] jArr31 = new long[i22];
        long[] jArr32 = new long[i22];
        long[] jArr33 = jArr2;
        long[] jArr34 = new long[i22];
        ov3.g(jArr24, jArr5);
        ov3.g(jArr34, jArr24);
        ov3.g(jArr32, jArr34);
        ov3.a(jArr25, jArr32, jArr5);
        ov3.a(jArr26, jArr25, jArr24);
        ov3.g(jArr32, jArr26);
        ov3.a(jArr27, jArr32, jArr25);
        ov3.g(jArr32, jArr27);
        ov3.g(jArr34, jArr32);
        ov3.g(jArr32, jArr34);
        ov3.g(jArr34, jArr32);
        ov3.g(jArr32, jArr34);
        ov3.a(jArr28, jArr32, jArr27);
        ov3.g(jArr32, jArr28);
        ov3.g(jArr34, jArr32);
        for (int i23 = 2; i23 < 10; i23 += 2) {
            ov3.g(jArr32, jArr34);
            ov3.g(jArr34, jArr32);
        }
        ov3.a(jArr29, jArr34, jArr28);
        ov3.g(jArr32, jArr29);
        ov3.g(jArr34, jArr32);
        for (int i24 = 2; i24 < 20; i24 += 2) {
            ov3.g(jArr32, jArr34);
            ov3.g(jArr34, jArr32);
        }
        ov3.a(jArr32, jArr34, jArr29);
        ov3.g(jArr34, jArr32);
        ov3.g(jArr32, jArr34);
        for (int i25 = 2; i25 < 10; i25 += 2) {
            ov3.g(jArr34, jArr32);
            ov3.g(jArr32, jArr34);
        }
        ov3.a(jArr30, jArr32, jArr28);
        ov3.g(jArr32, jArr30);
        ov3.g(jArr34, jArr32);
        for (int i26 = 2; i26 < 50; i26 += 2) {
            ov3.g(jArr32, jArr34);
            ov3.g(jArr34, jArr32);
        }
        ov3.a(jArr31, jArr34, jArr30);
        ov3.g(jArr34, jArr31);
        ov3.g(jArr32, jArr34);
        for (int i27 = 2; i27 < 100; i27 += 2) {
            ov3.g(jArr34, jArr32);
            ov3.g(jArr32, jArr34);
        }
        ov3.a(jArr34, jArr32, jArr31);
        ov3.g(jArr32, jArr34);
        ov3.g(jArr34, jArr32);
        for (int i28 = 2; i28 < 50; i28 += 2) {
            ov3.g(jArr32, jArr34);
            ov3.g(jArr34, jArr32);
        }
        ov3.a(jArr32, jArr34, jArr30);
        ov3.g(jArr34, jArr32);
        ov3.g(jArr32, jArr34);
        ov3.g(jArr34, jArr32);
        ov3.g(jArr32, jArr34);
        ov3.g(jArr34, jArr32);
        ov3.a(jArr23, jArr34, jArr26);
        ov3.a(jArr22, jArr4, jArr23);
        long[] jArr35 = new long[10];
        long[] jArr36 = new long[10];
        long[] jArr37 = new long[11];
        long[] jArr38 = new long[11];
        long[] jArr39 = new long[11];
        ov3.a(jArr35, jArrK, jArr22);
        ov3.i(jArr36, jArrK, jArr22);
        long[] jArr40 = new long[10];
        jArr40[0] = 486662;
        ov3.i(jArr38, jArr36, jArr40);
        ov3.a(jArr38, jArr38, jArr3);
        ov3.i(jArr38, jArr38, jArr33);
        ov3.a(jArr38, jArr38, jArr35);
        ov3.a(jArr38, jArr38, jArr33);
        ov3.f(jArr37, jArr38, 4L);
        ov3.d(jArr37);
        ov3.a(jArr38, jArr35, jArr3);
        ov3.h(jArr38, jArr38, jArr3);
        ov3.a(jArr39, jArr36, jArr33);
        ov3.i(jArr38, jArr38, jArr39);
        ov3.g(jArr38, jArr38);
        if (MessageDigest.isEqual(ov3.j(jArr37), ov3.j(jArr38))) {
            return ov3.j(jArr22);
        }
        throw new IllegalStateException("Arithmetic error in curve multiplication with the public key: ".concat(pv3.a(bArr2)));
    }

    public static byte[] b() {
        byte[] bArrA = wv3.a(32);
        bArrA[0] = (byte) (bArrA[0] | 7);
        int i10 = bArrA[31] & 63;
        bArrA[31] = (byte) i10;
        bArrA[31] = (byte) (i10 | 128);
        return bArrA;
    }

    public static byte[] c(byte[] bArr) throws InvalidKeyException {
        if (bArr.length != 32) {
            throw new InvalidKeyException("Private key must have 32 bytes.");
        }
        byte[] bArr2 = new byte[32];
        bArr2[0] = 9;
        return a(bArr, bArr2);
    }
}
