package com.google.android.gms.measurement.internal;

import android.os.RemoteException;

/* loaded from: classes.dex */
final class o7 implements Runnable {

    /* renamed from: m, reason: collision with root package name */
    final /* synthetic */ z9 f20249m;

    /* renamed from: n, reason: collision with root package name */
    final /* synthetic */ h8 f20250n;

    o7(h8 h8Var, z9 z9Var) {
        this.f20250n = h8Var;
        this.f20249m = z9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        h8 h8Var = this.f20250n;
        x4.f fVar = h8Var.f19989d;
        if (fVar == null) {
            h8Var.f20269a.b().p().a("Discarding data. Failed to send app launch");
            return;
        }
        try {
            e4.p.l(this.f20249m);
            fVar.y5(this.f20249m);
            this.f20250n.f20269a.C().r();
            this.f20250n.p(fVar, null, this.f20249m);
            this.f20250n.E();
        } catch (RemoteException e5) {
            this.f20250n.f20269a.b().p().b("Failed to send app launch to the service", e5);
        }
    }
}
