package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
final class ke3 extends ck3 {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ me3 f11007b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ke3(me3 me3Var, Class cls) {
        super(cls);
        this.f11007b = me3Var;
    }

    @Override // com.google.android.gms.internal.ads.ck3
    public final /* bridge */ /* synthetic */ jz3 a(jz3 jz3Var) {
        kp3 kp3Var = (kp3) jz3Var;
        gp3 gp3VarL = hp3.L();
        byte[] bArrA = wv3.a(kp3Var.K());
        gp3VarL.u(ww3.I(bArrA, 0, bArrA.length));
        gp3VarL.v(kp3Var.O());
        gp3VarL.w(0);
        return (hp3) gp3VarL.m();
    }

    @Override // com.google.android.gms.internal.ads.ck3
    public final /* synthetic */ jz3 b(ww3 ww3Var) {
        return kp3.N(ww3Var, qx3.a());
    }

    @Override // com.google.android.gms.internal.ads.ck3
    public final Map c() {
        HashMap map = new HashMap();
        map.put("AES128_EAX", me3.k(16, 16, 1));
        map.put("AES128_EAX_RAW", me3.k(16, 16, 3));
        map.put("AES256_EAX", me3.k(32, 16, 1));
        map.put("AES256_EAX_RAW", me3.k(32, 16, 3));
        return Collections.unmodifiableMap(map);
    }

    @Override // com.google.android.gms.internal.ads.ck3
    public final /* bridge */ /* synthetic */ void d(jz3 jz3Var) throws GeneralSecurityException {
        kp3 kp3Var = (kp3) jz3Var;
        yv3.a(kp3Var.K());
        if (kp3Var.O().K() != 12 && kp3Var.O().K() != 16) {
            throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
        }
    }
}
