package com.meta.analytics.dsp.uinode;

/* renamed from: com.facebook.ads.redexgen.X.bR, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1198bR extends KT {
    public final /* synthetic */ C1197bQ A00;
    public final /* synthetic */ B0 A01;

    public C1198bR(C1197bQ c1197bQ, B0 b02) {
        this.A00 = c1197bQ;
        this.A01 = b02;
    }

    @Override // com.meta.analytics.dsp.uinode.KT
    public final void A06() {
        this.A00.A00.A0A();
        if (this.A00.A00.A0B != null) {
            this.A01.setAdViewabilityChecker(this.A00.A00.A0B);
            this.A00.A00.A0B.A0U();
        }
    }
}
