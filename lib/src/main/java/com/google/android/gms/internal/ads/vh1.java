package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class vh1 {

    /* renamed from: e, reason: collision with root package name */
    public static final vh1 f16691e = new vh1(0, 0, 0, 1.0f);

    /* renamed from: f, reason: collision with root package name */
    private static final String f16692f = Integer.toString(0, 36);

    /* renamed from: g, reason: collision with root package name */
    private static final String f16693g = Integer.toString(1, 36);

    /* renamed from: h, reason: collision with root package name */
    private static final String f16694h = Integer.toString(2, 36);

    /* renamed from: i, reason: collision with root package name */
    private static final String f16695i = Integer.toString(3, 36);

    /* renamed from: j, reason: collision with root package name */
    public static final xa4 f16696j = new xa4() { // from class: com.google.android.gms.internal.ads.ug1
    };

    /* renamed from: a, reason: collision with root package name */
    public final int f16697a;

    /* renamed from: b, reason: collision with root package name */
    public final int f16698b;

    /* renamed from: c, reason: collision with root package name */
    public final int f16699c;

    /* renamed from: d, reason: collision with root package name */
    public final float f16700d;

    public vh1(int i10, int i11, int i12, float f5) {
        this.f16697a = i10;
        this.f16698b = i11;
        this.f16699c = i12;
        this.f16700d = f5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof vh1) {
            vh1 vh1Var = (vh1) obj;
            if (this.f16697a == vh1Var.f16697a && this.f16698b == vh1Var.f16698b && this.f16699c == vh1Var.f16699c && this.f16700d == vh1Var.f16700d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.f16697a + 217) * 31) + this.f16698b) * 31) + this.f16699c) * 31) + Float.floatToRawIntBits(this.f16700d);
    }
}
