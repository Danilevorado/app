package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;

/* loaded from: classes.dex */
public final class wf3 extends dk3 {
    wf3() {
        super(xp3.class, new uf3(wb3.class));
    }

    public static void k(boolean z10) {
        if (m()) {
            qd3.k(new wf3(), true);
            int i10 = gg3.f8719f;
            gg3.a(ok3.b());
        }
    }

    static /* bridge */ /* synthetic */ bk3 l(int i10, int i11) {
        zp3 zp3VarL = aq3.L();
        zp3VarL.u(i10);
        return new bk3((aq3) zp3VarL.m(), i11);
    }

    private static boolean m() throws NoSuchPaddingException, NoSuchAlgorithmException {
        try {
            Cipher.getInstance("AES/GCM-SIV/NoPadding");
            return true;
        } catch (NoSuchAlgorithmException | NoSuchPaddingException unused) {
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.dk3
    public final ck3 a() {
        return new vf3(this, aq3.class);
    }

    @Override // com.google.android.gms.internal.ads.dk3
    public final ms3 b() {
        return ms3.SYMMETRIC;
    }

    @Override // com.google.android.gms.internal.ads.dk3
    public final /* synthetic */ jz3 c(ww3 ww3Var) {
        return xp3.N(ww3Var, qx3.a());
    }

    @Override // com.google.android.gms.internal.ads.dk3
    public final String d() {
        return "type.googleapis.com/google.crypto.tink.AesGcmSivKey";
    }

    @Override // com.google.android.gms.internal.ads.dk3
    public final /* bridge */ /* synthetic */ void e(jz3 jz3Var) throws GeneralSecurityException {
        xp3 xp3Var = (xp3) jz3Var;
        yv3.b(xp3Var.K(), 0);
        yv3.a(xp3Var.O().n());
    }
}
