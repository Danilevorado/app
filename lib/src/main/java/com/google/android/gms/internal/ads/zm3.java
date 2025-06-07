package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
final class zm3 extends ck3 {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ an3 f18649b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zm3(an3 an3Var, Class cls) {
        super(cls);
        this.f18649b = an3Var;
    }

    @Override // com.google.android.gms.internal.ads.ck3
    public final /* bridge */ /* synthetic */ jz3 a(jz3 jz3Var) {
        qr3 qr3Var = (qr3) jz3Var;
        mr3 mr3VarL = nr3.L();
        mr3VarL.w(0);
        mr3VarL.v(qr3Var.P());
        byte[] bArrA = wv3.a(qr3Var.K());
        mr3VarL.u(ww3.I(bArrA, 0, bArrA.length));
        return (nr3) mr3VarL.m();
    }

    @Override // com.google.android.gms.internal.ads.ck3
    public final /* synthetic */ jz3 b(ww3 ww3Var) {
        return qr3.O(ww3Var, qx3.a());
    }

    @Override // com.google.android.gms.internal.ads.ck3
    public final Map c() {
        HashMap map = new HashMap();
        map.put("HMAC_SHA256_128BITTAG", an3.n(32, 16, 5, 1));
        map.put("HMAC_SHA256_128BITTAG_RAW", an3.n(32, 16, 5, 3));
        map.put("HMAC_SHA256_256BITTAG", an3.n(32, 32, 5, 1));
        map.put("HMAC_SHA256_256BITTAG_RAW", an3.n(32, 32, 5, 3));
        map.put("HMAC_SHA512_128BITTAG", an3.n(64, 16, 6, 1));
        map.put("HMAC_SHA512_128BITTAG_RAW", an3.n(64, 16, 6, 3));
        map.put("HMAC_SHA512_256BITTAG", an3.n(64, 32, 6, 1));
        map.put("HMAC_SHA512_256BITTAG_RAW", an3.n(64, 32, 6, 3));
        map.put("HMAC_SHA512_512BITTAG", an3.n(64, 64, 6, 1));
        map.put("HMAC_SHA512_512BITTAG_RAW", an3.n(64, 64, 6, 3));
        return Collections.unmodifiableMap(map);
    }

    @Override // com.google.android.gms.internal.ads.ck3
    public final /* bridge */ /* synthetic */ void d(jz3 jz3Var) throws GeneralSecurityException {
        qr3 qr3Var = (qr3) jz3Var;
        if (qr3Var.K() < 16) {
            throw new GeneralSecurityException("key too short");
        }
        an3.o(qr3Var.P());
    }
}
