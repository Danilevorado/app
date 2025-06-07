package com.meta.analytics.dsp.uinode;

import com.facebook.ads.NativeAd;
import java.util.Iterator;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public class ZB implements C6U {
    public final List<C1191bK> A00;
    public final /* synthetic */ ZA A01;

    public ZB(ZA za2, List<C1191bK> list) {
        this.A01 = za2;
        this.A00 = list;
    }

    private void A00() {
        this.A01.A00.A05(true);
        this.A01.A00.A02();
        this.A01.A00.A03(0);
        Iterator<C1191bK> it = this.A00.iterator();
        while (it.hasNext()) {
            V2 v22 = new V2(this.A01.A01, it.next(), null, V2.A0K(), this.A01.A00.A01());
            if (v22.A0y() != null && v22.A0y().A0F() != null) {
                ((AbstractC1152ah) v22.A0y().A0F()).A00(v22);
            }
            this.A01.A00.A04(new NativeAd(this.A01.A01, v22));
        }
        KK.A00(new ZC(this));
    }

    @Override // com.meta.analytics.dsp.uinode.C6U
    public final void AB2() {
        A00();
    }

    @Override // com.meta.analytics.dsp.uinode.C6U
    public final void ABB() {
        A00();
    }
}
