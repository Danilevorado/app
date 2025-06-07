package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import java.util.Collections;

/* loaded from: classes.dex */
public final class w52 extends k3.p0 implements d41 {

    /* renamed from: m, reason: collision with root package name */
    private final Context f16986m;

    /* renamed from: n, reason: collision with root package name */
    private final qj2 f16987n;

    /* renamed from: o, reason: collision with root package name */
    private final String f16988o;

    /* renamed from: p, reason: collision with root package name */
    private final q62 f16989p;

    /* renamed from: q, reason: collision with root package name */
    private k3.h4 f16990q;

    /* renamed from: r, reason: collision with root package name */
    private final bo2 f16991r;

    /* renamed from: s, reason: collision with root package name */
    private final ff0 f16992s;

    /* renamed from: t, reason: collision with root package name */
    private zu0 f16993t;

    public w52(Context context, k3.h4 h4Var, String str, qj2 qj2Var, q62 q62Var, ff0 ff0Var) {
        this.f16986m = context;
        this.f16987n = qj2Var;
        this.f16990q = h4Var;
        this.f16988o = str;
        this.f16989p = q62Var;
        this.f16991r = qj2Var.i();
        this.f16992s = ff0Var;
        qj2Var.p(this);
    }

    private final synchronized void N5(k3.h4 h4Var) {
        this.f16991r.I(h4Var);
        this.f16991r.N(this.f16990q.f24664z);
    }

