package com.google.android.gms.internal.play_billing;

/* loaded from: classes.dex */
abstract class f1 {

    /* renamed from: a, reason: collision with root package name */
    private static final d1 f19495a = new e1();

    /* renamed from: b, reason: collision with root package name */
    private static final d1 f19496b;

    static {
        d1 d1Var;
        try {
            d1Var = (d1) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            d1Var = null;
        }
        f19496b = d1Var;
    }

    static d1 a() {
        d1 d1Var = f19496b;
        if (d1Var != null) {
            return d1Var;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    static d1 b() {
        return f19495a;
    }
}
