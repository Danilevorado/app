package com.google.android.gms.internal.ads;

import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPair;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECPoint;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
final class hi3 extends ck3 {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ii3 f9147b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    hi3(ii3 ii3Var, Class cls) {
        super(cls);
        this.f9147b = ii3Var;
    }

    @Override // com.google.android.gms.internal.ads.ck3
    public final /* bridge */ /* synthetic */ jz3 a(jz3 jz3Var) throws InvalidAlgorithmParameterException {
        uq3 uq3Var = (uq3) jz3Var;
        KeyPair keyPairB = vu3.b(vu3.h(si3.c(uq3Var.N().O().P())));
        ECPublicKey eCPublicKey = (ECPublicKey) keyPairB.getPublic();
        ECPrivateKey eCPrivateKey = (ECPrivateKey) keyPairB.getPrivate();
        ECPoint w10 = eCPublicKey.getW();
        cr3 cr3VarM = dr3.M();
        cr3VarM.v(0);
        cr3VarM.u(uq3Var.N());
        byte[] byteArray = w10.getAffineX().toByteArray();
        ww3 ww3Var = ww3.f17284n;
        cr3VarM.w(ww3.I(byteArray, 0, byteArray.length));
        byte[] byteArray2 = w10.getAffineY().toByteArray();
        cr3VarM.y(ww3.I(byteArray2, 0, byteArray2.length));
        dr3 dr3Var = (dr3) cr3VarM.m();
        zq3 zq3VarL = ar3.L();
        zq3VarL.w(0);
        zq3VarL.v(dr3Var);
        byte[] byteArray3 = eCPrivateKey.getS().toByteArray();
        zq3VarL.u(ww3.I(byteArray3, 0, byteArray3.length));
        return (ar3) zq3VarL.m();
    }

    @Override // com.google.android.gms.internal.ads.ck3
    public final /* synthetic */ jz3 b(ww3 ww3Var) {
        return uq3.M(ww3Var, qx3.a());
    }

    @Override // com.google.android.gms.internal.ads.ck3
    public final Map c() {
        HashMap map = new HashMap();
        map.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM", ii3.l(4, 5, 3, sc3.a("AES128_GCM"), ii3.f9765e, 1));
        map.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM_RAW", ii3.l(4, 5, 3, sc3.a("AES128_GCM"), ii3.f9765e, 3));
        map.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_GCM", ii3.l(4, 5, 4, sc3.a("AES128_GCM"), ii3.f9765e, 1));
        map.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_GCM_RAW", ii3.l(4, 5, 4, sc3.a("AES128_GCM"), ii3.f9765e, 3));
        map.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM_COMPRESSED_WITHOUT_PREFIX", ii3.l(4, 5, 4, sc3.a("AES128_GCM"), ii3.f9765e, 3));
        map.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256", ii3.l(4, 5, 3, sc3.a("AES128_CTR_HMAC_SHA256"), ii3.f9765e, 1));
        map.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256_RAW", ii3.l(4, 5, 3, sc3.a("AES128_CTR_HMAC_SHA256"), ii3.f9765e, 3));
        map.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256", ii3.l(4, 5, 4, sc3.a("AES128_CTR_HMAC_SHA256"), ii3.f9765e, 1));
        map.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256_RAW", ii3.l(4, 5, 4, sc3.a("AES128_CTR_HMAC_SHA256"), ii3.f9765e, 3));
        return Collections.unmodifiableMap(map);
    }

    @Override // com.google.android.gms.internal.ads.ck3
    public final /* synthetic */ void d(jz3 jz3Var) {
        si3.a(((uq3) jz3Var).N());
    }
}
