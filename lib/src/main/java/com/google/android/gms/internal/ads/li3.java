package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public abstract class li3 {

    /* renamed from: a, reason: collision with root package name */
    static final xt3 f11622a;

    /* renamed from: b, reason: collision with root package name */
    static final xt3 f11623b;

    /* renamed from: c, reason: collision with root package name */
    static final xt3 f11624c;

    static {
        new ki3();
        new ii3();
        f11622a = xt3.L();
        f11623b = xt3.L();
        f11624c = xt3.L();
        try {
            ni3.d();
            ri3.d();
            td3.a();
            if (zh3.b()) {
                return;
            }
            qd3.i(new ii3(), new ki3(), true);
            qd3.i(new hj3(), new jj3(), true);
        } catch (GeneralSecurityException e5) {
            throw new ExceptionInInitializerError(e5);
        }
    }
}
