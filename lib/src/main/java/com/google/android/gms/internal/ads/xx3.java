package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class xx3 implements hz3 {

    /* renamed from: a, reason: collision with root package name */
    private static final xx3 f17836a = new xx3();

    private xx3() {
    }

    public static xx3 c() {
        return f17836a;
    }

    @Override // com.google.android.gms.internal.ads.hz3
    public final gz3 a(Class cls) {
        if (!by3.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
        }
        try {
            return (gz3) by3.j(cls.asSubclass(by3.class)).H(3, null, null);
        } catch (Exception e5) {
            throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e5);
        }
    }

    @Override // com.google.android.gms.internal.ads.hz3
    public final boolean b(Class cls) {
        return by3.class.isAssignableFrom(cls);
    }
}
