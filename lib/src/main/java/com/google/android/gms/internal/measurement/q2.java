package com.google.android.gms.internal.measurement;

import android.app.Activity;

/* loaded from: classes.dex */
final class q2 extends k2 {

    /* renamed from: q, reason: collision with root package name */
    final /* synthetic */ Activity f19206q;

    /* renamed from: r, reason: collision with root package name */
    final /* synthetic */ t2 f19207r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    q2(t2 t2Var, Activity activity) {
        super(t2Var.f19316m, true);
        this.f19207r = t2Var;
        this.f19206q = activity;
    }

    @Override // com.google.android.gms.internal.measurement.k2
    final void a() {
        ((f1) e4.p.l(this.f19207r.f19316m.f19340i)).onActivityStopped(l4.b.p1(this.f19206q), this.f19044n);
    }
}
