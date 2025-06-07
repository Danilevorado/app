package com.google.android.gms.measurement.internal;

import java.util.concurrent.Callable;

/* loaded from: classes.dex */
final class h9 implements Callable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ z9 f19995a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ n9 f19996b;

    h9(n9 n9Var, z9 z9Var) {
        this.f19996b = n9Var;
        this.f19995a = z9Var;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        x4.b bVarV = this.f19996b.V((String) e4.p.l(this.f19995a.f20612m));
        x4.a aVar = x4.a.ANALYTICS_STORAGE;
        if (bVarV.i(aVar) && x4.b.b(this.f19995a.H).i(aVar)) {
            return this.f19996b.S(this.f19995a).e0();
        }
        this.f19996b.b().t().a("Analytics storage consent denied. Returning null app instance id");
        return null;
    }
}
