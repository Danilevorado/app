package com.meta.analytics.dsp.uinode;

import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Wh, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1015Wh implements DY {
    public static byte[] A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 87);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{-61, -10, -10, -25, -17, -14, -10, -25, -26, -94, -10, -15, -94, -27, -12, -25, -29, -10, -25, -94, -26, -25, -27, -15, -26, -25, -12, -94, -24, -15, -12, -94, -9, -16, -11, -9, -14, -14, -15, -12, -10, -25, -26, -94, -24, -15, -12, -17, -29, -10, 8, 23, 23, 19, 16, 10, 8, 27, 16, 22, 21, -42, 16, 11, -38, -39, -24, -24, -28, -31, -37, -39, -20, -31, -25, -26, -89, -16, -91, -35, -27, -21, -33, -72, -57, -57, -61, -64, -70, -72, -53, -64, -58, -59, -122, -49, -124, -54, -70, -53, -68, -118, -116};
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0009  */
    @Override // com.meta.analytics.dsp.uinode.DY
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.meta.analytics.dsp.uinode.DW A4Y(com.facebook.ads.internal.exoplayer2.thirdparty.Format r5) {
        /*
            r4 = this;
            java.lang.String r3 = r5.A0O
            int r0 = r3.hashCode()
            switch(r0) {
                case -1248341703: goto L3f;
                case 1154383568: goto L2d;
                case 1652648887: goto L1c;
                default: goto L9;
            }
        L9:
            r0 = -1
        La:
            switch(r0) {
                case 0: goto L5d;
                case 1: goto L57;
                case 2: goto L51;
                default: goto Ld;
            }
        Ld:
            r2 = 0
            r1 = 50
            r0 = 43
            java.lang.String r1 = A00(r2, r1, r0)
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L1c:
            r2 = 83
            r1 = 20
            r0 = 0
            java.lang.String r0 = A00(r2, r1, r0)
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L9
            r0 = 2
            goto La
        L2d:
            r2 = 65
            r1 = 18
            r0 = 33
            java.lang.String r0 = A00(r2, r1, r0)
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L9
            r0 = 1
            goto La
        L3f:
            r2 = 50
            r1 = 15
            r0 = 80
            java.lang.String r0 = A00(r2, r1, r0)
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L9
            r0 = 0
            goto La
        L51:
            com.facebook.ads.redexgen.X.Wa r0 = new com.facebook.ads.redexgen.X.Wa
            r0.<init>()
            return r0
        L57:
            com.facebook.ads.redexgen.X.Wf r0 = new com.facebook.ads.redexgen.X.Wf
            r0.<init>()
            return r0
        L5d:
            com.facebook.ads.redexgen.X.Wd r0 = new com.facebook.ads.redexgen.X.Wd
            r0.<init>()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.analytics.dsp.uinode.C1015Wh.A4Y(com.facebook.ads.internal.exoplayer2.thirdparty.Format):com.facebook.ads.redexgen.X.DW");
    }

    @Override // com.meta.analytics.dsp.uinode.DY
    public final boolean AGf(Format format) {
        String str = format.A0O;
        String mimeType = A00(50, 15, 80);
        if (!mimeType.equals(str)) {
            String mimeType2 = A00(65, 18, 33);
            if (!mimeType2.equals(str)) {
                String mimeType3 = A00(83, 20, 0);
                if (!mimeType3.equals(str)) {
                    return false;
                }
            }
        }
        return true;
    }
}
