package com.google.android.gms.internal.ads;

import java.security.InvalidAlgorithmParameterException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
final class cf3 extends ck3 {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ df3 f6903b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    cf3(df3 df3Var, Class cls) {
        super(cls);
        this.f6903b = df3Var;
    }

    @Override // com.google.android.gms.internal.ads.ck3
    public final /* bridge */ /* synthetic */ jz3 a(jz3 jz3Var) {
        pp3 pp3VarL = qp3.L();
        byte[] bArrA = wv3.a(((tp3) jz3Var).K());
        pp3VarL.u(ww3.I(bArrA, 0, bArrA.length));
        pp3VarL.v(0);
        return (qp3) pp3VarL.m();
    }

    @Override // com.google.android.gms.internal.ads.ck3
    public final /* synthetic */ jz3 b(ww3 ww3Var) {
        return tp3.N(ww3Var, qx3.a());
    }

    @Override // com.google.android.gms.internal.ads.ck3
    public final Map c() {
        HashMap map = new HashMap();
        map.put("AES128_GCM", df3.k(16, 1));
        map.put("AES128_GCM_RAW", df3.k(16, 3));
        map.put("AES256_GCM", df3.k(32, 1));
        map.put("AES256_GCM_RAW", df3.k(32, 3));
        return Collections.unmodifiableMap(map);
    }

    @Override // com.google.android.gms.internal.ads.ck3
    public final /* synthetic */ void d(jz3 jz3Var) throws InvalidAlgorithmParameterException {
        yv3.a(((tp3) jz3Var).K());
    }
}
