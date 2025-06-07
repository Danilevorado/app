package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class tn3 implements om3 {

    /* renamed from: a, reason: collision with root package name */
    private final zl3 f15926a;

    public tn3(zl3 zl3Var) throws GeneralSecurityException {
        if (!yh3.a(1)) {
            throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
        }
        this.f15926a = zl3Var;
    }
}
