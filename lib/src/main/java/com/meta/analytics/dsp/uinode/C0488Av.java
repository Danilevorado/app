package com.meta.analytics.dsp.uinode;

import android.media.AudioTrack;

/* renamed from: com.facebook.ads.redexgen.X.Av, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0488Av extends Thread {
    public final /* synthetic */ AudioTrack A00;
    public final /* synthetic */ C1058Xy A01;

    public C0488Av(C1058Xy c1058Xy, AudioTrack audioTrack) {
        this.A01 = c1058Xy;
        this.A00 = audioTrack;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() throws Throwable {
        if (KL.A02(this)) {
            return;
        }
        try {
            try {
                this.A00.flush();
                this.A00.release();
            } finally {
                this.A01.A0f.open();
            }
        } catch (Throwable th) {
            KL.A00(th, this);
        }
    }
}
