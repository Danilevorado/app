package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
final class jf0 implements Executor {

    /* renamed from: m, reason: collision with root package name */
    private final Handler f10467m = new m3.o1(Looper.getMainLooper());

    jf0() {
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            this.f10467m.post(runnable);
            return;
        }
        try {
            runnable.run();
        } catch (Throwable th) {
            j3.t.r();
            m3.b2.h(j3.t.q().c(), th);
            throw th;
        }
    }
}
