package com.meta.analytics.dsp.uinode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* loaded from: assets/audience_network.dex */
public abstract class Q2 {
    public static byte[] A00;
    public static String[] A01 = {"FlapraKYinr7Nj6zb2x", "Je7Oc75DeV26JYLGdoAYQBFZl5wXaWlc", "6eSxJX", "aEepWtzNMaW6JZj4waJ23HNf2aIS7LoC", "JwlyhY0m7wRpvvwBZvP15fqQyn91MpTE", "PlE1oLNOrYKtW3AWK6zlObYGaKJphnE8", "QTcNGp4T1DOVQL9", "izKSydL2onnSjNYNNJlTpUx2BXz"};

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            byte b10 = (byte) ((bArrCopyOfRange[i13] - i12) - 93);
            String[] strArr = A01;
            if (strArr[3].charAt(25) == strArr[4].charAt(25)) {
                throw new RuntimeException();
            }
            A01[7] = "ZkkNqMbSq2X5uLLX3N";
            bArrCopyOfRange[i13] = b10;
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{18, 10, 13, 19, 10, 12, -6, 9, 9, -8, 7, -6, 6, -2, 37, 38, 55, 42, 36, 38, 32, 46, 48, 37, 38, 45, 50, 53, 41, 39, 50, 43, 72, 76, 50, 54, 34, 57, 40, 53, 34, 19, 36, 38, 32, 23, 36, 17, 23, 32, 22, 34, 33, 27, 32, 38, -14, -18, -29, -5, -29, -28, -18, -25, -31, -16, -29, -17, -25, 13, -3, 12, -1, -1, 8, -7, 2, -1, 3, 1, 2, 14, -22, -38, -23, -36, -36, -27, -42, -18, -32, -37, -21, -33, -48, -63, -56, -68, -45, -62, -49, -48, -58, -52, -53, 13, -1, 13, 13, 3, 9, 8, -7, 3, -2};
    }

    static {
        A02();
    }

    public static Map<String, String> A01(C04017f c04017f, String str, String str2) {
        HashMap map = new HashMap();
        C8K c8k = new C8K(c04017f);
        int i10 = c04017f.getResources().getDisplayMetrics().widthPixels;
        int i11 = c04017f.getResources().getDisplayMetrics().heightPixels;
        map.put(A00(105, 10, 61), c04017f.A08().A02());
        map.put(A00(56, 13, 37), str2);
        map.put(A00(40, 16, 85), str);
        map.put(A00(14, 12, 100), String.valueOf(c8k.A09()));
        map.put(A00(82, 12, 26), String.valueOf((int) (i10 / LD.A02)));
        map.put(A00(69, 13, 61), String.valueOf((int) (i11 / LD.A02)));
        map.put(A00(32, 2, 124), c04017f.A04().A8H());
        map.put(A00(34, 6, 102), C8K.A04);
        map.put(A00(26, 6, 105), Locale.getDefault().toString());
        map.put(A00(94, 11, 0), A00(0, 6, 127));
        map.put(A00(6, 8, 60), c8k.A05());
        return map;
    }
}
