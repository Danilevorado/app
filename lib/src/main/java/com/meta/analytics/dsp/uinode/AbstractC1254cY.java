package com.meta.analytics.dsp.uinode;

/* renamed from: com.facebook.ads.redexgen.X.cY, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC1254cY {
    public InterfaceC1255cZ A00;

    public final void A00() {
        InterfaceC1255cZ interfaceC1255cZ = this.A00;
        if (interfaceC1255cZ != null) {
            interfaceC1255cZ.onStart();
        }
    }

    public final void A01() {
        InterfaceC1255cZ interfaceC1255cZ = this.A00;
        if (interfaceC1255cZ != null) {
            interfaceC1255cZ.onStop();
        }
    }

    public final void A02(InterfaceC1255cZ interfaceC1255cZ) {
        this.A00 = interfaceC1255cZ;
    }
}
