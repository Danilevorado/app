package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
final class pi3 implements fc3 {

    /* renamed from: a, reason: collision with root package name */
    final md3 f13902a;

    /* renamed from: b, reason: collision with root package name */
    private final yn3 f13903b;

    public pi3(md3 md3Var) {
        this.f13902a = md3Var;
        this.f13903b = md3Var.f() ? mk3.a().b().a(jk3.a(md3Var), "hybrid_encrypt", "encrypt") : jk3.f10546a;
    }

    @Override // com.google.android.gms.internal.ads.fc3
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        md3 md3Var = this.f13902a;
        if (md3Var.a() == null) {
            throw new GeneralSecurityException("keyset without primary key");
        }
        try {
            byte[] bArrB = mu3.b(md3Var.a().g(), ((fc3) this.f13902a.a().e()).a(bArr, bArr2));
            this.f13902a.a().a();
            int length = bArr.length;
            return bArrB;
        } catch (GeneralSecurityException e5) {
            throw e5;
        }
    }
}
