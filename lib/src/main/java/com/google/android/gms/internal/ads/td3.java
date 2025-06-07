package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public abstract class td3 {

    /* renamed from: a, reason: collision with root package name */
    public static final String f15790a;

    /* renamed from: b, reason: collision with root package name */
    public static final String f15791b;

    /* renamed from: c, reason: collision with root package name */
    static final xt3 f15792c;

    /* renamed from: d, reason: collision with root package name */
    static final xt3 f15793d;

    /* renamed from: e, reason: collision with root package name */
    static final xt3 f15794e;

    static {
        new be3();
        f15790a = "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey";
        new df3();
        f15791b = "type.googleapis.com/google.crypto.tink.AesGcmKey";
        new wf3();
        new me3();
        new vg3();
        new zg3();
        new kg3();
        new dh3();
        xt3 xt3VarL = xt3.L();
        f15792c = xt3VarL;
        f15793d = xt3VarL;
        f15794e = xt3VarL;
        try {
            a();
        } catch (GeneralSecurityException e5) {
            throw new ExceptionInInitializerError(e5);
        }
    }

    public static void a() {
        yd3.e();
        mn3.a();
        qd3.k(new be3(), true);
        qd3.k(new df3(), true);
        int i10 = pf3.f13872f;
        pf3.a(ok3.b());
        if (zh3.b()) {
            return;
        }
        qd3.k(new me3(), true);
        int i11 = we3.f17101f;
        we3.a(ok3.b());
        wf3.k(true);
        qd3.k(new kg3(), true);
        int i12 = sg3.f15243f;
        sg3.a(ok3.b());
        qd3.k(new vg3(), true);
        qd3.k(new zg3(), true);
        qd3.k(new dh3(), true);
        int i13 = kh3.f11067f;
        kh3.a(ok3.b());
    }
}
