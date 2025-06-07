package com.google.android.gms.internal.measurement;

import android.app.Activity;

/* loaded from: classes.dex */
final class r2 extends k2 {

    /* renamed from: q, reason: collision with root package name */
    final /* synthetic */ Activity f19239q;

    /* renamed from: r, reason: collision with root package name */
    final /* synthetic */ b1 f19240r;

    /* renamed from: s, reason: collision with root package name */
    final /* synthetic */ t2 f19241s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    r2(t2 t2Var, Activity activity, b1 b1Var) {
        super(t2Var.f19316m, true);
        this.f19241s = t2Var;
        this.f19239q = activity;
        this.f19240r = b1Var;
    }

    @Override // com.google.android.gms.internal.measurement.k2
    final void a() {
        ((f1) e4.p.l(this.f19241s.f19316m.f19340i)).onActivitySaveInstanceState(l4.b.p1(this.f19239q), this.f19240r, this.f19044n);
    }
}
