package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
abstract class fz3 {

    /* renamed from: a, reason: collision with root package name */
    private static final ez3 f8514a;

    /* renamed from: b, reason: collision with root package name */
    private static final ez3 f8515b;

    static {
        ez3 ez3Var;
        try {
            ez3Var = (ez3) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            ez3Var = null;
        }
        f8514a = ez3Var;
        f8515b = new ez3();
    }

    static ez3 a() {
        return f8514a;
    }

    static ez3 b() {
        return f8515b;
    }
}
