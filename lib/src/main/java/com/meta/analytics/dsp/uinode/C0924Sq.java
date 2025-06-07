package com.meta.analytics.dsp.uinode;

/* renamed from: com.facebook.ads.redexgen.X.Sq, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0924Sq implements InterfaceC0833Pd {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C0922So A01;

    public C0924Sq(C0922So c0922So, int i10) {
        this.A01 = c0922So;
        this.A00 = i10;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0833Pd
    public final void AAu() {
        this.A01.A0R(false, this.A00);
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0833Pd
    public final void ABH(int i10) {
        C0922So.A02(this.A01, i10);
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0833Pd
    public final void ABY(float f5) {
        if (!this.A01.A08) {
            this.A01.A0G(f5);
        }
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0833Pd
    public final void AD7(boolean z10) {
        this.A01.A0Q(z10);
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0833Pd
    public final void ADX(String str) {
        this.A01.A0D.A0E().A2z(str);
        this.A01.A0H.A43(this.A01.A0J.A6y());
        this.A01.A0H(3);
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0833Pd
    public final void AGq() {
        this.A01.A09 = false;
        this.A01.A0I.setProgressImmediate(0.0f);
        this.A01.A0I.setToolbarActionMode(2);
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0833Pd
    public final void AGr(float f5) {
        this.A01.A0I.setProgress(100.0f * f5);
    }
}
