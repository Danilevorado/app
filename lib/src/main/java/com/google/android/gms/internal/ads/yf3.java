package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* loaded from: classes.dex */
public final class yf3 {

    /* renamed from: a, reason: collision with root package name */
    private Integer f18027a = null;

    /* renamed from: b, reason: collision with root package name */
    private zf3 f18028b = zf3.f18564d;

    /* synthetic */ yf3(xf3 xf3Var) {
    }

    public final yf3 a(int i10) throws InvalidAlgorithmParameterException {
        if (i10 != 16 && i10 != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte and 32-byte AES keys are supported", Integer.valueOf(i10)));
        }
        this.f18027a = Integer.valueOf(i10);
        return this;
    }

    public final yf3 b(zf3 zf3Var) {
        this.f18028b = zf3Var;
        return this;
    }

    public final bg3 c() throws GeneralSecurityException {
        Integer num = this.f18027a;
        if (num == null) {
            throw new GeneralSecurityException("Key size is not set");
        }
        if (this.f18028b != null) {
            return new bg3(num.intValue(), this.f18028b, null);
        }
        throw new GeneralSecurityException("Variant is not set");
    }
}
