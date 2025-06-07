package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
final class ei3 implements dc3 {

    /* renamed from: a, reason: collision with root package name */
    private final md3 f7807a;

    /* renamed from: b, reason: collision with root package name */
    private final yn3 f7808b;

    /* renamed from: c, reason: collision with root package name */
    private final yn3 f7809c;

    public ei3(md3 md3Var) {
        yn3 yn3VarA;
        this.f7807a = md3Var;
        if (md3Var.f()) {
            zn3 zn3VarB = mk3.a().b();
            eo3 eo3VarA = jk3.a(md3Var);
            this.f7808b = zn3VarB.a(eo3VarA, "daead", "encrypt");
            yn3VarA = zn3VarB.a(eo3VarA, "daead", "decrypt");
        } else {
            yn3VarA = jk3.f10546a;
            this.f7808b = yn3VarA;
        }
        this.f7809c = yn3VarA;
    }

    @Override // com.google.android.gms.internal.ads.dc3
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        try {
            byte[] bArrB = mu3.b(this.f7807a.a().g(), ((dc3) this.f7807a.a().e()).a(bArr, bArr2));
            this.f7807a.a().a();
            int length = bArr.length;
            return bArrB;
        } catch (GeneralSecurityException e5) {
            throw e5;
        }
    }
}
