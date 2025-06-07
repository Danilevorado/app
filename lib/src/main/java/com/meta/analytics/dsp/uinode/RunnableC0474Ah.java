package com.meta.analytics.dsp.uinode;

/* renamed from: com.facebook.ads.redexgen.X.Ah, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class RunnableC0474Ah implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C0475Ai A01;

    public RunnableC0474Ah(C0475Ai c0475Ai, int i10) {
        this.A01 = c0475Ai;
        this.A00 = i10;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (KL.A02(this)) {
            return;
        }
        try {
            this.A01.A01.AAs(this.A00);
        } catch (Throwable th) {
            KL.A00(th, this);
        }
    }
}
