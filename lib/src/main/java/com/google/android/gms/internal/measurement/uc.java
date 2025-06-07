package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public final class uc implements tc {

    /* renamed from: a, reason: collision with root package name */
    public static final u6 f19359a;

    /* renamed from: b, reason: collision with root package name */
    public static final u6 f19360b;

    /* renamed from: c, reason: collision with root package name */
    public static final u6 f19361c;

    /* renamed from: d, reason: collision with root package name */
    public static final u6 f19362d;

    static {
        q6 q6VarA = new q6(i6.a("com.google.android.gms.measurement")).a();
        f19359a = q6VarA.d("measurement.id.lifecycle.app_in_background_parameter", 0L);
        f19360b = q6VarA.f("measurement.lifecycle.app_backgrounded_tracking", true);
        f19361c = q6VarA.f("measurement.lifecycle.app_in_background_parameter", false);
        f19362d = q6VarA.d("measurement.id.lifecycle.app_backgrounded_tracking", 0L);
    }

    @Override // com.google.android.gms.internal.measurement.tc
    public final boolean a() {
        return ((Boolean) f19361c.b()).booleanValue();
    }
}
