package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
abstract class m8 {

    /* renamed from: a, reason: collision with root package name */
    private static final k8 f19071a = new l8();

    /* renamed from: b, reason: collision with root package name */
    private static final k8 f19072b;

    static {
        k8 k8Var;
        try {
            k8Var = (k8) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            k8Var = null;
        }
        f19072b = k8Var;
    }

    static k8 a() {
        k8 k8Var = f19072b;
        if (k8Var != null) {
            return k8Var;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    static k8 b() {
        return f19071a;
    }
}
