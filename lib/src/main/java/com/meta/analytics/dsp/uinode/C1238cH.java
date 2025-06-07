package com.meta.analytics.dsp.uinode;

import android.os.Handler;
import android.os.Looper;

/* renamed from: com.facebook.ads.redexgen.X.cH, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1238cH {
    public static C1238cH A02 = null;
    public final C1250cT A00;
    public final C1248cR A01;

    public C1238cH(AbstractC1254cY abstractC1254cY, C1248cR c1248cR, C1250cT c1250cT) {
        this.A00 = c1250cT;
        this.A01 = c1248cR;
        abstractC1254cY.A02(new H2(c1248cR));
    }

    public static C1238cH A00(AbstractC1254cY abstractC1254cY, InterfaceC1258cc interfaceC1258cc, HB hb2) {
        C1238cH localsTestInstance = A02;
        if (localsTestInstance != null) {
            return localsTestInstance;
        }
        C1250cT c1250cT = new C1250cT();
        return new C1238cH(abstractC1254cY, new C1248cR(interfaceC1258cc, new HL(), hb2, c1250cT, new Handler(Looper.getMainLooper())), c1250cT);
    }

    public final void A01(cX cXVar) {
        this.A01.A09(cXVar);
    }

    public final void A02(InterfaceC1252cV interfaceC1252cV) {
        this.A01.A0A(interfaceC1252cV);
    }

    public final void A03(DspViewableNode dspViewableNode) {
        this.A00.A01(dspViewableNode);
    }

    public final void A04(DspViewableNode dspViewableNode, C1256ca c1256ca) {
        this.A00.A02(dspViewableNode, c1256ca);
    }
}
