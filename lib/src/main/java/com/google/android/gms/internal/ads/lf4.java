package com.google.android.gms.internal.ads;

import android.media.metrics.LogSessionId;

/* loaded from: classes.dex */
abstract class lf4 {
    public static void a(ff4 ff4Var, xb4 xb4Var) {
        LogSessionId logSessionIdA = xb4Var.a();
        if (logSessionIdA.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
            return;
        }
        ff4Var.f8269b.setString("log-session-id", logSessionIdA.getStringId());
    }
}
