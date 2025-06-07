package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;

/* loaded from: classes.dex */
public final class q42 implements az1 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f14132a;

    /* renamed from: b, reason: collision with root package name */
    private final xv0 f14133b;

    /* renamed from: c, reason: collision with root package name */
    private final hs f14134c;

    /* renamed from: d, reason: collision with root package name */
    private final bb3 f14135d;

    /* renamed from: e, reason: collision with root package name */
    private final ls2 f14136e;

    public q42(Context context, xv0 xv0Var, ls2 ls2Var, bb3 bb3Var, hs hsVar) {
        this.f14132a = context;
        this.f14133b = xv0Var;
        this.f14136e = ls2Var;
        this.f14135d = bb3Var;
        this.f14134c = hsVar;
    }

    @Override // com.google.android.gms.internal.ads.az1
    public final ab3 a(un2 un2Var, hn2 hn2Var) {
        av0 av0VarA = this.f14133b.a(new tx0(un2Var, hn2Var, null), new o42(this, new View(this.f14132a), null, new bx0() { // from class: com.google.android.gms.internal.ads.m42
            @Override // com.google.android.gms.internal.ads.bx0
            public final k3.m2 a() {
                return null;
            }
        }, (in2) hn2Var.f9274v.get(0)));
        p42 p42VarK = av0VarA.k();
        nn2 nn2Var = hn2Var.f9272t;
        final bs bsVar = new bs(p42VarK, nn2Var.f12719b, nn2Var.f12718a);
        ls2 ls2Var = this.f14136e;
        return vr2.d(new or2() { // from class: com.google.android.gms.internal.ads.n42
            @Override // com.google.android.gms.internal.ads.or2
            public final void a() {
                this.f12409a.c(bsVar);
            }
        }, this.f14135d, fs2.CUSTOM_RENDER_SYN, ls2Var).b(fs2.CUSTOM_RENDER_ACK).d(qa3.h(av0VarA.h())).a();
    }

    @Override // com.google.android.gms.internal.ads.az1
    public final boolean b(un2 un2Var, hn2 hn2Var) {
        nn2 nn2Var;
        return (this.f14134c == null || (nn2Var = hn2Var.f9272t) == null || nn2Var.f12718a == null) ? false : true;
    }

    final /* synthetic */ void c(bs bsVar) {
        this.f14134c.Y1(bsVar);
    }
}
