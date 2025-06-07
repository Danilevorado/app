package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
final class yg3 extends ck3 {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ zg3 f18036b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    yg3(zg3 zg3Var, Class cls) {
        super(cls);
        this.f18036b = zg3Var;
    }

    @Override // com.google.android.gms.internal.ads.ck3
    public final /* bridge */ /* synthetic */ jz3 a(jz3 jz3Var) {
        ot3 ot3VarL = pt3.L();
        ot3VarL.u((st3) jz3Var);
        ot3VarL.v(0);
        return (pt3) ot3VarL.m();
    }

    @Override // com.google.android.gms.internal.ads.ck3
    public final /* synthetic */ jz3 b(ww3 ww3Var) {
        return st3.N(ww3Var, qx3.a());
    }

    @Override // com.google.android.gms.internal.ads.ck3
    public final /* bridge */ /* synthetic */ void d(jz3 jz3Var) throws GeneralSecurityException {
        st3 st3Var = (st3) jz3Var;
        if (st3Var.O().isEmpty() || !st3Var.P()) {
            throw new GeneralSecurityException("invalid key format: missing KEK URI or DEK template");
        }
    }
}
