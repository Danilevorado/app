package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* loaded from: classes.dex */
final class nj3 implements bj3 {

    /* renamed from: a, reason: collision with root package name */
    private final wi3 f12667a;

    nj3(wi3 wi3Var) {
        this.f12667a = wi3Var;
    }

    @Override // com.google.android.gms.internal.ads.bj3
    public final cj3 a(byte[] bArr) throws GeneralSecurityException {
        byte[] bArrB = zv3.b();
        byte[] bArrA = zv3.a(bArrB, bArr);
        byte[] bArrC = zv3.c(bArrB);
        byte[] bArrB2 = mu3.b(bArrC, bArr);
        byte[] bArrD = kj3.d(kj3.f11095b);
        wi3 wi3Var = this.f12667a;
        return new cj3(wi3Var.b(null, bArrA, "eae_prk", bArrB2, "shared_secret", bArrD, wi3Var.a()), bArrC);
    }

    @Override // com.google.android.gms.internal.ads.bj3
    public final byte[] b() throws GeneralSecurityException {
        if (Arrays.equals(this.f12667a.c(), kj3.f11099f)) {
            return kj3.f11095b;
        }
        throw new GeneralSecurityException("Could not determine HPKE KEM ID");
    }
}
