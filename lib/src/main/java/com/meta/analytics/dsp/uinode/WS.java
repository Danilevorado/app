package com.meta.analytics.dsp.uinode;

import java.io.IOException;

/* loaded from: assets/audience_network.dex */
public final class WS implements FB {
    public final int A00;
    public final /* synthetic */ CD A01;

    public WS(CD cd, int i10) {
        this.A01 = cd;
        this.A00 = i10;
    }

    @Override // com.meta.analytics.dsp.uinode.FB
    public final boolean A9C() {
        return this.A01.A0S(this.A00);
    }

    @Override // com.meta.analytics.dsp.uinode.FB
    public final void AAM() throws IOException {
        this.A01.A0Q();
    }

    @Override // com.meta.analytics.dsp.uinode.FB
    public final int AEK(C04569p c04569p, C1051Xr c1051Xr, boolean z10) {
        return this.A01.A0P(this.A00, c04569p, c1051Xr, z10);
    }

    @Override // com.meta.analytics.dsp.uinode.FB
    public final int AGO(long j10) {
        return this.A01.A0O(this.A00, j10);
    }
}
