package com.meta.analytics.dsp.uinode;

import com.facebook.ads.internal.protocol.AdPlacementType;

/* renamed from: com.facebook.ads.redexgen.X.0u, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C02420u {
    public static InterfaceC02370p A00;

    public final InterfaceC02370p A00(C1073Yn c1073Yn, AdPlacementType adPlacementType) {
        InterfaceC02370p interfaceC02370p = A00;
        if (interfaceC02370p != null) {
            return interfaceC02370p;
        }
        switch (C02410t.A00[adPlacementType.ordinal()]) {
            case 1:
                return new C1194bN();
            case 2:
                return new C1193bM();
            case 3:
                return new C1191bK(c1073Yn);
            case 4:
                return new C0582Fb(c1073Yn);
            case 5:
                return new FY();
            default:
                return null;
        }
    }
}
