package com.meta.analytics.dsp.uinode;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* renamed from: com.facebook.ads.redexgen.X.Vc, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0987Vc implements InterfaceC0642Hn {
    public final Handler A00;

    public C0987Vc(Handler handler) {
        this.A00 = handler;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0642Hn
    public final Looper A7L() {
        return this.A00.getLooper();
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0642Hn
    public final Message AAZ(int i10, int i11, int i12) {
        return this.A00.obtainMessage(i10, i11, i12);
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0642Hn
    public final Message AAa(int i10, int i11, int i12, Object obj) {
        return this.A00.obtainMessage(i10, i11, i12, obj);
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0642Hn
    public final Message AAb(int i10, Object obj) {
        return this.A00.obtainMessage(i10, obj);
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0642Hn
    public final void AF8(int i10) {
        this.A00.removeMessages(i10);
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0642Hn
    public final boolean AFn(int i10) {
        return this.A00.sendEmptyMessage(i10);
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0642Hn
    public final boolean AFo(int i10, long j10) {
        return this.A00.sendEmptyMessageAtTime(i10, j10);
    }
}
