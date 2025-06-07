package com.meta.analytics.dsp.uinode;

import java.util.Map;

/* loaded from: assets/audience_network.dex */
public class YM implements InterfaceC0906Ry {
    public final /* synthetic */ C1072Ym A00;
    public final /* synthetic */ K1 A01;

    public YM(K1 k12, C1072Ym c1072Ym) {
        this.A01 = k12;
        this.A00 = c1072Ym;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0906Ry
    public final Map<String, String> A6x() {
        return this.A01.A09(C04288l.A00().A01(this.A00, true).A05());
    }
}
