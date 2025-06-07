package com.meta.analytics.dsp.uinode;

import com.facebook.ads.internal.protocol.AdErrorType;

/* renamed from: com.facebook.ads.redexgen.X.al, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1156al extends KT {
    public final /* synthetic */ C1193bM A00;
    public final /* synthetic */ C02691v A01;
    public final /* synthetic */ FQ A02;

    public C1156al(FQ fq, C02691v c02691v, C1193bM c1193bM) {
        this.A02 = fq;
        this.A01 = c02691v;
        this.A00 = c1193bM;
    }

    @Override // com.meta.analytics.dsp.uinode.KT
    public final void A06() {
        this.A02.A0Q(this.A01);
        this.A02.A0N(this.A00);
        this.A02.A00 = null;
        C0679Jb c0679JbA00 = C0679Jb.A00(AdErrorType.INTERSTITIAL_AD_TIMEOUT);
        this.A02.A0B.A0E().A4t(c0679JbA00.A03().getErrorCode(), c0679JbA00.A04());
        this.A02.A06.A0G(c0679JbA00);
    }
}
