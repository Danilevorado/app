package com.google.android.gms.measurement.internal;

import android.os.RemoteException;

/* loaded from: classes.dex */
final class p7 implements Runnable {

    /* renamed from: m, reason: collision with root package name */
    final /* synthetic */ a7 f20272m;

    /* renamed from: n, reason: collision with root package name */
    final /* synthetic */ h8 f20273n;

    p7(h8 h8Var, a7 a7Var) {
        this.f20273n = h8Var;
        this.f20272m = a7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        h8 h8Var = this.f20273n;
        x4.f fVar = h8Var.f19989d;
        if (fVar == null) {
            h8Var.f20269a.b().p().a("Failed to send current screen to service");
            return;
        }
        try {
            a7 a7Var = this.f20272m;
            if (a7Var == null) {
                fVar.i1(0L, null, null, h8Var.f20269a.a().getPackageName());
            } else {
                fVar.i1(a7Var.f19757c, a7Var.f19755a, a7Var.f19756b, h8Var.f20269a.a().getPackageName());
            }
            this.f20273n.E();
        } catch (RemoteException e5) {
            this.f20273n.f20269a.b().p().b("Failed to send current screen to the service", e5);
        }
    }
}
