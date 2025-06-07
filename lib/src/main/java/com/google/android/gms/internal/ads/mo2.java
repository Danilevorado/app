package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;

/* loaded from: classes.dex */
public final class mo2 implements hu1 {
    protected mo2() {
    }

    @Override // com.google.android.gms.internal.ads.hu1
    public final long a() {
        return SystemClock.elapsedRealtime();
    }

    @Override // com.google.android.gms.internal.ads.hu1
    public final r32 b(Looper looper, Handler.Callback callback) {
        return new pr2(new Handler(looper, callback));
    }
}
