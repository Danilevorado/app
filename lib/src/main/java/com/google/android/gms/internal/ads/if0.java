package com.google.android.gms.internal.ads;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
final class if0 implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    private final AtomicInteger f9709a = new AtomicInteger(1);

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f9710b;

    if0(String str) {
        this.f9710b = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, "AdWorker(" + this.f9710b + ") #" + this.f9709a.getAndIncrement());
    }
}
