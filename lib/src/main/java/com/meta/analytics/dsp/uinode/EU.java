package com.meta.analytics.dsp.uinode;

import com.facebook.ads.VideoStartReason;

/* loaded from: assets/audience_network.dex */
public class EU extends AbstractC0850Pu {
    public final /* synthetic */ C03575h A00;

    public EU(C03575h c03575h) {
        this.A00 = c03575h;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.meta.analytics.dsp.uinode.AbstractC04358s
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final void A03(C9H c9h) {
        this.A00.A00.onCompleted();
        if (C0662Ih.A1H(this.A00.A00.getContext())) {
            this.A00.A00.play(VideoStartReason.AUTO_STARTED);
        }
    }
}
