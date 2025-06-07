package com.google.android.gms.internal.play_billing;

/* loaded from: classes.dex */
final class k1 implements s2 {

    /* renamed from: a, reason: collision with root package name */
    private static final k1 f19561a = new k1();

    private k1() {
    }

    public static k1 c() {
        return f19561a;
    }

    @Override // com.google.android.gms.internal.play_billing.s2
    public final r2 a(Class cls) {
        if (!n1.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
        }
        try {
            return (r2) n1.j(cls.asSubclass(n1.class)).x(3, null, null);
        } catch (Exception e5) {
            throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e5);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.s2
    public final boolean b(Class cls) {
        return n1.class.isAssignableFrom(cls);
    }
}
