package com.meta.analytics.dsp.uinode;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.facebook.ads.redexgen.X.7e, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC04007e {
    public static final AtomicReference<C1072Ym> A00 = new AtomicReference<>();

    public static C1072Ym A00() {
        return A00.get();
    }

    public static void A01(C1072Ym c1072Ym) {
        if (c1072Ym == null) {
            return;
        }
        AbstractC03997d.A00(A00, null, c1072Ym);
    }
}
