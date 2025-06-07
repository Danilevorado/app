package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
abstract class pz3 {

    /* renamed from: a, reason: collision with root package name */
    private static final oz3 f14112a;

    /* renamed from: b, reason: collision with root package name */
    private static final oz3 f14113b;

    static {
        oz3 oz3Var;
        try {
            oz3Var = (oz3) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            oz3Var = null;
        }
        f14112a = oz3Var;
        f14113b = new oz3();
    }

    static oz3 a() {
        return f14112a;
    }

    static oz3 b() {
        return f14113b;
    }
}
