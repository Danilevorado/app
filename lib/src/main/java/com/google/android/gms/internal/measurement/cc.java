package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public final class cc implements ac {

    /* renamed from: a, reason: collision with root package name */
    public static final u6 f18886a;

    /* renamed from: b, reason: collision with root package name */
    public static final u6 f18887b;

    /* renamed from: c, reason: collision with root package name */
    public static final u6 f18888c;

    static {
        q6 q6VarA = new q6(i6.a("com.google.android.gms.measurement")).b().a();
        f18886a = q6VarA.f("measurement.collection.event_safelist", true);
        f18887b = q6VarA.f("measurement.service.store_null_safelist", true);
        f18888c = q6VarA.f("measurement.service.store_safelist", true);
    }

    @Override // com.google.android.gms.internal.measurement.ac
    public final boolean a() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.ac
    public final boolean b() {
        return ((Boolean) f18887b.b()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.ac
    public final boolean d() {
        return ((Boolean) f18888c.b()).booleanValue();
    }
}
