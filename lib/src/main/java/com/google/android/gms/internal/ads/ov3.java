package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes.dex */
abstract class ov3 {

    /* renamed from: a, reason: collision with root package name */
    private static final int[] f13419a = {0, 3, 6, 9, 12, 16, 19, 22, 25, 28};

    /* renamed from: b, reason: collision with root package name */
    private static final int[] f13420b = {0, 2, 3, 5, 6, 0, 1, 3, 4, 6};

    /* renamed from: c, reason: collision with root package name */
    private static final int[] f13421c = {67108863, 33554431};

    /* renamed from: d, reason: collision with root package name */
    private static final int[] f13422d = {26, 25};

    static void a(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[19];
        b(jArr4, jArr2, jArr3);
        c(jArr4, jArr);
    }

    static void b(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr[0] = jArr2[0] * jArr3[0];
        jArr[1] = (jArr2[0] * jArr3[1]) + (jArr2[1] * jArr3[0]);
        long j10 = jArr2[1];
        jArr[2] = ((j10 + j10) * jArr3[1]) + (jArr2[0] * jArr3[2]) + (jArr2[2] * jArr3[0]);
        long j11 = jArr2[1] * jArr3[2];
        long j12 = jArr2[2] * jArr3[1];
        jArr[3] = j11 + j12 + (jArr2[0] * jArr3[3]) + (jArr2[3] * jArr3[0]);
        long j13 = jArr2[2] * jArr3[2];
        long j14 = jArr2[1] * jArr3[3];
        long j15 = jArr2[3] * jArr3[1];
        long j16 = j14 + j15;
        jArr[4] = j13 + j16 + j16 + (jArr2[0] * jArr3[4]) + (jArr2[4] * jArr3[0]);
        long j17 = jArr2[2] * jArr3[3];
        long j18 = jArr2[3] * jArr3[2];
        long j19 = jArr2[1] * jArr3[4];
        long j20 = jArr2[4] * jArr3[1];
        jArr[5] = j17 + j18 + j19 + j20 + (jArr2[0] * jArr3[5]) + (jArr2[5] * jArr3[0]);
        long j21 = jArr2[3] * jArr3[3];
        long j22 = jArr2[1] * jArr3[5];
        long j23 = jArr2[5] * jArr3[1];
        long j24 = jArr2[2] * jArr3[4];
        long j25 = jArr2[4] * jArr3[2];
        long j26 = j21 + j22 + j23;
        jArr[6] = j26 + j26 + j24 + j25 + (jArr2[0] * jArr3[6]) + (jArr2[6] * jArr3[0]);
        long j27 = jArr2[3] * jArr3[4];
        long j28 = jArr2[4] * jArr3[3];
        long j29 = jArr2[2] * jArr3[5];
        long j30 = jArr2[5] * jArr3[2];
        long j31 = jArr2[1] * jArr3[6];
        long j32 = jArr2[6] * jArr3[1];
        jArr[7] = j27 + j28 + j29 + j30 + j31 + j32 + (jArr2[0] * jArr3[7]) + (jArr2[7] * jArr3[0]);
        long j33 = jArr2[4] * jArr3[4];
        long j34 = jArr2[3] * jArr3[5];
        long j35 = jArr2[5] * jArr3[3];
        long j36 = jArr2[1] * jArr3[7];
        long j37 = jArr2[7] * jArr3[1];
        long j38 = jArr2[2] * jArr3[6];
        long j39 = jArr2[6] * jArr3[2];
        long j40 = j34 + j35 + j36 + j37;
        jArr[8] = j33 + j40 + j40 + j38 + j39 + (jArr2[0] * jArr3[8]) + (jArr2[8] * jArr3[0]);
        long j41 = jArr2[4] * jArr3[5];
        long j42 = jArr2[5] * jArr3[4];
        long j43 = jArr2[3] * jArr3[6];
        long j44 = jArr2[6] * jArr3[3];
        long j45 = jArr2[2] * jArr3[7];
        long j46 = jArr2[7] * jArr3[2];
        long j47 = jArr2[1] * jArr3[8];
        long j48 = jArr2[8] * jArr3[1];
        jArr[9] = j41 + j42 + j43 + j44 + j45 + j46 + j47 + j48 + (jArr2[0] * jArr3[9]) + (jArr2[9] * jArr3[0]);
        long j49 = jArr2[5] * jArr3[5];
        long j50 = jArr2[3] * jArr3[7];
        long j51 = jArr2[7] * jArr3[3];
        long j52 = jArr2[1] * jArr3[9];
        long j53 = jArr2[9] * jArr3[1];
        long j54 = jArr2[4] * jArr3[6];
        long j55 = jArr2[6] * jArr3[4];
        long j56 = j49 + j50 + j51 + j52 + j53;
        jArr[10] = j56 + j56 + j54 + j55 + (jArr2[2] * jArr3[8]) + (jArr2[8] * jArr3[2]);
        long j57 = jArr2[5] * jArr3[6];
        long j58 = jArr2[6] * jArr3[5];
        long j59 = jArr2[4] * jArr3[7];
        long j60 = jArr2[7] * jArr3[4];
        long j61 = jArr2[3] * jArr3[8];
        long j62 = jArr2[8] * jArr3[3];
        jArr[11] = j57 + j58 + j59 + j60 + j61 + j62 + (jArr2[2] * jArr3[9]) + (jArr2[9] * jArr3[2]);
        long j63 = jArr2[6] * jArr3[6];
        long j64 = jArr2[5] * jArr3[7];
        long j65 = jArr2[7] * jArr3[5];
        long j66 = jArr2[3] * jArr3[9];
        long j67 = jArr2[9] * jArr3[3];
        long j68 = j64 + j65 + j66 + j67;
        jArr[12] = j63 + j68 + j68 + (jArr2[4] * jArr3[8]) + (jArr2[8] * jArr3[4]);
        long j69 = jArr2[6] * jArr3[7];
        long j70 = jArr2[7] * jArr3[6];
        long j71 = jArr2[5] * jArr3[8];
        long j72 = jArr2[8] * jArr3[5];
        jArr[13] = j69 + j70 + j71 + j72 + (jArr2[4] * jArr3[9]) + (jArr2[9] * jArr3[4]);
        long j73 = jArr2[7] * jArr3[7];
        long j74 = jArr2[5] * jArr3[9];
        long j75 = jArr2[9] * jArr3[5];
        long j76 = j73 + j74 + j75;
        jArr[14] = j76 + j76 + (jArr2[6] * jArr3[8]) + (jArr2[8] * jArr3[6]);
        long j77 = jArr2[7] * jArr3[8];
        long j78 = jArr2[8] * jArr3[7];
        jArr[15] = j77 + j78 + (jArr2[6] * jArr3[9]) + (jArr2[9] * jArr3[6]);
        long j79 = jArr2[8] * jArr3[8];
        long j80 = (jArr2[7] * jArr3[9]) + (jArr2[9] * jArr3[7]);
        jArr[16] = j79 + j80 + j80;
        jArr[17] = (jArr2[8] * jArr3[9]) + (jArr2[9] * jArr3[8]);
        long j81 = jArr2[9];
        jArr[18] = (j81 + j81) * jArr3[9];
    }

