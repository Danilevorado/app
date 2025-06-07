package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes.dex */
final class ym3 extends cl3 {
    ym3(Class cls) {
        super(cls);
    }

    @Override // com.google.android.gms.internal.ads.cl3
    public final /* bridge */ /* synthetic */ Object a(jz3 jz3Var) throws GeneralSecurityException {
        nr3 nr3Var = (nr3) jz3Var;
        int iP = nr3Var.P().P();
        SecretKeySpec secretKeySpec = new SecretKeySpec(nr3Var.Q().f(), "HMAC");
        int iK = nr3Var.P().K();
        int i10 = iP - 2;
        if (i10 == 1) {
            return new uv3(new tv3("HMACSHA1", secretKeySpec), iK);
        }
        if (i10 == 2) {
            return new uv3(new tv3("HMACSHA384", secretKeySpec), iK);
        }
        if (i10 == 3) {
            return new uv3(new tv3("HMACSHA256", secretKeySpec), iK);
        }
        if (i10 == 4) {
            return new uv3(new tv3("HMACSHA512", secretKeySpec), iK);
        }
        if (i10 == 5) {
            return new uv3(new tv3("HMACSHA224", secretKeySpec), iK);
        }
        throw new GeneralSecurityException("unknown hash");
    }
}
