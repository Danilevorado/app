package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class h01 implements l11, o81, f61, b21, nj {

    /* renamed from: m, reason: collision with root package name */
    private final d21 f8927m;

    /* renamed from: n, reason: collision with root package name */
    private final hn2 f8928n;

    /* renamed from: o, reason: collision with root package name */
    private final ScheduledExecutorService f8929o;

    /* renamed from: p, reason: collision with root package name */
    private final Executor f8930p;

    /* renamed from: r, reason: collision with root package name */
    private ScheduledFuture f8932r;

    /* renamed from: q, reason: collision with root package name */
    private final kb3 f8931q = kb3.D();

    /* renamed from: s, reason: collision with root package name */
    private final AtomicBoolean f8933s = new AtomicBoolean();

    h01(d21 d21Var, hn2 hn2Var, ScheduledExecutorService scheduledExecutorService, Executor executor) {
        this.f8927m = d21Var;
        this.f8928n = hn2Var;
        this.f8929o = scheduledExecutorService;
        this.f8930p = executor;
    }

    private final boolean d() {
        return this.f8928n.Z == 2;
    }

    @Override // com.google.android.gms.internal.ads.l11
    public final void D() {
    }

    @Override // com.google.android.gms.internal.ads.nj
    public final void U(mj mjVar) {
        if (((Boolean) k3.w.c().b(ir.G9)).booleanValue() && !d() && mjVar.f12152j && this.f8933s.compareAndSet(false, true)) {
            m3.n1.k("Full screen 1px impression occurred");
            this.f8927m.a();
        }
    }

    final /* synthetic */ void b() {
        synchronized (this) {
            if (this.f8931q.isDone()) {
                return;
            }
            this.f8931q.h(Boolean.TRUE);
        }
    }

    @Override // com.google.android.gms.internal.ads.f61
    public final synchronized void c() {
        if (this.f8931q.isDone()) {
            return;
        }
        ScheduledFuture scheduledFuture = this.f8932r;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        this.f8931q.h(Boolean.TRUE);
    }

    @Override // com.google.android.gms.internal.ads.o81
    public final void e() {
        if (((Boolean) k3.w.c().b(ir.f10067r1)).booleanValue() && d()) {
            if (this.f8928n.f9270r == 0) {
                this.f8927m.a();
            } else {
                qa3.q(this.f8931q, new f01(this), this.f8930p);
                this.f8932r = this.f8929o.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.e01
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f7582m.b();
                    }
                }, this.f8928n.f9270r, TimeUnit.MILLISECONDS);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.f61
    public final void f() {
        if (!((Boolean) k3.w.c().b(ir.G9)).booleanValue() || d()) {
            return;
        }
        this.f8927m.a();
    }

    @Override // com.google.android.gms.internal.ads.o81
    public final void h() {
    }

    @Override // com.google.android.gms.internal.ads.l11
    public final void j() {
    }

    @Override // com.google.android.gms.internal.ads.l11
    public final void n() {
    }

    @Override // com.google.android.gms.internal.ads.l11
    public final void p() {
        int i10 = this.f8928n.Z;
        if (i10 == 0 || i10 == 1) {
            if (((Boolean) k3.w.c().b(ir.G9)).booleanValue()) {
                return;
            }
            this.f8927m.a();
        }
    }

    @Override // com.google.android.gms.internal.ads.l11
    public final void q() {
    }

    @Override // com.google.android.gms.internal.ads.l11
    public final void v(aa0 aa0Var, String str, String str2) {
    }

    @Override // com.google.android.gms.internal.ads.b21
    public final synchronized void v0(k3.w2 w2Var) {
        if (this.f8931q.isDone()) {
            return;
        }
        ScheduledFuture scheduledFuture = this.f8932r;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        this.f8931q.i(new Exception());
    }
}
