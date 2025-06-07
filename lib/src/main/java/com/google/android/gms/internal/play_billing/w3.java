package com.google.android.gms.internal.play_billing;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class w3 {

    /* renamed from: f, reason: collision with root package name */
    private static final w3 f19665f = new w3(0, new int[0], new Object[0], false);

    /* renamed from: a, reason: collision with root package name */
    private int f19666a;

    /* renamed from: b, reason: collision with root package name */
    private int[] f19667b;

    /* renamed from: c, reason: collision with root package name */
    private Object[] f19668c;

    /* renamed from: d, reason: collision with root package name */
    private int f19669d = -1;

    /* renamed from: e, reason: collision with root package name */
    private boolean f19670e;

    private w3(int i10, int[] iArr, Object[] objArr, boolean z10) {
        this.f19666a = i10;
        this.f19667b = iArr;
        this.f19668c = objArr;
        this.f19670e = z10;
    }

    public static w3 c() {
        return f19665f;
    }

    static w3 e(w3 w3Var, w3 w3Var2) {
        int i10 = w3Var.f19666a + w3Var2.f19666a;
        int[] iArrCopyOf = Arrays.copyOf(w3Var.f19667b, i10);
        System.arraycopy(w3Var2.f19667b, 0, iArrCopyOf, w3Var.f19666a, w3Var2.f19666a);
        Object[] objArrCopyOf = Arrays.copyOf(w3Var.f19668c, i10);
        System.arraycopy(w3Var2.f19668c, 0, objArrCopyOf, w3Var.f19666a, w3Var2.f19666a);
        return new w3(i10, iArrCopyOf, objArrCopyOf, true);
    }

    static w3 f() {
        return new w3(0, new int[8], new Object[8], true);
    }

    private final void m(int i10) {
        int[] iArr = this.f19667b;
        if (i10 > iArr.length) {
            int i11 = this.f19666a;
            int i12 = i11 + (i11 / 2);
            if (i12 >= i10) {
                i10 = i12;
            }
            if (i10 < 8) {
                i10 = 8;
            }
            this.f19667b = Arrays.copyOf(iArr, i10);
            this.f19668c = Arrays.copyOf(this.f19668c, i10);
        }
    }

    public final int a() {
        int iW;
        int iX;
        int iW2;
        int i10 = this.f19669d;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.f19666a; i12++) {
            int i13 = this.f19667b[i12];
            int i14 = i13 >>> 3;
            int i15 = i13 & 7;
            if (i15 != 0) {
                if (i15 == 1) {
                    ((Long) this.f19668c[i12]).longValue();
                    iW2 = y0.w(i14 << 3) + 8;
                } else if (i15 == 2) {
                    int i16 = i14 << 3;
                    q0 q0Var = (q0) this.f19668c[i12];
                    int iW3 = y0.w(i16);
                    int iH = q0Var.h();
                    iW2 = iW3 + y0.w(iH) + iH;
                } else if (i15 == 3) {
                    int iW4 = y0.w(i14 << 3);
                    iW = iW4 + iW4;
                    iX = ((w3) this.f19668c[i12]).a();
                } else {
                    if (i15 != 5) {
                        throw new IllegalStateException(x1.a());
                    }
                    ((Integer) this.f19668c[i12]).intValue();
                    iW2 = y0.w(i14 << 3) + 4;
                }
                i11 += iW2;
            } else {
                int i17 = i14 << 3;
                long jLongValue = ((Long) this.f19668c[i12]).longValue();
                iW = y0.w(i17);
                iX = y0.x(jLongValue);
            }
            iW2 = iW + iX;
            i11 += iW2;
        }
        this.f19669d = i11;
        return i11;
    }

    public final int b() {
        int i10 = this.f19669d;
        if (i10 != -1) {
            return i10;
        }
        int iW = 0;
        for (int i11 = 0; i11 < this.f19666a; i11++) {
            int i12 = this.f19667b[i11] >>> 3;
            q0 q0Var = (q0) this.f19668c[i11];
            int iW2 = y0.w(8);
            int iW3 = y0.w(16) + y0.w(i12);
            int iW4 = y0.w(24);
            int iH = q0Var.h();
            iW += iW2 + iW2 + iW3 + iW4 + y0.w(iH) + iH;
        }
        this.f19669d = iW;
        return iW;
    }

    final w3 d(w3 w3Var) {
        if (w3Var.equals(f19665f)) {
            return this;
        }
        g();
        int i10 = this.f19666a + w3Var.f19666a;
        m(i10);
        System.arraycopy(w3Var.f19667b, 0, this.f19667b, this.f19666a, w3Var.f19666a);
        System.arraycopy(w3Var.f19668c, 0, this.f19668c, this.f19666a, w3Var.f19666a);
        this.f19666a = i10;
        return this;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof w3)) {
            return false;
        }
        w3 w3Var = (w3) obj;
        int i10 = this.f19666a;
        if (i10 == w3Var.f19666a) {
            int[] iArr = this.f19667b;
            int[] iArr2 = w3Var.f19667b;
            int i11 = 0;
            while (true) {
                if (i11 >= i10) {
                    Object[] objArr = this.f19668c;
                    Object[] objArr2 = w3Var.f19668c;
                    int i12 = this.f19666a;
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
        if (!this.f19670e) {
            throw new UnsupportedOperationException();
        }
    }

    public final void h() {
        if (this.f19670e) {
            this.f19670e = false;
        }
    }

    public final int hashCode() {
        int i10 = this.f19666a;
        int i11 = i10 + 527;
        int[] iArr = this.f19667b;
        int iHashCode = 17;
        int i12 = 17;
        for (int i13 = 0; i13 < i10; i13++) {
            i12 = (i12 * 31) + iArr[i13];
        }
        int i14 = ((i11 * 31) + i12) * 31;
        Object[] objArr = this.f19668c;
        int i15 = this.f19666a;
        for (int i16 = 0; i16 < i15; i16++) {
            iHashCode = (iHashCode * 31) + objArr[i16].hashCode();
        }
        return i14 + iHashCode;
    }

    final void i(StringBuilder sb2, int i10) {
        for (int i11 = 0; i11 < this.f19666a; i11++) {
            w2.b(sb2, i10, String.valueOf(this.f19667b[i11] >>> 3), this.f19668c[i11]);
        }
    }

    final void j(int i10, Object obj) {
        g();
        m(this.f19666a + 1);
        int[] iArr = this.f19667b;
        int i11 = this.f19666a;
        iArr[i11] = i10;
        this.f19668c[i11] = obj;
        this.f19666a = i11 + 1;
    }

    final void k(n4 n4Var) {
        for (int i10 = 0; i10 < this.f19666a; i10++) {
            n4Var.y(this.f19667b[i10] >>> 3, this.f19668c[i10]);
        }
    }

    public final void l(n4 n4Var) {
        if (this.f19666a != 0) {
            for (int i10 = 0; i10 < this.f19666a; i10++) {
                int i11 = this.f19667b[i10];
                Object obj = this.f19668c[i10];
                int i12 = i11 & 7;
                int i13 = i11 >>> 3;
                if (i12 == 0) {
                    n4Var.j(i13, ((Long) obj).longValue());
                } else if (i12 == 1) {
                    n4Var.b(i13, ((Long) obj).longValue());
                } else if (i12 == 2) {
                    n4Var.z(i13, (q0) obj);
                } else if (i12 == 3) {
                    n4Var.I(i13);
                    ((w3) obj).l(n4Var);
                    n4Var.X(i13);
                } else {
                    if (i12 != 5) {
                        throw new RuntimeException(x1.a());
                    }
                    n4Var.h(i13, ((Integer) obj).intValue());
                }
            }
        }
    }
}
