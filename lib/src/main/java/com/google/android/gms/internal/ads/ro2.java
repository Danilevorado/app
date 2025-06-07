package com.google.android.gms.internal.ads;

import android.util.Base64;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class ro2 {
    public ro2() {
        try {
            td3.a();
        } catch (GeneralSecurityException e5) {
            m3.n1.k("Failed to Configure Aead. ".concat(e5.toString()));
            j3.t.q().u(e5, "CryptoUtils.registerAead");
        }
    }

    public static final String a() {
        tw3 tw3VarF = ww3.F();
        try {
            ac3.b(zc3.b(sc3.a("AES128_GCM")), yb3.b(tw3VarF));
        } catch (IOException | GeneralSecurityException e5) {
            m3.n1.k("Failed to generate key".concat(e5.toString()));
            j3.t.q().u(e5, "CryptoUtils.generateKey");
        }
        String strEncodeToString = Base64.encodeToString(tw3VarF.c().f(), 11);
        tw3VarF.e();
        return strEncodeToString;
    }

    public static final String b(byte[] bArr, byte[] bArr2, String str, sm1 sm1Var) {
        zc3 zc3VarC = c(str);
        if (zc3VarC == null) {
            return null;
        }
        try {
            byte[] bArrA = ((wb3) zc3VarC.d(wb3.class)).a(bArr, bArr2);
            sm1Var.a().put("ds", "1");
            return new String(bArrA, "UTF-8");
        } catch (UnsupportedEncodingException | GeneralSecurityException e5) {
            m3.n1.k("Failed to decrypt ".concat(e5.toString()));
            j3.t.q().u(e5, "CryptoUtils.decrypt");
            sm1Var.a().put("dsf", e5.toString());
            return null;
        }
    }

    private static final zc3 c(String str) {
        try {
            return ac3.a(xb3.b(Base64.decode(str, 11)));
        } catch (IOException | GeneralSecurityException e5) {
            m3.n1.k("Failed to get keysethandle".concat(e5.toString()));
            j3.t.q().u(e5, "CryptoUtils.getHandle");
            return null;
        }
    }
}
