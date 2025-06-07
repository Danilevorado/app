package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
final class fq0 implements bn2 {

    /* renamed from: a, reason: collision with root package name */
    private final ho0 f8364a;

    /* renamed from: b, reason: collision with root package name */
    private final fq0 f8365b = this;

    /* renamed from: c, reason: collision with root package name */
    private final q44 f8366c;

    /* renamed from: d, reason: collision with root package name */
    private final q44 f8367d;

    /* renamed from: e, reason: collision with root package name */
    private final q44 f8368e;

    /* renamed from: f, reason: collision with root package name */
    private final q44 f8369f;

    /* renamed from: g, reason: collision with root package name */
    private final q44 f8370g;

    /* renamed from: h, reason: collision with root package name */
    private final q44 f8371h;

    /* renamed from: i, reason: collision with root package name */
    private final q44 f8372i;

    /* renamed from: j, reason: collision with root package name */
    private final q44 f8373j;

    /* synthetic */ fq0(ho0 ho0Var, Context context, String str, eq0 eq0Var) {
        this.f8364a = ho0Var;
        c44 c44VarA = d44.a(context);
        this.f8366c = c44VarA;
        zk2 zk2Var = new zk2(c44VarA, ho0Var.F0, ho0Var.G0);
        this.f8367d = zk2Var;
        q44 q44VarC = b44.c(new lm2(ho0Var.F0));
        this.f8368e = q44VarC;
        q44 q44VarC2 = b44.c(ao2.a());
        this.f8369f = q44VarC2;
        q44 q44VarC3 = b44.c(new vm2(c44VarA, ho0Var.f9311q, ho0Var.V, zk2Var, q44VarC, fo2.a(), q44VarC2));
        this.f8370g = q44VarC3;
        this.f8371h = b44.c(new fn2(q44VarC3, q44VarC, q44VarC2));
        c44 c44VarC = d44.c(str);
        this.f8372i = c44VarC;
        this.f8373j = b44.c(new zm2(c44VarC, q44VarC3, c44VarA, q44VarC, q44VarC2, ho0Var.f9297j, ho0Var.W));
    }

    @Override // com.google.android.gms.internal.ads.bn2
    public final ym2 a() {
        return (ym2) this.f8373j.b();
    }

    @Override // com.google.android.gms.internal.ads.bn2
    public final en2 b() {
        return (en2) this.f8371h.b();
    }
}
