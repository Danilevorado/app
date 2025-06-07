package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
final class gb3 extends db3 implements ScheduledExecutorService {

    /* renamed from: n, reason: collision with root package name */
    final ScheduledExecutorService f8667n;

    gb3(ScheduledExecutorService scheduledExecutorService) {
        super(scheduledExecutorService);
        Objects.requireNonNull(scheduledExecutorService);
        this.f8667n = scheduledExecutorService;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture schedule(Runnable runnable, long j10, TimeUnit timeUnit) {
        rb3 rb3VarE = rb3.E(runnable, null);
        return new eb3(rb3VarE, this.f8667n.schedule(rb3VarE, j10, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture schedule(Callable callable, long j10, TimeUnit timeUnit) {
        rb3 rb3Var = new rb3(callable);
        return new eb3(rb3Var, this.f8667n.schedule(rb3Var, j10, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
        fb3 fb3Var = new fb3(runnable);
        return new eb3(fb3Var, this.f8667n.scheduleAtFixedRate(fb3Var, j10, j11, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
        fb3 fb3Var = new fb3(runnable);
        return new eb3(fb3Var, this.f8667n.scheduleWithFixedDelay(fb3Var, j10, j11, timeUnit));
    }
}
