package com.google.android.gms.internal.ads;

import java.security.InvalidAlgorithmParameterException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
final class bi3 extends ck3 {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ci3 f6498b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bi3(ci3 ci3Var, Class cls) {
        super(cls);
        this.f6498b = ci3Var;
    }

    @Override // com.google.android.gms.internal.ads.ck3
    public final /* bridge */ /* synthetic */ jz3 a(jz3 jz3Var) {
        cq3 cq3VarL = dq3.L();
        byte[] bArrA = wv3.a(((gq3) jz3Var).K());
        cq3VarL.u(ww3.I(bArrA, 0, bArrA.length));
        cq3VarL.v(0);
        return (dq3) cq3VarL.m();
    }

    @Override // com.google.android.gms.internal.ads.ck3
    public final /* synthetic */ jz3 b(ww3 ww3Var) {
        return gq3.N(ww3Var, qx3.a());
    }

    @Override // com.google.android.gms.internal.ads.ck3
    public final Map c() {
        HashMap map = new HashMap();
        fq3 fq3VarL = gq3.L();
        fq3VarL.u(64);
        map.put("AES256_SIV", new bk3((gq3) fq3VarL.m(), 1));
        fq3 fq3VarL2 = gq3.L();
        fq3VarL2.u(64);
        map.put("AES256_SIV_RAW", new bk3((gq3) fq3VarL2.m(), 3));
        return Collections.unmodifiableMap(map);
    }

    @Override // com.google.android.gms.internal.ads.ck3
    public final /* bridge */ /* synthetic */ void d(jz3 jz3Var) throws InvalidAlgorithmParameterException {
        gq3 gq3Var = (gq3) jz3Var;
        if (gq3Var.K() == 64) {
            return;
        }
        throw new InvalidAlgorithmParameterException("invalid key size: " + gq3Var.K() + ". Valid keys must have 64 bytes.");
    }
}
