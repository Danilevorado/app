package com.meta.analytics.dsp.uinode;

import java.util.concurrent.Executor;

/* loaded from: assets/audience_network.dex */
public final class M2 {
    public static M2 A02;
    public final UY A00;
    public final M4 A01;

    public M2(C1073Yn c1073Yn, Executor executor, C8S c8s) {
        this.A01 = new M4(c1073Yn);
        this.A00 = new UY(executor, c8s, c1073Yn);
    }

    private void A00() {
        this.A01.A03(this.A00);
    }

    public static void A01(C1073Yn c1073Yn, Executor executor, C8S c8s) {
        if (!C0662Ih.A1C(c1073Yn)) {
            return;
        }
        M2 m22 = A02;
        if (m22 == null) {
            M2 m23 = new M2(c1073Yn, executor, c8s);
            A02 = m23;
            m23.A00();
            return;
        }
        m22.A02(c8s);
    }

    private void A02(C8S c8s) {
        this.A00.A07(c8s);
    }
}
