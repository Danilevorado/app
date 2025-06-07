package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes.dex */
final class wi3 {

    /* renamed from: a, reason: collision with root package name */
    private final String f17147a;

    wi3(String str) {
        this.f17147a = str;
    }

    private final byte[] f(byte[] bArr, byte[] bArr2, int i10) throws IllegalStateException, GeneralSecurityException {
        Mac mac = (Mac) fv3.f8457c.a(this.f17147a);
        if (i10 > mac.getMacLength() * 255) {
            throw new GeneralSecurityException("size too large");
        }
        byte[] bArr3 = new byte[i10];
        mac.init(new SecretKeySpec(bArr, this.f17147a));
        byte[] bArrDoFinal = new byte[0];
        int i11 = 1;
        int i12 = 0;
        while (true) {
            mac.update(bArrDoFinal);
            mac.update(bArr2);
            mac.update((byte) i11);
            bArrDoFinal = mac.doFinal();
            int length = bArrDoFinal.length;
            int i13 = i12 + length;
            if (i13 >= i10) {
                System.arraycopy(bArrDoFinal, 0, bArr3, i12, i10 - i12);
                return bArr3;
            }
            System.arraycopy(bArrDoFinal, 0, bArr3, i12, length);
            i11++;
            i12 = i13;
        }
    }

    private final byte[] g(byte[] bArr, byte[] bArr2) throws InvalidKeyException {
        Mac mac = (Mac) fv3.f8457c.a(this.f17147a);
        if (bArr2 == null || bArr2.length == 0) {
            mac.init(new SecretKeySpec(new byte[mac.getMacLength()], this.f17147a));
        } else {
            mac.init(new SecretKeySpec(bArr2, this.f17147a));
        }
        return mac.doFinal(bArr);
    }

    final int a() {
        return Mac.getInstance(this.f17147a).getMacLength();
    }

    public final byte[] b(byte[] bArr, byte[] bArr2, String str, byte[] bArr3, String str2, byte[] bArr4, int i10) {
        return f(g(kj3.e("eae_prk", bArr2, bArr4), null), kj3.f("shared_secret", bArr3, bArr4, i10), i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final byte[] c() throws java.security.GeneralSecurityException {
        /*
            r5 = this;
            java.lang.String r0 = r5.f17147a
            int r1 = r0.hashCode()
            r2 = 984523022(0x3aaea10e, float:0.0013323145)
            r3 = 2
            r4 = 1
            if (r1 == r2) goto L2c
            r2 = 984524074(0x3aaea52a, float:0.0013324369)
            if (r1 == r2) goto L22
            r2 = 984525777(0x3aaeabd1, float:0.0013326352)
            if (r1 == r2) goto L18
            goto L36
        L18:
            java.lang.String r1 = "HmacSha512"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L36
            r0 = r3
            goto L37
        L22:
            java.lang.String r1 = "HmacSha384"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L36
            r0 = r4
            goto L37
        L2c:
            java.lang.String r1 = "HmacSha256"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L36
            r0 = 0
            goto L37
        L36:
            r0 = -1
        L37:
            if (r0 == 0) goto L4b
            if (r0 == r4) goto L48
            if (r0 != r3) goto L40
            byte[] r0 = com.google.android.gms.internal.ads.kj3.f11101h
            return r0
        L40:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r1 = "Could not determine HPKE KDF ID"
            r0.<init>(r1)
            throw r0
        L48:
            byte[] r0 = com.google.android.gms.internal.ads.kj3.f11100g
            return r0
        L4b:
            byte[] r0 = com.google.android.gms.internal.ads.kj3.f11099f
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.wi3.c():byte[]");
    }

    public final byte[] d(byte[] bArr, byte[] bArr2, String str, byte[] bArr3, int i10) {
        return f(bArr, kj3.f(str, bArr2, bArr3, i10), i10);
    }

    public final byte[] e(byte[] bArr, byte[] bArr2, String str, byte[] bArr3) {
        return g(kj3.e(str, bArr2, bArr3), bArr);
    }
}
