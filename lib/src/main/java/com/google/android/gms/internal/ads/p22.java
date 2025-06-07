package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class p22 extends i22 {

    /* renamed from: a, reason: collision with root package name */
    private final km0 f13523a;

    /* renamed from: b, reason: collision with root package name */
    private final s01 f13524b;

    /* renamed from: c, reason: collision with root package name */
    private final c71 f13525c;

    /* renamed from: d, reason: collision with root package name */
    private final t22 f13526d;

    /* renamed from: e, reason: collision with root package name */
    private final vn2 f13527e;

    /* renamed from: f, reason: collision with root package name */
    private final fz1 f13528f;

    public p22(km0 km0Var, s01 s01Var, c71 c71Var, vn2 vn2Var, t22 t22Var, fz1 fz1Var) {
        this.f13523a = km0Var;
        this.f13524b = s01Var;
        this.f13525c = c71Var;
        this.f13527e = vn2Var;
        this.f13526d = t22Var;
        this.f13528f = fz1Var;
    }

    @Override // com.google.android.gms.internal.ads.i22
    protected final ab3 c(do2 do2Var, Bundle bundle, hn2 hn2Var, un2 un2Var) {
        vn2 vn2Var;
        s01 s01Var = this.f13524b;
        s01Var.i(do2Var);
        s01Var.f(bundle);
        s01Var.g(new m01(un2Var, hn2Var, this.f13526d));
        if (((Boolean) k3.w.c().b(ir.f9939f3)).booleanValue() && (vn2Var = this.f13527e) != null) {
            this.f13524b.h(vn2Var);
        }
        if (((Boolean) k3.w.c().b(ir.f9949g3)).booleanValue()) {
            this.f13524b.d(this.f13528f);
        }
        kj1 kj1VarL = this.f13523a.l();
        kj1VarL.f(this.f13524b.j());
        kj1VarL.b(this.f13525c);
        my0 my0VarB = kj1VarL.c().b();
        return my0VarB.i(my0VarB.j());
    }
}
