package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class j31 {

    /* renamed from: f, reason: collision with root package name */
    private static final String f10278f = Integer.toString(0, 36);

    /* renamed from: g, reason: collision with root package name */
    private static final String f10279g = Integer.toString(1, 36);

    /* renamed from: h, reason: collision with root package name */
    public static final xa4 f10280h = new xa4() { // from class: com.google.android.gms.internal.ads.i21
    };

    /* renamed from: a, reason: collision with root package name */
    public final int f10281a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final String f10282b;

    /* renamed from: c, reason: collision with root package name */
    public final int f10283c;

    /* renamed from: d, reason: collision with root package name */
    private final k9[] f10284d;

    /* renamed from: e, reason: collision with root package name */
    private int f10285e;

    public j31(String str, k9... k9VarArr) {
        this.f10282b = str;
        this.f10284d = k9VarArr;
        int iB = ng0.b(k9VarArr[0].f10898l);
        this.f10283c = iB == -1 ? ng0.b(k9VarArr[0].f10897k) : iB;
        d(k9VarArr[0].f10889c);
        int i10 = k9VarArr[0].f10891e;
    }

    private static String d(String str) {
        return (str == null || str.equals("und")) ? "" : str;
    }

    public final int a(k9 k9Var) {
        for (int i10 = 0; i10 <= 0; i10++) {
            if (k9Var == this.f10284d[i10]) {
                return i10;
            }
        }
        return -1;
    }

    public final k9 b(int i10) {
        return this.f10284d[i10];
    }

    public final j31 c(String str) {
        return new j31(str, this.f10284d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && j31.class == obj.getClass()) {
            j31 j31Var = (j31) obj;
            if (this.f10282b.equals(j31Var.f10282b) && Arrays.equals(this.f10284d, j31Var.f10284d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.f10285e;
        if (i10 != 0) {
            return i10;
        }
        int iHashCode = ((this.f10282b.hashCode() + 527) * 31) + Arrays.hashCode(this.f10284d);
        this.f10285e = iHashCode;
        return iHashCode;
    }
}
