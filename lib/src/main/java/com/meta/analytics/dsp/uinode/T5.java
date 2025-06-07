package com.meta.analytics.dsp.uinode;

/* loaded from: assets/audience_network.dex */
public class T5 implements L8 {
    public final /* synthetic */ T4 A00;

    public T5(T4 t42) {
        this.A00 = t42;
    }

    @Override // com.meta.analytics.dsp.uinode.L8
    public final void ABA() {
        this.A00.A0F.ABH(this.A00.A0A);
        this.A00.A0F.AAu();
    }

    @Override // com.meta.analytics.dsp.uinode.L8
    public final void ACm(float f5) {
        int i10;
        float totalForce = (this.A00.A0A - f5) + (this.A00.A0V ? 0 : this.A00.A0I.getDuration());
        if (this.A00.A0V) {
            i10 = this.A00.A0A;
        } else {
            i10 = this.A00.A09;
        }
        float seenTime = i10;
        this.A00.A0F.AGr(totalForce / seenTime);
    }
}
