package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* loaded from: classes.dex */
final class ui3 implements xi3 {

    /* renamed from: a, reason: collision with root package name */
    private final int f16361a;

    ui3(int i10) throws InvalidAlgorithmParameterException {
        if (i10 == 16 || i10 == 32) {
            this.f16361a = i10;
            return;
        }
        throw new InvalidAlgorithmParameterException("Unsupported key length: " + i10);
    }

    @Override // com.google.android.gms.internal.ads.xi3
    public final int a() {
        return this.f16361a;
    }

    @Override // com.google.android.gms.internal.ads.xi3
    public final byte[] b() throws GeneralSecurityException {
        int i10 = this.f16361a;
        if (i10 == 16) {
            return kj3.f11102i;
        }
        if (i10 == 32) {
            return kj3.f11103j;
        }
        throw new GeneralSecurityException("Could not determine HPKE AEAD ID");
    }

    @Override // com.google.android.gms.internal.ads.xi3
    public final byte[] c(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) throws InvalidAlgorithmParameterException {
        int length = bArr.length;
        if (length == this.f16361a) {
            return new nh3(bArr, false).b(bArr2, bArr3, bArr4);
        }
        throw new InvalidAlgorithmParameterException("Unexpected key length: " + length);
    }
}
