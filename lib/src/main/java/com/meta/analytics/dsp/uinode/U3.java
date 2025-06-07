package com.meta.analytics.dsp.uinode;

/* loaded from: assets/audience_network.dex */
public class U3 implements NT {
    public final /* synthetic */ NJ A00;

    public U3(NJ nj) {
        this.A00 = nj;
    }

    @Override // com.meta.analytics.dsp.uinode.NT
    public final void AAv(boolean z10) {
        if (this.A00.A08 && this.A00.A00 != null) {
            this.A00.A00.setEnabled(z10);
            this.A00.A00.setAlpha(z10 ? 1.0f : 0.3f);
        }
    }

    @Override // com.meta.analytics.dsp.uinode.NT
    public final void ABZ(boolean z10) {
        if (this.A00.A08 && this.A00.A02 != null) {
            this.A00.A02.setEnabled(z10);
            this.A00.A02.setAlpha(z10 ? 1.0f : 0.3f);
        }
    }
}
