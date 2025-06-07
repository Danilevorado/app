package com.onesignal;

import android.os.SystemClock;

/* loaded from: classes.dex */
public class x2 implements w2 {
    @Override // com.onesignal.w2
    public long a() {
        return SystemClock.elapsedRealtime();
    }

    @Override // com.onesignal.w2
    public long b() {
        return System.currentTimeMillis();
    }
}
