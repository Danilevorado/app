package com.meta.analytics.dsp.uinode;

import com.facebook.ads.VideoStartReason;

/* renamed from: com.facebook.ads.redexgen.X.Lk, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC0736Lk {
    public static QM A00(VideoStartReason videoStartReason) {
        switch (C0735Lj.A00[videoStartReason.ordinal()]) {
            case 1:
                return QM.A02;
            case 2:
                return QM.A03;
            case 3:
                return QM.A04;
            default:
                return QM.A03;
        }
    }
}
