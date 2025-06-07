package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
final class ro0 implements di2 {

    /* renamed from: a, reason: collision with root package name */
    private final ho0 f14862a;

    /* renamed from: b, reason: collision with root package name */
    private final ro0 f14863b = this;

    /* renamed from: c, reason: collision with root package name */
    private final q44 f14864c;

    /* renamed from: d, reason: collision with root package name */
    private final q44 f14865d;

    /* renamed from: e, reason: collision with root package name */
    private final q44 f14866e;

    /* renamed from: f, reason: collision with root package name */
    private final q44 f14867f;

    /* renamed from: g, reason: collision with root package name */
    private final q44 f14868g;

    /* renamed from: h, reason: collision with root package name */
    private final q44 f14869h;

    /* synthetic */ ro0(ho0 ho0Var, Context context, String str, qo0 qo0Var) {
        this.f14862a = ho0Var;
        c44 c44VarA = d44.a(context);
        this.f14864c = c44VarA;
        c44 c44VarA2 = d44.a(str);
        this.f14865d = c44VarA2;
        yk2 yk2Var = new yk2(c44VarA, ho0Var.F0, ho0Var.G0);
        this.f14866e = yk2Var;
        q44 q44VarC = b44.c(new cj2(ho0Var.F0));
        this.f14867f = q44VarC;
        q44 q44VarC2 = b44.c(new ej2(c44VarA, ho0Var.f9311q, ho0Var.V, yk2Var, q44VarC, fo2.a(), ho0Var.f9297j));
        this.f14868g = q44VarC2;
        this.f14869h = b44.c(new lj2(ho0Var.V, c44VarA, c44VarA2, q44VarC2, q44VarC, ho0Var.f9297j));
    }

    @Override // com.google.android.gms.internal.ads.di2
    public final kj2 a() {
        return (kj2) this.f14869h.b();
    }
}
