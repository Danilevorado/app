package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public abstract class mn3 {

    /* renamed from: a, reason: collision with root package name */
    static final xt3 f12206a;

    /* renamed from: b, reason: collision with root package name */
    static final xt3 f12207b;

    /* renamed from: c, reason: collision with root package name */
    static final xt3 f12208c;

    static {
        new an3();
        xt3 xt3VarL = xt3.L();
        f12206a = xt3VarL;
        f12207b = xt3VarL;
        f12208c = xt3VarL;
        try {
            a();
        } catch (GeneralSecurityException e5) {
            throw new ExceptionInInitializerError(e5);
        }
    }

    public static void a() {
        rn3.e();
        rm3.d();
        an3.l(true);
        if (zh3.b()) {
            return;
        }
        dm3.m(true);
    }
}
