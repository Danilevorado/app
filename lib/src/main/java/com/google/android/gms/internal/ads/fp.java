package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public enum fp implements dy3 {
    UNSPECIFIED(0),
    CONNECTING(1),
    CONNECTED(2),
    DISCONNECTING(3),
    DISCONNECTED(4),
    SUSPENDED(5);


    /* renamed from: t, reason: collision with root package name */
    private static final ey3 f8360t = new ey3() { // from class: com.google.android.gms.internal.ads.dp
    };

    /* renamed from: m, reason: collision with root package name */
    private final int f8362m;

    fp(int i10) {
        this.f8362m = i10;
    }

    public static fp b(int i10) {
        if (i10 == 0) {
            return UNSPECIFIED;
        }
        if (i10 == 1) {
            return CONNECTING;
        }
        if (i10 == 2) {
            return CONNECTED;
        }
        if (i10 == 3) {
            return DISCONNECTING;
        }
        if (i10 == 4) {
            return DISCONNECTED;
        }
        if (i10 != 5) {
            return null;
        }
        return SUSPENDED;
    }

    public final int a() {
        return this.f8362m;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f8362m);
    }
}
