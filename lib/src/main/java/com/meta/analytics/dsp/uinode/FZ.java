package com.meta.analytics.dsp.uinode;

import com.facebook.ads.AdError;

/* loaded from: assets/audience_network.dex */
public class FZ extends AbstractC1161aq {
    public final /* synthetic */ int A00;
    public final /* synthetic */ FY A01;
    public final /* synthetic */ C1174b3 A02;
    public final /* synthetic */ FS A03;
    public final /* synthetic */ C1073Yn A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FZ(FY fy, boolean z10, C1073Yn c1073Yn, FS fs, C1174b3 c1174b3, int i10) {
        super(z10);
        this.A01 = fy;
        this.A04 = c1073Yn;
        this.A03 = fs;
        this.A02 = c1174b3;
        this.A00 = i10;
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC1161aq
    public final void A00() {
        this.A01.A01.AD1(this.A01, AdError.CACHE_ERROR);
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC1161aq
    public final void A01(boolean z10) {
        FY.A0D = null;
        if (z10) {
            this.A04.A00().AFq(this.A03.A12(), this.A02.A0w());
        }
        if (this.A00 == 0) {
            this.A01.A0C.set(true);
            this.A01.A01.ACy(this.A01);
        }
        this.A01.A0B(this.A04, this.A02, this.A00 + 1);
    }
}
