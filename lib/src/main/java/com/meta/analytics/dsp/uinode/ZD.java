package com.meta.analytics.dsp.uinode;

/* loaded from: assets/audience_network.dex */
public class ZD extends KG {
    public final /* synthetic */ ZA A00;
    public final /* synthetic */ C0679Jb A01;

    public ZD(ZA za2, C0679Jb c0679Jb) {
        this.A00 = za2;
        this.A01 = c0679Jb;
    }

    @Override // com.meta.analytics.dsp.uinode.KG
    public final void A01() {
        if (this.A00.A00.A00() != null) {
            this.A00.A00.A00().onAdError(L1.A00(this.A01));
        }
    }
}
