package x6;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import r6.h;
import r6.m;
import r6.n;

/* loaded from: classes.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private final s6.a f28359a;

    /* renamed from: c, reason: collision with root package name */
    private boolean f28361c;

    /* renamed from: e, reason: collision with root package name */
    private final n f28363e;

    /* renamed from: b, reason: collision with root package name */
    private final List f28360b = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    private final int[] f28362d = new int[5];

    private static final class b implements Serializable, Comparator {

        /* renamed from: m, reason: collision with root package name */
        private final float f28364m;

        private b(float f5) {
            this.f28364m = f5;
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(d dVar, d dVar2) {
            if (dVar2.h() != dVar.h()) {
                return dVar2.h() - dVar.h();
            }
            float fAbs = Math.abs(dVar2.i() - this.f28364m);
            float fAbs2 = Math.abs(dVar.i() - this.f28364m);
            if (fAbs < fAbs2) {
                return 1;
            }
            return fAbs == fAbs2 ? 0 : -1;
        }
    }

    private static final class c implements Serializable, Comparator {

        /* renamed from: m, reason: collision with root package name */
        private final float f28365m;

        private c(float f5) {
            this.f28365m = f5;
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(d dVar, d dVar2) {
            float fAbs = Math.abs(dVar2.i() - this.f28365m);
            float fAbs2 = Math.abs(dVar.i() - this.f28365m);
            if (fAbs < fAbs2) {
                return -1;
            }
            return fAbs == fAbs2 ? 0 : 1;
        }
    }

    public e(s6.a aVar, n nVar) {
        this.f28359a = aVar;
        this.f28363e = nVar;
    }

    private static float a(int[] iArr, int i10) {
        return ((i10 - iArr[4]) - iArr[3]) - (iArr[2] / 2.0f);
    }

    private boolean b(int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int[] iArrH = h();
        int i19 = 0;
        while (i10 >= i19 && i11 >= i19 && this.f28359a.d(i11 - i19, i10 - i19)) {
            iArrH[2] = iArrH[2] + 1;
            i19++;
        }
        if (i10 >= i19 && i11 >= i19) {
            while (i10 >= i19 && i11 >= i19 && !this.f28359a.d(i11 - i19, i10 - i19) && iArrH[1] <= i12) {
                iArrH[1] = iArrH[1] + 1;
                i19++;
            }
            if (i10 >= i19 && i11 >= i19 && iArrH[1] <= i12) {
                while (i10 >= i19 && i11 >= i19 && this.f28359a.d(i11 - i19, i10 - i19) && iArrH[0] <= i12) {
                    iArrH[0] = iArrH[0] + 1;
                    i19++;
                }
                if (iArrH[0] > i12) {
                    return false;
                }
                int iG = this.f28359a.g();
                int iJ = this.f28359a.j();
                int i20 = 1;
                while (true) {
                    i14 = i10 + i20;
                    if (i14 >= iG || (i18 = i11 + i20) >= iJ || !this.f28359a.d(i18, i14)) {
                        break;
                    }
                    iArrH[2] = iArrH[2] + 1;
                    i20++;
                }
                if (i14 < iG && i11 + i20 < iJ) {
                    while (true) {
                        i15 = i10 + i20;
                        if (i15 >= iG || (i17 = i11 + i20) >= iJ || this.f28359a.d(i17, i15) || iArrH[3] >= i12) {
                            break;
                        }
                        iArrH[3] = iArrH[3] + 1;
                        i20++;
                    }
                    if (i15 < iG && i11 + i20 < iJ && iArrH[3] < i12) {
                        while (true) {
                            int i21 = i10 + i20;
                            if (i21 >= iG || (i16 = i11 + i20) >= iJ || !this.f28359a.d(i16, i21) || iArrH[4] >= i12) {
                                break;
                            }
                            iArrH[4] = iArrH[4] + 1;
                            i20++;
                        }
                        if (iArrH[4] < i12 && Math.abs(((((iArrH[0] + iArrH[1]) + iArrH[2]) + iArrH[3]) + iArrH[4]) - i13) < i13 * 2 && g(iArrH)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    private float c(int i10, int i11, int i12, int i13) {
        s6.a aVar = this.f28359a;
        int iJ = aVar.j();
        int[] iArrH = h();
        int i14 = i10;
        while (i14 >= 0 && aVar.d(i14, i11)) {
            iArrH[2] = iArrH[2] + 1;
            i14--;
        }
        if (i14 < 0) {
            return Float.NaN;
        }
        while (i14 >= 0 && !aVar.d(i14, i11) && iArrH[1] <= i12) {
            iArrH[1] = iArrH[1] + 1;
            i14--;
        }
        if (i14 >= 0 && iArrH[1] <= i12) {
            while (i14 >= 0 && aVar.d(i14, i11) && iArrH[0] <= i12) {
                iArrH[0] = iArrH[0] + 1;
                i14--;
            }
            if (iArrH[0] > i12) {
                return Float.NaN;
            }
            int i15 = i10 + 1;
            while (i15 < iJ && aVar.d(i15, i11)) {
                iArrH[2] = iArrH[2] + 1;
                i15++;
            }
            if (i15 == iJ) {
                return Float.NaN;
            }
            while (i15 < iJ && !aVar.d(i15, i11) && iArrH[3] < i12) {
                iArrH[3] = iArrH[3] + 1;
                i15++;
            }
            if (i15 != iJ && iArrH[3] < i12) {
                while (i15 < iJ && aVar.d(i15, i11) && iArrH[4] < i12) {
                    iArrH[4] = iArrH[4] + 1;
                    i15++;
                }
                if (iArrH[4] < i12 && Math.abs(((((iArrH[0] + iArrH[1]) + iArrH[2]) + iArrH[3]) + iArrH[4]) - i13) * 5 < i13 && g(iArrH)) {
                    return a(iArrH, i15);
                }
            }
        }
        return Float.NaN;
    }

    private float d(int i10, int i11, int i12, int i13) {
        s6.a aVar = this.f28359a;
        int iG = aVar.g();
        int[] iArrH = h();
        int i14 = i10;
        while (i14 >= 0 && aVar.d(i11, i14)) {
            iArrH[2] = iArrH[2] + 1;
            i14--;
        }
        if (i14 < 0) {
            return Float.NaN;
        }
        while (i14 >= 0 && !aVar.d(i11, i14) && iArrH[1] <= i12) {
            iArrH[1] = iArrH[1] + 1;
            i14--;
        }
        if (i14 >= 0 && iArrH[1] <= i12) {
            while (i14 >= 0 && aVar.d(i11, i14) && iArrH[0] <= i12) {
                iArrH[0] = iArrH[0] + 1;
                i14--;
            }
            if (iArrH[0] > i12) {
                return Float.NaN;
            }
            int i15 = i10 + 1;
            while (i15 < iG && aVar.d(i11, i15)) {
                iArrH[2] = iArrH[2] + 1;
                i15++;
            }
            if (i15 == iG) {
                return Float.NaN;
            }
            while (i15 < iG && !aVar.d(i11, i15) && iArrH[3] < i12) {
                iArrH[3] = iArrH[3] + 1;
                i15++;
            }
            if (i15 != iG && iArrH[3] < i12) {
                while (i15 < iG && aVar.d(i11, i15) && iArrH[4] < i12) {
                    iArrH[4] = iArrH[4] + 1;
                    i15++;
                }
                if (iArrH[4] < i12 && Math.abs(((((iArrH[0] + iArrH[1]) + iArrH[2]) + iArrH[3]) + iArrH[4]) - i13) * 5 < i13 * 2 && g(iArrH)) {
                    return a(iArrH, i15);
                }
            }
        }
        return Float.NaN;
    }

    private int f() {
        if (this.f28360b.size() <= 1) {
            return 0;
        }
        d dVar = null;
        for (d dVar2 : this.f28360b) {
            if (dVar2.h() >= 2) {
                if (dVar != null) {
                    this.f28361c = true;
                    return ((int) (Math.abs(dVar.c() - dVar2.c()) - Math.abs(dVar.d() - dVar2.d()))) / 2;
                }
                dVar = dVar2;
            }
        }
        return 0;
    }

    protected static boolean g(int[] iArr) {
        int i10 = 0;
        for (int i11 = 0; i11 < 5; i11++) {
            int i12 = iArr[i11];
            if (i12 == 0) {
                return false;
            }
            i10 += i12;
        }
        if (i10 < 7) {
            return false;
        }
        float f5 = i10 / 7.0f;
        float f10 = f5 / 2.0f;
        return Math.abs(f5 - ((float) iArr[0])) < f10 && Math.abs(f5 - ((float) iArr[1])) < f10 && Math.abs((f5 * 3.0f) - ((float) iArr[2])) < 3.0f * f10 && Math.abs(f5 - ((float) iArr[3])) < f10 && Math.abs(f5 - ((float) iArr[4])) < f10;
    }

    private int[] h() {
        int[] iArr = this.f28362d;
        iArr[0] = 0;
        iArr[1] = 0;
        iArr[2] = 0;
        iArr[3] = 0;
        iArr[4] = 0;
        return iArr;
    }

    private boolean j() {
        int size = this.f28360b.size();
        float fAbs = 0.0f;
        float fI = 0.0f;
        int i10 = 0;
        for (d dVar : this.f28360b) {
            if (dVar.h() >= 2) {
                i10++;
                fI += dVar.i();
            }
        }
        if (i10 < 3) {
            return false;
        }
        float f5 = fI / size;
        Iterator it = this.f28360b.iterator();
        while (it.hasNext()) {
            fAbs += Math.abs(((d) it.next()).i() - f5);
        }
        return fAbs <= fI * 0.05f;
    }

    private d[] k() throws h {
        int size = this.f28360b.size();
        if (size < 3) {
            throw h.a();
        }
        float fI = 0.0f;
        if (size > 3) {
            Iterator it = this.f28360b.iterator();
            float f5 = 0.0f;
            float f10 = 0.0f;
            while (it.hasNext()) {
                float fI2 = ((d) it.next()).i();
                f5 += fI2;
                f10 += fI2 * fI2;
            }
            float f11 = f5 / size;
            float fSqrt = (float) Math.sqrt((f10 / r0) - (f11 * f11));
            Collections.sort(this.f28360b, new c(f11));
            float fMax = Math.max(0.2f * f11, fSqrt);
            int i10 = 0;
            while (i10 < this.f28360b.size() && this.f28360b.size() > 3) {
                if (Math.abs(((d) this.f28360b.get(i10)).i() - f11) > fMax) {
                    this.f28360b.remove(i10);
                    i10--;
                }
                i10++;
            }
        }
        if (this.f28360b.size() > 3) {
            Iterator it2 = this.f28360b.iterator();
            while (it2.hasNext()) {
                fI += ((d) it2.next()).i();
            }
            Collections.sort(this.f28360b, new b(fI / this.f28360b.size()));
            List list = this.f28360b;
            list.subList(3, list.size()).clear();
        }
        return new d[]{(d) this.f28360b.get(0), (d) this.f28360b.get(1), (d) this.f28360b.get(2)};
    }

    final f e(Map map) throws h {
        boolean z10 = map != null && map.containsKey(r6.e.TRY_HARDER);
        boolean z11 = map != null && map.containsKey(r6.e.PURE_BARCODE);
        int iG = this.f28359a.g();
        int iJ = this.f28359a.j();
        int i10 = (iG * 3) / 228;
        if (i10 < 3 || z10) {
            i10 = 3;
        }
        int[] iArr = new int[5];
        int i11 = i10 - 1;
        boolean zJ = false;
        while (i11 < iG && !zJ) {
            iArr[0] = 0;
            iArr[1] = 0;
            iArr[2] = 0;
            iArr[3] = 0;
            iArr[4] = 0;
            int i12 = 0;
            int i13 = 0;
            while (i12 < iJ) {
                if (this.f28359a.d(i12, i11)) {
                    if ((i13 & 1) == 1) {
                        i13++;
                    }
                    iArr[i13] = iArr[i13] + 1;
                } else if ((i13 & 1) != 0) {
                    iArr[i13] = iArr[i13] + 1;
                } else if (i13 != 4) {
                    i13++;
                    iArr[i13] = iArr[i13] + 1;
                } else if (g(iArr) && i(iArr, i11, i12, z11)) {
                    if (this.f28361c) {
                        zJ = j();
                    } else {
                        int iF = f();
                        if (iF > iArr[2]) {
                            i11 += (iF - iArr[2]) - 2;
                            i12 = iJ - 1;
                        }
                    }
                    iArr[0] = 0;
                    iArr[1] = 0;
                    iArr[2] = 0;
                    iArr[3] = 0;
                    iArr[4] = 0;
                    i13 = 0;
                    i10 = 2;
                } else {
                    iArr[0] = iArr[2];
                    iArr[1] = iArr[3];
                    iArr[2] = iArr[4];
                    iArr[3] = 1;
                    iArr[4] = 0;
                    i13 = 3;
                }
                i12++;
            }
            if (g(iArr) && i(iArr, i11, iJ, z11)) {
                i10 = iArr[0];
                if (this.f28361c) {
                    zJ = j();
                }
            }
            i11 += i10;
        }
        d[] dVarArrK = k();
        m.e(dVarArrK);
        return new f(dVarArrK);
    }

    protected final boolean i(int[] iArr, int i10, int i11, boolean z10) {
        boolean z11 = false;
        int i12 = iArr[0] + iArr[1] + iArr[2] + iArr[3] + iArr[4];
        int iA = (int) a(iArr, i11);
        float fD = d(i10, iA, iArr[2], i12);
        if (!Float.isNaN(fD)) {
            int i13 = (int) fD;
            float fC = c(iA, i13, iArr[2], i12);
            if (!Float.isNaN(fC) && (!z10 || b(i13, (int) fC, iArr[2], i12))) {
                float f5 = i12 / 7.0f;
                int i14 = 0;
                while (true) {
                    if (i14 >= this.f28360b.size()) {
                        break;
                    }
                    d dVar = (d) this.f28360b.get(i14);
                    if (dVar.f(f5, fD, fC)) {
                        this.f28360b.set(i14, dVar.g(fD, fC, f5));
                        z11 = true;
                        break;
                    }
                    i14++;
                }
                if (!z11) {
                    d dVar2 = new d(fC, fD, f5);
                    this.f28360b.add(dVar2);
                    n nVar = this.f28363e;
                    if (nVar != null) {
                        nVar.a(dVar2);
                    }
                }
                return true;
            }
        }
        return false;
    }
}
