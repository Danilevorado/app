package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;

/* loaded from: classes.dex */
final class lj3 implements bj3 {

    /* renamed from: a, reason: collision with root package name */
    private final wi3 f11634a;

    /* renamed from: b, reason: collision with root package name */
    private final int f11635b;

    private lj3(wi3 wi3Var, int i10) {
        this.f11634a = wi3Var;
        this.f11635b = i10;
    }

    static lj3 c(int i10) {
        int i11 = i10 - 1;
        return i11 != 0 ? i11 != 1 ? new lj3(new wi3("HmacSha512"), 3) : new lj3(new wi3("HmacSha384"), 2) : new lj3(new wi3("HmacSha256"), 1);
    }

    @Override // com.google.android.gms.internal.ads.bj3
    public final cj3 a(byte[] bArr) throws IllegalStateException, GeneralSecurityException {
        KeyPair keyPairB = vu3.b(vu3.h(this.f11635b));
        byte[] bArrE = vu3.e((ECPrivateKey) keyPairB.getPrivate(), vu3.g(vu3.h(this.f11635b), 1, bArr));
        byte[] bArrI = vu3.i(this.f11635b, 1, ((ECPublicKey) keyPairB.getPublic()).getW());
        byte[] bArrB = mu3.b(bArrI, bArr);
        byte[] bArrD = kj3.d(b());
        wi3 wi3Var = this.f11634a;
        return new cj3(wi3Var.b(null, bArrE, "eae_prk", bArrB, "shared_secret", bArrD, wi3Var.a()), bArrI);
    }

    @Override // com.google.android.gms.internal.ads.bj3
    public final byte[] b() {
        int i10 = this.f11635b - 1;
        return i10 != 0 ? i10 != 1 ? kj3.f11098e : kj3.f11097d : kj3.f11096c;
    }
}
