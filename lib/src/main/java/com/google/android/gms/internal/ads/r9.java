package com.google.android.gms.internal.ads;

import java.security.cert.X509Certificate;

/* loaded from: classes.dex */
final class r9 extends s9 {

    /* renamed from: n, reason: collision with root package name */
    private final byte[] f14695n;

    public r9(X509Certificate x509Certificate, byte[] bArr) {
        super(x509Certificate);
        this.f14695n = bArr;
    }

    @Override // java.security.cert.Certificate
    public final byte[] getEncoded() {
        return this.f14695n;
    }
}
