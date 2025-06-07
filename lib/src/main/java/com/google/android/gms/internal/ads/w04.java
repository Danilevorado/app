package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class w04 extends v04 {
    w04() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001c, code lost:
    
        if (r13[r14] <= (-65)) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0047, code lost:
    
        if (r13[r14] <= (-65)) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0083, code lost:
    
        if (r13[r14] <= (-65)) goto L11;
     */
    @Override // com.google.android.gms.internal.ads.v04
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final int a(int r12, byte[] r13, int r14, int r15) {
        /*
            Method dump skipped, instructions count: 241
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.w04.a(int, byte[], int, int):int");
    }

    @Override // com.google.android.gms.internal.ads.v04
    final String b(byte[] bArr, int i10, int i11) throws ny3 {
        int length = bArr.length;
        if ((((length - i10) - i11) | i10 | i11) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(i10), Integer.valueOf(i11)));
        }
        int i12 = i10 + i11;
        char[] cArr = new char[i11];
        int i13 = 0;
        while (i10 < i12) {
            byte b10 = bArr[i10];
            if (!u04.d(b10)) {
                break;
            }
            i10++;
            cArr[i13] = (char) b10;
            i13++;
        }
        while (i10 < i12) {
            int i14 = i10 + 1;
            byte b11 = bArr[i10];
            if (u04.d(b11)) {
                int i15 = i13 + 1;
                cArr[i13] = (char) b11;
                i10 = i14;
                while (true) {
                    i13 = i15;
                    if (i10 < i12) {
                        byte b12 = bArr[i10];
                        if (u04.d(b12)) {
                            i10++;
                            i15 = i13 + 1;
                            cArr[i13] = (char) b12;
                        }
                    }
                }
            } else if (u04.f(b11)) {
                if (i14 >= i12) {
                    throw ny3.d();
                }
                u04.c(b11, bArr[i14], cArr, i13);
                i10 = i14 + 1;
                i13++;
            } else if (u04.e(b11)) {
                if (i14 >= i12 - 1) {
                    throw ny3.d();
                }
                int i16 = i14 + 1;
                u04.b(b11, bArr[i14], bArr[i16], cArr, i13);
                i10 = i16 + 1;
                i13++;
            } else {
                if (i14 >= i12 - 2) {
                    throw ny3.d();
                }
                int i17 = i14 + 1;
                byte b13 = bArr[i14];
                int i18 = i17 + 1;
                u04.a(b11, b13, bArr[i17], bArr[i18], cArr, i13);
                i13 += 2;
                i10 = i18 + 1;
            }
        }
        return new String(cArr, 0, i13);
    }
}
