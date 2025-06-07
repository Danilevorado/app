package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class w02 implements az1 {

    /* renamed from: a, reason: collision with root package name */
    private final xv0 f16926a;

    /* renamed from: b, reason: collision with root package name */
    private final c02 f16927b;

    /* renamed from: c, reason: collision with root package name */
    private final bb3 f16928c;

    /* renamed from: d, reason: collision with root package name */
    private final n11 f16929d;

    /* renamed from: e, reason: collision with root package name */
    private final ScheduledExecutorService f16930e;

    public w02(xv0 xv0Var, c02 c02Var, n11 n11Var, ScheduledExecutorService scheduledExecutorService, bb3 bb3Var) {
        this.f16926a = xv0Var;
        this.f16927b = c02Var;
        this.f16929d = n11Var;
        this.f16930e = scheduledExecutorService;
        this.f16928c = bb3Var;
    }

    @Override // com.google.android.gms.internal.ads.az1
    public final ab3 a(final un2 un2Var, final hn2 hn2Var) {
        return this.f16928c.g(new Callable() { // from class: com.google.android.gms.internal.ads.t02
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f15630a.c(un2Var, hn2Var);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.az1
    public final boolean b(un2 un2Var, hn2 hn2Var) {
        return un2Var.f16412a.f14851a.a() != null && this.f16927b.b(un2Var, hn2Var);
    }

    final /* synthetic */ zu0 c(final un2 un2Var, final hn2 hn2Var) {
        return this.f16926a.b(new tx0(un2Var, hn2Var, null), new lw0(un2Var.f16412a.f14851a.a(), new Runnable() { // from class: com.google.android.gms.internal.ads.u02
            @Override // java.lang.Runnable
            public final void run() {
                this.f16124m.f(un2Var, hn2Var);
            }
        })).a();
    }

    final /* synthetic */ void f(un2 un2Var, hn2 hn2Var) {
        qa3.q(qa3.n(this.f16927b.a(un2Var, hn2Var), hn2Var.S, TimeUnit.SECONDS, this.f16930e), new v02(this), this.f16928c);
    }
}
