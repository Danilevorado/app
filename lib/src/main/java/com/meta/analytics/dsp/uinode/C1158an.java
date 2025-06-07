package com.meta.analytics.dsp.uinode;

/* renamed from: com.facebook.ads.redexgen.X.an, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1158an extends KT {
    public final /* synthetic */ AbstractC1157am A00;
    public final /* synthetic */ C0679Jb A01;

    public C1158an(AbstractC1157am abstractC1157am, C0679Jb c0679Jb) {
        this.A00 = abstractC1157am;
        this.A01 = c0679Jb;
    }

    @Override // com.meta.analytics.dsp.uinode.KT
    public final void A06() {
        this.A00.A0B.A0E().A4t(this.A01.A03().getErrorCode(), this.A01.A04());
        if (this.A00.A06 != null) {
            this.A00.A06.A0G(this.A01);
        }
    }
}
