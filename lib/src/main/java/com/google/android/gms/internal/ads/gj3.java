package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
final class gj3 extends ck3 {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ hj3 f8770b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    gj3(hj3 hj3Var, Class cls) {
        super(cls);
        this.f8770b = hj3Var;
    }

    @Override // com.google.android.gms.internal.ads.ck3
    public final /* bridge */ /* synthetic */ jz3 a(jz3 jz3Var) throws GeneralSecurityException {
        byte[] bArrB;
        byte[] bArrC;
        zr3 zr3Var = (zr3) jz3Var;
        int iP = zr3Var.N().P() - 2;
        if (iP == 1) {
            bArrB = zv3.b();
            bArrC = zv3.c(bArrB);
        } else {
            if (iP != 2 && iP != 3 && iP != 4) {
                throw new GeneralSecurityException("Invalid KEM");
            }
            int iG = kj3.g(zr3Var.N().P());
            KeyPair keyPairB = vu3.b(vu3.h(iG));
            bArrC = vu3.i(iG, 1, ((ECPublicKey) keyPairB.getPublic()).getW());
            bArrB = ((ECPrivateKey) keyPairB.getPrivate()).getS().toByteArray();
        }
        hs3 hs3VarM = is3.M();
        hs3VarM.w(0);
        hs3VarM.u(zr3Var.N());
        hs3VarM.v(ww3.I(bArrC, 0, bArrC.length));
        is3 is3Var = (is3) hs3VarM.m();
        es3 es3VarL = fs3.L();
        es3VarL.w(0);
        es3VarL.v(is3Var);
        es3VarL.u(ww3.I(bArrB, 0, bArrB.length));
        return (fs3) es3VarL.m();
    }

    @Override // com.google.android.gms.internal.ads.ck3
    public final /* synthetic */ jz3 b(ww3 ww3Var) {
        return zr3.M(ww3Var, qx3.a());
    }

    @Override // com.google.android.gms.internal.ads.ck3
    public final Map c() {
        HashMap map = new HashMap();
        map.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_AES_128_GCM", hj3.k(3, 3, 3, 1));
        map.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_AES_128_GCM_RAW", hj3.k(3, 3, 3, 3));
        map.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_AES_256_GCM", hj3.k(3, 3, 4, 1));
        map.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_AES_256_GCM_RAW", hj3.k(3, 3, 4, 3));
        map.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_CHACHA20_POLY1305", hj3.k(3, 3, 5, 1));
        map.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_CHACHA20_POLY1305_RAW", hj3.k(3, 3, 5, 3));
        map.put("DHKEM_P256_HKDF_SHA256_HKDF_SHA256_AES_128_GCM", hj3.k(4, 3, 3, 1));
        map.put("DHKEM_P256_HKDF_SHA256_HKDF_SHA256_AES_128_GCM_RAW", hj3.k(4, 3, 3, 3));
        map.put("DHKEM_P256_HKDF_SHA256_HKDF_SHA256_AES_256_GCM", hj3.k(4, 3, 4, 1));
        map.put("DHKEM_P256_HKDF_SHA256_HKDF_SHA256_AES_256_GCM_RAW", hj3.k(4, 3, 4, 3));
        map.put("DHKEM_P384_HKDF_SHA384_HKDF_SHA384_AES_128_GCM", hj3.k(5, 4, 3, 1));
        map.put("DHKEM_P384_HKDF_SHA384_HKDF_SHA384_AES_128_GCM_RAW", hj3.k(5, 4, 3, 3));
        map.put("DHKEM_P384_HKDF_SHA384_HKDF_SHA384_AES_256_GCM", hj3.k(5, 4, 4, 1));
        map.put("DHKEM_P384_HKDF_SHA384_HKDF_SHA384_AES_256_GCM_RAW", hj3.k(5, 4, 4, 3));
        map.put("DHKEM_P521_HKDF_SHA512_HKDF_SHA512_AES_128_GCM", hj3.k(6, 5, 3, 1));
        map.put("DHKEM_P521_HKDF_SHA512_HKDF_SHA512_AES_128_GCM_RAW", hj3.k(6, 5, 3, 3));
        map.put("DHKEM_P521_HKDF_SHA512_HKDF_SHA512_AES_256_GCM", hj3.k(6, 5, 4, 1));
        map.put("DHKEM_P521_HKDF_SHA512_HKDF_SHA512_AES_256_GCM_RAW", hj3.k(6, 5, 4, 3));
        return Collections.unmodifiableMap(map);
    }

    @Override // com.google.android.gms.internal.ads.ck3
    public final /* synthetic */ void d(jz3 jz3Var) throws GeneralSecurityException {
        kj3.a(((zr3) jz3Var).N());
    }
}
