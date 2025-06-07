package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
final class zi3 implements ec3 {

    /* renamed from: a, reason: collision with root package name */
    private final dj3 f18600a;

    /* renamed from: b, reason: collision with root package name */
    private final bj3 f18601b;

    /* renamed from: c, reason: collision with root package name */
    private final xi3 f18602c;

    /* renamed from: d, reason: collision with root package name */
    private final wi3 f18603d;

    private zi3(dj3 dj3Var, bj3 bj3Var, wi3 wi3Var, xi3 xi3Var, int i10) {
        this.f18600a = dj3Var;
        this.f18601b = bj3Var;
        this.f18603d = wi3Var;
        this.f18602c = xi3Var;
    }

    static zi3 a(fs3 fs3Var) throws GeneralSecurityException {
        int i10;
        dj3 dj3VarA;
        if (!fs3Var.T()) {
            throw new IllegalArgumentException("HpkePrivateKey is missing public_key field.");
        }
        if (!fs3Var.O().U()) {
            throw new IllegalArgumentException("HpkePrivateKey.public_key is missing params field.");
        }
        if (fs3Var.P().e()) {
            throw new IllegalArgumentException("HpkePrivateKey.private_key is empty.");
        }
        cs3 cs3VarL = fs3Var.O().L();
        bj3 bj3VarB = ej3.b(cs3VarL);
        wi3 wi3VarC = ej3.c(cs3VarL);
        xi3 xi3VarA = ej3.a(cs3VarL);
        int iP = cs3VarL.P();
        int i11 = iP - 2;
        if (i11 == 1) {
            i10 = 32;
        } else if (i11 == 2) {
            i10 = 65;
        } else if (i11 == 3) {
            i10 = 97;
        } else {
            if (i11 != 4) {
                throw new IllegalArgumentException("Unable to determine KEM-encoding length for ".concat(vr3.a(iP)));
            }
            i10 = 133;
        }
        int iP2 = fs3Var.O().L().P() - 2;
        if (iP2 == 1) {
            dj3VarA = oj3.a(fs3Var.P().f());
        } else {
            if (iP2 != 2 && iP2 != 3 && iP2 != 4) {
                throw new GeneralSecurityException("Unrecognized HPKE KEM identifier");
            }
            dj3VarA = mj3.a(fs3Var.P().f(), fs3Var.O().Q().f(), kj3.g(fs3Var.O().L().P()));
        }
        return new zi3(dj3VarA, bj3VarB, wi3VarC, xi3VarA, i10);
    }
}
