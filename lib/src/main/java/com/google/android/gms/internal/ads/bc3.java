package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public abstract class bc3 {
    public static void a(xt3 xt3Var) throws GeneralSecurityException {
        for (vs3 vs3Var : xt3Var.M()) {
            if (vs3Var.O().isEmpty()) {
                throw new GeneralSecurityException("Missing type_url.");
            }
            if (vs3Var.N().isEmpty()) {
                throw new GeneralSecurityException("Missing primitive_name.");
            }
            if (vs3Var.M().isEmpty()) {
                throw new GeneralSecurityException("Missing catalogue_name.");
            }
            if (!vs3Var.M().equals("TinkAead") && !vs3Var.M().equals("TinkMac") && !vs3Var.M().equals("TinkHybridDecrypt") && !vs3Var.M().equals("TinkHybridEncrypt") && !vs3Var.M().equals("TinkPublicKeySign") && !vs3Var.M().equals("TinkPublicKeyVerify") && !vs3Var.M().equals("TinkStreamingAead") && !vs3Var.M().equals("TinkDeterministicAead")) {
                zb3 zb3VarA = qd3.a(vs3Var.M());
                qd3.l(zb3VarA.a());
                vs3Var.O();
                vs3Var.N();
                vs3Var.K();
                qd3.j(zb3VarA.b(), vs3Var.P());
            }
        }
    }
}
