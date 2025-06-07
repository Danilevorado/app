package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public abstract class kj3 {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f11094a = c(1, 0);

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f11095b = c(2, 32);

    /* renamed from: c, reason: collision with root package name */
    public static final byte[] f11096c = c(2, 16);

    /* renamed from: d, reason: collision with root package name */
    public static final byte[] f11097d = c(2, 17);

    /* renamed from: e, reason: collision with root package name */
    public static final byte[] f11098e = c(2, 18);

    /* renamed from: f, reason: collision with root package name */
    public static final byte[] f11099f = c(2, 1);

    /* renamed from: g, reason: collision with root package name */
    public static final byte[] f11100g = c(2, 2);

    /* renamed from: h, reason: collision with root package name */
    public static final byte[] f11101h = c(2, 3);

    /* renamed from: i, reason: collision with root package name */
    public static final byte[] f11102i = c(2, 1);

    /* renamed from: j, reason: collision with root package name */
    public static final byte[] f11103j = c(2, 2);

    /* renamed from: k, reason: collision with root package name */
    public static final byte[] f11104k = c(2, 3);

    /* renamed from: l, reason: collision with root package name */
    public static final byte[] f11105l = new byte[0];

    /* renamed from: m, reason: collision with root package name */
    private static final byte[] f11106m;

    /* renamed from: n, reason: collision with root package name */
    private static final byte[] f11107n;

    /* renamed from: o, reason: collision with root package name */
    private static final byte[] f11108o;

    static {
        Charset charset = vl3.f16770a;
        f11106m = "KEM".getBytes(charset);
        f11107n = "HPKE".getBytes(charset);
        f11108o = "HPKE-v1".getBytes(charset);
    }

    static void a(cs3 cs3Var) throws GeneralSecurityException {
        if (cs3Var.P() == 2 || cs3Var.P() == 1) {
            throw new GeneralSecurityException("Invalid KEM param: ".concat(vr3.a(cs3Var.P())));
        }
        String str = "UNRECOGNIZED";
        if (cs3Var.O() == 2 || cs3Var.O() == 1) {
            int iO = cs3Var.O();
            if (iO == 2) {
                str = "KDF_UNKNOWN";
            } else if (iO == 3) {
                str = "HKDF_SHA256";
            } else if (iO == 4) {
                str = "HKDF_SHA384";
            } else if (iO == 5) {
                str = "HKDF_SHA512";
            }
            throw new GeneralSecurityException("Invalid KDF param: ".concat(str));
        }
        if (cs3Var.N() == 2 || cs3Var.N() == 1) {
            int iN = cs3Var.N();
            if (iN == 2) {
                str = "AEAD_UNKNOWN";
            } else if (iN == 3) {
                str = "AES_128_GCM";
            } else if (iN == 4) {
                str = "AES_256_GCM";
            } else if (iN == 5) {
                str = "CHACHA20_POLY1305";
            }
            throw new GeneralSecurityException("Invalid AEAD param: ".concat(str));
        }
    }

    static byte[] b(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        return mu3.b(f11107n, bArr, bArr2, bArr3);
    }

    public static byte[] c(int i10, int i11) {
        byte[] bArr = new byte[i10];
        for (int i12 = 0; i12 < i10; i12++) {
            bArr[i12] = (byte) ((i11 >> (((i10 - i12) - 1) * 8)) & 255);
        }
        return bArr;
    }

    static byte[] d(byte[] bArr) {
        return mu3.b(f11106m, bArr);
    }

    static byte[] e(String str, byte[] bArr, byte[] bArr2) {
        return mu3.b(f11108o, bArr2, str.getBytes(vl3.f16770a), bArr);
    }

    static byte[] f(String str, byte[] bArr, byte[] bArr2, int i10) {
        return mu3.b(c(2, i10), f11108o, bArr2, str.getBytes(vl3.f16770a), bArr);
    }

    static int g(int i10) throws GeneralSecurityException {
        int i11 = i10 - 2;
        if (i11 == 2) {
            return 1;
        }
        if (i11 == 3) {
            return 2;
        }
        if (i11 == 4) {
            return 3;
        }
        throw new GeneralSecurityException("Unrecognized NIST HPKE KEM identifier");
    }
}
