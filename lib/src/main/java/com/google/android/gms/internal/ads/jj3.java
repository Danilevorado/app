package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class jj3 extends dk3 {
    public jj3() {
        super(is3.class, new ij3(fc3.class));
    }

    @Override // com.google.android.gms.internal.ads.dk3
    public final ms3 b() {
        return ms3.ASYMMETRIC_PUBLIC;
    }

    @Override // com.google.android.gms.internal.ads.dk3
    public final /* synthetic */ jz3 c(ww3 ww3Var) {
        return is3.P(ww3Var, qx3.a());
    }

    @Override // com.google.android.gms.internal.ads.dk3
    public final String d() {
        return "type.googleapis.com/google.crypto.tink.HpkePublicKey";
    }

    @Override // com.google.android.gms.internal.ads.dk3
    public final /* bridge */ /* synthetic */ void e(jz3 jz3Var) throws GeneralSecurityException {
        is3 is3Var = (is3) jz3Var;
        yv3.b(is3Var.K(), 0);
        if (!is3Var.U()) {
            throw new GeneralSecurityException("Missing HPKE key params.");
        }
        kj3.a(is3Var.L());
    }
}
