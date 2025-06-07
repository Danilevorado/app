package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Locale;

/* loaded from: classes.dex */
public abstract class i3 {

    /* renamed from: a, reason: collision with root package name */
    public static final g3 f9492a = new g3() { // from class: com.google.android.gms.internal.ads.e3
    };

    /* JADX WARN: Removed duplicated region for block: B:30:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final com.google.android.gms.internal.ads.ld0 a(byte[] r11, int r12, com.google.android.gms.internal.ads.g3 r13, com.google.android.gms.internal.ads.i2 r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 275
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.i3.a(byte[], int, com.google.android.gms.internal.ads.g3, com.google.android.gms.internal.ads.i2):com.google.android.gms.internal.ads.ld0");
    }

    private static int b(int i10) {
        return (i10 == 0 || i10 == 3) ? 1 : 2;
    }

    private static int c(byte[] bArr, int i10, int i11) {
        int iD = d(bArr, i10);
        if (i11 == 0 || i11 == 3) {
            return iD;
        }
        while (true) {
            int length = bArr.length;
            if (iD >= length - 1) {
                return length;
            }
            if ((iD - i10) % 2 == 0 && bArr[iD + 1] == 0) {
                return iD;
            }
            iD = d(bArr, iD + 1);
        }
    }

    private static int d(byte[] bArr, int i10) {
        while (true) {
            int length = bArr.length;
            if (i10 >= length) {
                return length;
            }
            if (bArr[i10] == 0) {
                return i10;
            }
            i10++;
        }
    }

    private static int e(jm2 jm2Var, int i10) {
        byte[] bArrH = jm2Var.h();
        int iK = jm2Var.k();
        int i11 = iK;
        while (true) {
            int i12 = i11 + 1;
            if (i12 >= iK + i10) {
                return i10;
            }
            if ((bArrH[i11] & 255) == 255 && bArrH[i12] == 0) {
                System.arraycopy(bArrH, i11 + 2, bArrH, i12, (i10 - (i11 - iK)) - 2);
                i10--;
            }
            i11 = i12;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:130:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0279 A[Catch: all -> 0x0511, TryCatch #0 {all -> 0x0511, blocks: (B:224:0x04ec, B:125:0x0211, B:141:0x0267, B:143:0x0279, B:150:0x02ba, B:147:0x029b, B:149:0x02b4, B:162:0x02fc, B:171:0x0343, B:174:0x0378, B:177:0x0389, B:178:0x0391, B:180:0x0397, B:182:0x039e, B:183:0x03a2, B:190:0x03c4, B:194:0x03f1, B:196:0x03fb, B:197:0x042e, B:198:0x043a, B:200:0x0440, B:202:0x0447, B:203:0x044b, B:207:0x0460, B:216:0x048b, B:218:0x04b5, B:219:0x04c4, B:222:0x04db), top: B:236:0x00ed }] */
    /* JADX WARN: Removed duplicated region for block: B:147:0x029b A[Catch: all -> 0x0511, TryCatch #0 {all -> 0x0511, blocks: (B:224:0x04ec, B:125:0x0211, B:141:0x0267, B:143:0x0279, B:150:0x02ba, B:147:0x029b, B:149:0x02b4, B:162:0x02fc, B:171:0x0343, B:174:0x0378, B:177:0x0389, B:178:0x0391, B:180:0x0397, B:182:0x039e, B:183:0x03a2, B:190:0x03c4, B:194:0x03f1, B:196:0x03fb, B:197:0x042e, B:198:0x043a, B:200:0x0440, B:202:0x0447, B:203:0x044b, B:207:0x0460, B:216:0x048b, B:218:0x04b5, B:219:0x04c4, B:222:0x04db), top: B:236:0x00ed }] */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0471  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0479  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x04d5  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x04ec A[Catch: all -> 0x0511, TRY_LEAVE, TryCatch #0 {all -> 0x0511, blocks: (B:224:0x04ec, B:125:0x0211, B:141:0x0267, B:143:0x0279, B:150:0x02ba, B:147:0x029b, B:149:0x02b4, B:162:0x02fc, B:171:0x0343, B:174:0x0378, B:177:0x0389, B:178:0x0391, B:180:0x0397, B:182:0x039e, B:183:0x03a2, B:190:0x03c4, B:194:0x03f1, B:196:0x03fb, B:197:0x042e, B:198:0x043a, B:200:0x0440, B:202:0x0447, B:203:0x044b, B:207:0x0460, B:216:0x048b, B:218:0x04b5, B:219:0x04c4, B:222:0x04db), top: B:236:0x00ed }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static com.google.android.gms.internal.ads.j3 f(int r35, com.google.android.gms.internal.ads.jm2 r36, boolean r37, int r38, com.google.android.gms.internal.ads.g3 r39) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1327
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.i3.f(int, com.google.android.gms.internal.ads.jm2, boolean, int, com.google.android.gms.internal.ads.g3):com.google.android.gms.internal.ads.j3");
    }

