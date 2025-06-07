package com.google.android.gms.internal.measurement;

import android.os.Bundle;

/* loaded from: classes.dex */
final class p1 extends k2 {

    /* renamed from: q, reason: collision with root package name */
    final /* synthetic */ Bundle f19185q;

    /* renamed from: r, reason: collision with root package name */
    final /* synthetic */ u2 f19186r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    p1(u2 u2Var, Bundle bundle) {
        super(u2Var, true);
        this.f19186r = u2Var;
        this.f19185q = bundle;
    }

    @Override // com.google.android.gms.internal.measurement.k2
    final void a() {
        ((f1) e4.p.l(this.f19186r.f19340i)).setConditionalUserProperty(this.f19185q, this.f19043m);
    }
}
