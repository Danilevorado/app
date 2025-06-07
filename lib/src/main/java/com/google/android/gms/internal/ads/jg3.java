package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
final class jg3 extends ck3 {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ kg3 f10476b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    jg3(kg3 kg3Var, Class cls) {
        super(cls);
        this.f10476b = kg3Var;
    }

    @Override // com.google.android.gms.internal.ads.ck3
    public final /* bridge */ /* synthetic */ jz3 a(jz3 jz3Var) {
        iq3 iq3VarL = jq3.L();
        iq3VarL.v(0);
        byte[] bArrA = wv3.a(32);
        iq3VarL.u(ww3.I(bArrA, 0, bArrA.length));
        return (jq3) iq3VarL.m();
    }

    @Override // com.google.android.gms.internal.ads.ck3
    public final /* synthetic */ jz3 b(ww3 ww3Var) {
        return mq3.M(ww3Var, qx3.a());
    }

    @Override // com.google.android.gms.internal.ads.ck3
    public final Map c() {
        HashMap map = new HashMap();
        map.put("CHACHA20_POLY1305", new bk3(mq3.L(), 1));
        map.put("CHACHA20_POLY1305_RAW", new bk3(mq3.L(), 3));
        return Collections.unmodifiableMap(map);
    }

    @Override // com.google.android.gms.internal.ads.ck3
    public final /* bridge */ /* synthetic */ void d(jz3 jz3Var) {
    }
}
