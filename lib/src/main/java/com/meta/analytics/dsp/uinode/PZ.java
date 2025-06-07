package com.meta.analytics.dsp.uinode;

/* loaded from: assets/audience_network.dex */
public class PZ implements Runnable {
    public final /* synthetic */ C0931Sx A00;

    public PZ(C0931Sx c0931Sx) {
        this.A00 = c0931Sx;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (KL.A02(this)) {
            return;
        }
        try {
            if (!this.A00.A0K) {
                return;
            }
            this.A00.A0Q();
        } catch (Throwable th) {
            KL.A00(th, this);
        }
    }
}
