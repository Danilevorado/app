package com.meta.analytics.dsp.uinode;

/* renamed from: com.facebook.ads.redexgen.X.Qx, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class RunnableC0879Qx implements Runnable {
    public final /* synthetic */ R0 A00;

    public RunnableC0879Qx(R0 r02) {
        this.A00 = r02;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (KL.A02(this)) {
            return;
        }
        try {
            this.A00.A09();
            this.A00.A04.removeCallbacks(this);
            this.A00.A04.postDelayed(this, 250L);
        } catch (Throwable th) {
            KL.A00(th, this);
        }
    }
}
