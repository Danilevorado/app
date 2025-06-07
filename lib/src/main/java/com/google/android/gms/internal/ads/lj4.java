package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class lj4 extends nj4 {

    /* renamed from: f, reason: collision with root package name */
    private final gl4 f11636f;

    /* renamed from: g, reason: collision with root package name */
    private final c63 f11637g;

    /* renamed from: h, reason: collision with root package name */
    private final hu1 f11638h;

    protected lj4(j31 j31Var, int[] iArr, int i10, gl4 gl4Var, long j10, long j11, long j12, int i11, int i12, float f5, float f10, List list, hu1 hu1Var) {
        super(j31Var, iArr, 0);
        this.f11636f = gl4Var;
        this.f11637g = c63.s(list);
        this.f11638h = hu1Var;
    }

    static /* bridge */ /* synthetic */ c63 b(qk4[] qk4VarArr) {
        int i10;
        int i11;
        ArrayList arrayList = new ArrayList();
        int i12 = 0;
        int i13 = 0;
        while (true) {
            i10 = 2;
            i11 = 1;
            if (i13 >= 2) {
                break;
            }
            qk4 qk4Var = qk4VarArr[i13];
            if (qk4Var == null || qk4Var.f14386b.length <= 1) {
                arrayList.add(null);
            } else {
                z53 z53Var = new z53();
                z53Var.g(new jj4(0L, 0L));
                arrayList.add(z53Var);
            }
            i13++;
        }
        long[][] jArr = new long[2][];
        for (int i14 = 0; i14 < 2; i14++) {
            qk4 qk4Var2 = qk4VarArr[i14];
            if (qk4Var2 == null) {
                jArr[i14] = new long[0];
            } else {
                jArr[i14] = new long[qk4Var2.f14386b.length];
                int i15 = 0;
                while (true) {
                    int[] iArr = qk4Var2.f14386b;
                    if (i15 >= iArr.length) {
                        break;
                    }
                    long j10 = qk4Var2.f14385a.b(iArr[i15]).f10894h;
                    long[] jArr2 = jArr[i14];
                    if (j10 == -1) {
                        j10 = 0;
                    }
                    jArr2[i15] = j10;
                    i15++;
                }
                Arrays.sort(jArr[i14]);
            }
        }
        int[] iArr2 = new int[2];
        long[] jArr3 = new long[2];
        for (int i16 = 0; i16 < 2; i16++) {
            long[] jArr4 = jArr[i16];
            jArr3[i16] = jArr4.length == 0 ? 0L : jArr4[0];
        }
        e(arrayList, jArr3);
        n63 n63VarC = g73.b(k73.c()).b(2).c();
        int i17 = 0;
        while (i17 < i10) {
            int length = jArr[i17].length;
            if (length > i11) {
                double[] dArr = new double[length];
                int i18 = i12;
                while (true) {
                    long[] jArr5 = jArr[i17];
                    double dLog = 0.0d;
                    if (i18 >= jArr5.length) {
                        break;
                    }
                    long j11 = jArr5[i18];
                    if (j11 != -1) {
                        dLog = Math.log(j11);
                    }
                    dArr[i18] = dLog;
                    i18++;
                }
                int i19 = length - 1;
                double d10 = dArr[i19] - dArr[i12];
                int i20 = i12;
                while (i20 < i19) {
                    double d11 = dArr[i20];
                    i20++;
                    n63VarC.a(Double.valueOf(d10 == 0.0d ? 1.0d : (((d11 + dArr[i20]) * 0.5d) - dArr[i12]) / d10), Integer.valueOf(i17));
                    i12 = 0;
                }
            }
            i17++;
            i12 = 0;
            i10 = 2;
            i11 = 1;
        }
        c63 c63VarS = c63.s(n63VarC.r());
        for (int i21 = 0; i21 < c63VarS.size(); i21++) {
            int iIntValue = ((Integer) c63VarS.get(i21)).intValue();
            int i22 = iArr2[iIntValue] + 1;
            iArr2[iIntValue] = i22;
            jArr3[iIntValue] = jArr[iIntValue][i22];
            e(arrayList, jArr3);
        }
        for (int i23 = 0; i23 < 2; i23++) {
            if (arrayList.get(i23) != null) {
                long j12 = jArr3[i23];
                jArr3[i23] = j12 + j12;
            }
        }
        e(arrayList, jArr3);
        z53 z53Var2 = new z53();
        for (int i24 = 0; i24 < arrayList.size(); i24++) {
            z53 z53Var3 = (z53) arrayList.get(i24);
            z53Var2.g(z53Var3 == null ? c63.u() : z53Var3.j());
        }
        return z53Var2.j();
    }

    private static void e(List list, long[] jArr) {
        long j10 = 0;
        for (int i10 = 0; i10 < 2; i10++) {
            j10 += jArr[i10];
        }
        for (int i11 = 0; i11 < list.size(); i11++) {
            z53 z53Var = (z53) list.get(i11);
            if (z53Var != null) {
                z53Var.g(new jj4(j10, jArr[i11]));
            }
        }
    }
}