    private static c63 g(byte[] bArr, int i10, int i11) {
        if (i11 >= bArr.length) {
            return c63.v("");
        }
        z53 z53Var = new z53();
        while (true) {
            int iC = c(bArr, i11, i10);
            if (i11 >= iC) {
                break;
            }
            z53Var.g(new String(bArr, i11, iC - i11, j(i10)));
            i11 = b(i10) + iC;
        }
        c63 c63VarJ = z53Var.j();
        return c63VarJ.isEmpty() ? c63.v("") : c63VarJ;
    }

    private static String h(byte[] bArr, int i10, int i11, Charset charset) {
        return (i11 <= i10 || i11 > bArr.length) ? "" : new String(bArr, i10, i11 - i10, charset);
    }

    private static String i(int i10, int i11, int i12, int i13, int i14) {
        return i10 == 2 ? String.format(Locale.US, "%c%c%c", Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13)) : String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13), Integer.valueOf(i14));
    }

    private static Charset j(int i10) {
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? u23.f16141b : u23.f16142c : u23.f16143d : u23.f16145f;
    }

    private static boolean k(jm2 jm2Var, int i10, int i11, boolean z10) {
        int iU;
        long jU;
        int iW;
        int i12;
        int iK = jm2Var.k();
        while (true) {
            try {
                if (jm2Var.i() < i11) {
                    return true;
                }
                if (i10 >= 3) {
                    iU = jm2Var.m();
                    jU = jm2Var.A();
                    iW = jm2Var.w();
                } else {
                    iU = jm2Var.u();
                    jU = jm2Var.u();
                    iW = 0;
                }
                if (iU == 0 && jU == 0 && iW == 0) {
                    return true;
                }
                if (i10 == 4 && !z10) {
                    if ((8421504 & jU) != 0) {
                        return false;
                    }
                    jU = ((jU >> 24) << 21) | (((jU >> 16) & 255) << 14) | (jU & 255) | (((jU >> 8) & 255) << 7);
                }
                if (i10 == 4) {
                    i = iW & 1;
                    i12 = (iW & 64) == 0 ? 0 : 1;
                } else if (i10 == 3) {
                    i12 = (iW & 32) != 0 ? 1 : 0;
                    if ((iW & 128) == 0) {
                        i = 0;
                    }
                } else {
                    i12 = 0;
                    i = 0;
                }
                if (i != 0) {
                    i12 += 4;
                }
                if (jU < i12) {
                    return false;
                }
                if (jm2Var.i() < jU) {
                    return false;
                }
                jm2Var.g((int) jU);
            } finally {
                jm2Var.f(iK);
            }
        }
    }

    private static byte[] l(byte[] bArr, int i10, int i11) {
        return i11 <= i10 ? sv2.f15565f : Arrays.copyOfRange(bArr, i10, i11);
    }
}
