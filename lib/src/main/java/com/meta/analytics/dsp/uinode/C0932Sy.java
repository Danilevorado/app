package com.meta.analytics.dsp.uinode;

import com.facebook.ads.AdError;

/* renamed from: com.facebook.ads.redexgen.X.Sy, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0932Sy extends KT {
    public final /* synthetic */ C0931Sx A00;

    public C0932Sy(C0931Sx c0931Sx) {
        this.A00 = c0931Sx;
    }

    @Override // com.meta.analytics.dsp.uinode.KT
    public final void A06() {
        AbstractC0740Lo.A0F(AdError.NETWORK_ERROR_CODE, this.A00.A0H);
        this.A00.postDelayed(this, 2000L);
    }
}
