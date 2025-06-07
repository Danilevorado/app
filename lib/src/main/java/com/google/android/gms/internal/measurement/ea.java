package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
abstract class ea {

    /* renamed from: a, reason: collision with root package name */
    private static final da f18928a;

    /* renamed from: b, reason: collision with root package name */
    private static final da f18929b;

    static {
        da daVar;
        try {
            daVar = (da) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            daVar = null;
        }
        f18928a = daVar;
        f18929b = new da();
    }

    static da a() {
        return f18928a;
    }

    static da b() {
        return f18929b;
    }
}
