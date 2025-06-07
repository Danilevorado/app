package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class be3 extends dk3 {
    be3() {
        super(ro3.class, new zd3(wb3.class));
    }

    static /* bridge */ /* synthetic */ bk3 k(int i10, int i11, int i12, int i13, int i14, int i15) {
        ap3 ap3VarL = bp3.L();
        dp3 dp3VarL = ep3.L();
        dp3VarL.u(16);
        ap3VarL.v((ep3) dp3VarL.m());
        ap3VarL.u(i10);
        bp3 bp3Var = (bp3) ap3VarL.m();
        pr3 pr3VarL = qr3.L();
        sr3 sr3VarL = tr3.L();
        sr3VarL.v(5);
        sr3VarL.u(i13);
        pr3VarL.v((tr3) sr3VarL.m());
        pr3VarL.u(32);
        qr3 qr3Var = (qr3) pr3VarL.m();
        to3 to3VarK = uo3.K();
        to3VarK.u(bp3Var);
        to3VarK.v(qr3Var);
        return new bk3((uo3) to3VarK.m(), i15);
    }

    @Override // com.google.android.gms.internal.ads.dk3
    public final ck3 a() {
        return new ae3(this, uo3.class);
    }

    @Override // com.google.android.gms.internal.ads.dk3
    public final ms3 b() {
        return ms3.SYMMETRIC;
    }

    @Override // com.google.android.gms.internal.ads.dk3
    public final /* synthetic */ jz3 c(ww3 ww3Var) {
        return ro3.N(ww3Var, qx3.a());
    }

    @Override // com.google.android.gms.internal.ads.dk3
    public final String d() {
        return "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey";
    }

    @Override // com.google.android.gms.internal.ads.dk3
    public final /* bridge */ /* synthetic */ void e(jz3 jz3Var) throws GeneralSecurityException {
        ro3 ro3Var = (ro3) jz3Var;
        yv3.b(ro3Var.K(), 0);
        new ee3();
        ee3.l(ro3Var.O());
        new an3();
        an3.m(ro3Var.P());
    }

    @Override // com.google.android.gms.internal.ads.dk3
    public final int f() {
        return 2;
    }
}
