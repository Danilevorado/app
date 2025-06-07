package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* loaded from: classes.dex */
public final class fm3 {

    /* renamed from: a, reason: collision with root package name */
    private Integer f8329a = null;

    /* renamed from: b, reason: collision with root package name */
    private Integer f8330b = null;

    /* renamed from: c, reason: collision with root package name */
    private gm3 f8331c = gm3.f8812e;

    /* synthetic */ fm3(em3 em3Var) {
    }

    public final fm3 a(int i10) throws InvalidAlgorithmParameterException {
        if (i10 != 16 && i10 != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 128-bit and 256-bit AES keys are supported", Integer.valueOf(i10 * 8)));
        }
        this.f8329a = Integer.valueOf(i10);
        return this;
    }

    public final fm3 b(int i10) throws GeneralSecurityException {
        if (i10 >= 10 && i10 <= 16) {
            this.f8330b = Integer.valueOf(i10);
            return this;
        }
        throw new GeneralSecurityException("Invalid tag size for AesCmacParameters: " + i10);
    }

    public final fm3 c(gm3 gm3Var) {
        this.f8331c = gm3Var;
        return this;
    }

    public final im3 d() throws GeneralSecurityException {
        Integer num = this.f8329a;
        if (num == null) {
            throw new GeneralSecurityException("key size not set");
        }
        if (this.f8330b == null) {
            throw new GeneralSecurityException("tag size not set");
        }
        if (this.f8331c != null) {
            return new im3(num.intValue(), this.f8330b.intValue(), this.f8331c, null);
        }
        throw new GeneralSecurityException("variant not set");
    }
}
