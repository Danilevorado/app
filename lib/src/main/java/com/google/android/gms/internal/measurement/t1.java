package com.google.android.gms.internal.measurement;

import android.os.Bundle;

/* loaded from: classes.dex */
final class t1 extends k2 {

    /* renamed from: q, reason: collision with root package name */
    final /* synthetic */ Bundle f19314q;

    /* renamed from: r, reason: collision with root package name */
    final /* synthetic */ u2 f19315r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    t1(u2 u2Var, Bundle bundle) {
        super(u2Var, true);
        this.f19315r = u2Var;
        this.f19314q = bundle;
    }

    @Override // com.google.android.gms.internal.measurement.k2
    final void a() {
        ((f1) e4.p.l(this.f19315r.f19340i)).setConsent(this.f19314q, this.f19043m);
    }
}
