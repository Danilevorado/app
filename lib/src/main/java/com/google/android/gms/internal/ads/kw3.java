package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
abstract class kw3 {
    static int a(byte[] bArr, int i10, jw3 jw3Var) {
        int iJ = j(bArr, i10, jw3Var);
        int i11 = jw3Var.f10732a;
        if (i11 < 0) {
            throw ny3.f();
        }
        if (i11 > bArr.length - iJ) {
            throw ny3.k();
        }
        if (i11 == 0) {
            jw3Var.f10734c = ww3.f17284n;
            return iJ;
        }
        jw3Var.f10734c = ww3.I(bArr, iJ, i11);
        return iJ + i11;
    }

    static int b(byte[] bArr, int i10) {
        int i11 = bArr[i10] & 255;
        int i12 = bArr[i10 + 1] & 255;
        int i13 = bArr[i10 + 2] & 255;
        return ((bArr[i10 + 3] & 255) << 24) | (i12 << 8) | i11 | (i13 << 16);
    }

    static int c(d04 d04Var, byte[] bArr, int i10, int i11, int i12, jw3 jw3Var) {
        Object objC = d04Var.c();
        int iN = n(objC, d04Var, bArr, i10, i11, i12, jw3Var);
        d04Var.d(objC);
        jw3Var.f10734c = objC;
        return iN;
    }

    static int d(d04 d04Var, byte[] bArr, int i10, int i11, jw3 jw3Var) {
        Object objC = d04Var.c();
        int iO = o(objC, d04Var, bArr, i10, i11, jw3Var);
        d04Var.d(objC);
        jw3Var.f10734c = objC;
        return iO;
    }

    static int e(d04 d04Var, int i10, byte[] bArr, int i11, int i12, ky3 ky3Var, jw3 jw3Var) {
        int iD = d(d04Var, bArr, i11, i12, jw3Var);
        while (true) {
            ky3Var.add(jw3Var.f10734c);
            if (iD >= i12) {
                break;
            }
            int iJ = j(bArr, iD, jw3Var);
            if (i10 != jw3Var.f10732a) {
                break;
            }
            iD = d(d04Var, bArr, iJ, i12, jw3Var);
        }
        return iD;
    }

    static int f(byte[] bArr, int i10, ky3 ky3Var, jw3 jw3Var) {
        cy3 cy3Var = (cy3) ky3Var;
        int iJ = j(bArr, i10, jw3Var);
        int i11 = jw3Var.f10732a + iJ;
        while (iJ < i11) {
            iJ = j(bArr, iJ, jw3Var);
            cy3Var.X(jw3Var.f10732a);
        }
        if (iJ == i11) {
            return iJ;
        }
        throw ny3.k();
    }

    static int g(byte[] bArr, int i10, jw3 jw3Var) throws ny3 {
        int iJ = j(bArr, i10, jw3Var);
        int i11 = jw3Var.f10732a;
        if (i11 < 0) {
            throw ny3.f();
        }
        if (i11 == 0) {
            jw3Var.f10734c = "";
            return iJ;
        }
        jw3Var.f10734c = new String(bArr, iJ, i11, ly3.f11869b);
        return iJ + i11;
    }

    static int h(byte[] bArr, int i10, jw3 jw3Var) throws ny3 {
        int iJ = j(bArr, i10, jw3Var);
        int i11 = jw3Var.f10732a;
        if (i11 < 0) {
            throw ny3.f();
        }
        if (i11 == 0) {
            jw3Var.f10734c = "";
            return iJ;
        }
        jw3Var.f10734c = y04.h(bArr, iJ, i11);
        return iJ + i11;
    }

    static int i(int i10, byte[] bArr, int i11, int i12, j04 j04Var, jw3 jw3Var) {
        if ((i10 >>> 3) == 0) {
            throw ny3.c();
        }
        int i13 = i10 & 7;
        if (i13 == 0) {
            int iM = m(bArr, i11, jw3Var);
            j04Var.j(i10, Long.valueOf(jw3Var.f10733b));
            return iM;
        }
        if (i13 == 1) {
            j04Var.j(i10, Long.valueOf(p(bArr, i11)));
            return i11 + 8;
        }
        if (i13 == 2) {
            int iJ = j(bArr, i11, jw3Var);
            int i14 = jw3Var.f10732a;
            if (i14 < 0) {
                throw ny3.f();
            }
            if (i14 > bArr.length - iJ) {
                throw ny3.k();
            }
            j04Var.j(i10, i14 == 0 ? ww3.f17284n : ww3.I(bArr, iJ, i14));
            return iJ + i14;
        }
        if (i13 != 3) {
            if (i13 != 5) {
                throw ny3.c();
            }
            j04Var.j(i10, Integer.valueOf(b(bArr, i11)));
            return i11 + 4;
        }
        int i15 = (i10 & (-8)) | 4;
        j04 j04VarF = j04.f();
        int i16 = 0;
        while (true) {
            if (i11 >= i12) {
                break;
            }
            int iJ2 = j(bArr, i11, jw3Var);
            int i17 = jw3Var.f10732a;
            i16 = i17;
            if (i17 == i15) {
                i11 = iJ2;
                break;
            }
            int i18 = i(i16, bArr, iJ2, i12, j04VarF, jw3Var);
            i16 = i17;
            i11 = i18;
        }
        if (i11 > i12 || i16 != i15) {
            throw ny3.g();
        }
        j04Var.j(i10, j04VarF);
        return i11;
    }

