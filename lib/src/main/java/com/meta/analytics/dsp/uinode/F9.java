package com.meta.analytics.dsp.uinode;

/* loaded from: assets/audience_network.dex */
public final class F9 {
    public F9 A00;
    public C0615Gl A01;
    public boolean A02;
    public final long A03;
    public final long A04;

    public F9(long j10, int i10) {
        this.A04 = j10;
        this.A03 = i10 + j10;
    }

    public final int A00(long j10) {
        return ((int) (j10 - this.A04)) + this.A01.A00;
    }

    public final F9 A01() {
        this.A01 = null;
        F9 f92 = this.A00;
        this.A00 = null;
        return f92;
    }

    public final void A02(C0615Gl c0615Gl, F9 f92) {
        this.A01 = c0615Gl;
        this.A00 = f92;
        this.A02 = true;
    }
}
