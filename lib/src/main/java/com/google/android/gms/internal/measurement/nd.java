package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public final class nd implements md {

    /* renamed from: a, reason: collision with root package name */
    public static final u6 f19137a;

    /* renamed from: b, reason: collision with root package name */
    public static final u6 f19138b;

    static {
        q6 q6VarA = new q6(i6.a("com.google.android.gms.measurement")).b().a();
        f19137a = q6VarA.f("measurement.collection.enable_session_stitching_token.client.dev", false);
        f19138b = q6VarA.f("measurement.collection.enable_session_stitching_token.service", false);
    }

    @Override // com.google.android.gms.internal.measurement.md
    public final boolean a() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.md
    public final boolean b() {
        return ((Boolean) f19137a.b()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.md
    public final boolean d() {
        return ((Boolean) f19138b.b()).booleanValue();
    }
}
