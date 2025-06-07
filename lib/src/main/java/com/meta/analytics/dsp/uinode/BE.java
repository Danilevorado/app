package com.meta.analytics.dsp.uinode;

/* loaded from: assets/audience_network.dex */
public class BE extends Thread {
    public final /* synthetic */ AbstractC1049Xp A00;

    public BE(AbstractC1049Xp abstractC1049Xp) {
        this.A00 = abstractC1049Xp;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() throws Throwable {
        if (KL.A02(this)) {
            return;
        }
        try {
            this.A00.A0M();
        } catch (Throwable th) {
            KL.A00(th, this);
        }
    }
}
