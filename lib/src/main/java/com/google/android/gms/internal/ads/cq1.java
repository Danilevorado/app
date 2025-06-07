package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
public final class cq1 implements c44 {

    /* renamed from: a, reason: collision with root package name */
    private final q44 f7037a;

    /* renamed from: b, reason: collision with root package name */
    private final q44 f7038b;

    /* renamed from: c, reason: collision with root package name */
    private final q44 f7039c;

    /* renamed from: d, reason: collision with root package name */
    private final q44 f7040d;

    public cq1(q44 q44Var, q44 q44Var2, q44 q44Var3, q44 q44Var4) {
        this.f7037a = q44Var;
        this.f7038b = q44Var2;
        this.f7039c = q44Var3;
        this.f7040d = q44Var4;
    }

    @Override // com.google.android.gms.internal.ads.q44
    public final /* bridge */ /* synthetic */ Object b() {
        Context contextA = ((qm0) this.f7037a).a();
        gq1 gq1Var = (gq1) this.f7038b.b();
        tq1 tq1Var = new tq1();
        bb3 bb3Var = of0.f13186a;
        k44.b(bb3Var);
        return new sq1(contextA, gq1Var, tq1Var, bb3Var);
    }
}