    private final synchronized boolean O5(k3.c4 c4Var) {
        if (P5()) {
            e4.p.e("loadAd must be called on the main UI thread.");
        }
        j3.t.r();
        if (!m3.b2.c(this.f16986m) || c4Var.E != null) {
            zo2.a(this.f16986m, c4Var.f24619r);
            return this.f16987n.b(c4Var, this.f16988o, null, new v52(this));
        }
        ze0.d("Failed to load the ad because app ID is missing.");
        q62 q62Var = this.f16989p;
        if (q62Var != null) {
            q62Var.u(fp2.d(4, null, null));
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean P5() {
        /*
            r6 = this;
            com.google.android.gms.internal.ads.os r0 = com.google.android.gms.internal.ads.at.f6233f
            java.lang.Object r0 = r0.e()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L24
            com.google.android.gms.internal.ads.zq r0 = com.google.android.gms.internal.ads.ir.A9
            com.google.android.gms.internal.ads.gr r3 = k3.w.c()
            java.lang.Object r0 = r3.b(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L24
            r0 = r1
            goto L25
        L24:
            r0 = r2
        L25:
            com.google.android.gms.internal.ads.ff0 r3 = r6.f16992s
            int r3 = r3.f8254o
            com.google.android.gms.internal.ads.zq r4 = com.google.android.gms.internal.ads.ir.B9
            com.google.android.gms.internal.ads.gr r5 = k3.w.c()
            java.lang.Object r4 = r5.b(r4)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            if (r3 < r4) goto L3f
            if (r0 != 0) goto L3e
            goto L3f
        L3e:
            return r2
        L3f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.w52.P5():boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0037 A[Catch: all -> 0x0047, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x000f, B:7:0x0021, B:10:0x003c, B:12:0x0040, B:9:0x0037), top: B:20:0x0001 }] */
    @Override // k3.q0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void A() {
        /*
            r3 = this;
            monitor-enter(r3)
            com.google.android.gms.internal.ads.os r0 = com.google.android.gms.internal.ads.at.f6232e     // Catch: java.lang.Throwable -> L47
            java.lang.Object r0 = r0.e()     // Catch: java.lang.Throwable -> L47
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L47
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L47
            if (r0 == 0) goto L37
            com.google.android.gms.internal.ads.zq r0 = com.google.android.gms.internal.ads.ir.f10141x9     // Catch: java.lang.Throwable -> L47
            com.google.android.gms.internal.ads.gr r1 = k3.w.c()     // Catch: java.lang.Throwable -> L47
            java.lang.Object r0 = r1.b(r0)     // Catch: java.lang.Throwable -> L47
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L47
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L47
            if (r0 == 0) goto L37
            com.google.android.gms.internal.ads.ff0 r0 = r3.f16992s     // Catch: java.lang.Throwable -> L47
            int r0 = r0.f8254o     // Catch: java.lang.Throwable -> L47
            com.google.android.gms.internal.ads.zq r1 = com.google.android.gms.internal.ads.ir.C9     // Catch: java.lang.Throwable -> L47
            com.google.android.gms.internal.ads.gr r2 = k3.w.c()     // Catch: java.lang.Throwable -> L47
            java.lang.Object r1 = r2.b(r1)     // Catch: java.lang.Throwable -> L47
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.Throwable -> L47
            int r1 = r1.intValue()     // Catch: java.lang.Throwable -> L47
            if (r0 >= r1) goto L3c
        L37:
            java.lang.String r0 = "destroy must be called on the main UI thread."
            e4.p.e(r0)     // Catch: java.lang.Throwable -> L47
        L3c:
            com.google.android.gms.internal.ads.zu0 r0 = r3.f16993t     // Catch: java.lang.Throwable -> L47
            if (r0 == 0) goto L45
            r0.a()     // Catch: java.lang.Throwable -> L47
            monitor-exit(r3)
            return
        L45:
            monitor-exit(r3)
            return
        L47:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.w52.A():void");
    }

    @Override // k3.q0
    public final synchronized String B() {
        zu0 zu0Var = this.f16993t;
        if (zu0Var == null || zu0Var.c() == null) {
            return null;
        }
        return zu0Var.c().h();
    }

    @Override // k3.q0
    public final synchronized void B1(k3.h4 h4Var) {
        e4.p.e("setAdSize must be called on the main UI thread.");
        this.f16991r.I(h4Var);
        this.f16990q = h4Var;
        zu0 zu0Var = this.f16993t;
        if (zu0Var != null) {
            zu0Var.n(this.f16987n.d(), h4Var);
        }
    }

    @Override // k3.q0
    public final synchronized boolean C1(k3.c4 c4Var) {
        N5(this.f16990q);
        return O5(c4Var);
    }

    @Override // k3.q0
    public final void C3(q70 q70Var, String str) {
    }

    @Override // k3.q0
    public final void C5(k3.y0 y0Var) {
        if (P5()) {
            e4.p.e("setAppEventListener must be called on the main UI thread.");
        }
        this.f16989p.o(y0Var);
    }

    @Override // k3.q0
    public final synchronized boolean D0() {
        return this.f16987n.a();
    }

    @Override // k3.q0
    public final synchronized void F() {
        e4.p.e("recordManualImpression must be called on the main UI thread.");
        zu0 zu0Var = this.f16993t;
        if (zu0Var != null) {
            zu0Var.m();
        }
    }

    @Override // k3.q0
    public final void F3(boolean z10) {
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0037 A[Catch: all -> 0x004c, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x000f, B:7:0x0021, B:10:0x003c, B:12:0x0040, B:9:0x0037), top: B:20:0x0001 }] */
    @Override // k3.q0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void O() {
        /*
            r3 = this;
            monitor-enter(r3)
            com.google.android.gms.internal.ads.os r0 = com.google.android.gms.internal.ads.at.f6235h     // Catch: java.lang.Throwable -> L4c
            java.lang.Object r0 = r0.e()     // Catch: java.lang.Throwable -> L4c
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L4c
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L4c
            if (r0 == 0) goto L37
            com.google.android.gms.internal.ads.zq r0 = com.google.android.gms.internal.ads.ir.f10130w9     // Catch: java.lang.Throwable -> L4c
            com.google.android.gms.internal.ads.gr r1 = k3.w.c()     // Catch: java.lang.Throwable -> L4c
            java.lang.Object r0 = r1.b(r0)     // Catch: java.lang.Throwable -> L4c
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L4c
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L4c
            if (r0 == 0) goto L37
            com.google.android.gms.internal.ads.ff0 r0 = r3.f16992s     // Catch: java.lang.Throwable -> L4c
            int r0 = r0.f8254o     // Catch: java.lang.Throwable -> L4c
            com.google.android.gms.internal.ads.zq r1 = com.google.android.gms.internal.ads.ir.C9     // Catch: java.lang.Throwable -> L4c
            com.google.android.gms.internal.ads.gr r2 = k3.w.c()     // Catch: java.lang.Throwable -> L4c
            java.lang.Object r1 = r2.b(r1)     // Catch: java.lang.Throwable -> L4c
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.Throwable -> L4c
            int r1 = r1.intValue()     // Catch: java.lang.Throwable -> L4c
            if (r0 >= r1) goto L3c
        L37:
            java.lang.String r0 = "resume must be called on the main UI thread."
            e4.p.e(r0)     // Catch: java.lang.Throwable -> L4c
        L3c:
            com.google.android.gms.internal.ads.zu0 r0 = r3.f16993t     // Catch: java.lang.Throwable -> L4c
            if (r0 == 0) goto L4a
            com.google.android.gms.internal.ads.l21 r0 = r0.d()     // Catch: java.lang.Throwable -> L4c
            r1 = 0
            r0.u0(r1)     // Catch: java.lang.Throwable -> L4c
            monitor-exit(r3)
            return
        L4a:
            monitor-exit(r3)
            return
        L4c:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.w52.O():void");
    }

    @Override // k3.q0
    public final void O2(k3.c4 c4Var, k3.g0 g0Var) {
    }

    @Override // k3.q0
    public final void S3(m70 m70Var) {
    }

    @Override // k3.q0
    public final void U0(k3.d0 d0Var) {
        if (P5()) {
            e4.p.e("setAdListener must be called on the main UI thread.");
        }
        this.f16989p.c(d0Var);
    }

    @Override // k3.q0
    public final void U2(k3.c2 c2Var) {
        if (P5()) {
            e4.p.e("setPaidEventListener must be called on the main UI thread.");
        }
        this.f16989p.h(c2Var);
    }

    @Override // k3.q0
    public final void W3(String str) {
    }

    @Override // com.google.android.gms.internal.ads.d41
    public final synchronized void a() {
        if (!this.f16987n.r()) {
            this.f16987n.n();
            return;
        }
        k3.h4 h4VarX = this.f16991r.x();
        zu0 zu0Var = this.f16993t;
        if (zu0Var != null && zu0Var.l() != null && this.f16991r.o()) {
            h4VarX = ho2.a(this.f16986m, Collections.singletonList(this.f16993t.l()));
        }
        N5(h4VarX);
        try {
            O5(this.f16991r.v());
        } catch (RemoteException unused) {
            ze0.g("Failed to refresh the banner ad.");
        }
    }

    @Override // k3.q0
    public final boolean a5() {
        return false;
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
    public final void f1(l4.a aVar) {
    }

    @Override // k3.q0
    public final void g5(ga0 ga0Var) {
    }

    @Override // k3.q0
    public final synchronized k3.h4 h() {
        e4.p.e("getAdSize must be called on the main UI thread.");
        zu0 zu0Var = this.f16993t;
        if (zu0Var != null) {
            return ho2.a(this.f16986m, Collections.singletonList(zu0Var.k()));
        }
        return this.f16991r.x();
    }

    @Override // k3.q0
    public final synchronized void h1(k3.v3 v3Var) {
        if (P5()) {
            e4.p.e("setVideoOptions must be called on the main UI thread.");
        }
        this.f16991r.f(v3Var);
    }

    @Override // k3.q0
    public final void h3(k3.a0 a0Var) {
        if (P5()) {
            e4.p.e("setAdListener must be called on the main UI thread.");
        }
        this.f16987n.o(a0Var);
    }

    @Override // k3.q0
    public final k3.d0 i() {
        return this.f16989p.a();
    }

    @Override // k3.q0
    public final k3.y0 j() {
        return this.f16989p.b();
    }

    @Override // k3.q0
    public final synchronized k3.j2 k() {
        if (!((Boolean) k3.w.c().b(ir.f10105u6)).booleanValue()) {
            return null;
        }
        zu0 zu0Var = this.f16993t;
        if (zu0Var == null) {
            return null;
        }
        return zu0Var.c();
    }

    @Override // k3.q0
    public final void k2(k3.q2 q2Var) {
    }

    @Override // k3.q0
    public final synchronized k3.m2 l() {
        e4.p.e("getVideoController must be called from the main thread.");
        zu0 zu0Var = this.f16993t;
        if (zu0Var == null) {
            return null;
        }
        return zu0Var.j();
    }

    @Override // k3.q0
    public final l4.a m() {
        if (P5()) {
            e4.p.e("getAdFrame must be called on the main UI thread.");
        }
        return l4.b.p1(this.f16987n.d());
    }

    @Override // k3.q0
    public final void m4(ll llVar) {
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0037 A[Catch: all -> 0x004c, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x000f, B:7:0x0021, B:10:0x003c, B:12:0x0040, B:9:0x0037), top: B:20:0x0001 }] */
    @Override // k3.q0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void o0() {
        /*
            r3 = this;
            monitor-enter(r3)
            com.google.android.gms.internal.ads.os r0 = com.google.android.gms.internal.ads.at.f6234g     // Catch: java.lang.Throwable -> L4c
            java.lang.Object r0 = r0.e()     // Catch: java.lang.Throwable -> L4c
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L4c
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L4c
            if (r0 == 0) goto L37
            com.google.android.gms.internal.ads.zq r0 = com.google.android.gms.internal.ads.ir.f10152y9     // Catch: java.lang.Throwable -> L4c
            com.google.android.gms.internal.ads.gr r1 = k3.w.c()     // Catch: java.lang.Throwable -> L4c
            java.lang.Object r0 = r1.b(r0)     // Catch: java.lang.Throwable -> L4c
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L4c
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L4c
            if (r0 == 0) goto L37
            com.google.android.gms.internal.ads.ff0 r0 = r3.f16992s     // Catch: java.lang.Throwable -> L4c
            int r0 = r0.f8254o     // Catch: java.lang.Throwable -> L4c
            com.google.android.gms.internal.ads.zq r1 = com.google.android.gms.internal.ads.ir.C9     // Catch: java.lang.Throwable -> L4c
            com.google.android.gms.internal.ads.gr r2 = k3.w.c()     // Catch: java.lang.Throwable -> L4c
            java.lang.Object r1 = r2.b(r1)     // Catch: java.lang.Throwable -> L4c
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.Throwable -> L4c
            int r1 = r1.intValue()     // Catch: java.lang.Throwable -> L4c
            if (r0 >= r1) goto L3c
        L37:
            java.lang.String r0 = "pause must be called on the main UI thread."
            e4.p.e(r0)     // Catch: java.lang.Throwable -> L4c
        L3c:
            com.google.android.gms.internal.ads.zu0 r0 = r3.f16993t     // Catch: java.lang.Throwable -> L4c
            if (r0 == 0) goto L4a
            com.google.android.gms.internal.ads.l21 r0 = r0.d()     // Catch: java.lang.Throwable -> L4c
            r1 = 0
            r0.s0(r1)     // Catch: java.lang.Throwable -> L4c
            monitor-exit(r3)
            return
        L4a:
            monitor-exit(r3)
            return
        L4c:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.w52.o0():void");
    }

    @Override // k3.q0
    public final synchronized void p2(k3.c1 c1Var) {
        e4.p.e("setCorrelationIdProvider must be called on the main UI thread");
        this.f16991r.q(c1Var);
    }

    @Override // k3.q0
    public final synchronized void p4(hs hsVar) {
        e4.p.e("setOnCustomRenderedAdLoadedListener must be called on the main UI thread.");
        this.f16987n.q(hsVar);
    }

    @Override // k3.q0
    public final synchronized String r() {
        return this.f16988o;
    }

    @Override // k3.q0
    public final void r1(k3.f1 f1Var) {
    }

    @Override // k3.q0
    public final synchronized String t() {
        zu0 zu0Var = this.f16993t;
        if (zu0Var == null || zu0Var.c() == null) {
            return null;
        }
        return zu0Var.c().h();
    }

    @Override // k3.q0
    public final void t0() {
    }

    @Override // k3.q0
    public final void v1(String str) {
    }

    @Override // k3.q0
    public final synchronized void w5(boolean z10) {
        if (P5()) {
            e4.p.e("setManualImpressionsEnabled must be called from the main thread.");
        }
        this.f16991r.P(z10);
    }
}
