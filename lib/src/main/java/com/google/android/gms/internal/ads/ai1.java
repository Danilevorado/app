package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class ai1 extends lw {

    /* renamed from: m, reason: collision with root package name */
    private final String f6100m;

    /* renamed from: n, reason: collision with root package name */
    private final kd1 f6101n;

    /* renamed from: o, reason: collision with root package name */
    private final pd1 f6102o;

    public ai1(String str, kd1 kd1Var, pd1 pd1Var) {
        this.f6100m = str;
        this.f6101n = kd1Var;
        this.f6102o = pd1Var;
    }

    @Override // com.google.android.gms.internal.ads.mw
    public final void A() {
        this.f6101n.a();
    }

    @Override // com.google.android.gms.internal.ads.mw
    public final String B() {
        return this.f6102o.d();
    }

    @Override // com.google.android.gms.internal.ads.mw
    public final void D() {
        this.f6101n.X();
    }

    @Override // com.google.android.gms.internal.ads.mw
    public final void F() {
        this.f6101n.n();
    }

    @Override // com.google.android.gms.internal.ads.mw
    public final void F4(Bundle bundle) {
        this.f6101n.r(bundle);
    }

    @Override // com.google.android.gms.internal.ads.mw
    public final void K1(k3.o1 o1Var) {
        this.f6101n.u(o1Var);
    }

    @Override // com.google.android.gms.internal.ads.mw
    public final boolean P() {
        return this.f6101n.B();
    }

    @Override // com.google.android.gms.internal.ads.mw
    public final void Q() {
        this.f6101n.t();
    }

    @Override // com.google.android.gms.internal.ads.mw
    public final boolean T() {
        return (this.f6102o.g().isEmpty() || this.f6102o.V() == null) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.mw
    public final boolean W2(Bundle bundle) {
        return this.f6101n.E(bundle);
    }

    @Override // com.google.android.gms.internal.ads.mw
    public final void a2(jw jwVar) {
        this.f6101n.w(jwVar);
    }

    @Override // com.google.android.gms.internal.ads.mw
    public final double c() {
        return this.f6102o.A();
    }

    @Override // com.google.android.gms.internal.ads.mw
    public final Bundle e() {
        return this.f6102o.O();
    }

    @Override // com.google.android.gms.internal.ads.mw
    public final k3.m2 g() {
        return this.f6102o.U();
    }

    @Override // com.google.android.gms.internal.ads.mw
    public final k3.j2 h() {
        if (((Boolean) k3.w.c().b(ir.f10105u6)).booleanValue()) {
            return this.f6101n.c();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.mw
    public final void h2(k3.r1 r1Var) {
        this.f6101n.i(r1Var);
    }

    @Override // com.google.android.gms.internal.ads.mw
    public final ju i() {
        return this.f6102o.W();
    }

    @Override // com.google.android.gms.internal.ads.mw
    public final nu j() {
        return this.f6101n.N().a();
    }

    @Override // com.google.android.gms.internal.ads.mw
    public final qu k() {
        return this.f6102o.Y();
    }

    @Override // com.google.android.gms.internal.ads.mw
    public final l4.a l() {
        return this.f6102o.e0();
    }

    @Override // com.google.android.gms.internal.ads.mw
    public final String m() {
        return this.f6102o.h0();
    }

    @Override // com.google.android.gms.internal.ads.mw
    public final l4.a n() {
        return l4.b.p1(this.f6101n);
    }

    @Override // com.google.android.gms.internal.ads.mw
    public final String o() {
        return this.f6102o.j0();
    }

    @Override // com.google.android.gms.internal.ads.mw
    public final String p() {
        return this.f6102o.i0();
    }

    @Override // com.google.android.gms.internal.ads.mw
    public final void p5(Bundle bundle) {
        this.f6101n.m(bundle);
    }

    @Override // com.google.android.gms.internal.ads.mw
    public final String q() {
        return this.f6102o.a();
    }

    @Override // com.google.android.gms.internal.ads.mw
    public final String r() {
        return this.f6100m;
    }

    @Override // com.google.android.gms.internal.ads.mw
    public final String t() {
        return this.f6102o.c();
    }

    @Override // com.google.android.gms.internal.ads.mw
    public final List u() {
        return this.f6102o.f();
    }

    @Override // com.google.android.gms.internal.ads.mw
    public final List v() {
        return T() ? this.f6102o.g() : Collections.emptyList();
    }

    @Override // com.google.android.gms.internal.ads.mw
    public final void v5(k3.c2 c2Var) {
        this.f6101n.v(c2Var);
    }
}
