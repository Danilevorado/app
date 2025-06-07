package com.meta.analytics.dsp.uinode;

import com.facebook.ads.AdError;
import com.facebook.ads.internal.protocol.AdErrorType;

/* loaded from: assets/audience_network.dex */
public abstract class L1 {
    public static AdError A00(C0679Jb c0679Jb) {
        if (c0679Jb.A03().isPublicError()) {
            return new AdError(c0679Jb.A03().getErrorCode(), c0679Jb.A04());
        }
        return new AdError(AdErrorType.UNKNOWN_ERROR.getErrorCode(), AdErrorType.UNKNOWN_ERROR.getDefaultErrorMessage());
    }
}
