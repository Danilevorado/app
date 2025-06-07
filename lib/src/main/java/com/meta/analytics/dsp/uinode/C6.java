package com.meta.analytics.dsp.uinode;

/* loaded from: assets/audience_network.dex */
public abstract class C6 {
    public final C4 A00;

    public abstract void A0B(C0654Hz c0654Hz, long j10) throws C04629v;

    public abstract boolean A0C(C0654Hz c0654Hz) throws C04629v;

    public C6(C4 c42) {
        this.A00 = c42;
    }

    public final void A00(C0654Hz c0654Hz, long j10) throws C04629v {
        if (A0C(c0654Hz)) {
            A0B(c0654Hz, j10);
        }
    }
}
