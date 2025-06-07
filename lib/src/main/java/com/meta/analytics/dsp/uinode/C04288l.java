package com.meta.analytics.dsp.uinode;

import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.8l, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C04288l {
    public static C04288l A00 = new C04288l();

    public static C04288l A00() {
        return A00;
    }

    public final YI A01(C04017f c04017f, boolean z10) {
        return new YI(c04017f, z10, new C6S());
    }

    public final Map<String, String> A02(C04017f c04017f) {
        try {
            return A01(c04017f, false).A05();
        } catch (Throwable th) {
            c04017f.A07().A3c(th);
            return C04208d.A01(c04017f);
        }
    }
}
