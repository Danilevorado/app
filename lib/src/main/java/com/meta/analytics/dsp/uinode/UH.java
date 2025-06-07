package com.meta.analytics.dsp.uinode;

import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public class UH implements L8 {
    public static byte[] A01;
    public final /* synthetic */ UD A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 97);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{108, 120, 121, 98, 110, 97, 100, 110, 102};
    }

    public UH(UD ud) {
        this.A00 = ud;
    }

    @Override // com.meta.analytics.dsp.uinode.L8
    public final void ABA() {
        if (!this.A00.A0A && !this.A00.A09) {
            this.A00.A0U(false, A00(0, 9, 108));
        }
    }

    @Override // com.meta.analytics.dsp.uinode.L8
    public final void ACm(float f5) {
    }
}