    static void c(long[] jArr, long[] jArr2) {
        e(jArr);
        d(jArr);
        System.arraycopy(jArr, 0, jArr2, 0, 10);
    }

    static void d(long[] jArr) {
        jArr[10] = 0;
        int i10 = 0;
        while (i10 < 10) {
            long j10 = jArr[i10];
            long j11 = j10 / 67108864;
            jArr[i10] = j10 - (j11 << 26);
            int i11 = i10 + 1;
            long j12 = jArr[i11] + j11;
            jArr[i11] = j12;
            long j13 = j12 / 33554432;
            jArr[i11] = j12 - (j13 << 25);
            i10 += 2;
            jArr[i10] = jArr[i10] + j13;
        }
        long j14 = jArr[0] + (jArr[10] << 4);
        jArr[0] = j14;
        long j15 = jArr[10];
        long j16 = j14 + j15 + j15;
        jArr[0] = j16;
        jArr[0] = j16 + jArr[10];
        jArr[10] = 0;
        long j17 = jArr[0];
        long j18 = j17 / 67108864;
        jArr[0] = j17 - (j18 << 26);
        jArr[1] = jArr[1] + j18;
    }

    static void e(long[] jArr) {
        long j10 = jArr[8] + (jArr[18] << 4);
        jArr[8] = j10;
        long j11 = jArr[18];
        long j12 = j10 + j11 + j11;
        jArr[8] = j12;
        jArr[8] = j12 + jArr[18];
        long j13 = jArr[7] + (jArr[17] << 4);
        jArr[7] = j13;
        long j14 = jArr[17];
        long j15 = j13 + j14 + j14;
        jArr[7] = j15;
        jArr[7] = j15 + jArr[17];
        long j16 = jArr[6] + (jArr[16] << 4);
        jArr[6] = j16;
        long j17 = jArr[16];
        long j18 = j16 + j17 + j17;
        jArr[6] = j18;
        jArr[6] = j18 + jArr[16];
        long j19 = jArr[5] + (jArr[15] << 4);
        jArr[5] = j19;
        long j20 = jArr[15];
        long j21 = j19 + j20 + j20;
        jArr[5] = j21;
        jArr[5] = j21 + jArr[15];
        long j22 = jArr[4] + (jArr[14] << 4);
        jArr[4] = j22;
        long j23 = jArr[14];
        long j24 = j22 + j23 + j23;
        jArr[4] = j24;
        jArr[4] = j24 + jArr[14];
        long j25 = jArr[3] + (jArr[13] << 4);
        jArr[3] = j25;
        long j26 = jArr[13];
        long j27 = j25 + j26 + j26;
        jArr[3] = j27;
        jArr[3] = j27 + jArr[13];
        long j28 = jArr[2] + (jArr[12] << 4);
        jArr[2] = j28;
        long j29 = jArr[12];
        long j30 = j28 + j29 + j29;
        jArr[2] = j30;
        jArr[2] = j30 + jArr[12];
        long j31 = jArr[1] + (jArr[11] << 4);
        jArr[1] = j31;
        long j32 = jArr[11];
        long j33 = j31 + j32 + j32;
        jArr[1] = j33;
        jArr[1] = j33 + jArr[11];
        long j34 = jArr[0] + (jArr[10] << 4);
        jArr[0] = j34;
        long j35 = jArr[10];
        long j36 = j34 + j35 + j35;
        jArr[0] = j36;
        jArr[0] = j36 + jArr[10];
    }

