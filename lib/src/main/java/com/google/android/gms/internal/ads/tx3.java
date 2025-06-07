package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
abstract class tx3 {

    /* renamed from: a, reason: collision with root package name */
    private static final rx3 f16092a = new sx3();

    /* renamed from: b, reason: collision with root package name */
    private static final rx3 f16093b;

    static {
        rx3 rx3Var;
        try {
            rx3Var = (rx3) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            rx3Var = null;
        }
        f16093b = rx3Var;
    }

    static rx3 a() {
        rx3 rx3Var = f16093b;
        if (rx3Var != null) {
            return rx3Var;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    static rx3 b() {
        return f16092a;
    }
}
