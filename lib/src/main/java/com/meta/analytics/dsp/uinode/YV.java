package com.meta.analytics.dsp.uinode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* loaded from: assets/audience_network.dex */
public final class YV implements RI {
    public static byte[] A01;
    public final C1072Ym A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 127);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-2, -45, -20, -24, -45, -10, 21, 21, 18, -45, -8, 21, 27, 26, 15, 20, 13, -45, -6, 21, 17, 11, 20, 102, 100, 86, 99, 30, 82, 88, 86, 95, 101};
    }

    public YV(C1072Ym c1072Ym) {
        this.A00 = c1072Ym;
    }

    @Override // com.meta.analytics.dsp.uinode.RI
    public final Map<String, String> A5o(boolean z10) {
        HashMap map = new HashMap();
        if (!C6E.A00().A04()) {
            map.put(A00(0, 23, 39), C04288l.A00().A01(this.A00, true).A03());
        }
        map.put(A00(23, 10, 114), AbstractC04318o.A06(new C8K(this.A00), this.A00, z10));
        return map;
    }
}
