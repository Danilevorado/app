package com.meta.analytics.dsp.uinode;

/* renamed from: com.facebook.ads.redexgen.X.9k, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C04529k {
    public int A00;
    public int A01;
    public C04639w A02;
    public boolean A03;

    public C04529k() {
    }

    public final void A03(int i10) {
        this.A01 += i10;
    }

    public final void A04(int i10) {
        if (this.A03 && this.A00 != 4) {
            AbstractC0629Ha.A03(i10 == 4);
        } else {
            this.A03 = true;
            this.A00 = i10;
        }
    }

    public final void A05(C04639w c04639w) {
        this.A02 = c04639w;
        this.A01 = 0;
        this.A03 = false;
    }

    public final boolean A06(C04639w c04639w) {
        return c04639w != this.A02 || this.A01 > 0 || this.A03;
    }
}
