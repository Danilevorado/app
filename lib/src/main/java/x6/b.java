package x6;

import java.util.ArrayList;
import java.util.List;
import r6.h;
import r6.n;

/* loaded from: classes.dex */
final class b {

    /* renamed from: a, reason: collision with root package name */
    private final s6.a f28346a;

    /* renamed from: c, reason: collision with root package name */
    private final int f28348c;

    /* renamed from: d, reason: collision with root package name */
    private final int f28349d;

    /* renamed from: e, reason: collision with root package name */
    private final int f28350e;

    /* renamed from: f, reason: collision with root package name */
    private final int f28351f;

    /* renamed from: g, reason: collision with root package name */
    private final float f28352g;

    /* renamed from: i, reason: collision with root package name */
    private final n f28354i;

    /* renamed from: b, reason: collision with root package name */
    private final List f28347b = new ArrayList(5);

    /* renamed from: h, reason: collision with root package name */
    private final int[] f28353h = new int[3];

    b(s6.a aVar, int i10, int i11, int i12, int i13, float f5, n nVar) {
        this.f28346a = aVar;
        this.f28348c = i10;
        this.f28349d = i11;
        this.f28350e = i12;
        this.f28351f = i13;
        this.f28352g = f5;
        this.f28354i = nVar;
    }

    private static float a(int[] iArr, int i10) {
        return (i10 - iArr[2]) - (iArr[1] / 2.0f);
    }

    private float b(int i10, int i11, int i12, int i13) {
        s6.a aVar = this.f28346a;
        int iG = aVar.g();
        int[] iArr = this.f28353h;
        iArr[0] = 0;
        iArr[1] = 0;
        iArr[2] = 0;
        int i14 = i10;
        while (i14 >= 0 && aVar.d(i11, i14) && iArr[1] <= i12) {
            iArr[1] = iArr[1] + 1;
            i14--;
        }
        if (i14 >= 0 && iArr[1] <= i12) {
            while (i14 >= 0 && !aVar.d(i11, i14) && iArr[0] <= i12) {
                iArr[0] = iArr[0] + 1;
                i14--;
            }
            if (iArr[0] > i12) {
                return Float.NaN;
            }
            int i15 = i10 + 1;
            while (i15 < iG && aVar.d(i11, i15) && iArr[1] <= i12) {
                iArr[1] = iArr[1] + 1;
                i15++;
            }
            if (i15 != iG && iArr[1] <= i12) {
                while (i15 < iG && !aVar.d(i11, i15) && iArr[2] <= i12) {
                    iArr[2] = iArr[2] + 1;
                    i15++;
                }
                if (iArr[2] <= i12 && Math.abs(((iArr[0] + iArr[1]) + iArr[2]) - i13) * 5 < i13 * 2 && d(iArr)) {
                    return a(iArr, i15);
                }
            }
        }
        return Float.NaN;
    }

    private boolean d(int[] iArr) {
        float f5 = this.f28352g;
        float f10 = f5 / 2.0f;
        for (int i10 = 0; i10 < 3; i10++) {
            if (Math.abs(f5 - iArr[i10]) >= f10) {
                return false;
            }
        }
        return true;
    }

    private a e(int[] iArr, int i10, int i11) {
        int i12 = iArr[0] + iArr[1] + iArr[2];
        float fA = a(iArr, i11);
        float fB = b(i10, (int) fA, iArr[1] * 2, i12);
        if (Float.isNaN(fB)) {
            return null;
        }
        float f5 = ((iArr[0] + iArr[1]) + iArr[2]) / 3.0f;
        for (a aVar : this.f28347b) {
            if (aVar.f(f5, fB, fA)) {
                return aVar.g(fB, fA, f5);
            }
        }
        a aVar2 = new a(fA, fB, f5);
        this.f28347b.add(aVar2);
        n nVar = this.f28354i;
        if (nVar == null) {
            return null;
        }
        nVar.a(aVar2);
        return null;
    }

    a c() throws h {
        a aVarE;
        a aVarE2;
        int i10 = this.f28348c;
        int i11 = this.f28351f;
        int i12 = this.f28350e + i10;
        int i13 = this.f28349d + (i11 / 2);
        int[] iArr = new int[3];
        for (int i14 = 0; i14 < i11; i14++) {
            int i15 = ((i14 & 1) == 0 ? (i14 + 1) / 2 : -((i14 + 1) / 2)) + i13;
            iArr[0] = 0;
            iArr[1] = 0;
            iArr[2] = 0;
            int i16 = i10;
            while (i16 < i12 && !this.f28346a.d(i16, i15)) {
                i16++;
            }
            int i17 = 0;
            while (i16 < i12) {
                if (!this.f28346a.d(i16, i15)) {
                    if (i17 == 1) {
                        i17++;
                    }
                    iArr[i17] = iArr[i17] + 1;
                } else if (i17 == 1) {
                    iArr[1] = iArr[1] + 1;
                } else if (i17 != 2) {
                    i17++;
                    iArr[i17] = iArr[i17] + 1;
                } else {
                    if (d(iArr) && (aVarE2 = e(iArr, i15, i16)) != null) {
                        return aVarE2;
                    }
                    iArr[0] = iArr[2];
                    iArr[1] = 1;
                    iArr[2] = 0;
                    i17 = 1;
                }
                i16++;
            }
            if (d(iArr) && (aVarE = e(iArr, i15, i12)) != null) {
                return aVarE;
            }
        }
        if (this.f28347b.isEmpty()) {
            throw h.a();
        }
        return (a) this.f28347b.get(0);
    }
}
