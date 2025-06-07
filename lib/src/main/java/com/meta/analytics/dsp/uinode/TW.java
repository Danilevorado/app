package com.meta.analytics.dsp.uinode;

import com.facebook.ads.AdError;

/* loaded from: assets/audience_network.dex */
public class TW extends KT {
    public final /* synthetic */ TT A00;

    public TW(TT tt) {
        this.A00 = tt;
    }

    @Override // com.meta.analytics.dsp.uinode.KT
    public final void A06() {
        if (!this.A00.A0Z) {
            AbstractC0740Lo.A0F(AdError.NETWORK_ERROR_CODE, this.A00.A0M);
        }
        this.A00.postDelayed(this, 2000L);
    }
}
