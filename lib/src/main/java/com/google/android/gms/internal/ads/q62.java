package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class q62 implements e3.c, i41, a31, o11, f21, k3.a, l11, y31, b21, f91 {

    /* renamed from: u, reason: collision with root package name */
    private final ws2 f14173u;

    /* renamed from: m, reason: collision with root package name */
    private final AtomicReference f14165m = new AtomicReference();

    /* renamed from: n, reason: collision with root package name */
    private final AtomicReference f14166n = new AtomicReference();

    /* renamed from: o, reason: collision with root package name */
    private final AtomicReference f14167o = new AtomicReference();

    /* renamed from: p, reason: collision with root package name */
    private final AtomicReference f14168p = new AtomicReference();

    /* renamed from: q, reason: collision with root package name */
    private final AtomicReference f14169q = new AtomicReference();

    /* renamed from: r, reason: collision with root package name */
    private final AtomicBoolean f14170r = new AtomicBoolean(true);

    /* renamed from: s, reason: collision with root package name */
    private final AtomicBoolean f14171s = new AtomicBoolean(false);

    /* renamed from: t, reason: collision with root package name */
    private final AtomicBoolean f14172t = new AtomicBoolean(false);

    /* renamed from: v, reason: collision with root package name */
    final BlockingQueue f14174v = new ArrayBlockingQueue(((Integer) k3.w.c().b(ir.f9976i8)).intValue());

    public q62(ws2 ws2Var) {
        this.f14173u = ws2Var;
    }

    private final void J() {
        if (this.f14171s.get() && this.f14172t.get()) {
            for (final Pair pair : this.f14174v) {
                kk2.a(this.f14166n, new jk2() { // from class: com.google.android.gms.internal.ads.h62
                    @Override // com.google.android.gms.internal.ads.jk2
                    public final void a(Object obj) {
                        Pair pair2 = pair;
                        ((k3.y0) obj).z0((String) pair2.first, (String) pair2.second);
                    }
                });
            }
            this.f14174v.clear();
            this.f14170r.set(false);
        }
    }

    @Override // e3.c
    public final synchronized void A(final String str, final String str2) {
        if (!this.f14170r.get()) {
            kk2.a(this.f14166n, new jk2() { // from class: com.google.android.gms.internal.ads.d62
                @Override // com.google.android.gms.internal.ads.jk2
                public final void a(Object obj) {
                    ((k3.y0) obj).z0(str, str2);
                }
            });
            return;
        }
        if (!this.f14174v.offer(new Pair(str, str2))) {
            ze0.b("The queue for app events is full, dropping the new event.");
            ws2 ws2Var = this.f14173u;
            if (ws2Var != null) {
                vs2 vs2VarB = vs2.b("dae_action");
                vs2VarB.a("dae_name", str);
                vs2VarB.a("dae_data", str2);
                ws2Var.a(vs2VarB);
            }
        }
    }

    public final void C(k3.f1 f1Var) {
        this.f14169q.set(f1Var);
    }

    @Override // com.google.android.gms.internal.ads.l11
    public final void D() {
    }

    @Override // k3.a
    public final void O() {
        if (((Boolean) k3.w.c().b(ir.f9988j9)).booleanValue()) {
            return;
        }
        kk2.a(this.f14165m, i62.f9569a);
    }

    public final synchronized k3.d0 a() {
        return (k3.d0) this.f14165m.get();
    }

    public final synchronized k3.y0 b() {
        return (k3.y0) this.f14166n.get();
    }

    public final void c(k3.d0 d0Var) {
        this.f14165m.set(d0Var);
    }

    @Override // com.google.android.gms.internal.ads.y31
    public final void d(final k3.j4 j4Var) {
        kk2.a(this.f14167o, new jk2() { // from class: com.google.android.gms.internal.ads.f62
            @Override // com.google.android.gms.internal.ads.jk2
            public final void a(Object obj) {
                ((k3.c2) obj).F2(j4Var);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.i41
    public final void d0(un2 un2Var) {
        this.f14170r.set(true);
        this.f14172t.set(false);
    }

    public final void e(k3.g0 g0Var) {
        this.f14168p.set(g0Var);
    }

    @Override // com.google.android.gms.internal.ads.i41
    public final void g(k90 k90Var) {
    }

    public final void h(k3.c2 c2Var) {
        this.f14167o.set(c2Var);
    }

    @Override // com.google.android.gms.internal.ads.l11
    public final void j() {
        kk2.a(this.f14165m, new jk2() { // from class: com.google.android.gms.internal.ads.p62
            @Override // com.google.android.gms.internal.ads.jk2
            public final void a(Object obj) {
                ((k3.d0) obj).f();
            }
        });
        kk2.a(this.f14169q, new jk2() { // from class: com.google.android.gms.internal.ads.y52
            @Override // com.google.android.gms.internal.ads.jk2
            public final void a(Object obj) {
                ((k3.f1) obj).d();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.f21
    public final void l() {
        kk2.a(this.f14165m, new jk2() { // from class: com.google.android.gms.internal.ads.x52
            @Override // com.google.android.gms.internal.ads.jk2
            public final void a(Object obj) {
                ((k3.d0) obj).h();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.a31
    public final synchronized void m() {
        kk2.a(this.f14165m, new jk2() { // from class: com.google.android.gms.internal.ads.n62
            @Override // com.google.android.gms.internal.ads.jk2
            public final void a(Object obj) {
                ((k3.d0) obj).i();
            }
        });
        kk2.a(this.f14168p, new jk2() { // from class: com.google.android.gms.internal.ads.o62
            @Override // com.google.android.gms.internal.ads.jk2
            public final void a(Object obj) {
                ((k3.g0) obj).d();
            }
        });
        this.f14172t.set(true);
        J();
    }

    @Override // com.google.android.gms.internal.ads.l11
    public final void n() {
        kk2.a(this.f14165m, new jk2() { // from class: com.google.android.gms.internal.ads.g62
            @Override // com.google.android.gms.internal.ads.jk2
            public final void a(Object obj) {
                ((k3.d0) obj).g();
            }
        });
    }

    public final void o(k3.y0 y0Var) {
        this.f14166n.set(y0Var);
        this.f14171s.set(true);
        J();
    }

    @Override // com.google.android.gms.internal.ads.l11
    public final void p() {
        kk2.a(this.f14165m, new jk2() { // from class: com.google.android.gms.internal.ads.a62
            @Override // com.google.android.gms.internal.ads.jk2
            public final void a(Object obj) {
                ((k3.d0) obj).j();
            }
        });
        kk2.a(this.f14169q, new jk2() { // from class: com.google.android.gms.internal.ads.b62
            @Override // com.google.android.gms.internal.ads.jk2
            public final void a(Object obj) {
                ((k3.f1) obj).e();
            }
        });
        kk2.a(this.f14169q, new jk2() { // from class: com.google.android.gms.internal.ads.c62
            @Override // com.google.android.gms.internal.ads.jk2
            public final void a(Object obj) {
                ((k3.f1) obj).c();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.l11
    public final void q() {
    }

    @Override // com.google.android.gms.internal.ads.f91
    public final void r() {
        if (((Boolean) k3.w.c().b(ir.f9988j9)).booleanValue()) {
            kk2.a(this.f14165m, i62.f9569a);
        }
        kk2.a(this.f14169q, new jk2() { // from class: com.google.android.gms.internal.ads.j62
            @Override // com.google.android.gms.internal.ads.jk2
            public final void a(Object obj) {
                ((k3.f1) obj).b();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.f91
    public final void t() {
        kk2.a(this.f14165m, new jk2() { // from class: com.google.android.gms.internal.ads.z52
            @Override // com.google.android.gms.internal.ads.jk2
            public final void a(Object obj) {
                ((k3.d0) obj).k();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.o11
    public final void u(final k3.w2 w2Var) {
        kk2.a(this.f14165m, new jk2() { // from class: com.google.android.gms.internal.ads.k62
            @Override // com.google.android.gms.internal.ads.jk2
            public final void a(Object obj) {
                ((k3.d0) obj).y(w2Var);
            }
        });
        kk2.a(this.f14165m, new jk2() { // from class: com.google.android.gms.internal.ads.l62
            @Override // com.google.android.gms.internal.ads.jk2
            public final void a(Object obj) {
                ((k3.d0) obj).H(w2Var.f24788m);
            }
        });
        kk2.a(this.f14168p, new jk2() { // from class: com.google.android.gms.internal.ads.m62
            @Override // com.google.android.gms.internal.ads.jk2
            public final void a(Object obj) {
                ((k3.g0) obj).q0(w2Var);
            }
        });
        this.f14170r.set(false);
        this.f14174v.clear();
    }

    @Override // com.google.android.gms.internal.ads.l11
    public final void v(aa0 aa0Var, String str, String str2) {
    }

    @Override // com.google.android.gms.internal.ads.b21
    public final void v0(final k3.w2 w2Var) {
        kk2.a(this.f14169q, new jk2() { // from class: com.google.android.gms.internal.ads.e62
            @Override // com.google.android.gms.internal.ads.jk2
            public final void a(Object obj) {
                ((k3.f1) obj).I0(w2Var);
            }
        });
    }
}
