package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes.dex */
public final class uu3 {

    /* renamed from: a, reason: collision with root package name */
    private final ECPublicKey f16477a;

    public uu3(ECPublicKey eCPublicKey) {
        this.f16477a = eCPublicKey;
    }

    public final tu3 a(String str, byte[] bArr, byte[] bArr2, int i10, int i11) throws IllegalStateException, GeneralSecurityException {
        KeyPair keyPairB = vu3.b(this.f16477a.getParams());
        ECPublicKey eCPublicKey = (ECPublicKey) keyPairB.getPublic();
        byte[] bArrE = vu3.e((ECPrivateKey) keyPairB.getPrivate(), this.f16477a);
        byte[] bArrJ = vu3.j(eCPublicKey.getParams().getCurve(), i11, eCPublicKey.getW());
        int i12 = 1;
        byte[] bArrB = mu3.b(bArrJ, bArrE);
        Mac mac = (Mac) fv3.f8457c.a(str);
        if (i10 > mac.getMacLength() * 255) {
            throw new GeneralSecurityException("size too large");
        }
        if (bArr == null || bArr.length == 0) {
            mac.init(new SecretKeySpec(new byte[mac.getMacLength()], str));
        } else {
            mac.init(new SecretKeySpec(bArr, str));
        }
        byte[] bArrDoFinal = mac.doFinal(bArrB);
        byte[] bArr3 = new byte[i10];
        mac.init(new SecretKeySpec(bArrDoFinal, str));
        byte[] bArrDoFinal2 = new byte[0];
        int i13 = 0;
        while (true) {
            mac.update(bArrDoFinal2);
            mac.update(bArr2);
            mac.update((byte) i12);
            bArrDoFinal2 = mac.doFinal();
            int length = bArrDoFinal2.length;
            int i14 = i13 + length;
            if (i14 >= i10) {
                System.arraycopy(bArrDoFinal2, 0, bArr3, i13, i10 - i13);
                return new tu3(bArrJ, bArr3);
            }
            System.arraycopy(bArrDoFinal2, 0, bArr3, i13, length);
            i12++;
            i13 = i14;
        }
    }
}
