package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final class uu0 extends hl {

    /* renamed from: m, reason: collision with root package name */
    private final tu0 f16467m;

    /* renamed from: n, reason: collision with root package name */
    private final k3.q0 f16468n;

    /* renamed from: o, reason: collision with root package name */
    private final bj2 f16469o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f16470p = false;

    public uu0(tu0 tu0Var, k3.q0 q0Var, bj2 bj2Var) {
        this.f16467m = tu0Var;
        this.f16468n = q0Var;
        this.f16469o = bj2Var;
    }

    @Override // com.google.android.gms.internal.ads.il
    public final void M4(k3.c2 c2Var) {
        e4.p.e("setOnPaidEventListener must be called on the main UI thread.");
        bj2 bj2Var = this.f16469o;
        if (bj2Var != null) {
            bj2Var.v(c2Var);
        }
    }

    @Override // com.google.android.gms.internal.ads.il
    public final k3.q0 c() {
        return this.f16468n;
    }

    @Override // com.google.android.gms.internal.ads.il
    public final k3.j2 e() {
        if (((Boolean) k3.w.c().b(ir.f10105u6)).booleanValue()) {
            return this.f16467m.c();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.il
    public final void i5(boolean z10) {
        this.f16470p = z10;
    }

    @Override // com.google.android.gms.internal.ads.il
    public final void l1(l4.a aVar, pl plVar) {
        try {
            this.f16469o.D(plVar);
            this.f16467m.j((Activity) l4.b.L0(aVar), plVar, this.f16470p);
        } catch (RemoteException e5) {
            ze0.i("#007 Could not call remote method.", e5);
        }
    }
}
