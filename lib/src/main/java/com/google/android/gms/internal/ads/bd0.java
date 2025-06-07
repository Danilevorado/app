package com.google.android.gms.internal.ads;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
final class bd0 implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    private final AtomicInteger f6429a = new AtomicInteger(1);

    bd0(ed0 ed0Var) {
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, "AdWorker(SCION_TASK_EXECUTOR) #" + this.f6429a.getAndIncrement());
    }
}
