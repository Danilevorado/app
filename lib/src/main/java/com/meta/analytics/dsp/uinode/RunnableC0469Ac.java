package com.meta.analytics.dsp.uinode;

/* renamed from: com.facebook.ads.redexgen.X.Ac, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class RunnableC0469Ac implements Runnable {
    public final /* synthetic */ C0475Ai A00;
    public final /* synthetic */ BC A01;

    public RunnableC0469Ac(C0475Ai c0475Ai, BC bc2) {
        this.A00 = c0475Ai;
        this.A01 = bc2;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (KL.A02(this)) {
            return;
        }
        try {
            this.A00.A01.AAq(this.A01);
        } catch (Throwable th) {
            KL.A00(th, this);
        }
    }
}
