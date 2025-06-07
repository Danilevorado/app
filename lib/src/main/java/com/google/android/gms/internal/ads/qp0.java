package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
final class qp0 implements io1 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f14431a;

    /* renamed from: b, reason: collision with root package name */
    private final cz f14432b;

    /* renamed from: c, reason: collision with root package name */
    private final ho0 f14433c;

    /* renamed from: d, reason: collision with root package name */
    private final qp0 f14434d = this;

    /* renamed from: e, reason: collision with root package name */
    private final q44 f14435e;

    /* renamed from: f, reason: collision with root package name */
    private final q44 f14436f;

    /* renamed from: g, reason: collision with root package name */
    private final q44 f14437g;

    /* renamed from: h, reason: collision with root package name */
    private final q44 f14438h;

    /* synthetic */ qp0(ho0 ho0Var, Context context, cz czVar, pp0 pp0Var) {
        this.f14433c = ho0Var;
        this.f14431a = context;
        this.f14432b = czVar;
        c44 c44VarA = d44.a(this);
        this.f14435e = c44VarA;
        c44 c44VarA2 = d44.a(czVar);
        this.f14436f = c44VarA2;
        eo1 eo1Var = new eo1(c44VarA2);
        this.f14437g = eo1Var;
        this.f14438h = b44.c(new go1(c44VarA, eo1Var));
    }

    @Override // com.google.android.gms.internal.ads.io1
    public final yn1 b() {
        return new kp0(this.f14433c, this.f14434d, null);
    }

    @Override // com.google.android.gms.internal.ads.io1
    public final fo1 f() {
        return (fo1) this.f14438h.b();
    }
}
