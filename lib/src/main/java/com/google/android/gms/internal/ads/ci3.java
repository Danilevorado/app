package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

/* loaded from: classes.dex */
public final class ci3 extends dk3 {
    ci3() {
        super(dq3.class, new ai3(dc3.class));
    }

    @Override // com.google.android.gms.internal.ads.dk3
    public final ck3 a() {
        return new bi3(this, gq3.class);
    }

    @Override // com.google.android.gms.internal.ads.dk3
    public final ms3 b() {
        return ms3.SYMMETRIC;
    }

    @Override // com.google.android.gms.internal.ads.dk3
    public final /* synthetic */ jz3 c(ww3 ww3Var) {
        return dq3.N(ww3Var, qx3.a());
    }

    @Override // com.google.android.gms.internal.ads.dk3
    public final String d() {
        return "type.googleapis.com/google.crypto.tink.AesSivKey";
    }

    @Override // com.google.android.gms.internal.ads.dk3
    public final /* bridge */ /* synthetic */ void e(jz3 jz3Var) throws GeneralSecurityException {
        dq3 dq3Var = (dq3) jz3Var;
        yv3.b(dq3Var.K(), 0);
        if (dq3Var.O().n() == 64) {
            return;
        }
        throw new InvalidKeyException("invalid key size: " + dq3Var.O().n() + ". Valid keys must have 64 bytes.");
    }
}
