package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class ii3 extends il3 {

    /* renamed from: e, reason: collision with root package name */
    private static final byte[] f9765e = new byte[0];

    ii3() {
        super(ar3.class, dr3.class, new gi3(ec3.class));
    }

    static /* bridge */ /* synthetic */ bk3 l(int i10, int i11, int i12, rc3 rc3Var, byte[] bArr, int i13) {
        tq3 tq3VarK = uq3.K();
        fr3 fr3VarK = gr3.K();
        fr3VarK.v(4);
        fr3VarK.w(5);
        fr3VarK.u(ww3.I(bArr, 0, 0));
        gr3 gr3Var = (gr3) fr3VarK.m();
        rs3 rs3VarK = ss3.K();
        rs3VarK.v(rc3Var.b());
        byte[] bArrC = rc3Var.c();
        rs3VarK.w(ww3.I(bArrC, 0, bArrC.length));
        int iD = rc3Var.d() - 1;
        rs3VarK.u(iD != 0 ? iD != 1 ? iD != 2 ? ut3.CRUNCHY : ut3.RAW : ut3.LEGACY : ut3.TINK);
        ss3 ss3Var = (ss3) rs3VarK.m();
        qq3 qq3VarK = rq3.K();
        qq3VarK.u(ss3Var);
        rq3 rq3Var = (rq3) qq3VarK.m();
        wq3 wq3VarL = xq3.L();
        wq3VarL.v(gr3Var);
        wq3VarL.u(rq3Var);
        wq3VarL.w(i12);
        tq3VarK.u((xq3) wq3VarL.m());
        return new bk3((uq3) tq3VarK.m(), i13);
    }

    @Override // com.google.android.gms.internal.ads.dk3
    public final ck3 a() {
        return new hi3(this, uq3.class);
    }

    @Override // com.google.android.gms.internal.ads.dk3
    public final ms3 b() {
        return ms3.ASYMMETRIC_PRIVATE;
    }

    @Override // com.google.android.gms.internal.ads.dk3
    public final /* synthetic */ jz3 c(ww3 ww3Var) {
        return ar3.N(ww3Var, qx3.a());
    }

    @Override // com.google.android.gms.internal.ads.dk3
    public final String d() {
        return "type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey";
    }

    @Override // com.google.android.gms.internal.ads.dk3
    public final /* bridge */ /* synthetic */ void e(jz3 jz3Var) throws GeneralSecurityException {
        ar3 ar3Var = (ar3) jz3Var;
        if (ar3Var.P().e()) {
            throw new GeneralSecurityException("invalid ECIES private key");
        }
        yv3.b(ar3Var.K(), 0);
        si3.a(ar3Var.O().L());
    }
}
