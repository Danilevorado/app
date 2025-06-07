package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class ee3 extends dk3 {
    ee3() {
        super(yo3.class, new ce3(qv3.class));
    }

    public static final void l(yo3 yo3Var) throws GeneralSecurityException {
        yv3.b(yo3Var.K(), 0);
        yv3.a(yo3Var.Q().n());
        m(yo3Var.P());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(ep3 ep3Var) throws GeneralSecurityException {
        if (ep3Var.K() < 12 || ep3Var.K() > 16) {
            throw new GeneralSecurityException("invalid IV size");
        }
    }

    @Override // com.google.android.gms.internal.ads.dk3
    public final ck3 a() {
        return new de3(this, bp3.class);
    }

    @Override // com.google.android.gms.internal.ads.dk3
    public final ms3 b() {
        return ms3.SYMMETRIC;
    }

    @Override // com.google.android.gms.internal.ads.dk3
    public final /* synthetic */ jz3 c(ww3 ww3Var) {
        return yo3.O(ww3Var, qx3.a());
    }

    @Override // com.google.android.gms.internal.ads.dk3
    public final String d() {
        return "type.googleapis.com/google.crypto.tink.AesCtrKey";
    }

    @Override // com.google.android.gms.internal.ads.dk3
    public final /* bridge */ /* synthetic */ void e(jz3 jz3Var) throws GeneralSecurityException {
        l((yo3) jz3Var);
    }
}
