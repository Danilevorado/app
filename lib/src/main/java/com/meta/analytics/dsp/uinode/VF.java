package com.meta.analytics.dsp.uinode;

import java.lang.ref.WeakReference;

/* loaded from: assets/audience_network.dex */
public class VF implements JK {
    public WeakReference<V2> A00;

    public VF(V2 v22) {
        this.A00 = new WeakReference<>(v22);
    }

    @Override // com.meta.analytics.dsp.uinode.JK
    public final void ACX(boolean z10) {
        if (this.A00.get() != null) {
            this.A00.get().A1c(z10, false);
        }
    }
}
