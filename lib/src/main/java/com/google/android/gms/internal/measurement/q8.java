package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
final class q8 implements w9 {

    /* renamed from: a, reason: collision with root package name */
    private static final q8 f19222a = new q8();

    private q8() {
    }

    public static q8 c() {
        return f19222a;
    }

    @Override // com.google.android.gms.internal.measurement.w9
    public final v9 a(Class cls) {
        if (!u8.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
        }
        try {
            return (v9) u8.t(cls.asSubclass(u8.class)).u(3, null, null);
        } catch (Exception e5) {
            throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e5);
        }
    }

    @Override // com.google.android.gms.internal.measurement.w9
    public final boolean b(Class cls) {
        return u8.class.isAssignableFrom(cls);
    }
}
