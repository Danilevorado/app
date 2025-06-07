package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
final class ob3 extends fa3 {

    /* renamed from: t, reason: collision with root package name */
    private ab3 f13136t;

    /* renamed from: u, reason: collision with root package name */
    private ScheduledFuture f13137u;

    private ob3(ab3 ab3Var) {
        Objects.requireNonNull(ab3Var);
        this.f13136t = ab3Var;
    }

    static ab3 F(ab3 ab3Var, long j10, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        ob3 ob3Var = new ob3(ab3Var);
        lb3 lb3Var = new lb3(ob3Var);
        ob3Var.f13137u = scheduledExecutorService.schedule(lb3Var, j10, timeUnit);
        ab3Var.b(lb3Var, da3.INSTANCE);
        return ob3Var;
    }

    @Override // com.google.android.gms.internal.ads.b93
    protected final String f() {
        ab3 ab3Var = this.f13136t;
        ScheduledFuture scheduledFuture = this.f13137u;
        if (ab3Var == null) {
            return null;
        }
        String str = "inputFuture=[" + ab3Var.toString() + "]";
        if (scheduledFuture == null) {
            return str;
        }
        long delay = scheduledFuture.getDelay(TimeUnit.MILLISECONDS);
        if (delay <= 0) {
            return str;
        }
        return str + ", remaining delay=[" + delay + " ms]";
    }

    @Override // com.google.android.gms.internal.ads.b93
    protected final void g() {
        v(this.f13136t);
        ScheduledFuture scheduledFuture = this.f13137u;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.f13136t = null;
        this.f13137u = null;
    }
}
