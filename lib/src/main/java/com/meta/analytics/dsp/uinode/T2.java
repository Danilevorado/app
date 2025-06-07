package com.meta.analytics.dsp.uinode;

import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public class T2 implements NS {
    public static byte[] A01;
    public final /* synthetic */ C0931Sx A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 6);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-36, -38, -52, -39, -58, -43, -56, -35, -48, -50, -56, -37, -48, -42, -43, -58, -48, -56, -55};
    }

    public T2(C0931Sx c0931Sx) {
        this.A00 = c0931Sx;
    }

    @Override // com.meta.analytics.dsp.uinode.NS
    public final void ACT(String str) {
        this.A00.A0Q = false;
        this.A00.A0F.setProgress(100);
        AbstractC0740Lo.A0N(this.A00.A0F, 8);
    }

    @Override // com.meta.analytics.dsp.uinode.NS
    public final void ACV(String str) throws SecurityException {
        this.A00.A0Q = true;
        AbstractC0740Lo.A0N(this.A00.A0F, 0);
        this.A00.A0E.setUrl(str);
        if (!this.A00.A0P && this.A00.A02 > 1) {
            this.A00.A0P = true;
            this.A00.A0j(A00(0, 19, 97));
        }
        C0931Sx.A08(this.A00);
    }

    @Override // com.meta.analytics.dsp.uinode.NS
    public final void ACn(int i10) {
        if (this.A00.A0Q) {
            this.A00.A0F.setProgress(i10);
        }
    }

    @Override // com.meta.analytics.dsp.uinode.NS
    public final void ACq(String str) {
        this.A00.A0E.setTitle(str);
    }

    @Override // com.meta.analytics.dsp.uinode.NS
    public final void ACs() {
        ((PQ) this.A00).A09.AB0(14);
    }
}
