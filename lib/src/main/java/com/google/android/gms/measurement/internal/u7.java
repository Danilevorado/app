package com.google.android.gms.measurement.internal;

import android.os.RemoteException;

/* loaded from: classes.dex */
final class u7 implements Runnable {

    /* renamed from: m, reason: collision with root package name */
    final /* synthetic */ z9 f20451m;

    /* renamed from: n, reason: collision with root package name */
    final /* synthetic */ h8 f20452n;

    u7(h8 h8Var, z9 z9Var) {
        this.f20452n = h8Var;
        this.f20451m = z9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        h8 h8Var = this.f20452n;
        x4.f fVar = h8Var.f19989d;
        if (fVar == null) {
            h8Var.f20269a.b().p().a("Failed to send measurementEnabled to service");
            return;
        }
        try {
            e4.p.l(this.f20451m);
            fVar.D1(this.f20451m);
            this.f20452n.E();
        } catch (RemoteException e5) {
            this.f20452n.f20269a.b().p().b("Failed to send measurementEnabled to the service", e5);
        }
    }
}
