package com.meta.analytics.dsp.uinode;

import com.facebook.ads.sync.SyncModifiableBundle;
import java.util.Map;

/* loaded from: assets/audience_network.dex */
public abstract class HT implements S1 {
    public final EnumC0901Rt A00;
    public final AnonymousClass74 A01;

    public HT(AnonymousClass74 anonymousClass74, EnumC0901Rt enumC0901Rt) {
        this.A01 = anonymousClass74;
        this.A00 = enumC0901Rt;
    }

    @Override // com.meta.analytics.dsp.uinode.S1
    public void A3Z(Map<InterfaceC0891Rj, S6> map, Map<SyncModifiableBundle, EnumC0901Rt> map2) {
        map2.put(null, this.A00);
    }
}
