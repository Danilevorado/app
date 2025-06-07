package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
final class bq0 implements ml2 {

    /* renamed from: a, reason: collision with root package name */
    private final ho0 f6631a;

    /* renamed from: b, reason: collision with root package name */
    private final bq0 f6632b = this;

    /* renamed from: c, reason: collision with root package name */
    private final q44 f6633c;

    /* renamed from: d, reason: collision with root package name */
    private final q44 f6634d;

    /* renamed from: e, reason: collision with root package name */
    private final q44 f6635e;

    /* renamed from: f, reason: collision with root package name */
    private final q44 f6636f;

    /* renamed from: g, reason: collision with root package name */
    private final q44 f6637g;

    /* renamed from: h, reason: collision with root package name */
    private final q44 f6638h;

    /* renamed from: i, reason: collision with root package name */
    private final q44 f6639i;

    /* synthetic */ bq0(ho0 ho0Var, Context context, String str, k3.h4 h4Var, aq0 aq0Var) {
        this.f6631a = ho0Var;
        c44 c44VarA = d44.a(context);
        this.f6633c = c44VarA;
        c44 c44VarA2 = d44.a(h4Var);
        this.f6634d = c44VarA2;
        c44 c44VarA3 = d44.a(str);
        this.f6635e = c44VarA3;
        q44 q44VarC = b44.c(new r62(ho0Var.f9309p));
        this.f6636f = q44VarC;
        q44 q44VarC2 = b44.c(new lm2(ho0Var.F0));
        this.f6637g = q44VarC2;
        q44 q44VarC3 = b44.c(new kl2(c44VarA, ho0Var.f9311q, ho0Var.V, q44VarC, q44VarC2, fo2.a()));
        this.f6638h = q44VarC3;
        this.f6639i = b44.c(new a72(c44VarA, c44VarA2, c44VarA3, q44VarC3, q44VarC, q44VarC2, ho0Var.f9297j, ho0Var.W));
    }

    @Override // com.google.android.gms.internal.ads.ml2
    public final z62 a() {
        return (z62) this.f6639i.b();
    }
}
