package com.meta.analytics.dsp.uinode;

import android.view.Surface;

/* renamed from: com.facebook.ads.redexgen.X.Ia, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class RunnableC0655Ia implements Runnable {
    public final /* synthetic */ Surface A00;
    public final /* synthetic */ C0657Ic A01;

    public RunnableC0655Ia(C0657Ic c0657Ic, Surface surface) {
        this.A01 = c0657Ic;
        this.A00 = surface;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (KL.A02(this)) {
            return;
        }
        try {
            this.A01.A01.ACt(this.A00);
        } catch (Throwable th) {
            KL.A00(th, this);
        }
    }
}
