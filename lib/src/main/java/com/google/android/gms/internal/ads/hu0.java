package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class hu0 implements hk {

    /* renamed from: a, reason: collision with root package name */
    private final ScheduledExecutorService f9414a;

    /* renamed from: b, reason: collision with root package name */
    private final i4.e f9415b;

    /* renamed from: c, reason: collision with root package name */
    private ScheduledFuture f9416c;

    /* renamed from: d, reason: collision with root package name */
    private long f9417d = -1;

    /* renamed from: e, reason: collision with root package name */
    private long f9418e = -1;

    /* renamed from: f, reason: collision with root package name */
    private Runnable f9419f = null;

    /* renamed from: g, reason: collision with root package name */
    private boolean f9420g = false;

    public hu0(ScheduledExecutorService scheduledExecutorService, i4.e eVar) {
        this.f9414a = scheduledExecutorService;
        this.f9415b = eVar;
        j3.t.d().c(this);
    }

    @Override // com.google.android.gms.internal.ads.hk
    public final void a(boolean z10) {
        if (z10) {
            c();
        } else {
            b();
        }
    }

    final synchronized void b() {
        if (this.f9420g) {
            return;
        }
        ScheduledFuture scheduledFuture = this.f9416c;
        if (scheduledFuture == null || scheduledFuture.isDone()) {
            this.f9418e = -1L;
        } else {
            this.f9416c.cancel(true);
            this.f9418e = this.f9417d - this.f9415b.b();
        }
        this.f9420g = true;
    }

    final synchronized void c() {
        ScheduledFuture scheduledFuture;
        if (this.f9420g) {
            if (this.f9418e > 0 && (scheduledFuture = this.f9416c) != null && scheduledFuture.isCancelled()) {
                this.f9416c = this.f9414a.schedule(this.f9419f, this.f9418e, TimeUnit.MILLISECONDS);
            }
            this.f9420g = false;
        }
    }

    public final synchronized void d(int i10, Runnable runnable) {
        this.f9419f = runnable;
        long j10 = i10;
        this.f9417d = this.f9415b.b() + j10;
        this.f9416c = this.f9414a.schedule(runnable, j10, TimeUnit.MILLISECONDS);
    }
}
