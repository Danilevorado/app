package com.meta.analytics.dsp.uinode;

import java.lang.ref.WeakReference;

/* renamed from: com.facebook.ads.redexgen.X.Tu, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0954Tu extends KT {
    public final WeakReference<RE> A00;

    public C0954Tu(RE re) {
        this.A00 = new WeakReference<>(re);
    }

    public C0954Tu(WeakReference<RE> weakReference) {
        this.A00 = weakReference;
    }

    @Override // com.meta.analytics.dsp.uinode.KT
    public final void A06() {
        RE viewabilityChecker = this.A00.get();
        if (viewabilityChecker != null) {
            viewabilityChecker.A0U();
        }
    }
}
