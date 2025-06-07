package com.meta.analytics.dsp.uinode;

import com.facebook.ads.AdError;

/* renamed from: com.facebook.ads.redexgen.X.bE, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1185bE implements InterfaceC02641q {
    public final /* synthetic */ FY A00;

    public C1185bE(FY fy) {
        this.A00 = fy;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC02641q
    public final void ACZ(AdError adError) {
        this.A00.A01.AD1(this.A00, adError);
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC02641q
    public final void ACa() {
        this.A00.A0C.set(true);
        this.A00.A01.ACy(this.A00);
    }
}
