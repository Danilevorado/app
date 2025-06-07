package com.meta.analytics.dsp.uinode;

import java.io.IOException;

/* loaded from: assets/audience_network.dex */
public final class DE {
    public final int A00;
    public final long A01;

    public DE(int i10, long j10) {
        this.A00 = i10;
        this.A01 = j10;
    }

    public static DE A00(InterfaceC0512Bt interfaceC0512Bt, C0654Hz c0654Hz) throws InterruptedException, IOException {
        interfaceC0512Bt.ADv(c0654Hz.A00, 0, 8);
        c0654Hz.A0Y(0);
        int iA08 = c0654Hz.A08();
        long size = c0654Hz.A0K();
        return new DE(iA08, size);
    }
}
