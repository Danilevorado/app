package com.meta.analytics.dsp.uinode;

import java.lang.ref.WeakReference;

/* renamed from: com.facebook.ads.redexgen.X.Ti, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0942Ti implements InterfaceC0785Nh {
    public final WeakReference<BK> A00;

    public C0942Ti(BK bk) {
        this.A00 = new WeakReference<>(bk);
    }

    public /* synthetic */ C0942Ti(BK bk, BP bp) {
        this(bk);
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0785Nh
    public final void ABh(boolean z10) {
        BK cardLayout = this.A00.get();
        if (cardLayout != null) {
            cardLayout.A04 = z10;
            cardLayout.A04();
        }
    }
}
