package com.google.android.gms.internal.ads;

import android.os.Looper;

/* loaded from: classes.dex */
final class gh0 implements Runnable {
    gh0(ih0 ih0Var) {
    }

    @Override // java.lang.Runnable
    public final void run() {
        Looper.myLooper().quit();
    }
}
