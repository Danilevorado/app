package com.meta.analytics.dsp.uinode;

/* loaded from: assets/audience_network.dex */
public final class J8 implements InterfaceC0902Ru {
    @Override // com.meta.analytics.dsp.uinode.InterfaceC0902Ru
    public final long A4z() {
        return System.nanoTime();
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0902Ru
    public final void AGQ(Object obj, long j10) throws InterruptedException {
        obj.wait(j10);
    }
}
