package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;

/* loaded from: classes.dex */
public final class ym2 extends ta0 {

    /* renamed from: m, reason: collision with root package name */
    private final um2 f18104m;

    /* renamed from: n, reason: collision with root package name */
    private final km2 f18105n;

    /* renamed from: o, reason: collision with root package name */
    private final String f18106o;

    /* renamed from: p, reason: collision with root package name */
    private final vn2 f18107p;

    /* renamed from: q, reason: collision with root package name */
    private final Context f18108q;

    /* renamed from: r, reason: collision with root package name */
    private final ff0 f18109r;

    /* renamed from: s, reason: collision with root package name */
    private final bg f18110s;

    /* renamed from: t, reason: collision with root package name */
    private gj1 f18111t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f18112u = ((Boolean) k3.w.c().b(ir.C0)).booleanValue();

    public ym2(String str, um2 um2Var, Context context, km2 km2Var, vn2 vn2Var, ff0 ff0Var, bg bgVar) {
        this.f18106o = str;
        this.f18104m = um2Var;
        this.f18105n = km2Var;
        this.f18107p = vn2Var;
        this.f18108q = context;
        this.f18109r = ff0Var;
        this.f18110s = bgVar;
    }

    private final synchronized void P5(k3.c4 c4Var, bb0 bb0Var, int i10) {
        boolean z10 = false;
        if (((Boolean) at.f6239l.e()).booleanValue()) {
            if (((Boolean) k3.w.c().b(ir.A9)).booleanValue()) {
                z10 = true;
            }
        }
        if (this.f18109r.f8254o < ((Integer) k3.w.c().b(ir.B9)).intValue() || !z10) {
            e4.p.e("#008 Must be called on the main UI thread.");
        }
        this.f18105n.h(bb0Var);
        j3.t.r();
        if (m3.b2.c(this.f18108q) && c4Var.E == null) {
            ze0.d("Failed to load the ad because app ID is missing.");
            this.f18105n.u(fp2.d(4, null, null));
            return;
        }
        if (this.f18111t != null) {
            return;
        }
        mm2 mm2Var = new mm2(null);
        this.f18104m.j(i10);
        this.f18104m.b(c4Var, this.f18106o, mm2Var, new xm2(this));
    }

    @Override // com.google.android.gms.internal.ads.ua0
    public final synchronized void E4(k3.c4 c4Var, bb0 bb0Var) {
        P5(c4Var, bb0Var, 2);
    }

    @Override // com.google.android.gms.internal.ads.ua0
    public final void H1(cb0 cb0Var) {
        e4.p.e("#008 Must be called on the main UI thread.");
        this.f18105n.C(cb0Var);
    }

    @Override // com.google.android.gms.internal.ads.ua0
    public final synchronized void J0(l4.a aVar) {
        O4(aVar, this.f18112u);
    }

    @Override // com.google.android.gms.internal.ads.ua0
    public final synchronized void O4(l4.a aVar, boolean z10) {
        e4.p.e("#008 Must be called on the main UI thread.");
        if (this.f18111t == null) {
            ze0.g("Rewarded can not be shown before loaded");
            this.f18105n.v0(fp2.d(9, null, null));
            return;
        }
        if (((Boolean) k3.w.c().b(ir.f10057q2)).booleanValue()) {
            this.f18110s.c().c(new Throwable().getStackTrace());
        }
        this.f18111t.n(z10, (Activity) l4.b.L0(aVar));
    }

    @Override // com.google.android.gms.internal.ads.ua0
    public final Bundle b() {
        e4.p.e("#008 Must be called on the main UI thread.");
        gj1 gj1Var = this.f18111t;
        return gj1Var != null ? gj1Var.h() : new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.ua0
    public final synchronized String c() {
        gj1 gj1Var = this.f18111t;
        if (gj1Var == null || gj1Var.c() == null) {
            return null;
        }
        return gj1Var.c().h();
    }

    @Override // com.google.android.gms.internal.ads.ua0
    public final k3.j2 d() {
        gj1 gj1Var;
        if (((Boolean) k3.w.c().b(ir.f10105u6)).booleanValue() && (gj1Var = this.f18111t) != null) {
            return gj1Var.c();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.ua0
    public final ra0 f() {
        e4.p.e("#008 Must be called on the main UI thread.");
        gj1 gj1Var = this.f18111t;
        if (gj1Var != null) {
            return gj1Var.i();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.ua0
    public final void g2(k3.c2 c2Var) {
        e4.p.e("setOnPaidEventListener must be called on the main UI thread.");
        this.f18105n.c(c2Var);
    }

    @Override // com.google.android.gms.internal.ads.ua0
    public final synchronized void n0(boolean z10) {
        e4.p.e("setImmersiveMode must be called on the main UI thread.");
        this.f18112u = z10;
    }

    @Override // com.google.android.gms.internal.ads.ua0
    public final void n2(xa0 xa0Var) {
        e4.p.e("#008 Must be called on the main UI thread.");
        this.f18105n.g(xa0Var);
    }

    @Override // com.google.android.gms.internal.ads.ua0
    public final boolean p() {
        e4.p.e("#008 Must be called on the main UI thread.");
        gj1 gj1Var = this.f18111t;
        return (gj1Var == null || gj1Var.l()) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.ua0
    public final synchronized void s3(k3.c4 c4Var, bb0 bb0Var) {
        P5(c4Var, bb0Var, 3);
    }

    @Override // com.google.android.gms.internal.ads.ua0
    public final void s4(k3.z1 z1Var) {
        if (z1Var == null) {
            this.f18105n.b(null);
        } else {
            this.f18105n.b(new wm2(this, z1Var));
        }
    }

    @Override // com.google.android.gms.internal.ads.ua0
    public final synchronized void y4(ib0 ib0Var) {
        e4.p.e("#008 Must be called on the main UI thread.");
        vn2 vn2Var = this.f18107p;
        vn2Var.f16817a = ib0Var.f9665m;
        vn2Var.f16818b = ib0Var.f9666n;
    }
}
