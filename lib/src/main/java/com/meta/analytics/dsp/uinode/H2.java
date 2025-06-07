package com.meta.analytics.dsp.uinode;

/* loaded from: assets/audience_network.dex */
public class H2 implements InterfaceC1255cZ {
    public final C1248cR A00;

    public H2(C1248cR c1248cR) {
        this.A00 = c1248cR;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC1255cZ
    public final void onStart() {
        this.A00.A08();
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC1255cZ
    public final void onStop() {
        this.A00.A07();
    }
}
