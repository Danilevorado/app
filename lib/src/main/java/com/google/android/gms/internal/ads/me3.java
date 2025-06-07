package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class me3 extends dk3 {
    me3() {
        super(hp3.class, new je3(wb3.class));
    }

    static /* bridge */ /* synthetic */ bk3 k(int i10, int i11, int i12) {
        jp3 jp3VarL = kp3.L();
        jp3VarL.u(i10);
        mp3 mp3VarL = np3.L();
        mp3VarL.u(16);
        jp3VarL.v((np3) mp3VarL.m());
        return new bk3((kp3) jp3VarL.m(), i12);
    }

    @Override // com.google.android.gms.internal.ads.dk3
    public final ck3 a() {
        return new ke3(this, kp3.class);
    }

    @Override // com.google.android.gms.internal.ads.dk3
    public final ms3 b() {
        return ms3.SYMMETRIC;
    }

    @Override // com.google.android.gms.internal.ads.dk3
    public final /* synthetic */ jz3 c(ww3 ww3Var) {
        return hp3.N(ww3Var, qx3.a());
    }

    @Override // com.google.android.gms.internal.ads.dk3
    public final String d() {
        return "type.googleapis.com/google.crypto.tink.AesEaxKey";
    }

    @Override // com.google.android.gms.internal.ads.dk3
    public final /* bridge */ /* synthetic */ void e(jz3 jz3Var) throws GeneralSecurityException {
        hp3 hp3Var = (hp3) jz3Var;
        yv3.b(hp3Var.K(), 0);
        yv3.a(hp3Var.P().n());
        if (hp3Var.O().K() != 12 && hp3Var.O().K() != 16) {
            throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
        }
    }
}
