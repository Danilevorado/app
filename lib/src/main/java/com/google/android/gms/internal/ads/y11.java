package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class y11 extends z61 implements p11 {

    /* renamed from: n, reason: collision with root package name */
    private final ScheduledExecutorService f17855n;

    /* renamed from: o, reason: collision with root package name */
    private ScheduledFuture f17856o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f17857p;

    public y11(x11 x11Var, Set set, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        super(set);
        this.f17857p = false;
        this.f17855n = scheduledExecutorService;
        o0(x11Var, executor);
    }

    @Override // com.google.android.gms.internal.ads.p11
    public final void b() {
        q0(new y61() { // from class: com.google.android.gms.internal.ads.t11
            @Override // com.google.android.gms.internal.ads.y61
            public final void a(Object obj) {
                ((p11) obj).b();
            }
        });
    }

    public final synchronized void c() {
        ScheduledFuture scheduledFuture = this.f17856o;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
    }

    public final void e() {
        this.f17856o = this.f17855n.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.s11
            @Override // java.lang.Runnable
            public final void run() {
                this.f15054m.f();
            }
        }, ((Integer) k3.w.c().b(ir.f9955g9)).intValue(), TimeUnit.MILLISECONDS);
    }

    final /* synthetic */ void f() {
        synchronized (this) {
            ze0.d("Timeout waiting for show call succeed to be called.");
            h0(new ib1("Timeout for show call succeed."));
            this.f17857p = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.p11
    public final void h0(final ib1 ib1Var) {
        if (this.f17857p) {
            return;
        }
        ScheduledFuture scheduledFuture = this.f17856o;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        q0(new y61() { // from class: com.google.android.gms.internal.ads.q11
            @Override // com.google.android.gms.internal.ads.y61
            public final void a(Object obj) {
                ((p11) obj).h0(ib1Var);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.p11
    public final void u(final k3.w2 w2Var) {
        q0(new y61() { // from class: com.google.android.gms.internal.ads.r11
            @Override // com.google.android.gms.internal.ads.y61
            public final void a(Object obj) {
                ((p11) obj).u(w2Var);
            }
        });
    }
}
