package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class gj1 extends ex0 {

    /* renamed from: i, reason: collision with root package name */
    private final Context f8758i;

    /* renamed from: j, reason: collision with root package name */
    private final WeakReference f8759j;

    /* renamed from: k, reason: collision with root package name */
    private final jb1 f8760k;

    /* renamed from: l, reason: collision with root package name */
    private final m81 f8761l;

    /* renamed from: m, reason: collision with root package name */
    private final y11 f8762m;

    /* renamed from: n, reason: collision with root package name */
    private final g31 f8763n;

    /* renamed from: o, reason: collision with root package name */
    private final yx0 f8764o;

    /* renamed from: p, reason: collision with root package name */
    private final ra0 f8765p;

    /* renamed from: q, reason: collision with root package name */
    private final ox2 f8766q;

    /* renamed from: r, reason: collision with root package name */
    private final wn2 f8767r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f8768s;

    gj1(cx0 cx0Var, Context context, nk0 nk0Var, jb1 jb1Var, m81 m81Var, y11 y11Var, g31 g31Var, yx0 yx0Var, hn2 hn2Var, ox2 ox2Var, wn2 wn2Var) {
        super(cx0Var);
        this.f8768s = false;
        this.f8758i = context;
        this.f8760k = jb1Var;
        this.f8759j = new WeakReference(nk0Var);
        this.f8761l = m81Var;
        this.f8762m = y11Var;
        this.f8763n = g31Var;
        this.f8764o = yx0Var;
        this.f8766q = ox2Var;
        na0 na0Var = hn2Var.f9260m;
        this.f8765p = new lb0(na0Var != null ? na0Var.f12555m : "", na0Var != null ? na0Var.f12556n : 1);
        this.f8767r = wn2Var;
    }

    public final void finalize() throws Throwable {
        try {
            final nk0 nk0Var = (nk0) this.f8759j.get();
            if (((Boolean) k3.w.c().b(ir.f10083s6)).booleanValue()) {
                if (!this.f8768s && nk0Var != null) {
                    of0.f13190e.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.fj1
                        @Override // java.lang.Runnable
                        public final void run() {
                            nk0Var.destroy();
                        }
                    });
                }
            } else if (nk0Var != null) {
                nk0Var.destroy();
            }
        } finally {
            super.finalize();
        }
    }

    public final Bundle h() {
        return this.f8763n.r0();
    }

    public final ra0 i() {
        return this.f8765p;
    }

    public final wn2 j() {
        return this.f8767r;
    }

    public final boolean k() {
        return this.f8764o.a();
    }

    public final boolean l() {
        return this.f8768s;
    }

    public final boolean m() {
        nk0 nk0Var = (nk0) this.f8759j.get();
        return (nk0Var == null || nk0Var.T0()) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v3, types: [android.content.Context] */
    public final boolean n(boolean z10, Activity activity) {
        if (((Boolean) k3.w.c().b(ir.A0)).booleanValue()) {
            j3.t.r();
            if (m3.b2.b(this.f8758i)) {
                ze0.g("Rewarded ads that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit https://googlemobileadssdk.page.link/admob-interstitial-policies");
                this.f8762m.b();
                if (((Boolean) k3.w.c().b(ir.B0)).booleanValue()) {
                    this.f8766q.a(this.f8015a.f16413b.f15924b.f11674b);
                }
                return false;
            }
        }
        if (this.f8768s) {
            ze0.g("The rewarded ad have been showed.");
            this.f8762m.u(fp2.d(10, null, null));
            return false;
        }
        this.f8768s = true;
        this.f8761l.b();
        Activity activity2 = activity;
        if (activity == null) {
            activity2 = this.f8758i;
        }
        try {
            this.f8760k.a(z10, activity2, this.f8762m);
            this.f8761l.a();
            return true;
        } catch (ib1 e5) {
            this.f8762m.h0(e5);
            return false;
        }
    }
}
