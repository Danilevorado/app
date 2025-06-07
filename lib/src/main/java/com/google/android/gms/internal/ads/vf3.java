package com.google.android.gms.internal.ads;

import java.security.InvalidAlgorithmParameterException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
final class vf3 extends ck3 {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ wf3 f16678b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    vf3(wf3 wf3Var, Class cls) {
        super(cls);
        this.f16678b = wf3Var;
    }

    @Override // com.google.android.gms.internal.ads.ck3
    public final /* bridge */ /* synthetic */ jz3 a(jz3 jz3Var) {
        vp3 vp3VarL = xp3.L();
        byte[] bArrA = wv3.a(((aq3) jz3Var).K());
        vp3VarL.u(ww3.I(bArrA, 0, bArrA.length));
        vp3VarL.v(0);
        return (xp3) vp3VarL.m();
    }

    @Override // com.google.android.gms.internal.ads.ck3
    public final /* synthetic */ jz3 b(ww3 ww3Var) {
        return aq3.N(ww3Var, qx3.a());
    }

    @Override // com.google.android.gms.internal.ads.ck3
    public final Map c() {
        HashMap map = new HashMap();
        map.put("AES128_GCM_SIV", wf3.l(16, 1));
        map.put("AES128_GCM_SIV_RAW", wf3.l(16, 3));
        map.put("AES256_GCM_SIV", wf3.l(32, 1));
        map.put("AES256_GCM_SIV_RAW", wf3.l(32, 3));
        return Collections.unmodifiableMap(map);
    }

    @Override // com.google.android.gms.internal.ads.ck3
    public final /* synthetic */ void d(jz3 jz3Var) throws InvalidAlgorithmParameterException {
        yv3.a(((aq3) jz3Var).K());
    }
}
