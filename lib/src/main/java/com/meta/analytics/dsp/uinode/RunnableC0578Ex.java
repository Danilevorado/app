package com.meta.analytics.dsp.uinode;

/* renamed from: com.facebook.ads.redexgen.X.Ex, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class RunnableC0578Ex implements Runnable {
    public final /* synthetic */ F1 A00;
    public final /* synthetic */ F4 A01;

    public RunnableC0578Ex(F1 f12, F4 f42) {
        this.A00 = f12;
        this.A01 = f42;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (KL.A02(this)) {
            return;
        }
        try {
            this.A01.ACp(this.A00.A00, this.A00.A01);
        } catch (Throwable th) {
            KL.A00(th, this);
        }
    }
}
