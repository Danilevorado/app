package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class tf0 implements ab3 {

    /* renamed from: m, reason: collision with root package name */
    private final kb3 f15812m = kb3.D();

    private static final boolean c(boolean z10) {
        if (!z10) {
            j3.t.q().t(new IllegalStateException("Provided SettableFuture with multiple values."), "SettableFuture");
        }
        return z10;
    }

    @Override // com.google.android.gms.internal.ads.ab3
    public final void b(Runnable runnable, Executor executor) {
        this.f15812m.b(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z10) {
        return this.f15812m.cancel(z10);
    }

    public final boolean e(Object obj) {
        boolean zH = this.f15812m.h(obj);
        c(zH);
        return zH;
    }

    public final boolean f(Throwable th) {
        boolean zI = this.f15812m.i(th);
        c(zI);
        return zI;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f15812m.get();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j10, TimeUnit timeUnit) {
        return this.f15812m.get(j10, timeUnit);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f15812m.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f15812m.isDone();
    }
}
