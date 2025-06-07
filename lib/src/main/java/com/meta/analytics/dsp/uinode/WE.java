package com.meta.analytics.dsp.uinode;

import java.util.Collections;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public final class WE implements InterfaceC0593Fo {
    public final long[] A00;
    public final C0592Fn[] A01;

    public WE(C0592Fn[] c0592FnArr, long[] jArr) {
        this.A01 = c0592FnArr;
        this.A00 = jArr;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0593Fo
    public final List<C0592Fn> A6Z(long j10) {
        C0592Fn c0592Fn;
        int iA0B = IF.A0B(this.A00, j10, true, false);
        if (iA0B == -1 || (c0592Fn = this.A01[iA0B]) == null) {
            return Collections.emptyList();
        }
        return Collections.singletonList(c0592Fn);
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0593Fo
    public final long A70(int i10) {
        boolean z10 = true;
        AbstractC0629Ha.A03(i10 >= 0);
        if (i10 >= this.A00.length) {
            z10 = false;
        }
        AbstractC0629Ha.A03(z10);
        return this.A00[i10];
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0593Fo
    public final int A71() {
        return this.A00.length;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0593Fo
    public final int A7T(long j10) {
        int iA0A = IF.A0A(this.A00, j10, false, false);
        int index = this.A00.length;
        if (iA0A < index) {
            return iA0A;
        }
        return -1;
    }
}
