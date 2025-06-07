package com.meta.analytics.dsp.uinode;

/* renamed from: com.facebook.ads.redexgen.X.Td, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0937Td implements L8 {
    public final /* synthetic */ BI A00;

    public C0937Td(BI bi) {
        this.A00 = bi;
    }

    @Override // com.meta.analytics.dsp.uinode.L8
    public final void ABA() {
        this.A00.A07 = false;
        if (this.A00.A04 != null) {
            this.A00.A04.setToolbarActionMode(this.A00.getCloseButtonStyle());
        }
    }

    @Override // com.meta.analytics.dsp.uinode.L8
    public final void ACm(float f5) {
        if (this.A00.A04 != null) {
            this.A00.A04.setProgressImmediate(100.0f * (1.0f - (f5 / this.A00.getAdInfo().A0G().A00())));
        }
    }
}
