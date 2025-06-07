package com.google.android.gms.measurement.internal;

import android.os.RemoteException;

/* loaded from: classes.dex */
final class s7 implements Runnable {

    /* renamed from: m, reason: collision with root package name */
    final /* synthetic */ v f20394m;

    /* renamed from: n, reason: collision with root package name */
    final /* synthetic */ String f20395n;

    /* renamed from: o, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.measurement.i1 f20396o;

    /* renamed from: p, reason: collision with root package name */
    final /* synthetic */ h8 f20397p;

    s7(h8 h8Var, v vVar, String str, com.google.android.gms.internal.measurement.i1 i1Var) {
        this.f20397p = h8Var;
        this.f20394m = vVar;
        this.f20395n = str;
        this.f20396o = i1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte[] bArrQ2 = null;
        try {
            try {
                h8 h8Var = this.f20397p;
                x4.f fVar = h8Var.f19989d;
                if (fVar == null) {
                    h8Var.f20269a.b().p().a("Discarding data. Failed to send event to service to bundle");
                } else {
                    bArrQ2 = fVar.q2(this.f20394m, this.f20395n);
                    this.f20397p.E();
                }
            } catch (RemoteException e5) {
                this.f20397p.f20269a.b().p().b("Failed to send event to the service to bundle", e5);
            }
        } finally {
            this.f20397p.f20269a.N().G(this.f20396o, bArrQ2);
        }
    }
}
