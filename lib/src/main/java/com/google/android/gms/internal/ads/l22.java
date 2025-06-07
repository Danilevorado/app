package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class l22 extends i22 {

    /* renamed from: a, reason: collision with root package name */
    private final km0 f11297a;

    /* renamed from: b, reason: collision with root package name */
    private final s01 f11298b;

    /* renamed from: c, reason: collision with root package name */
    private final y42 f11299c;

    /* renamed from: d, reason: collision with root package name */
    private final c71 f11300d;

    /* renamed from: e, reason: collision with root package name */
    private final tb1 f11301e;

    /* renamed from: f, reason: collision with root package name */
    private final c41 f11302f;

    /* renamed from: g, reason: collision with root package name */
    private final ViewGroup f11303g;

    /* renamed from: h, reason: collision with root package name */
    private final j61 f11304h;

    /* renamed from: i, reason: collision with root package name */
    private final t22 f11305i;

    /* renamed from: j, reason: collision with root package name */
    private final fz1 f11306j;

    public l22(km0 km0Var, s01 s01Var, y42 y42Var, c71 c71Var, tb1 tb1Var, c41 c41Var, ViewGroup viewGroup, j61 j61Var, t22 t22Var, fz1 fz1Var) {
        this.f11297a = km0Var;
        this.f11298b = s01Var;
        this.f11299c = y42Var;
        this.f11300d = c71Var;
        this.f11301e = tb1Var;
        this.f11302f = c41Var;
        this.f11303g = viewGroup;
        this.f11304h = j61Var;
        this.f11305i = t22Var;
        this.f11306j = fz1Var;
    }

    @Override // com.google.android.gms.internal.ads.i22
    protected final ab3 c(do2 do2Var, Bundle bundle, hn2 hn2Var, un2 un2Var) {
        s01 s01Var = this.f11298b;
        s01Var.i(do2Var);
        s01Var.f(bundle);
        s01Var.g(new m01(un2Var, hn2Var, this.f11305i));
        if (((Boolean) k3.w.c().b(ir.f9949g3)).booleanValue()) {
            this.f11298b.d(this.f11306j);
        }
        wv0 wv0VarH = this.f11297a.h();
        wv0VarH.o(this.f11298b.j());
        wv0VarH.p(this.f11300d);
        wv0VarH.k(this.f11299c);
        wv0VarH.a(this.f11301e);
        wv0VarH.l(new vw0(this.f11302f, this.f11304h));
        wv0VarH.d(new wu0(this.f11303g));
        my0 my0VarD = wv0VarH.j().d();
        return my0VarD.i(my0VarD.j());
    }
}
