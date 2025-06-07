package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;

/* loaded from: classes.dex */
abstract class m5 {

    /* renamed from: a, reason: collision with root package name */
    private static final byte[] f11929a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f11930b = 0;

    static {
        int i10 = sv2.f15560a;
        f11929a = "OpusHead".getBytes(u23.f16142c);
    }

    public static ld0 a(b5 b5Var) {
        w3 w3Var;
        c5 c5VarD = b5Var.d(1751411826);
        c5 c5VarD2 = b5Var.d(1801812339);
        c5 c5VarD3 = b5Var.d(1768715124);
        if (c5VarD == null || c5VarD2 == null || c5VarD3 == null || f(c5VarD.f6776b) != 1835299937) {
            return null;
        }
        jm2 jm2Var = c5VarD2.f6776b;
        jm2Var.f(12);
        int iM = jm2Var.m();
        String[] strArr = new String[iM];
        for (int i10 = 0; i10 < iM; i10++) {
            int iM2 = jm2Var.m();
            jm2Var.g(4);
            strArr[i10] = jm2Var.F(iM2 - 8, u23.f16142c);
        }
        jm2 jm2Var2 = c5VarD3.f6776b;
        jm2Var2.f(8);
        ArrayList arrayList = new ArrayList();
        while (jm2Var2.i() > 8) {
            int iK = jm2Var2.k();
            int iM3 = jm2Var2.m();
            int iM4 = jm2Var2.m() - 1;
            if (iM4 < 0 || iM4 >= iM) {
                ad2.e("AtomParsers", "Skipped metadata with unknown key index: " + iM4);
            } else {
                String str = strArr[iM4];
                int i11 = iK + iM3;
                int i12 = t5.f15693b;
                while (true) {
                    int iK2 = jm2Var2.k();
                    if (iK2 >= i11) {
                        w3Var = null;
                        break;
                    }
                    int iM5 = jm2Var2.m();
                    if (jm2Var2.m() == 1684108385) {
                        int iM6 = jm2Var2.m();
                        int iM7 = jm2Var2.m();
                        int i13 = iM5 - 16;
                        byte[] bArr = new byte[i13];
                        jm2Var2.b(bArr, 0, i13);
                        w3Var = new w3(str, bArr, iM7, iM6);
                        break;
                    }
                    jm2Var2.f(iK2 + iM5);
                }
                if (w3Var != null) {
                    arrayList.add(w3Var);
                }
            }
            jm2Var2.f(iK + iM3);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new ld0(arrayList);
    }

    /* JADX WARN: Removed duplicated region for block: B:341:0x06be A[PHI: r10
  0x06be: PHI (r10v12 int) = (r10v10 int), (r10v14 int) binds: [B:337:0x06b1, B:339:0x06ba] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:371:0x0783  */
    /* JADX WARN: Removed duplicated region for block: B:386:0x0832  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:446:0x09ee  */
    /* JADX WARN: Removed duplicated region for block: B:485:0x0abe A[ADDED_TO_REGION, LOOP:13: B:485:0x0abe->B:489:0x0ac8, LOOP_START, PHI: r23
  0x0abe: PHI (r23v8 int) = (r23v7 int), (r23v9 int) binds: [B:484:0x0abc, B:489:0x0ac8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:490:0x0ace  */
    /* JADX WARN: Removed duplicated region for block: B:492:0x0ad1  */
    /* JADX WARN: Removed duplicated region for block: B:506:0x0b18  */
    /* JADX WARN: Removed duplicated region for block: B:510:0x0b63  */
    /* JADX WARN: Removed duplicated region for block: B:511:0x0b66  */
    /* JADX WARN: Removed duplicated region for block: B:516:0x0b8a  */
    /* JADX WARN: Removed duplicated region for block: B:518:0x0ba7  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:609:0x0e14  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:616:0x0e21 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:637:0x0ab5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x017a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.List b(com.google.android.gms.internal.ads.b5 r56, com.google.android.gms.internal.ads.z r57, long r58, com.google.android.gms.internal.ads.c0 r60, boolean r61, boolean r62, com.google.android.gms.internal.ads.w23 r63) throws com.google.android.gms.internal.ads.oh0 {
        /*
            Method dump skipped, instructions count: 3627
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.m5.b(com.google.android.gms.internal.ads.b5, com.google.android.gms.internal.ads.z, long, com.google.android.gms.internal.ads.c0, boolean, boolean, com.google.android.gms.internal.ads.w23):java.util.List");
    }

    public static void c(jm2 jm2Var) {
        int iK = jm2Var.k();
        jm2Var.g(4);
        if (jm2Var.m() != 1751411826) {
            iK += 4;
        }
        jm2Var.f(iK);
    }

    private static int d(int i10) {
        if (i10 == 1936684398) {
            return 1;
        }
        if (i10 == 1986618469) {
            return 2;
        }
        if (i10 == 1952807028 || i10 == 1935832172 || i10 == 1937072756 || i10 == 1668047728) {
            return 3;
        }
        return i10 == 1835365473 ? 5 : -1;
    }

    private static int e(jm2 jm2Var) {
        int iS = jm2Var.s();
        int i10 = iS & 127;
        while ((iS & 128) == 128) {
            iS = jm2Var.s();
            i10 = (i10 << 7) | (iS & 127);
        }
        return i10;
    }

    private static int f(jm2 jm2Var) {
        jm2Var.f(16);
        return jm2Var.m();
    }

    private static Pair g(b5 b5Var) {
        c5 c5VarD = b5Var.d(1701606260);
        if (c5VarD == null) {
            return null;
        }
        jm2 jm2Var = c5VarD.f6776b;
        jm2Var.f(8);
        int iA = d5.a(jm2Var.m());
        int iV = jm2Var.v();
        long[] jArr = new long[iV];
        long[] jArr2 = new long[iV];
        for (int i10 = 0; i10 < iV; i10++) {
            jArr[i10] = iA == 1 ? jm2Var.B() : jm2Var.A();
            jArr2[i10] = iA == 1 ? jm2Var.z() : jm2Var.m();
            if (jm2Var.G() != 1) {
                throw new IllegalArgumentException("Unsupported media rate.");
            }
            jm2Var.g(2);
        }
        return Pair.create(jArr, jArr2);
    }

    private static Pair h(jm2 jm2Var) {
        jm2Var.f(8);
        int iA = d5.a(jm2Var.m());
        jm2Var.g(iA == 0 ? 8 : 16);
        long jA = jm2Var.A();
        jm2Var.g(iA == 0 ? 4 : 8);
        int iW = jm2Var.w();
        StringBuilder sb2 = new StringBuilder();
        sb2.append((char) (((iW >> 10) & 31) + 96));
        sb2.append((char) (((iW >> 5) & 31) + 96));
        sb2.append((char) ((iW & 31) + 96));
        return Pair.create(Long.valueOf(jA), sb2.toString());
    }

    private static Pair i(jm2 jm2Var, int i10, int i11) throws oh0 {
        Integer num;
        c6 c6Var;
        Pair pairCreate;
        int i12;
        int i13;
        byte[] bArr;
        int iK = jm2Var.k();
        while (iK - i10 < i11) {
            jm2Var.f(iK);
            int iM = jm2Var.m();
            o.b(iM > 0, "childAtomSize must be positive");
            if (jm2Var.m() == 1936289382) {
                int i14 = iK + 8;
                int i15 = 0;
                int i16 = -1;
                String strF = null;
                Integer numValueOf = null;
                while (i14 - iK < iM) {
                    jm2Var.f(i14);
                    int iM2 = jm2Var.m();
                    int iM3 = jm2Var.m();
                    if (iM3 == 1718775137) {
                        numValueOf = Integer.valueOf(jm2Var.m());
                    } else if (iM3 == 1935894637) {
                        jm2Var.g(4);
                        strF = jm2Var.F(4, u23.f16142c);
                    } else if (iM3 == 1935894633) {
                        i16 = i14;
                        i15 = iM2;
                    }
                    i14 += iM2;
                }
                if ("cenc".equals(strF) || "cbc1".equals(strF) || "cens".equals(strF) || "cbcs".equals(strF)) {
                    o.b(numValueOf != null, "frma atom is mandatory");
                    o.b(i16 != -1, "schi atom is mandatory");
                    int i17 = i16 + 8;
                    while (true) {
                        if (i17 - i16 >= i15) {
                            num = numValueOf;
                            c6Var = null;
                            break;
                        }
                        jm2Var.f(i17);
                        int iM4 = jm2Var.m();
                        if (jm2Var.m() == 1952804451) {
                            int iA = d5.a(jm2Var.m());
                            jm2Var.g(1);
                            if (iA == 0) {
                                jm2Var.g(1);
                                i12 = 0;
                                i13 = 0;
                            } else {
                                int iS = jm2Var.s();
                                int i18 = iS & 240;
                                i12 = iS & 15;
                                i13 = i18 >> 4;
                            }
                            boolean z10 = jm2Var.s() == 1;
                            int iS2 = jm2Var.s();
                            byte[] bArr2 = new byte[16];
                            jm2Var.b(bArr2, 0, 16);
                            if (z10 && iS2 == 0) {
                                int iS3 = jm2Var.s();
                                byte[] bArr3 = new byte[iS3];
                                jm2Var.b(bArr3, 0, iS3);
                                bArr = bArr3;
                            } else {
                                bArr = null;
                            }
                            num = numValueOf;
                            c6Var = new c6(z10, strF, iS2, bArr2, i13, i12, bArr);
                        } else {
                            i17 += iM4;
                        }
                    }
                    o.b(c6Var != null, "tenc atom is mandatory");
                    int i19 = sv2.f15560a;
                    pairCreate = Pair.create(num, c6Var);
                } else {
                    pairCreate = null;
                }
                if (pairCreate != null) {
                    return pairCreate;
                }
            }
            iK += iM;
        }
        return null;
    }

    private static f5 j(jm2 jm2Var, int i10) {
        jm2Var.f(i10 + 12);
        jm2Var.g(1);
        e(jm2Var);
        jm2Var.g(2);
        int iS = jm2Var.s();
        if ((iS & 128) != 0) {
            jm2Var.g(2);
        }
        if ((iS & 64) != 0) {
            jm2Var.g(jm2Var.s());
        }
        if ((iS & 32) != 0) {
            jm2Var.g(2);
        }
        jm2Var.g(1);
        e(jm2Var);
        String strD = ng0.d(jm2Var.s());
        if ("audio/mpeg".equals(strD) || "audio/vnd.dts".equals(strD) || "audio/vnd.dts.hd".equals(strD)) {
            return new f5(strD, null, -1L, -1L);
        }
        jm2Var.g(4);
        long jA = jm2Var.A();
        long jA2 = jm2Var.A();
        jm2Var.g(1);
        int iE = e(jm2Var);
        byte[] bArr = new byte[iE];
        jm2Var.b(bArr, 0, iE);
        return new f5(strD, bArr, jA2 <= 0 ? -1L : jA2, jA > 0 ? jA : -1L);
    }

    private static ByteBuffer k() {
        return ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x016b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void l(com.google.android.gms.internal.ads.jm2 r23, int r24, int r25, int r26, int r27, java.lang.String r28, boolean r29, com.google.android.gms.internal.ads.c0 r30, com.google.android.gms.internal.ads.i5 r31, int r32) throws com.google.android.gms.internal.ads.oh0 {
        /*
            Method dump skipped, instructions count: 982
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.m5.l(com.google.android.gms.internal.ads.jm2, int, int, int, int, java.lang.String, boolean, com.google.android.gms.internal.ads.c0, com.google.android.gms.internal.ads.i5, int):void");
    }

    private static void m(jm2 jm2Var, int i10, int i11, int i12, i5 i5Var) {
        jm2Var.f(i11 + 16);
        jm2Var.D((char) 0);
        String strD = jm2Var.D((char) 0);
        if (strD != null) {
            i7 i7Var = new i7();
            i7Var.g(i12);
            i7Var.s(strD);
            i5Var.f9545b = i7Var.y();
        }
    }

    private static boolean n(long[] jArr, long j10, long j11, long j12) {
        int length = jArr.length;
        int i10 = length - 1;
        return jArr[0] <= j11 && j11 < jArr[Math.max(0, Math.min(4, i10))] && jArr[Math.max(0, Math.min(length + (-4), i10))] < j12 && j12 <= j10;
    }
}
