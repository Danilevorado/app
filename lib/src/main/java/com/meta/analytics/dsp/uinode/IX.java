package com.meta.analytics.dsp.uinode;

import com.facebook.ads.internal.exoplayer2.thirdparty.Format;

/* loaded from: assets/audience_network.dex */
public class IX implements Runnable {
    public final /* synthetic */ Format A00;
    public final /* synthetic */ C0657Ic A01;

    public IX(C0657Ic c0657Ic, Format format) {
        this.A01 = c0657Ic;
        this.A00 = format;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (KL.A02(this)) {
            return;
        }
        try {
            this.A01.A01.ADa(this.A00);
        } catch (Throwable th) {
            KL.A00(th, this);
        }
    }
}
