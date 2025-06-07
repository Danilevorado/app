package com.meta.analytics.dsp.uinode;

import com.facebook.ads.AdError;

/* renamed from: com.facebook.ads.redexgen.X.au, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1165au implements InterfaceC02641q {
    public final /* synthetic */ C02561i A00;

    public C1165au(C02561i c02561i) {
        this.A00 = c02561i;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC02641q
    public final void ACZ(AdError adError) {
        this.A00.A04.AAe(AdError.CACHE_ERROR);
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC02641q
    public final void ACa() {
        this.A00.A04.AAf();
    }
}
