package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
final class ki3 extends dk3 {
    public ki3() {
        super(dr3.class, new ji3(fc3.class));
    }

    @Override // com.google.android.gms.internal.ads.dk3
    public final ms3 b() {
        return ms3.ASYMMETRIC_PUBLIC;
    }

    @Override // com.google.android.gms.internal.ads.dk3
    public final /* synthetic */ jz3 c(ww3 ww3Var) {
        return dr3.P(ww3Var, qx3.a());
    }

    @Override // com.google.android.gms.internal.ads.dk3
    public final String d() {
        return "type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey";
    }

    @Override // com.google.android.gms.internal.ads.dk3
    public final /* bridge */ /* synthetic */ void e(jz3 jz3Var) throws GeneralSecurityException {
        dr3 dr3Var = (dr3) jz3Var;
        yv3.b(dr3Var.K(), 0);
        si3.a(dr3Var.L());
    }
}
