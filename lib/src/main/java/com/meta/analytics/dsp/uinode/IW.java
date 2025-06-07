package com.meta.analytics.dsp.uinode;

/* loaded from: assets/audience_network.dex */
public class IW implements Runnable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ C0657Ic A02;
    public final /* synthetic */ String A03;

    public IW(C0657Ic c0657Ic, String str, long j10, long j11) {
        this.A02 = c0657Ic;
        this.A03 = str;
        this.A01 = j10;
        this.A00 = j11;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (KL.A02(this)) {
            return;
        }
        try {
            this.A02.A01.ADU(this.A03, this.A01, this.A00);
        } catch (Throwable th) {
            KL.A00(th, this);
        }
    }
}
