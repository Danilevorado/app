package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.metrics.LogSessionId;

/* loaded from: classes.dex */
abstract class y64 {
    public static xb4 a(Context context, j74 j74Var, boolean z10) {
        tb4 tb4VarM = tb4.m(context);
        if (tb4VarM == null) {
            ad2.e("ExoPlayerImpl", "MediaMetricsService unavailable.");
            return new xb4(LogSessionId.LOG_SESSION_ID_NONE);
        }
        if (z10) {
            j74Var.t(tb4VarM);
        }
        return new xb4(tb4VarM.k());
    }
}
