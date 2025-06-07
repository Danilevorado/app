package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;

/* loaded from: classes.dex */
abstract class si3 {
    public static void a(xq3 xq3Var) {
        vu3.h(c(xq3Var.O().P()));
        b(xq3Var.O().Q());
        if (xq3Var.R() == 2) {
            throw new GeneralSecurityException("unknown EC point format");
        }
        qd3.c(xq3Var.K().N());
    }

    public static String b(int i10) throws NoSuchAlgorithmException {
        int i11 = i10 - 2;
        if (i11 == 1) {
            return "HmacSha1";
        }
        if (i11 == 2) {
            return "HmacSha384";
        }
        if (i11 == 3) {
            return "HmacSha256";
        }
        if (i11 == 4) {
            return "HmacSha512";
        }
        if (i11 == 5) {
            return "HmacSha224";
        }
        throw new NoSuchAlgorithmException("hash unsupported for HMAC: ".concat(Integer.toString(kr3.a(i10))));
    }

    public static int c(int i10) throws GeneralSecurityException {
        int i11 = i10 - 2;
        if (i11 == 2) {
            return 1;
        }
        if (i11 == 3) {
            return 2;
        }
        if (i11 == 4) {
            return 3;
        }
        throw new GeneralSecurityException("unknown curve type: ".concat(Integer.toString(ir3.a(i10))));
    }

    public static int d(int i10) throws GeneralSecurityException {
        int i11 = i10 - 2;
        int i12 = 1;
        if (i11 != 1) {
            i12 = 2;
            if (i11 != 2) {
                if (i11 == 3) {
                    return 3;
                }
                throw new GeneralSecurityException("unknown point format: ".concat(Integer.toString(oq3.a(i10))));
            }
        }
        return i12;
    }
}
