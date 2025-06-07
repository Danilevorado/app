package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public abstract class k83 extends l83 {
    public static int a(long j10) {
        int i10 = (int) j10;
        if (i10 == j10) {
            return i10;
        }
        throw new IllegalArgumentException(y33.b("Out of range: %s", Long.valueOf(j10)));
    }

    public static int b(int i10, int i11, int i12) {
        return Math.min(Math.max(i10, i11), 1073741823);
    }

    public static int c(long j10) {
        if (j10 > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j10 < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j10;
    }
}
