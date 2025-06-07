package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class fu {

    /* renamed from: f, reason: collision with root package name */
    public static final fu f8418f = new fu(new ds());

    /* renamed from: g, reason: collision with root package name */
    private static final String f8419g = Integer.toString(0, 36);

    /* renamed from: h, reason: collision with root package name */
    private static final String f8420h = Integer.toString(1, 36);

    /* renamed from: i, reason: collision with root package name */
    private static final String f8421i = Integer.toString(2, 36);

    /* renamed from: j, reason: collision with root package name */
    private static final String f8422j = Integer.toString(3, 36);

    /* renamed from: k, reason: collision with root package name */
    private static final String f8423k = Integer.toString(4, 36);

    /* renamed from: l, reason: collision with root package name */
    public static final xa4 f8424l = new xa4() { // from class: com.google.android.gms.internal.ads.cr
    };

    /* renamed from: a, reason: collision with root package name */
    public final long f8425a;

    /* renamed from: b, reason: collision with root package name */
    public final long f8426b;

    /* renamed from: c, reason: collision with root package name */
    public final long f8427c;

    /* renamed from: d, reason: collision with root package name */
    public final float f8428d;

    /* renamed from: e, reason: collision with root package name */
    public final float f8429e;

    private fu(ds dsVar) {
        this.f8425a = -9223372036854775807L;
        this.f8426b = -9223372036854775807L;
        this.f8427c = -9223372036854775807L;
        this.f8428d = -3.4028235E38f;
        this.f8429e = -3.4028235E38f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fu)) {
            return false;
        }
        long j10 = ((fu) obj).f8425a;
        return true;
    }

    public final int hashCode() {
        int i10 = (int) (-9223372034707292159L);
        return (((((((i10 * 31) + i10) * 31) + i10) * 31) + Float.floatToIntBits(-3.4028235E38f)) * 31) + Float.floatToIntBits(-3.4028235E38f);
    }
}
