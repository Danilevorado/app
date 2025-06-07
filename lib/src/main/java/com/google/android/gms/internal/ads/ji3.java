package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPublicKeySpec;

/* loaded from: classes.dex */
final class ji3 extends cl3 {
    ji3(Class cls) {
        super(cls);
    }

    @Override // com.google.android.gms.internal.ads.cl3
    public final /* bridge */ /* synthetic */ Object a(jz3 jz3Var) throws GeneralSecurityException {
        dr3 dr3Var = (dr3) jz3Var;
        xq3 xq3VarL = dr3Var.L();
        gr3 gr3VarO = xq3VarL.O();
        int iC = si3.c(gr3VarO.P());
        byte[] bArrF = dr3Var.Q().f();
        byte[] bArrF2 = dr3Var.R().f();
        ECParameterSpec eCParameterSpecH = vu3.h(iC);
        ECPoint eCPoint = new ECPoint(new BigInteger(1, bArrF), new BigInteger(1, bArrF2));
        sj3.b(eCPoint, eCParameterSpecH.getCurve());
        return new ru3((ECPublicKey) ((KeyFactory) fv3.f8462h.a("EC")).generatePublic(new ECPublicKeySpec(eCPoint, eCParameterSpecH)), gr3VarO.N().f(), si3.b(gr3VarO.Q()), si3.d(xq3VarL.R()), new ti3(xq3VarL.K().N()));
    }
}
