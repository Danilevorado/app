package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* loaded from: classes.dex */
public final class oe3 {

    /* renamed from: a, reason: collision with root package name */
    private Integer f13181a = null;

    /* renamed from: b, reason: collision with root package name */
    private Integer f13182b = null;

    /* renamed from: c, reason: collision with root package name */
    private Integer f13183c = null;

    /* renamed from: d, reason: collision with root package name */
    private pe3 f13184d = pe3.f13746d;

    /* synthetic */ oe3(ne3 ne3Var) {
    }

    public final oe3 a(int i10) throws GeneralSecurityException {
        if (i10 != 12 && i10 != 16) {
            throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d; acceptable values have 12 or 16 bytes", Integer.valueOf(i10)));
        }
        this.f13182b = Integer.valueOf(i10);
        return this;
    }

    public final oe3 b(int i10) throws InvalidAlgorithmParameterException {
        if (i10 != 16 && i10 != 24 && i10 != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i10)));
        }
        this.f13181a = Integer.valueOf(i10);
        return this;
    }

    public final oe3 c(int i10) {
        this.f13183c = 16;
        return this;
    }

    public final oe3 d(pe3 pe3Var) {
        this.f13184d = pe3Var;
        return this;
    }

    public final re3 e() throws GeneralSecurityException {
        Integer num = this.f13181a;
        if (num == null) {
            throw new GeneralSecurityException("Key size is not set");
        }
        if (this.f13182b == null) {
            throw new GeneralSecurityException("IV size is not set");
        }
        if (this.f13184d == null) {
            throw new GeneralSecurityException("Variant is not set");
        }
        if (this.f13183c == null) {
            throw new GeneralSecurityException("Tag size is not set");
        }
        int iIntValue = num.intValue();
        int iIntValue2 = this.f13182b.intValue();
        this.f13183c.intValue();
        return new re3(iIntValue, iIntValue2, 16, this.f13184d, null);
    }
}
