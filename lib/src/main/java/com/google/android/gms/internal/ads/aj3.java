package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
final class aj3 implements fc3 {

    /* renamed from: e, reason: collision with root package name */
    private static final byte[] f6107e = new byte[0];

    /* renamed from: a, reason: collision with root package name */
    private final is3 f6108a;

    /* renamed from: b, reason: collision with root package name */
    private final bj3 f6109b;

    /* renamed from: c, reason: collision with root package name */
    private final xi3 f6110c;

    /* renamed from: d, reason: collision with root package name */
    private final wi3 f6111d;

    private aj3(is3 is3Var, bj3 bj3Var, wi3 wi3Var, xi3 xi3Var) {
        this.f6108a = is3Var;
        this.f6109b = bj3Var;
        this.f6111d = wi3Var;
        this.f6110c = xi3Var;
    }

    static aj3 b(is3 is3Var) {
        if (is3Var.Q().e()) {
            throw new IllegalArgumentException("HpkePublicKey.public_key is empty.");
        }
        cs3 cs3VarL = is3Var.L();
        return new aj3(is3Var, ej3.b(cs3VarL), ej3.c(cs3VarL), ej3.a(cs3VarL));
    }

    @Override // com.google.android.gms.internal.ads.fc3
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        byte[] bArr3 = bArr2;
        is3 is3Var = this.f6108a;
        bj3 bj3Var = this.f6109b;
        wi3 wi3Var = this.f6111d;
        xi3 xi3Var = this.f6110c;
        cj3 cj3VarA = bj3Var.a(is3Var.Q().f());
        yi3 yi3VarC = yi3.c(cj3VarA.a(), cj3VarA.b(), bj3Var, wi3Var, xi3Var, bArr3);
        return mu3.b(yi3VarC.a(), yi3VarC.b(bArr, f6107e));
    }
}
