package com.meta.analytics.dsp.uinode;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.bs, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1225bs {
    public static byte[] A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 102);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{0, 4, 9, 1, -2, 3, -61, -1, 11, 2, -61, -5, 10, 3, -8, 9, -2, 4, 3, 8, -61};
    }

    public final String A02(GL gl) {
        String string = gl.getClass().getGenericInterfaces()[0].toString();
        String strA00 = A00(0, 21, 47);
        return string.startsWith(strA00) ? string.substring(strA00.length()) : string;
    }

    public final String A03(AbstractC03886o abstractC03886o) {
        return A02(abstractC03886o);
    }
}
