package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public final class vb implements ub {

    /* renamed from: a, reason: collision with root package name */
    public static final u6 f19374a;

    /* renamed from: b, reason: collision with root package name */
    public static final u6 f19375b;

    /* renamed from: c, reason: collision with root package name */
    public static final u6 f19376c;

    /* renamed from: d, reason: collision with root package name */
    public static final u6 f19377d;

    static {
        q6 q6VarA = new q6(i6.a("com.google.android.gms.measurement")).a();
        f19374a = q6VarA.f("measurement.client.consent_state_v1", true);
        f19375b = q6VarA.f("measurement.client.3p_consent_state_v1", true);
        f19376c = q6VarA.f("measurement.service.consent_state_v1_W36", true);
        f19377d = q6VarA.d("measurement.service.storage_consent_support_version", 203600L);
    }

    @Override // com.google.android.gms.internal.measurement.ub
    public final long a() {
        return ((Long) f19377d.b()).longValue();
    }
}
