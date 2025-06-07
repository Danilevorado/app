package com.meta.analytics.dsp.uinode;

import android.os.Handler;
import com.facebook.ads.AdError;

/* loaded from: assets/audience_network.dex */
public final class W1 implements InterfaceC0619Gp, HG<Object> {
    public int A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public long A05;
    public final Handler A06;
    public final InterfaceC0618Go A07;
    public final InterfaceC0632Hd A08;
    public final IA A09;

    public W1() {
        this(null, null, 1000000L, AdError.SERVER_ERROR_CODE, InterfaceC0632Hd.A00);
    }

    public W1(Handler handler, InterfaceC0618Go interfaceC0618Go, long j10, int i10, InterfaceC0632Hd interfaceC0632Hd) {
        this.A06 = handler;
        this.A07 = interfaceC0618Go;
        this.A09 = new IA(i10);
        this.A08 = interfaceC0632Hd;
        this.A01 = j10;
    }

    private void A01(int i10, long j10, long j11) {
        Handler handler = this.A06;
        if (handler != null && this.A07 != null) {
            handler.post(new Gz(this, i10, j10, j11));
        }
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0619Gp
    public final synchronized long A67() {
        return this.A01;
    }

    @Override // com.meta.analytics.dsp.uinode.HG
    public final synchronized void AB1(Object obj, int i10) {
        this.A02 += i10;
    }

    @Override // com.meta.analytics.dsp.uinode.HG
    public final synchronized void ADO(Object obj) {
        AbstractC0629Ha.A04(this.A00 > 0);
        long nowMs = this.A08.A5T();
        int i10 = (int) (nowMs - this.A03);
        this.A05 += i10;
        long j10 = this.A04;
        long j11 = this.A02;
        this.A04 = j10 + j11;
        if (i10 > 0) {
            this.A09.A03((int) Math.sqrt(j11), (8000 * j11) / i10);
            if (this.A05 >= 2000 || this.A04 >= 524288) {
                this.A01 = (long) this.A09.A02(0.5f);
            }
        }
        A01(i10, this.A02, this.A01);
        int sampleElapsedTimeMs = this.A00 - 1;
        this.A00 = sampleElapsedTimeMs;
        if (sampleElapsedTimeMs > 0) {
            this.A03 = nowMs;
        }
        this.A02 = 0L;
    }

    @Override // com.meta.analytics.dsp.uinode.HG
    public final synchronized void ADP(Object obj, C0628Gy c0628Gy) {
        if (this.A00 == 0) {
            this.A03 = this.A08.A5T();
        }
        this.A00++;
    }
}
