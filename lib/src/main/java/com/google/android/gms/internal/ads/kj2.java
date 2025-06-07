package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class kj2 extends k3.p0 implements l3.t, cl {

    /* renamed from: m, reason: collision with root package name */
    private final km0 f11084m;

    /* renamed from: n, reason: collision with root package name */
    private final Context f11085n;

    /* renamed from: p, reason: collision with root package name */
    private final String f11087p;

    /* renamed from: q, reason: collision with root package name */
    private final dj2 f11088q;

    /* renamed from: r, reason: collision with root package name */
    private final bj2 f11089r;

    /* renamed from: s, reason: collision with root package name */
    private final ff0 f11090s;

    /* renamed from: u, reason: collision with root package name */
    private hu0 f11092u;

    /* renamed from: v, reason: collision with root package name */
    protected tu0 f11093v;

    /* renamed from: o, reason: collision with root package name */
    private AtomicBoolean f11086o = new AtomicBoolean();

    /* renamed from: t, reason: collision with root package name */
    private long f11091t = -1;

    public kj2(km0 km0Var, Context context, String str, dj2 dj2Var, bj2 bj2Var, ff0 ff0Var) {
        this.f11084m = km0Var;
        this.f11085n = context;
        this.f11087p = str;
        this.f11088q = dj2Var;
        this.f11089r = bj2Var;
        this.f11090s = ff0Var;
        bj2Var.p(this);
    }

    private final synchronized void M5(int i10) {
        if (this.f11086o.compareAndSet(false, true)) {
            this.f11089r.g();
            hu0 hu0Var = this.f11092u;
            if (hu0Var != null) {
                j3.t.d().e(hu0Var);
            }
            if (this.f11093v != null) {
                long jB = -1;
                if (this.f11091t != -1) {
                    jB = j3.t.b().b() - this.f11091t;
                }
                this.f11093v.k(jB, i10);
            }
            A();
        }
    }

    @Override // k3.q0
    public final synchronized void A() {
        e4.p.e("destroy must be called on the main UI thread.");
        tu0 tu0Var = this.f11093v;
        if (tu0Var != null) {
            tu0Var.a();
        }
    }

    @Override // k3.q0
    public final synchronized String B() {
        return null;
    }

    @Override // k3.q0
    public final synchronized void B1(k3.h4 h4Var) {
        e4.p.e("setAdSize must be called on the main UI thread.");
    }

    @Override // l3.t
    public final void C(int i10) {
        if (i10 == 0) {
            throw null;
        }
        int i11 = i10 - 1;
        if (i11 != 0) {
            M5(i11 != 1 ? i11 != 2 ? 6 : 3 : 4);
        } else {
            M5(2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // k3.q0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized boolean C1(k3.c4 r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            com.google.android.gms.internal.ads.os r0 = com.google.android.gms.internal.ads.at.f6231d     // Catch: java.lang.Throwable -> L87
            java.lang.Object r0 = r0.e()     // Catch: java.lang.Throwable -> L87
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L87
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L87
            r1 = 0
            if (r0 == 0) goto L24
            com.google.android.gms.internal.ads.zq r0 = com.google.android.gms.internal.ads.ir.A9     // Catch: java.lang.Throwable -> L87
            com.google.android.gms.internal.ads.gr r2 = k3.w.c()     // Catch: java.lang.Throwable -> L87
            java.lang.Object r0 = r2.b(r0)     // Catch: java.lang.Throwable -> L87
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L87
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L87
            if (r0 == 0) goto L24
            r0 = 1
            goto L25
        L24:
            r0 = r1
        L25:
            com.google.android.gms.internal.ads.ff0 r2 = r5.f11090s     // Catch: java.lang.Throwable -> L87
            int r2 = r2.f8254o     // Catch: java.lang.Throwable -> L87
            com.google.android.gms.internal.ads.zq r3 = com.google.android.gms.internal.ads.ir.B9     // Catch: java.lang.Throwable -> L87
            com.google.android.gms.internal.ads.gr r4 = k3.w.c()     // Catch: java.lang.Throwable -> L87
            java.lang.Object r3 = r4.b(r3)     // Catch: java.lang.Throwable -> L87
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch: java.lang.Throwable -> L87
            int r3 = r3.intValue()     // Catch: java.lang.Throwable -> L87
            if (r2 < r3) goto L3d
            if (r0 != 0) goto L42
        L3d:
            java.lang.String r0 = "loadAd must be called on the main UI thread."
            e4.p.e(r0)     // Catch: java.lang.Throwable -> L87
        L42:
            j3.t.r()     // Catch: java.lang.Throwable -> L87
            android.content.Context r0 = r5.f11085n     // Catch: java.lang.Throwable -> L87
            boolean r0 = m3.b2.c(r0)     // Catch: java.lang.Throwable -> L87
            if (r0 == 0) goto L64
            k3.w0 r0 = r6.E     // Catch: java.lang.Throwable -> L87
            if (r0 == 0) goto L52
            goto L64
        L52:
            java.lang.String r6 = "Failed to load the ad because app ID is missing."
            com.google.android.gms.internal.ads.ze0.d(r6)     // Catch: java.lang.Throwable -> L87
            com.google.android.gms.internal.ads.bj2 r6 = r5.f11089r     // Catch: java.lang.Throwable -> L87
            r0 = 4
            r2 = 0
            k3.w2 r0 = com.google.android.gms.internal.ads.fp2.d(r0, r2, r2)     // Catch: java.lang.Throwable -> L87
            r6.u(r0)     // Catch: java.lang.Throwable -> L87
            monitor-exit(r5)
            return r1
        L64:
            boolean r0 = r5.D0()     // Catch: java.lang.Throwable -> L87
            if (r0 == 0) goto L6c
            monitor-exit(r5)
            return r1
        L6c:
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean     // Catch: java.lang.Throwable -> L87
            r0.<init>()     // Catch: java.lang.Throwable -> L87
            r5.f11086o = r0     // Catch: java.lang.Throwable -> L87
            com.google.android.gms.internal.ads.ij2 r0 = new com.google.android.gms.internal.ads.ij2     // Catch: java.lang.Throwable -> L87
            r0.<init>(r5)     // Catch: java.lang.Throwable -> L87
            com.google.android.gms.internal.ads.dj2 r1 = r5.f11088q     // Catch: java.lang.Throwable -> L87
            java.lang.String r2 = r5.f11087p     // Catch: java.lang.Throwable -> L87
            com.google.android.gms.internal.ads.jj2 r3 = new com.google.android.gms.internal.ads.jj2     // Catch: java.lang.Throwable -> L87
            r3.<init>(r5)     // Catch: java.lang.Throwable -> L87
            boolean r6 = r1.b(r6, r2, r0, r3)     // Catch: java.lang.Throwable -> L87
            monitor-exit(r5)
            return r6
        L87:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.kj2.C1(k3.c4):boolean");
    }

    @Override // k3.q0
    public final void C3(q70 q70Var, String str) {
    }

    @Override // k3.q0
    public final void C5(k3.y0 y0Var) {
    }

    @Override // k3.q0
    public final synchronized boolean D0() {
        return this.f11088q.a();
    }

    @Override // k3.q0
    public final synchronized void F() {
    }

    @Override // k3.q0
    public final void F3(boolean z10) {
    }

    @Override // l3.t
    public final void L0() {
    }

    @Override // k3.q0
    public final synchronized void O() {
        e4.p.e("resume must be called on the main UI thread.");
    }

    @Override // k3.q0
    public final void O2(k3.c4 c4Var, k3.g0 g0Var) {
    }

    @Override // k3.q0
    public final void S3(m70 m70Var) {
    }

    @Override // k3.q0
    public final void U0(k3.d0 d0Var) {
    }

    @Override // k3.q0
    public final void U2(k3.c2 c2Var) {
    }

    @Override // k3.q0
    public final void W3(String str) {
    }

    @Override // com.google.android.gms.internal.ads.cl
    public final void a() {
        M5(3);
    }

    @Override // k3.q0
    public final boolean a5() {
        return false;
    }

    @Override // l3.t
    public final synchronized void b() {
        if (this.f11093v == null) {
            return;
        }
        this.f11091t = j3.t.b().b();
        int iH = this.f11093v.h();
        if (iH <= 0) {
            return;
        }
        hu0 hu0Var = new hu0(this.f11084m.c(), j3.t.b());
        this.f11092u = hu0Var;
        hu0Var.d(iH, new Runnable() { // from class: com.google.android.gms.internal.ads.hj2
            @Override // java.lang.Runnable
            public final void run() {
                this.f9157m.p();
            }
        });
    }

    @Override // l3.t
    public final synchronized void c() {
        tu0 tu0Var = this.f11093v;
        if (tu0Var != null) {
            tu0Var.k(j3.t.b().b() - this.f11091t, 1);
        }
    }

    @Override // k3.q0
    public final void c2(k3.n4 n4Var) {
        this.f11088q.l(n4Var);
    }

    @Override // k3.q0
    public final void e2(k3.u0 u0Var) {
    }

    @Override // k3.q0
    public final Bundle f() {
        return new Bundle();
    }

    @Override // k3.q0
    public final void f1(l4.a aVar) {
    }

    @Override // k3.q0
    public final void g5(ga0 ga0Var) {
    }

    @Override // k3.q0
    public final synchronized k3.h4 h() {
        return null;
    }

    @Override // k3.q0
    public final synchronized void h1(k3.v3 v3Var) {
    }

    @Override // k3.q0
    public final void h3(k3.a0 a0Var) {
    }

    @Override // k3.q0
    public final k3.d0 i() {
        return null;
    }

    @Override // k3.q0
    public final k3.y0 j() {
        return null;
    }

    @Override // k3.q0
    public final synchronized k3.j2 k() {
        return null;
    }

    @Override // k3.q0
    public final void k2(k3.q2 q2Var) {
    }

    @Override // k3.q0
    public final synchronized k3.m2 l() {
        return null;
    }

    @Override // k3.q0
    public final l4.a m() {
        return null;
    }

    @Override // k3.q0
    public final void m4(ll llVar) {
        this.f11089r.A(llVar);
    }

    final /* synthetic */ void n() {
        M5(5);
    }

    @Override // k3.q0
    public final synchronized void o0() {
        e4.p.e("pause must be called on the main UI thread.");
    }

    public final void p() {
        this.f11084m.b().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.fj2
            @Override // java.lang.Runnable
            public final void run() {
                this.f8299m.n();
            }
        });
    }

    @Override // k3.q0
    public final synchronized void p2(k3.c1 c1Var) {
    }

    @Override // k3.q0
    public final synchronized void p4(hs hsVar) {
    }

    @Override // k3.q0
    public final synchronized String r() {
        return this.f11087p;
    }

    @Override // k3.q0
    public final void r1(k3.f1 f1Var) {
    }

    @Override // k3.q0
    public final synchronized String t() {
        return null;
    }

    @Override // k3.q0
    public final synchronized void t0() {
    }

    @Override // k3.q0
    public final void v1(String str) {
    }

    @Override // l3.t
    public final void w0() {
    }

    @Override // k3.q0
    public final synchronized void w5(boolean z10) {
    }

    @Override // l3.t
    public final void x4() {
    }
}
