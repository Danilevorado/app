package com.meta.analytics.dsp.uinode;

/* renamed from: com.facebook.ads.redexgen.X.Af, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class RunnableC0472Af implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ long A02;
    public final /* synthetic */ C0475Ai A03;

    public RunnableC0472Af(C0475Ai c0475Ai, int i10, long j10, long j11) {
        this.A03 = c0475Ai;
        this.A00 = i10;
        this.A01 = j10;
        this.A02 = j11;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (KL.A02(this)) {
            return;
        }
        try {
            this.A03.A01.AAt(this.A00, this.A01, this.A02);
        } catch (Throwable th) {
            KL.A00(th, this);
        }
    }
}
