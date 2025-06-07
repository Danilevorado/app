package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class n22 extends i22 {

    /* renamed from: a, reason: collision with root package name */
    private final km0 f12374a;

    /* renamed from: b, reason: collision with root package name */
    private final s01 f12375b;

    /* renamed from: c, reason: collision with root package name */
    private final y42 f12376c;

    /* renamed from: d, reason: collision with root package name */
    private final c71 f12377d;

    /* renamed from: e, reason: collision with root package name */
    private final t22 f12378e;

    /* renamed from: f, reason: collision with root package name */
    private final fz1 f12379f;

    public n22(km0 km0Var, s01 s01Var, y42 y42Var, c71 c71Var, t22 t22Var, fz1 fz1Var) {
        this.f12374a = km0Var;
        this.f12375b = s01Var;
        this.f12376c = y42Var;
        this.f12377d = c71Var;
        this.f12378e = t22Var;
        this.f12379f = fz1Var;
    }

    @Override // com.google.android.gms.internal.ads.i22
    protected final ab3 c(do2 do2Var, Bundle bundle, hn2 hn2Var, un2 un2Var) {
        s01 s01Var = this.f12375b;
        s01Var.i(do2Var);
        s01Var.f(bundle);
        s01Var.g(new m01(un2Var, hn2Var, this.f12378e));
        if (((Boolean) k3.w.c().b(ir.f9949g3)).booleanValue()) {
            this.f12375b.d(this.f12379f);
        }
        ab1 ab1VarJ = this.f12374a.j();
        ab1VarJ.r(this.f12375b.j());
        ab1VarJ.i(this.f12377d);
        ab1VarJ.s(this.f12376c);
        my0 my0VarA = ab1VarJ.e().a();
        return my0VarA.i(my0VarA.j());
    }
}
