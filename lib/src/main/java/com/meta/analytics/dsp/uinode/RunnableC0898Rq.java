package com.meta.analytics.dsp.uinode;

/* renamed from: com.facebook.ads.redexgen.X.Rq, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class RunnableC0898Rq implements Runnable {
    public final /* synthetic */ C0640Hl A00;

    public RunnableC0898Rq(C0640Hl c0640Hl) {
        this.A00 = c0640Hl;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (KL.A02(this)) {
            return;
        }
        try {
            C0640Hl.A03(this.A00);
            throw null;
        } catch (Throwable th) {
            KL.A00(th, this);
        }
    }
}
