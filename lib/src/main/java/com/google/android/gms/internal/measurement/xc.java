package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public final class xc implements wc {

    /* renamed from: a, reason: collision with root package name */
    public static final u6 f19402a;

    /* renamed from: b, reason: collision with root package name */
    public static final u6 f19403b;

    /* renamed from: c, reason: collision with root package name */
    public static final u6 f19404c;

    /* renamed from: d, reason: collision with root package name */
    public static final u6 f19405d;

    /* renamed from: e, reason: collision with root package name */
    public static final u6 f19406e;

    static {
        q6 q6VarA = new q6(i6.a("com.google.android.gms.measurement")).a();
        f19402a = q6VarA.f("measurement.test.boolean_flag", false);
        f19403b = q6VarA.c("measurement.test.double_flag", -3.0d);
        f19404c = q6VarA.d("measurement.test.int_flag", -2L);
        f19405d = q6VarA.d("measurement.test.long_flag", -1L);
        f19406e = q6VarA.e("measurement.test.string_flag", "---");
    }

    @Override // com.google.android.gms.internal.measurement.wc
    public final double a() {
        return ((Double) f19403b.b()).doubleValue();
    }

    @Override // com.google.android.gms.internal.measurement.wc
    public final long b() {
        return ((Long) f19404c.b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.wc
    public final boolean c() {
        return ((Boolean) f19402a.b()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.wc
    public final long d() {
        return ((Long) f19405d.b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.wc
    public final String f() {
        return (String) f19406e.b();
    }
}
