package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
final class cm3 extends ck3 {
    cm3(dm3 dm3Var, Class cls) {
        super(cls);
    }

    @Override // com.google.android.gms.internal.ads.ck3
    public final /* bridge */ /* synthetic */ jz3 a(jz3 jz3Var) {
        lo3 lo3Var = (lo3) jz3Var;
        ho3 ho3VarL = io3.L();
        ho3VarL.w(0);
        byte[] bArrA = wv3.a(lo3Var.K());
        ho3VarL.u(ww3.I(bArrA, 0, bArrA.length));
        ho3VarL.v(lo3Var.O());
        return (io3) ho3VarL.m();
    }

    @Override // com.google.android.gms.internal.ads.ck3
    public final /* synthetic */ jz3 b(ww3 ww3Var) {
        return lo3.N(ww3Var, qx3.a());
    }

    @Override // com.google.android.gms.internal.ads.ck3
    public final Map c() {
        HashMap map = new HashMap();
        ko3 ko3VarL = lo3.L();
        ko3VarL.u(32);
        no3 no3VarL = oo3.L();
        no3VarL.u(16);
        ko3VarL.v((oo3) no3VarL.m());
        map.put("AES_CMAC", new bk3((lo3) ko3VarL.m(), 1));
        ko3 ko3VarL2 = lo3.L();
        ko3VarL2.u(32);
        no3 no3VarL2 = oo3.L();
        no3VarL2.u(16);
        ko3VarL2.v((oo3) no3VarL2.m());
        map.put("AES256_CMAC", new bk3((lo3) ko3VarL2.m(), 1));
        ko3 ko3VarL3 = lo3.L();
        ko3VarL3.u(32);
        no3 no3VarL3 = oo3.L();
        no3VarL3.u(16);
        ko3VarL3.v((oo3) no3VarL3.m());
        map.put("AES256_CMAC_RAW", new bk3((lo3) ko3VarL3.m(), 3));
        return Collections.unmodifiableMap(map);
    }

    @Override // com.google.android.gms.internal.ads.ck3
    public final /* bridge */ /* synthetic */ void d(jz3 jz3Var) throws GeneralSecurityException {
        lo3 lo3Var = (lo3) jz3Var;
        dm3.n(lo3Var.O());
        dm3.o(lo3Var.K());
    }
}
