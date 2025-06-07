package com.google.android.gms.internal.measurement;

import android.os.Bundle;

/* loaded from: classes.dex */
final class f2 extends k2 {

    /* renamed from: q, reason: collision with root package name */
    final /* synthetic */ Bundle f18936q;

    /* renamed from: r, reason: collision with root package name */
    final /* synthetic */ b1 f18937r;

    /* renamed from: s, reason: collision with root package name */
    final /* synthetic */ u2 f18938s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    f2(u2 u2Var, Bundle bundle, b1 b1Var) {
        super(u2Var, true);
        this.f18938s = u2Var;
        this.f18936q = bundle;
        this.f18937r = b1Var;
    }

    @Override // com.google.android.gms.internal.measurement.k2
    final void a() {
        ((f1) e4.p.l(this.f18938s.f19340i)).performAction(this.f18936q, this.f18937r, this.f19043m);
    }

    @Override // com.google.android.gms.internal.measurement.k2
    protected final void b() {
        this.f18937r.h0(null);
    }
}
