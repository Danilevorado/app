package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public final class ic implements hc {

    /* renamed from: a, reason: collision with root package name */
    public static final u6 f19013a;

    /* renamed from: b, reason: collision with root package name */
    public static final u6 f19014b;

    /* renamed from: c, reason: collision with root package name */
    public static final u6 f19015c;

    /* renamed from: d, reason: collision with root package name */
    public static final u6 f19016d;

    static {
        q6 q6VarA = new q6(i6.a("com.google.android.gms.measurement")).a();
        f19013a = q6VarA.f("measurement.service.audience.fix_skip_audience_with_failed_filters", true);
        f19014b = q6VarA.f("measurement.audience.refresh_event_count_filters_timestamp", false);
        f19015c = q6VarA.f("measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters", false);
        f19016d = q6VarA.f("measurement.audience.use_bundle_timestamp_for_event_count_filters", false);
    }

    @Override // com.google.android.gms.internal.measurement.hc
    public final boolean a() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.hc
    public final boolean b() {
        return ((Boolean) f19014b.b()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.hc
    public final boolean d() {
        return ((Boolean) f19015c.b()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.hc
    public final boolean f() {
        return ((Boolean) f19016d.b()).booleanValue();
    }
}
