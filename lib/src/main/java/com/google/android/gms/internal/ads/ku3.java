package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class ku3 implements wb3 {

    /* renamed from: a, reason: collision with root package name */
    private final nh3 f11241a;

    public ku3(byte[] bArr) throws GeneralSecurityException {
        if (!yh3.a(2)) {
            throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
        }
        this.f11241a = new nh3(bArr, true);
    }

    @Override // com.google.android.gms.internal.ads.wb3
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        return this.f11241a.a(Arrays.copyOf(bArr, 12), bArr, bArr2);
    }

    @Override // com.google.android.gms.internal.ads.wb3
    public final byte[] b(byte[] bArr, byte[] bArr2) {
        return this.f11241a.b(wv3.a(12), bArr, bArr2);
    }
}
