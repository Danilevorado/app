package com.meta.analytics.dsp.uinode;

/* renamed from: com.facebook.ads.redexgen.X.Sv, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0929Sv implements L8 {
    public final /* synthetic */ int A00;
    public final /* synthetic */ KT A01;
    public final /* synthetic */ AbstractC0926Ss A02;

    public C0929Sv(AbstractC0926Ss abstractC0926Ss, int i10, KT kt) {
        this.A02 = abstractC0926Ss;
        this.A00 = i10;
        this.A01 = kt;
    }

    @Override // com.meta.analytics.dsp.uinode.L8
    public final void ABA() throws Throwable {
        this.A01.run();
    }

    @Override // com.meta.analytics.dsp.uinode.L8
    public final void ACm(float f5) {
        this.A02.A07.setProgress(100.0f * (1.0f - (f5 / this.A00)));
    }
}
