package com.google.android.gms.internal.ads;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
final class zg implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    private final ThreadFactory f18566a = Executors.defaultThreadFactory();

    /* renamed from: b, reason: collision with root package name */
    private final AtomicInteger f18567b = new AtomicInteger(1);

    zg() {
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread threadNewThread = this.f18566a.newThread(runnable);
        threadNewThread.setName("gads-" + this.f18567b.getAndIncrement());
        return threadNewThread;
    }
}