    static void f(long[] jArr, long[] jArr2, long j10) {
        for (int i10 = 0; i10 < 10; i10++) {
            jArr[i10] = jArr2[i10] * j10;
        }
    }

    static void g(long[] jArr, long[] jArr2) {
        long j10 = jArr2[0];
        long j11 = jArr2[0];
        long j12 = jArr2[1];
        long j13 = (j12 * j12) + (jArr2[0] * jArr2[2]);
        long j14 = (jArr2[1] * jArr2[2]) + (jArr2[0] * jArr2[3]);
        long j15 = jArr2[2];
        long j16 = jArr2[1] * 4 * jArr2[3];
        long j17 = jArr2[0];
        long j18 = (j15 * j15) + j16;
        long j19 = (jArr2[2] * jArr2[3]) + (jArr2[1] * jArr2[4]) + (jArr2[0] * jArr2[5]);
        long j20 = jArr2[3];
        long j21 = jArr2[2] * jArr2[4];
        long j22 = jArr2[0] * jArr2[6];
        long j23 = jArr2[1];
        long j24 = (j20 * j20) + j21 + j22 + ((j23 + j23) * jArr2[5]);
        long j25 = (jArr2[3] * jArr2[4]) + (jArr2[2] * jArr2[5]) + (jArr2[1] * jArr2[6]) + (jArr2[0] * jArr2[7]);
        long j26 = jArr2[4];
        long j27 = jArr2[2] * jArr2[6];
        long j28 = jArr2[0] * jArr2[8];
        long j29 = (jArr2[1] * jArr2[7]) + (jArr2[3] * jArr2[5]);
        long j30 = j27 + j28 + j29 + j29;
        long j31 = jArr2[4] * jArr2[5];
        long j32 = jArr2[3] * jArr2[6];
        long j33 = j31 + j32 + (jArr2[2] * jArr2[7]) + (jArr2[1] * jArr2[8]) + (jArr2[0] * jArr2[9]);
        long j34 = jArr2[5];
        long j35 = jArr2[4] * jArr2[6];
        long j36 = jArr2[2] * jArr2[8];
        long j37 = (jArr2[3] * jArr2[7]) + (jArr2[1] * jArr2[9]);
        long j38 = (j34 * j34) + j35 + j36 + j37 + j37;
        long j39 = (jArr2[5] * jArr2[6]) + (jArr2[4] * jArr2[7]) + (jArr2[3] * jArr2[8]) + (jArr2[2] * jArr2[9]);
        long j40 = jArr2[6];
        long j41 = jArr2[4] * jArr2[8];
        long j42 = (jArr2[5] * jArr2[7]) + (jArr2[3] * jArr2[9]);
        long j43 = j41 + j42 + j42;
        long j44 = (jArr2[6] * jArr2[7]) + (jArr2[5] * jArr2[8]) + (jArr2[4] * jArr2[9]);
        long j45 = jArr2[7];
        long j46 = jArr2[6] * jArr2[8];
        long j47 = jArr2[5];
        long j48 = (j45 * j45) + j46 + ((j47 + j47) * jArr2[9]);
        long j49 = (jArr2[7] * jArr2[8]) + (jArr2[6] * jArr2[9]);
        long j50 = jArr2[8];
        long j51 = jArr2[8];
        long j52 = jArr2[9];
        c(new long[]{j10 * j10, (j11 + j11) * jArr2[1], j13 + j13, j14 + j14, j18 + ((j17 + j17) * jArr2[4]), j19 + j19, j24 + j24, j25 + j25, (j26 * j26) + j30 + j30, j33 + j33, j38 + j38, j39 + j39, (j40 * j40) + j43 + j43, j44 + j44, j48 + j48, j49 + j49, (j50 * j50) + (jArr2[7] * 4 * jArr2[9]), (j51 + j51) * jArr2[9], (j52 + j52) * j52}, jArr);
    }

