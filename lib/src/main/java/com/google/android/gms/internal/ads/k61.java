package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class k61 {

    /* renamed from: d, reason: collision with root package name */
    public static final k61 f10845d = new k61(null, new lf0[0], 0, -9223372036854775807L, 0);

    /* renamed from: e, reason: collision with root package name */
    private static final lf0 f10846e = new lf0(0).b(0);

    /* renamed from: f, reason: collision with root package name */
    private static final String f10847f = Integer.toString(1, 36);

    /* renamed from: g, reason: collision with root package name */
    private static final String f10848g = Integer.toString(2, 36);

    /* renamed from: h, reason: collision with root package name */
    private static final String f10849h = Integer.toString(3, 36);

    /* renamed from: i, reason: collision with root package name */
    private static final String f10850i = Integer.toString(4, 36);

    /* renamed from: j, reason: collision with root package name */
    public static final xa4 f10851j = new xa4() { // from class: com.google.android.gms.internal.ads.a
    };

    /* renamed from: c, reason: collision with root package name */
    private final lf0[] f10854c;

    /* renamed from: b, reason: collision with root package name */
    public final long f10853b = 0;

    /* renamed from: a, reason: collision with root package name */
    public final int f10852a = 0;

    private k61(Object obj, lf0[] lf0VarArr, long j10, long j11, int i10) {
        this.f10854c = lf0VarArr;
    }

    public final lf0 a(int i10) {
        return i10 < 0 ? f10846e : this.f10854c[i10];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && k61.class == obj.getClass()) {
            k61 k61Var = (k61) obj;
            if (sv2.b(null, null) && Arrays.equals(this.f10854c, k61Var.f10854c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) (-9223372036854775807L)) * 961) + Arrays.hashCode(this.f10854c);
    }

    public final String toString() {
        return "AdPlaybackState(adsId=" + ((Object) null) + ", adResumePositionUs=0, adGroups=[])";
    }
}
