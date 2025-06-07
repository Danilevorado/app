package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
final class ae3 extends ck3 {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ be3 f6061b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ae3(be3 be3Var, Class cls) {
        super(cls);
        this.f6061b = be3Var;
    }

    @Override // com.google.android.gms.internal.ads.ck3
    public final /* bridge */ /* synthetic */ jz3 a(jz3 jz3Var) {
        uo3 uo3Var = (uo3) jz3Var;
        new ee3();
        yo3 yo3VarG = de3.g(uo3Var.N());
        jz3 jz3VarA = new an3().a().a(uo3Var.O());
        qo3 qo3VarL = ro3.L();
        qo3VarL.u(yo3VarG);
        qo3VarL.v((nr3) jz3VarA);
        qo3VarL.w(0);
        return (ro3) qo3VarL.m();
    }

    @Override // com.google.android.gms.internal.ads.ck3
    public final /* synthetic */ jz3 b(ww3 ww3Var) {
        return uo3.M(ww3Var, qx3.a());
    }

    @Override // com.google.android.gms.internal.ads.ck3
    public final Map c() {
        HashMap map = new HashMap();
        map.put("AES128_CTR_HMAC_SHA256", be3.k(16, 16, 32, 16, 5, 1));
        map.put("AES128_CTR_HMAC_SHA256_RAW", be3.k(16, 16, 32, 16, 5, 3));
        map.put("AES256_CTR_HMAC_SHA256", be3.k(32, 16, 32, 32, 5, 1));
        map.put("AES256_CTR_HMAC_SHA256_RAW", be3.k(32, 16, 32, 32, 5, 3));
        return Collections.unmodifiableMap(map);
    }

    @Override // com.google.android.gms.internal.ads.ck3
    public final /* bridge */ /* synthetic */ void d(jz3 jz3Var) throws GeneralSecurityException {
        uo3 uo3Var = (uo3) jz3Var;
        ((de3) new ee3().a()).d(uo3Var.N());
        new an3().a().d(uo3Var.O());
        yv3.a(uo3Var.N().K());
    }
}
