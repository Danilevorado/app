package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
abstract class l7 {
    static int a(byte[] bArr, int i10, k7 k7Var) {
        int iJ = j(bArr, i10, k7Var);
        int i11 = k7Var.f19048a;
        if (i11 < 0) {
            throw d9.d();
        }
        if (i11 > bArr.length - iJ) {
            throw d9.f();
        }
        if (i11 == 0) {
            k7Var.f19050c = x7.f19398n;
            return iJ;
        }
        k7Var.f19050c = x7.t(bArr, iJ, i11);
        return iJ + i11;
    }

    static int b(byte[] bArr, int i10) {
        return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
    }

    static int c(ja jaVar, byte[] bArr, int i10, int i11, int i12, k7 k7Var) {
        ba baVar = (ba) jaVar;
        Object objC = baVar.c();
        int iD = baVar.D(objC, bArr, i10, i11, i12, k7Var);
        baVar.d(objC);
        k7Var.f19050c = objC;
        return iD;
    }

    static int d(ja jaVar, byte[] bArr, int i10, int i11, k7 k7Var) {
        int iK = i10 + 1;
        int i12 = bArr[i10];
        if (i12 < 0) {
            iK = k(i12, bArr, iK, k7Var);
            i12 = k7Var.f19048a;
        }
        int i13 = iK;
        if (i12 < 0 || i12 > i11 - i13) {
            throw d9.f();
        }
        Object objC = jaVar.c();
        int i14 = i12 + i13;
        jaVar.i(objC, bArr, i13, i14, k7Var);
        jaVar.d(objC);
        k7Var.f19050c = objC;
        return i14;
    }

    static int e(ja jaVar, int i10, byte[] bArr, int i11, int i12, a9 a9Var, k7 k7Var) {
        int iD = d(jaVar, bArr, i11, i12, k7Var);
        while (true) {
            a9Var.add(k7Var.f19050c);
            if (iD >= i12) {
                break;
            }
            int iJ = j(bArr, iD, k7Var);
            if (i10 != k7Var.f19048a) {
                break;
            }
            iD = d(jaVar, bArr, iJ, i12, k7Var);
        }
        return iD;
    }

    static int f(byte[] bArr, int i10, a9 a9Var, k7 k7Var) {
        v8 v8Var = (v8) a9Var;
        int iJ = j(bArr, i10, k7Var);
        int i11 = k7Var.f19048a + iJ;
        while (iJ < i11) {
            iJ = j(bArr, iJ, k7Var);
            v8Var.X(k7Var.f19048a);
        }
        if (iJ == i11) {
            return iJ;
        }
        throw d9.f();
    }

    static int g(byte[] bArr, int i10, k7 k7Var) throws d9 {
        int iJ = j(bArr, i10, k7Var);
        int i11 = k7Var.f19048a;
        if (i11 < 0) {
            throw d9.d();
        }
        if (i11 == 0) {
            k7Var.f19050c = "";
            return iJ;
        }
        k7Var.f19050c = new String(bArr, iJ, i11, b9.f18840b);
        return iJ + i11;
    }

    static int h(byte[] bArr, int i10, k7 k7Var) throws d9 {
        int iJ = j(bArr, i10, k7Var);
        int i11 = k7Var.f19048a;
        if (i11 < 0) {
            throw d9.d();
        }
        if (i11 == 0) {
            k7Var.f19050c = "";
            return iJ;
        }
        k7Var.f19050c = fb.d(bArr, iJ, i11);
        return iJ + i11;
    }

