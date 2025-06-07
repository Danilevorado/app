package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class tk4 {

    /* renamed from: a, reason: collision with root package name */
    private final String[] f15884a;

    /* renamed from: b, reason: collision with root package name */
    private final int[] f15885b;

    /* renamed from: c, reason: collision with root package name */
    private final fj4[] f15886c;

    /* renamed from: d, reason: collision with root package name */
    private final int[] f15887d;

    /* renamed from: e, reason: collision with root package name */
    private final int[][][] f15888e;

    /* renamed from: f, reason: collision with root package name */
    private final fj4 f15889f;

    tk4(String[] strArr, int[] iArr, fj4[] fj4VarArr, int[] iArr2, int[][][] iArr3, fj4 fj4Var) {
        this.f15884a = strArr;
        this.f15885b = iArr;
        this.f15886c = fj4VarArr;
        this.f15888e = iArr3;
        this.f15887d = iArr2;
        this.f15889f = fj4Var;
    }

    public final int a(int i10, int i11, boolean z10) {
        int i12 = this.f15886c[i10].b(i11).f10281a;
        int[] iArr = new int[1];
        int i13 = 0;
        int i14 = 0;
        for (int i15 = 0; i15 <= 0; i15++) {
            if ((this.f15888e[i10][i11][i15] & 7) == 4) {
                iArr[i14] = i15;
                i14++;
            }
        }
        int[] iArrCopyOf = Arrays.copyOf(iArr, i14);
        String str = null;
        int iMin = 16;
        boolean z11 = false;
        int i16 = 0;
        while (i13 < iArrCopyOf.length) {
            String str2 = this.f15886c[i10].b(i11).b(iArrCopyOf[i13]).f10898l;
            int i17 = i16 + 1;
            if (i16 == 0) {
                str = str2;
            } else {
                z11 |= !sv2.b(str, str2);
            }
            iMin = Math.min(iMin, this.f15888e[i10][i11][i13] & 24);
            i13++;
            i16 = i17;
        }
        return z11 ? Math.min(iMin, this.f15887d[i10]) : iMin;
    }

    public final int b(int i10, int i11, int i12) {
        return this.f15888e[i10][i11][i12];
    }

    public final int c(int i10) {
        return this.f15885b[i10];
    }

    public final fj4 d(int i10) {
        return this.f15886c[i10];
    }

    public final fj4 e() {
        return this.f15889f;
    }
}
