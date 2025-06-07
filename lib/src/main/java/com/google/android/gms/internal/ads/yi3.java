package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* loaded from: classes.dex */
final class yi3 {

    /* renamed from: g, reason: collision with root package name */
    private static final byte[] f18062g = new byte[0];

    /* renamed from: a, reason: collision with root package name */
    private final xi3 f18063a;

    /* renamed from: b, reason: collision with root package name */
    private final BigInteger f18064b;

    /* renamed from: c, reason: collision with root package name */
    private final byte[] f18065c;

    /* renamed from: d, reason: collision with root package name */
    private final byte[] f18066d;

    /* renamed from: e, reason: collision with root package name */
    private final byte[] f18067e;

    /* renamed from: f, reason: collision with root package name */
    private BigInteger f18068f = BigInteger.ZERO;

    private yi3(byte[] bArr, byte[] bArr2, byte[] bArr3, BigInteger bigInteger, xi3 xi3Var) {
        this.f18067e = bArr;
        this.f18065c = bArr2;
        this.f18066d = bArr3;
        this.f18064b = bigInteger;
        this.f18063a = xi3Var;
    }

    static yi3 c(byte[] bArr, byte[] bArr2, bj3 bj3Var, wi3 wi3Var, xi3 xi3Var, byte[] bArr3) throws GeneralSecurityException {
        byte[] bArrB = kj3.b(bj3Var.b(), wi3Var.c(), xi3Var.b());
        byte[] bArr4 = kj3.f11105l;
        byte[] bArr5 = f18062g;
        byte[] bArrB2 = mu3.b(kj3.f11094a, wi3Var.e(bArr4, bArr5, "psk_id_hash", bArrB), wi3Var.e(bArr4, bArr3, "info_hash", bArrB));
        byte[] bArrE = wi3Var.e(bArr2, bArr5, "secret", bArrB);
        byte[] bArrD = wi3Var.d(bArrE, bArrB2, "key", bArrB, xi3Var.a());
        byte[] bArrD2 = wi3Var.d(bArrE, bArrB2, "base_nonce", bArrB, 12);
        BigInteger bigInteger = BigInteger.ONE;
        return new yi3(bArr, bArrD, bArrD2, bigInteger.shiftLeft(96).subtract(bigInteger), xi3Var);
    }

    private final synchronized byte[] d() {
        byte[] bArrC;
        byte[] bArr = this.f18066d;
        BigInteger bigInteger = this.f18068f;
        if (bigInteger.signum() == -1) {
            throw new IllegalArgumentException("integer must be nonnegative");
        }
        byte[] byteArray = bigInteger.toByteArray();
        int length = byteArray.length;
        if (length != 12) {
            if (length > 13) {
                throw new GeneralSecurityException("integer too large");
            }
            if (length != 13) {
                byte[] bArr2 = new byte[12];
                System.arraycopy(byteArray, 0, bArr2, 12 - length, length);
                byteArray = bArr2;
            } else {
                if (byteArray[0] != 0) {
                    throw new GeneralSecurityException("integer too large");
                }
                byteArray = Arrays.copyOfRange(byteArray, 1, 13);
            }
        }
        bArrC = mu3.c(bArr, byteArray);
        if (this.f18068f.compareTo(this.f18064b) >= 0) {
            throw new GeneralSecurityException("message limit reached");
        }
        this.f18068f = this.f18068f.add(BigInteger.ONE);
        return bArrC;
    }

    final byte[] a() {
        return this.f18067e;
    }

    final byte[] b(byte[] bArr, byte[] bArr2) {
        return this.f18063a.c(this.f18065c, d(), bArr, bArr2);
    }
}
