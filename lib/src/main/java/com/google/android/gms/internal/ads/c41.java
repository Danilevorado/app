package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class c41 extends z61 {

    /* renamed from: n, reason: collision with root package name */
    private final ScheduledExecutorService f6769n;

    /* renamed from: o, reason: collision with root package name */
    private final i4.e f6770o;

    /* renamed from: p, reason: collision with root package name */
    private long f6771p;

    /* renamed from: q, reason: collision with root package name */
    private long f6772q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f6773r;

    /* renamed from: s, reason: collision with root package name */
    private ScheduledFuture f6774s;

    public c41(ScheduledExecutorService scheduledExecutorService, i4.e eVar) {
        super(Collections.emptySet());
        this.f6771p = -1L;
        this.f6772q = -1L;
        this.f6773r = false;
        this.f6769n = scheduledExecutorService;
        this.f6770o = eVar;
    }

    private final synchronized void s0(long j10) {
        ScheduledFuture scheduledFuture = this.f6774s;
        if (scheduledFuture != null && !scheduledFuture.isDone()) {
            this.f6774s.cancel(true);
        }
        this.f6771p = this.f6770o.b() + j10;
        this.f6774s = this.f6769n.schedule(new b41(this, null), j10, TimeUnit.MILLISECONDS);
    }

    public final synchronized void a() {
        this.f6773r = false;
        s0(0L);
    }

    public final synchronized void b() {
        if (this.f6773r) {
            return;
        }
        ScheduledFuture scheduledFuture = this.f6774s;
        if (scheduledFuture == null || scheduledFuture.isCancelled()) {
            this.f6772q = -1L;
        } else {
            this.f6774s.cancel(true);
            this.f6772q = this.f6771p - this.f6770o.b();
        }
        this.f6773r = true;
    }

    public final synchronized void d() {
        if (this.f6773r) {
            if (this.f6772q > 0 && this.f6774s.isCancelled()) {
                s0(this.f6772q);
            }
            this.f6773r = false;
        }
    }

    public final synchronized void r0(int i10) {
        if (i10 <= 0) {
            return;
        }
        long millis = TimeUnit.SECONDS.toMillis(i10);
        if (this.f6773r) {
            long j10 = this.f6772q;
            if (j10 <= 0 || millis >= j10) {
                millis = j10;
            }
            this.f6772q = millis;
            return;
        }
        long jB = this.f6770o.b();
        long j11 = this.f6771p;
        if (jB > j11 || j11 - this.f6770o.b() > millis) {
            s0(millis);
        }
    }
}
