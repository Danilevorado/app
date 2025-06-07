package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
final class ch3 extends ck3 {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ dh3 f6922b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ch3(dh3 dh3Var, Class cls) {
        super(cls);
        this.f6922b = dh3Var;
    }

    @Override // com.google.android.gms.internal.ads.ck3
    public final /* bridge */ /* synthetic */ jz3 a(jz3 jz3Var) {
        au3 au3VarL = bu3.L();
        au3VarL.v(0);
        byte[] bArrA = wv3.a(32);
        au3VarL.u(ww3.I(bArrA, 0, bArrA.length));
        return (bu3) au3VarL.m();
    }

    @Override // com.google.android.gms.internal.ads.ck3
    public final /* synthetic */ jz3 b(ww3 ww3Var) {
        return eu3.M(ww3Var, qx3.a());
    }

    @Override // com.google.android.gms.internal.ads.ck3
    public final Map c() {
        HashMap map = new HashMap();
        map.put("XCHACHA20_POLY1305", new bk3(eu3.L(), 1));
        map.put("XCHACHA20_POLY1305_RAW", new bk3(eu3.L(), 3));
        return Collections.unmodifiableMap(map);
    }

    @Override // com.google.android.gms.internal.ads.ck3
    public final /* bridge */ /* synthetic */ void d(jz3 jz3Var) {
    }
}
