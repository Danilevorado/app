package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class lf0 {

    /* renamed from: h, reason: collision with root package name */
    private static final String f11549h = Integer.toString(0, 36);

    /* renamed from: i, reason: collision with root package name */
    private static final String f11550i = Integer.toString(1, 36);

    /* renamed from: j, reason: collision with root package name */
    private static final String f11551j = Integer.toString(2, 36);

    /* renamed from: k, reason: collision with root package name */
    private static final String f11552k = Integer.toString(3, 36);

    /* renamed from: l, reason: collision with root package name */
    private static final String f11553l = Integer.toString(4, 36);

    /* renamed from: m, reason: collision with root package name */
    private static final String f11554m = Integer.toString(5, 36);

    /* renamed from: n, reason: collision with root package name */
    private static final String f11555n = Integer.toString(6, 36);

    /* renamed from: o, reason: collision with root package name */
    private static final String f11556o = Integer.toString(7, 36);

    /* renamed from: p, reason: collision with root package name */
    public static final xa4 f11557p = new xa4() { // from class: com.google.android.gms.internal.ads.aq
    };

    /* renamed from: a, reason: collision with root package name */
    public final long f11558a;

    /* renamed from: b, reason: collision with root package name */
    public final int f11559b;

    /* renamed from: c, reason: collision with root package name */
    public final Uri[] f11560c;

    /* renamed from: d, reason: collision with root package name */
    public final int[] f11561d;

    /* renamed from: e, reason: collision with root package name */
    public final long[] f11562e;

    /* renamed from: f, reason: collision with root package name */
    public final long f11563f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f11564g;

    public lf0(long j10) {
        this(0L, -1, -1, new int[0], new Uri[0], new long[0], 0L, false);
    }

    private lf0(long j10, int i10, int i11, int[] iArr, Uri[] uriArr, long[] jArr, long j11, boolean z10) {
        gt1.d(iArr.length == uriArr.length);
        this.f11558a = 0L;
        this.f11559b = i10;
        this.f11561d = iArr;
        this.f11560c = uriArr;
        this.f11562e = jArr;
        this.f11563f = 0L;
        this.f11564g = false;
    }

    public final int a(int i10) {
        int i11;
        int i12 = i10 + 1;
        while (true) {
            int[] iArr = this.f11561d;
            if (i12 >= iArr.length || (i11 = iArr[i12]) == 0 || i11 == 1) {
                break;
            }
            i12++;
        }
        return i12;
    }

    public final lf0 b(int i10) {
        int[] iArr = this.f11561d;
        int length = iArr.length;
        int iMax = Math.max(0, length);
        int[] iArrCopyOf = Arrays.copyOf(iArr, iMax);
        Arrays.fill(iArrCopyOf, length, iMax, 0);
        long[] jArr = this.f11562e;
        int length2 = jArr.length;
        int iMax2 = Math.max(0, length2);
        long[] jArrCopyOf = Arrays.copyOf(jArr, iMax2);
        Arrays.fill(jArrCopyOf, length2, iMax2, -9223372036854775807L);
        return new lf0(0L, 0, -1, iArrCopyOf, (Uri[]) Arrays.copyOf(this.f11560c, 0), jArrCopyOf, 0L, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && lf0.class == obj.getClass()) {
            lf0 lf0Var = (lf0) obj;
            if (this.f11559b == lf0Var.f11559b && Arrays.equals(this.f11560c, lf0Var.f11560c) && Arrays.equals(this.f11561d, lf0Var.f11561d) && Arrays.equals(this.f11562e, lf0Var.f11562e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.f11559b * 31) - 1) * 961) + Arrays.hashCode(this.f11560c)) * 31) + Arrays.hashCode(this.f11561d)) * 31) + Arrays.hashCode(this.f11562e)) * 961;
    }
}
