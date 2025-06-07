package com.meta.analytics.dsp.uinode;

/* renamed from: com.facebook.ads.redexgen.X.Uj, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0969Uj extends KT {
    public final /* synthetic */ L9 A00;

    public C0969Uj(L9 l92) {
        this.A00 = l92;
    }

    @Override // com.meta.analytics.dsp.uinode.KT
    public final void A06() {
        if (this.A00.A05()) {
            this.A00.A02();
            this.A00.A05.postDelayed(this, this.A00.A02);
        }
    }
}
