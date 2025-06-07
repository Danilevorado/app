package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
abstract class a6 {

    /* renamed from: a, reason: collision with root package name */
    private static final int[] f5952a = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};

    public static boolean a(l lVar) {
        return c(lVar, true, false);
    }

    public static boolean b(l lVar, boolean z10) {
        return c(lVar, false, false);
    }

    private static boolean c(l lVar, boolean z10, boolean z11) {
        boolean z12;
        long jF = lVar.f();
        long j10 = -1;
        long j11 = 4096;
        if (jF != -1 && jF <= 4096) {
            j11 = jF;
        }
        jm2 jm2Var = new jm2(64);
        int i10 = (int) j11;
        boolean z13 = false;
        int i11 = 0;
        boolean z14 = false;
        while (i11 < i10) {
            jm2Var.c(8);
            if (!lVar.E(jm2Var.h(), z13 ? 1 : 0, 8, true)) {
                z12 = z13 ? 1 : 0;
                break;
            }
            long jA = jm2Var.A();
            int iM = jm2Var.m();
            int i12 = 16;
            if (jA == 1) {
                lVar.B(jm2Var.h(), 8, 8);
                jm2Var.e(16);
                jA = jm2Var.z();
            } else {
                if (jA == 0) {
                    long jF2 = lVar.f();
                    if (jF2 != j10) {
                        jA = (jF2 - lVar.c()) + 8;
                    }
                }
                i12 = 8;
            }
            long j12 = i12;
            if (jA < j12) {
                return z13;
            }
            i11 += i12;
            if (iM == 1836019574) {
                i10 += (int) jA;
                if (jF != -1 && i10 > jF) {
                    i10 = (int) jF;
                }
                j10 = -1;
            } else {
                if (iM == 1836019558 || iM == 1836475768) {
                    z12 = true;
                    break;
                }
                jm2 jm2Var2 = jm2Var;
                long j13 = jA;
                if ((i11 + jA) - j12 >= i10) {
                    break;
                }
                int i13 = (int) (j13 - j12);
                i11 += i13;
                if (iM == 1718909296) {
                    if (i13 < 8) {
                        return false;
                    }
                    jm2Var2.c(i13);
                    lVar.B(jm2Var2.h(), 0, i13);
                    int i14 = i13 >> 2;
                    for (int i15 = 0; i15 < i14; i15++) {
                        if (i15 != 1) {
                            int iM2 = jm2Var2.m();
                            if ((iM2 >>> 8) != 3368816) {
                                if (iM2 == 1751476579) {
                                    iM2 = 1751476579;
                                }
                                int[] iArr = f5952a;
                                for (int i16 = 0; i16 < 29; i16++) {
                                    if (iArr[i16] != iM2) {
                                    }
                                }
                            }
                            z14 = true;
                            break;
                        }
                        jm2Var2.g(4);
                    }
                    if (!z14) {
                        return false;
                    }
                } else if (i13 != 0) {
                    lVar.w(i13);
                }
                jm2Var = jm2Var2;
                j10 = -1;
                z13 = false;
            }
        }
        z12 = false;
        return z14 && z10 == z12;
    }
}
