package com.google.android.gms.internal.play_billing;

/* loaded from: classes.dex */
abstract class e0 {
    static int a(byte[] bArr, int i10, d0 d0Var) {
        int iH = h(bArr, i10, d0Var);
        int i11 = d0Var.f19472a;
        if (i11 < 0) {
            throw x1.d();
        }
        if (i11 > bArr.length - iH) {
            throw x1.g();
        }
        if (i11 == 0) {
            d0Var.f19474c = q0.f19623n;
            return iH;
        }
        d0Var.f19474c = q0.t(bArr, iH, i11);
        return iH + i11;
    }

    static int b(byte[] bArr, int i10) {
        int i11 = bArr[i10] & 255;
        int i12 = bArr[i10 + 1] & 255;
        int i13 = bArr[i10 + 2] & 255;
        return ((bArr[i10 + 3] & 255) << 24) | (i12 << 8) | i11 | (i13 << 16);
    }

    static int c(f3 f3Var, byte[] bArr, int i10, int i11, int i12, d0 d0Var) {
        Object objC = f3Var.c();
        int iL = l(objC, f3Var, bArr, i10, i11, i12, d0Var);
        f3Var.d(objC);
        d0Var.f19474c = objC;
        return iL;
    }

    static int d(f3 f3Var, byte[] bArr, int i10, int i11, d0 d0Var) {
        Object objC = f3Var.c();
        int iM = m(objC, f3Var, bArr, i10, i11, d0Var);
        f3Var.d(objC);
        d0Var.f19474c = objC;
        return iM;
    }

    static int e(f3 f3Var, int i10, byte[] bArr, int i11, int i12, u1 u1Var, d0 d0Var) {
        int iD = d(f3Var, bArr, i11, i12, d0Var);
        while (true) {
            u1Var.add(d0Var.f19474c);
            if (iD >= i12) {
                break;
            }
            int iH = h(bArr, iD, d0Var);
            if (i10 != d0Var.f19472a) {
                break;
            }
            iD = d(f3Var, bArr, iH, i12, d0Var);
        }
        return iD;
    }

    static int f(byte[] bArr, int i10, u1 u1Var, d0 d0Var) {
        o1 o1Var = (o1) u1Var;
        int iH = h(bArr, i10, d0Var);
        int i11 = d0Var.f19472a + iH;
        while (iH < i11) {
            iH = h(bArr, iH, d0Var);
            o1Var.i(d0Var.f19472a);
        }
        if (iH == i11) {
            return iH;
        }
        throw x1.g();
    }

    static int g(int i10, byte[] bArr, int i11, int i12, w3 w3Var, d0 d0Var) {
        if ((i10 >>> 3) == 0) {
            throw x1.b();
        }
        int i13 = i10 & 7;
        if (i13 == 0) {
            int iK = k(bArr, i11, d0Var);
            w3Var.j(i10, Long.valueOf(d0Var.f19473b));
            return iK;
        }
        if (i13 == 1) {
            w3Var.j(i10, Long.valueOf(n(bArr, i11)));
            return i11 + 8;
        }
        if (i13 == 2) {
            int iH = h(bArr, i11, d0Var);
            int i14 = d0Var.f19472a;
            if (i14 < 0) {
                throw x1.d();
            }
            if (i14 > bArr.length - iH) {
                throw x1.g();
            }
            w3Var.j(i10, i14 == 0 ? q0.f19623n : q0.t(bArr, iH, i14));
            return iH + i14;
        }
        if (i13 != 3) {
            if (i13 != 5) {
                throw x1.b();
            }
            w3Var.j(i10, Integer.valueOf(b(bArr, i11)));
            return i11 + 4;
        }
        int i15 = (i10 & (-8)) | 4;
        w3 w3VarF = w3.f();
        int i16 = 0;
        while (true) {
            if (i11 >= i12) {
                break;
            }
            int iH2 = h(bArr, i11, d0Var);
            int i17 = d0Var.f19472a;
            i16 = i17;
            if (i17 == i15) {
                i11 = iH2;
                break;
            }
            int iG = g(i16, bArr, iH2, i12, w3VarF, d0Var);
            i16 = i17;
            i11 = iG;
        }
        if (i11 > i12 || i16 != i15) {
            throw x1.e();
        }
        w3Var.j(i10, w3VarF);
        return i11;
    }

    static int h(byte[] bArr, int i10, d0 d0Var) {
        int i11 = i10 + 1;
        byte b10 = bArr[i10];
        if (b10 < 0) {
            return i(b10, bArr, i11, d0Var);
        }
        d0Var.f19472a = b10;
        return i11;
    }

    static int i(int i10, byte[] bArr, int i11, d0 d0Var) {
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
                                d0Var.f19472a = i18;
                                return i19;
                            }
                            i17 = i19;
                        }
                    }
                }
            }
            d0Var.f19472a = i16 | i12;
            return i17;
        }
        i13 = b10 << 7;
        d0Var.f19472a = i15 | i13;
        return i14;
    }

    static int j(int i10, byte[] bArr, int i11, int i12, u1 u1Var, d0 d0Var) {
        o1 o1Var = (o1) u1Var;
        int iH = h(bArr, i11, d0Var);
        while (true) {
            o1Var.i(d0Var.f19472a);
            if (iH >= i12) {
                break;
            }
            int iH2 = h(bArr, iH, d0Var);
            if (i10 != d0Var.f19472a) {
                break;
            }
            iH = h(bArr, iH2, d0Var);
        }
        return iH;
    }

    static int k(byte[] bArr, int i10, d0 d0Var) {
        long j10 = bArr[i10];
        int i11 = i10 + 1;
        if (j10 >= 0) {
            d0Var.f19473b = j10;
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
        d0Var.f19473b = j11;
        return i12;
    }

    static int l(Object obj, f3 f3Var, byte[] bArr, int i10, int i11, int i12, d0 d0Var) {
        int iY = ((x2) f3Var).y(obj, bArr, i10, i11, i12, d0Var);
        d0Var.f19474c = obj;
        return iY;
    }

    static int m(Object obj, f3 f3Var, byte[] bArr, int i10, int i11, d0 d0Var) {
        int i12 = i10 + 1;
        int i13 = bArr[i10];
        if (i13 < 0) {
            i12 = i(i13, bArr, i12, d0Var);
            i13 = d0Var.f19472a;
        }
        int i14 = i12;
        if (i13 < 0 || i13 > i11 - i14) {
            throw x1.g();
        }
        int i15 = i13 + i14;
        f3Var.i(obj, bArr, i14, i15, d0Var);
        d0Var.f19474c = obj;
        return i15;
    }

    static long n(byte[] bArr, int i10) {
        return (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16) | ((bArr[i10 + 3] & 255) << 24) | ((bArr[i10 + 4] & 255) << 32) | ((bArr[i10 + 5] & 255) << 40) | ((bArr[i10 + 6] & 255) << 48) | ((bArr[i10 + 7] & 255) << 56);
    }
}
