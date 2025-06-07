package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public abstract class sc3 {
    public static rc3 a(String str) throws GeneralSecurityException {
        rc3 rc3Var = (rc3) qd3.h().get(str);
        if (rc3Var != null) {
            return rc3Var;
        }
        throw new GeneralSecurityException("cannot find key template: ".concat(str));
    }
}
