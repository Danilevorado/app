package com.google.android.gms.measurement.internal;

import android.os.RemoteException;

/* loaded from: classes.dex */
final class n7 implements Runnable {

    /* renamed from: m, reason: collision with root package name */
    final /* synthetic */ z9 f20205m;

    /* renamed from: n, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.measurement.i1 f20206n;

    /* renamed from: o, reason: collision with root package name */
    final /* synthetic */ h8 f20207o;

    n7(h8 h8Var, z9 z9Var, com.google.android.gms.internal.measurement.i1 i1Var) {
        this.f20207o = h8Var;
        this.f20205m = z9Var;
        this.f20206n = i1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String strM2 = null;
        try {
            try {
                if (this.f20207o.f20269a.F().o().i(x4.a.ANALYTICS_STORAGE)) {
                    h8 h8Var = this.f20207o;
                    x4.f fVar = h8Var.f19989d;
                    if (fVar == null) {
                        h8Var.f20269a.b().p().a("Failed to get app instance id");
                    } else {
                        e4.p.l(this.f20205m);
                        strM2 = fVar.M2(this.f20205m);
                        if (strM2 != null) {
                            this.f20207o.f20269a.I().C(strM2);
                            this.f20207o.f20269a.F().f19924g.b(strM2);
                        }
                        this.f20207o.E();
                    }
                } else {
                    this.f20207o.f20269a.b().v().a("Analytics storage consent denied; will not get app instance id");
                    this.f20207o.f20269a.I().C(null);
                    this.f20207o.f20269a.F().f19924g.b(null);
                }
            } catch (RemoteException e5) {
                this.f20207o.f20269a.b().p().b("Failed to get app instance id", e5);
            }
        } finally {
            this.f20207o.f20269a.N().J(this.f20206n, null);
        }
    }
}
