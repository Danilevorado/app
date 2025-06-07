package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class zg3 extends dk3 {
    zg3() {
        super(pt3.class, new xg3(wb3.class));
    }

    @Override // com.google.android.gms.internal.ads.dk3
    public final ck3 a() {
        return new yg3(this, st3.class);
    }

    @Override // com.google.android.gms.internal.ads.dk3
    public final ms3 b() {
        return ms3.REMOTE;
    }

    @Override // com.google.android.gms.internal.ads.dk3
    public final /* synthetic */ jz3 c(ww3 ww3Var) {
        return pt3.N(ww3Var, qx3.a());
    }

    @Override // com.google.android.gms.internal.ads.dk3
    public final String d() {
        return "type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey";
    }

    @Override // com.google.android.gms.internal.ads.dk3
    public final /* bridge */ /* synthetic */ void e(jz3 jz3Var) throws GeneralSecurityException {
        yv3.b(((pt3) jz3Var).K(), 0);
    }
}
