package com.meta.analytics.dsp.uinode;

import java.util.Map;

/* loaded from: assets/audience_network.dex */
public abstract class YR implements InterfaceC04037i {
    public final C04017f A00;

    public YR(C04017f c04017f) {
        this.A00 = c04017f;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC04037i
    public final Map<String, String> A4n() {
        return C04208d.A01(this.A00);
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC04037i
    public final Map<String, String> A61() {
        return C8J.A02();
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC04037i
    public final String A7F() {
        return C8J.A00();
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC04037i
    public final String A7H() {
        return C6E.A00().A03();
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC04037i
    public final boolean A94() {
        return C0715Kp.A00().A03();
    }
}
