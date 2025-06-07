package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* loaded from: classes.dex */
final class dn2 implements u3.a {

    /* renamed from: m, reason: collision with root package name */
    final /* synthetic */ k3.u0 f7417m;

    /* renamed from: n, reason: collision with root package name */
    final /* synthetic */ en2 f7418n;

    dn2(en2 en2Var, k3.u0 u0Var) {
        this.f7418n = en2Var;
        this.f7417m = u0Var;
    }

    @Override // u3.a
    public final void a() {
        if (this.f7418n.f7912p != null) {
            try {
                this.f7417m.c();
            } catch (RemoteException e5) {
                ze0.i("#007 Could not call remote method.", e5);
            }
        }
    }
}
