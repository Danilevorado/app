package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public enum ms3 implements dy3 {
    UNKNOWN_KEYMATERIAL(0),
    SYMMETRIC(1),
    ASYMMETRIC_PRIVATE(2),
    ASYMMETRIC_PUBLIC(3),
    REMOTE(4),
    UNRECOGNIZED(-1);


    /* renamed from: t, reason: collision with root package name */
    private static final ey3 f12241t = new ey3() { // from class: com.google.android.gms.internal.ads.ls3
    };

    /* renamed from: m, reason: collision with root package name */
    private final int f12243m;

    ms3(int i10) {
        this.f12243m = i10;
    }

    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.f12243m;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(a());
    }
}
