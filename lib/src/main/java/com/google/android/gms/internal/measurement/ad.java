package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public final class ad implements zc {

    /* renamed from: a, reason: collision with root package name */
    public static final u6 f18827a;

    /* renamed from: b, reason: collision with root package name */
    public static final u6 f18828b;

    static {
        q6 q6VarA = new q6(i6.a("com.google.android.gms.measurement")).a();
        f18827a = q6VarA.f("measurement.module.pixie.ees", true);
        f18828b = q6VarA.f("measurement.module.pixie.fix_array", true);
    }

    @Override // com.google.android.gms.internal.measurement.zc
    public final boolean a() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zc
    public final boolean b() {
        return ((Boolean) f18828b.b()).booleanValue();
    }
}
