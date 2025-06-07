package com.google.android.gms.internal.ads;

import android.os.Handler;

/* loaded from: classes.dex */
public final class lc4 {

    /* renamed from: a, reason: collision with root package name */
    private final Handler f11483a;

    /* renamed from: b, reason: collision with root package name */
    private final mc4 f11484b;

    public lc4(Handler handler, mc4 mc4Var) {
        this.f11483a = mc4Var == null ? null : handler;
        this.f11484b = mc4Var;
    }

    public final void a(final Exception exc) {
        Handler handler = this.f11483a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.bc4
                @Override // java.lang.Runnable
                public final void run() {
                    this.f6427m.h(exc);
                }
            });
        }
    }

    public final void b(final Exception exc) {
        Handler handler = this.f11483a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.hc4
                @Override // java.lang.Runnable
                public final void run() {
                    this.f9099m.i(exc);
                }
            });
        }
    }

    public final void c(final String str, final long j10, final long j11) {
        Handler handler = this.f11483a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.gc4
                @Override // java.lang.Runnable
                public final void run() {
                    this.f8674m.j(str, j10, j11);
                }
            });
        }
    }

    public final void d(final String str) {
        Handler handler = this.f11483a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.ic4
                @Override // java.lang.Runnable
                public final void run() {
                    this.f9687m.k(str);
                }
            });
        }
    }

    public final void e(final g54 g54Var) {
        g54Var.a();
        Handler handler = this.f11483a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.cc4
                @Override // java.lang.Runnable
                public final void run() {
                    this.f6875m.l(g54Var);
                }
            });
        }
    }

    public final void f(final g54 g54Var) {
        Handler handler = this.f11483a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.dc4
                @Override // java.lang.Runnable
                public final void run() {
                    this.f7261m.m(g54Var);
                }
            });
        }
    }

    public final void g(final k9 k9Var, final h54 h54Var) {
        Handler handler = this.f11483a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.jc4
                @Override // java.lang.Runnable
                public final void run() {
                    this.f10424m.n(k9Var, h54Var);
                }
            });
        }
    }

    final /* synthetic */ void h(Exception exc) {
        mc4 mc4Var = this.f11484b;
        int i10 = sv2.f15560a;
        mc4Var.k(exc);
    }

    final /* synthetic */ void i(Exception exc) {
        mc4 mc4Var = this.f11484b;
        int i10 = sv2.f15560a;
        mc4Var.r(exc);
    }

    final /* synthetic */ void j(String str, long j10, long j11) {
        mc4 mc4Var = this.f11484b;
        int i10 = sv2.f15560a;
        mc4Var.o(str, j10, j11);
    }

    final /* synthetic */ void k(String str) {
        mc4 mc4Var = this.f11484b;
        int i10 = sv2.f15560a;
        mc4Var.W(str);
    }

    final /* synthetic */ void l(g54 g54Var) {
        g54Var.a();
        mc4 mc4Var = this.f11484b;
        int i10 = sv2.f15560a;
        mc4Var.d(g54Var);
    }

    final /* synthetic */ void m(g54 g54Var) {
        mc4 mc4Var = this.f11484b;
        int i10 = sv2.f15560a;
        mc4Var.l(g54Var);
    }

    final /* synthetic */ void n(k9 k9Var, h54 h54Var) {
        int i10 = sv2.f15560a;
        this.f11484b.i(k9Var, h54Var);
    }

    final /* synthetic */ void o(long j10) {
        mc4 mc4Var = this.f11484b;
        int i10 = sv2.f15560a;
        mc4Var.p(j10);
    }

    final /* synthetic */ void p(boolean z10) {
        mc4 mc4Var = this.f11484b;
        int i10 = sv2.f15560a;
        mc4Var.b(z10);
    }

    final /* synthetic */ void q(int i10, long j10, long j11) {
        mc4 mc4Var = this.f11484b;
        int i11 = sv2.f15560a;
        mc4Var.f(i10, j10, j11);
    }

    public final void r(final long j10) {
        Handler handler = this.f11483a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.ec4
                @Override // java.lang.Runnable
                public final void run() {
                    this.f7711m.o(j10);
                }
            });
        }
    }

    public final void s(final boolean z10) {
        Handler handler = this.f11483a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.fc4
                @Override // java.lang.Runnable
                public final void run() {
                    this.f8224m.p(z10);
                }
            });
        }
    }

    public final void t(final int i10, final long j10, final long j11) {
        Handler handler = this.f11483a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.kc4
                @Override // java.lang.Runnable
                public final void run() {
                    this.f10958m.q(i10, j10, j11);
                }
            });
        }
    }
}
