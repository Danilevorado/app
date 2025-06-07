package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
abstract class l53 {
    static int a(int i10) {
        return (i10 < 32 ? 4 : 2) * (i10 + 1);
    }

    static int b(Object obj, Object obj2, int i10, Object obj3, int[] iArr, Object[] objArr, Object[] objArr2) {
        int i11;
        int i12;
        int iB = u53.b(obj);
        int i13 = iB & i10;
        int iC = c(obj3, i13);
        if (iC != 0) {
            int i14 = ~i10;
            int i15 = iB & i14;
            int i16 = -1;
            while (true) {
                i11 = iC - 1;
                i12 = iArr[i11];
                if ((i12 & i14) != i15 || !d33.a(obj, objArr[i11]) || (objArr2 != null && !d33.a(obj2, objArr2[i11]))) {
                    int i17 = i12 & i10;
                    if (i17 == 0) {
                        break;
                    }
                    i16 = i11;
                    iC = i17;
                } else {
                    break;
                }
            }
            int i18 = i12 & i10;
            if (i16 == -1) {
                e(obj3, i13, i18);
            } else {
                iArr[i16] = (i18 & i10) | (iArr[i16] & i14);
            }
            return i11;
        }
        return -1;
    }

    static int c(Object obj, int i10) {
        return obj instanceof byte[] ? ((byte[]) obj)[i10] & 255 : obj instanceof short[] ? (char) ((short[]) obj)[i10] : ((int[]) obj)[i10];
    }

    static Object d(int i10) {
        if (i10 >= 2 && i10 <= 1073741824 && Integer.highestOneBit(i10) == i10) {
            return i10 <= 256 ? new byte[i10] : i10 <= 65536 ? new short[i10] : new int[i10];
        }
        throw new IllegalArgumentException("must be power of 2 between 2^1 and 2^30: " + i10);
    }

    static void e(Object obj, int i10, int i11) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i10] = (byte) i11;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i10] = (short) i11;
        } else {
            ((int[]) obj)[i10] = i11;
        }
    }
}