    static int j(byte[] bArr, int i10, jw3 jw3Var) {
        int i11 = i10 + 1;
        byte b10 = bArr[i10];
        if (b10 < 0) {
            return k(b10, bArr, i11, jw3Var);
        }
        jw3Var.f10732a = b10;
        return i11;
    }

    static int k(int i10, byte[] bArr, int i11, jw3 jw3Var) {
        int i12;
        int i13;
        byte b10 = bArr[i11];
        int i14 = i11 + 1;
        int i15 = i10 & 127;
        if (b10 < 0) {
            int i16 = i15 | ((b10 & Byte.MAX_VALUE) << 7);
            int i17 = i14 + 1;
            byte b11 = bArr[i14];
            if (b11 >= 0) {
                i12 = b11 << 14;
            } else {
                i15 = i16 | ((b11 & Byte.MAX_VALUE) << 14);
                i14 = i17 + 1;
                byte b12 = bArr[i17];
                if (b12 >= 0) {
                    i13 = b12 << 21;
                } else {
                    i16 = i15 | ((b12 & Byte.MAX_VALUE) << 21);
                    i17 = i14 + 1;
                    byte b13 = bArr[i14];
                    if (b13 >= 0) {
                        i12 = b13 << 28;
                    } else {
                        int i18 = i16 | ((b13 & Byte.MAX_VALUE) << 28);
                        while (true) {
                            int i19 = i17 + 1;
                            if (bArr[i17] >= 0) {
                                jw3Var.f10732a = i18;
                                return i19;
                            }
                            i17 = i19;
                        }
                    }
                }
            }
            jw3Var.f10732a = i16 | i12;
            return i17;
        }
        i13 = b10 << 7;
        jw3Var.f10732a = i15 | i13;
        return i14;
    }

    static int l(int i10, byte[] bArr, int i11, int i12, ky3 ky3Var, jw3 jw3Var) {
        cy3 cy3Var = (cy3) ky3Var;
        int iJ = j(bArr, i11, jw3Var);
        while (true) {
            cy3Var.X(jw3Var.f10732a);
            if (iJ >= i12) {
                break;
            }
            int iJ2 = j(bArr, iJ, jw3Var);
            if (i10 != jw3Var.f10732a) {
                break;
            }
            iJ = j(bArr, iJ2, jw3Var);
        }
        return iJ;
    }

    static int m(byte[] bArr, int i10, jw3 jw3Var) {
        long j10 = bArr[i10];
        int i11 = i10 + 1;
        if (j10 >= 0) {
            jw3Var.f10733b = j10;
            return i11;
        }
        int i12 = i11 + 1;
        byte b10 = bArr[i11];
        long j11 = (j10 & 127) | ((b10 & Byte.MAX_VALUE) << 7);
        int i13 = 7;
        while (b10 < 0) {
            int i14 = i12 + 1;
            byte b11 = bArr[i12];
            i13 += 7;
            j11 |= (b11 & Byte.MAX_VALUE) << i13;
            i12 = i14;
            b10 = b11;
        }
        jw3Var.f10733b = j11;
        return i12;
    }

    static int n(Object obj, d04 d04Var, byte[] bArr, int i10, int i11, int i12, jw3 jw3Var) {
        int iK = ((mz3) d04Var).K(obj, bArr, i10, i11, i12, jw3Var);
        jw3Var.f10734c = obj;
        return iK;
    }

    static int o(Object obj, d04 d04Var, byte[] bArr, int i10, int i11, jw3 jw3Var) {
        int iK = i10 + 1;
        int i12 = bArr[i10];
        if (i12 < 0) {
            iK = k(i12, bArr, iK, jw3Var);
            i12 = jw3Var.f10732a;
        }
        int i13 = iK;
        if (i12 < 0 || i12 > i11 - i13) {
            throw ny3.k();
        }
        int i14 = i12 + i13;
        d04Var.i(obj, bArr, i13, i14, jw3Var);
        jw3Var.f10734c = obj;
        return i14;
    }

    static long p(byte[] bArr, int i10) {
        return (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16) | ((bArr[i10 + 3] & 255) << 24) | ((bArr[i10 + 4] & 255) << 32) | ((bArr[i10 + 5] & 255) << 40) | ((bArr[i10 + 6] & 255) << 48) | ((bArr[i10 + 7] & 255) << 56);
    }
}
