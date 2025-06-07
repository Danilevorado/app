package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class dm3 extends dk3 {

    /* renamed from: d, reason: collision with root package name */
    private static final bl3 f7413d = bl3.b(new zk3() { // from class: com.google.android.gms.internal.ads.am3
        @Override // com.google.android.gms.internal.ads.zk3
        public final Object a(gc3 gc3Var) {
            return new tn3((zl3) gc3Var);
        }
    }, zl3.class, om3.class);

    dm3() {
        super(io3.class, new bm3(cd3.class));
    }

    public static void m(boolean z10) {
        qd3.k(new dm3(), true);
        int i10 = nm3.f12712f;
        nm3.a(ok3.b());
        nk3.a().e(f7413d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void n(oo3 oo3Var) throws GeneralSecurityException {
        if (oo3Var.K() < 10) {
            throw new GeneralSecurityException("tag size too short");
        }
        if (oo3Var.K() > 16) {
            throw new GeneralSecurityException("tag size too long");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void o(int i10) throws GeneralSecurityException {
        if (i10 != 32) {
            throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
        }
    }

    @Override // com.google.android.gms.internal.ads.dk3
    public final ck3 a() {
        return new cm3(this, lo3.class);
    }

    @Override // com.google.android.gms.internal.ads.dk3
    public final ms3 b() {
        return ms3.SYMMETRIC;
    }

    @Override // com.google.android.gms.internal.ads.dk3
    public final /* synthetic */ jz3 c(ww3 ww3Var) {
        return io3.N(ww3Var, qx3.a());
    }

    @Override // com.google.android.gms.internal.ads.dk3
    public final String d() {
        return "type.googleapis.com/google.crypto.tink.AesCmacKey";
    }

    @Override // com.google.android.gms.internal.ads.dk3
    public final /* bridge */ /* synthetic */ void e(jz3 jz3Var) throws GeneralSecurityException {
        io3 io3Var = (io3) jz3Var;
        yv3.b(io3Var.K(), 0);
        o(io3Var.P().n());
        n(io3Var.O());
    }
}
