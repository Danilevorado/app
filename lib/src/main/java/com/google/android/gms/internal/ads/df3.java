package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class df3 extends dk3 {
    df3() {
        super(qp3.class, new bf3(wb3.class));
    }

    static /* bridge */ /* synthetic */ bk3 k(int i10, int i11) {
        sp3 sp3VarL = tp3.L();
        sp3VarL.u(i10);
        return new bk3((tp3) sp3VarL.m(), i11);
    }

    @Override // com.google.android.gms.internal.ads.dk3
    public final ck3 a() {
        return new cf3(this, tp3.class);
    }

    @Override // com.google.android.gms.internal.ads.dk3
    public final ms3 b() {
        return ms3.SYMMETRIC;
    }

    @Override // com.google.android.gms.internal.ads.dk3
    public final /* synthetic */ jz3 c(ww3 ww3Var) {
        return qp3.N(ww3Var, qx3.a());
    }

    @Override // com.google.android.gms.internal.ads.dk3
    public final String d() {
        return "type.googleapis.com/google.crypto.tink.AesGcmKey";
    }

    @Override // com.google.android.gms.internal.ads.dk3
    public final /* bridge */ /* synthetic */ void e(jz3 jz3Var) throws GeneralSecurityException {
        qp3 qp3Var = (qp3) jz3Var;
        yv3.b(qp3Var.K(), 0);
        yv3.a(qp3Var.O().n());
    }

    @Override // com.google.android.gms.internal.ads.dk3
    public final int f() {
        return 2;
    }
}
