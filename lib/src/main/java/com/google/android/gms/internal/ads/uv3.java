package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.MessageDigest;

/* loaded from: classes.dex */
public final class uv3 implements cd3 {

    /* renamed from: a, reason: collision with root package name */
    private final fo3 f16481a;

    /* renamed from: b, reason: collision with root package name */
    private final int f16482b;

    public uv3(fo3 fo3Var, int i10) throws InvalidAlgorithmParameterException {
        this.f16481a = fo3Var;
        this.f16482b = i10;
        if (i10 < 10) {
            throw new InvalidAlgorithmParameterException("tag size too small, need at least 10 bytes");
        }
        fo3Var.a(new byte[0], i10);
    }

    @Override // com.google.android.gms.internal.ads.cd3
    public final void a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (!MessageDigest.isEqual(b(bArr2), bArr)) {
            throw new GeneralSecurityException("invalid MAC");
        }
    }

    @Override // com.google.android.gms.internal.ads.cd3
    public final byte[] b(byte[] bArr) {
        return this.f16481a.a(bArr, this.f16482b);
    }
}
