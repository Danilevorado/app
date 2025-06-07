package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
final class mj3 implements dj3 {

    /* renamed from: a, reason: collision with root package name */
    private final cw3 f12175a;

    /* renamed from: b, reason: collision with root package name */
    private final cw3 f12176b;

    private mj3(byte[] bArr, byte[] bArr2) {
        this.f12175a = cw3.b(bArr);
        this.f12176b = cw3.b(bArr2);
    }

    static mj3 a(byte[] bArr, byte[] bArr2, int i10) throws GeneralSecurityException {
        vu3.c(vu3.g(vu3.h(i10), 1, bArr2), vu3.f(i10, bArr));
        return new mj3(bArr, bArr2);
    }
}
