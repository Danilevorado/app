package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class j22 extends i22 {

    /* renamed from: a, reason: collision with root package name */
    private final km0 f10263a;

    /* renamed from: b, reason: collision with root package name */
    private final s01 f10264b;

    /* renamed from: c, reason: collision with root package name */
    private final c71 f10265c;

    /* renamed from: d, reason: collision with root package name */
    private final t22 f10266d;

    /* renamed from: e, reason: collision with root package name */
    private final fz1 f10267e;

    j22(km0 km0Var, s01 s01Var, c71 c71Var, t22 t22Var, fz1 fz1Var) {
        this.f10263a = km0Var;
        this.f10264b = s01Var;
        this.f10265c = c71Var;
        this.f10266d = t22Var;
        this.f10267e = fz1Var;
    }

    @Override // com.google.android.gms.internal.ads.i22
    protected final ab3 c(do2 do2Var, Bundle bundle, hn2 hn2Var, un2 un2Var) {
        s01 s01Var = this.f10264b;
        s01Var.i(do2Var);
        s01Var.f(bundle);
        s01Var.g(new m01(un2Var, hn2Var, this.f10266d));
        if (((Boolean) k3.w.c().b(ir.f9949g3)).booleanValue()) {
            this.f10264b.d(this.f10267e);
        }
        mu0 mu0VarG = this.f10263a.g();
        mu0VarG.f(this.f10264b.j());
        mu0VarG.b(this.f10265c);
        my0 my0VarB = mu0VarG.c().b();
        return my0VarB.i(my0VarB.j());
    }
}
