package com.google.android.gms.internal.ads;

import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
final class eb3 extends ka3 implements ScheduledFuture {

    /* renamed from: n, reason: collision with root package name */
    private final ScheduledFuture f7701n;

    public eb3(ab3 ab3Var, ScheduledFuture scheduledFuture) {
        super(ab3Var);
        this.f7701n = scheduledFuture;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z10) {
        boolean zCancel = i().cancel(z10);
        if (zCancel) {
            this.f7701n.cancel(z10);
        }
        return zCancel;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Delayed delayed) {
        return this.f7701n.compareTo(delayed);
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.f7701n.getDelay(timeUnit);
    }
}
