package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
public final class zk2 implements c44 {

    /* renamed from: a, reason: collision with root package name */
    private final q44 f18617a;

    /* renamed from: b, reason: collision with root package name */
    private final q44 f18618b;

    /* renamed from: c, reason: collision with root package name */
    private final q44 f18619c;

    public zk2(q44 q44Var, q44 q44Var2, q44 q44Var3) {
        this.f18617a = q44Var;
        this.f18618b = q44Var2;
        this.f18619c = q44Var3;
    }

    @Override // com.google.android.gms.internal.ads.q44
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final wk2 b() {
        Context context = (Context) this.f18617a.b();
        op2 op2Var = (op2) this.f18618b.b();
        gq2 gq2Var = (gq2) this.f18619c.b();
        de0 de0VarG = ((Boolean) k3.w.c().b(ir.Y5)).booleanValue() ? j3.t.q().h().g() : j3.t.q().h().i();
        boolean z10 = false;
        if (de0VarG != null && de0VarG.h()) {
            z10 = true;
        }
        if (((Integer) k3.w.c().b(ir.f9888a6)).intValue() > 0) {
            if (!((Boolean) k3.w.c().b(ir.X5)).booleanValue() || z10) {
                fq2 fq2VarA = gq2Var.a(wp2.Rewarded, context, op2Var, new zj2(new wj2()));
                mk2 mk2Var = new mk2(new lk2());
                sp2 sp2Var = fq2VarA.f8376a;
                bb3 bb3Var = of0.f13186a;
                return new bk2(mk2Var, new ik2(sp2Var, bb3Var), fq2VarA.f8377b, fq2VarA.f8376a.a().f18689t, bb3Var);
            }
        }
        return new lk2();
    }
}
