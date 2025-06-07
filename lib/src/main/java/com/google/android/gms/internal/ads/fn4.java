package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.SystemClock;

/* loaded from: classes.dex */
public final class fn4 {

    /* renamed from: a, reason: collision with root package name */
    private final Handler f8347a;

    /* renamed from: b, reason: collision with root package name */
    private final gn4 f8348b;

    public fn4(Handler handler, gn4 gn4Var) {
        this.f8347a = gn4Var == null ? null : handler;
        this.f8348b = gn4Var;
    }

    public final void a(final String str, final long j10, final long j11) {
        Handler handler = this.f8347a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.an4
                @Override // java.lang.Runnable
                public final void run() {
                    this.f6184m.g(str, j10, j11);
                }
            });
        }
    }

    public final void b(final String str) {
        Handler handler = this.f8347a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.en4
                @Override // java.lang.Runnable
                public final void run() {
                    this.f7919m.h(str);
                }
            });
        }
    }

    public final void c(final g54 g54Var) {
        g54Var.a();
        Handler handler = this.f8347a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zm4
                @Override // java.lang.Runnable
                public final void run() {
                    this.f18650m.i(g54Var);
                }
            });
        }
    }

    public final void d(final int i10, final long j10) {
        Handler handler = this.f8347a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.um4
                @Override // java.lang.Runnable
                public final void run() {
                    this.f16405m.j(i10, j10);
                }
            });
        }
    }

    public final void e(final g54 g54Var) {
        Handler handler = this.f8347a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.ym4
                @Override // java.lang.Runnable
                public final void run() {
                    this.f18113m.k(g54Var);
                }
            });
        }
    }

    public final void f(final k9 k9Var, final h54 h54Var) {
        Handler handler = this.f8347a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.bn4
                @Override // java.lang.Runnable
                public final void run() {
                    this.f6557m.l(k9Var, h54Var);
                }
            });
        }
    }

    final /* synthetic */ void g(String str, long j10, long j11) {
        gn4 gn4Var = this.f8348b;
        int i10 = sv2.f15560a;
        gn4Var.n(str, j10, j11);
    }

    final /* synthetic */ void h(String str) {
        gn4 gn4Var = this.f8348b;
        int i10 = sv2.f15560a;
        gn4Var.M(str);
    }

    final /* synthetic */ void i(g54 g54Var) {
        g54Var.a();
        gn4 gn4Var = this.f8348b;
        int i10 = sv2.f15560a;
        gn4Var.h(g54Var);
    }

    final /* synthetic */ void j(int i10, long j10) {
        gn4 gn4Var = this.f8348b;
        int i11 = sv2.f15560a;
        gn4Var.e(i10, j10);
    }

    final /* synthetic */ void k(g54 g54Var) {
        gn4 gn4Var = this.f8348b;
        int i10 = sv2.f15560a;
        gn4Var.c(g54Var);
    }

    final /* synthetic */ void l(k9 k9Var, h54 h54Var) {
        int i10 = sv2.f15560a;
        this.f8348b.j(k9Var, h54Var);
    }

    final /* synthetic */ void m(Object obj, long j10) {
        gn4 gn4Var = this.f8348b;
        int i10 = sv2.f15560a;
        gn4Var.q(obj, j10);
    }

    final /* synthetic */ void n(long j10, int i10) {
        gn4 gn4Var = this.f8348b;
        int i11 = sv2.f15560a;
        gn4Var.g(j10, i10);
    }

    final /* synthetic */ void o(Exception exc) {
        gn4 gn4Var = this.f8348b;
        int i10 = sv2.f15560a;
        gn4Var.m(exc);
    }

    final /* synthetic */ void p(vh1 vh1Var) {
        gn4 gn4Var = this.f8348b;
        int i10 = sv2.f15560a;
        gn4Var.q0(vh1Var);
    }

    public final void q(final Object obj) {
        if (this.f8347a != null) {
            final long jElapsedRealtime = SystemClock.elapsedRealtime();
            this.f8347a.post(new Runnable() { // from class: com.google.android.gms.internal.ads.vm4
                @Override // java.lang.Runnable
                public final void run() {
                    this.f16785m.m(obj, jElapsedRealtime);
                }
            });
        }
    }

    public final void r(final long j10, final int i10) {
        Handler handler = this.f8347a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.xm4
                @Override // java.lang.Runnable
                public final void run() {
                    this.f17638m.n(j10, i10);
                }
            });
        }
    }

    public final void s(final Exception exc) {
        Handler handler = this.f8347a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.wm4
                @Override // java.lang.Runnable
                public final void run() {
                    this.f17209m.o(exc);
                }
            });
        }
    }

    public final void t(final vh1 vh1Var) {
        Handler handler = this.f8347a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.dn4
                @Override // java.lang.Runnable
                public final void run() {
                    this.f7425m.p(vh1Var);
                }
            });
        }
    }
}
