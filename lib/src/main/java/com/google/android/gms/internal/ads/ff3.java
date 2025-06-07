package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* loaded from: classes.dex */
public final class ff3 {

    /* renamed from: a, reason: collision with root package name */
    private Integer f8264a = null;

    /* renamed from: b, reason: collision with root package name */
    private Integer f8265b = null;

    /* renamed from: c, reason: collision with root package name */
    private Integer f8266c = null;

    /* renamed from: d, reason: collision with root package name */
    private gf3 f8267d = gf3.f8705d;

    /* synthetic */ ff3(ef3 ef3Var) {
    }

    public final ff3 a(int i10) {
        this.f8265b = 12;
        return this;
    }

    public final ff3 b(int i10) throws InvalidAlgorithmParameterException {
        if (i10 != 16 && i10 != 24 && i10 != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i10)));
        }
        this.f8264a = Integer.valueOf(i10);
        return this;
    }

    public final ff3 c(int i10) {
        this.f8266c = 16;
        return this;
    }

    public final ff3 d(gf3 gf3Var) {
        this.f8267d = gf3Var;
        return this;
    }

    public final if3 e() throws GeneralSecurityException {
        Integer num = this.f8264a;
        if (num == null) {
            throw new GeneralSecurityException("Key size is not set");
        }
        if (this.f8267d == null) {
            throw new GeneralSecurityException("Variant is not set");
        }
        if (this.f8265b == null) {
            throw new GeneralSecurityException("IV size is not set");
        }
        if (this.f8266c == null) {
            throw new GeneralSecurityException("Tag size is not set");
        }
        int iIntValue = num.intValue();
        this.f8265b.intValue();
        this.f8266c.intValue();
        return new if3(iIntValue, 12, 16, this.f8267d, null);
    }
}
