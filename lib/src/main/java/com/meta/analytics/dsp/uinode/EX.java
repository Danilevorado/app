package com.meta.analytics.dsp.uinode;

/* loaded from: assets/audience_network.dex */
public class EX extends O7 {
    public final /* synthetic */ C03575h A00;

    public EX(C03575h c03575h) {
        this.A00 = c03575h;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.meta.analytics.dsp.uinode.AbstractC04358s
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final void A03(O8 o82) {
        if (this.A00.A08 != null) {
            V2.A0L(this.A00.A08.getInternalNativeAd()).A1c(true, true);
        }
        this.A00.A00.onPlayed();
    }
}
