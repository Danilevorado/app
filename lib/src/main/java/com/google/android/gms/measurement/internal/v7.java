package com.google.android.gms.measurement.internal;

import android.os.RemoteException;

/* loaded from: classes.dex */
final class v7 implements Runnable {

    /* renamed from: m, reason: collision with root package name */
    final /* synthetic */ z9 f20492m;

    /* renamed from: n, reason: collision with root package name */
    final /* synthetic */ h8 f20493n;

    v7(h8 h8Var, z9 z9Var) {
        this.f20493n = h8Var;
        this.f20492m = z9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        h8 h8Var = this.f20493n;
        x4.f fVar = h8Var.f19989d;
        if (fVar == null) {
            h8Var.f20269a.b().p().a("Failed to send consent settings to service");
            return;
        }
        try {
            e4.p.l(this.f20492m);
            fVar.A2(this.f20492m);
            this.f20493n.E();
        } catch (RemoteException e5) {
            this.f20493n.f20269a.b().p().b("Failed to send consent settings to the service", e5);
        }
    }
}
