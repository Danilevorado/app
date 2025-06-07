package com.google.android.gms.internal.play_billing;

/* loaded from: classes.dex */
abstract class a3 {

    /* renamed from: a, reason: collision with root package name */
    private static final z2 f19456a;

    /* renamed from: b, reason: collision with root package name */
    private static final z2 f19457b;

    static {
        z2 z2Var;
        try {
            z2Var = (z2) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            z2Var = null;
        }
        f19456a = z2Var;
        f19457b = new z2();
    }

    static z2 a() {
        return f19456a;
    }

    static z2 b() {
        return f19457b;
    }
}
