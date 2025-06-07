package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
final class de3 extends ck3 {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ee3 f7279b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    de3(ee3 ee3Var, Class cls) {
        super(cls);
        this.f7279b = ee3Var;
    }

    public static final yo3 g(bp3 bp3Var) {
        xo3 xo3VarL = yo3.L();
        xo3VarL.v(bp3Var.P());
        byte[] bArrA = wv3.a(bp3Var.K());
        xo3VarL.u(ww3.I(bArrA, 0, bArrA.length));
        xo3VarL.w(0);
        return (yo3) xo3VarL.m();
    }

    @Override // com.google.android.gms.internal.ads.ck3
    public final /* bridge */ /* synthetic */ jz3 a(jz3 jz3Var) {
        return g((bp3) jz3Var);
    }

    @Override // com.google.android.gms.internal.ads.ck3
    public final /* synthetic */ jz3 b(ww3 ww3Var) {
        return bp3.O(ww3Var, qx3.a());
    }

    @Override // com.google.android.gms.internal.ads.ck3
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final void d(bp3 bp3Var) throws GeneralSecurityException {
        yv3.a(bp3Var.K());
        ee3 ee3Var = this.f7279b;
        ee3.m(bp3Var.P());
    }
}
