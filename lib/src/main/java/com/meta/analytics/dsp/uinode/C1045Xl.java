package com.meta.analytics.dsp.uinode;

import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import java.io.EOFException;
import java.io.IOException;

/* renamed from: com.facebook.ads.redexgen.X.Xl, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1045Xl implements C4 {
    @Override // com.meta.analytics.dsp.uinode.C4
    public final void A5n(Format format) {
    }

    @Override // com.meta.analytics.dsp.uinode.C4
    public final int AFQ(InterfaceC0512Bt interfaceC0512Bt, int i10, boolean z10) throws InterruptedException, IOException {
        int iAGM = interfaceC0512Bt.AGM(i10);
        if (iAGM == -1) {
            if (z10) {
                return -1;
            }
            throw new EOFException();
        }
        return iAGM;
    }

    @Override // com.meta.analytics.dsp.uinode.C4
    public final void AFR(C0654Hz c0654Hz, int i10) {
        c0654Hz.A0Z(i10);
    }

    @Override // com.meta.analytics.dsp.uinode.C4
    public final void AFS(long j10, int i10, int i11, int i12, C3 c32) {
    }
}
