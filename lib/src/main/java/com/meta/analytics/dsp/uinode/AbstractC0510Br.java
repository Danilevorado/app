package com.meta.analytics.dsp.uinode;

import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.Br, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC0510Br extends AbstractC1050Xq implements InterfaceC0593Fo {
    public long A00;
    public InterfaceC0593Fo A01;

    public abstract void A08();

    @Override // com.meta.analytics.dsp.uinode.B7
    public final void A07() {
        super.A07();
        this.A01 = null;
    }

    public final void A09(long j10, InterfaceC0593Fo interfaceC0593Fo, long j11) {
        super.A01 = j10;
        this.A01 = interfaceC0593Fo;
        if (j11 == Long.MAX_VALUE) {
            j11 = super.A01;
        }
        this.A00 = j11;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0593Fo
    public final List<C0592Fn> A6Z(long j10) {
        return this.A01.A6Z(j10 - this.A00);
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0593Fo
    public final long A70(int i10) {
        return this.A01.A70(i10) + this.A00;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0593Fo
    public final int A71() {
        return this.A01.A71();
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0593Fo
    public final int A7T(long j10) {
        return this.A01.A7T(j10 - this.A00);
    }
}
