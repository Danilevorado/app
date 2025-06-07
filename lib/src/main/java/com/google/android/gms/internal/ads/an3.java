package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class an3 extends dk3 {

    /* renamed from: d, reason: collision with root package name */
    private static final bl3 f6183d = bl3.b(new zk3() { // from class: com.google.android.gms.internal.ads.xm3
        @Override // com.google.android.gms.internal.ads.zk3
        public final Object a(gc3 gc3Var) {
            return new un3((wm3) gc3Var);
        }
    }, wm3.class, om3.class);

    public an3() {
        super(nr3.class, new ym3(cd3.class));
    }

    public static void l(boolean z10) {
        qd3.k(new an3(), true);
        int i10 = ln3.f11691f;
        ln3.a(ok3.b());
        nk3.a().e(f6183d);
    }

    public static final void m(nr3 nr3Var) throws GeneralSecurityException {
        yv3.b(nr3Var.K(), 0);
        if (nr3Var.Q().n() < 16) {
            throw new GeneralSecurityException("key too short");
        }
        o(nr3Var.P());
    }

    static /* bridge */ /* synthetic */ bk3 n(int i10, int i11, int i12, int i13) {
        pr3 pr3VarL = qr3.L();
        sr3 sr3VarL = tr3.L();
        sr3VarL.v(i12);
        sr3VarL.u(i11);
        pr3VarL.v((tr3) sr3VarL.m());
        pr3VarL.u(i10);
        return new bk3((qr3) pr3VarL.m(), i13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void o(tr3 tr3Var) throws GeneralSecurityException {
        if (tr3Var.K() < 10) {
            throw new GeneralSecurityException("tag size too small");
        }
        int iP = tr3Var.P() - 2;
        if (iP == 1) {
            if (tr3Var.K() > 20) {
                throw new GeneralSecurityException("tag size too big");
            }
            return;
        }
        if (iP == 2) {
            if (tr3Var.K() > 48) {
                throw new GeneralSecurityException("tag size too big");
            }
            return;
        }
        if (iP == 3) {
            if (tr3Var.K() > 32) {
                throw new GeneralSecurityException("tag size too big");
            }
        } else if (iP == 4) {
            if (tr3Var.K() > 64) {
                throw new GeneralSecurityException("tag size too big");
            }
        } else {
            if (iP != 5) {
                throw new GeneralSecurityException("unknown hash type");
            }
            if (tr3Var.K() > 28) {
                throw new GeneralSecurityException("tag size too big");
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.dk3
    public final ck3 a() {
        return new zm3(this, qr3.class);
    }

    @Override // com.google.android.gms.internal.ads.dk3
    public final ms3 b() {
        return ms3.SYMMETRIC;
    }

    @Override // com.google.android.gms.internal.ads.dk3
    public final /* synthetic */ jz3 c(ww3 ww3Var) {
        return nr3.O(ww3Var, qx3.a());
    }

    @Override // com.google.android.gms.internal.ads.dk3
    public final String d() {
        return "type.googleapis.com/google.crypto.tink.HmacKey";
    }

    @Override // com.google.android.gms.internal.ads.dk3
    public final /* bridge */ /* synthetic */ void e(jz3 jz3Var) throws GeneralSecurityException {
        m((nr3) jz3Var);
    }

    @Override // com.google.android.gms.internal.ads.dk3
    public final int f() {
        return 2;
    }
}
