package com.meta.analytics.dsp.uinode;

import java.util.Collections;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public final class WI implements InterfaceC0593Fo {
    public final List<C0592Fn> A00;

    public WI(List<C0592Fn> list) {
        this.A00 = list;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0593Fo
    public final List<C0592Fn> A6Z(long j10) {
        return j10 >= 0 ? this.A00 : Collections.emptyList();
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0593Fo
    public final long A70(int i10) {
        AbstractC0629Ha.A03(i10 == 0);
        return 0L;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0593Fo
    public final int A71() {
        return 1;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0593Fo
    public final int A7T(long j10) {
        return j10 < 0 ? 0 : -1;
    }
}
