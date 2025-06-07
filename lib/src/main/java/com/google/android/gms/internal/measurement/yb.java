package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public final class yb implements xb {

    /* renamed from: a, reason: collision with root package name */
    public static final u6 f19414a;

    /* renamed from: b, reason: collision with root package name */
    public static final u6 f19415b;

    /* renamed from: c, reason: collision with root package name */
    public static final u6 f19416c;

    /* renamed from: d, reason: collision with root package name */
    public static final u6 f19417d;

    static {
        q6 q6VarA = new q6(i6.a("com.google.android.gms.measurement")).b().a();
        f19414a = q6VarA.f("measurement.enhanced_campaign.client", true);
        f19415b = q6VarA.f("measurement.enhanced_campaign.service", true);
        f19416c = q6VarA.f("measurement.enhanced_campaign.srsltid.client", true);
        f19417d = q6VarA.f("measurement.enhanced_campaign.srsltid.service", true);
    }

    @Override // com.google.android.gms.internal.measurement.xb
    public final boolean a() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.xb
    public final boolean b() {
        return ((Boolean) f19414a.b()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.xb
    public final boolean c() {
        return ((Boolean) f19417d.b()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.xb
    public final boolean d() {
        return ((Boolean) f19415b.b()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.xb
    public final boolean f() {
        return ((Boolean) f19416c.b()).booleanValue();
    }
}
