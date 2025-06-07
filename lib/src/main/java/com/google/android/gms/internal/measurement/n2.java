package com.google.android.gms.internal.measurement;

import android.app.Activity;

/* loaded from: classes.dex */
final class n2 extends k2 {

    /* renamed from: q, reason: collision with root package name */
    final /* synthetic */ Activity f19128q;

    /* renamed from: r, reason: collision with root package name */
    final /* synthetic */ t2 f19129r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    n2(t2 t2Var, Activity activity) {
        super(t2Var.f19316m, true);
        this.f19129r = t2Var;
        this.f19128q = activity;
    }

    @Override // com.google.android.gms.internal.measurement.k2
    final void a() {
        ((f1) e4.p.l(this.f19129r.f19316m.f19340i)).onActivityResumed(l4.b.p1(this.f19128q), this.f19044n);
    }
}
