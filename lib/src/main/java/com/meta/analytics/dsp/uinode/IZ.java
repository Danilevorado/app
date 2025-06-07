package com.meta.analytics.dsp.uinode;

/* loaded from: assets/audience_network.dex */
public class IZ implements Runnable {
    public final /* synthetic */ float A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ int A03;
    public final /* synthetic */ C0657Ic A04;

    public IZ(C0657Ic c0657Ic, int i10, int i11, int i12, float f5) {
        this.A04 = c0657Ic;
        this.A03 = i10;
        this.A01 = i11;
        this.A02 = i12;
        this.A00 = f5;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (KL.A02(this)) {
            return;
        }
        try {
            this.A04.A01.ADf(this.A03, this.A01, this.A02, this.A00);
        } catch (Throwable th) {
            KL.A00(th, this);
        }
    }
}
