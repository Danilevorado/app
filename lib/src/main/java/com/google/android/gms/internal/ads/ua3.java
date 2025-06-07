package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
final class ua3 implements ab3 {

    /* renamed from: n, reason: collision with root package name */
    static final ab3 f16253n = new ua3(null);

    /* renamed from: o, reason: collision with root package name */
    private static final Logger f16254o = Logger.getLogger(ua3.class.getName());

    /* renamed from: m, reason: collision with root package name */
    private final Object f16255m;

    ua3(Object obj) {
        this.f16255m = obj;
    }

    @Override // com.google.android.gms.internal.ads.ab3
    public final void b(Runnable runnable, Executor executor) {
        i33.c(runnable, "Runnable was null.");
        i33.c(executor, "Executor was null.");
        try {
            executor.execute(runnable);
        } catch (RuntimeException e5) {
            f16254o.logp(Level.SEVERE, "com.google.common.util.concurrent.ImmediateFuture", "addListener", "RuntimeException while executing runnable " + String.valueOf(runnable) + " with executor " + String.valueOf(executor), (Throwable) e5);
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z10) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f16255m;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j10, TimeUnit timeUnit) {
        Objects.requireNonNull(timeUnit);
        return this.f16255m;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return true;
    }

    public final String toString() {
        return super.toString() + "[status=SUCCESS, result=[" + String.valueOf(this.f16255m) + "]]";
    }
}
