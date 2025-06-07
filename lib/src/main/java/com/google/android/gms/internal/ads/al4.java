package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class al4 {

    /* renamed from: d, reason: collision with root package name */
    public static final al4 f6143d = new al4(0, 0, 0);

    /* renamed from: e, reason: collision with root package name */
    private static final String f6144e = Integer.toString(0, 36);

    /* renamed from: f, reason: collision with root package name */
    private static final String f6145f = Integer.toString(1, 36);

    /* renamed from: g, reason: collision with root package name */
    private static final String f6146g = Integer.toString(2, 36);

    /* renamed from: h, reason: collision with root package name */
    public static final xa4 f6147h = new xa4() { // from class: com.google.android.gms.internal.ads.ak4
    };

    /* renamed from: a, reason: collision with root package name */
    public final int f6148a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final int f6149b;

    /* renamed from: c, reason: collision with root package name */
    public final int f6150c;

    public al4(int i10, int i11, int i12) {
        this.f6149b = i11;
        this.f6150c = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof al4)) {
            return false;
        }
        al4 al4Var = (al4) obj;
        int i10 = al4Var.f6148a;
        return this.f6149b == al4Var.f6149b && this.f6150c == al4Var.f6150c;
    }

    public final int hashCode() {
        return ((this.f6149b + 16337) * 31) + this.f6150c;
    }
}
