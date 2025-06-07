package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public enum ut3 implements dy3 {
    UNKNOWN_PREFIX(0),
    TINK(1),
    LEGACY(2),
    RAW(3),
    CRUNCHY(4),
    UNRECOGNIZED(-1);


    /* renamed from: t, reason: collision with root package name */
    private static final ey3 f16464t = new ey3() { // from class: com.google.android.gms.internal.ads.tt3
    };

    /* renamed from: m, reason: collision with root package name */
    private final int f16466m;

    ut3(int i10) {
        this.f16466m = i10;
    }

    public static ut3 b(int i10) {
        if (i10 == 0) {
            return UNKNOWN_PREFIX;
        }
        if (i10 == 1) {
            return TINK;
        }
        if (i10 == 2) {
            return LEGACY;
        }
        if (i10 == 3) {
            return RAW;
        }
        if (i10 != 4) {
            return null;
        }
        return CRUNCHY;
    }

    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.f16466m;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(a());
    }
}
