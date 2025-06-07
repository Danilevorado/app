package com.meta.analytics.dsp.uinode;

import java.util.Arrays;
import org.json.JSONObject;

/* loaded from: assets/audience_network.dex */
public class TN implements P2 {
    public static byte[] A01;
    public final /* synthetic */ B3 A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 23);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-49, -53, -64, -40};
    }

    public TN(B3 b32) {
        this.A00 = b32;
    }

    @Override // com.meta.analytics.dsp.uinode.P2
    public final void ADY(String str, JSONObject jSONObject) {
        if (str.equals(A00(0, 4, 72))) {
            this.A00.AGY();
            if (C0662Ih.A1W(this.A00.A07)) {
                this.A00.A07.A0A().ABG();
            }
        }
        this.A00.A0F.A0h(str, jSONObject);
    }
}
