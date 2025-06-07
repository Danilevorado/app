package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class g22 extends i22 {

    /* renamed from: a, reason: collision with root package name */
    private final km0 f8583a;

    /* renamed from: b, reason: collision with root package name */
    private final tb1 f8584b;

    /* renamed from: c, reason: collision with root package name */
    private final s01 f8585c;

    /* renamed from: d, reason: collision with root package name */
    private final c71 f8586d;

    /* renamed from: e, reason: collision with root package name */
    private final t22 f8587e;

    /* renamed from: f, reason: collision with root package name */
    private final fz1 f8588f;

    public g22(km0 km0Var, tb1 tb1Var, s01 s01Var, c71 c71Var, t22 t22Var, fz1 fz1Var) {
        this.f8583a = km0Var;
        this.f8584b = tb1Var;
        this.f8585c = s01Var;
        this.f8586d = c71Var;
        this.f8587e = t22Var;
        this.f8588f = fz1Var;
    }

    @Override // com.google.android.gms.internal.ads.i22
    protected final ab3 c(do2 do2Var, Bundle bundle, hn2 hn2Var, un2 un2Var) {
        s01 s01Var = this.f8585c;
        s01Var.i(do2Var);
        s01Var.f(bundle);
        s01Var.g(new m01(un2Var, hn2Var, this.f8587e));
        if (((Boolean) k3.w.c().b(ir.f9949g3)).booleanValue()) {
            this.f8585c.d(this.f8588f);
        }
        xb1 xb1VarK = this.f8583a.k();
        xb1VarK.m(this.f8585c.j());
        xb1VarK.t(this.f8586d);
        xb1VarK.a(this.f8584b);
        xb1VarK.d(new wu0(null));
        my0 my0VarA = xb1VarK.h().a();
        return my0VarA.i(my0VarA.j());
    }
}