    static int i(int i10, byte[] bArr, int i11, int i12, qa qaVar, k7 k7Var) {
        if ((i10 >>> 3) == 0) {
            throw d9.b();
        }
        int i13 = i10 & 7;
        if (i13 == 0) {
            int iM = m(bArr, i11, k7Var);
            qaVar.h(i10, Long.valueOf(k7Var.f19049b));
            return iM;
        }
        if (i13 == 1) {
            qaVar.h(i10, Long.valueOf(n(bArr, i11)));
            return i11 + 8;
        }
        if (i13 == 2) {
            int iJ = j(bArr, i11, k7Var);
            int i14 = k7Var.f19048a;
            if (i14 < 0) {
                throw d9.d();
            }
            if (i14 > bArr.length - iJ) {
                throw d9.f();
            }
            qaVar.h(i10, i14 == 0 ? x7.f19398n : x7.t(bArr, iJ, i14));
            return iJ + i14;
        }
        if (i13 != 3) {
            if (i13 != 5) {
                throw d9.b();
            }
            qaVar.h(i10, Integer.valueOf(b(bArr, i11)));
            return i11 + 4;
        }
        int i15 = (i10 & (-8)) | 4;
        qa qaVarE = qa.e();
        int i16 = 0;
        while (true) {
            if (i11 >= i12) {
                break;
            }
            int iJ2 = j(bArr, i11, k7Var);
            int i17 = k7Var.f19048a;
            i16 = i17;
            if (i17 == i15) {
                i11 = iJ2;
                break;
            }
            int i18 = i(i16, bArr, iJ2, i12, qaVarE, k7Var);
            i16 = i17;
            i11 = i18;
        }
        if (i11 > i12 || i16 != i15) {
            throw d9.e();
        }
        qaVar.h(i10, qaVarE);
        return i11;
    }

    static int j(byte[] bArr, int i10, k7 k7Var) {
        int i11 = i10 + 1;
        byte b10 = bArr[i10];
        if (b10 < 0) {
            return k(b10, bArr, i11, k7Var);
        }
        k7Var.f19048a = b10;
        return i11;
    }

    static int k(int i10, byte[] bArr, int i11, k7 k7Var) {
        int i12;
        int i13;
        int i14 = i10 & 127;
        int i15 = i11 + 1;
        byte b10 = bArr[i11];
        if (b10 < 0) {
            int i16 = i14 | ((b10 & Byte.MAX_VALUE) << 7);
            int i17 = i15 + 1;
            byte b11 = bArr[i15];
            if (b11 >= 0) {
                i12 = b11 << 14;
            } else {
                i14 = i16 | ((b11 & Byte.MAX_VALUE) << 14);
                i15 = i17 + 1;
                byte b12 = bArr[i17];
                if (b12 >= 0) {
                    i13 = b12 << 21;
                } else {
                    i16 = i14 | ((b12 & Byte.MAX_VALUE) << 21);
                    i17 = i15 + 1;
                    byte b13 = bArr[i15];
                    if (b13 >= 0) {
                        i12 = b13 << 28;
                    } else {
                        int i18 = i16 | ((b13 & Byte.MAX_VALUE) << 28);
                        while (true) {
                            int i19 = i17 + 1;
                            if (bArr[i17] >= 0) {
                                k7Var.f19048a = i18;
                                return i19;
                            }
                            i17 = i19;
                        }
                    }
                }
            }
            k7Var.f19048a = i16 | i12;
            return i17;
        }
        i13 = b10 << 7;
        k7Var.f19048a = i14 | i13;
        return i15;
    }

    static int l(int i10, byte[] bArr, int i11, int i12, a9 a9Var, k7 k7Var) {
        v8 v8Var = (v8) a9Var;
        int iJ = j(bArr, i11, k7Var);
        while (true) {
            v8Var.X(k7Var.f19048a);
            if (iJ >= i12) {
                break;
            }
            int iJ2 = j(bArr, iJ, k7Var);
            if (i10 != k7Var.f19048a) {
                break;
            }
            iJ = j(bArr, iJ2, k7Var);
        }
        return iJ;
    }

    static int m(byte[] bArr, int i10, k7 k7Var) {
        int i11 = i10 + 1;
        long j10 = bArr[i10];
        if (j10 >= 0) {
            k7Var.f19049b = j10;
            return i11;
        }
        int i12 = i11 + 1;
        byte b10 = bArr[i11];
        long j11 = (j10 & 127) | ((b10 & Byte.MAX_VALUE) << 7);
        int i13 = 7;
        while (b10 < 0) {
            int i14 = i12 + 1;
            i13 += 7;
            j11 |= (r10 & Byte.MAX_VALUE) << i13;
            b10 = bArr[i12];
            i12 = i14;
        }
        k7Var.f19049b = j11;
        return i12;
    }

    static long n(byte[] bArr, int i10) {
        return ((bArr[i10 + 7] & 255) << 56) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16) | ((bArr[i10 + 3] & 255) << 24) | ((bArr[i10 + 4] & 255) << 32) | ((bArr[i10 + 5] & 255) << 40) | ((bArr[i10 + 6] & 255) << 48);
    }
}
