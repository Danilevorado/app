package com.meta.analytics.dsp.uinode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.8d, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C04208d {
    public static HashMap<String, String> A00;
    public static byte[] A01;

    static {
        A02();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 101);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{63, 46, 46, 60, 43, 55, 50, 58, 118, 103, 103, 121, 118, 122, 114, 27, 10, 10, 12, 31, 8, 9, 14, 25, 2, 8, 0, 9, 47, 45, 38, 39, 46, 15, 19, 53, 41, 44, 63, 40, 41, 101, 114, 125, 114, 101, 106, 126, 119, 100, 115, 114, 104, 110, 111, 126, 104, 126, 126, 100, 98, 99, 114, 100, 105, 51, 60, 54, 32, 61, 59, 54};
    }

    public static synchronized Map<String, String> A01(C04017f c04017f) {
        if (A00 != null) {
            return new HashMap(A00);
        }
        HashMap<String, String> map = new HashMap<>();
        A00 = map;
        map.put(A00(22, 6, 41), c04017f.getPackageName());
        A03(c04017f, A00, null);
        return new HashMap(A00);
    }

    public static synchronized void A03(C04017f c04017f, Map<String, String> map, String str) {
        map.put(A00(41, 3, 83), A00(65, 7, 55));
        map.put(A00(44, 11, 68), c04017f.A04().A8I());
        map.put(A00(33, 2, 37), c04017f.A04().A8H());
        map.put(A00(35, 6, 31), C8K.A04);
        C8K c8k = new C8K(c04017f, str);
        map.put(A00(15, 7, 63), c8k.A06());
        map.put(A00(8, 7, 82), c8k.A05());
        map.put(A00(0, 8, 27), String.valueOf(c8k.A04()));
        map.put(A00(28, 5, 7), c8k.A0A());
        map.put(A00(55, 10, 72), c04017f.A08().A02());
    }
}
