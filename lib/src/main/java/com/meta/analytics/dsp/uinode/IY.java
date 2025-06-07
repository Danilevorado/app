package com.meta.analytics.dsp.uinode;

/* loaded from: assets/audience_network.dex */
public class IY implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ C0657Ic A02;

    public IY(C0657Ic c0657Ic, int i10, long j10) {
        this.A02 = c0657Ic;
        this.A00 = i10;
        this.A01 = j10;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (KL.A02(this)) {
            return;
        }
        try {
            this.A02.A01.ABN(this.A00, this.A01);
        } catch (Throwable th) {
            KL.A00(th, this);
        }
    }
}
