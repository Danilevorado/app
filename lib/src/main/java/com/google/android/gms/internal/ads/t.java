package com.google.android.gms.internal.ads;

import com.facebook.ads.NativeAdScrollView;
import com.facebook.ads.internal.api.AdSizeApi;
import java.io.EOFException;
import java.io.InterruptedIOException;

/* loaded from: classes.dex */
public abstract class t {
    public static int a(jm2 jm2Var, int i10) {
        switch (i10) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i10 - 2);
            case 6:
                return jm2Var.s() + 1;
            case AdSizeApi.RECTANGLE_HEIGHT_250 /* 7 */:
                return jm2Var.w() + 1;
            case 8:
            case 9:
            case NativeAdScrollView.DEFAULT_MAX_ADS /* 10 */:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return 256 << (i10 - 8);
            default:
                return -1;
        }
    }

    public static long b(l lVar, x xVar) throws oh0, EOFException, InterruptedIOException {
        lVar.j();
        bo4 bo4Var = (bo4) lVar;
        bo4Var.g(1, false);
        byte[] bArr = new byte[1];
        bo4Var.E(bArr, 0, 1, false);
        int i10 = bArr[0] & 1;
        boolean z10 = 1 == i10;
        bo4Var.g(2, false);
        int i11 = 1 != i10 ? 6 : 7;
        jm2 jm2Var = new jm2(i11);
        jm2Var.e(o.a(lVar, jm2Var.h(), 0, i11));
        lVar.j();
        s sVar = new s();
        if (d(jm2Var, xVar, z10, sVar)) {
            return sVar.f15024a;
        }
        throw oh0.a(null, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x009b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean c(com.google.android.gms.internal.ads.jm2 r21, com.google.android.gms.internal.ads.x r22, int r23, com.google.android.gms.internal.ads.s r24) {
        /*
            r0 = r21
            r1 = r22
            int r2 = r21.k()
            long r3 = r21.A()
            r5 = 16
            long r5 = r3 >>> r5
            r7 = r23
            long r7 = (long) r7
            int r7 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            r8 = 0
            if (r7 == 0) goto L19
            return r8
        L19:
            r9 = 1
            long r5 = r5 & r9
            int r5 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            r6 = 1
            if (r5 != 0) goto L23
            r5 = r6
            goto L24
        L23:
            r5 = r8
        L24:
            r7 = 12
            long r11 = r3 >> r7
            r13 = 8
            long r13 = r3 >> r13
            r15 = 4
            long r15 = r3 >> r15
            long r17 = r3 >> r6
            long r3 = r3 & r9
            r19 = 15
            long r6 = r15 & r19
            int r6 = (int) r6
            r7 = 7
            r15 = -1
            if (r6 > r7) goto L41
            int r7 = r1.f17315g
            int r7 = r7 + r15
            if (r6 != r7) goto Lb0
            goto L4a
        L41:
            r7 = 10
            if (r6 > r7) goto Lb0
            int r6 = r1.f17315g
            r7 = 2
            if (r6 != r7) goto Lb0
        L4a:
            r6 = 7
            long r6 = r17 & r6
            int r6 = (int) r6
            if (r6 != 0) goto L52
            goto L56
        L52:
            int r7 = r1.f17317i
            if (r6 != r7) goto Lb0
        L56:
            int r3 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r3 == 0) goto Lb0
            r3 = r24
            boolean r3 = d(r0, r1, r5, r3)
            if (r3 == 0) goto Lb0
            long r3 = r11 & r19
            int r3 = (int) r3
            int r3 = a(r0, r3)
            if (r3 == r15) goto Lb0
            int r4 = r1.f17310b
            if (r3 > r4) goto Lb0
            long r3 = r13 & r19
            int r5 = r1.f17313e
            int r3 = (int) r3
            if (r3 != 0) goto L77
            goto L9b
        L77:
            r4 = 11
            if (r3 > r4) goto L80
            int r1 = r1.f17314f
            if (r3 == r1) goto L9b
            goto Lb0
        L80:
            r1 = 12
            if (r3 != r1) goto L8d
            int r1 = r21.s()
            int r1 = r1 * 1000
            if (r1 != r5) goto Lb0
            goto L9b
        L8d:
            r1 = 14
            if (r3 > r1) goto Lb0
            int r4 = r21.w()
            if (r3 != r1) goto L99
            int r4 = r4 * 10
        L99:
            if (r4 != r5) goto Lb0
        L9b:
            int r1 = r21.s()
            int r3 = r21.k()
            byte[] r0 = r21.h()
            int r3 = r3 + r15
            int r0 = com.google.android.gms.internal.ads.sv2.m(r0, r2, r3, r8)
            if (r1 != r0) goto Lb0
            r0 = 1
            return r0
        Lb0:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.t.c(com.google.android.gms.internal.ads.jm2, com.google.android.gms.internal.ads.x, int, com.google.android.gms.internal.ads.s):boolean");
    }

    private static boolean d(jm2 jm2Var, x xVar, boolean z10, s sVar) {
        try {
            long jC = jm2Var.C();
            if (!z10) {
                jC *= xVar.f17310b;
            }
            sVar.f15024a = jC;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }
}
