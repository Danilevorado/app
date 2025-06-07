package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public final class rc implements qc {

    /* renamed from: a, reason: collision with root package name */
    public static final u6 f19262a;

    /* renamed from: b, reason: collision with root package name */
    public static final u6 f19263b;

    /* renamed from: c, reason: collision with root package name */
    public static final u6 f19264c;

    /* renamed from: d, reason: collision with root package name */
    public static final u6 f19265d;

    static {
        q6 q6VarA = new q6(i6.a("com.google.android.gms.measurement")).a();
        f19262a = q6VarA.f("measurement.sdk.collection.enable_extend_user_property_size", true);
        f19263b = q6VarA.f("measurement.sdk.collection.last_deep_link_referrer2", true);
        f19264c = q6VarA.f("measurement.sdk.collection.last_deep_link_referrer_campaign2", false);
        f19265d = q6VarA.d("measurement.id.sdk.collection.last_deep_link_referrer2", 0L);
    }

    @Override // com.google.android.gms.internal.measurement.qc
    public final boolean a() {
        return ((Boolean) f19264c.b()).booleanValue();
    }
}
