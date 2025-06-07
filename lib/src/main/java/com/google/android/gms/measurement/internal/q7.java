package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;

/* loaded from: classes.dex */
final class q7 implements Runnable {

    /* renamed from: m, reason: collision with root package name */
    final /* synthetic */ z9 f20308m;

    /* renamed from: n, reason: collision with root package name */
    final /* synthetic */ Bundle f20309n;

    /* renamed from: o, reason: collision with root package name */
    final /* synthetic */ h8 f20310o;

    q7(h8 h8Var, z9 z9Var, Bundle bundle) {
        this.f20310o = h8Var;
        this.f20308m = z9Var;
        this.f20309n = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        h8 h8Var = this.f20310o;
        x4.f fVar = h8Var.f19989d;
        if (fVar == null) {
            h8Var.f20269a.b().p().a("Failed to send default event parameters to service");
            return;
        }
        try {
            e4.p.l(this.f20308m);
            fVar.Q1(this.f20309n, this.f20308m);
        } catch (RemoteException e5) {
            this.f20310o.f20269a.b().p().b("Failed to send default event parameters to service", e5);
        }
    }
}
