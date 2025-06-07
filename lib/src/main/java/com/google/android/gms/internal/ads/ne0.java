package com.google.android.gms.internal.ads;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
final class ne0 implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    private final AtomicInteger f12591a = new AtomicInteger(1);

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f12592b;

    ne0(String str) {
        this.f12592b = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, "AdWorker(" + this.f12592b + ") #" + this.f12591a.getAndIncrement());
    }
}
