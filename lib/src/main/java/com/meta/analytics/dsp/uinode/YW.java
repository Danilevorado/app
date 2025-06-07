package com.meta.analytics.dsp.uinode;

import android.util.Log;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public class YW implements KZ {
    public static byte[] A01;
    public final /* synthetic */ C1072Ym A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 15);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{68, 64, 67, 119, 102, 107, 103, 108, 97, 103, 76, 103, 118, 117, 109, 112, 105, 15, 52, 63, 34, 42, 63, 57, 46, 63, 62, 122, 63, 40, 40, 53, 40, 116, 121, 104, 123, 105, 114, 69, 105, 114, 115, Byte.MAX_VALUE, 118, 126};
    }

    public YW(C1072Ym c1072Ym) {
        this.A00 = c1072Ym;
    }

    @Override // com.meta.analytics.dsp.uinode.KZ
    public final void A9S(int i10, Throwable th) {
        Log.e(A00(0, 17, 13), A00(17, 17, 85), th);
        this.A00.A07().A9a(A00(34, 12, 21), i10, new C8B(th));
    }
}
