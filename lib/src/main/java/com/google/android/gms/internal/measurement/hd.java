package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public final class hd implements gd {

    /* renamed from: a, reason: collision with root package name */
    public static final u6 f18979a;

    /* renamed from: b, reason: collision with root package name */
    public static final u6 f18980b;

    /* renamed from: c, reason: collision with root package name */
    public static final u6 f18981c;

    /* renamed from: d, reason: collision with root package name */
    public static final u6 f18982d;

    /* renamed from: e, reason: collision with root package name */
    public static final u6 f18983e;

    /* renamed from: f, reason: collision with root package name */
    public static final u6 f18984f;

    /* renamed from: g, reason: collision with root package name */
    public static final u6 f18985g;

    /* renamed from: h, reason: collision with root package name */
    public static final u6 f18986h;

    /* renamed from: i, reason: collision with root package name */
    public static final u6 f18987i;

    /* renamed from: j, reason: collision with root package name */
    public static final u6 f18988j;

    /* renamed from: k, reason: collision with root package name */
    public static final u6 f18989k;

    /* renamed from: l, reason: collision with root package name */
    public static final u6 f18990l;

    /* renamed from: m, reason: collision with root package name */
    public static final u6 f18991m;

    /* renamed from: n, reason: collision with root package name */
    public static final u6 f18992n;

    /* renamed from: o, reason: collision with root package name */
    public static final u6 f18993o;

    static {
        q6 q6VarA = new q6(i6.a("com.google.android.gms.measurement")).b().a();
        f18979a = q6VarA.f("measurement.redaction.app_instance_id", true);
        f18980b = q6VarA.f("measurement.redaction.client_ephemeral_aiid_generation", true);
        f18981c = q6VarA.f("measurement.redaction.config_redacted_fields", true);
        f18982d = q6VarA.f("measurement.redaction.device_info", true);
        f18983e = q6VarA.f("measurement.redaction.e_tag", true);
        f18984f = q6VarA.f("measurement.redaction.enhanced_uid", true);
        f18985g = q6VarA.f("measurement.redaction.populate_ephemeral_app_instance_id", true);
        f18986h = q6VarA.f("measurement.redaction.google_signals", true);
        f18987i = q6VarA.f("measurement.redaction.no_aiid_in_config_request", true);
        f18988j = q6VarA.f("measurement.redaction.retain_major_os_version", true);
        f18989k = q6VarA.f("measurement.redaction.scion_payload_generator", false);
        f18990l = q6VarA.f("measurement.redaction.upload_redacted_fields", true);
        f18991m = q6VarA.f("measurement.redaction.upload_subdomain_override", true);
        f18992n = q6VarA.f("measurement.redaction.user_id", true);
        f18993o = q6VarA.d("measurement.id.redaction", 0L);
    }

    @Override // com.google.android.gms.internal.measurement.gd
    public final boolean a() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.gd
    public final boolean b() {
        return ((Boolean) f18979a.b()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.gd
    public final boolean c() {
        return ((Boolean) f18982d.b()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.gd
    public final boolean d() {
        return ((Boolean) f18980b.b()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.gd
    public final boolean e() {
        return ((Boolean) f18983e.b()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.gd
    public final boolean f() {
        return ((Boolean) f18981c.b()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.gd
    public final boolean g() {
        return ((Boolean) f18985g.b()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.gd
    public final boolean h() {
        return ((Boolean) f18984f.b()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.gd
    public final boolean i() {
        return ((Boolean) f18986h.b()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.gd
    public final boolean j() {
        return ((Boolean) f18987i.b()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.gd
    public final boolean k() {
        return ((Boolean) f18988j.b()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.gd
    public final boolean l() {
        return ((Boolean) f18989k.b()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.gd
    public final boolean m() {
        return ((Boolean) f18991m.b()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.gd
    public final boolean n() {
        return ((Boolean) f18990l.b()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.gd
    public final boolean p() {
        return ((Boolean) f18992n.b()).booleanValue();
    }
}
