package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import android.media.metrics.LogSessionId;

/* loaded from: classes.dex */
abstract class bd4 {
    public static void a(AudioTrack audioTrack, xb4 xb4Var) {
        LogSessionId logSessionIdA = xb4Var.a();
        if (logSessionIdA.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
            return;
        }
        audioTrack.setLogSessionId(logSessionIdA);
    }
}
