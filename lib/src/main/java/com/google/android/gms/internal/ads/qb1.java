package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class qb1 {

    /* renamed from: e, reason: collision with root package name */
    private static final String f14212e = Integer.toString(0, 36);

    /* renamed from: f, reason: collision with root package name */
    private static final String f14213f = Integer.toString(1, 36);

    /* renamed from: g, reason: collision with root package name */
    private static final String f14214g = Integer.toString(3, 36);

    /* renamed from: h, reason: collision with root package name */
    private static final String f14215h = Integer.toString(4, 36);

    /* renamed from: i, reason: collision with root package name */
    public static final xa4 f14216i = new xa4() { // from class: com.google.android.gms.internal.ads.pa1
    };

    /* renamed from: a, reason: collision with root package name */
    public final int f14217a;

    /* renamed from: b, reason: collision with root package name */
    private final j31 f14218b;

    /* renamed from: c, reason: collision with root package name */
    private final int[] f14219c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean[] f14220d;

    public qb1(j31 j31Var, boolean z10, int[] iArr, boolean[] zArr) {
        int i10 = j31Var.f10281a;
        this.f14217a = 1;
        this.f14218b = j31Var;
        this.f14219c = (int[]) iArr.clone();
        this.f14220d = (boolean[]) zArr.clone();
    }

    public final int a() {
        return this.f14218b.f10283c;
    }

    public final k9 b(int i10) {
        return this.f14218b.b(i10);
    }

    public final boolean c() {
        for (boolean z10 : this.f14220d) {
            if (z10) {
                return true;
            }
        }
        return false;
    }

    public final boolean d(int i10) {
        return this.f14220d[i10];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && qb1.class == obj.getClass()) {
            qb1 qb1Var = (qb1) obj;
            if (this.f14218b.equals(qb1Var.f14218b) && Arrays.equals(this.f14219c, qb1Var.f14219c) && Arrays.equals(this.f14220d, qb1Var.f14220d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.f14218b.hashCode() * 961) + Arrays.hashCode(this.f14219c)) * 31) + Arrays.hashCode(this.f14220d);
    }
}
