package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public abstract class dd3 {
    public static final zc3 a(byte[] bArr) throws GeneralSecurityException {
        try {
            bt3 bt3VarQ = bt3.Q(bArr, qx3.a());
            for (at3 at3Var : bt3VarQ.R()) {
                if (at3Var.L().L() == ms3.UNKNOWN_KEYMATERIAL || at3Var.L().L() == ms3.SYMMETRIC || at3Var.L().L() == ms3.ASYMMETRIC_PRIVATE) {
                    throw new GeneralSecurityException("keyset contains secret key material");
                }
            }
            return zc3.a(bt3VarQ);
        } catch (ny3 unused) {
            throw new GeneralSecurityException("invalid keyset");
        }
    }
}
