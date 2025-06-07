package com.meta.analytics.dsp.uinode;

/* loaded from: assets/audience_network.dex */
public class SE extends KT {
    public final /* synthetic */ SA A00;

    public SE(SA sa2) {
        this.A00 = sa2;
    }

    @Override // com.meta.analytics.dsp.uinode.KT
    public final void A06() {
        if (!this.A00.A03) {
            C04348r c04348r = this.A00.A0B;
            final int currentPositionInMillis = this.A00.getCurrentPositionInMillis();
            c04348r.A02(new AbstractC0851Pv(currentPositionInMillis) { // from class: com.facebook.ads.redexgen.X.93
            });
            this.A00.A07.postDelayed(this, this.A00.A00);
        }
    }
}
