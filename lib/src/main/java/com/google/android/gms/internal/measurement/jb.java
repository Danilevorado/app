package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public final class jb implements ib {

    /* renamed from: a, reason: collision with root package name */
    public static final u6 f19032a;

    /* renamed from: b, reason: collision with root package name */
    public static final u6 f19033b;

    /* renamed from: c, reason: collision with root package name */
    public static final u6 f19034c;

    /* renamed from: d, reason: collision with root package name */
    public static final u6 f19035d;

    /* renamed from: e, reason: collision with root package name */
    public static final u6 f19036e;

    /* renamed from: f, reason: collision with root package name */
    public static final u6 f19037f;

    /* renamed from: g, reason: collision with root package name */
    public static final u6 f19038g;

    static {
        q6 q6VarA = new q6(i6.a("com.google.android.gms.measurement")).b().a();
        f19032a = q6VarA.f("measurement.adid_zero.app_instance_id_fix", true);
        f19033b = q6VarA.f("measurement.adid_zero.service", true);
        f19034c = q6VarA.f("measurement.adid_zero.adid_uid", true);
        f19035d = q6VarA.f("measurement.adid_zero.only_request_adid_if_enabled", true);
        f19036e = q6VarA.f("measurement.adid_zero.remove_lair_if_adidzero_false", true);
        f19037f = q6VarA.f("measurement.adid_zero.remove_lair_if_userid_cleared", true);
        f19038g = q6VarA.f("measurement.adid_zero.remove_lair_on_id_value_change_only", true);
    }

    @Override // com.google.android.gms.internal.measurement.ib
    public final boolean a() {
        return ((Boolean) f19035d.b()).booleanValue();
    }
}
