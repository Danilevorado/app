package com.meta.analytics.dsp.uinode;

/* renamed from: com.facebook.ads.redexgen.X.Va, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0985Va implements InterfaceC1259cd<C0667Io, C0672It> {
    public VX A00;

    public C0985Va(VX vx) {
        this.A00 = vx;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.ca != com.instagram.common.viewpoint.core.ViewpointData<com.facebook.ads.internal.impressionsecondchannel.model.Impression, com.facebook.ads.internal.impressionsecondchannel.state.ImpressionState> */
    @Override // com.meta.analytics.dsp.uinode.InterfaceC1259cd
    public final void A5c(C1256ca<C0667Io, C0672It> c1256ca, InterfaceC1246cP interfaceC1246cP) {
        switch (Im.A00[interfaceC1246cP.A8J(c1256ca).ordinal()]) {
            case 1:
            case 2:
                this.A00.A02(c1256ca, interfaceC1246cP);
                break;
        }
    }
}
