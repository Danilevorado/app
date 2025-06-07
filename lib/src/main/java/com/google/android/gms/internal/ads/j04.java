package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class j04 {

    /* renamed from: f, reason: collision with root package name */
    private static final j04 f10234f = new j04(0, new int[0], new Object[0], false);

    /* renamed from: a, reason: collision with root package name */
    private int f10235a;

    /* renamed from: b, reason: collision with root package name */
    private int[] f10236b;

    /* renamed from: c, reason: collision with root package name */
    private Object[] f10237c;

    /* renamed from: d, reason: collision with root package name */
    private int f10238d = -1;

    /* renamed from: e, reason: collision with root package name */
    private boolean f10239e;

    private j04(int i10, int[] iArr, Object[] objArr, boolean z10) {
        this.f10235a = i10;
        this.f10236b = iArr;
        this.f10237c = objArr;
        this.f10239e = z10;
    }

    public static j04 c() {
        return f10234f;
    }

    static j04 e(j04 j04Var, j04 j04Var2) {
        int i10 = j04Var.f10235a + j04Var2.f10235a;
        int[] iArrCopyOf = Arrays.copyOf(j04Var.f10236b, i10);
        System.arraycopy(j04Var2.f10236b, 0, iArrCopyOf, j04Var.f10235a, j04Var2.f10235a);
        Object[] objArrCopyOf = Arrays.copyOf(j04Var.f10237c, i10);
        System.arraycopy(j04Var2.f10237c, 0, objArrCopyOf, j04Var.f10235a, j04Var2.f10235a);
        return new j04(i10, iArrCopyOf, objArrCopyOf, true);
    }

    static j04 f() {
        return new j04(0, new int[8], new Object[8], true);
    }

    private final void l(int i10) {
        int[] iArr = this.f10236b;
        if (i10 > iArr.length) {
            int i11 = this.f10235a;
            int i12 = i11 + (i11 / 2);
            if (i12 >= i10) {
                i10 = i12;
            }
            if (i10 < 8) {
                i10 = 8;
            }
            this.f10236b = Arrays.copyOf(iArr, i10);
            this.f10237c = Arrays.copyOf(this.f10237c, i10);
        }
    }

    public final int a() {
        int iC;
        int iB;
        int iB2;
        int i10 = this.f10238d;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.f10235a; i12++) {
            int i13 = this.f10236b[i12];
            int i14 = i13 >>> 3;
            int i15 = i13 & 7;
            if (i15 != 0) {
                if (i15 == 1) {
                    ((Long) this.f10237c[i12]).longValue();
                    iB2 = mx3.b(i14 << 3) + 8;
                } else if (i15 == 2) {
                    ww3 ww3Var = (ww3) this.f10237c[i12];
                    int i16 = mx3.f12291d;
                    int iN = ww3Var.n();
                    iB2 = mx3.b(i14 << 3) + mx3.b(iN) + iN;
                } else if (i15 == 3) {
                    int i17 = i14 << 3;
                    int i18 = mx3.f12291d;
                    iC = ((j04) this.f10237c[i12]).a();
                    int iB3 = mx3.b(i17);
                    iB = iB3 + iB3;
                } else {
                    if (i15 != 5) {
                        throw new IllegalStateException(ny3.a());
                    }
                    ((Integer) this.f10237c[i12]).intValue();
                    iB2 = mx3.b(i14 << 3) + 4;
                }
                i11 += iB2;
            } else {
                int i19 = i14 << 3;
                iC = mx3.c(((Long) this.f10237c[i12]).longValue());
                iB = mx3.b(i19);
            }
            iB2 = iB + iC;
            i11 += iB2;
        }
        this.f10238d = i11;
        return i11;
    }

    public final int b() {
        int i10 = this.f10238d;
        if (i10 != -1) {
            return i10;
        }
        int iB = 0;
        for (int i11 = 0; i11 < this.f10235a; i11++) {
            int i12 = this.f10236b[i11] >>> 3;
            ww3 ww3Var = (ww3) this.f10237c[i11];
            int i13 = mx3.f12291d;
            int iN = ww3Var.n();
            int iB2 = mx3.b(iN) + iN;
            int iB3 = mx3.b(16);
            int iB4 = mx3.b(i12);
            int iB5 = mx3.b(8);
            iB += iB5 + iB5 + iB3 + iB4 + mx3.b(24) + iB2;
        }
        this.f10238d = iB;
        return iB;
    }

    final j04 d(j04 j04Var) {
        if (j04Var.equals(f10234f)) {
            return this;
        }
        g();
        int i10 = this.f10235a + j04Var.f10235a;
        l(i10);
        System.arraycopy(j04Var.f10236b, 0, this.f10236b, this.f10235a, j04Var.f10235a);
        System.arraycopy(j04Var.f10237c, 0, this.f10237c, this.f10235a, j04Var.f10235a);
        this.f10235a = i10;
        return this;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof j04)) {
            return false;
        }
        j04 j04Var = (j04) obj;
        int i10 = this.f10235a;
        if (i10 == j04Var.f10235a) {
            int[] iArr = this.f10236b;
            int[] iArr2 = j04Var.f10236b;
            int i11 = 0;
            while (true) {
                if (i11 >= i10) {
                    Object[] objArr = this.f10237c;
                    Object[] objArr2 = j04Var.f10237c;
                    int i12 = this.f10235a;
                    for (int i13 = 0; i13 < i12; i13++) {
                        if (objArr[i13].equals(objArr2[i13])) {
                        }
                    }
                    return true;
                }
                if (iArr[i11] != iArr2[i11]) {
                    break;
                }
                i11++;
            }
        }
        return false;
    }

    final void g() {
        if (!this.f10239e) {
            throw new UnsupportedOperationException();
        }
    }

    public final void h() {
        this.f10239e = false;
    }

    public final int hashCode() {
        int i10 = this.f10235a;
        int i11 = i10 + 527;
        int[] iArr = this.f10236b;
        int iHashCode = 17;
        int i12 = 17;
        for (int i13 = 0; i13 < i10; i13++) {
            i12 = (i12 * 31) + iArr[i13];
        }
        int i14 = (i11 * 31) + i12;
        Object[] objArr = this.f10237c;
        int i15 = this.f10235a;
        for (int i16 = 0; i16 < i15; i16++) {
            iHashCode = (iHashCode * 31) + objArr[i16].hashCode();
        }
        return (i14 * 31) + iHashCode;
    }

    final void i(StringBuilder sb2, int i10) {
        for (int i11 = 0; i11 < this.f10235a; i11++) {
            lz3.b(sb2, i10, String.valueOf(this.f10236b[i11] >>> 3), this.f10237c[i11]);
        }
    }

    final void j(int i10, Object obj) {
        g();
        l(this.f10235a + 1);
        int[] iArr = this.f10236b;
        int i11 = this.f10235a;
        iArr[i11] = i10;
        this.f10237c[i11] = obj;
        this.f10235a = i11 + 1;
    }

    public final void k(nx3 nx3Var) {
        if (this.f10235a != 0) {
            for (int i10 = 0; i10 < this.f10235a; i10++) {
                int i11 = this.f10236b[i10];
                Object obj = this.f10237c[i10];
                int i12 = i11 & 7;
                int i13 = i11 >>> 3;
                if (i12 == 0) {
                    nx3Var.E(i13, ((Long) obj).longValue());
                } else if (i12 == 1) {
                    nx3Var.x(i13, ((Long) obj).longValue());
                } else if (i12 == 2) {
                    nx3Var.o(i13, (ww3) obj);
                } else if (i12 == 3) {
                    nx3Var.e(i13);
                    ((j04) obj).k(nx3Var);
                    nx3Var.s(i13);
                } else {
                    if (i12 != 5) {
                        throw new RuntimeException(ny3.a());
                    }
                    nx3Var.v(i13, ((Integer) obj).intValue());
                }
            }
        }
    }
}
