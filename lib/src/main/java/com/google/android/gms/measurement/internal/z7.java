package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import java.util.ArrayList;

/* loaded from: classes.dex */
final class z7 implements Runnable {

    /* renamed from: m, reason: collision with root package name */
    final /* synthetic */ String f20606m;

    /* renamed from: n, reason: collision with root package name */
    final /* synthetic */ String f20607n;

    /* renamed from: o, reason: collision with root package name */
    final /* synthetic */ z9 f20608o;

    /* renamed from: p, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.measurement.i1 f20609p;

    /* renamed from: q, reason: collision with root package name */
    final /* synthetic */ h8 f20610q;

    z7(h8 h8Var, String str, String str2, z9 z9Var, com.google.android.gms.internal.measurement.i1 i1Var) {
        this.f20610q = h8Var;
        this.f20606m = str;
        this.f20607n = str2;
        this.f20608o = z9Var;
        this.f20609p = i1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList = new ArrayList();
        try {
            try {
                h8 h8Var = this.f20610q;
                x4.f fVar = h8Var.f19989d;
                if (fVar == null) {
                    h8Var.f20269a.b().p().c("Failed to get conditional properties; not connected to service", this.f20606m, this.f20607n);
                } else {
                    e4.p.l(this.f20608o);
                    arrayList = u9.t(fVar.A5(this.f20606m, this.f20607n, this.f20608o));
                    this.f20610q.E();
                }
            } catch (RemoteException e5) {
                this.f20610q.f20269a.b().p().d("Failed to get conditional properties; remote exception", this.f20606m, this.f20607n, e5);
            }
        } finally {
            this.f20610q.f20269a.N().E(this.f20609p, arrayList);
        }
    }
}
