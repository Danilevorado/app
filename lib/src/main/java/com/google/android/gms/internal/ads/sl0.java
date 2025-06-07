package com.google.android.gms.internal.ads;

import java.util.Locale;

/* loaded from: classes.dex */
public final class sl0 {

    /* renamed from: d, reason: collision with root package name */
    public static final sl0 f15309d = new sl0(1.0f, 1.0f);

    /* renamed from: e, reason: collision with root package name */
    private static final String f15310e = Integer.toString(0, 36);

    /* renamed from: f, reason: collision with root package name */
    private static final String f15311f = Integer.toString(1, 36);

    /* renamed from: g, reason: collision with root package name */
    public static final xa4 f15312g = new xa4() { // from class: com.google.android.gms.internal.ads.rk0
    };

    /* renamed from: a, reason: collision with root package name */
    public final float f15313a;

    /* renamed from: b, reason: collision with root package name */
    public final float f15314b;

    /* renamed from: c, reason: collision with root package name */
    private final int f15315c;

    public sl0(float f5, float f10) {
        gt1.d(f5 > 0.0f);
        gt1.d(f10 > 0.0f);
        this.f15313a = f5;
        this.f15314b = f10;
        this.f15315c = Math.round(f5 * 1000.0f);
    }

    public final long a(long j10) {
        return j10 * this.f15315c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && sl0.class == obj.getClass()) {
            sl0 sl0Var = (sl0) obj;
            if (this.f15313a == sl0Var.f15313a && this.f15314b == sl0Var.f15314b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Float.floatToRawIntBits(this.f15313a) + 527) * 31) + Float.floatToRawIntBits(this.f15314b);
    }

    public final String toString() {
        return String.format(Locale.US, "PlaybackParameters(speed=%.2f, pitch=%.2f)", Float.valueOf(this.f15313a), Float.valueOf(this.f15314b));
    }
}
