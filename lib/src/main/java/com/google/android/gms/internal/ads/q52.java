package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.Collections;

/* loaded from: classes.dex */
public final class q52 extends k3.p0 {

    /* renamed from: m, reason: collision with root package name */
    private final Context f14148m;

    /* renamed from: n, reason: collision with root package name */
    private final k3.d0 f14149n;

    /* renamed from: o, reason: collision with root package name */
    private final do2 f14150o;

    /* renamed from: p, reason: collision with root package name */
    private final zu0 f14151p;

    /* renamed from: q, reason: collision with root package name */
    private final ViewGroup f14152q;

    public q52(Context context, k3.d0 d0Var, do2 do2Var, zu0 zu0Var) {
        this.f14148m = context;
        this.f14149n = d0Var;
        this.f14150o = do2Var;
        this.f14151p = zu0Var;
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.removeAllViews();
        View viewI = zu0Var.i();
        j3.t.r();
        frameLayout.addView(viewI, new ViewGroup.LayoutParams(-1, -1));
        frameLayout.setMinimumHeight(h().f24653o);
        frameLayout.setMinimumWidth(h().f24656r);
        this.f14152q = frameLayout;
    }

    @Override // k3.q0
    public final void A() {
        e4.p.e("destroy must be called on the main UI thread.");
        this.f14151p.a();
    }

    @Override // k3.q0
    public final String B() {
        if (this.f14151p.c() != null) {
            return this.f14151p.c().h();
        }
        return null;
    }

    @Override // k3.q0
    public final void B1(k3.h4 h4Var) {
        e4.p.e("setAdSize must be called on the main UI thread.");
        zu0 zu0Var = this.f14151p;
        if (zu0Var != null) {
            zu0Var.n(this.f14152q, h4Var);
        }
    }

    @Override // k3.q0
    public final boolean C1(k3.c4 c4Var) {
        ze0.f("loadAd is not supported for an Ad Manager AdView returned from AdLoader.");
        return false;
    }

    @Override // k3.q0
    public final void C3(q70 q70Var, String str) {
    }

    @Override // k3.q0
    public final void C5(k3.y0 y0Var) {
        q62 q62Var = this.f14150o.f7444c;
        if (q62Var != null) {
            q62Var.o(y0Var);
        }
    }

    @Override // k3.q0
    public final boolean D0() {
        return false;
    }

    @Override // k3.q0
    public final void F() {
        this.f14151p.m();
    }

    @Override // k3.q0
    public final void F3(boolean z10) {
    }

    @Override // k3.q0
    public final void O() {
        e4.p.e("destroy must be called on the main UI thread.");
        this.f14151p.d().u0(null);
    }

    @Override // k3.q0
    public final void O2(k3.c4 c4Var, k3.g0 g0Var) {
    }

    @Override // k3.q0
    public final void S3(m70 m70Var) {
    }

    @Override // k3.q0
    public final void U0(k3.d0 d0Var) {
        ze0.f("setAdListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // k3.q0
    public final void U2(k3.c2 c2Var) {
        if (!((Boolean) k3.w.c().b(ir.N9)).booleanValue()) {
            ze0.f("setOnPaidEventListener is not supported in Ad Manager AdView returned by AdLoader.");
            return;
        }
        q62 q62Var = this.f14150o.f7444c;
        if (q62Var != null) {
            q62Var.h(c2Var);
        }
    }

    @Override // k3.q0
    public final void W3(String str) {
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
        ze0.f("setAdMetadataListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // k3.q0
    public final Bundle f() {
        ze0.f("getAdMetadata is not supported in Ad Manager AdView returned by AdLoader.");
        return new Bundle();
    }

    @Override // k3.q0
    public final void f1(l4.a aVar) {
    }

    @Override // k3.q0
    public final void g5(ga0 ga0Var) {
    }

    @Override // k3.q0
    public final k3.h4 h() {
        e4.p.e("getAdSize must be called on the main UI thread.");
        return ho2.a(this.f14148m, Collections.singletonList(this.f14151p.k()));
    }

    @Override // k3.q0
    public final void h1(k3.v3 v3Var) {
        ze0.f("setVideoOptions is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // k3.q0
    public final void h3(k3.a0 a0Var) {
        ze0.f("setAdClickListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // k3.q0
    public final k3.d0 i() {
        return this.f14149n;
    }

    @Override // k3.q0
    public final k3.y0 j() {
        return this.f14150o.f7455n;
    }

    @Override // k3.q0
    public final k3.j2 k() {
        return this.f14151p.c();
    }

    @Override // k3.q0
    public final void k2(k3.q2 q2Var) {
    }

    @Override // k3.q0
    public final k3.m2 l() {
        return this.f14151p.j();
    }

    @Override // k3.q0
    public final l4.a m() {
        return l4.b.p1(this.f14152q);
    }

    @Override // k3.q0
    public final void m4(ll llVar) {
    }

    @Override // k3.q0
    public final void o0() {
        e4.p.e("destroy must be called on the main UI thread.");
        this.f14151p.d().s0(null);
    }

    @Override // k3.q0
    public final void p2(k3.c1 c1Var) {
        ze0.f("setCorrelationIdProvider is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // k3.q0
    public final void p4(hs hsVar) {
        ze0.f("setOnCustomRenderedAdLoadedListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // k3.q0
    public final String r() {
        return this.f14150o.f7447f;
    }

    @Override // k3.q0
    public final void r1(k3.f1 f1Var) {
    }

    @Override // k3.q0
    public final String t() {
        if (this.f14151p.c() != null) {
            return this.f14151p.c().h();
        }
        return null;
    }

    @Override // k3.q0
    public final void t0() {
    }

    @Override // k3.q0
    public final void v1(String str) {
    }

    @Override // k3.q0
    public final void w5(boolean z10) {
        ze0.f("setManualImpressionsEnabled is not supported in Ad Manager AdView returned by AdLoader.");
    }
}
