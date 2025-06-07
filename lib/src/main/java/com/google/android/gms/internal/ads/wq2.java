package com.google.android.gms.internal.ads;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
final class wq2 implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    private final AtomicInteger f17244a = new AtomicInteger(1);

    wq2() {
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, "AdWorker(NG) #" + this.f17244a.getAndIncrement());
    }
}
