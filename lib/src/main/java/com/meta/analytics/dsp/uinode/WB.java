package com.meta.analytics.dsp.uinode;

import java.util.Collections;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public final class WB implements InterfaceC0593Fo {
    public static String[] A01 = {"HW2qPt5u", "AwGYl2mpYTTxi9jMk2ztyBHwHH9P0uOm", "ziApCMCdbQMQdjd0mTARuvEC3B", "RZTttmRl2v5Rh0lD63G6fj8mov5GfzUW", "CAabTzRSjKw", "MBUj6", "1ELfNFRtAis", "0tjH0VZdGvNSLcI7F3HjH1zffCsfPrCD"};
    public final List<C0592Fn> A00;

    public WB(List<C0592Fn> list) {
        this.A00 = Collections.unmodifiableList(list);
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0593Fo
    public final List<C0592Fn> A6Z(long j10) {
        return j10 >= 0 ? this.A00 : Collections.emptyList();
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0593Fo
    public final long A70(int i10) {
        AbstractC0629Ha.A03(i10 == 0);
        if (A01[2].length() == 12) {
            throw new RuntimeException();
        }
        A01[2] = "5DVkB5gcIO90TUIp";
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
