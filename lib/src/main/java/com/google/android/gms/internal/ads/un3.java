package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class un3 implements om3 {

    /* renamed from: a, reason: collision with root package name */
    private final wm3 f16414a;

    public un3(wm3 wm3Var) throws GeneralSecurityException {
        if (!yh3.a(2)) {
            throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
        }
        this.f16414a = wm3Var;
    }
}
