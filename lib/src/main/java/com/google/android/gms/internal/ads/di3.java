package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public abstract class di3 {

    /* renamed from: a, reason: collision with root package name */
    public static final String f7329a;

    /* renamed from: b, reason: collision with root package name */
    static final xt3 f7330b;

    /* renamed from: c, reason: collision with root package name */
    static final xt3 f7331c;

    static {
        new ci3();
        f7329a = "type.googleapis.com/google.crypto.tink.AesSivKey";
        f7330b = xt3.L();
        f7331c = xt3.L();
        try {
            fi3.d();
            if (zh3.b()) {
                return;
            }
            qd3.k(new ci3(), true);
        } catch (GeneralSecurityException e5) {
            throw new ExceptionInInitializerError(e5);
        }
    }
}
