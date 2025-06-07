package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;

/* loaded from: classes.dex */
public final class en2 extends ca0 {

    /* renamed from: m, reason: collision with root package name */
    private final um2 f7909m;

    /* renamed from: n, reason: collision with root package name */
    private final km2 f7910n;

    /* renamed from: o, reason: collision with root package name */
    private final vn2 f7911o;

    /* renamed from: p, reason: collision with root package name */
    private gj1 f7912p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f7913q = false;

    public en2(um2 um2Var, km2 km2Var, vn2 vn2Var) {
        this.f7909m = um2Var;
        this.f7910n = km2Var;
        this.f7911o = vn2Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x000e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final synchronized boolean O5() {
        /*
            r1 = this;
            monitor-enter(r1)
            com.google.android.gms.internal.ads.gj1 r0 = r1.f7912p     // Catch: java.lang.Throwable -> L10
            if (r0 == 0) goto Le
            boolean r0 = r0.k()     // Catch: java.lang.Throwable -> L10
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.en2.O5():boolean");
    }

    @Override // com.google.android.gms.internal.ads.da0
    public final boolean B() {
        gj1 gj1Var = this.f7912p;
        return gj1Var != null && gj1Var.m();
    }

    @Override // com.google.android.gms.internal.ads.da0
    public final synchronized void F0(l4.a aVar) {
        e4.p.e("destroy must be called on the main UI thread.");
        Context context = null;
        this.f7910n.b(null);
        if (this.f7912p != null) {
            if (aVar != null) {
                context = (Context) l4.b.L0(aVar);
            }
            this.f7912p.d().r0(context);
        }
    }

    @Override // com.google.android.gms.internal.ads.da0
    public final synchronized void G5(String str) {
        e4.p.e("#008 Must be called on the main UI thread.: setCustomData");
        this.f7911o.f16818b = str;
    }

    @Override // com.google.android.gms.internal.ads.da0
    public final synchronized void J2(l4.a aVar) {
        e4.p.e("resume must be called on the main UI thread.");
        if (this.f7912p != null) {
            this.f7912p.d().u0(aVar == null ? null : (Context) l4.b.L0(aVar));
        }
    }

    @Override // com.google.android.gms.internal.ads.da0
    public final synchronized void M(String str) {
        e4.p.e("setUserId must be called on the main UI thread.");
        this.f7911o.f16817a = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031 A[Catch: all -> 0x0063, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:7:0x0019, B:12:0x0022, B:13:0x002b, B:15:0x0031, B:19:0x0045), top: B:25:0x0001, inners: #1 }] */
    @Override // com.google.android.gms.internal.ads.da0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void N1(com.google.android.gms.internal.ads.ha0 r5) {
        /*
            r4 = this;
            monitor-enter(r4)
            java.lang.String r0 = "loadAd must be called on the main UI thread."
            e4.p.e(r0)     // Catch: java.lang.Throwable -> L63
            java.lang.String r0 = r5.f9076n     // Catch: java.lang.Throwable -> L63
            com.google.android.gms.internal.ads.zq r1 = com.google.android.gms.internal.ads.ir.Z4     // Catch: java.lang.Throwable -> L63
            com.google.android.gms.internal.ads.gr r2 = k3.w.c()     // Catch: java.lang.Throwable -> L63
            java.lang.Object r1 = r2.b(r1)     // Catch: java.lang.Throwable -> L63
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L63
            if (r1 == 0) goto L2b
            if (r0 != 0) goto L19
            goto L2b
        L19:
            boolean r0 = java.util.regex.Pattern.matches(r1, r0)     // Catch: java.lang.RuntimeException -> L21 java.lang.Throwable -> L63
            if (r0 == 0) goto L2b
            monitor-exit(r4)
            return
        L21:
            r0 = move-exception
            java.lang.String r1 = "NonagonUtil.isPatternMatched"
            com.google.android.gms.internal.ads.je0 r2 = j3.t.q()     // Catch: java.lang.Throwable -> L63
            r2.u(r0, r1)     // Catch: java.lang.Throwable -> L63
        L2b:
            boolean r0 = r4.O5()     // Catch: java.lang.Throwable -> L63
            if (r0 == 0) goto L45
            com.google.android.gms.internal.ads.zq r0 = com.google.android.gms.internal.ads.ir.f9898b5     // Catch: java.lang.Throwable -> L63
            com.google.android.gms.internal.ads.gr r1 = k3.w.c()     // Catch: java.lang.Throwable -> L63
            java.lang.Object r0 = r1.b(r0)     // Catch: java.lang.Throwable -> L63
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L63
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L63
            if (r0 != 0) goto L45
            monitor-exit(r4)
            return
        L45:
            com.google.android.gms.internal.ads.mm2 r0 = new com.google.android.gms.internal.ads.mm2     // Catch: java.lang.Throwable -> L63
            r1 = 0
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L63
            r4.f7912p = r1     // Catch: java.lang.Throwable -> L63
            com.google.android.gms.internal.ads.um2 r1 = r4.f7909m     // Catch: java.lang.Throwable -> L63
            r2 = 1
            r1.j(r2)     // Catch: java.lang.Throwable -> L63
            com.google.android.gms.internal.ads.um2 r1 = r4.f7909m     // Catch: java.lang.Throwable -> L63
            k3.c4 r2 = r5.f9075m     // Catch: java.lang.Throwable -> L63
            java.lang.String r5 = r5.f9076n     // Catch: java.lang.Throwable -> L63
            com.google.android.gms.internal.ads.cn2 r3 = new com.google.android.gms.internal.ads.cn2     // Catch: java.lang.Throwable -> L63
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L63
            r1.b(r2, r5, r0, r3)     // Catch: java.lang.Throwable -> L63
            monitor-exit(r4)
            return
        L63:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.en2.N1(com.google.android.gms.internal.ads.ha0):void");
    }

    @Override // com.google.android.gms.internal.ads.da0
    public final void X0(ba0 ba0Var) {
        e4.p.e("#008 Must be called on the main UI thread.: setRewardedAdSkuListener");
        this.f7910n.A(ba0Var);
    }

    @Override // com.google.android.gms.internal.ads.da0
    public final Bundle b() {
        e4.p.e("getAdMetadata can only be called from the UI thread.");
        gj1 gj1Var = this.f7912p;
        return gj1Var != null ? gj1Var.h() : new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.da0
    public final void c() {
        F0(null);
    }

    @Override // com.google.android.gms.internal.ads.da0
    public final synchronized k3.j2 d() {
        if (!((Boolean) k3.w.c().b(ir.f10105u6)).booleanValue()) {
            return null;
        }
        gj1 gj1Var = this.f7912p;
        if (gj1Var == null) {
            return null;
        }
        return gj1Var.c();
    }

    @Override // com.google.android.gms.internal.ads.da0
    public final synchronized void d3(boolean z10) {
        e4.p.e("setImmersiveMode must be called on the main UI thread.");
        this.f7913q = z10;
    }

    @Override // com.google.android.gms.internal.ads.da0
    public final void d4(k3.u0 u0Var) {
        e4.p.e("setAdMetadataListener can only be called from the UI thread.");
        if (u0Var == null) {
            this.f7910n.b(null);
        } else {
            this.f7910n.b(new dn2(this, u0Var));
        }
    }

    @Override // com.google.android.gms.internal.ads.da0
    public final synchronized String f() {
        gj1 gj1Var = this.f7912p;
        if (gj1Var == null || gj1Var.c() == null) {
            return null;
        }
        return gj1Var.c().h();
    }

    @Override // com.google.android.gms.internal.ads.da0
    public final void g() {
        i0(null);
    }

    @Override // com.google.android.gms.internal.ads.da0
    public final synchronized void i0(l4.a aVar) {
        e4.p.e("pause must be called on the main UI thread.");
        if (this.f7912p != null) {
            this.f7912p.d().s0(aVar == null ? null : (Context) l4.b.L0(aVar));
        }
    }

    @Override // com.google.android.gms.internal.ads.da0
    public final void j() {
        J2(null);
    }

    @Override // com.google.android.gms.internal.ads.da0
    public final synchronized void k0(l4.a aVar) {
        e4.p.e("showAd must be called on the main UI thread.");
        if (this.f7912p != null) {
            Activity activity = null;
            if (aVar != null) {
                Object objL0 = l4.b.L0(aVar);
                if (objL0 instanceof Activity) {
                    activity = (Activity) objL0;
                }
            }
            this.f7912p.n(this.f7913q, activity);
        }
    }

    @Override // com.google.android.gms.internal.ads.da0
    public final synchronized void q() {
        k0(null);
    }

    @Override // com.google.android.gms.internal.ads.da0
    public final boolean t() {
        e4.p.e("isLoaded must be called on the main UI thread.");
        return O5();
    }

    @Override // com.google.android.gms.internal.ads.da0
    public final void u2(ga0 ga0Var) {
        e4.p.e("setRewardedVideoAdListener can only be called from the UI thread.");
        this.f7910n.o(ga0Var);
    }
}
