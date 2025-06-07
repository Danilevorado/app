package com.meta.analytics.dsp.uinode;

import com.facebook.ads.internal.dynamicloading.DynamicLoader;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory;

/* loaded from: assets/audience_network.dex */
public class YZ extends KT {
    public final /* synthetic */ C1072Ym A00;

    public YZ(C1072Ym c1072Ym) {
        this.A00 = c1072Ym;
    }

    @Override // com.meta.analytics.dsp.uinode.KT
    public final void A06() {
        DynamicLoader dynamicLoader = DynamicLoaderFactory.getDynamicLoader();
        if (dynamicLoader != null) {
            dynamicLoader.createBidderTokenProviderApi().getBidderToken(this.A00);
        }
    }
}
