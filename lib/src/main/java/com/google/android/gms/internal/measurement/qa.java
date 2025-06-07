package com.google.android.gms.internal.measurement;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class qa {

    /* renamed from: f, reason: collision with root package name */
    private static final qa f19224f = new qa(0, new int[0], new Object[0], false);

    /* renamed from: a, reason: collision with root package name */
    private int f19225a;

    /* renamed from: b, reason: collision with root package name */
    private int[] f19226b;

    /* renamed from: c, reason: collision with root package name */
    private Object[] f19227c;

    /* renamed from: d, reason: collision with root package name */
    private int f19228d = -1;

    /* renamed from: e, reason: collision with root package name */
    private boolean f19229e;

    private qa(int i10, int[] iArr, Object[] objArr, boolean z10) {
        this.f19225a = i10;
        this.f19226b = iArr;
        this.f19227c = objArr;
        this.f19229e = z10;
    }

    public static qa c() {
        return f19224f;
    }

    static qa d(qa qaVar, qa qaVar2) {
        int i10 = qaVar.f19225a + qaVar2.f19225a;
        int[] iArrCopyOf = Arrays.copyOf(qaVar.f19226b, i10);
        System.arraycopy(qaVar2.f19226b, 0, iArrCopyOf, qaVar.f19225a, qaVar2.f19225a);
        Object[] objArrCopyOf = Arrays.copyOf(qaVar.f19227c, i10);
        System.arraycopy(qaVar2.f19227c, 0, objArrCopyOf, qaVar.f19225a, qaVar2.f19225a);
        return new qa(i10, iArrCopyOf, objArrCopyOf, true);
    }

    static qa e() {
        return new qa(0, new int[8], new Object[8], true);
    }

    public final int a() {
        int iA;
        int iB;
        int iA2;
        int i10 = this.f19228d;
        if (i10 != -1) {
            return i10;
        }
        int iA3 = 0;
        for (int i11 = 0; i11 < this.f19225a; i11++) {
            int i12 = this.f19226b[i11];
            int i13 = i12 >>> 3;
            int i14 = i12 & 7;
            if (i14 != 0) {
                if (i14 == 1) {
                    ((Long) this.f19227c[i11]).longValue();
                    iA2 = f8.a(i13 << 3) + 8;
                } else if (i14 == 2) {
                    x7 x7Var = (x7) this.f19227c[i11];
                    int iA4 = f8.a(i13 << 3);
                    int iH = x7Var.h();
                    iA3 += iA4 + f8.a(iH) + iH;
                } else if (i14 == 3) {
                    int iC = f8.C(i13);
                    iA = iC + iC;
                    iB = ((qa) this.f19227c[i11]).a();
                } else {
                    if (i14 != 5) {
                        throw new IllegalStateException(d9.a());
                    }
                    ((Integer) this.f19227c[i11]).intValue();
                    iA2 = f8.a(i13 << 3) + 4;
                }
                iA3 += iA2;
            } else {
                long jLongValue = ((Long) this.f19227c[i11]).longValue();
                iA = f8.a(i13 << 3);
                iB = f8.b(jLongValue);
            }
            iA2 = iA + iB;
            iA3 += iA2;
        }
        this.f19228d = iA3;
        return iA3;
    }

    public final int b() {
        int i10 = this.f19228d;
        if (i10 != -1) {
            return i10;
        }
        int iA = 0;
        for (int i11 = 0; i11 < this.f19225a; i11++) {
            int i12 = this.f19226b[i11];
            x7 x7Var = (x7) this.f19227c[i11];
            int iA2 = f8.a(8);
            int iH = x7Var.h();
            iA += iA2 + iA2 + f8.a(16) + f8.a(i12 >>> 3) + f8.a(24) + f8.a(iH) + iH;
        }
        this.f19228d = iA;
        return iA;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof qa)) {
            return false;
        }
        qa qaVar = (qa) obj;
        int i10 = this.f19225a;
        if (i10 == qaVar.f19225a) {
            int[] iArr = this.f19226b;
            int[] iArr2 = qaVar.f19226b;
            int i11 = 0;
            while (true) {
                if (i11 >= i10) {
                    Object[] objArr = this.f19227c;
                    Object[] objArr2 = qaVar.f19227c;
                    int i12 = this.f19225a;
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

    public final void f() {
        this.f19229e = false;
    }

    final void g(StringBuilder sb2, int i10) {
        for (int i11 = 0; i11 < this.f19225a; i11++) {
            aa.b(sb2, i10, String.valueOf(this.f19226b[i11] >>> 3), this.f19227c[i11]);
        }
    }

    final void h(int i10, Object obj) {
        if (!this.f19229e) {
            throw new UnsupportedOperationException();
        }
        int i11 = this.f19225a;
        int[] iArr = this.f19226b;
        if (i11 == iArr.length) {
            int i12 = i11 + (i11 < 4 ? 8 : i11 >> 1);
            this.f19226b = Arrays.copyOf(iArr, i12);
            this.f19227c = Arrays.copyOf(this.f19227c, i12);
        }
        int[] iArr2 = this.f19226b;
        int i13 = this.f19225a;
        iArr2[i13] = i10;
        this.f19227c[i13] = obj;
        this.f19225a = i13 + 1;
    }

    public final int hashCode() {
        int i10 = this.f19225a;
        int i11 = (i10 + 527) * 31;
        int[] iArr = this.f19226b;
        int iHashCode = 17;
        int i12 = 17;
        for (int i13 = 0; i13 < i10; i13++) {
            i12 = (i12 * 31) + iArr[i13];
        }
        int i14 = (i11 + i12) * 31;
        Object[] objArr = this.f19227c;
        int i15 = this.f19225a;
        for (int i16 = 0; i16 < i15; i16++) {
            iHashCode = (iHashCode * 31) + objArr[i16].hashCode();
        }
        return i14 + iHashCode;
    }

    public final void i(gb gbVar) {
        if (this.f19225a != 0) {
            for (int i10 = 0; i10 < this.f19225a; i10++) {
                int i11 = this.f19226b[i10];
                Object obj = this.f19227c[i10];
                int i12 = i11 >>> 3;
                int i13 = i11 & 7;
                if (i13 == 0) {
                    gbVar.j(i12, ((Long) obj).longValue());
                } else if (i13 == 1) {
                    gbVar.b(i12, ((Long) obj).longValue());
                } else if (i13 == 2) {
                    gbVar.L(i12, (x7) obj);
                } else if (i13 == 3) {
                    gbVar.q(i12);
                    ((qa) obj).i(gbVar);
                    gbVar.X(i12);
                } else {
                    if (i13 != 5) {
                        throw new RuntimeException(d9.a());
                    }
                    gbVar.h(i12, ((Integer) obj).intValue());
                }
            }
        }
    }
}
