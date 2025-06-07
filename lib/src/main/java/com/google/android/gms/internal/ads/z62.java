package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;

/* loaded from: classes.dex */
public final class z62 extends k3.p0 {

    /* renamed from: m, reason: collision with root package name */
    private final k3.h4 f18447m;

    /* renamed from: n, reason: collision with root package name */
    private final Context f18448n;

    /* renamed from: o, reason: collision with root package name */
    private final jl2 f18449o;

    /* renamed from: p, reason: collision with root package name */
    private final String f18450p;

    /* renamed from: q, reason: collision with root package name */
    private final ff0 f18451q;

    /* renamed from: r, reason: collision with root package name */
    private final q62 f18452r;

    /* renamed from: s, reason: collision with root package name */
    private final km2 f18453s;

    /* renamed from: t, reason: collision with root package name */
    private final bg f18454t;

    /* renamed from: u, reason: collision with root package name */
    private z91 f18455u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f18456v = ((Boolean) k3.w.c().b(ir.C0)).booleanValue();

    public z62(Context context, k3.h4 h4Var, String str, jl2 jl2Var, q62 q62Var, km2 km2Var, ff0 ff0Var, bg bgVar) {
        this.f18447m = h4Var;
        this.f18450p = str;
        this.f18448n = context;
        this.f18449o = jl2Var;
        this.f18452r = q62Var;
        this.f18453s = km2Var;
        this.f18451q = ff0Var;
        this.f18454t = bgVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x000e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final synchronized boolean N5() {
        /*
            r1 = this;
            monitor-enter(r1)
            com.google.android.gms.internal.ads.z91 r0 = r1.f18455u     // Catch: java.lang.Throwable -> L10
            if (r0 == 0) goto Le
            boolean r0 = r0.h()     // Catch: java.lang.Throwable -> L10
            if (r0 != 0) goto Le
            r0 = 1
        Lc:
            monitor-exit(r1)
            return r0
        Le:
            r0 = 0
            goto Lc
        L10:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.z62.N5():boolean");
    }

    @Override // k3.q0
    public final synchronized void A() {
        e4.p.e("destroy must be called on the main UI thread.");
        z91 z91Var = this.f18455u;
        if (z91Var != null) {
            z91Var.d().r0(null);
        }
    }

    @Override // k3.q0
    public final synchronized String B() {
        z91 z91Var = this.f18455u;
        if (z91Var == null || z91Var.c() == null) {
            return null;
        }
        return z91Var.c().h();
    }

    @Override // k3.q0
    public final void B1(k3.h4 h4Var) {
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
            com.google.android.gms.internal.ads.os r0 = com.google.android.gms.internal.ads.at.f6236i     // Catch: java.lang.Throwable -> L8c
            java.lang.Object r0 = r0.e()     // Catch: java.lang.Throwable -> L8c
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L8c
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L8c
            r1 = 0
            if (r0 == 0) goto L24
            com.google.android.gms.internal.ads.zq r0 = com.google.android.gms.internal.ads.ir.A9     // Catch: java.lang.Throwable -> L8c
            com.google.android.gms.internal.ads.gr r2 = k3.w.c()     // Catch: java.lang.Throwable -> L8c
            java.lang.Object r0 = r2.b(r0)     // Catch: java.lang.Throwable -> L8c
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L8c
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L8c
            if (r0 == 0) goto L24
            r0 = 1
            goto L25
        L24:
            r0 = r1
        L25:
            com.google.android.gms.internal.ads.ff0 r2 = r5.f18451q     // Catch: java.lang.Throwable -> L8c
            int r2 = r2.f8254o     // Catch: java.lang.Throwable -> L8c
            com.google.android.gms.internal.ads.zq r3 = com.google.android.gms.internal.ads.ir.B9     // Catch: java.lang.Throwable -> L8c
            com.google.android.gms.internal.ads.gr r4 = k3.w.c()     // Catch: java.lang.Throwable -> L8c
            java.lang.Object r3 = r4.b(r3)     // Catch: java.lang.Throwable -> L8c
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch: java.lang.Throwable -> L8c
            int r3 = r3.intValue()     // Catch: java.lang.Throwable -> L8c
            if (r2 < r3) goto L3d
            if (r0 != 0) goto L42
        L3d:
            java.lang.String r0 = "loadAd must be called on the main UI thread."
            e4.p.e(r0)     // Catch: java.lang.Throwable -> L8c
        L42:
            j3.t.r()     // Catch: java.lang.Throwable -> L8c
            android.content.Context r0 = r5.f18448n     // Catch: java.lang.Throwable -> L8c
            boolean r0 = m3.b2.c(r0)     // Catch: java.lang.Throwable -> L8c
            r2 = 0
            if (r0 == 0) goto L65
            k3.w0 r0 = r6.E     // Catch: java.lang.Throwable -> L8c
            if (r0 != 0) goto L65
            java.lang.String r6 = "Failed to load the ad because app ID is missing."
            com.google.android.gms.internal.ads.ze0.d(r6)     // Catch: java.lang.Throwable -> L8c
            com.google.android.gms.internal.ads.q62 r6 = r5.f18452r     // Catch: java.lang.Throwable -> L8c
            if (r6 == 0) goto L63
            r0 = 4
            k3.w2 r0 = com.google.android.gms.internal.ads.fp2.d(r0, r2, r2)     // Catch: java.lang.Throwable -> L8c
            r6.u(r0)     // Catch: java.lang.Throwable -> L8c
        L63:
            monitor-exit(r5)
            return r1
        L65:
            boolean r0 = r5.N5()     // Catch: java.lang.Throwable -> L8c
            if (r0 == 0) goto L6d
            monitor-exit(r5)
            return r1
        L6d:
            android.content.Context r0 = r5.f18448n     // Catch: java.lang.Throwable -> L8c
            boolean r1 = r6.f24619r     // Catch: java.lang.Throwable -> L8c
            com.google.android.gms.internal.ads.zo2.a(r0, r1)     // Catch: java.lang.Throwable -> L8c
            r5.f18455u = r2     // Catch: java.lang.Throwable -> L8c
            com.google.android.gms.internal.ads.jl2 r0 = r5.f18449o     // Catch: java.lang.Throwable -> L8c
            java.lang.String r1 = r5.f18450p     // Catch: java.lang.Throwable -> L8c
            com.google.android.gms.internal.ads.bl2 r2 = new com.google.android.gms.internal.ads.bl2     // Catch: java.lang.Throwable -> L8c
            k3.h4 r3 = r5.f18447m     // Catch: java.lang.Throwable -> L8c
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L8c
            com.google.android.gms.internal.ads.y62 r3 = new com.google.android.gms.internal.ads.y62     // Catch: java.lang.Throwable -> L8c
            r3.<init>(r5)     // Catch: java.lang.Throwable -> L8c
            boolean r6 = r0.b(r6, r1, r2, r3)     // Catch: java.lang.Throwable -> L8c
            monitor-exit(r5)
            return r6
        L8c:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.z62.C1(k3.c4):boolean");
    }

    @Override // k3.q0
    public final void C3(q70 q70Var, String str) {
    }

    @Override // k3.q0
    public final void C5(k3.y0 y0Var) {
        e4.p.e("setAppEventListener must be called on the main UI thread.");
        this.f18452r.o(y0Var);
    }

    @Override // k3.q0
    public final synchronized boolean D0() {
        return this.f18449o.a();
    }

    @Override // k3.q0
    public final void F() {
    }

    @Override // k3.q0
    public final synchronized void F3(boolean z10) {
        e4.p.e("setImmersiveMode must be called on the main UI thread.");
        this.f18456v = z10;
    }

    @Override // k3.q0
    public final synchronized void O() {
        e4.p.e("resume must be called on the main UI thread.");
        z91 z91Var = this.f18455u;
        if (z91Var != null) {
            z91Var.d().u0(null);
        }
    }

    @Override // k3.q0
    public final void O2(k3.c4 c4Var, k3.g0 g0Var) {
        this.f18452r.e(g0Var);
        C1(c4Var);
    }

    @Override // k3.q0
    public final void S3(m70 m70Var) {
    }

    @Override // k3.q0
    public final void U0(k3.d0 d0Var) {
        e4.p.e("setAdListener must be called on the main UI thread.");
        this.f18452r.c(d0Var);
    }

    @Override // k3.q0
    public final void U2(k3.c2 c2Var) {
        e4.p.e("setPaidEventListener must be called on the main UI thread.");
        this.f18452r.h(c2Var);
    }

    @Override // k3.q0
    public final void W3(String str) {
    }

    @Override // k3.q0
    public final synchronized boolean a5() {
        e4.p.e("isLoaded must be called on the main UI thread.");
        return N5();
    }

    @Override // k3.q0
    public final void c2(k3.n4 n4Var) {
    }

    @Override // k3.q0
    public final void e2(k3.u0 u0Var) {
        e4.p.e("setAdMetadataListener must be called on the main UI thread.");
    }

    @Override // k3.q0
    public final Bundle f() {
        e4.p.e("getAdMetadata must be called on the main UI thread.");
        return new Bundle();
    }

    @Override // k3.q0
    public final synchronized void f1(l4.a aVar) {
        if (this.f18455u == null) {
            ze0.g("Interstitial can not be shown before loaded.");
            this.f18452r.v0(fp2.d(9, null, null));
            return;
        }
        if (((Boolean) k3.w.c().b(ir.f10057q2)).booleanValue()) {
            this.f18454t.c().c(new Throwable().getStackTrace());
        }
        this.f18455u.i(this.f18456v, (Activity) l4.b.L0(aVar));
    }

    @Override // k3.q0
    public final void g5(ga0 ga0Var) {
        this.f18453s.o(ga0Var);
    }

    @Override // k3.q0
    public final k3.h4 h() {
        return null;
    }

    @Override // k3.q0
    public final void h1(k3.v3 v3Var) {
    }

    @Override // k3.q0
    public final void h3(k3.a0 a0Var) {
    }

    @Override // k3.q0
    public final k3.d0 i() {
        return this.f18452r.a();
    }

    @Override // k3.q0
    public final k3.y0 j() {
        return this.f18452r.b();
    }

    @Override // k3.q0
    public final synchronized k3.j2 k() {
        if (!((Boolean) k3.w.c().b(ir.f10105u6)).booleanValue()) {
            return null;
        }
        z91 z91Var = this.f18455u;
        if (z91Var == null) {
            return null;
        }
        return z91Var.c();
    }

    @Override // k3.q0
    public final void k2(k3.q2 q2Var) {
    }

    @Override // k3.q0
    public final k3.m2 l() {
        return null;
    }

    @Override // k3.q0
    public final l4.a m() {
        return null;
    }

    @Override // k3.q0
    public final void m4(ll llVar) {
    }

    @Override // k3.q0
    public final synchronized void o0() {
        e4.p.e("pause must be called on the main UI thread.");
        z91 z91Var = this.f18455u;
        if (z91Var != null) {
            z91Var.d().s0(null);
        }
    }

    @Override // k3.q0
    public final void p2(k3.c1 c1Var) {
    }

    @Override // k3.q0
    public final synchronized void p4(hs hsVar) {
        e4.p.e("setOnCustomRenderedAdLoadedListener must be called on the main UI thread.");
        this.f18449o.i(hsVar);
    }

    @Override // k3.q0
    public final synchronized String r() {
        return this.f18450p;
    }

    @Override // k3.q0
    public final void r1(k3.f1 f1Var) {
        this.f18452r.C(f1Var);
    }

    @Override // k3.q0
    public final synchronized String t() {
        z91 z91Var = this.f18455u;
        if (z91Var == null || z91Var.c() == null) {
            return null;
        }
        return z91Var.c().h();
    }

    @Override // k3.q0
    public final synchronized void t0() {
        e4.p.e("showInterstitial must be called on the main UI thread.");
        if (this.f18455u == null) {
            ze0.g("Interstitial can not be shown before loaded.");
            this.f18452r.v0(fp2.d(9, null, null));
        } else {
            if (((Boolean) k3.w.c().b(ir.f10057q2)).booleanValue()) {
                this.f18454t.c().c(new Throwable().getStackTrace());
            }
            this.f18455u.i(this.f18456v, null);
        }
    }

    @Override // k3.q0
    public final void v1(String str) {
    }

    @Override // k3.q0
    public final void w5(boolean z10) {
    }
}
