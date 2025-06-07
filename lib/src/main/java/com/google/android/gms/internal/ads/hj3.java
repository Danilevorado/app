package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class hj3 extends il3 {
    public hj3() {
        super(fs3.class, is3.class, new fj3(ec3.class));
    }

    static /* bridge */ /* synthetic */ bk3 k(int i10, int i11, int i12, int i13) {
        bs3 bs3VarK = cs3.K();
        bs3VarK.w(i10);
        bs3VarK.v(i11);
        bs3VarK.u(i12);
        cs3 cs3Var = (cs3) bs3VarK.m();
        yr3 yr3VarK = zr3.K();
        yr3VarK.u(cs3Var);
        return new bk3((zr3) yr3VarK.m(), i13);
    }

    @Override // com.google.android.gms.internal.ads.dk3
    public final ck3 a() {
        return new gj3(this, zr3.class);
    }

    @Override // com.google.android.gms.internal.ads.dk3
    public final ms3 b() {
        return ms3.ASYMMETRIC_PRIVATE;
    }

    @Override // com.google.android.gms.internal.ads.dk3
    public final /* synthetic */ jz3 c(ww3 ww3Var) {
        return fs3.N(ww3Var, qx3.a());
    }

    @Override // com.google.android.gms.internal.ads.dk3
    public final String d() {
        return "type.googleapis.com/google.crypto.tink.HpkePrivateKey";
    }

    @Override // com.google.android.gms.internal.ads.dk3
    public final /* bridge */ /* synthetic */ void e(jz3 jz3Var) throws GeneralSecurityException {
        fs3 fs3Var = (fs3) jz3Var;
        if (fs3Var.P().e()) {
            throw new GeneralSecurityException("Private key is empty.");
        }
        if (!fs3Var.T()) {
            throw new GeneralSecurityException("Missing public key.");
        }
        yv3.b(fs3Var.K(), 0);
        kj3.a(fs3Var.O().L());
    }
}
