package com.meta.analytics.dsp.uinode;

/* renamed from: com.facebook.ads.redexgen.X.b7, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1178b7 implements InterfaceC0785Nh {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AbstractC1177b6 A01;
    public final /* synthetic */ V2 A02;

    public C1178b7(AbstractC1177b6 abstractC1177b6, int i10, V2 v22) {
        this.A01 = abstractC1177b6;
        this.A00 = i10;
        this.A02 = v22;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0785Nh
    public final void ABh(boolean z10) {
        if (this.A00 == 0) {
            this.A02.A1Z(this.A01.A04);
        }
        this.A02.A1c(z10, true);
    }
}
