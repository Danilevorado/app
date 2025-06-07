package com.google.android.gms.internal.ads;

import java.security.InvalidAlgorithmParameterException;

/* loaded from: classes.dex */
final class vi3 implements xi3 {
    vi3() {
    }

    @Override // com.google.android.gms.internal.ads.xi3
    public final int a() {
        return 32;
    }

    @Override // com.google.android.gms.internal.ads.xi3
    public final byte[] b() {
        return kj3.f11104k;
    }

    @Override // com.google.android.gms.internal.ads.xi3
    public final byte[] c(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) throws InvalidAlgorithmParameterException {
        if (bArr.length == 32) {
            return new rh3(bArr).d(bArr2, bArr3, bArr4);
        }
        throw new InvalidAlgorithmParameterException("Unexpected key length: 32");
    }
}