    static void h(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i10 = 0; i10 < 10; i10++) {
            jArr[i10] = jArr2[i10] - jArr3[i10];
        }
    }

    static void i(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i10 = 0; i10 < 10; i10++) {
            jArr[i10] = jArr2[i10] + jArr3[i10];
        }
    }

    static byte[] j(long[] jArr) {
        int i10;
        long[] jArrCopyOf = Arrays.copyOf(jArr, 10);
        int i11 = 0;
        while (true) {
            if (i11 >= 2) {
                break;
            }
            int i12 = 0;
            while (i12 < 9) {
                long j10 = jArrCopyOf[i12];
                int i13 = -((int) (((j10 >> 31) & j10) >> f13422d[i12 & 1]));
                jArrCopyOf[i12] = j10 + (i13 << r12);
                i12++;
                jArrCopyOf[i12] = jArrCopyOf[i12] - i13;
            }
            long j11 = jArrCopyOf[9];
            int i14 = -((int) (((j11 >> 31) & j11) >> 25));
            jArrCopyOf[9] = j11 + (i14 << 25);
            jArrCopyOf[0] = jArrCopyOf[0] - (i14 * 19);
            i11++;
        }
        long j12 = jArrCopyOf[0];
        jArrCopyOf[0] = j12 + (r3 << 26);
        jArrCopyOf[1] = jArrCopyOf[1] - (-((int) (((j12 >> 31) & j12) >> 26)));
        int i15 = 0;
        for (i10 = 2; i15 < i10; i10 = 2) {
            int i16 = 0;
            while (i16 < 9) {
                long j13 = jArrCopyOf[i16];
                long j14 = j13 >> f13422d[i16 & 1];
                jArrCopyOf[i16] = f13421c[r12] & j13;
                i16++;
                jArrCopyOf[i16] = jArrCopyOf[i16] + ((int) j14);
            }
            i15++;
        }
        jArrCopyOf[9] = jArrCopyOf[9] & 33554431;
        jArrCopyOf[0] = jArrCopyOf[0] + (((int) (r7 >> 25)) * 19);
        int i17 = ~((((int) r7) - 67108845) >> 31);
        for (int i18 = 1; i18 < 10; i18++) {
            int i19 = ~(((int) jArrCopyOf[i18]) ^ f13421c[i18 & 1]);
            int i20 = i19 & (i19 << 16);
            int i21 = i20 & (i20 << 8);
            int i22 = i21 & (i21 << 4);
            int i23 = i22 & (i22 << 2);
            i17 &= (i23 & (i23 + i23)) >> 31;
        }
        jArrCopyOf[0] = jArrCopyOf[0] - (67108845 & i17);
        long j15 = 33554431 & i17;
        jArrCopyOf[1] = jArrCopyOf[1] - j15;
        for (int i24 = 2; i24 < 10; i24 += 2) {
            jArrCopyOf[i24] = jArrCopyOf[i24] - (67108863 & i17);
            int i25 = i24 + 1;
            jArrCopyOf[i25] = jArrCopyOf[i25] - j15;
        }
        for (int i26 = 0; i26 < 10; i26++) {
            jArrCopyOf[i26] = jArrCopyOf[i26] << f13420b[i26];
        }
        byte[] bArr = new byte[32];
        for (int i27 = 0; i27 < 10; i27++) {
            int[] iArr = f13419a;
            int i28 = iArr[i27];
            long j16 = bArr[i28];
            long j17 = jArrCopyOf[i27];
            bArr[i28] = (byte) (j16 | (j17 & 255));
            bArr[iArr[i27] + 1] = (byte) (bArr[r5] | ((j17 >> 8) & 255));
            bArr[iArr[i27] + 2] = (byte) (bArr[r5] | ((j17 >> 16) & 255));
            bArr[iArr[i27] + 3] = (byte) (((j17 >> 24) & 255) | bArr[r4]);
        }
        return bArr;
    }

    static long[] k(byte[] bArr) {
        long[] jArr = new long[10];
        for (int i10 = 0; i10 < 10; i10++) {
            int i11 = f13419a[i10];
            jArr[i10] = (((((bArr[i11] & 255) | ((bArr[i11 + 1] & 255) << 8)) | ((bArr[i11 + 2] & 255) << 16)) | ((bArr[i11 + 3] & 255) << 24)) >> f13420b[i10]) & f13421c[i10 & 1];
        }
        return jArr;
    }
}
