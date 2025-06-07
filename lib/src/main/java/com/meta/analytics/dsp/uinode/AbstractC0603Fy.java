package com.meta.analytics.dsp.uinode;

import android.util.Log;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Fy, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC0603Fy {
    public static byte[] A00;
    public static String[] A01 = {"UAa0Z", "y84zlLC7EVblAi9s6IjzDwtWlv", "hWSmc3nAoC6lO20JdXQ8UQAJh4", "HAxIJdFwG2BHjJ6kBVBijNmfixc4v4eM", "sMFPtSIIwmEBUNkX5nfAspCddytOxG7k", "XuEZcwrwjFPAmN9wFCdffjeuCf3K5K0k", "0bJFkLVdjL4ExnLkyIfxNw93FYOhEgu9", "GtmYUKm65Uny9K5bn1TkELKUpeSnjSJ3"};
    public static final int A02;
    public static final int A03;

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 55);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{56, 30, 26, 46, 15, 18, 23, 37, 53, 38, 80, 40, 46, 86, 91, 108, 84, 86, 79, 79, 86, 81, 88, 31, 77, 90, 82, 94, 86, 81, 91, 90, 77, 31, 80, 89, 31, 82, 94, 83, 89, 80, 77, 82, 90, 91, 31, 108, 122, 118, 31, 113, 126, 115, 31, 74, 81, 86, 75, 17};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 21 out of bounds for length 17
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:638)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public static void A03(long j10, C0654Hz c0654Hz, C4[] c4Arr) {
        while (c0654Hz.A04() > 1) {
            int iA00 = A00(c0654Hz);
            int iA002 = A00(c0654Hz);
            int iA06 = c0654Hz.A06();
            if (A01[3].charAt(16) != 'B') {
                throw new RuntimeException();
            }
            String[] strArr = A01;
            strArr[4] = "sJRWMhzWyXWsYNwcYdMxu9waYeZJW4nD";
            strArr[5] = "JDck5DNLGL8VXNpOftdo1S17ghv9bSuy";
            int iA07 = iA06 + iA002;
            if (iA002 == -1 || iA002 > c0654Hz.A04()) {
                Log.w(A01(0, 7, 76), A01(15, 45, 8));
                iA07 = c0654Hz.A07();
            } else if (iA00 == 4 && iA002 >= 8) {
                int iA0E = c0654Hz.A0E();
                int iA0I = c0654Hz.A0I();
                int iA08 = iA0I == 49 ? c0654Hz.A08() : 0;
                int iA0E2 = c0654Hz.A0E();
                if (iA0I == 47) {
                    c0654Hz.A0Z(1);
                }
                boolean z10 = iA0E == 181 && (iA0I == 49 || iA0I == 47) && iA0E2 == 3;
                if (iA0I == 49) {
                    z10 &= iA08 == A03 || iA08 == A02;
                }
                if (z10) {
                    int iA0E3 = c0654Hz.A0E() & 31;
                    c0654Hz.A0Z(1);
                    int i10 = iA0E3 * 3;
                    int iA062 = c0654Hz.A06();
                    for (C4 c42 : c4Arr) {
                        c0654Hz.A0Y(iA062);
                        c42.AFR(c0654Hz, i10);
                        c42.AFS(j10, 1, i10, 0, null);
                    }
                }
            }
            c0654Hz.A0Y(iA07);
        }
    }

    static {
        A02();
        A03 = IF.A08(A01(11, 4, 88));
        A02 = IF.A08(A01(7, 4, 86));
    }

    /* JADX WARN: Incorrect condition in loop: B:4:0x0005 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int A00(com.meta.analytics.dsp.uinode.C0654Hz r3) {
        /*
            r2 = 0
        L1:
            int r0 = r3.A04()
            if (r0 != 0) goto L1a
            r3 = -1
            java.lang.String[] r1 = com.meta.analytics.dsp.uinode.AbstractC0603Fy.A01
            r0 = 0
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 5
            if (r1 == r0) goto L24
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L1a:
            int r1 = r3.A0E()
            int r2 = r2 + r1
            r0 = 255(0xff, float:3.57E-43)
            if (r1 == r0) goto L1
            return r2
        L24:
            java.lang.String[] r2 = com.meta.analytics.dsp.uinode.AbstractC0603Fy.A01
            java.lang.String r1 = "XY7JbweA6fzPXsut6MPl2wkiFN"
            r0 = 2
            r2[r0] = r1
            java.lang.String r1 = "9Cope1RtGoIRUkWui2tRq11YR8"
            r0 = 1
            r2[r0] = r1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.analytics.dsp.uinode.AbstractC0603Fy.A00(com.facebook.ads.redexgen.X.Hz):int");
    }
}
