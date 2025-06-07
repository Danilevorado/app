package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* loaded from: classes.dex */
public final class v62 implements k3.a, f91 {

    /* renamed from: m, reason: collision with root package name */
    private k3.a0 f16604m;

    @Override // k3.a
    public final synchronized void O() {
        k3.a0 a0Var = this.f16604m;
        if (a0Var != null) {
            try {
                a0Var.b();
            } catch (RemoteException e5) {
                ze0.h("Remote Exception at onAdClicked.", e5);
            }
        }
    }

    public final synchronized void a(k3.a0 a0Var) {
        this.f16604m = a0Var;
    }

    @Override // com.google.android.gms.internal.ads.f91
    public final synchronized void r() {
        k3.a0 a0Var = this.f16604m;
        if (a0Var != null) {
            try {
                a0Var.b();
            } catch (RemoteException e5) {
                ze0.h("Remote Exception at onPhysicalClick.", e5);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.f91
    public final synchronized void t() {
    }
}
