package com.meta.analytics.dsp.uinode;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.At, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0486At extends NX {
    public static byte[] A01;
    public final /* synthetic */ P3 A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 5);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{16, 18, 5, 16, 1, 18, 5, 4};
    }

    public C0486At(P3 p32) {
        this.A00 = p32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.meta.analytics.dsp.uinode.AbstractC04358s
    /* renamed from: A02, reason: merged with bridge method [inline-methods] */
    public final void A03(C0791Nn c0791Nn) {
        this.A00.A03 = true;
        this.A00.A0B.ADY(A00(0, 8, 101), this.A00.A03());
    }
}
