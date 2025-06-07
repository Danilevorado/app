package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
abstract class u9 {

    /* renamed from: a, reason: collision with root package name */
    private static final t9 f19356a;

    /* renamed from: b, reason: collision with root package name */
    private static final t9 f19357b;

    static {
        t9 t9Var;
        try {
            t9Var = (t9) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            t9Var = null;
        }
        f19356a = t9Var;
        f19357b = new t9();
    }

    static t9 a() {
        return f19356a;
    }

    static t9 b() {
        return f19357b;
    }
}
