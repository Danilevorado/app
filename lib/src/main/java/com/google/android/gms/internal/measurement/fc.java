package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public final class fc implements ec {

    /* renamed from: a, reason: collision with root package name */
    public static final u6 f18950a = new q6(i6.a("com.google.android.gms.measurement")).a().f("measurement.client.firebase_feature_rollout.v1.enable", true);

    @Override // com.google.android.gms.internal.measurement.ec
    public final boolean a() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.ec
    public final boolean b() {
        return ((Boolean) f18950a.b()).booleanValue();
    }
}
