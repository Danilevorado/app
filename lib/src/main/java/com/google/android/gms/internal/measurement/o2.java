package com.google.android.gms.internal.measurement;

import android.app.Activity;

/* loaded from: classes.dex */
final class o2 extends k2 {

    /* renamed from: q, reason: collision with root package name */
    final /* synthetic */ Activity f19141q;

    /* renamed from: r, reason: collision with root package name */
    final /* synthetic */ t2 f19142r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    o2(t2 t2Var, Activity activity) {
        super(t2Var.f19316m, true);
        this.f19142r = t2Var;
        this.f19141q = activity;
    }

    @Override // com.google.android.gms.internal.measurement.k2
    final void a() {
        ((f1) e4.p.l(this.f19142r.f19316m.f19340i)).onActivityPaused(l4.b.p1(this.f19141q), this.f19044n);
    }
}
