package com.google.android.gms.internal.play_billing;

/* loaded from: classes.dex */
abstract class q2 {

    /* renamed from: a, reason: collision with root package name */
    private static final p2 f19627a;

    /* renamed from: b, reason: collision with root package name */
    private static final p2 f19628b;

    static {
        p2 p2Var;
        try {
            p2Var = (p2) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            p2Var = null;
        }
        f19627a = p2Var;
        f19628b = new p2();
    }

    static p2 a() {
        return f19627a;
    }

    static p2 b() {
        return f19628b;
    }
}
