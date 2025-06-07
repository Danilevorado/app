package com.google.android.gms.measurement.internal;

import android.os.RemoteException;

/* loaded from: classes.dex */
final class l7 implements Runnable {

    /* renamed from: m, reason: collision with root package name */
    final /* synthetic */ z9 f20159m;

    /* renamed from: n, reason: collision with root package name */
    final /* synthetic */ h8 f20160n;

    l7(h8 h8Var, z9 z9Var) {
        this.f20160n = h8Var;
        this.f20159m = z9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        h8 h8Var = this.f20160n;
        x4.f fVar = h8Var.f19989d;
        if (fVar == null) {
            h8Var.f20269a.b().p().a("Failed to reset data on the service: not connected to service");
            return;
        }
        try {
            e4.p.l(this.f20159m);
            fVar.v3(this.f20159m);
        } catch (RemoteException e5) {
            this.f20160n.f20269a.b().p().b("Failed to reset data on the service: remote exception", e5);
        }
        this.f20160n.E();
    }
}
