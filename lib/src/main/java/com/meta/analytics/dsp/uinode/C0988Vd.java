package com.meta.analytics.dsp.uinode;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;

/* renamed from: com.facebook.ads.redexgen.X.Vd, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0988Vd implements InterfaceC0632Hd {
    @Override // com.meta.analytics.dsp.uinode.InterfaceC0632Hd
    public final C0987Vc A4c(Looper looper, Handler.Callback callback) {
        return new C0987Vc(new Handler(looper, callback));
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0632Hd
    public final long A5T() {
        return SystemClock.elapsedRealtime();
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0632Hd
    public final long AGs() {
        return SystemClock.uptimeMillis();
    }
}
