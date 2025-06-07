package com.meta.analytics.dsp.uinode;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: assets/audience_network.dex */
public final class WD implements InterfaceC0593Fo {
    public final GB A00;
    public final Map<String, GH> A01;
    public final Map<String, GC> A02;
    public final long[] A03;

    public WD(GB gb2, Map<String, GH> map, Map<String, GC> map2) {
        Map<String, GH> mapEmptyMap;
        this.A00 = gb2;
        this.A02 = map2;
        if (map != null) {
            mapEmptyMap = Collections.unmodifiableMap(map);
        } else {
            mapEmptyMap = Collections.emptyMap();
        }
        this.A01 = mapEmptyMap;
        this.A03 = gb2.A0F();
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0593Fo
    public final List<C0592Fn> A6Z(long j10) {
        return this.A00.A0D(j10, this.A01, this.A02);
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0593Fo
    public final long A70(int i10) {
        return this.A03[i10];
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0593Fo
    public final int A71() {
        return this.A03.length;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0593Fo
    public final int A7T(long j10) {
        int iA0A = IF.A0A(this.A03, j10, false, false);
        int index = this.A03.length;
        if (iA0A < index) {
            return iA0A;
        }
        return -1;
    }
}
