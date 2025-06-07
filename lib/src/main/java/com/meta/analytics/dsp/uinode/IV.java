package com.meta.analytics.dsp.uinode;

/* loaded from: assets/audience_network.dex */
public class IV implements Runnable {
    public final /* synthetic */ BC A00;
    public final /* synthetic */ C0657Ic A01;

    public IV(C0657Ic c0657Ic, BC bc2) {
        this.A01 = c0657Ic;
        this.A00 = bc2;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (KL.A02(this)) {
            return;
        }
        try {
            this.A01.A01.ADW(this.A00);
        } catch (Throwable th) {
            KL.A00(th, this);
        }
    }
}
