package com.meta.analytics.dsp.uinode;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public class HH implements InterfaceC1260ce {
    public final List<InterfaceC0899Rr> A00 = new ArrayList();

    @Override // com.meta.analytics.dsp.uinode.InterfaceC1260ce
    public final InterfaceC0899Rr A5q(int i10) {
        this.A00.get(i10);
        return null;
    }

    @Override // java.lang.Iterable
    public final Iterator<InterfaceC0899Rr> iterator() {
        return this.A00.iterator();
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC1260ce
    public final int size() {
        return this.A00.size();
    }
}
