package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public final class oc implements nc {

    /* renamed from: a, reason: collision with root package name */
    public static final u6 f19177a;

    /* renamed from: b, reason: collision with root package name */
    public static final u6 f19178b;

    /* renamed from: c, reason: collision with root package name */
    public static final u6 f19179c;

    static {
        q6 q6VarA = new q6(i6.a("com.google.android.gms.measurement")).a();
        f19177a = q6VarA.f("measurement.client.sessions.check_on_reset_and_enable2", true);
        f19178b = q6VarA.f("measurement.client.sessions.check_on_startup", true);
        f19179c = q6VarA.f("measurement.client.sessions.start_session_before_view_screen", true);
    }

    @Override // com.google.android.gms.internal.measurement.nc
    public final boolean a() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.nc
    public final boolean b() {
        return ((Boolean) f19177a.b()).booleanValue();
    }
}
