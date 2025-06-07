package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class bg4 {

    /* renamed from: f, reason: collision with root package name */
    public static final bg4 f6475f = new bg4(1, 2, 3, null);

    /* renamed from: g, reason: collision with root package name */
    private static final String f6476g = Integer.toString(0, 36);

    /* renamed from: h, reason: collision with root package name */
    private static final String f6477h = Integer.toString(1, 36);

    /* renamed from: i, reason: collision with root package name */
    private static final String f6478i = Integer.toString(2, 36);

    /* renamed from: j, reason: collision with root package name */
    private static final String f6479j = Integer.toString(3, 36);

    /* renamed from: k, reason: collision with root package name */
    public static final xa4 f6480k = new xa4() { // from class: com.google.android.gms.internal.ads.zc4
    };

    /* renamed from: a, reason: collision with root package name */
    public final int f6481a;

    /* renamed from: b, reason: collision with root package name */
    public final int f6482b;

    /* renamed from: c, reason: collision with root package name */
    public final int f6483c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f6484d;

    /* renamed from: e, reason: collision with root package name */
    private int f6485e;

    public bg4(int i10, int i11, int i12, byte[] bArr) {
        this.f6481a = i10;
        this.f6482b = i11;
        this.f6483c = i12;
        this.f6484d = bArr;
    }

    public static int a(int i10) {
        if (i10 == 1) {
            return 1;
        }
        if (i10 != 9) {
            return (i10 == 4 || i10 == 5 || i10 == 6 || i10 == 7) ? 2 : -1;
        }
        return 6;
    }

    public static int b(int i10) {
        if (i10 == 1) {
            return 3;
        }
        if (i10 == 16) {
            return 6;
        }
        if (i10 != 18) {
            return (i10 == 6 || i10 == 7) ? 3 : -1;
        }
        return 7;
    }

    public final af4 c() {
        return new af4(this, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && bg4.class == obj.getClass()) {
            bg4 bg4Var = (bg4) obj;
            if (this.f6481a == bg4Var.f6481a && this.f6482b == bg4Var.f6482b && this.f6483c == bg4Var.f6483c && Arrays.equals(this.f6484d, bg4Var.f6484d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.f6485e;
        if (i10 != 0) {
            return i10;
        }
        int iHashCode = ((((((this.f6481a + 527) * 31) + this.f6482b) * 31) + this.f6483c) * 31) + Arrays.hashCode(this.f6484d);
        this.f6485e = iHashCode;
        return iHashCode;
    }

    public final String toString() {
        int i10 = this.f6481a;
        String str = i10 != -1 ? i10 != 6 ? i10 != 1 ? i10 != 2 ? "Undefined color space" : "BT601" : "BT709" : "BT2020" : "Unset color space";
        int i11 = this.f6482b;
        String str2 = i11 != -1 ? i11 != 1 ? i11 != 2 ? "Undefined color range" : "Limited range" : "Full range" : "Unset color range";
        int i12 = this.f6483c;
        return "ColorInfo(" + str + ", " + str2 + ", " + (i12 != -1 ? i12 != 1 ? i12 != 3 ? i12 != 6 ? i12 != 7 ? "Undefined color transfer" : "HLG" : "ST2084 PQ" : "SDR SMPTE 170M" : "Linear" : "Unset color transfer") + ", " + (this.f6484d != null) + ")";
    }
}
